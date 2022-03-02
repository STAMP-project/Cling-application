import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01601");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        boolean boolean14 = node12.isQuotedString();
        com.google.javascript.rhino.Node node15 = node12.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry7.createFunctionType(jSType8, node15);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType29.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList31 = functionType29.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] { functionType29, functionType42 };
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry18.createUnionType(jSTypeArray44);
        com.google.javascript.rhino.Node node46 = jSTypeRegistry7.createOptionalParameters(jSTypeArray44);
        com.google.javascript.rhino.Node node47 = jSTypeRegistry1.createOptionalParameters(jSTypeArray44);
        jSTypeRegistry1.setLastGeneration(true);
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(functionTypeList31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01602");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType26.canBeCalled();
        boolean boolean32 = functionType26.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        boolean boolean45 = functionType43.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType43.findPropertyType("");
        functionType43.clearCachedValues();
        boolean boolean49 = functionType26.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType43);
        boolean boolean50 = functionType26.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        com.google.javascript.rhino.Node node60 = node57.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry52.createFunctionType(jSType53, node60);
        boolean boolean62 = functionType61.isArrayType();
        boolean boolean64 = functionType61.isPropertyTypeInferred("JSDocInfo");
        boolean boolean66 = functionType61.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable74 = node73.children();
        boolean boolean75 = node73.isQuotedString();
        com.google.javascript.rhino.Node node76 = node73.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry68.createFunctionType(jSType69, node76);
        boolean boolean78 = functionType77.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType77.getPropertyType("InputId: hi!");
        boolean boolean81 = functionType61.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType77);
        boolean boolean82 = functionType61.isReturnTypeInferred();
        boolean boolean83 = functionType61.isUnknownType();
        boolean boolean84 = functionType61.isStringObjectType();
        boolean boolean85 = functionType26.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType61);
        boolean boolean86 = functionType61.isFunctionType();
        boolean boolean87 = functionType61.isInstanceType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(nodeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01603");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = functionType23.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList40 = functionType38.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] { functionType38, functionType51 };
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry27.createUnionType(jSTypeArray53);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType23, jSTypeArray53);
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType23.getPrototype();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(functionTypeList40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNotNull(objectType56);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01604");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node3.getAncestors();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = node3.hasChild(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int27 = node26.getSourceOffset();
        com.google.javascript.rhino.Node node28 = node15.useSourceInfoIfMissingFrom(node26);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node15, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean34 = node31.isEquivalentTo(node33);
        boolean boolean35 = node31.isSwitch();
        com.google.javascript.rhino.InputId inputId37 = new com.google.javascript.rhino.InputId("hi!");
        node31.setInputId(inputId37);
        java.lang.String str39 = inputId37.toString();
        node3.setInputId(inputId37);
        boolean boolean41 = node3.isIn();
        int int43 = node3.getIntProp((int) (short) 10);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ancestorIterable8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "InputId: hi!" + "'", str39, "InputId: hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01605");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType14.getPropertyType("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = jSDocInfo35.getEnumParameterType();
        boolean boolean38 = jSDocInfo35.isExterns();
        boolean boolean39 = jSDocInfo35.isIdGenerator();
        functionType14.setPropertyJSDocInfo("{671747480}", jSDocInfo35);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility41 = jSDocInfo35.getVisibility();
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = jSDocInfo35.getTemplateTypeNames();
        int int43 = jSDocInfo35.getExtendedInterfacesCount();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jSTypeExpression37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(visibility41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01606");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isNew();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01607");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.isNoAlias();
        java.lang.String str9 = jSDocInfo2.getDeprecationReason();
        boolean boolean10 = jSDocInfo2.isConstructor();
        java.lang.String str11 = jSDocInfo2.getReturnDescription();
        boolean boolean12 = jSDocInfo2.isExterns();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01608");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        boolean boolean35 = jSType34.isStringValueType();
        java.lang.String str36 = jSType34.getDisplayName();
        boolean boolean37 = jSType34.isEmptyType();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSType34.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = functionType38.isCheckedUnknownType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[10, 0]" + "'", str36, "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(functionType38);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01609");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        boolean boolean29 = jSType28.matchesObjectContext();
        boolean boolean30 = jSType28.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        boolean boolean39 = node37.isQuotedString();
        com.google.javascript.rhino.Node node40 = node37.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry32.createFunctionType(jSType33, node40);
        boolean boolean42 = functionType41.isArrayType();
        boolean boolean43 = functionType41.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType41.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = functionType41.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        boolean boolean58 = functionType56.isRegexpType();
        boolean boolean60 = functionType56.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean61 = functionType41.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType56);
        boolean boolean62 = functionType56.matchesStringContext();
        boolean boolean63 = functionType56.hasReferenceName();
        com.google.javascript.rhino.Node node64 = functionType56.getSource();
        boolean boolean65 = functionType56.isNoResolvedType();
        boolean boolean66 = jSType28.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType56);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable74 = node73.children();
        boolean boolean75 = node73.isQuotedString();
        com.google.javascript.rhino.Node node76 = node73.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry68.createFunctionType(jSType69, node76);
        boolean boolean78 = functionType77.isArrayType();
        boolean boolean80 = functionType77.isPropertyTypeInferred("JSDocInfo");
        boolean boolean81 = functionType77.isInstanceType();
        com.google.javascript.rhino.jstype.FunctionType functionType82 = functionType77.getConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = functionType77.getTypeOfThis();
        boolean boolean84 = objectType83.isNominalType();
        boolean boolean85 = objectType83.isNominalType();
        boolean boolean86 = jSType28.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType83);
        boolean boolean87 = jSType28.isEnumElementType();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(nodeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(functionType82);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01610");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objList2.spliterator();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objList2.spliterator();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet10 = booleanLiteralSet8.intersection(booleanLiteralSet9);
        int int11 = objList2.lastIndexOf((java.lang.Object) booleanLiteralSet10);
        java.lang.String str12 = objList2.toString();
        java.lang.String str13 = objList2.toString();
        com.google.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList14 = com.google.common.collect.ImmutableList.of((java.util.RandomAccess) objList2);
        com.google.common.collect.ImmutableList<java.lang.Object> objList17 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray18 = objList17.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor19 = objList17.listIterator();
        int int20 = objList17.size();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int25 = node24.getSourceOffset();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.children();
        node24.addChildrenToBack(node29);
        boolean boolean32 = node29.isGetElem();
        int int33 = node29.getType();
        boolean boolean34 = objList17.equals((java.lang.Object) node29);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = objList17.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList39 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray59 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList60 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList60, objArray59);
        boolean boolean63 = objList60.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = objList60.contains((java.lang.Object) nodeIterable68);
        java.lang.Object[] objArray70 = objList60.toArray();
        java.lang.Object[] objArray71 = objList60.toArray();
        boolean boolean72 = objList35.equals((java.lang.Object) objArray71);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = objList2.addAll((java.util.Collection<java.lang.Object>) objList35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objSpliterator6);
        org.junit.Assert.assertNotNull(objSpliterator7);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet10 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet10.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[10, 0]" + "'", str12, "[10, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[10, 0]" + "'", str13, "[10, 0]");
        org.junit.Assert.assertNotNull(randomAccessList14);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 39 + "'", int33 == 39);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objList39);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01611");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isVar();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean13 = node12.hasOneChild();
        node3.addChildToBack(node12);
        node3.setType(49);
        node3.putBooleanProp(31, false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01612");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList9 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "function ({1035943170}): {1035943170}", (java.lang.CharSequence) "function ({220797584}): {220797584}", (java.lang.CharSequence) "(function ({95400268}): {95400268})", (java.lang.CharSequence) "function ({2008688897}): {2008688897}", (java.lang.CharSequence) "Named type with empty name component", (java.lang.CharSequence) "function ({50940487}): {50940487}", (java.lang.CharSequence) "STRING NUMBER 0.0 36", (java.lang.CharSequence) "function ({10866166}): {10866166}", (java.lang.CharSequence) "function ({63005133}): {63005133}");
        org.junit.Assert.assertNotNull(charSequenceList9);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01613");
        com.google.common.collect.ImmutableList<java.lang.Object> objList3 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        boolean boolean27 = objList24.add((java.lang.Object) 100.0d);
        java.util.stream.Stream<java.lang.Object> objStream28 = objList24.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList31 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream32 = objList31.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList33 = objList31.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = objList31.reverse();
        java.lang.Object[] objArray35 = objList34.toArray();
        boolean boolean36 = objList24.retainAll((java.util.Collection<java.lang.Object>) objList34);
        java.io.IOException iOException39 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray40 = iOException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = iOException39.getSuppressed();
        java.io.IOException iOException42 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException39);
        boolean boolean43 = objList34.contains((java.lang.Object) iOException39);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        boolean boolean53 = node51.isQuotedString();
        com.google.javascript.rhino.Node node54 = node51.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry46.createFunctionType(jSType47, node54);
        boolean boolean56 = functionType55.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType55.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType59 = functionType55.toMaybeFunctionType();
        boolean boolean61 = functionType59.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable62 = functionType59.getExtendedInterfaces();
        boolean boolean63 = functionType59.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType59.getPropertyType("NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot67 = functionType59.getOwnSlot("[10, 0]");
        boolean boolean68 = functionType59.isFunctionType();
        boolean boolean69 = functionType59.matchesUint32Context();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = objList34.set(7, (java.lang.Object) functionType59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList3);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objStream28);
        org.junit.Assert.assertNotNull(objList31);
        org.junit.Assert.assertNotNull(objStream32);
        org.junit.Assert.assertNotNull(objList33);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNull(jSTypeStaticSlot67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01614");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        boolean boolean14 = functionType10.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node15 = functionType10.getRootNode();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType10.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType10.restrictByNotNullOrUndefined();
        boolean boolean18 = functionType10.isParameterizedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList24 = com.google.common.collect.ImmutableList.of(jSDocInfo20, jSDocInfo21, jSDocInfo22, jSDocInfo23);
        boolean boolean26 = jSDocInfo22.hasParameterType("hi!");
        boolean boolean27 = jSDocInfo22.isConstant();
        java.lang.String str28 = jSDocInfo22.getMeaning();
        java.lang.String str29 = jSDocInfo22.getLicense();
        boolean boolean30 = jSDocInfo22.hasFileOverview();
        functionType10.setPropertyJSDocInfo("", jSDocInfo22);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01615");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList15 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray16 = objList15.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor17 = objList15.listIterator();
        int int18 = objList15.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor20 = objList15.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(39, node25);
        boolean boolean27 = node26.isIf();
        node26.detachChildren();
        boolean boolean29 = node26.isVoid();
        boolean boolean30 = node26.isNE();
        int int31 = objList15.indexOf((java.lang.Object) node26);
        boolean boolean32 = objList15.isEmpty();
        int int33 = objList15.size();
        boolean boolean34 = objList10.containsAll((java.util.Collection<java.lang.Object>) objList15);
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = objList15.asList();
        com.google.common.collect.ImmutableList.Builder<java.lang.Cloneable> cloneableBuilder36 = com.google.common.collect.ImmutableList.builder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = objList35.remove((java.lang.Object) cloneableBuilder36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objList15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(cloneableBuilder36);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01616");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = jSDocInfo2.getTypeNodes();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator10 = nodeCollection9.spliterator();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator11 = null;
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator12 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean17 = node16.hasOneChild();
        node16.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable20 = node16.getAncestors();
        int int21 = node16.getLineno();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node16.siblings();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator23 = nodeIterable22.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.util.Spliterator<com.google.javascript.rhino.Node>> nodeSpliteratorList24 = com.google.common.collect.ImmutableList.of(nodeSpliterator10, nodeSpliterator11, nodeSpliterator12, nodeSpliterator23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertNotNull(nodeSpliterator10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ancestorIterable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(nodeSpliterator23);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01617");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        boolean boolean20 = node18.isQuotedString();
        com.google.javascript.rhino.Node node21 = node18.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry13.createFunctionType(jSType14, node21);
        boolean boolean23 = functionType22.isArrayType();
        boolean boolean24 = functionType22.isRegexpType();
        jSTypeRegistry1.registerPropertyOnType("function (...[?]): ?", (com.google.javascript.rhino.jstype.JSType) functionType22);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode26 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry1.setResolveMode(resolveMode26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        boolean boolean40 = functionType38.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType38.getPropertyType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        boolean boolean51 = node49.isQuotedString();
        com.google.javascript.rhino.Node node52 = node49.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry44.createFunctionType(jSType45, node52);
        boolean boolean54 = functionType53.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType53.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType53.toMaybeFunctionType();
        com.google.javascript.rhino.Node node58 = functionType53.getRootNode();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = functionType38.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSType60.dereference();
        boolean boolean63 = objectType61.removeProperty("false");
        com.google.javascript.rhino.jstype.UnionType unionType64 = objectType61.toMaybeUnionType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + resolveMode26 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode26.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(unionType64);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01618");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        java.lang.String str5 = jSDocInfo1.getDeprecationReason();
        boolean boolean6 = jSDocInfo1.isHidden();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo1.getAuthors();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strCollection7);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01619");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        com.google.javascript.rhino.Node node35 = node30.cloneNode();
        int int36 = node30.getLength();
        node30.setIsSyntheticBlock(false);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection39 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node30);
        int int40 = node30.getChildCount();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean44 = node43.isSwitch();
        com.google.javascript.rhino.InputId inputId46 = new com.google.javascript.rhino.InputId("hi!");
        node43.setInputId(inputId46);
        node30.setInputId(inputId46);
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node50 = node30.useSourceInfoIfMissingFrom(node49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodeCollection39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01620");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        java.lang.String str5 = node3.getQualifiedName();
        boolean boolean6 = node3.isHook();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = new com.google.javascript.rhino.JSTypeExpression(node3, "function ({1399396790}): {1399396790}");
        boolean boolean9 = jSTypeExpression8.isVarArgs();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01621");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.Node node15 = functionType10.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        boolean boolean29 = functionType26.isPropertyTypeInferred("JSDocInfo");
        boolean boolean31 = functionType26.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType42.getPropertyType("InputId: hi!");
        boolean boolean46 = functionType26.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType42);
        boolean boolean47 = functionType26.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        boolean boolean56 = node54.isQuotedString();
        com.google.javascript.rhino.Node node57 = node54.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry49.createFunctionType(jSType50, node57);
        boolean boolean59 = functionType58.isArrayType();
        boolean boolean61 = functionType58.isPropertyTypeInferred("JSDocInfo");
        boolean boolean63 = functionType58.hasOwnProperty("");
        com.google.javascript.rhino.Node node64 = functionType58.getParametersNode();
        boolean boolean65 = functionType58.hasCachedValues();
        functionType26.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType58);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = functionType26.getAllImplementedInterfaces();
        boolean boolean68 = functionType26.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable76 = node75.children();
        boolean boolean77 = node75.isQuotedString();
        com.google.javascript.rhino.Node node78 = node75.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry70.createFunctionType(jSType71, node78);
        boolean boolean80 = functionType79.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType79.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType83 = functionType79.toMaybeFunctionType();
        boolean boolean85 = functionType83.removeProperty("hi!");
        boolean boolean86 = functionType83.matchesStringContext();
        functionType26.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType83);
        boolean boolean88 = functionType10.hasEqualCallType(functionType83);
        int int89 = functionType83.getMaxArguments();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet90 = functionType83.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node91 = functionType83.getRootNode();
        functionType83.clearCachedValues();
        boolean boolean93 = functionType83.isNumber();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable94 = functionType83.getParameters();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(nodeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2147483647 + "'", int89 == 2147483647);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet90 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet90.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(nodeIterable94);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01622");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isIdGenerator();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean8 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01623");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        java.lang.String str9 = node3.toString();
        int int10 = node3.getChildCount();
        java.lang.String str11 = node3.getSourceFileName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NUMBER 0.0 36" + "'", str9, "NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01624");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        int int12 = node8.getType();
        com.google.javascript.rhino.jstype.JSType jSType13 = node8.getJSType();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node18.setSourceFileForTesting("[10, 0]");
        node18.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isVar();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        boolean boolean38 = node36.isDo();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        node42.addChildrenToBack(node47);
        node42.detachChildren();
        node42.setLineno(16);
        boolean boolean53 = node42.isSwitch();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(39, node58);
        boolean boolean60 = node59.isIf();
        node59.detachChildren();
        boolean boolean62 = node42.hasChild(node59);
        boolean boolean63 = node42.isDebugger();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(52, node18, node27, node36, node42, (int) '#', (-1));
        com.google.javascript.rhino.Node node67 = node8.copyInformationFromForTree(node18);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node8);
        boolean boolean69 = node8.isExprResult();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39 + "'", int12 == 39);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01625");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean15 = functionType10.isNominalType();
        boolean boolean16 = functionType10.isNativeObjectType();
        java.lang.String str17 = functionType10.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = functionType10.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = functionType18.matchesObjectContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(functionType18);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01626");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.isConstant();
        java.lang.String str8 = jSDocInfo2.getMeaning();
        boolean boolean9 = jSDocInfo2.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo2.getThisType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01627");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasFileOverview();
        boolean boolean2 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = jSDocInfo0.getVisibility();
        java.lang.String str4 = jSDocInfo0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(visibility3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSDocInfo" + "'", str4, "JSDocInfo");
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01628");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(38, 29, 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node3);
        org.junit.Assert.assertNull(staticSourceFile4);
        org.junit.Assert.assertNull(staticSourceFile5);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01629");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        boolean boolean14 = jSTypeRegistry1.hasNamespace("InputId: hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry1.getNativeObjectType(jSTypeNative16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(errorReporter15);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01630");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getName();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition5 = marker0.getNameNode();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(nodeSourcePosition5);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01631");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnStartLine();
        int int2 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        node6.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable11 = node6.getAncestors();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = node6.hasChild(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        boolean boolean19 = node17.isQuotedString();
        node17.setLength(0);
        boolean boolean22 = node17.isLabelName();
        com.google.javascript.rhino.Node node23 = node6.srcrefTree(node17);
        namePosition0.setItem(node17);
        com.google.javascript.rhino.Node node25 = namePosition0.getItem();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(118833, 3, (int) (short) 100, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 118833?end-line: 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ancestorIterable11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01632");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = functionType10.getJSDocInfo();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType10.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.TemplateType templateType18 = functionType10.toMaybeTemplateType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSDocInfo16);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(templateType18);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01633");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        java.lang.String str2 = jSDocInfo0.toString();
        boolean boolean3 = jSDocInfo0.isExpose();
        int int4 = jSDocInfo0.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getReturnType();
        boolean boolean7 = jSDocInfo0.isExterns();
        boolean boolean8 = jSDocInfo0.isExport();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getTypedefType();
        boolean boolean11 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSDocInfo" + "'", str2, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01634");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function ({1035943170}): {1035943170}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(function ({1035943170}): {1035943170})" + "'", str1, "(function ({1035943170}): {1035943170})");
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01635");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType26.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType26.unboxesTo();
        boolean boolean33 = functionType26.isInterface();
        boolean boolean35 = functionType26.isPropertyInExterns("NUMBER 0.0 36\n");
        java.util.Set<java.lang.String> strSet36 = functionType26.getPropertyNames();
        java.lang.String str37 = functionType26.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = functionType26.toMaybeFunctionType();
        boolean boolean40 = functionType26.isPropertyInExterns("function ({2081396796}): {2081396796}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "function ({1083419307}): {1083419307}" + "'", str37, "function ({1083419307}): {1083419307}");
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01636");
        com.google.common.collect.ImmutableList<java.lang.Object> objList3 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        boolean boolean27 = objList24.add((java.lang.Object) 100.0d);
        com.google.common.collect.ImmutableList<java.lang.Object> objList30 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream31 = objList30.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList32 = objList30.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList33 = objList30.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator34 = objList30.spliterator();
        boolean boolean35 = objList24.containsAll((java.util.Collection<java.lang.Object>) objList30);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        node41.addChildrenToBack(node46);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int53 = node52.getSourceOffset();
        com.google.javascript.rhino.Node node54 = node41.useSourceInfoIfMissingFrom(node52);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(10, node41, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet58 = node57.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable59 = node57.getAncestors();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean64 = node63.hasOneChild();
        node63.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable67 = node63.getAncestors();
        int int68 = node63.getChildCount();
        node57.addChildrenToFront(node63);
        com.google.javascript.rhino.Node node71 = node63.getChildAtIndex(0);
        boolean boolean72 = node63.isOnlyModifiesThisCall();
        boolean boolean73 = node63.isAnd();
        java.lang.String str74 = node63.getSourceFileName();
        // The following exception was thrown during execution in test generation
        try {
            objList30.add(9, (java.lang.Object) str74);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList3);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objList30);
        org.junit.Assert.assertNotNull(objStream31);
        org.junit.Assert.assertNotNull(objList32);
        org.junit.Assert.assertNotNull(objList33);
        org.junit.Assert.assertNotNull(objSpliterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(strSet58);
        org.junit.Assert.assertNotNull(ancestorIterable59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(ancestorIterable67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01637");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        node4.detachChildren();
        boolean boolean13 = node4.isOr();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean18 = node17.hasOneChild();
        node17.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable21 = node17.getAncestors();
        int int22 = node17.getChildCount();
        node17.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node25 = node4.copyInformationFrom(node17);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean30 = node29.hasOneChild();
        boolean boolean31 = node29.isOnlyModifiesThisCall();
        boolean boolean32 = node29.isLabel();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(39, node37);
        boolean boolean39 = node38.isIf();
        node38.detachChildren();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (short) 0, node4, node29, node38);
        java.lang.Appendable appendable42 = null;
        // The following exception was thrown during execution in test generation
        try {
            node4.appendStringTree(appendable42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(ancestorIterable21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01638");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        java.lang.String str31 = functionType26.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        boolean boolean44 = functionType42.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType42.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType42.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node53.children();
        boolean boolean55 = node53.isQuotedString();
        com.google.javascript.rhino.Node node56 = node53.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry48.createFunctionType(jSType49, node56);
        boolean boolean58 = functionType57.isArrayType();
        boolean boolean59 = functionType57.isRegexpType();
        boolean boolean61 = functionType57.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean62 = functionType42.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType57);
        boolean boolean63 = functionType57.hasImplementedInterfaces();
        boolean boolean64 = functionType57.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node71.children();
        boolean boolean73 = node71.isQuotedString();
        com.google.javascript.rhino.Node node74 = node71.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry66.createFunctionType(jSType67, node74);
        boolean boolean76 = functionType75.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType75.restrictByNotNullOrUndefined();
        boolean boolean78 = functionType57.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType75);
        boolean boolean80 = functionType57.hasOwnProperty("{1936444324}");
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType57.collapseUnion();
        boolean boolean82 = functionType26.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType57);
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType57.getParameterType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeIterable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(jSType83);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01639");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        boolean boolean12 = node3.isOr();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean17 = node16.hasOneChild();
        node16.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable20 = node16.getAncestors();
        int int21 = node16.getChildCount();
        node16.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node24 = node3.copyInformationFrom(node16);
        com.google.javascript.rhino.Node node25 = node24.getLastSibling();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean28 = jSDocInfo27.isNoCompile();
        java.lang.String str29 = jSDocInfo27.toString();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int34 = node33.getSourceOffset();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        node33.addChildrenToBack(node38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int45 = node44.getSourceOffset();
        com.google.javascript.rhino.Node node46 = node33.useSourceInfoIfMissingFrom(node44);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean51 = node50.hasOneChild();
        node50.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable54 = node50.getAncestors();
        int int55 = node50.getLineno();
        boolean boolean56 = node50.isLocalResultCall();
        com.google.javascript.rhino.Node node57 = node46.useSourceInfoFromForTree(node50);
        jSDocInfo27.setAssociatedNode(node57);
        node24.addChildToFront(node57);
        boolean boolean60 = node24.isExprResult();
        boolean boolean61 = node24.isDelProp();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ancestorIterable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JSDocInfo" + "'", str29, "JSDocInfo");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(ancestorIterable54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 36 + "'", int55 == 36);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01640");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node7 = node5.getFirstChild();
        boolean boolean8 = node7.isDec();
        boolean boolean9 = node7.isDec();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01641");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.Node node16 = functionType10.getParametersNode();
        boolean boolean17 = functionType10.hasCachedValues();
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = functionType10.getTemplateTypeNames();
        java.lang.String str19 = functionType10.getReferenceName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01642");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType14.getPropertyType("");
        boolean boolean34 = functionType14.isOrdinaryFunction();
        boolean boolean35 = functionType14.matchesNumberContext();
        com.google.javascript.rhino.Node node36 = functionType14.getRootNode();
        boolean boolean37 = functionType14.isEnumElementType();
        boolean boolean38 = functionType14.isNoType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        boolean boolean48 = node46.isQuotedString();
        com.google.javascript.rhino.Node node49 = node46.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry41.createFunctionType(jSType42, node49);
        boolean boolean51 = functionType50.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList52 = functionType50.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = functionType50.toMaybeFunctionType();
        java.lang.String str54 = functionType50.getDisplayName();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType14.resolve(errorReporter39, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType50);
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType14.autobox();
        boolean boolean57 = functionType14.isNullType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(functionTypeList52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01643");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue0.xor(ternaryValue1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue0.and(ternaryValue3);
        java.lang.String str5 = ternaryValue4.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue6.xor(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue4.or(ternaryValue8);
        java.lang.String str10 = ternaryValue8.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "false" + "'", str5, "false");
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "false" + "'", str10, "false");
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01644");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        node3.setSourceFileForTesting("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01645");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("STRING NUMBER 0.0 36");
        node1.setIsSyntheticBlock(false);
        boolean boolean4 = node1.isOnlyModifiesThisCall();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01646");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int7 = node6.getSourceOffset();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        node6.addChildrenToBack(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int18 = node17.getSourceOffset();
        com.google.javascript.rhino.Node node19 = node6.useSourceInfoIfMissingFrom(node17);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node6, 49, (int) (short) 100);
        boolean boolean23 = node6.isComma();
        boolean boolean24 = node6.isAssignAdd();
        boolean boolean25 = node6.isQualifiedName();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean30 = node29.hasOneChild();
        node29.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable33 = node29.getAncestors();
        int int34 = node29.getChildCount();
        java.lang.String str35 = node29.toString();
        com.google.javascript.rhino.Node node36 = node6.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node37 = node6.cloneTree();
        java.lang.String str38 = node6.getSourceFileName();
        com.google.javascript.rhino.Node node39 = node1.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int45 = node44.getSourceOffset();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        node44.addChildrenToBack(node49);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int56 = node55.getSourceOffset();
        com.google.javascript.rhino.Node node57 = node44.useSourceInfoIfMissingFrom(node55);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(10, node44, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet61 = node60.getDirectives();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int66 = node65.getSourceOffset();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node70.children();
        node65.addChildrenToBack(node70);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int77 = node76.getSourceOffset();
        com.google.javascript.rhino.Node node78 = node65.useSourceInfoIfMissingFrom(node76);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int81 = node65.getIndexOfChild(node80);
        com.google.javascript.rhino.Node node82 = node60.srcref(node65);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node65);
        boolean boolean84 = node65.isNE();
        node65.removeProp((int) (byte) 1);
        node6.addChildToFront(node65);
        com.google.javascript.rhino.jstype.JSType jSType88 = node65.getJSType();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(ancestorIterable33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "NUMBER 0.0 36" + "'", str35, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(strSet61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(jSType88);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01647");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.lang.Object[] objArray6 = objList5.toArray();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node10.addChildrenToBack(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node10.useSourceInfoIfMissingFrom(node21);
        boolean boolean24 = objList5.contains((java.lang.Object) node23);
        boolean boolean25 = node23.isDec();
        boolean boolean26 = node23.isNoSideEffectsCall();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01648");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType39.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        boolean boolean59 = functionType56.isPropertyTypeInferred("JSDocInfo");
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType56.toMaybeFunctionType();
        java.util.Set<java.lang.String> strSet61 = functionType56.getPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("function ({441230370}): {441230370}", (com.google.javascript.rhino.jstype.JSType) functionType56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(strSet61);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01649");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.children();
        boolean boolean6 = node4.isEmpty();
        boolean boolean7 = node4.hasChildren();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean12 = node11.hasOneChild();
        node11.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable15 = node11.getAncestors();
        int int16 = node11.getChildCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList21 = com.google.common.collect.ImmutableList.of(jSDocInfo17, jSDocInfo18, jSDocInfo19, jSDocInfo20);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = jSDocInfo20.getReturnType();
        boolean boolean23 = jSDocInfo20.hasEnumParameterType();
        node11.setJSDocInfo(jSDocInfo20);
        boolean boolean25 = node4.isEquivalentToTyped(node11);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        boolean boolean37 = node34.isGetElem();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        node41.addChildrenToBack(node46);
        node41.detachChildren();
        node41.setLineno(16);
        node34.addChildrenToFront(node41);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = node41.getJSDocInfo();
        node41.removeProp(50);
        boolean boolean56 = node41.wasEmptyNode();
        boolean boolean57 = node41.wasEmptyNode();
        com.google.javascript.rhino.Node node58 = node41.getLastSibling();
        com.google.javascript.rhino.Node node59 = node11.srcref(node58);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int64 = node63.getSourceOffset();
        boolean boolean65 = node63.isDo();
        int int66 = node63.getChildCount();
        node63.setDouble((double) 45);
        com.google.javascript.rhino.InputId inputId69 = node63.getInputId();
        node63.removeProp((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 0, node58, node63, 118833, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ancestorIterable15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(jSDocInfoList21);
        org.junit.Assert.assertNull(jSTypeExpression22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertNull(jSDocInfo53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(inputId69);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01650");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("function (...[?]): ?", 1, (-1));
        boolean boolean4 = node3.isScript();
        boolean boolean5 = node3.isString();
        int int6 = node3.getType();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01651");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnEndLine();
        java.lang.String str2 = stringPosition0.getItem();
        stringPosition0.setItem("function ({1985330600}): {1985330600}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01652");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType14.getPropertyType("");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        boolean boolean45 = functionType44.isArrayType();
        boolean boolean47 = functionType44.isPropertyTypeInferred("JSDocInfo");
        boolean boolean49 = functionType44.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        boolean boolean58 = node56.isQuotedString();
        com.google.javascript.rhino.Node node59 = node56.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry51.createFunctionType(jSType52, node59);
        boolean boolean61 = functionType60.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType60.getPropertyType("InputId: hi!");
        boolean boolean64 = functionType44.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType60);
        boolean boolean65 = functionType44.isReturnTypeInferred();
        boolean boolean66 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType33, (com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean67 = functionType44.isEmptyType();
        boolean boolean68 = functionType44.isNominalType();
        functionType44.clearCachedValues();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01653");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        jSTypeRegistry1.resetForTypeCheck();
        jSTypeRegistry1.forwardDeclareType("function ({1702558995}): {1702558995}");
        boolean boolean32 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        boolean boolean45 = functionType44.isArrayType();
        boolean boolean46 = functionType44.isRegexpType();
        boolean boolean48 = functionType44.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node49 = functionType44.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = functionType44.getOwnPropertyJSDocInfo("function ({688345412}): {688345412}");
        jSTypeRegistry1.unregisterPropertyOnType("function ({50940487}): {50940487}", (com.google.javascript.rhino.jstype.JSType) functionType44);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(jSDocInfo51);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01654");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = objectType13.getCtorExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList19 = com.google.common.collect.ImmutableList.of(jSDocInfo15, jSDocInfo16, jSDocInfo17, jSDocInfo18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo18.getReturnType();
        boolean boolean21 = jSDocInfo18.isImplicitCast();
        objectType13.setJSDocInfo(jSDocInfo18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo18.getThisType();
        java.lang.String str24 = jSDocInfo18.getLendsName();
        boolean boolean25 = jSDocInfo18.isExport();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility26 = null;
        jSDocInfo18.setVisibility(visibility26);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01655");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node3.getAncestors();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node3.children();
        boolean boolean10 = node3.isFalse();
        node3.setDouble((double) 49);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ancestorIterable8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01656");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        boolean boolean34 = jSTypeRegistry33.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType45.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType47 = objectType46.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType.Property property49 = objectType46.getSlot("");
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        com.google.javascript.rhino.Node node60 = node57.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry52.createFunctionType(jSType53, node60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node70.children();
        boolean boolean72 = node70.isQuotedString();
        com.google.javascript.rhino.Node node73 = node70.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry65.createFunctionType(jSType66, node73);
        boolean boolean75 = functionType74.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList76 = functionType74.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node83.children();
        boolean boolean85 = node83.isQuotedString();
        com.google.javascript.rhino.Node node86 = node83.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry78.createFunctionType(jSType79, node86);
        boolean boolean88 = functionType87.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] { functionType74, functionType87 };
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry63.createUnionType(jSTypeArray89);
        com.google.javascript.rhino.Node node91 = jSTypeRegistry52.createOptionalParameters(jSTypeArray89);
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry33.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType46, false, jSTypeArray89);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry1.createConstructorType(jSType30, false, jSTypeArray89);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNull(property49);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(functionTypeList76);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(nodeIterable84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertNotNull(functionType93);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01657");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        boolean boolean5 = jSTypeRegistry1.isForwardDeclaredType("JSDocInfo");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        boolean boolean14 = node12.isQuotedString();
        com.google.javascript.rhino.Node node15 = node12.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry7.createFunctionType(jSType8, node15);
        boolean boolean17 = functionType16.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType16.restrictByNotNullOrUndefined();
        boolean boolean19 = jSType18.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSType18.toObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = objectType20.getCtorImplementedInterfaces();
        boolean boolean22 = objectType20.isOrdinaryFunction();
        objectType20.clearResolved();
        boolean boolean24 = objectType20.isBooleanObjectType();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int29 = node28.getSourceOffset();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        node28.addChildrenToBack(node33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int40 = node39.getSourceOffset();
        com.google.javascript.rhino.Node node41 = node28.useSourceInfoIfMissingFrom(node39);
        node41.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(39, node48);
        com.google.javascript.rhino.Node node50 = node41.srcref(node49);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int55 = node54.getSourceOffset();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        node54.addChildrenToBack(node59);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int66 = node65.getSourceOffset();
        com.google.javascript.rhino.Node node67 = node54.useSourceInfoIfMissingFrom(node65);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int70 = node54.getIndexOfChild(node69);
        com.google.javascript.rhino.Node node71 = node41.srcref(node69);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node69);
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType20, node69);
        boolean boolean75 = objectType20.removeProperty("function ({2102965978}): {2102965978}");
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01658");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        java.util.Set<java.lang.String> strSet5 = jSDocInfo3.getSuppressions();
        strSet5.clear();
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder7 = new com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence>();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList12 = com.google.common.collect.ImmutableList.of(jSDocInfo8, jSDocInfo9, jSDocInfo10, jSDocInfo11);
        java.util.Set<java.lang.String> strSet13 = jSDocInfo11.getSuppressions();
        java.util.Iterator<java.lang.String> strItor14 = strSet13.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList19 = com.google.common.collect.ImmutableList.of(jSDocInfo15, jSDocInfo16, jSDocInfo17, jSDocInfo18);
        java.util.Set<java.lang.String> strSet20 = jSDocInfo18.getSuppressions();
        java.util.Iterator<java.lang.String> strItor21 = strSet20.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo22, jSDocInfo23, jSDocInfo24, jSDocInfo25);
        java.util.Set<java.lang.String> strSet27 = jSDocInfo25.getSuppressions();
        java.util.Iterator<java.lang.String> strItor28 = strSet27.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList33 = com.google.common.collect.ImmutableList.of(jSDocInfo29, jSDocInfo30, jSDocInfo31, jSDocInfo32);
        java.util.Set<java.lang.String> strSet34 = jSDocInfo32.getSuppressions();
        java.util.Iterator<java.lang.String> strItor35 = strSet34.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList40 = com.google.common.collect.ImmutableList.of(jSDocInfo36, jSDocInfo37, jSDocInfo38, jSDocInfo39);
        java.util.Set<java.lang.String> strSet41 = jSDocInfo39.getSuppressions();
        java.util.Iterator<java.lang.String> strItor42 = strSet41.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList47 = com.google.common.collect.ImmutableList.of(jSDocInfo43, jSDocInfo44, jSDocInfo45, jSDocInfo46);
        java.util.Set<java.lang.String> strSet48 = jSDocInfo46.getSuppressions();
        java.util.Iterator<java.lang.String> strItor49 = strSet48.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList54 = com.google.common.collect.ImmutableList.of(jSDocInfo50, jSDocInfo51, jSDocInfo52, jSDocInfo53);
        java.util.Set<java.lang.String> strSet55 = jSDocInfo53.getSuppressions();
        java.util.Iterator<java.lang.String> strItor56 = strSet55.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList61 = com.google.common.collect.ImmutableList.of(jSDocInfo57, jSDocInfo58, jSDocInfo59, jSDocInfo60);
        java.util.Set<java.lang.String> strSet62 = jSDocInfo60.getSuppressions();
        java.util.Iterator<java.lang.String> strItor63 = strSet62.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList68 = com.google.common.collect.ImmutableList.of(jSDocInfo64, jSDocInfo65, jSDocInfo66, jSDocInfo67);
        java.util.Set<java.lang.String> strSet69 = jSDocInfo67.getSuppressions();
        java.util.Iterator<java.lang.String> strItor70 = strSet69.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList75 = com.google.common.collect.ImmutableList.of(jSDocInfo71, jSDocInfo72, jSDocInfo73, jSDocInfo74);
        java.util.Set<java.lang.String> strSet76 = jSDocInfo74.getSuppressions();
        java.util.Iterator<java.lang.String> strItor77 = strSet76.iterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList82 = com.google.common.collect.ImmutableList.of(jSDocInfo78, jSDocInfo79, jSDocInfo80, jSDocInfo81);
        java.util.Set<java.lang.String> strSet83 = jSDocInfo81.getSuppressions();
        java.util.Iterator<java.lang.String> strItor84 = strSet83.iterator();
        com.google.common.collect.ImmutableList<java.util.Iterator<java.lang.String>> strItorList85 = com.google.common.collect.ImmutableList.of(strItor14, strItor21, strItor28, strItor35, strItor42, strItor49, strItor56, strItor63, strItor70, strItor77, strItor84);
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder86 = charSequenceBuilder7.addAll(strItor21);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList87 = charSequenceBuilder86.build();
        boolean boolean88 = strSet5.equals((java.lang.Object) charSequenceBuilder86);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList89 = charSequenceBuilder86.build();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(jSDocInfoList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strItor21);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(jSDocInfoList33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strItor35);
        org.junit.Assert.assertNotNull(jSDocInfoList40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertNotNull(jSDocInfoList47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strItor49);
        org.junit.Assert.assertNotNull(jSDocInfoList54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(strItor56);
        org.junit.Assert.assertNotNull(jSDocInfoList61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(strItor63);
        org.junit.Assert.assertNotNull(jSDocInfoList68);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(strItor70);
        org.junit.Assert.assertNotNull(jSDocInfoList75);
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(strItor77);
        org.junit.Assert.assertNotNull(jSDocInfoList82);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertNotNull(strItor84);
        org.junit.Assert.assertNotNull(strItorList85);
        org.junit.Assert.assertNotNull(charSequenceBuilder86);
        org.junit.Assert.assertNotNull(charSequenceList87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(charSequenceList89);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01659");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet21 = node20.getDirectives();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        node25.addChildrenToBack(node30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node38 = node25.useSourceInfoIfMissingFrom(node36);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int41 = node25.getIndexOfChild(node40);
        com.google.javascript.rhino.Node node42 = node20.srcref(node25);
        node25.putIntProp((int) (byte) 100, (int) (short) -1);
        boolean boolean47 = node25.getBooleanProp(44);
        boolean boolean48 = node25.isLabel();
        node25.setCharno(1);
        // The following exception was thrown during execution in test generation
        try {
            node25.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01660");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo3.isConstructor();
        boolean boolean7 = jSDocInfo3.hasParameterType("[10, 0]");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo3.getVisibility();
        boolean boolean9 = jSDocInfo3.hasReturnType();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList20, objArray19);
        java.lang.Object[] objArray22 = objList20.toArray();
        java.util.stream.Stream<java.lang.Object> objStream23 = objList20.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.isNoCompile();
        java.lang.String str26 = jSDocInfo24.toString();
        boolean boolean27 = jSDocInfo24.isExpose();
        int int28 = jSDocInfo24.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection29 = jSDocInfo24.getTypeNodes();
        boolean boolean30 = objList20.contains((java.lang.Object) jSDocInfo24);
        boolean boolean31 = jSDocInfo24.hasType();
        boolean boolean32 = jSDocInfo24.isNoSideEffects();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility33 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo24.setVisibility(visibility33);
        jSDocInfo3.setVisibility(visibility33);
        boolean boolean36 = jSDocInfo3.isConstructor();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(visibility8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JSDocInfo" + "'", str26, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(nodeCollection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + visibility33 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility33.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01661");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        boolean boolean2 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        boolean boolean11 = node9.isQuotedString();
        com.google.javascript.rhino.Node node12 = node9.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry4.createFunctionType(jSType5, node12);
        boolean boolean14 = functionType13.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList15 = functionType13.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType13.toMaybeFunctionType();
        boolean boolean18 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType16, "function ({1535407544}): {1535407544}");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType29.isArrayType();
        boolean boolean31 = functionType29.isRegexpType();
        boolean boolean32 = functionType29.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(functionTypeList15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01662");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        boolean boolean13 = functionType10.matchesObjectContext();
        boolean boolean14 = functionType10.isUnknownType();
        int int15 = functionType10.getPropertiesCount();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01663");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "JSDocInfo", "", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        int int7 = strSet5.size();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "JSDocInfo", "", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        int int15 = strSet13.size();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "InputId: hi!", "", "hi!", "[10, 0]" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        int int24 = strSet22.size();
        java.lang.String[] strArray35 = new java.lang.String[] { "Named type with empty name component", "InputId: hi!", "(function ({1535407544}): {1535407544})", "Not declared as a type name", "false", "{1936444324}", "function ({1839678788}): {1839678788}", "function ({1704073426}): {1704073426}", "function ({1110454636}): {1110454636}", "{671747480}" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        com.google.common.collect.ImmutableList<java.util.LinkedHashSet<java.lang.String>> strSetList38 = com.google.common.collect.ImmutableList.of(strSet5, strSet13, strSet22, strSet36);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.children();
        boolean boolean47 = node45.isQuotedString();
        com.google.javascript.rhino.Node node48 = node45.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry40.createFunctionType(jSType41, node48);
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry40.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        boolean boolean60 = node58.isQuotedString();
        com.google.javascript.rhino.Node node61 = node58.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry53.createFunctionType(jSType54, node61);
        boolean boolean63 = functionType62.isArrayType();
        java.lang.String str64 = functionType62.toAnnotationString();
        boolean boolean65 = functionType62.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry40.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType62, "NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode68 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry40.setResolveMode(resolveMode68);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry40.createNamedType("function (function (...[?]): ?, ...[function (...[?]): ?]): function (...[?]): ?", "Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n", 41, 53);
        com.google.javascript.rhino.jstype.JSType jSType79 = jSTypeRegistry40.createNamedType("JSDocInfo", "(function ({1535407544}): {1535407544})", 16, (int) 'a');
        boolean boolean80 = strSet5.equals((java.lang.Object) 16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strSetList38);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertNull(jSType51);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "function (...[?]): ?" + "'", str64, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertTrue("'" + resolveMode68 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode68.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01664");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node3.getAncestors();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = node3.hasChild(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int27 = node26.getSourceOffset();
        com.google.javascript.rhino.Node node28 = node15.useSourceInfoIfMissingFrom(node26);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node15, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean34 = node31.isEquivalentTo(node33);
        boolean boolean35 = node31.isSwitch();
        com.google.javascript.rhino.InputId inputId37 = new com.google.javascript.rhino.InputId("hi!");
        node31.setInputId(inputId37);
        java.lang.String str39 = inputId37.toString();
        node3.setInputId(inputId37);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int46 = node45.getSourceOffset();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        node45.addChildrenToBack(node50);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int57 = node56.getSourceOffset();
        com.google.javascript.rhino.Node node58 = node45.useSourceInfoIfMissingFrom(node56);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node45, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean64 = node61.isEquivalentTo(node63);
        boolean boolean65 = node61.isSwitch();
        com.google.javascript.rhino.InputId inputId67 = new com.google.javascript.rhino.InputId("hi!");
        node61.setInputId(inputId67);
        boolean boolean69 = node3.isEquivalentToTyped(node61);
        com.google.javascript.rhino.Node node70 = node3.getLastSibling();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ancestorIterable8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "InputId: hi!" + "'", str39, "InputId: hi!");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01665");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType10.toMaybeFunctionType();
        boolean boolean14 = functionType13.isInterface();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int20 = node19.getSourceOffset();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.children();
        node19.addChildrenToBack(node24);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node32 = node19.useSourceInfoIfMissingFrom(node30);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node19, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet36 = node35.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable37 = node35.getAncestors();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean42 = node41.hasOneChild();
        node41.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable45 = node41.getAncestors();
        int int46 = node41.getChildCount();
        node35.addChildrenToFront(node41);
        com.google.javascript.rhino.Node node49 = node41.getChildAtIndex(0);
        boolean boolean50 = node41.isOnlyModifiesThisCall();
        boolean boolean51 = node41.isLabel();
        boolean boolean52 = node41.isSetterDef();
        boolean boolean53 = functionType13.equals((java.lang.Object) node41);
        boolean boolean54 = functionType13.hasReferenceName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = functionType13.getOwnPropertyJSDocInfo("");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(strSet36);
        org.junit.Assert.assertNotNull(ancestorIterable37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(ancestorIterable45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jSDocInfo56);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01666");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 32, 8, 52);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(39, node8);
        boolean boolean10 = node9.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node11 = node9.getFirstChild();
        boolean boolean12 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = node3.srcref(node9);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition14 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int20 = node19.getSourceOffset();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.children();
        node19.addChildrenToBack(node24);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node32 = node19.useSourceInfoIfMissingFrom(node30);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node19, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet36 = node35.getDirectives();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.children();
        node40.addChildrenToBack(node45);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int52 = node51.getSourceOffset();
        com.google.javascript.rhino.Node node53 = node40.useSourceInfoIfMissingFrom(node51);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int56 = node40.getIndexOfChild(node55);
        com.google.javascript.rhino.Node node57 = node35.srcref(node40);
        namePosition14.setItem(node40);
        int int59 = node13.getIndexOfChild(node40);
        boolean boolean60 = node13.isVoid();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(strSet36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01667");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        java.lang.String str2 = jSDocInfo0.toString();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int7 = node6.getSourceOffset();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable12 = node11.children();
        node6.addChildrenToBack(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int18 = node17.getSourceOffset();
        com.google.javascript.rhino.Node node19 = node6.useSourceInfoIfMissingFrom(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean24 = node23.hasOneChild();
        node23.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable27 = node23.getAncestors();
        int int28 = node23.getLineno();
        boolean boolean29 = node23.isLocalResultCall();
        com.google.javascript.rhino.Node node30 = node19.useSourceInfoFromForTree(node23);
        jSDocInfo0.setAssociatedNode(node30);
        java.lang.String str32 = jSDocInfo0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSDocInfo" + "'", str2, "JSDocInfo");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeIterable12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ancestorIterable27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 36 + "'", int28 == 36);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "JSDocInfo" + "'", str32, "JSDocInfo");
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01668");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        jSTypeRegistry1.forwardDeclareType("");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType47.restrictByNotNullOrUndefined();
        boolean boolean50 = jSType49.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSType49.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        boolean boolean63 = node61.isQuotedString();
        com.google.javascript.rhino.Node node64 = node61.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry56.createFunctionType(jSType57, node64);
        boolean boolean66 = functionType65.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList67 = functionType65.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable75 = node74.children();
        boolean boolean76 = node74.isQuotedString();
        com.google.javascript.rhino.Node node77 = node74.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry69.createFunctionType(jSType70, node77);
        boolean boolean79 = functionType78.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] { functionType65, functionType78 };
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry54.createUnionType(jSTypeArray80);
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType51, false, jSTypeArray80);
        boolean boolean84 = functionType82.isPropertyInExterns("false");
        boolean boolean86 = functionType82.isPropertyTypeInferred("function ({1707542556}): {1707542556}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = functionType82.getOwnPropertyJSDocInfo("InputId: hi!");
        com.google.javascript.rhino.jstype.JSType jSType90 = functionType82.getRestrictedTypeGivenToBooleanOutcome(true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(functionTypeList67);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(nodeIterable75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(jSDocInfo88);
        org.junit.Assert.assertNotNull(jSType90);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01669");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType39.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        boolean boolean47 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        boolean boolean56 = node54.isQuotedString();
        com.google.javascript.rhino.Node node57 = node54.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry49.createFunctionType(jSType50, node57);
        boolean boolean59 = functionType58.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList60 = functionType58.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = functionType58.toMaybeFunctionType();
        boolean boolean63 = jSTypeRegistry46.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType61, "function ({1535407544}): {1535407544}");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair64 = functionType39.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType61);
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType61.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean67 = jSType66.isObject();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(functionTypeList60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(typePair64);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01670");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node1.setCharno((int) (short) 1);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node1.siblings();
        boolean boolean5 = node1.hasMoreThanOneChild();
        java.util.Set<java.lang.String> strSet6 = node1.getDirectives();
        int int7 = node1.getChildCount();
        node1.setLineno(41);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01671");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.setVarArgs(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder9 = node3.getJsDocBuilderForNode();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node14, "hi!");
        boolean boolean19 = node14.isCatch();
        java.lang.String str20 = node14.getQualifiedName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("{1936444324}", (int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship25 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node14, node24);
        java.lang.String str26 = node3.checkTreeEquals(node24);
        com.google.javascript.rhino.InputId inputId27 = node3.getInputId();
        boolean boolean28 = node3.isFor();
        boolean boolean29 = node3.isWhile();
        com.google.javascript.rhino.InputId inputId30 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n" + "'", str26, "Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n");
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(inputId30);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01672");
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder0 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean5 = node4.isSwitch();
        com.google.javascript.rhino.Node[] nodeArray6 = new com.google.javascript.rhino.Node[] { node4 };
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(29, nodeArray6);
        node7.putIntProp(32, 16);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node7.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = new com.google.javascript.rhino.JSTypeExpression(node16, "hi!");
        boolean boolean21 = node16.isCatch();
        java.lang.String str22 = node16.getQualifiedName();
        boolean boolean23 = node16.isFromExterns();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder24 = node16.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean29 = node28.hasOneChild();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder30 = node28.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean34 = node33.isSwitch();
        boolean boolean35 = node33.hasOneChild();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder36 = node33.getJsDocBuilderForNode();
        fileLevelJsDocBuilder36.append("function ({95791262}): {95791262}");
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder39 = null;
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.FileLevelJsDocBuilder> fileLevelJsDocBuilderList41 = com.google.common.collect.ImmutableList.of(fileLevelJsDocBuilder0, fileLevelJsDocBuilder11, fileLevelJsDocBuilder12, fileLevelJsDocBuilder24, fileLevelJsDocBuilder30, fileLevelJsDocBuilder36, fileLevelJsDocBuilder39, fileLevelJsDocBuilder40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 0");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder36);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01673");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        boolean boolean13 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType10.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType10.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = functionType27.getPossibleToBooleanOutcomes();
        boolean boolean30 = functionType27.isResolved();
        boolean boolean32 = functionType27.hasOwnProperty("java.io.IOException: ");
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType10.forceResolve(errorReporter16, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType27);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int39 = node38.getSourceOffset();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        node38.addChildrenToBack(node43);
        node38.detachChildren();
        node38.setLineno(16);
        boolean boolean49 = node38.isSwitch();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(39, node54);
        boolean boolean56 = node55.isIf();
        node55.detachChildren();
        boolean boolean58 = node38.hasChild(node55);
        boolean boolean59 = node38.isDebugger();
        boolean boolean60 = node38.isFalse();
        boolean boolean61 = node38.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList66 = com.google.common.collect.ImmutableList.of(jSDocInfo62, jSDocInfo63, jSDocInfo64, jSDocInfo65);
        boolean boolean68 = jSDocInfo64.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet69 = jSDocInfo64.getSuppressions();
        node38.setDirectives(strSet69);
        com.google.common.collect.ImmutableList<java.lang.Object> objList73 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream74 = objList73.parallelStream();
        boolean boolean75 = strSet69.retainAll((java.util.Collection<java.lang.Object>) objList73);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable83 = node82.children();
        boolean boolean84 = node82.isQuotedString();
        com.google.javascript.rhino.Node node85 = node82.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry77.createFunctionType(jSType78, node85);
        boolean boolean87 = functionType86.isArrayType();
        boolean boolean88 = functionType86.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = functionType86.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable90 = functionType86.getAllImplementedInterfaces();
        boolean boolean91 = functionType86.isNativeObjectType();
        functionType86.clearCachedValues();
        boolean boolean93 = strSet69.contains((java.lang.Object) functionType86);
        com.google.javascript.rhino.jstype.JSType jSType94 = functionType10.forceResolve(errorReporter34, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType86);
        boolean boolean95 = jSType94.matchesInt32Context();
        boolean boolean96 = jSType94.isParameterizedType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(jSType15);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(objList73);
        org.junit.Assert.assertNotNull(objStream74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(nodeIterable83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNotNull(objectTypeIterable90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01674");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType26.canBeCalled();
        boolean boolean32 = functionType26.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType26.unboxesTo();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = functionType26.getConstructor();
        java.util.Set<java.lang.String> strSet35 = functionType26.getOwnPropertyNames();
        java.lang.Object[] objArray45 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList46 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList46, objArray45);
        java.lang.Object[] objArray48 = objList46.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList51 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray52 = objList51.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor53 = objList51.listIterator();
        int int54 = objList51.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor56 = objList51.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(39, node61);
        boolean boolean63 = node62.isIf();
        node62.detachChildren();
        boolean boolean65 = node62.isVoid();
        boolean boolean66 = node62.isNE();
        int int67 = objList51.indexOf((java.lang.Object) node62);
        boolean boolean68 = objList51.isEmpty();
        int int69 = objList51.size();
        boolean boolean70 = objList46.containsAll((java.util.Collection<java.lang.Object>) objList51);
        boolean boolean71 = strSet35.containsAll((java.util.Collection<java.lang.Object>) objList51);
        com.google.common.collect.ImmutableList<java.lang.Object> objList74 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray75 = objList74.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor76 = objList74.listIterator();
        int int77 = objList74.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor79 = objList74.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(39, node84);
        boolean boolean86 = node85.isIf();
        node85.detachChildren();
        boolean boolean88 = node85.isVoid();
        boolean boolean89 = node85.isNE();
        int int90 = objList74.indexOf((java.lang.Object) node85);
        boolean boolean91 = objList74.isEmpty();
        java.util.Iterator<java.lang.Object> objItor92 = objList74.iterator();
        java.lang.Object[] objArray93 = objList74.toArray();
        boolean boolean94 = strSet35.removeAll((java.util.Collection<java.lang.Object>) objList74);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertNull(functionType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objList51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(objItor56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objList74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(objItor79);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objItor92);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray93), "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01675");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        functionType14.clearCachedValues();
        com.google.javascript.rhino.Node node34 = functionType14.getPropertyNode("function ({1077595546}): {1077595546}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01676");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.getPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = functionType10.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList21 = com.google.common.collect.ImmutableList.of(jSDocInfo17, jSDocInfo18, jSDocInfo19, jSDocInfo20);
        boolean boolean23 = jSDocInfo19.hasParameterType("hi!");
        java.lang.String str24 = jSDocInfo19.getBlockDescription();
        java.lang.String str25 = jSDocInfo19.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList26 = jSDocInfo19.getImplementedInterfaces();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection27 = jSDocInfo19.getMarkers();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList28 = jSDocInfo19.getImplementedInterfaces();
        functionType10.setPropertyJSDocInfo("function ({1873536480}): {1873536480}", jSDocInfo19);
        java.lang.String str30 = jSDocInfo19.getBlockDescription();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSDocInfoList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(jSTypeExpressionList26);
        org.junit.Assert.assertNotNull(markerCollection27);
        org.junit.Assert.assertNotNull(jSTypeExpressionList28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01677");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int19 = node3.getIndexOfChild(node18);
        boolean boolean20 = node18.isIf();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int25 = node24.getSourceOffset();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.children();
        node24.addChildrenToBack(node29);
        boolean boolean32 = node29.isGetElem();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        node36.addChildrenToBack(node41);
        node36.detachChildren();
        node36.setLineno(16);
        node29.addChildrenToFront(node36);
        boolean boolean48 = node36.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node49 = node18.copyInformationFrom(node36);
        boolean boolean50 = node49.isReturn();
        boolean boolean51 = node49.isSyntheticBlock();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01678");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType14.getPropertyType("");
        boolean boolean34 = functionType14.isOrdinaryFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType45.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType49 = functionType45.toMaybeFunctionType();
        boolean boolean51 = functionType49.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType49.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable61 = node60.children();
        boolean boolean62 = node60.isQuotedString();
        com.google.javascript.rhino.Node node63 = node60.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry55.createFunctionType(jSType56, node63);
        boolean boolean65 = functionType49.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean66 = functionType49.isNullable();
        functionType49.clearCachedValues();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet68 = functionType49.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair69 = functionType14.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.JSType jSType70 = functionType14.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = jSType70.isBooleanObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(nodeIterable61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet68 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet68.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(typePair69);
        org.junit.Assert.assertNull(jSType70);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01679");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList20, objArray19);
        java.lang.Object[] objArray22 = objList20.toArray();
        java.util.stream.Stream<java.lang.Object> objStream23 = objList20.parallelStream();
        int int24 = objList20.size();
        boolean boolean25 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList20);
        java.util.ListIterator<java.lang.Object> objItor26 = objList2.listIterator();
        java.util.stream.Stream<java.lang.Object> objStream27 = objList2.stream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList30 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = objList30.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor32 = objList30.listIterator();
        int int33 = objList30.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor35 = objList30.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(39, node40);
        boolean boolean42 = node41.isIf();
        node41.detachChildren();
        boolean boolean44 = node41.isVoid();
        boolean boolean45 = node41.isNE();
        int int46 = objList30.indexOf((java.lang.Object) node41);
        com.google.common.collect.ImmutableList<java.lang.Object> objList47 = objList30.asList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = objList2.addAll((java.util.Collection<java.lang.Object>) objList30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertNotNull(objStream27);
        org.junit.Assert.assertNotNull(objList30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(objItor35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objList47);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01680");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList16.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor18 = objList16.listIterator();
        boolean boolean20 = objList16.contains((java.lang.Object) (short) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = objList16.equals(obj21);
        java.lang.String str23 = objList16.toString();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isScript();
        boolean boolean33 = node27.hasChildren();
        int int34 = objList16.lastIndexOf((java.lang.Object) node27);
        boolean boolean35 = objList10.addAll((java.util.Collection<java.lang.Object>) objList16);
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean37 = jSDocInfo36.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo36.getEnumParameterType();
        boolean boolean39 = jSDocInfo36.isExterns();
        boolean boolean40 = jSDocInfo36.isIdGenerator();
        boolean boolean41 = jSDocInfo36.isDeprecated();
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = jSDocInfo36.getTemplateTypeNames();
        boolean boolean43 = jSDocInfo36.isHidden();
        boolean boolean44 = objList10.equals((java.lang.Object) boolean43);
        com.google.common.collect.ImmutableList<java.lang.Object> objList47 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray48 = objList47.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor49 = objList47.listIterator();
        boolean boolean51 = objList47.contains((java.lang.Object) (short) 10);
        boolean boolean52 = objList10.addAll((java.util.Collection<java.lang.Object>) objList47);
        int int54 = objList47.lastIndexOf((java.lang.Object) "function ({774120819}): {774120819}");
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        boolean boolean63 = node61.isQuotedString();
        com.google.javascript.rhino.Node node64 = node61.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry56.createFunctionType(jSType57, node64);
        boolean boolean67 = functionType65.isPropertyTypeDeclared("");
        boolean boolean69 = functionType65.isPropertyInExterns("JSDocInfo");
        boolean boolean70 = functionType65.isRecordType();
        boolean boolean71 = functionType65.isUnknownType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = objList47.add((java.lang.Object) functionType65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 0]" + "'", str23, "[10, 0]");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objList47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01681");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType10.isArrayType();
        java.lang.String str32 = functionType10.toString();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(32, "JSDocInfo", (int) (byte) 100, 32);
        functionType10.setSource(node37);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int44 = node43.getSourceOffset();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.children();
        node43.addChildrenToBack(node48);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int55 = node54.getSourceOffset();
        com.google.javascript.rhino.Node node56 = node43.useSourceInfoIfMissingFrom(node54);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node43, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean62 = node59.isEquivalentTo(node61);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 36", 54, 49);
        com.google.javascript.rhino.Node node67 = node59.useSourceInfoIfMissingFromForTree(node66);
        node66.putBooleanProp((int) (byte) 100, false);
        node66.setLength(48);
        boolean boolean73 = node66.isOr();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable78 = node77.children();
        boolean boolean79 = node77.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression81 = new com.google.javascript.rhino.JSTypeExpression(node77, "hi!");
        boolean boolean82 = node77.isCatch();
        java.lang.String str83 = node77.getQualifiedName();
        boolean boolean84 = node77.isFromExterns();
        com.google.javascript.rhino.Node node85 = node66.useSourceInfoIfMissingFromForTree(node77);
        boolean boolean86 = node66.isLabelName();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean91 = node90.hasOneChild();
        node90.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable94 = node90.getAncestors();
        int int95 = node90.getChildCount();
        java.lang.String str96 = node90.toString();
        int int97 = node90.getChildCount();
        com.google.javascript.rhino.Node node98 = node66.srcrefTree(node90);
        boolean boolean99 = node37.isEquivalentToTyped(node90);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "function (...[?]): ?" + "'", str32, "function (...[?]): ?");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(nodeIterable78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(ancestorIterable94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "NUMBER 0.0 36" + "'", str96, "NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(node98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01682");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        boolean boolean30 = objList27.add((java.lang.Object) 100.0d);
        boolean boolean31 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList27);
        java.lang.Object obj32 = null;
        boolean boolean33 = objList27.remove(obj32);
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray37 = objList36.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        boolean boolean49 = functionType48.isArrayType();
        boolean boolean50 = functionType48.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType48.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot54 = functionType48.getOwnSlot("hi!");
        boolean boolean55 = objList36.contains((java.lang.Object) "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList60 = com.google.common.collect.ImmutableList.of(jSDocInfo56, jSDocInfo57, jSDocInfo58, jSDocInfo59);
        boolean boolean62 = jSDocInfo58.hasParameterType("hi!");
        boolean boolean63 = jSDocInfo58.hasReturnType();
        boolean boolean64 = jSDocInfo58.hasModifies();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection65 = jSDocInfo58.getTypeNodes();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator66 = nodeCollection65.spliterator();
        boolean boolean67 = objList36.equals((java.lang.Object) nodeCollection65);
        boolean boolean68 = objList27.retainAll((java.util.Collection<java.lang.Object>) objList36);
        com.google.common.collect.ImmutableList<java.lang.Object> objList71 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream72 = objList71.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList73 = objList71.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList74 = objList71.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator75 = objList71.spliterator();
        java.util.Spliterator<java.lang.Object> objSpliterator76 = objList71.spliterator();
        java.util.ListIterator<java.lang.Object> objItor78 = objList71.listIterator(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = objList36.add((java.lang.Object) objItor78);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, 0]");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertNull(jSTypeStaticSlot54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(nodeCollection65);
        org.junit.Assert.assertNotNull(nodeSpliterator66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objList71);
        org.junit.Assert.assertNotNull(objStream72);
        org.junit.Assert.assertNotNull(objList73);
        org.junit.Assert.assertNotNull(objList74);
        org.junit.Assert.assertNotNull(objSpliterator75);
        org.junit.Assert.assertNotNull(objSpliterator76);
        org.junit.Assert.assertNotNull(objItor78);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01683");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean12 = functionType10.isPropertyTypeDeclared("");
        boolean boolean14 = functionType10.isPropertyInExterns("JSDocInfo");
        boolean boolean15 = functionType10.isRecordType();
        boolean boolean16 = functionType10.isUnknownType();
        java.lang.String str17 = functionType10.toAnnotationString();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        node21.addChildrenToBack(node26);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node21.useSourceInfoIfMissingFrom(node32);
        node34.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(39, node41);
        com.google.javascript.rhino.Node node43 = node34.srcref(node42);
        boolean boolean44 = node43.isNull();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int50 = node49.getSourceOffset();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        node49.addChildrenToBack(node54);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int61 = node60.getSourceOffset();
        com.google.javascript.rhino.Node node62 = node49.useSourceInfoIfMissingFrom(node60);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(10, node49, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet66 = node65.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable67 = node65.getAncestors();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean72 = node71.hasOneChild();
        node71.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable75 = node71.getAncestors();
        int int76 = node71.getChildCount();
        node65.addChildrenToFront(node71);
        boolean boolean78 = node43.isEquivalentToTyped(node71);
        int int79 = node43.getLength();
        com.google.javascript.rhino.Node node80 = node43.getFirstChild();
        functionType10.setSource(node43);
        node43.putBooleanProp(8, false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "function (...[?]): ?" + "'", str17, "function (...[?]): ?");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(strSet66);
        org.junit.Assert.assertNotNull(ancestorIterable67);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(ancestorIterable75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01684");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        functionType10.clearCachedValues();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.isNoCompile();
        java.lang.String str19 = jSDocInfo17.toString();
        boolean boolean20 = jSDocInfo17.isExpose();
        int int21 = jSDocInfo17.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection22 = jSDocInfo17.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo17.getReturnType();
        functionType10.setPropertyJSDocInfo("{671747480}", jSDocInfo17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType10.getCtorExtendedInterfaces();
        boolean boolean26 = functionType10.isTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType10.getPropertyType("NUMBER 0.0");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType39.toMaybeFunctionType();
        boolean boolean45 = functionType43.removeProperty("hi!");
        boolean boolean47 = functionType43.isPropertyInExterns("Not declared as a type name");
        boolean boolean48 = functionType43.hasDisplayName();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair49 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType28, (com.google.javascript.rhino.jstype.JSType) functionType43);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JSDocInfo" + "'", str19, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeCollection22);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01685");
        com.google.javascript.rhino.Node[] nodeArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(32, nodeArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01686");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean12 = functionType10.isPropertyTypeDeclared("");
        boolean boolean14 = functionType10.isPropertyInExterns("JSDocInfo");
        boolean boolean15 = functionType10.isRecordType();
        boolean boolean16 = functionType10.isUnknownType();
        java.lang.String str17 = functionType10.toAnnotationString();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        node21.addChildrenToBack(node26);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node34 = node21.useSourceInfoIfMissingFrom(node32);
        node34.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(39, node41);
        com.google.javascript.rhino.Node node43 = node34.srcref(node42);
        boolean boolean44 = node43.isNull();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int50 = node49.getSourceOffset();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        node49.addChildrenToBack(node54);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int61 = node60.getSourceOffset();
        com.google.javascript.rhino.Node node62 = node49.useSourceInfoIfMissingFrom(node60);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(10, node49, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet66 = node65.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable67 = node65.getAncestors();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean72 = node71.hasOneChild();
        node71.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable75 = node71.getAncestors();
        int int76 = node71.getChildCount();
        node65.addChildrenToFront(node71);
        boolean boolean78 = node43.isEquivalentToTyped(node71);
        int int79 = node43.getLength();
        com.google.javascript.rhino.Node node80 = node43.getFirstChild();
        functionType10.setSource(node43);
        boolean boolean83 = functionType10.isPropertyInExterns("(NUMBER 0.0 36)");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "function (...[?]): ?" + "'", str17, "function (...[?]): ?");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(strSet66);
        org.junit.Assert.assertNotNull(ancestorIterable67);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(ancestorIterable75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01687");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = node3.isCatch();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int13 = node12.getSourceOffset();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        node12.addChildrenToBack(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node25 = node12.useSourceInfoIfMissingFrom(node23);
        node25.setIsSyntheticBlock(false);
        node3.addChildrenToBack(node25);
        com.google.javascript.rhino.InputId inputId29 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(inputId29);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01688");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType10.isReturnTypeInferred();
        boolean boolean32 = functionType10.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType10.getIndexType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType33);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01689");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean15 = functionType14.isNullable();
        java.util.Set<java.lang.String> strSet16 = functionType14.getOwnPropertyNames();
        java.lang.Object[] objArray26 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        java.lang.Object[] objArray29 = objList27.toArray();
        java.util.stream.Stream<java.lang.Object> objStream30 = objList27.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList33 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray34 = objList33.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor35 = objList33.listIterator();
        boolean boolean37 = objList33.contains((java.lang.Object) (short) 10);
        java.lang.Object obj38 = null;
        boolean boolean39 = objList33.equals(obj38);
        java.lang.String str40 = objList33.toString();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        node44.setLength(0);
        boolean boolean49 = node44.isScript();
        boolean boolean50 = node44.hasChildren();
        int int51 = objList33.lastIndexOf((java.lang.Object) node44);
        boolean boolean52 = objList27.addAll((java.util.Collection<java.lang.Object>) objList33);
        com.google.common.collect.ImmutableList<java.lang.Object> objList55 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray56 = objList55.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor57 = objList55.listIterator();
        boolean boolean59 = objList55.contains((java.lang.Object) (short) 10);
        java.lang.Object obj60 = null;
        boolean boolean61 = objList55.equals(obj60);
        com.google.common.collect.ImmutableList<java.lang.Object> objList64 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray65 = objList64.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor66 = objList64.listIterator();
        int int67 = objList64.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor69 = objList64.listIterator((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Object> objList72 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray73 = objList72.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor74 = objList72.listIterator();
        int int75 = objList72.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor77 = objList72.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(39, node82);
        boolean boolean84 = node83.isIf();
        node83.detachChildren();
        boolean boolean86 = node83.isVoid();
        boolean boolean87 = node83.isNE();
        int int88 = objList72.indexOf((java.lang.Object) node83);
        boolean boolean89 = objList72.isEmpty();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Object>> objListList90 = com.google.common.collect.ImmutableList.of(objList33, objList55, objList64, objList72);
        boolean boolean91 = strSet16.containsAll((java.util.Collection<java.lang.Object>) objList33);
        boolean boolean92 = objList33.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            objList33.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream30);
        org.junit.Assert.assertNotNull(objList33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[10, 0]" + "'", str40, "[10, 0]");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objList55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objList64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(objItor69);
        org.junit.Assert.assertNotNull(objList72);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(objItor77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objListList90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01690");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(43, 43, 0);
        int int5 = node3.getIntProp(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01691");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        boolean boolean25 = functionType23.isRegexpType();
        boolean boolean27 = functionType23.isPropertyTypeDeclared("InputId: hi!");
        java.lang.String str28 = functionType23.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType23);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        boolean boolean41 = functionType40.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType40.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType44 = functionType40.toMaybeFunctionType();
        boolean boolean45 = functionType40.isNominalType();
        boolean boolean46 = functionType40.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType40.collapseUnion();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function ({693550799}): {693550799}" + "'", str28, "function ({693550799}): {693550799}");
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(jSType48);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01692");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isDefine();
        boolean boolean2 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getType();
        boolean boolean5 = jSDocInfo0.hasParameter("(function (...[?]): ?)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01693");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isNew();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        boolean boolean14 = node12.isQuotedString();
        node12.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable17 = node12.getAncestors();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoIfMissingFrom(node12);
        boolean boolean19 = node12.isGetProp();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ancestorIterable17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01694");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        int int32 = functionType14.getMaxArguments();
        boolean boolean33 = functionType14.isNoObjectType();
        boolean boolean35 = functionType14.isPropertyTypeInferred("function ({774120819}): {774120819}");
        boolean boolean36 = functionType14.isFunctionType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01695");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet12 = functionType10.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable13 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.getParameterType();
        com.google.javascript.rhino.jstype.ObjectType.Property property16 = functionType10.getSlot("false");
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType27.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType31 = functionType27.toMaybeFunctionType();
        boolean boolean33 = functionType31.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = functionType31.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType31.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        com.google.javascript.rhino.Node node45 = node42.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry37.createFunctionType(jSType38, node45);
        boolean boolean47 = functionType31.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean48 = functionType31.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType31.getPropertyType("");
        boolean boolean51 = functionType31.isOrdinaryFunction();
        boolean boolean52 = functionType31.matchesNumberContext();
        com.google.javascript.rhino.Node node53 = functionType31.getRootNode();
        boolean boolean54 = functionType31.isEnumElementType();
        boolean boolean55 = functionType31.isNoType();
        boolean boolean56 = functionType31.hasReferenceName();
        functionType10.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType31);
        int int58 = functionType31.getMinArguments();
        boolean boolean59 = functionType31.hasInstanceType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(property16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable34);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01696");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor7 = objList2.listIterator();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.Node node17 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry9.createFunctionType(jSType10, node17);
        boolean boolean19 = functionType18.isArrayType();
        boolean boolean20 = functionType18.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType18.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType18.getAllImplementedInterfaces();
        java.lang.String str23 = functionType18.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = functionType18.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        boolean boolean33 = node31.isQuotedString();
        com.google.javascript.rhino.Node node34 = node31.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry26.createFunctionType(jSType27, node34);
        boolean boolean36 = functionType35.isArrayType();
        boolean boolean37 = functionType35.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType35.findPropertyType("");
        boolean boolean40 = functionType35.hasInstanceType();
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType35.getTypeOfThis();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = functionType18.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = objList2.add((java.lang.Object) functionType18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(ternaryValue42);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01697");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType14.getPropertyType("");
        com.google.javascript.rhino.jstype.ObjectType.Property property35 = functionType14.getOwnSlot("function ({373829632}): {373829632}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNull(property35);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01698");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isExterns();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.isOverride();
        boolean boolean6 = jSDocInfo0.isDefine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01699");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType14.getPropertyType("");
        boolean boolean34 = functionType14.isOrdinaryFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList39 = com.google.common.collect.ImmutableList.of(jSDocInfo35, jSDocInfo36, jSDocInfo37, jSDocInfo38);
        boolean boolean41 = jSDocInfo37.hasParameterType("hi!");
        boolean boolean42 = jSDocInfo37.hasReturnType();
        boolean boolean43 = jSDocInfo37.hasModifies();
        java.util.Set<java.lang.String> strSet44 = jSDocInfo37.getParameterNames();
        functionType14.setJSDocInfo(jSDocInfo37);
        java.util.Set<java.lang.String> strSet46 = functionType14.getPropertyNames();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = functionType14.getOwnPropertyJSDocInfo("{671747480}");
        com.google.javascript.rhino.jstype.FunctionType functionType49 = functionType14.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = functionType49.hasOwnProperty("function ({1691750865}): {1691750865}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSDocInfoList39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNull(jSDocInfo48);
        org.junit.Assert.assertNull(functionType49);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01700");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int9 = node8.getSourceOffset();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.children();
        node8.addChildrenToBack(node13);
        node8.detachChildren();
        boolean boolean17 = node8.isOr();
        com.google.javascript.rhino.Node node18 = node3.copyInformationFrom(node8);
        boolean boolean19 = node18.hasMoreThanOneChild();
        boolean boolean20 = node18.isFromExterns();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01701");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo2.getParameterNames();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node13.addChildrenToBack(node18);
        node13.detachChildren();
        node13.setLineno(16);
        boolean boolean24 = node13.isSwitch();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(39, node29);
        boolean boolean31 = node30.isIf();
        node30.detachChildren();
        boolean boolean33 = node13.hasChild(node30);
        boolean boolean34 = node13.isDebugger();
        boolean boolean35 = node13.isFalse();
        boolean boolean36 = node13.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList41 = com.google.common.collect.ImmutableList.of(jSDocInfo37, jSDocInfo38, jSDocInfo39, jSDocInfo40);
        boolean boolean43 = jSDocInfo39.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet44 = jSDocInfo39.getSuppressions();
        node13.setDirectives(strSet44);
        com.google.common.collect.ImmutableList<java.lang.Object> objList48 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream49 = objList48.parallelStream();
        boolean boolean50 = strSet44.retainAll((java.util.Collection<java.lang.Object>) objList48);
        boolean boolean51 = strSet9.containsAll((java.util.Collection<java.lang.Object>) objList48);
        java.lang.Object[] objArray61 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList62 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList62, objArray61);
        java.lang.Object[] objArray64 = objList62.toArray();
        java.util.stream.Stream<java.lang.Object> objStream65 = objList62.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.isNoCompile();
        java.lang.String str68 = jSDocInfo66.toString();
        boolean boolean69 = jSDocInfo66.isExpose();
        int int70 = jSDocInfo66.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection71 = jSDocInfo66.getTypeNodes();
        boolean boolean72 = objList62.contains((java.lang.Object) jSDocInfo66);
        com.google.common.collect.ImmutableList<java.lang.Object> objList75 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream76 = objList75.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList77 = objList75.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList78 = objList75.reverse();
        java.lang.Object[] objArray79 = objList78.toArray();
        boolean boolean80 = objList62.addAll((java.util.Collection<java.lang.Object>) objList78);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = strSet9.remove((java.lang.Object) objList62);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertNotNull(objStream49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "JSDocInfo" + "'", str68, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(nodeCollection71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objList75);
        org.junit.Assert.assertNotNull(objStream76);
        org.junit.Assert.assertNotNull(objList77);
        org.junit.Assert.assertNotNull(objList78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[0, 10]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01702");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean15 = functionType14.isNullable();
        java.util.Set<java.lang.String> strSet16 = functionType14.getOwnPropertyNames();
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet16.spliterator();
        java.util.Iterator<java.lang.String> strItor18 = strSet16.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator19 = strSet16.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        boolean boolean28 = node26.isQuotedString();
        com.google.javascript.rhino.Node node29 = node26.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry21.createFunctionType(jSType22, node29);
        boolean boolean31 = functionType30.isArrayType();
        boolean boolean33 = functionType30.isPropertyTypeInferred("JSDocInfo");
        boolean boolean35 = functionType30.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        com.google.javascript.rhino.Node node45 = node42.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry37.createFunctionType(jSType38, node45);
        boolean boolean47 = functionType46.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.getPropertyType("InputId: hi!");
        boolean boolean50 = functionType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean51 = functionType46.canBeCalled();
        boolean boolean52 = functionType46.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType46.unboxesTo();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = functionType46.getConstructor();
        java.util.Set<java.lang.String> strSet55 = functionType46.getOwnPropertyNames();
        java.lang.Object[] objArray65 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList66 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList66, objArray65);
        java.lang.Object[] objArray68 = objList66.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList71 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray72 = objList71.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor73 = objList71.listIterator();
        int int74 = objList71.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor76 = objList71.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(39, node81);
        boolean boolean83 = node82.isIf();
        node82.detachChildren();
        boolean boolean85 = node82.isVoid();
        boolean boolean86 = node82.isNE();
        int int87 = objList71.indexOf((java.lang.Object) node82);
        boolean boolean88 = objList71.isEmpty();
        int int89 = objList71.size();
        boolean boolean90 = objList66.containsAll((java.util.Collection<java.lang.Object>) objList71);
        boolean boolean91 = strSet55.containsAll((java.util.Collection<java.lang.Object>) objList71);
        boolean boolean92 = strSet16.containsAll((java.util.Collection<java.lang.Object>) objList71);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strSpliterator19);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNull(functionType54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objList71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2 + "'", int74 == 2);
        org.junit.Assert.assertNotNull(objItor76);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01703");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getAnnotation();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01704");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        functionType10.clearCachedValues();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.isNoCompile();
        java.lang.String str19 = jSDocInfo17.toString();
        boolean boolean20 = jSDocInfo17.isExpose();
        int int21 = jSDocInfo17.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection22 = jSDocInfo17.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo17.getReturnType();
        functionType10.setPropertyJSDocInfo("{671747480}", jSDocInfo17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType10.getCtorExtendedInterfaces();
        boolean boolean26 = functionType10.isTemplateType();
        java.lang.String str27 = functionType10.getDisplayName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JSDocInfo" + "'", str19, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeCollection22);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01705");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean15 = functionType14.isNullable();
        java.util.Set<java.lang.String> strSet16 = functionType14.getOwnPropertyNames();
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet16.spliterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList20 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray21 = objList20.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        boolean boolean30 = node28.isQuotedString();
        com.google.javascript.rhino.Node node31 = node28.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry23.createFunctionType(jSType24, node31);
        boolean boolean33 = functionType32.isArrayType();
        boolean boolean34 = functionType32.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType32.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot38 = functionType32.getOwnSlot("hi!");
        boolean boolean39 = objList20.contains((java.lang.Object) "hi!");
        boolean boolean40 = strSet16.removeAll((java.util.Collection<java.lang.Object>) objList20);
        com.google.javascript.rhino.InputId inputId42 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str43 = inputId42.toString();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.InputId> inputIdList44 = com.google.common.collect.ImmutableList.of(inputId42);
        int int45 = objList20.indexOf((java.lang.Object) inputId42);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean58 = functionType56.isPropertyTypeDeclared("");
        boolean boolean60 = functionType56.isPropertyInExterns("JSDocInfo");
        boolean boolean61 = functionType56.isRecordType();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable69 = node68.children();
        boolean boolean70 = node68.isQuotedString();
        com.google.javascript.rhino.Node node71 = node68.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry63.createFunctionType(jSType64, node71);
        boolean boolean73 = functionType72.isArrayType();
        boolean boolean74 = functionType72.isRegexpType();
        boolean boolean76 = functionType72.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node77 = functionType72.getRootNode();
        boolean boolean78 = functionType72.isParameterizedType();
        functionType56.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType72);
        boolean boolean80 = inputId42.equals((java.lang.Object) functionType72);
        java.lang.String str81 = inputId42.getIdName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertNotNull(objList20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, 0]");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNull(jSTypeStaticSlot38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "InputId: hi!" + "'", str43, "InputId: hi!");
        org.junit.Assert.assertNotNull(inputIdList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeIterable69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01706");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList16.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor18 = objList16.listIterator();
        boolean boolean20 = objList16.contains((java.lang.Object) (short) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = objList16.equals(obj21);
        java.lang.String str23 = objList16.toString();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isScript();
        boolean boolean33 = node27.hasChildren();
        int int34 = objList16.lastIndexOf((java.lang.Object) node27);
        boolean boolean35 = objList10.addAll((java.util.Collection<java.lang.Object>) objList16);
        java.util.Spliterator<java.lang.Object> objSpliterator36 = objList16.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Object> objItor38 = objList16.listIterator(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (48) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 0]" + "'", str23, "[10, 0]");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objSpliterator36);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01707");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean21 = node20.hasOneChild();
        node20.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable24 = node20.getAncestors();
        int int25 = node20.getLineno();
        boolean boolean26 = node20.isLocalResultCall();
        com.google.javascript.rhino.Node node27 = node16.useSourceInfoFromForTree(node20);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = new com.google.javascript.rhino.JSTypeExpression(node20, "hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        boolean boolean41 = functionType40.isArrayType();
        boolean boolean42 = functionType40.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType40.getPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType40.toObjectType();
        java.util.Set<java.lang.String> strSet46 = objectType45.getPropertyNames();
        boolean boolean47 = objectType45.isFunctionType();
        boolean boolean48 = jSTypeExpression29.equals((java.lang.Object) objectType45);
        boolean boolean49 = objectType45.matchesNumberContext();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ancestorIterable24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 36 + "'", int25 == 36);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01708");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        node3.setDouble((double) 100);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        node16.addChildrenToBack(node21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int28 = node27.getSourceOffset();
        com.google.javascript.rhino.Node node29 = node16.useSourceInfoIfMissingFrom(node27);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node16, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet33 = node32.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable34 = node32.getAncestors();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean39 = node38.hasOneChild();
        node38.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable42 = node38.getAncestors();
        int int43 = node38.getChildCount();
        node32.addChildrenToFront(node38);
        com.google.javascript.rhino.Node node46 = node38.getChildAtIndex(0);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int51 = node50.getSourceOffset();
        boolean boolean52 = node50.isDo();
        node38.addChildToFront(node50);
        boolean boolean54 = node50.isAssign();
        boolean boolean55 = node50.isEmpty();
        com.google.javascript.rhino.Node node56 = node3.useSourceInfoFrom(node50);
        boolean boolean57 = node50.isNot();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile58 = node50.getStaticSourceFile();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(ancestorIterable34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(ancestorIterable42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(staticSourceFile58);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01709");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList16 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray17 = objList16.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor18 = objList16.listIterator();
        boolean boolean20 = objList16.contains((java.lang.Object) (short) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = objList16.equals(obj21);
        java.lang.String str23 = objList16.toString();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        node27.setLength(0);
        boolean boolean32 = node27.isScript();
        boolean boolean33 = node27.hasChildren();
        int int34 = objList16.lastIndexOf((java.lang.Object) node27);
        boolean boolean35 = objList10.addAll((java.util.Collection<java.lang.Object>) objList16);
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean37 = jSDocInfo36.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo36.getEnumParameterType();
        boolean boolean39 = jSDocInfo36.isExterns();
        boolean boolean40 = jSDocInfo36.isIdGenerator();
        boolean boolean41 = jSDocInfo36.isDeprecated();
        com.google.common.collect.ImmutableList<java.lang.String> strList42 = jSDocInfo36.getTemplateTypeNames();
        boolean boolean43 = jSDocInfo36.isHidden();
        boolean boolean44 = objList10.equals((java.lang.Object) boolean43);
        com.google.common.collect.ImmutableList<java.lang.Object> objList47 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray48 = objList47.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor49 = objList47.listIterator();
        boolean boolean51 = objList47.contains((java.lang.Object) (short) 10);
        boolean boolean52 = objList10.addAll((java.util.Collection<java.lang.Object>) objList47);
        java.util.Iterator<java.lang.Object> objItor53 = objList47.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList56 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray57 = objList56.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable65 = node64.children();
        boolean boolean66 = node64.isQuotedString();
        com.google.javascript.rhino.Node node67 = node64.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry59.createFunctionType(jSType60, node67);
        boolean boolean69 = functionType68.isArrayType();
        boolean boolean70 = functionType68.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType68.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot74 = functionType68.getOwnSlot("hi!");
        boolean boolean75 = objList56.contains((java.lang.Object) "hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList76 = objList56.reverse();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor78 = objList76.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = objList47.addAll((java.util.Collection<java.lang.Object>) objList76);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertNotNull(objList16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 0]" + "'", str23, "[10, 0]");
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objList47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objItor53);
        org.junit.Assert.assertNotNull(objList56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10, 0]");
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(nodeIterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(jSType72);
        org.junit.Assert.assertNull(jSTypeStaticSlot74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objList76);
        org.junit.Assert.assertNotNull(objItor78);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01710");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor7 = objList2.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(39, node12);
        boolean boolean14 = node13.isIf();
        node13.detachChildren();
        boolean boolean16 = node13.isVoid();
        boolean boolean17 = node13.isNE();
        int int18 = objList2.indexOf((java.lang.Object) node13);
        com.google.common.collect.ImmutableList<java.lang.Object> objList19 = objList2.asList();
        java.lang.Object[] objArray29 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList30 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList30, objArray29);
        java.lang.Object[] objArray32 = objList30.toArray();
        java.util.stream.Stream<java.lang.Object> objStream33 = objList30.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList36 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray37 = objList36.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor38 = objList36.listIterator();
        boolean boolean40 = objList36.contains((java.lang.Object) (short) 10);
        java.lang.Object obj41 = null;
        boolean boolean42 = objList36.equals(obj41);
        java.lang.String str43 = objList36.toString();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        node47.setLength(0);
        boolean boolean52 = node47.isScript();
        boolean boolean53 = node47.hasChildren();
        int int54 = objList36.lastIndexOf((java.lang.Object) node47);
        boolean boolean55 = objList30.addAll((java.util.Collection<java.lang.Object>) objList36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = objList19.retainAll((java.util.Collection<java.lang.Object>) objList30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objList19);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream33);
        org.junit.Assert.assertNotNull(objList36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[10, 0]" + "'", str43, "[10, 0]");
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01711");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Object> objList6 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray26 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        boolean boolean30 = objList27.add((java.lang.Object) 100.0d);
        boolean boolean31 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList27);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList42 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList42, objArray41);
        java.lang.Object[] objArray44 = objList42.toArray();
        java.util.stream.Stream<java.lang.Object> objStream45 = objList42.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList48 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray49 = objList48.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor50 = objList48.listIterator();
        boolean boolean52 = objList48.contains((java.lang.Object) (short) 10);
        java.lang.Object obj53 = null;
        boolean boolean54 = objList48.equals(obj53);
        java.lang.String str55 = objList48.toString();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        node59.setLength(0);
        boolean boolean64 = node59.isScript();
        boolean boolean65 = node59.hasChildren();
        int int66 = objList48.lastIndexOf((java.lang.Object) node59);
        boolean boolean67 = objList42.addAll((java.util.Collection<java.lang.Object>) objList48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = objList2.removeAll((java.util.Collection<java.lang.Object>) objList42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objList6);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream45);
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "[10, 0]" + "'", str55, "[10, 0]");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01712");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType39.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType39);
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType59 = functionType56.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType56.toMaybeFunctionType();
        boolean boolean62 = functionType60.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = functionType60.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType60.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node71.children();
        boolean boolean73 = node71.isQuotedString();
        com.google.javascript.rhino.Node node74 = node71.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry66.createFunctionType(jSType67, node74);
        boolean boolean76 = functionType60.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType75);
        java.lang.String str77 = functionType75.getDisplayName();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType75.getCtorExtendedInterfaces();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection79 = jSTypeRegistry1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType75);
        boolean boolean80 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        java.util.List<java.lang.String> strList81 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.setTemplateTypeNames(strList81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertNotNull(functionTypeCollection79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01713");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = functionType40.toMaybeFunctionType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection42 = jSTypeRegistry1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        boolean boolean43 = functionType41.hasInstanceType();
        boolean boolean45 = functionType41.isPropertyInExterns("function ({1905212938}): {1905212938}");
        com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType41.getParentScope();
        boolean boolean47 = objectType46.isVoidType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(functionTypeCollection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01714");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        node6.setLength(0);
        boolean boolean11 = node6.isVar();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean16 = node15.hasOneChild();
        node6.addChildToBack(node15);
        boolean boolean18 = node15.isInc();
        node15.addSuppression("false");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        com.google.javascript.rhino.Node node30 = node27.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry22.createFunctionType(jSType23, node30);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry22.getType("");
        boolean boolean35 = jSTypeRegistry22.hasNamespace("InputId: hi!");
        com.google.javascript.rhino.jstype.JSType jSType36 = assertionFunctionSpec2.getAssertedType(node15, jSTypeRegistry22);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.children();
        node40.addChildrenToBack(node45);
        boolean boolean48 = node45.isGetElem();
        int int49 = node45.getType();
        com.google.javascript.rhino.Node node50 = assertionFunctionSpec2.getAssertedParam(node45);
        java.lang.Appendable appendable51 = null;
        // The following exception was thrown during execution in test generation
        try {
            node45.appendStringTree(appendable51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 39 + "'", int49 == 39);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01715");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor7 = objList2.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(39, node12);
        boolean boolean14 = node13.isIf();
        node13.detachChildren();
        boolean boolean16 = node13.isVoid();
        boolean boolean17 = node13.isNE();
        int int18 = objList2.indexOf((java.lang.Object) node13);
        boolean boolean19 = objList2.isEmpty();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01716");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int9 = node8.getSourceOffset();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.children();
        node8.addChildrenToBack(node13);
        node8.detachChildren();
        boolean boolean17 = node8.isOr();
        com.google.javascript.rhino.Node node18 = node3.copyInformationFrom(node8);
        boolean boolean19 = node18.isContinue();
        int int20 = node18.getLength();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int25 = node24.getSourceOffset();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.children();
        node24.addChildrenToBack(node29);
        boolean boolean32 = node29.isGetElem();
        int int33 = node29.getType();
        com.google.javascript.rhino.jstype.JSType jSType34 = node29.getJSType();
        boolean boolean35 = node29.isAssignAdd();
        boolean boolean36 = node18.isEquivalentToTyped(node29);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        node41.addChildrenToBack(node46);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int53 = node52.getSourceOffset();
        com.google.javascript.rhino.Node node54 = node41.useSourceInfoIfMissingFrom(node52);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(10, node41, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet58 = node57.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable59 = node57.getAncestors();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean64 = node63.hasOneChild();
        node63.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable67 = node63.getAncestors();
        int int68 = node63.getChildCount();
        node57.addChildrenToFront(node63);
        com.google.javascript.rhino.Node node71 = node63.getChildAtIndex(0);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int76 = node75.getSourceOffset();
        boolean boolean77 = node75.isDo();
        node63.addChildToFront(node75);
        boolean boolean79 = node75.isAssign();
        boolean boolean80 = node75.isEmpty();
        com.google.javascript.rhino.Node node81 = node29.copyInformationFromForTree(node75);
        boolean boolean82 = node81.isBreak();
        boolean boolean83 = node81.isComma();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 39 + "'", int33 == 39);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(strSet58);
        org.junit.Assert.assertNotNull(ancestorIterable59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(ancestorIterable67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01717");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        com.google.javascript.rhino.Node node13 = functionType10.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = functionType10.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        boolean boolean28 = functionType25.isPropertyTypeInferred("JSDocInfo");
        boolean boolean30 = functionType25.hasOwnProperty("");
        com.google.javascript.rhino.Node node31 = functionType25.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        boolean boolean44 = functionType42.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType42.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType42.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = functionType25.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType42);
        boolean boolean48 = functionType10.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType42);
        boolean boolean50 = functionType10.hasOwnProperty("function ({1265812580}): {1265812580}");
        boolean boolean51 = functionType10.matchesStringContext();
        java.lang.String str52 = functionType10.toDebugHashCodeString();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "function ({362706984}): {362706984}" + "'", str52, "function ({362706984}): {362706984}");
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01718");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo3.getReturnType();
        boolean boolean6 = jSDocInfo3.hasEnumParameterType();
        boolean boolean7 = jSDocInfo3.hasModifies();
        boolean boolean8 = jSDocInfo3.containsDeclaration();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01719");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean7 = node6.isSwitch();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node6 };
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(29, nodeArray8);
        node9.putIntProp(32, 16);
        namePosition0.setItem(node9);
        boolean boolean14 = node9.isRegExp();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01720");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        node3.setLineno(16);
        boolean boolean14 = node3.isSwitch();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(39, node19);
        boolean boolean21 = node20.isIf();
        node20.detachChildren();
        boolean boolean23 = node3.hasChild(node20);
        boolean boolean24 = node3.isDebugger();
        boolean boolean25 = node3.isGetProp();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01721");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        node3.setDouble((double) 100);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        node16.addChildrenToBack(node21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int28 = node27.getSourceOffset();
        com.google.javascript.rhino.Node node29 = node16.useSourceInfoIfMissingFrom(node27);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node16, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet33 = node32.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable34 = node32.getAncestors();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean39 = node38.hasOneChild();
        node38.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable42 = node38.getAncestors();
        int int43 = node38.getChildCount();
        node32.addChildrenToFront(node38);
        com.google.javascript.rhino.Node node46 = node38.getChildAtIndex(0);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int51 = node50.getSourceOffset();
        boolean boolean52 = node50.isDo();
        node38.addChildToFront(node50);
        boolean boolean54 = node50.isAssign();
        boolean boolean55 = node50.isEmpty();
        com.google.javascript.rhino.Node node56 = node3.useSourceInfoFrom(node50);
        boolean boolean57 = node3.isVoid();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(ancestorIterable34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(ancestorIterable42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01722");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean23 = node20.isEquivalentTo(node22);
        node20.setLineno((-1));
        boolean boolean26 = node20.isSwitch();
        int int27 = node20.getType();
        boolean boolean28 = node20.isTry();
        boolean boolean29 = node20.isQuotedString();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01723");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet21 = node20.getDirectives();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        node25.addChildrenToBack(node30);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node38 = node25.useSourceInfoIfMissingFrom(node36);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int41 = node25.getIndexOfChild(node40);
        com.google.javascript.rhino.Node node42 = node20.srcref(node25);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node25);
        boolean boolean44 = node25.isNE();
        node25.removeProp((int) (byte) 1);
        com.google.javascript.rhino.Node node47 = node25.removeFirstChild();
        boolean boolean48 = node25.wasEmptyNode();
        boolean boolean49 = node25.isArrayLit();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01724");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        boolean boolean47 = jSType34.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = functionType45.getJSDocInfo();
        boolean boolean49 = functionType45.matchesStringContext();
        boolean boolean50 = functionType45.isVoidType();
        com.google.javascript.rhino.jstype.JSType jSType51 = functionType45.unboxesTo();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(jSDocInfo48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(jSType51);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01725");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isExterns();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.isDefine();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        int int7 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01726");
        com.google.common.collect.ImmutableList.Builder<com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence>> charSequenceBuilderBuilder0 = new com.google.common.collect.ImmutableList.Builder<com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence>>();
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01727");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo3.getReturnType();
        boolean boolean6 = jSDocInfo3.hasEnumParameterType();
        boolean boolean7 = jSDocInfo3.hasModifies();
        jSDocInfo3.addSuppression("java.io.IOException: ");
        boolean boolean10 = jSDocInfo3.isConstructor();
        boolean boolean11 = jSDocInfo3.hasModifies();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01728");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList26 = functionType24.getSubTypes();
        com.google.javascript.rhino.Node node27 = functionType24.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = functionType24.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        boolean boolean42 = functionType39.isPropertyTypeInferred("JSDocInfo");
        boolean boolean44 = functionType39.hasOwnProperty("");
        com.google.javascript.rhino.Node node45 = functionType39.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        boolean boolean58 = functionType56.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType56.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable60 = functionType56.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = functionType39.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType56);
        boolean boolean62 = functionType24.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType56);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = functionType10.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType56);
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node70.children();
        boolean boolean72 = node70.isQuotedString();
        com.google.javascript.rhino.Node node73 = node70.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry65.createFunctionType(jSType66, node73);
        boolean boolean75 = functionType74.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList76 = functionType74.getSubTypes();
        boolean boolean77 = functionType10.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType74);
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList83 = com.google.common.collect.ImmutableList.of(jSDocInfo79, jSDocInfo80, jSDocInfo81, jSDocInfo82);
        java.util.Set<java.lang.String> strSet84 = jSDocInfo82.getSuppressions();
        boolean boolean85 = jSDocInfo82.containsDeclaration();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList86 = jSDocInfo82.getThrownTypes();
        boolean boolean87 = jSDocInfo82.isOverride();
        boolean boolean88 = jSDocInfo82.containsDeclaration();
        functionType10.setPropertyJSDocInfo("function (...[?]): ?", jSDocInfo82);
        java.lang.Iterable iterable90 = functionType10.getCtorExtendedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(functionTypeList26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(functionTypeList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSDocInfoList83);
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(iterable90);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01729");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.removeProp(36);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        java.lang.String[] strArray25 = new java.lang.String[] { "NUMBER 0.0 36", "function ({1265812580}): {1265812580}", "function ({1265812580}): {1265812580}", "{1936444324}", "Not declared as a type name", "Not declared as a type name", "function ({1704073426}): {1704073426}", "[10, 0]", "", "function ({1265812580}): {1265812580}", "JSDocInfo", "{1936444324}", "", "java.io.IOException: ", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet26);
        boolean boolean29 = strSet26.isEmpty();
        boolean boolean31 = strSet26.add("function ({1259214183}): {1259214183}");
        int int32 = strSet26.size();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01730");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.Node node16 = functionType10.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        boolean boolean29 = functionType27.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = functionType27.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType27.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = functionType10.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean33 = functionType10.hasInstanceType();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType10, "function ({1704073426}): {1704073426}");
        com.google.javascript.rhino.Node node36 = functionType10.getParametersNode();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = node36.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: PARAM_LIST is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(objectType35);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01731");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType14.getPropertyType("");
        boolean boolean34 = functionType14.isOrdinaryFunction();
        boolean boolean35 = functionType14.matchesNumberContext();
        com.google.javascript.rhino.Node node36 = functionType14.getRootNode();
        boolean boolean37 = functionType14.isEnumElementType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = functionType14.getAllImplementedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01732");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "Not declared as a type name");
        boolean boolean5 = node4.isDebugger();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        boolean boolean11 = node9.isQuotedString();
        node9.setLength(0);
        boolean boolean14 = node9.isLabelName();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean19 = node18.hasOneChild();
        node18.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable22 = node18.getAncestors();
        boolean boolean23 = node18.isNoSideEffectsCall();
        node18.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(2, node4, node9, node18, 15, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node9.children();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("STRING NUMBER 0.0 36");
        node31.setType(41);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        boolean boolean39 = node37.isQuotedString();
        node37.setLength(0);
        boolean boolean42 = node37.isScript();
        boolean boolean43 = node37.hasChildren();
        node37.setDouble((double) 100);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int50 = node49.getSourceOffset();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        node49.addChildrenToBack(node54);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int61 = node60.getSourceOffset();
        com.google.javascript.rhino.Node node62 = node49.useSourceInfoIfMissingFrom(node60);
        boolean boolean63 = node49.isLabel();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        boolean boolean68 = node67.isFalse();
        node67.setOptionalArg(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder71 = node67.new FileLevelJsDocBuilder();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList72 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node37, (java.lang.Cloneable) node49, (java.lang.Cloneable) node67);
        node67.addSuppression("function ({288197166}): {288197166}");
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node78.children();
        boolean boolean80 = node78.isQuotedString();
        node78.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable83 = node78.getAncestors();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable84 = node78.children();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(4095, node9, node31, node67, node78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(cloneableList72);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(nodeIterable79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(ancestorIterable83);
        org.junit.Assert.assertNotNull(nodeIterable84);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01733");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        int int12 = node8.getType();
        com.google.javascript.rhino.jstype.JSType jSType13 = node8.getJSType();
        boolean boolean14 = node8.isAssignAdd();
        boolean boolean15 = node8.isInc();
        boolean boolean16 = node8.isFunction();
        node8.detachChildren();
        boolean boolean18 = node8.isDelProp();
        boolean boolean19 = node8.isBreak();
        node8.removeProp(4);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39 + "'", int12 == 39);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01734");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.lang.Object[] objArray6 = objList5.toArray();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int11 = node10.getSourceOffset();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        node10.addChildrenToBack(node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int22 = node21.getSourceOffset();
        com.google.javascript.rhino.Node node23 = node10.useSourceInfoIfMissingFrom(node21);
        boolean boolean24 = objList5.contains((java.lang.Object) node23);
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = objList5.reverse();
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry29.getType("hi!");
        jSTypeRegistry29.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node35 = jSTypeRegistry29.createParameters(jSTypeArray34);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        com.google.javascript.rhino.Node node45 = node42.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry37.createFunctionType(jSType38, node45);
        boolean boolean47 = functionType46.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType50 = functionType46.toMaybeFunctionType();
        boolean boolean52 = functionType50.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType50.getExtendedInterfaces();
        boolean boolean54 = functionType50.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType50.getPropertyType("NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot58 = functionType50.getOwnSlot("[10, 0]");
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node62.children();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry29.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType50, node62);
        boolean boolean65 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType27, (com.google.javascript.rhino.jstype.JSType) functionType64);
        com.google.javascript.rhino.Node node66 = functionType64.getParametersNode();
        boolean boolean67 = node66.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = objList25.set(53, (java.lang.Object) boolean67);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(jSTypeStaticSlot58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(nodeIterable63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01735");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        boolean boolean8 = node3.isNoSideEffectsCall();
        boolean boolean9 = node3.isLabelName();
        java.lang.String str10 = node3.getSourceFileName();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable11 = node3.getAncestors();
        node3.putIntProp(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(ancestorIterable11);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01736");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        boolean boolean10 = node3.isCatch();
        com.google.javascript.rhino.Node node11 = node3.getParent();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01737");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo2.getEnumParameterType();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo2.getParameterNames();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo2.getParameterNames();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList26 = functionType24.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        boolean boolean35 = node33.isQuotedString();
        com.google.javascript.rhino.Node node36 = node33.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry28.createFunctionType(jSType29, node36);
        boolean boolean38 = functionType37.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] { functionType24, functionType37 };
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry13.createUnionType(jSTypeArray39);
        boolean boolean41 = jSType40.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.children();
        boolean boolean50 = node48.isQuotedString();
        com.google.javascript.rhino.Node node51 = node48.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry43.createFunctionType(jSType44, node51);
        boolean boolean53 = functionType52.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType52.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType56 = functionType52.toMaybeFunctionType();
        boolean boolean57 = functionType52.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType58 = jSType40.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType52);
        boolean boolean59 = functionType52.isNoType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = strSet11.remove((java.lang.Object) functionType52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(functionTypeList26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01738");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.reverse();
        java.util.Iterator<java.lang.Object> objItor5 = objList2.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        boolean boolean8 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        boolean boolean17 = node15.isQuotedString();
        com.google.javascript.rhino.Node node18 = node15.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry10.createFunctionType(jSType11, node18);
        boolean boolean20 = functionType19.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList21 = functionType19.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType22 = functionType19.toMaybeFunctionType();
        boolean boolean24 = jSTypeRegistry7.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType22, "function ({1535407544}): {1535407544}");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        boolean boolean33 = node31.isQuotedString();
        com.google.javascript.rhino.Node node34 = node31.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry26.createFunctionType(jSType27, node34);
        boolean boolean36 = functionType35.isArrayType();
        boolean boolean37 = functionType35.isRegexpType();
        boolean boolean38 = functionType35.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry7.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType35);
        int int40 = functionType35.getPropertiesCount();
        boolean boolean41 = functionType35.isNoResolvedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = objList2.add((java.lang.Object) functionType35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(functionTypeList21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01739");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean23 = node20.isEquivalentTo(node22);
        boolean boolean24 = node20.isSwitch();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile25 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node20);
        java.lang.Object obj27 = node20.getProp(54);
        boolean boolean28 = node20.isTry();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        boolean boolean35 = node33.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = new com.google.javascript.rhino.JSTypeExpression(node33, "hi!");
        boolean boolean38 = node33.isCatch();
        java.lang.String str39 = node33.getQualifiedName();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("{1936444324}", (int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship44 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType29, node33, node43);
        node20.addChildrenToFront(node33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = node33.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 36 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(staticSourceFile25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01740");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean23 = node22.hasOneChild();
        node22.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable26 = node22.getAncestors();
        int int27 = node22.getLineno();
        boolean boolean28 = node22.isLocalResultCall();
        com.google.javascript.rhino.Node node29 = node18.useSourceInfoFromForTree(node22);
        com.google.javascript.rhino.Node node30 = assertionFunctionSpec1.getAssertedParam(node18);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int35 = node34.getSourceOffset();
        boolean boolean36 = node34.isDo();
        int int37 = node34.getChildCount();
        node34.setDouble((double) 45);
        com.google.javascript.rhino.Node node40 = node30.srcrefTree(node34);
        java.lang.String str41 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node34);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable42 = node34.getAncestors();
        com.google.javascript.rhino.Node node43 = node34.cloneNode();
        boolean boolean44 = node34.hasMoreThanOneChild();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ancestorIterable26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36 + "'", int27 == 36);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(ancestorIterable42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01741");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        java.util.Iterator<java.lang.Object> objItor5 = objList2.iterator();
        // The following exception was thrown during execution in test generation
        try {
            objList2.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01742");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(10, node5, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet22 = node21.getDirectives();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int27 = node26.getSourceOffset();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        node26.addChildrenToBack(node31);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node39 = node26.useSourceInfoIfMissingFrom(node37);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int42 = node26.getIndexOfChild(node41);
        com.google.javascript.rhino.Node node43 = node21.srcref(node26);
        namePosition0.setItem(node26);
        int int45 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node46 = namePosition0.getItem();
        com.google.javascript.rhino.Node node47 = namePosition0.getItem();
        com.google.javascript.rhino.Node node48 = namePosition0.getItem();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression56 = new com.google.javascript.rhino.JSTypeExpression(node52, "hi!");
        boolean boolean57 = node52.isCatch();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int62 = node61.getSourceOffset();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable67 = node66.children();
        node61.addChildrenToBack(node66);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int73 = node72.getSourceOffset();
        com.google.javascript.rhino.Node node74 = node61.useSourceInfoIfMissingFrom(node72);
        node74.setIsSyntheticBlock(false);
        node52.addChildrenToBack(node74);
        namePosition0.setItem(node52);
        boolean boolean79 = node52.isDelProp();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(nodeIterable67);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01743");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node.SideEffectFlags> sideEffectFlagsBuilder0 = com.google.common.collect.ImmutableList.builder();
        org.junit.Assert.assertNotNull(sideEffectFlagsBuilder0);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01744");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("function ({458767227}): {458767227}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01745");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.hasChildren();
        boolean boolean12 = node8.isEmpty();
        node8.putBooleanProp(147456, true);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node8.children();
        node8.putIntProp(42, 52);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeIterable16);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01746");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor7 = objList2.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(39, node12);
        boolean boolean14 = node13.isIf();
        node13.detachChildren();
        boolean boolean16 = node13.isVoid();
        boolean boolean17 = node13.isNE();
        int int18 = objList2.indexOf((java.lang.Object) node13);
        boolean boolean19 = objList2.isEmpty();
        int int20 = objList2.size();
        com.google.common.collect.ImmutableList<java.lang.Object> objList21 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList24 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream25 = objList24.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList26 = objList24.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        boolean boolean35 = node33.isQuotedString();
        com.google.javascript.rhino.Node node36 = node33.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry28.createFunctionType(jSType29, node36);
        boolean boolean38 = functionType37.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType37.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType41 = functionType37.toMaybeFunctionType();
        com.google.javascript.rhino.Node node42 = functionType37.getRootNode();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = functionType37.getParameters();
        int int44 = objList26.lastIndexOf((java.lang.Object) nodeIterable43);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = objList21.removeAll((java.util.Collection<java.lang.Object>) objList26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(objList21);
        org.junit.Assert.assertNotNull(objList24);
        org.junit.Assert.assertNotNull(objStream25);
        org.junit.Assert.assertNotNull(objList26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01747");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        java.lang.String str31 = functionType29.getDisplayName();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = functionType29.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType43.getParentScope();
        java.util.Set<java.lang.String> strSet45 = objectType44.getPropertyNames();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope46 = objectType44.getParentScope();
        functionType29.matchConstraint(objectType44);
        boolean boolean48 = functionType29.isNumber();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(jSTypeStaticScope46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01748");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        int int36 = objList2.lastIndexOf((java.lang.Object) (byte) 100);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList41 = com.google.common.collect.ImmutableList.of(jSDocInfo37, jSDocInfo38, jSDocInfo39, jSDocInfo40);
        boolean boolean43 = jSDocInfo39.hasParameterType("hi!");
        java.lang.String str44 = jSDocInfo39.getBlockDescription();
        java.lang.String str45 = jSDocInfo39.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList46 = jSDocInfo39.getImplementedInterfaces();
        jSDocInfo39.setDeprecated(false);
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection49 = jSDocInfo39.getMarkers();
        boolean boolean50 = objList2.equals((java.lang.Object) jSDocInfo39);
        com.google.common.collect.ImmutableList<java.lang.Object> objList54 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray55 = objList54.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor56 = objList54.listIterator();
        int int57 = objList54.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor59 = objList54.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(39, node64);
        boolean boolean66 = node65.isIf();
        node65.detachChildren();
        boolean boolean68 = node65.isVoid();
        boolean boolean69 = node65.isNE();
        int int70 = objList54.indexOf((java.lang.Object) node65);
        boolean boolean71 = objList54.isEmpty();
        int int72 = objList54.size();
        com.google.common.collect.ImmutableList<java.lang.Object> objList73 = objList54.asList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = objList2.addAll(2147483647, (java.util.Collection<java.lang.Object>) objList73);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(jSDocInfoList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(jSTypeExpressionList46);
        org.junit.Assert.assertNotNull(markerCollection49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objList54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(objItor59);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertNotNull(objList73);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01749");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope60 = null;
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry32.getType(jSTypeStaticScope60, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node72.children();
        boolean boolean74 = node72.isQuotedString();
        com.google.javascript.rhino.Node node75 = node72.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry67.createFunctionType(jSType68, node75);
        boolean boolean77 = functionType76.isArrayType();
        boolean boolean78 = jSType65.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = functionType26.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType76);
        boolean boolean80 = functionType76.isInterface();
        boolean boolean81 = functionType76.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType76.restrictByNotNullOrUndefined();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(jSType82);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01750");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.children();
        boolean boolean9 = node7.isQuotedString();
        com.google.javascript.rhino.Node node10 = node7.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry2.createFunctionType(jSType3, node10);
        boolean boolean12 = functionType11.isArrayType();
        boolean boolean13 = functionType11.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType11.getPropertyType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType26.toMaybeFunctionType();
        com.google.javascript.rhino.Node node31 = functionType26.getRootNode();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = functionType11.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType26);
        java.lang.String str33 = ternaryValue32.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue0.and(ternaryValue32);
        java.lang.String str35 = ternaryValue34.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSType15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "unknown" + "'", str33, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "unknown" + "'", str35, "unknown");
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01751");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str3 = objList2.toString();
        java.lang.Object[] objArray4 = objList2.toArray();
        java.util.Iterator<java.lang.Object> objItor5 = objList2.iterator();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet6.intersection(booleanLiteralSet7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        boolean boolean17 = node15.isQuotedString();
        com.google.javascript.rhino.Node node18 = node15.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry10.createFunctionType(jSType11, node18);
        boolean boolean20 = functionType19.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = functionType19.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet24 = booleanLiteralSet21.union(booleanLiteralSet23);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet25 = booleanLiteralSet6.union(booleanLiteralSet24);
        boolean boolean26 = objList2.contains((java.lang.Object) booleanLiteralSet25);
        boolean boolean27 = objList2.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Object> objList30 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray31 = objList30.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor32 = objList30.listIterator();
        boolean boolean34 = objList30.contains((java.lang.Object) (short) 10);
        java.util.Spliterator<java.lang.Object> objSpliterator35 = objList30.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = objList2.removeAll((java.util.Collection<java.lang.Object>) objList30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet24 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet24.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet25 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet25.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objList30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objSpliterator35);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01752");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType10.toMaybeFunctionType();
        boolean boolean16 = functionType14.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType14.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType14.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean31 = functionType14.isNullable();
        int int32 = functionType14.getMaxArguments();
        boolean boolean33 = functionType14.isNoObjectType();
        boolean boolean34 = functionType14.isReturnTypeInferred();
        boolean boolean35 = functionType14.isTemplateType();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = functionType14.getConstructor();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(functionType36);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01753");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.children();
        node4.setSourceFileForTesting("[10, 0]");
        node4.removeProp(36);
        boolean boolean10 = node4.isInc();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        boolean boolean15 = node14.isTypeOf();
        node4.addChildrenToFront(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean21 = node20.hasOneChild();
        node20.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable24 = node20.getAncestors();
        int int25 = node20.getChildCount();
        node20.setSourceFileForTesting("");
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node20);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isEmpty();
        boolean boolean35 = node32.hasChildren();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean40 = node39.hasOneChild();
        node39.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable43 = node39.getAncestors();
        int int44 = node39.getChildCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList49 = com.google.common.collect.ImmutableList.of(jSDocInfo45, jSDocInfo46, jSDocInfo47, jSDocInfo48);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression50 = jSDocInfo48.getReturnType();
        boolean boolean51 = jSDocInfo48.hasEnumParameterType();
        node39.setJSDocInfo(jSDocInfo48);
        boolean boolean53 = node32.isEquivalentToTyped(node39);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int58 = node57.getSourceOffset();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node62.children();
        node57.addChildrenToBack(node62);
        boolean boolean65 = node62.isGetElem();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int70 = node69.getSourceOffset();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable75 = node74.children();
        node69.addChildrenToBack(node74);
        node69.detachChildren();
        node69.setLineno(16);
        node62.addChildrenToFront(node69);
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = node69.getJSDocInfo();
        node69.removeProp(50);
        boolean boolean84 = node69.wasEmptyNode();
        boolean boolean85 = node69.wasEmptyNode();
        com.google.javascript.rhino.Node node86 = node69.getLastSibling();
        com.google.javascript.rhino.Node node87 = node39.srcref(node86);
        java.lang.Object obj89 = node39.getProp(16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(54, node14, node20, node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ancestorIterable24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(ancestorIterable43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(jSDocInfoList49);
        org.junit.Assert.assertNull(jSTypeExpression50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(nodeIterable63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(nodeIterable75);
        org.junit.Assert.assertNull(jSDocInfo81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01754");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        java.lang.String str5 = node3.getQualifiedName();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        node9.detachChildren();
        node9.setLineno(16);
        boolean boolean20 = node9.isSwitch();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(39, node25);
        boolean boolean27 = node26.isIf();
        node26.detachChildren();
        boolean boolean29 = node9.hasChild(node26);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = null;
        node9.setStaticSourceFile(staticSourceFile30);
        int int32 = node3.getIndexOfChild(node9);
        java.lang.String str36 = node9.toString(true, true, true);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node9);
        boolean boolean38 = node9.isNot();
        node9.setOptionalArg(true);
        com.google.javascript.rhino.InputId inputId41 = com.google.javascript.jscomp.NodeUtil.getInputId(node9);
        boolean boolean42 = node9.isAnd();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "NUMBER 0.0 16" + "'", str36, "NUMBER 0.0 16");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01755");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node7 = jSTypeRegistry1.createParameters(jSTypeArray6);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node10.setCharno((int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry14.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node35 = node32.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry27.createFunctionType(jSType28, node35);
        boolean boolean37 = functionType36.isArrayType();
        java.lang.String str38 = functionType36.toAnnotationString();
        boolean boolean39 = functionType36.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry14.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType36, "NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry1.createObjectType("function ({1839678788}): {1839678788}", node10, (com.google.javascript.rhino.jstype.ObjectType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        boolean boolean51 = node49.isQuotedString();
        com.google.javascript.rhino.Node node52 = node49.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry44.createFunctionType(jSType45, node52);
        boolean boolean54 = functionType53.isArrayType();
        boolean boolean55 = functionType53.isRegexpType();
        boolean boolean57 = functionType53.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node58 = functionType53.getRootNode();
        java.lang.String str59 = functionType53.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean61 = functionType53.matchesInt32Context();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertNull(jSType25);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "function (...[?]): ?" + "'", str38, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01756");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.clearSideEffectFlags();
        int int2 = sideEffectFlags0.valueOf();
        sideEffectFlags0.setThrows();
        sideEffectFlags0.setReturnsTainted();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01757");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = node1.getJSDocInfo();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node6 = node4.getAncestor(47);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        node4.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node12 = node1.useSourceInfoFrom(node10);
        node12.setWasEmptyNode(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node12.toString(true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSDocInfo2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01758");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType27.restrictByNotNullOrUndefined();
        boolean boolean30 = jSType29.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        boolean boolean60 = jSType59.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType71.toMaybeFunctionType();
        boolean boolean76 = functionType71.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSType59.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean78 = jSType29.canAssignTo(jSType77);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair79 = functionType10.getTypesUnderShallowInequality(jSType29);
        boolean boolean80 = functionType10.matchesObjectContext();
        int int81 = functionType10.getPropertiesCount();
        boolean boolean82 = functionType10.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = functionType10.getTypeOfThis();
        java.lang.String str84 = objectType83.toDebugHashCodeString();
        boolean boolean85 = objectType83.isString();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(typePair79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectType83);
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "{1649938787}" + "'", str84, "{1649938787}");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01759");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node3.getAncestors();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = node3.hasChild(node9);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        node14.setLength(0);
        boolean boolean19 = node14.isLabelName();
        com.google.javascript.rhino.Node node20 = node3.srcrefTree(node14);
        boolean boolean21 = node3.isDebugger();
        int int22 = node3.getSideEffectFlags();
        int int23 = node3.getLineno();
        java.lang.String str24 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node3);
        boolean boolean25 = node3.isEmpty();
        boolean boolean26 = node3.isFunction();
        boolean boolean27 = node3.isIn();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ancestorIterable8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36 + "'", int23 == 36);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01760");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        node16.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(39, node23);
        com.google.javascript.rhino.Node node25 = node16.srcref(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int45 = node29.getIndexOfChild(node44);
        com.google.javascript.rhino.Node node46 = node16.srcref(node44);
        boolean boolean47 = node46.isVoid();
        boolean boolean48 = node46.isWhile();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01761");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType10.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = functionType10.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType25.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType29 = functionType25.toMaybeFunctionType();
        boolean boolean31 = functionType29.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = functionType29.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType29.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        boolean boolean45 = functionType29.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean46 = functionType29.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType29.getPropertyType("");
        boolean boolean49 = functionType29.isOrdinaryFunction();
        boolean boolean50 = functionType29.matchesNumberContext();
        com.google.javascript.rhino.Node node51 = functionType29.getRootNode();
        boolean boolean52 = functionType29.isEnumElementType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType29.getAllExtendedInterfaces();
        java.lang.String str54 = functionType29.getReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = functionType29.getConstructor();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType10.forceResolve(errorReporter14, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType55);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(functionType55);
        org.junit.Assert.assertNotNull(jSType56);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01762");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "JSDocInfo", "", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        int int7 = strSet5.size();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int13 = node12.getSourceOffset();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        node12.addChildrenToBack(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node25 = node12.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node12, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet29 = node28.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node28.getAncestors();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean35 = node34.hasOneChild();
        node34.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable38 = node34.getAncestors();
        int int39 = node34.getChildCount();
        node28.addChildrenToFront(node34);
        node34.setDouble((double) (byte) -1);
        boolean boolean43 = strSet5.equals((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        java.lang.Object[] objArray56 = objList54.toArray();
        java.util.stream.Stream<java.lang.Object> objStream57 = objList54.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList60 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray61 = objList60.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor62 = objList60.listIterator();
        boolean boolean64 = objList60.contains((java.lang.Object) (short) 10);
        java.lang.Object obj65 = null;
        boolean boolean66 = objList60.equals(obj65);
        java.lang.String str67 = objList60.toString();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node71.children();
        boolean boolean73 = node71.isQuotedString();
        node71.setLength(0);
        boolean boolean76 = node71.isScript();
        boolean boolean77 = node71.hasChildren();
        int int78 = objList60.lastIndexOf((java.lang.Object) node71);
        boolean boolean79 = objList54.addAll((java.util.Collection<java.lang.Object>) objList60);
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean81 = jSDocInfo80.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression82 = jSDocInfo80.getEnumParameterType();
        boolean boolean83 = jSDocInfo80.isExterns();
        boolean boolean84 = jSDocInfo80.isIdGenerator();
        boolean boolean85 = jSDocInfo80.isDeprecated();
        com.google.common.collect.ImmutableList<java.lang.String> strList86 = jSDocInfo80.getTemplateTypeNames();
        boolean boolean87 = jSDocInfo80.isHidden();
        boolean boolean88 = objList54.equals((java.lang.Object) boolean87);
        com.google.common.collect.ImmutableList<java.lang.Object> objList91 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray92 = objList91.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor93 = objList91.listIterator();
        boolean boolean95 = objList91.contains((java.lang.Object) (short) 10);
        boolean boolean96 = objList54.addAll((java.util.Collection<java.lang.Object>) objList91);
        com.google.common.collect.ImmutableList<java.lang.Object> objList97 = objList91.asList();
        boolean boolean98 = strSet5.removeAll((java.util.Collection<java.lang.Object>) objList91);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(ancestorIterable38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream57);
        org.junit.Assert.assertNotNull(objList60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[10, 0]" + "'", str67, "[10, 0]");
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(jSTypeExpression82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objList91);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(objList97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01763");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        boolean boolean4 = jSTypeRegistry2.isForwardDeclaredType("function ({484174423}): {484174423}");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01764");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(11);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01765");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable12 = functionType10.getCtorExtendedInterfaces();
        boolean boolean13 = functionType10.isNativeObjectType();
        java.lang.String str14 = functionType10.getReferenceName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(objectTypeIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01766");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        node16.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(39, node23);
        com.google.javascript.rhino.Node node25 = node16.srcref(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node43 = node24.clonePropsFrom(node42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.children();
        node48.setSourceFileForTesting("[10, 0]");
        node48.setVarArgs(true);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        node57.setLength(0);
        boolean boolean62 = node57.isVar();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int67 = node66.getSourceOffset();
        boolean boolean68 = node66.isDo();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int73 = node72.getSourceOffset();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable78 = node77.children();
        node72.addChildrenToBack(node77);
        node72.detachChildren();
        node72.setLineno(16);
        boolean boolean83 = node72.isSwitch();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node(39, node88);
        boolean boolean90 = node89.isIf();
        node89.detachChildren();
        boolean boolean92 = node72.hasChild(node89);
        boolean boolean93 = node72.isDebugger();
        com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node(52, node48, node57, node66, node72, (int) '#', (-1));
        com.google.javascript.rhino.Node node97 = node43.clonePropsFrom(node48);
        boolean boolean98 = node43.isThis();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(nodeIterable78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01767");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType jSType4 = jSTypeRegistry2.getType("hi!");
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node8 = jSTypeRegistry2.createParameters(jSTypeArray7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node15.children();
        boolean boolean17 = node15.isQuotedString();
        com.google.javascript.rhino.Node node18 = node15.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry10.createFunctionType(jSType11, node18);
        boolean boolean20 = functionType19.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType19.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType23 = functionType19.toMaybeFunctionType();
        boolean boolean25 = functionType23.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = functionType23.getExtendedInterfaces();
        boolean boolean27 = functionType23.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType23.getPropertyType("NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot31 = functionType23.getOwnSlot("[10, 0]");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType23, node35);
        boolean boolean38 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType0, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node39 = functionType37.getParametersNode();
        boolean boolean40 = node39.isIn();
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNull(jSTypeStaticSlot31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01768");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType10.getParentScope();
        boolean boolean12 = functionType10.isNoResolvedType();
        com.google.javascript.rhino.Node node13 = functionType10.getParametersNode();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.unboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType25.restrictByNotNullOrUndefined();
        boolean boolean28 = functionType25.isOrdinaryFunction();
        functionType10.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType25);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType10.getConstructor();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(functionType30);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01769");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        int int14 = objList10.size();
        boolean boolean15 = objList10.isEmpty();
        java.lang.Object[] objArray16 = objList10.toArray();
        java.util.ListIterator<java.lang.Object> objItor18 = objList10.listIterator((int) (short) 1);
        java.lang.Object[] objArray28 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList29 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList29, objArray28);
        java.lang.Object[] objArray31 = objList29.toArray();
        java.util.stream.Stream<java.lang.Object> objStream32 = objList29.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray36 = objList35.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor37 = objList35.listIterator();
        boolean boolean39 = objList35.contains((java.lang.Object) (short) 10);
        java.lang.Object obj40 = null;
        boolean boolean41 = objList35.equals(obj40);
        java.lang.String str42 = objList35.toString();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        boolean boolean48 = node46.isQuotedString();
        node46.setLength(0);
        boolean boolean51 = node46.isScript();
        boolean boolean52 = node46.hasChildren();
        int int53 = objList35.lastIndexOf((java.lang.Object) node46);
        boolean boolean54 = objList29.addAll((java.util.Collection<java.lang.Object>) objList35);
        com.google.common.collect.ImmutableList<java.lang.Object> objList57 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray58 = objList57.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor59 = objList57.listIterator();
        boolean boolean61 = objList57.contains((java.lang.Object) (short) 10);
        java.lang.Object obj62 = null;
        boolean boolean63 = objList57.equals(obj62);
        com.google.common.collect.ImmutableList<java.lang.Object> objList66 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray67 = objList66.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor68 = objList66.listIterator();
        int int69 = objList66.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor71 = objList66.listIterator((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Object> objList74 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray75 = objList74.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor76 = objList74.listIterator();
        int int77 = objList74.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor79 = objList74.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(39, node84);
        boolean boolean86 = node85.isIf();
        node85.detachChildren();
        boolean boolean88 = node85.isVoid();
        boolean boolean89 = node85.isNE();
        int int90 = objList74.indexOf((java.lang.Object) node85);
        boolean boolean91 = objList74.isEmpty();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Object>> objListList92 = com.google.common.collect.ImmutableList.of(objList35, objList57, objList66, objList74);
        boolean boolean93 = objList10.retainAll((java.util.Collection<java.lang.Object>) objList35);
        java.lang.String str94 = objList35.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objItor18);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream32);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[10, 0]" + "'", str42, "[10, 0]");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objList57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objList66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(objItor71);
        org.junit.Assert.assertNotNull(objList74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2 + "'", int77 == 2);
        org.junit.Assert.assertNotNull(objItor79);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objListList92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "[10, 0]" + "'", str94, "[10, 0]");
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01770");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet26 = functionType24.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType24.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType24.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType24.restrictByNotNullOrUndefined();
        boolean boolean30 = jSTypeRegistry1.declareType("function ({1035943170}): {1035943170}", (com.google.javascript.rhino.jstype.JSType) functionType24);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry1.getType("function ({930192739}): {930192739}");
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean37 = node36.isSwitch();
        com.google.common.collect.ImmutableList<java.lang.Object> objList40 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray41 = objList40.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor42 = objList40.listIterator();
        int int43 = objList40.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor45 = objList40.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(39, node50);
        boolean boolean52 = node51.isIf();
        node51.detachChildren();
        boolean boolean54 = node51.isVoid();
        boolean boolean55 = node51.isNE();
        int int56 = objList40.indexOf((java.lang.Object) node51);
        com.google.javascript.rhino.Node node57 = node36.useSourceInfoIfMissingFrom(node51);
        boolean boolean58 = node51.isGetProp();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry1.createInterfaceType("", node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet26 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet26.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objList40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(objItor45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01771");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        jSTypeRegistry1.clearTemplateTypeNames();
        jSTypeRegistry1.incrementGeneration();
        jSTypeRegistry1.clearTemplateTypeNames();
        boolean boolean33 = jSTypeRegistry1.hasNamespace("");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01772");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo1.getTypedefType();
        boolean boolean6 = jSDocInfo1.hasType();
        boolean boolean7 = jSDocInfo1.hasThisType();
        jSDocInfo1.addSuppression("JSDocInfo");
        boolean boolean10 = jSDocInfo1.hasType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01773");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        node14.addChildrenToBack(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node27 = node14.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node14, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean33 = node30.isEquivalentTo(node32);
        int int34 = objList2.lastIndexOf((java.lang.Object) node30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = objList2.get(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (42) must be less than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01774");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.removeProp(36);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        java.lang.String[] strArray25 = new java.lang.String[] { "NUMBER 0.0 36", "function ({1265812580}): {1265812580}", "function ({1265812580}): {1265812580}", "{1936444324}", "Not declared as a type name", "Not declared as a type name", "function ({1704073426}): {1704073426}", "[10, 0]", "", "function ({1265812580}): {1265812580}", "JSDocInfo", "{1936444324}", "", "java.io.IOException: ", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node3.setDirectives((java.util.Set<java.lang.String>) strSet26);
        boolean boolean29 = strSet26.isEmpty();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList40 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList40, objArray39);
        java.lang.Object[] objArray42 = objList40.toArray();
        java.util.stream.Stream<java.lang.Object> objStream43 = objList40.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList46 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objList46.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor48 = objList46.listIterator();
        boolean boolean50 = objList46.contains((java.lang.Object) (short) 10);
        java.lang.Object obj51 = null;
        boolean boolean52 = objList46.equals(obj51);
        java.lang.String str53 = objList46.toString();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        boolean boolean59 = node57.isQuotedString();
        node57.setLength(0);
        boolean boolean62 = node57.isScript();
        boolean boolean63 = node57.hasChildren();
        int int64 = objList46.lastIndexOf((java.lang.Object) node57);
        boolean boolean65 = objList40.addAll((java.util.Collection<java.lang.Object>) objList46);
        com.google.common.collect.ImmutableList<java.lang.Object> objList68 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray69 = objList68.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor70 = objList68.listIterator();
        boolean boolean72 = objList68.contains((java.lang.Object) (short) 10);
        java.lang.Object obj73 = null;
        boolean boolean74 = objList68.equals(obj73);
        java.lang.String str75 = objList68.toString();
        java.lang.Object[] objArray85 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList86 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList86, objArray85);
        java.lang.Object[] objArray88 = objList86.toArray();
        java.util.stream.Stream<java.lang.Object> objStream89 = objList86.parallelStream();
        int int90 = objList86.size();
        boolean boolean91 = objList68.containsAll((java.util.Collection<java.lang.Object>) objList86);
        java.util.ListIterator<java.lang.Object> objItor92 = objList68.listIterator();
        boolean boolean93 = objList40.removeAll((java.util.Collection<java.lang.Object>) objList68);
        boolean boolean94 = strSet26.containsAll((java.util.Collection<java.lang.Object>) objList68);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream43);
        org.junit.Assert.assertNotNull(objList46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[10, 0]" + "'", str53, "[10, 0]");
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objList68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[10, 0]" + "'", str75, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 9 + "'", int90 == 9);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objItor92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01775");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo2.getParameterNames();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node13.addChildrenToBack(node18);
        node13.detachChildren();
        node13.setLineno(16);
        boolean boolean24 = node13.isSwitch();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(39, node29);
        boolean boolean31 = node30.isIf();
        node30.detachChildren();
        boolean boolean33 = node13.hasChild(node30);
        boolean boolean34 = node13.isDebugger();
        boolean boolean35 = node13.isFalse();
        boolean boolean36 = node13.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList41 = com.google.common.collect.ImmutableList.of(jSDocInfo37, jSDocInfo38, jSDocInfo39, jSDocInfo40);
        boolean boolean43 = jSDocInfo39.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet44 = jSDocInfo39.getSuppressions();
        node13.setDirectives(strSet44);
        com.google.common.collect.ImmutableList<java.lang.Object> objList48 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream49 = objList48.parallelStream();
        boolean boolean50 = strSet44.retainAll((java.util.Collection<java.lang.Object>) objList48);
        boolean boolean51 = strSet9.containsAll((java.util.Collection<java.lang.Object>) objList48);
        int int52 = objList48.size();
        com.google.common.collect.ImmutableList<java.lang.Object> objList55 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str56 = objList55.toString();
        java.lang.Object[] objArray57 = objList55.toArray();
        java.util.Iterator<java.lang.Object> objItor58 = objList55.iterator();
        boolean boolean59 = objList48.containsAll((java.util.Collection<java.lang.Object>) objList55);
        java.lang.Object[] objArray60 = objList55.toArray();
        java.util.ArrayList[] arrayListArray62 = new java.util.ArrayList[0];
        @SuppressWarnings("unchecked")
        java.util.ArrayList<java.lang.Object>[] objListArray63 = (java.util.ArrayList<java.lang.Object>[]) arrayListArray62;
        com.google.common.collect.ImmutableList<java.util.ArrayList<java.lang.Object>> objListList64 = com.google.common.collect.ImmutableList.copyOf(objListArray63);
        com.google.common.collect.ImmutableList<java.util.List<java.lang.Object>> objListList65 = com.google.common.collect.ImmutableList.copyOf((java.util.List<java.lang.Object>[]) objListArray63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<java.lang.Object>[] objIterableArray66 = objList55.toArray((java.lang.Iterable<java.lang.Object>[]) objListArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertNotNull(objStream49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(objList55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[10, 0]" + "'", str56, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[10, 0]");
        org.junit.Assert.assertNotNull(arrayListArray62);
        org.junit.Assert.assertNotNull(objListArray63);
        org.junit.Assert.assertNotNull(objListList64);
        org.junit.Assert.assertNotNull(objListList65);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01776");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean6 = node5.hasOneChild();
        node5.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable9 = node5.getAncestors();
        boolean boolean10 = node5.isNoSideEffectsCall();
        boolean boolean11 = node5.isFromExterns();
        boolean boolean12 = node5.isLabel();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((-1), node1, node5, node13, (int) (byte) 10, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ancestorIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01777");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean23 = node20.isEquivalentTo(node22);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 36", 54, 49);
        com.google.javascript.rhino.Node node28 = node20.useSourceInfoIfMissingFromForTree(node27);
        node27.putBooleanProp((int) (byte) 100, false);
        boolean boolean32 = node27.isNot();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        boolean boolean38 = node36.isDo();
        int int39 = node36.getChildCount();
        boolean boolean40 = node36.isTrue();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int46 = node45.getSourceOffset();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        node45.addChildrenToBack(node50);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int57 = node56.getSourceOffset();
        com.google.javascript.rhino.Node node58 = node45.useSourceInfoIfMissingFrom(node56);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node45, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean64 = node61.isEquivalentTo(node63);
        boolean boolean65 = node61.isSwitch();
        com.google.javascript.rhino.InputId inputId67 = new com.google.javascript.rhino.InputId("hi!");
        node61.setInputId(inputId67);
        java.lang.String str69 = inputId67.toString();
        java.lang.String str70 = inputId67.getIdName();
        java.lang.String str71 = inputId67.toString();
        node36.setInputId(inputId67);
        node27.setInputId(inputId67);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "InputId: hi!" + "'", str69, "InputId: hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "InputId: hi!" + "'", str71, "InputId: hi!");
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01778");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType43 = functionType39.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType39);
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType56.restrictByNotNullOrUndefined();
        boolean boolean59 = functionType56.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType56, "function ({1160807699}): {1160807699}", "hi!", (int) (short) -1, 32);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative65 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry1.getNativeType(jSTypeNative65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType64);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01779");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.getPropertyType("InputId: hi!");
        boolean boolean30 = functionType10.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean31 = functionType10.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        boolean boolean45 = functionType42.isPropertyTypeInferred("JSDocInfo");
        boolean boolean47 = functionType42.hasOwnProperty("");
        com.google.javascript.rhino.Node node48 = functionType42.getParametersNode();
        boolean boolean49 = functionType42.hasCachedValues();
        functionType10.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable51 = functionType10.getAllImplementedInterfaces();
        boolean boolean52 = functionType10.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        boolean boolean64 = functionType63.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType63.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType67 = functionType63.toMaybeFunctionType();
        boolean boolean69 = functionType67.removeProperty("hi!");
        boolean boolean70 = functionType67.matchesStringContext();
        functionType10.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType67);
        boolean boolean73 = functionType10.hasProperty("function ({132632202}): {132632202}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01780");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        node17.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(39, node24);
        com.google.javascript.rhino.Node node26 = node17.srcref(node25);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        node30.addChildrenToBack(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node43 = node30.useSourceInfoIfMissingFrom(node41);
        com.google.javascript.rhino.Node node44 = node25.clonePropsFrom(node43);
        boolean boolean45 = node43.isAnd();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node47);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0, node43, node47, 2147483647, 45);
        boolean boolean52 = node51.isStringKey();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01781");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        com.google.javascript.rhino.Node node45 = node42.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry37.createFunctionType(jSType38, node45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node55.children();
        boolean boolean57 = node55.isQuotedString();
        com.google.javascript.rhino.Node node58 = node55.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry50.createFunctionType(jSType51, node58);
        boolean boolean60 = functionType59.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList61 = functionType59.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable69 = node68.children();
        boolean boolean70 = node68.isQuotedString();
        com.google.javascript.rhino.Node node71 = node68.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry63.createFunctionType(jSType64, node71);
        boolean boolean73 = functionType72.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] { functionType59, functionType72 };
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry48.createUnionType(jSTypeArray74);
        com.google.javascript.rhino.Node node76 = jSTypeRegistry37.createOptionalParameters(jSTypeArray74);
        com.google.javascript.rhino.Node node77 = jSTypeRegistry1.createParameters(jSTypeArray74);
        boolean boolean78 = node77.isTypeOf();
        int int80 = node77.getIntProp((int) (byte) 1);
        int int81 = node77.getSourceOffset();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(errorReporter35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(functionTypeList61);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeIterable69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01782");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.children();
        boolean boolean15 = node13.isQuotedString();
        com.google.javascript.rhino.Node node16 = node13.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry8.createFunctionType(jSType9, node16);
        boolean boolean18 = functionType17.isArrayType();
        boolean boolean19 = functionType17.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType17.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType17.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        boolean boolean30 = node28.isQuotedString();
        com.google.javascript.rhino.Node node31 = node28.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry23.createFunctionType(jSType24, node31);
        boolean boolean33 = functionType32.isArrayType();
        boolean boolean34 = functionType32.isRegexpType();
        boolean boolean36 = functionType32.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean37 = functionType17.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean38 = functionType32.hasImplementedInterfaces();
        boolean boolean39 = functionType32.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        boolean boolean48 = node46.isQuotedString();
        com.google.javascript.rhino.Node node49 = node46.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry41.createFunctionType(jSType42, node49);
        boolean boolean51 = functionType50.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType50.restrictByNotNullOrUndefined();
        boolean boolean53 = functionType32.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType50);
        boolean boolean55 = functionType32.hasOwnProperty("{1936444324}");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType32.toObjectType();
        boolean boolean57 = functionType32.isNullType();
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType32, "", "BITXOR", 47, 4);
        boolean boolean63 = jSType62.isOrdinaryFunction();
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(errorReporter6);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01783");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = functionType10.getOwnSlot("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node23.children();
        boolean boolean25 = node23.isQuotedString();
        com.google.javascript.rhino.Node node26 = node23.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry18.createFunctionType(jSType19, node26);
        boolean boolean28 = functionType27.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType27.restrictByNotNullOrUndefined();
        boolean boolean30 = jSType29.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList45 = functionType43.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] { functionType43, functionType56 };
        com.google.javascript.rhino.jstype.JSType jSType59 = jSTypeRegistry32.createUnionType(jSTypeArray58);
        boolean boolean60 = jSType59.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType71.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType75 = functionType71.toMaybeFunctionType();
        boolean boolean76 = functionType71.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSType59.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean78 = jSType29.canAssignTo(jSType77);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair79 = functionType10.getTypesUnderShallowInequality(jSType29);
        boolean boolean80 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot82 = functionType10.getOwnSlot("function ({1458513118}): {1458513118}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionTypeList45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(typePair79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot82);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01784");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean15 = functionType10.hasOwnProperty("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = functionType10.getJSDocInfo();
        boolean boolean18 = functionType10.isPropertyInExterns("function (...[?]): ?");
        boolean boolean19 = functionType10.matchesUint32Context();
        boolean boolean20 = functionType10.isNativeObjectType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSDocInfo16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01785");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        boolean boolean50 = functionType48.isPropertyTypeDeclared("");
        boolean boolean52 = functionType48.isPropertyInExterns("JSDocInfo");
        boolean boolean53 = functionType48.isRecordType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable61 = node60.children();
        boolean boolean62 = node60.isQuotedString();
        com.google.javascript.rhino.Node node63 = node60.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry55.createFunctionType(jSType56, node63);
        boolean boolean65 = functionType64.isArrayType();
        boolean boolean66 = functionType64.isRegexpType();
        boolean boolean68 = functionType64.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node69 = functionType64.getRootNode();
        boolean boolean70 = functionType64.isParameterizedType();
        functionType48.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType64);
        com.google.javascript.rhino.jstype.TemplateType templateType72 = functionType48.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry1.createObjectType("NUMBER 0.0 36 [input_id: InputId: hi!]", node37, (com.google.javascript.rhino.jstype.ObjectType) functionType48);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative75 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(errorReporter35);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(nodeIterable61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(templateType72);
        org.junit.Assert.assertNotNull(objectType73);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01786");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean13 = functionType10.isPropertyTypeInferred("JSDocInfo");
        boolean boolean14 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType10.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType10.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = functionType10.getOwnSlot("function ({1873536480}): {1873536480}");
        boolean boolean20 = functionType10.isPropertyTypeInferred("function ({172131644}): {172131644}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01787");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(10, node5, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet22 = node21.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable23 = node21.getAncestors();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean28 = node27.hasOneChild();
        node27.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable31 = node27.getAncestors();
        int int32 = node27.getChildCount();
        node21.addChildrenToFront(node27);
        com.google.javascript.rhino.Node node35 = node27.getChildAtIndex(0);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int40 = node39.getSourceOffset();
        boolean boolean41 = node39.isDo();
        node27.addChildToFront(node39);
        boolean boolean43 = node39.isAssign();
        boolean boolean44 = node39.isEmpty();
        node39.addSuppression("function ({1688808893}): {1688808893}");
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node39.siblings();
        namePosition0.setItem(node39);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags49 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags49.clearSideEffectFlags();
        int int51 = sideEffectFlags49.valueOf();
        // The following exception was thrown during execution in test generation
        try {
            node39.setSideEffectFlags(sideEffectFlags49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertNotNull(ancestorIterable23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(ancestorIterable31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01788");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        boolean boolean17 = node14.isGetElem();
        int int18 = node14.getType();
        boolean boolean19 = objList2.equals((java.lang.Object) node14);
        boolean boolean20 = objList2.isEmpty();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor21 = objList2.listIterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList24 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray25 = objList24.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor26 = objList24.listIterator();
        boolean boolean28 = objList24.contains((java.lang.Object) (short) 10);
        java.lang.Object obj29 = null;
        boolean boolean30 = objList24.equals(obj29);
        java.lang.String str31 = objList24.toString();
        java.lang.Object[] objArray41 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList42 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList42, objArray41);
        java.lang.Object[] objArray44 = objList42.toArray();
        java.util.stream.Stream<java.lang.Object> objStream45 = objList42.parallelStream();
        int int46 = objList42.size();
        boolean boolean47 = objList24.containsAll((java.util.Collection<java.lang.Object>) objList42);
        java.util.ListIterator<java.lang.Object> objItor48 = objList24.listIterator();
        boolean boolean49 = objList24.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = objList2.remove((java.lang.Object) boolean49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objItor21);
        org.junit.Assert.assertNotNull(objList24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[10, 0]" + "'", str31, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objItor48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01789");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        com.google.javascript.rhino.Node node13 = functionType10.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = functionType10.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        boolean boolean28 = functionType25.isPropertyTypeInferred("JSDocInfo");
        boolean boolean30 = functionType25.hasOwnProperty("");
        com.google.javascript.rhino.Node node31 = functionType25.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        boolean boolean44 = functionType42.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType42.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType42.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = functionType25.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType42);
        boolean boolean48 = functionType10.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType42);
        boolean boolean50 = functionType10.hasOwnProperty("function ({1265812580}): {1265812580}");
        java.util.Set<java.lang.String> strSet51 = functionType10.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        boolean boolean60 = node58.isQuotedString();
        com.google.javascript.rhino.Node node61 = node58.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry53.createFunctionType(jSType54, node61);
        boolean boolean63 = functionType62.isArrayType();
        boolean boolean64 = functionType62.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType62.getPropertyType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable74 = node73.children();
        boolean boolean75 = node73.isQuotedString();
        com.google.javascript.rhino.Node node76 = node73.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry68.createFunctionType(jSType69, node76);
        boolean boolean78 = functionType77.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType77.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType77.toMaybeFunctionType();
        com.google.javascript.rhino.Node node82 = functionType77.getRootNode();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue83 = functionType62.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.ObjectType objectType84 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean85 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) objectType84);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(nodeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNotNull(ternaryValue83);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01790");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.lang.String str25 = functionType23.toAnnotationString();
        boolean boolean26 = functionType23.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType23, "NUMBER 0.0 36");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = functionType40.toMaybeFunctionType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection42 = jSTypeRegistry1.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        boolean boolean44 = functionType41.hasProperty("NUMBER 0.0 16");
        com.google.javascript.rhino.jstype.FunctionType functionType45 = functionType41.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = functionType45.isNoObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(functionTypeCollection42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(functionType45);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01791");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType10.getPropertyType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType25.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType29 = functionType25.toMaybeFunctionType();
        com.google.javascript.rhino.Node node30 = functionType25.getRootNode();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = functionType10.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType25);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType10);
        boolean boolean34 = objectType32.isPropertyInExterns("function ({1012611201}): {1012611201}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = objectType32.getOwnPropertyJSDocInfo("STRING NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSDocInfo36);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01792");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        boolean boolean10 = node8.isQuotedString();
        com.google.javascript.rhino.Node node11 = node8.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry3.createFunctionType(jSType4, node11);
        boolean boolean13 = functionType12.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList14 = functionType12.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] { functionType12, functionType25 };
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry1.createUnionType(jSTypeArray27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry1.getType(jSTypeStaticScope29, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        com.google.javascript.rhino.Node node47 = node44.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry39.createFunctionType(jSType40, node47);
        boolean boolean50 = functionType48.isPropertyTypeDeclared("");
        boolean boolean52 = functionType48.isPropertyInExterns("JSDocInfo");
        boolean boolean53 = functionType48.isRecordType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable61 = node60.children();
        boolean boolean62 = node60.isQuotedString();
        com.google.javascript.rhino.Node node63 = node60.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry55.createFunctionType(jSType56, node63);
        boolean boolean65 = functionType64.isArrayType();
        boolean boolean66 = functionType64.isRegexpType();
        boolean boolean68 = functionType64.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node69 = functionType64.getRootNode();
        boolean boolean70 = functionType64.isParameterizedType();
        functionType48.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType64);
        com.google.javascript.rhino.jstype.TemplateType templateType72 = functionType48.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry1.createObjectType("NUMBER 0.0 36 [input_id: InputId: hi!]", node37, (com.google.javascript.rhino.jstype.ObjectType) functionType48);
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType48.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node81.children();
        boolean boolean83 = node81.isQuotedString();
        com.google.javascript.rhino.Node node84 = node81.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry76.createFunctionType(jSType77, node84);
        boolean boolean86 = functionType85.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList87 = functionType85.getSubTypes();
        com.google.javascript.rhino.Node node88 = functionType85.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = functionType85.getJSDocInfo();
        boolean boolean90 = functionType85.matchesStringContext();
        boolean boolean91 = functionType85.isParameterizedType();
        boolean boolean92 = functionType85.matchesInt32Context();
        com.google.javascript.rhino.jstype.JSType jSType93 = functionType48.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean94 = jSType93.matchesNumberContext();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(functionTypeList14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNull(errorReporter35);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(nodeIterable61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(templateType72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(nodeIterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(functionTypeList87);
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertNull(jSDocInfo89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01793");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        boolean boolean20 = node18.isQuotedString();
        com.google.javascript.rhino.Node node21 = node18.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry13.createFunctionType(jSType14, node21);
        boolean boolean23 = functionType22.isArrayType();
        boolean boolean24 = functionType22.isRegexpType();
        jSTypeRegistry1.registerPropertyOnType("function (...[?]): ?", (com.google.javascript.rhino.jstype.JSType) functionType22);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode26 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry1.setResolveMode(resolveMode26);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        boolean boolean40 = functionType38.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType38.getPropertyType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        boolean boolean51 = node49.isQuotedString();
        com.google.javascript.rhino.Node node52 = node49.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry44.createFunctionType(jSType45, node52);
        boolean boolean54 = functionType53.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType53.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType53.toMaybeFunctionType();
        com.google.javascript.rhino.Node node58 = functionType53.getRootNode();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = functionType38.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = functionType38.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable69 = node68.children();
        boolean boolean70 = node68.isQuotedString();
        com.google.javascript.rhino.Node node71 = node68.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry63.createFunctionType(jSType64, node71);
        com.google.javascript.rhino.jstype.ObjectType objectType73 = functionType72.getParentScope();
        java.util.Set<java.lang.String> strSet74 = objectType73.getPropertyNames();
        boolean boolean75 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType38, (com.google.javascript.rhino.jstype.JSType) objectType73);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType38.getTypeOfThis();
        java.lang.Iterable iterable77 = functionType38.getCtorImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType78 = functionType38.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + resolveMode26 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode26.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeIterable69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertNotNull(iterable77);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01794");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        com.google.javascript.rhino.Node node13 = functionType10.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = functionType10.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        boolean boolean28 = functionType25.isPropertyTypeInferred("JSDocInfo");
        boolean boolean30 = functionType25.hasOwnProperty("");
        com.google.javascript.rhino.Node node31 = functionType25.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        boolean boolean44 = functionType42.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType42.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType42.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = functionType25.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType42);
        boolean boolean48 = functionType10.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType42.collapseUnion();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        boolean boolean58 = node56.isQuotedString();
        com.google.javascript.rhino.Node node59 = node56.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry51.createFunctionType(jSType52, node59);
        boolean boolean61 = functionType60.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType60.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType64 = functionType60.toMaybeFunctionType();
        boolean boolean66 = functionType64.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = functionType64.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType64.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable76 = node75.children();
        boolean boolean77 = node75.isQuotedString();
        com.google.javascript.rhino.Node node78 = node75.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry70.createFunctionType(jSType71, node78);
        boolean boolean80 = functionType64.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType79);
        boolean boolean81 = functionType64.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType64.getPropertyType("");
        boolean boolean84 = functionType64.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.JSType jSType86 = functionType64.getPropertyType("function ({1265812580}): {1265812580}");
        functionType42.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType64);
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType64.autobox();
        boolean boolean89 = jSType88.isEnumElementType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
        org.junit.Assert.assertNull(jSType68);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(nodeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01795");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("function (...[?]): ?", 1, (-1));
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean10 = node9.hasOneChild();
        boolean boolean11 = node9.isOnlyModifiesThisCall();
        boolean boolean12 = node9.isLabel();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        node16.setLength(0);
        boolean boolean21 = node16.isNew();
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] { node5, node9, node16 };
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(2, nodeArray22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 100, nodeArray22, 40, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01796");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        boolean boolean12 = functionType10.isRegexpType();
        boolean boolean14 = functionType10.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node15 = functionType10.getRootNode();
        boolean boolean16 = functionType10.isFunctionType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01797");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        java.lang.String str7 = jSDocInfo2.getBlockDescription();
        java.lang.String str8 = jSDocInfo2.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo2.getImplementedInterfaces();
        jSDocInfo2.setDeprecated(false);
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection12 = jSDocInfo2.getMarkers();
        boolean boolean13 = jSDocInfo2.isInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo2.getReturnType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNotNull(markerCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeExpression14);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01798");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        node16.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = new com.google.javascript.rhino.JSTypeExpression(node22, "hi!");
        boolean boolean27 = jSTypeExpression26.isOptionalArg();
        boolean boolean28 = jSTypeExpression26.isOptionalArg();
        com.google.javascript.rhino.Node node29 = jSTypeExpression26.getRoot();
        node29.setSourceEncodedPositionForTree((int) (short) 100);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean36 = node35.hasOneChild();
        boolean boolean37 = node35.isOnlyModifiesThisCall();
        boolean boolean38 = node35.isLabel();
        int int39 = node35.getType();
        com.google.javascript.jscomp.CodingConvention.Bind bind40 = new com.google.javascript.jscomp.CodingConvention.Bind(node16, node29, node35);
        node16.setIsSyntheticBlock(true);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 39 + "'", int39 == 39);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01799");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        java.lang.String str7 = jSDocInfo2.getBlockDescription();
        java.lang.String str8 = jSDocInfo2.getDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo2.getImplementedInterfaces();
        jSDocInfo2.setDeprecated(false);
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection12 = jSDocInfo2.getMarkers();
        java.lang.String str13 = jSDocInfo2.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo2.getParameterType("");
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNotNull(markerCollection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(jSTypeExpression15);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test01800");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType10.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList28 = functionType26.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType39.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] { functionType26, functionType39 };
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry15.createUnionType(jSTypeArray41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int47 = node46.getSourceOffset();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        node46.addChildrenToBack(node51);
        boolean boolean54 = node51.isGetElem();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int59 = node58.getSourceOffset();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable64 = node63.children();
        node58.addChildrenToBack(node63);
        node58.detachChildren();
        node58.setLineno(16);
        node51.addChildrenToFront(node58);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int74 = node73.getSourceOffset();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node78.children();
        node73.addChildrenToBack(node78);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int85 = node84.getSourceOffset();
        com.google.javascript.rhino.Node node86 = node73.useSourceInfoIfMissingFrom(node84);
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int89 = node73.getIndexOfChild(node88);
        node73.detachChildren();
        boolean boolean91 = node51.isEquivalentToTyped(node73);
        boolean boolean92 = node73.isNoSideEffectsCall();
        boolean boolean93 = node73.isTypeOf();
        boolean boolean94 = functionType10.defineInferredProperty("", jSType42, node73);
        boolean boolean95 = node73.isEmpty();
        boolean boolean96 = node73.hasChildren();
        node73.detachChildren();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(functionTypeList28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeIterable64);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(nodeIterable79);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }
}
