import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0601");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        boolean boolean98 = enumElementType97.matchesObjectContext();
        boolean boolean99 = enumElementType97.matchesObjectContext();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0602");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        jSTypeRegistry67.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = jSTypeRegistry67.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        node78.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node81 = node78.cloneTree();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(10, node81);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry73.createFunctionType(jSType74, node82);
        jSTypeRegistry67.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType83);
        java.lang.String str85 = null; // flaky: functionType83.toString();
        boolean boolean86 = functionType83.isFunctionPrototypeType();
        boolean boolean87 = parameterizedType63.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        int int88 = parameterizedType63.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType63.getIndexType();
        boolean boolean90 = parameterizedType63.canBeCalled();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(functionType83);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Function" + "'", str85, "Function");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0603");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        java.util.Set<java.lang.String> strSet4 = node3.getDirectives();
        boolean boolean5 = node3.wasEmptyNode();
        int int6 = node3.getCharno();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0604");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) '4', node5, 49, 45);
        boolean boolean9 = node8.isVar();
        com.google.javascript.rhino.Node node11 = node8.getAncestor((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean15 = node14.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 12);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("OR \n");
        com.google.javascript.rhino.Node node21 = node18.srcrefTree(node20);
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoFrom(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        boolean boolean32 = node30.isObjectLit();
        boolean boolean33 = node30.isSwitch();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (short) -1, node30);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node1, node11, node22, node34, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0605");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isArrayLit();
        node2.setLength((int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = node29.copyInformationFromForTree(node33);
        boolean boolean35 = node29.isTry();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean39 = node38.isObjectLit();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node43 = node38.copyInformationFromForTree(node42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        int int47 = node46.getLineno();
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] { node14, node17, node21, node29, node42, node46 };
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, nodeArray48);
        node49.setWasEmptyNode(true);
        boolean boolean52 = node2.isEquivalentToTyped(node49);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0606");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node7.isTrue();
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        int int11 = node7.getType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(staticSourceFile10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0607");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setAllFlags();
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0608");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        node49.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node52 = node49.cloneTree();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(10, node52);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry44.createFunctionType(jSType45, node53);
        int int55 = functionType54.getMinArguments();
        boolean boolean56 = functionType54.matchesStringContext();
        boolean boolean57 = functionType54.isNumberObjectType();
        jSTypeRegistry1.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType54);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        node65.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node68 = node65.cloneTree();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(10, node68);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry60.createFunctionType(jSType61, node69);
        int int71 = functionType70.getMinArguments();
        int int72 = functionType70.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = functionType70.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType70.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType70.autobox();
        boolean boolean76 = functionType70.isOrdinaryFunction();
        boolean boolean78 = functionType70.isPropertyInExterns("Named type with empty name component");
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        int int82 = node81.getLineno();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean86 = node85.isObjectLit();
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node90 = node85.copyInformationFromForTree(node89);
        boolean boolean91 = node89.isObjectLit();
        boolean boolean92 = node89.isLabelName();
        com.google.javascript.rhino.Node node93 = node81.srcrefTree(node89);
        boolean boolean94 = node93.isFromExterns();
        boolean boolean95 = node93.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType70, node93);
        boolean boolean97 = functionType96.hasAnyTemplate();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType98 = functionType96.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0609");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair12 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType10, jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair12.typeB;
        int int14 = serializableList8.indexOf((java.lang.Object) typePair12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList23 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue22);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList23.parallelStream();
        boolean boolean25 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList23);
        boolean boolean26 = serializableList8.isEmpty();
        java.util.Iterator<java.io.Serializable> serializableItor27 = serializableList8.iterator();
        java.io.Serializable serializable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable30 = serializableList8.set(0, serializable29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(serializableList23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableItor27);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0610");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        boolean boolean25 = node17.hasChildren();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "[10, 1, 4, -1, a, 100.0, 100.0, true]", 44, 42);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(38, node17, node30, node36);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("Named type with empty name component", (int) '#', (-1));
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node37, node41, node44);
        // The following exception was thrown during execution in test generation
        try {
            node47.setString("OR  [length: OR ]\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: BITXOR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0611");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isComma();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = node2.getJSDocInfo();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = node12.copyInformationFromForTree(node16);
        boolean boolean18 = node16.isObjectLit();
        boolean boolean19 = node16.isLabelName();
        boolean boolean20 = node2.hasChild(node16);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        node27.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node30 = node27.cloneTree();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node30);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry22.createFunctionType(jSType23, node31);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry22.getTypesWithProperty("hi!");
        jSTypeRegistry22.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        jSTypeRegistry37.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable40 = jSTypeRegistry37.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        node47.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node50 = node47.cloneTree();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(10, node50);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry42.createFunctionType(jSType43, node51);
        int int53 = functionType52.getMinArguments();
        boolean boolean54 = functionType52.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType55 = jSTypeRegistry37.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType52);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean60 = node59.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newExpr(node59);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean65 = node64.isObjectLit();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node69 = node64.copyInformationFromForTree(node68);
        boolean boolean70 = node64.isTry();
        node64.setOptionalArg(false);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean76 = node75.isObjectLit();
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node80 = node75.copyInformationFromForTree(node79);
        boolean boolean81 = node75.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection82 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node75);
        com.google.javascript.rhino.Node node83 = node64.clonePropsFrom(node75);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(36, node61, node83);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean88 = node87.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node89 = com.google.javascript.jscomp.NodeUtil.newExpr(node87);
        com.google.javascript.rhino.Node node90 = node84.clonePropsFrom(node89);
        boolean boolean91 = node89.isAdd();
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry22.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType52, node89);
        com.google.javascript.rhino.Node node93 = node2.useSourceInfoIfMissingFromForTree(node89);
        int int94 = node93.getCharno();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertNotNull(objectTypeIterable40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectType55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(nodeCollection82);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0612");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean5 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        int int18 = functionType17.getMinArguments();
        int int19 = functionType17.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType17.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        node27.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node30 = node27.cloneTree();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node30);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry22.createFunctionType(jSType23, node31);
        int int33 = functionType32.getMinArguments();
        boolean boolean34 = functionType17.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean35 = functionType17.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType17);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = functionType17.toObjectType();
        com.google.javascript.rhino.jstype.JSType jSType38 = objectType37.getIndexType();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNull(jSType38);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0613");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Function", (int) '#', 44);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0, node5);
        boolean boolean7 = node5.isName();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0614");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType11.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType15);
        java.lang.String str17 = null; // flaky: functionType15.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        node24.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = node24.cloneTree();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node27);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry19.createFunctionType(jSType20, node28);
        int int30 = functionType29.getMinArguments();
        int int31 = functionType29.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType29.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        node39.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node42 = node39.cloneTree();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(10, node42);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry34.createFunctionType(jSType35, node43);
        int int45 = functionType44.getMinArguments();
        boolean boolean46 = functionType29.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean47 = functionType29.isNoType();
        boolean boolean48 = functionType29.isConstructor();
        boolean boolean49 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean50 = functionType15.isNominalConstructor();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType15.getSlot("OR \n");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(objectType16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Function" + "'", str17, "Function");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(staticSlot52);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0615");
        com.google.common.collect.ImmutableList.Builder<java.lang.CharSequence> charSequenceBuilder0 = com.google.common.collect.ImmutableList.builder();
        org.junit.Assert.assertNotNull(charSequenceBuilder0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0616");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        com.google.javascript.rhino.InputId inputId7 = null;
        node3.setInputId(inputId7);
        node3.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        boolean boolean12 = node3.isThis();
        boolean boolean13 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node3);
        boolean boolean15 = staticSourceFile14.isExtern();
        int int17 = staticSourceFile14.getLineOffset((int) (short) 1);
        int int19 = staticSourceFile14.getLineOffset(54);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = staticSourceFile14.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Should not call getLineOffset with line number 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(staticSourceFile14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2147483648) + "'", int19 == (-2147483648));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0617");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType93 = enumType91.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = jSType93.isStringObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertNull(jSType93);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0618");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isCall();
        java.lang.String str8 = node2.toString(false, true, false);
        boolean boolean9 = node2.isGetElem();
        com.google.javascript.rhino.Node node10 = node2.removeFirstChild();
        boolean boolean11 = node2.isIf();
        com.google.javascript.rhino.Node node13 = node2.getAncestor(16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node13.isDo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OR " + "'", str8, "OR ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0619");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.isNoCompile();
        boolean boolean60 = jSDocInfo58.hasTypedefType();
        jSDocInfo58.setLicense("Named type with empty name component");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo58.getExtendedInterfaces();
        functionType53.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo58);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType53.getBindReturnType((int) (short) 10);
        int int67 = functionType53.getMinArguments();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList63);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0620");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = enumType91.getOwnPropertyJSDocInfo("OR \n");
        com.google.javascript.rhino.JSDocInfo jSDocInfo95 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean96 = jSDocInfo95.hasThisType();
        java.lang.String str97 = jSDocInfo95.getDeprecationReason();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility98 = jSDocInfo95.getVisibility();
        enumType91.setPropertyJSDocInfo("OR \n", jSDocInfo95);
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(str97);
        org.junit.Assert.assertNull(visibility98);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0621");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(38, 15, 12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 38?end-line: 12");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0622");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        boolean boolean96 = enumType91.removeProperty("(INSTANCEOF 49\n    OR \n)");
        boolean boolean97 = enumType91.isNativeObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo99 = enumType91.getOwnPropertyJSDocInfo("OR  10\n");
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(jSDocInfo99);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0623");
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder1 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder2 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder4 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder5 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList7 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder0, serializableCollectionBuilder1, serializableCollectionBuilder2, serializableCollectionBuilder3, serializableCollectionBuilder4, serializableCollectionBuilder5, serializableCollectionBuilder6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList16 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue15);
        boolean boolean17 = serializableList16.isEmpty();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder18 = serializableCollectionBuilder6.add((java.util.Collection<java.io.Serializable>) serializableList16);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder19 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder20 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder21 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder22 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder23 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder24 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder25 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList26 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder19, serializableCollectionBuilder20, serializableCollectionBuilder21, serializableCollectionBuilder22, serializableCollectionBuilder23, serializableCollectionBuilder24, serializableCollectionBuilder25);
        java.util.Collection[] collectionArray28 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.io.Serializable>[] serializableCollectionArray29 = (java.util.Collection<java.io.Serializable>[]) collectionArray28;
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder30 = serializableCollectionBuilder21.add(serializableCollectionArray29);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder31 = serializableCollectionBuilder6.add(serializableCollectionArray29);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder18);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList26);
        org.junit.Assert.assertNotNull(collectionArray28);
        org.junit.Assert.assertNotNull(serializableCollectionArray29);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder30);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder31);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0624");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0625");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setLength(4);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node2.getJsDocBuilderForNode();
        boolean boolean12 = node2.isFor();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str19 = node15.checkTreeEquals(node18);
        boolean boolean20 = node15.hasOneChild();
        java.util.Set<java.lang.String> strSet21 = node15.getDirectives();
        node2.addChildToBack(node15);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node2.children();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("", 35, (int) (byte) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        int int31 = node30.getLineno();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = node34.copyInformationFromForTree(node38);
        boolean boolean40 = node38.isObjectLit();
        boolean boolean41 = node38.isLabelName();
        com.google.javascript.rhino.Node node42 = node30.srcrefTree(node38);
        boolean boolean43 = node42.isRegExp();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.isObjectLit();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node52 = node47.copyInformationFromForTree(node51);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean56 = node55.isObjectLit();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node60 = node55.copyInformationFromForTree(node59);
        boolean boolean61 = node59.isObjectLit();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean65 = node64.isObjectLit();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node69 = node64.copyInformationFromForTree(node68);
        boolean boolean70 = node69.isTrue();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(41, node47, node59, node69);
        com.google.javascript.rhino.Node node72 = node42.srcref(node69);
        boolean boolean73 = node42.isString();
        boolean boolean74 = node42.isLocalResultCall();
        com.google.javascript.rhino.Node node75 = node27.srcref(node42);
        java.lang.String str76 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node75);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean80 = node79.isObjectLit();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node84 = node79.copyInformationFromForTree(node83);
        boolean boolean85 = node83.isObjectLit();
        boolean boolean86 = node83.isLabelName();
        java.lang.String str90 = node83.toString(true, false, true);
        boolean boolean91 = node83.isOr();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildBefore(node75, node83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "OR " + "'", str90, "OR ");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0626");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean66 = parameterizedType63.isInstanceType();
        boolean boolean68 = parameterizedType63.hasOwnProperty("true");
        com.google.javascript.rhino.jstype.FunctionType functionType69 = parameterizedType63.getOwnerFunction();
        boolean boolean70 = parameterizedType63.isCheckedUnknownType();
        boolean boolean72 = parameterizedType63.hasProperty("Function.<Function>");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = parameterizedType63.toMaybeParameterizedType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parameterizedType73);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0627");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        java.lang.String str26 = node17.getString();
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node17);
        boolean boolean28 = node17.isOnlyModifiesThisCall();
        boolean boolean29 = node17.isNoSideEffectsCall();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0628");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        boolean boolean14 = node8.isTry();
        node8.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        boolean boolean25 = node19.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node27 = node8.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(36, node5, node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean32 = node31.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node34 = node28.clonePropsFrom(node33);
        boolean boolean35 = node34.isRegExp();
        boolean boolean36 = node34.isNull();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean41 = node40.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean46 = node45.isObjectLit();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = node45.copyInformationFromForTree(node49);
        boolean boolean51 = node45.isTry();
        node45.setOptionalArg(false);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean57 = node56.isObjectLit();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node61 = node56.copyInformationFromForTree(node60);
        boolean boolean62 = node56.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection63 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node56);
        com.google.javascript.rhino.Node node64 = node45.clonePropsFrom(node56);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(36, node42, node64);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean69 = node68.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newExpr(node68);
        com.google.javascript.rhino.Node node71 = node65.clonePropsFrom(node70);
        boolean boolean72 = node71.isRegExp();
        com.google.javascript.rhino.Node node73 = node34.clonePropsFrom(node71);
        boolean boolean74 = node34.isDefaultCase();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(nodeCollection63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0629");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(1, "");
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node3);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 12);
        boolean boolean7 = node6.isOr();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        int int14 = node13.getLineno();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = node17.copyInformationFromForTree(node21);
        boolean boolean23 = node21.isObjectLit();
        boolean boolean24 = node21.isLabelName();
        com.google.javascript.rhino.Node node25 = node13.srcrefTree(node21);
        boolean boolean26 = node25.isRegExp();
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node25);
        com.google.javascript.rhino.Node node28 = null;
        node10.addChildAfter(node25, node28);
        boolean boolean30 = node25.isName();
        boolean boolean31 = node6.isEquivalentToTyped(node25);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean37 = node36.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node36);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = node41.copyInformationFromForTree(node45);
        boolean boolean47 = node41.isTry();
        node41.setOptionalArg(false);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.isObjectLit();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node57 = node52.copyInformationFromForTree(node56);
        boolean boolean58 = node52.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection59 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node52);
        com.google.javascript.rhino.Node node60 = node41.clonePropsFrom(node52);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(36, node38, node60);
        boolean boolean62 = node61.isThis();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str69 = node65.checkTreeEquals(node68);
        boolean boolean70 = node68.isCall();
        boolean boolean71 = node68.isNew();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.Bind bind74 = new com.google.javascript.jscomp.CodingConvention.Bind(node61, node68, node73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node73);
        node73.setCharno(31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(44, node3, node25, node32, node73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(nodeCollection59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0630");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        boolean boolean98 = enumElementType97.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType99 = enumElementType97.autoboxesTo();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNull(jSType99);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0631");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node14.new FileLevelJsDocBuilder();
        node14.setSourceEncodedPosition(45);
        java.lang.String str21 = node14.toString(false, true, false);
        int int22 = node14.getLineno();
        boolean boolean23 = node14.isInstanceOf();
        boolean boolean24 = node14.isTrue();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags26 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags26.setReturnsTainted();
        int int28 = sideEffectFlags26.valueOf();
        sideEffectFlags26.clearAllFlags();
        // The following exception was thrown during execution in test generation
        try {
            node14.setSideEffectFlags(sideEffectFlags26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got OR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OR " + "'", str21, "OR ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 41 + "'", int28 == 41);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0632");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        com.google.javascript.rhino.InputId inputId7 = null;
        node3.setInputId(inputId7);
        node3.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        boolean boolean12 = node3.isThis();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = node16.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node28.isObjectLit();
        boolean boolean31 = node28.isFromExterns();
        boolean boolean32 = node28.wasEmptyNode();
        boolean boolean33 = node28.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship34 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType13, node20, node28);
        com.google.javascript.rhino.Node node35 = node28.cloneNode();
        java.lang.Object obj37 = null;
        node35.putProp(100, obj37);
        java.lang.String str39 = node35.getString();
        boolean boolean40 = node35.isSyntheticBlock();
        com.google.javascript.rhino.Node node41 = node3.useSourceInfoFrom(node35);
        boolean boolean42 = node3.isSetterDef();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean47 = node46.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newExpr(node46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean52 = node51.isObjectLit();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = node51.copyInformationFromForTree(node55);
        boolean boolean57 = node51.isTry();
        node51.setOptionalArg(false);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.isObjectLit();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node67 = node62.copyInformationFromForTree(node66);
        boolean boolean68 = node62.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection69 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node62);
        com.google.javascript.rhino.Node node70 = node51.clonePropsFrom(node62);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(36, node48, node70);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean75 = node74.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newExpr(node74);
        com.google.javascript.rhino.Node node77 = node71.clonePropsFrom(node76);
        boolean boolean78 = node77.isRegExp();
        boolean boolean79 = node77.isNull();
        boolean boolean80 = node77.isSwitch();
        node77.setSourceEncodedPosition((int) (byte) 1);
        com.google.javascript.rhino.Node node83 = node3.clonePropsFrom(node77);
        java.lang.String str84 = node83.getString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + subclassType13 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType13.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(nodeCollection69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0633");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        int int20 = serializableList8.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor21 = serializableList8.listIterator();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node28.isObjectLit();
        int int31 = serializableList8.lastIndexOf((java.lang.Object) boolean30);
        boolean boolean32 = serializableList8.isEmpty();
        java.lang.String str33 = serializableList8.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        node40.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node43 = node40.cloneTree();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(10, node43);
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry35.createFunctionType(jSType36, node44);
        int int46 = functionType45.getMinArguments();
        int int47 = functionType45.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType48 = functionType45.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair91 = objectType48.getTypesUnderEquality(jSType90);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = serializableList8.remove((java.lang.Object) objectType48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(serializableItor21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str33, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(typePair91);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0634");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry6.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        node25.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node28 = node25.cloneTree();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(10, node28);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry20.createFunctionType(jSType21, node29);
        int int31 = functionType30.getMinArguments();
        int int32 = functionType30.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType33 = functionType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = functionType30.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType30.autobox();
        functionType30.clearCachedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable51 = jSTypeRegistry39.getTypesWithProperty("hi!");
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        jSTypeRegistry54.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = jSTypeRegistry54.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        jSTypeRegistry54.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(100, "");
        node66.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node69 = node66.cloneTree();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(10, node69);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry61.createFunctionType(jSType62, node70);
        int int72 = functionType71.getMinArguments();
        int int73 = functionType71.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType74 = functionType71.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable75 = objectType74.getCtorExtendedInterfaces();
        boolean boolean77 = objectType74.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78);
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(100, "");
        node84.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node87 = node84.cloneTree();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(10, node87);
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry79.createFunctionType(jSType80, node88);
        int int90 = functionType89.getMinArguments();
        boolean boolean91 = functionType89.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType92 = functionType89.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray93 = new com.google.javascript.rhino.jstype.JSType[] { jSType92 };
        com.google.javascript.rhino.jstype.FunctionType functionType94 = jSTypeRegistry54.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType74, jSTypeArray93);
        com.google.javascript.rhino.Node node95 = jSTypeRegistry39.createParameters(jSTypeArray93);
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry6.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType30, false, jSTypeArray93);
        com.google.javascript.rhino.Node node97 = jSTypeRegistry4.createParameters(jSTypeArray93);
        com.google.javascript.rhino.Node node98 = jSTypeRegistry1.createParameters(jSTypeArray93);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertNotNull(jSTypeIterable51);
        org.junit.Assert.assertNotNull(objectTypeIterable57);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertNotNull(objectTypeIterable75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(jSType92);
        org.junit.Assert.assertNotNull(jSTypeArray93);
        org.junit.Assert.assertNotNull(functionType94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertNotNull(node98);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0635");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.lang.String str9 = serializableList8.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList18 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        boolean boolean28 = serializableList18.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        boolean boolean29 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList38 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue37);
        java.lang.String str39 = serializableList38.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList48 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList57 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue56);
        boolean boolean58 = serializableList48.containsAll((java.util.Collection<java.io.Serializable>) serializableList57);
        boolean boolean59 = serializableList38.containsAll((java.util.Collection<java.io.Serializable>) serializableList57);
        boolean boolean60 = serializableList27.equals((java.lang.Object) boolean59);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable62 = serializableList27.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str9, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(serializableList18);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(serializableList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str39, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(serializableList48);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(serializableList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0636");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        jSTypeRegistry39.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        node52.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node55 = node52.cloneTree();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(10, node55);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry47.createFunctionType(jSType48, node56);
        int int58 = functionType57.getMinArguments();
        boolean boolean59 = functionType57.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable60 = functionType57.getImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType57.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType57);
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry39.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType57, "Function", "Not declared as a constructor", 31, 51);
        com.google.javascript.rhino.Node node69 = functionType57.getPropertyNode("OR  [source_file: ]\n");
        boolean boolean71 = functionType57.hasOwnProperty("JSDocInfo");
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0637");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "[10, 1, 4, -1, a, 100.0, 100.0, true]", "Not declared as a type name", "Function", "Not declared as a constructor", "Unknown class name", "Not declared as a constructor", "Not declared as a constructor" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = jSTypeRegistry12.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        node22.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node25 = node22.cloneTree();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(10, node25);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry17.createFunctionType(jSType18, node26);
        int int28 = functionType27.getMinArguments();
        boolean boolean29 = functionType27.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry12.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType27);
        com.google.javascript.rhino.jstype.JSType jSType31 = objectType30.unboxesTo();
        boolean boolean32 = strSet9.equals((java.lang.Object) objectType30);
        boolean boolean33 = objectType30.isNumber();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0638");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) objectType14);
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType16 = objectType14.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            parameterizedType16.clearCachedValues();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNull(parameterizedType16);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0639");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        int int17 = node16.getLineno();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node24.isObjectLit();
        boolean boolean27 = node24.isLabelName();
        com.google.javascript.rhino.Node node28 = node16.srcrefTree(node24);
        com.google.javascript.rhino.jstype.JSType jSType29 = node28.getJSType();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(44, node28, node32);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        int int47 = functionType46.getMinArguments();
        int int48 = functionType46.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType49 = functionType46.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = functionType46.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType46.getSlot("true");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry1.createObjectType("", node34, (com.google.javascript.rhino.jstype.ObjectType) functionType46);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = functionType46.getAllExtendedInterfaces();
        java.lang.String str55 = functionType46.getDisplayName();
        java.lang.Iterable iterable56 = functionType46.getCtorImplementedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(objectTypeIterable54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(iterable56);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0640");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isFromExterns();
        boolean boolean19 = node15.wasEmptyNode();
        boolean boolean20 = node15.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship21 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node7, node15);
        com.google.javascript.rhino.Node node22 = node15.cloneNode();
        java.lang.Object obj24 = null;
        node22.putProp(100, obj24);
        boolean boolean26 = node22.hasMoreThanOneChild();
        boolean boolean27 = node22.isOptionalArg();
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0641");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList4 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition1, typePosition2, typePosition3);
        typePosition3.setPositionInformation(0, 2, 10, (int) '4');
        com.google.javascript.rhino.Node node10 = typePosition3.getItem();
        boolean boolean11 = typePosition3.hasBrackets();
        com.google.javascript.rhino.Node node12 = typePosition3.getItem();
        org.junit.Assert.assertNotNull(typePositionList4);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0642");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = enumType91.getOwnPropertyJSDocInfo("OR \n");
        com.google.javascript.rhino.jstype.JSType jSType94 = enumType91.autobox();
        boolean boolean95 = enumType91.matchesObjectContext();
        java.lang.String str96 = enumType91.getDisplayName();
        java.lang.Iterable iterable97 = enumType91.getCtorImplementedInterfaces();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator98 = iterable97.spliterator();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str96, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(iterable97);
        org.junit.Assert.assertNotNull(nodeSpliterator98);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0643");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        jSTypeRegistry45.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = jSTypeRegistry45.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        int int61 = functionType60.getMinArguments();
        boolean boolean62 = functionType60.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry45.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType60);
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType60.restrictByNotNullOrUndefined();
        boolean boolean66 = functionType60.removeProperty("Unknown class name");
        boolean boolean68 = jSTypeRegistry39.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType60, "");
        int int69 = functionType60.getMinArguments();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0644");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        boolean boolean97 = enumType91.matchesNumberContext();
        boolean boolean99 = enumType91.hasOwnProperty("");
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0645");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean66 = parameterizedType63.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = parameterizedType63.getCtorImplementedInterfaces();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0646");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        jSTypeRegistry1.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        node13.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node16 = node13.cloneTree();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(10, node16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry8.createFunctionType(jSType9, node17);
        int int19 = functionType18.getMinArguments();
        int int20 = functionType18.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType18.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = objectType21.getCtorExtendedInterfaces();
        boolean boolean24 = objectType21.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        int int37 = functionType36.getMinArguments();
        boolean boolean38 = functionType36.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType36.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] { jSType39 };
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry1.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType21, jSTypeArray40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope43 = null;
        com.google.javascript.rhino.jstype.JSType jSType44 = objectType21.forceResolve(errorReporter42, jSTypeStaticScope43);
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(jSType44);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0647");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType11.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType11.autobox();
        functionType11.clearCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType11.getParentScope();
        boolean boolean19 = functionType11.isNoType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0648");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        int int27 = functionType26.getMinArguments();
        boolean boolean28 = functionType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean29 = functionType11.isGlobalThisType();
        java.lang.Iterable iterable30 = functionType11.getCtorExtendedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterable30);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0649");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isNoCompile();
        boolean boolean17 = jSDocInfo15.hasTypedefType();
        int int18 = jSDocInfo15.getImplementedInterfaceCount();
        functionType11.setPropertyJSDocInfo("", jSDocInfo15);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = functionType11.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        node28.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node31 = node28.cloneTree();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node31);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry23.createFunctionType(jSType24, node32);
        int int34 = functionType33.getMinArguments();
        boolean boolean35 = functionType33.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        node42.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node45 = node42.cloneTree();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(10, node45);
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry37.createFunctionType(jSType38, node46);
        int int48 = functionType47.getMinArguments();
        int int49 = functionType47.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType50 = functionType47.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        node57.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node60 = node57.cloneTree();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node60);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry52.createFunctionType(jSType53, node61);
        int int63 = functionType62.getMinArguments();
        boolean boolean64 = functionType47.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean65 = functionType33.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair66 = objectType21.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        jSTypeRegistry68.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = jSTypeRegistry68.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString(100, "");
        node79.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node82 = node79.cloneTree();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(10, node82);
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry74.createFunctionType(jSType75, node83);
        jSTypeRegistry68.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType84);
        java.lang.String str86 = null; // flaky: functionType84.toString();
        boolean boolean87 = functionType84.matchesStringContext();
        boolean boolean88 = functionType33.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType84);
        boolean boolean89 = functionType84.isInterface();
        boolean boolean91 = functionType84.removeProperty("true");
        boolean boolean92 = functionType84.hasCachedValues();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(typePair66);
        org.junit.Assert.assertNotNull(objectTypeIterable71);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(functionType84);
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Function" + "'", str86, "Function");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0650");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType98 = enumElementType97.getParameterType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType99 = enumElementType97.toMaybeEnumElementType();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertNull(jSType98);
        org.junit.Assert.assertNotNull(enumElementType99);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0651");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry22.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean26 = jSTypeRegistry22.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean56 = functionType38.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType57 = jSTypeRegistry22.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType38.toObjectType();
        boolean boolean59 = functionType38.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType38.getReturnType();
        boolean boolean62 = functionType38.removeProperty("[true, 100.0, 100.0, a, -1, 4, 1, 10]");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType63 = functionType17.resolve(errorReporter20, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0652");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        boolean boolean97 = enumElementType96.matchesNumberContext();
        boolean boolean99 = enumElementType96.isPropertyTypeInferred("Named type with empty name component");
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0653");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        jSTypeRegistry20.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        node32.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node35 = node32.cloneTree();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(10, node35);
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry27.createFunctionType(jSType28, node36);
        int int38 = functionType37.getMinArguments();
        int int39 = functionType37.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = functionType37.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = objectType40.getCtorExtendedInterfaces();
        boolean boolean43 = objectType40.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        node50.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node53 = node50.cloneTree();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(10, node53);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry45.createFunctionType(jSType46, node54);
        int int56 = functionType55.getMinArguments();
        boolean boolean57 = functionType55.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType55.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] { jSType58 };
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry20.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType40, jSTypeArray59);
        com.google.javascript.rhino.Node node61 = jSTypeRegistry1.createOptionalParameters(jSTypeArray59);
        jSTypeRegistry1.resetForTypeCheck();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node61);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0654");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getOriginalCommentString();
        boolean boolean2 = jSDocInfo0.hasBaseType();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0655");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = objectType14.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet16 = objectType14.getOwnPropertyNames();
        strSet16.clear();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList26 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList35 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue34);
        boolean boolean36 = serializableList26.containsAll((java.util.Collection<java.io.Serializable>) serializableList35);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList38 = com.google.common.collect.ImmutableList.of(booleanLiteralSet37);
        boolean boolean39 = serializableList35.equals((java.lang.Object) booleanLiteralSet37);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList40 = serializableList35.asList();
        java.lang.String str41 = serializableList40.toString();
        boolean boolean42 = strSet16.retainAll((java.util.Collection<java.io.Serializable>) serializableList40);
        int int43 = strSet16.size();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(8, "Not declared as a constructor");
        boolean boolean47 = strSet16.remove((java.lang.Object) "Not declared as a constructor");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(serializableList26);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(serializableList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(serializableList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str41, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0656");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str6 = node2.checkTreeEquals(node5);
        boolean boolean7 = node5.isCall();
        boolean boolean8 = node5.isNew();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        boolean boolean10 = node5.isTrue();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0657");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        com.google.javascript.rhino.InputId inputId7 = null;
        node3.setInputId(inputId7);
        node3.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        boolean boolean12 = node3.isThis();
        boolean boolean13 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node3);
        boolean boolean15 = staticSourceFile14.isExtern();
        int int17 = staticSourceFile14.getColumnOfOffset(51);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(staticSourceFile14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0658");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "Not declared as a constructor", "JSDocInfo", "JSDocInfo", "OR ", "hi!", "Not declared as a type name", "Not declared as a constructor", "", "", "[10, 1, 4, -1, a, 100.0, 100.0, true]", "Function", "OR \n", "JSDocInfo" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        jSTypeRegistry1.setTemplateTypeNames((java.util.List<java.lang.String>) strList28);
        jSTypeRegistry1.incrementGeneration();
        boolean boolean33 = jSTypeRegistry1.isForwardDeclaredType("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry1.createNamedType("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}", "Not declared as a type name", (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSType38);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0659");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair57 = objectType14.getTypesUnderEquality(jSType56);
        boolean boolean58 = objectType14.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = objectType14.canTestForShallowEqualityWith(jSType59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(typePair57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0660");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean66 = parameterizedType63.isInstanceType();
        boolean boolean68 = parameterizedType63.hasOwnProperty("true");
        boolean boolean69 = parameterizedType63.isAllType();
        boolean boolean70 = parameterizedType63.hasReferenceName();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0661");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        boolean boolean66 = parameterizedType63.isNoObjectType();
        boolean boolean67 = parameterizedType63.isTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType68 = parameterizedType63.toMaybeUnionType();
        boolean boolean69 = parameterizedType63.isRegexpType();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        jSTypeRegistry71.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable74 = jSTypeRegistry71.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        jSTypeRegistry71.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType87);
        jSTypeRegistry71.incrementGeneration();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray90 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry71.createUnionType(jSTypeNativeArray90);
        boolean boolean92 = parameterizedType63.canAssignTo(jSType91);
        boolean boolean93 = parameterizedType63.isAllType();
        com.google.javascript.rhino.jstype.TemplateType templateType94 = parameterizedType63.toMaybeTemplateType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(unionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable74);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertNotNull(jSTypeNativeArray90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(templateType94);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0662");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        node49.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node52 = node49.cloneTree();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(10, node52);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry44.createFunctionType(jSType45, node53);
        int int55 = functionType54.getMinArguments();
        boolean boolean56 = functionType54.matchesStringContext();
        boolean boolean57 = functionType54.isNumberObjectType();
        jSTypeRegistry1.unregisterPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType54);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        node65.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node68 = node65.cloneTree();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(10, node68);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry60.createFunctionType(jSType61, node69);
        int int71 = functionType70.getMinArguments();
        int int72 = functionType70.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = functionType70.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType70.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType70.autobox();
        boolean boolean76 = functionType70.isOrdinaryFunction();
        boolean boolean78 = functionType70.isPropertyInExterns("Named type with empty name component");
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        int int82 = node81.getLineno();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean86 = node85.isObjectLit();
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node90 = node85.copyInformationFromForTree(node89);
        boolean boolean91 = node89.isObjectLit();
        boolean boolean92 = node89.isLabelName();
        com.google.javascript.rhino.Node node93 = node81.srcrefTree(node89);
        boolean boolean94 = node93.isFromExterns();
        boolean boolean95 = node93.hasChildren();
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType70, node93);
        jSTypeRegistry1.incrementGeneration();
        jSTypeRegistry1.incrementGeneration();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(functionType96);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0663");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0664");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        boolean boolean5 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0665");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        java.lang.String str6 = jSDocInfo0.getDescriptionForParameter("Not declared as a constructor");
        java.lang.String str7 = jSDocInfo0.getBlockDescription();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0666");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.isNoCompile();
        boolean boolean60 = jSDocInfo58.hasTypedefType();
        jSDocInfo58.setLicense("Named type with empty name component");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo58.getExtendedInterfaces();
        functionType53.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo58);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType53.getBindReturnType((int) (short) 10);
        boolean boolean67 = functionType66.isNumberObjectType();
        boolean boolean68 = functionType66.isNativeObjectType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet69 = functionType66.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = functionType66.getCtorImplementedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList63);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet69 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet69.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable70);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0667");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType11.getImplementedInterfaces();
        java.lang.Iterable iterable15 = functionType11.getCtorImplementedInterfaces();
        boolean boolean16 = functionType11.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.isNoCompile();
        boolean boolean19 = jSDocInfo17.hasTypedefType();
        functionType11.setJSDocInfo(jSDocInfo17);
        com.google.javascript.rhino.jstype.ObjectType.Property property22 = functionType11.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType11.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        node30.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node33 = node30.cloneTree();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(10, node33);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry25.createFunctionType(jSType26, node34);
        int int36 = functionType35.getMinArguments();
        int int37 = functionType35.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.isNoCompile();
        boolean boolean41 = jSDocInfo39.hasTypedefType();
        int int42 = jSDocInfo39.getImplementedInterfaceCount();
        functionType35.setPropertyJSDocInfo("", jSDocInfo39);
        boolean boolean44 = functionType11.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType35);
        java.lang.Iterable iterable45 = functionType35.getCtorImplementedInterfaces();
        int int46 = functionType35.getMinArguments();
        boolean boolean47 = functionType35.isNullType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(iterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(property22);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(iterable45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0668");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        int int17 = functionType16.getMinArguments();
        boolean boolean18 = functionType16.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType16);
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType16.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType16.findPropertyType("Named type with empty name component");
        java.lang.Iterable iterable23 = functionType16.getCtorExtendedInterfaces();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNotNull(iterable23);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0669");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair12 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType10, jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair12.typeB;
        int int14 = serializableList8.indexOf((java.lang.Object) typePair12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList23 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue22);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList23.parallelStream();
        boolean boolean25 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList23);
        boolean boolean26 = serializableList8.isEmpty();
        java.util.Iterator<java.io.Serializable> serializableItor27 = serializableList8.iterator();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node35 = node30.copyInformationFromForTree(node34);
        boolean boolean36 = node34.isObjectLit();
        boolean boolean37 = node34.isSwitch();
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node34);
        boolean boolean39 = node34.isDec();
        boolean boolean40 = serializableList8.equals((java.lang.Object) boolean39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList50 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue49);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList51 = serializableList50.reverse();
        java.util.ListIterator<java.io.Serializable> serializableItor52 = serializableList50.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            serializableList8.add((int) (byte) -1, (java.io.Serializable) serializableList50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(serializableList23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(serializableList50);
        org.junit.Assert.assertNotNull(serializableList51);
        org.junit.Assert.assertNotNull(serializableItor52);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0670");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.FunctionType functionType66 = parameterizedType63.getOwnerFunction();
        com.google.javascript.rhino.jstype.UnionType unionType67 = parameterizedType63.toMaybeUnionType();
        boolean boolean69 = parameterizedType63.removeProperty("JSDocInfo");
        boolean boolean70 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean72 = parameterizedType63.hasOwnProperty("OR \n");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = parameterizedType63.toMaybeParameterizedType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNull(unionType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parameterizedType73);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0671");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        jSTypeRegistry1.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        int int27 = functionType26.getMinArguments();
        int int28 = functionType26.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = functionType26.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = objectType29.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet31 = objectType29.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType29);
        jSTypeRegistry1.setLastGeneration(false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(jSType32);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0672");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setLength(4);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node2.getJsDocBuilderForNode();
        boolean boolean12 = node2.isFor();
        boolean boolean13 = node2.isName();
        int int14 = node2.getCharno();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0673");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec16 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        node24.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = node24.cloneTree();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node27);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry19.createFunctionType(jSType20, node28);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable31 = jSTypeRegistry19.getTypesWithProperty("hi!");
        jSTypeRegistry19.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType33 = assertionFunctionSpec16.getAssertedType(node17, jSTypeRegistry19);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        jSTypeRegistry35.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = jSTypeRegistry35.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        node46.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node49 = node46.cloneTree();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(10, node49);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry41.createFunctionType(jSType42, node50);
        jSTypeRegistry35.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        node59.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node62 = node59.cloneTree();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(10, node62);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry54.createFunctionType(jSType55, node63);
        int int65 = functionType64.getMinArguments();
        boolean boolean66 = functionType64.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = functionType64.getImplementedInterfaces();
        java.lang.Iterable iterable68 = functionType64.getCtorImplementedInterfaces();
        boolean boolean69 = functionType64.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo70.isNoCompile();
        boolean boolean72 = jSDocInfo70.hasTypedefType();
        functionType64.setJSDocInfo(jSDocInfo70);
        com.google.javascript.rhino.jstype.ObjectType.Property property75 = functionType64.getSlot("hi!");
        boolean boolean76 = functionType64.isInstanceType();
        boolean boolean77 = functionType64.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry19.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType51, (com.google.javascript.rhino.jstype.JSType) functionType64);
        com.google.javascript.rhino.jstype.ObjectType objectType79 = parameterizedType78.getTypeOfThis();
        int int80 = parameterizedType78.getPropertiesCount();
        java.lang.String str81 = parameterizedType78.getReferenceName();
        boolean boolean82 = parameterizedType78.isConstructor();
        boolean boolean83 = parameterizedType78.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType84 = parameterizedType78.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) parameterizedType78);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative86 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry1.getNativeObjectType(jSTypeNative86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNotNull(jSTypeIterable31);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
        org.junit.Assert.assertNotNull(iterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(property75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(parameterizedType78);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(jSType84);
        org.junit.Assert.assertNotNull(jSType85);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0674");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isArrayLit();
        node2.setLength((int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = node29.copyInformationFromForTree(node33);
        boolean boolean35 = node29.isTry();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean39 = node38.isObjectLit();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node43 = node38.copyInformationFromForTree(node42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        int int47 = node46.getLineno();
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] { node14, node17, node21, node29, node42, node46 };
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, nodeArray48);
        node49.setWasEmptyNode(true);
        boolean boolean52 = node2.isEquivalentToTyped(node49);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Function", (int) '#', 44);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0, node58);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (-1L), 12, 37);
        boolean boolean64 = node63.isAssign();
        com.google.javascript.jscomp.CodingConvention.Bind bind65 = new com.google.javascript.jscomp.CodingConvention.Bind(node49, node58, node63);
        com.google.javascript.rhino.InputId inputId66 = com.google.javascript.jscomp.NodeUtil.getInputId(node58);
        boolean boolean67 = node58.hasOneChild();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(inputId66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0675");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean66 = parameterizedType63.isInstanceType();
        boolean boolean67 = parameterizedType63.isNullable();
        java.lang.Iterable iterable68 = parameterizedType63.getCtorImplementedInterfaces();
        java.lang.String str69 = parameterizedType63.getDisplayName();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType70 = parameterizedType63.toMaybeParameterizedType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterable68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(parameterizedType70);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0676");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        int int18 = node17.getLineno();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        boolean boolean27 = node25.isObjectLit();
        boolean boolean28 = node25.isLabelName();
        com.google.javascript.rhino.Node node29 = node17.srcrefTree(node25);
        com.google.javascript.rhino.Node node30 = node2.useSourceInfoIfMissingFrom(node25);
        com.google.javascript.rhino.Node node31 = node30.getLastSibling();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0677");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet1 = jSDocInfo0.getModifies();
        boolean boolean2 = jSDocInfo0.isHidden();
        boolean boolean3 = jSDocInfo0.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0678");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isLabelName();
        node7.setSourceFileForTesting("hi!");
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(35, node7);
        boolean boolean14 = node13.isGetElem();
        boolean boolean15 = node13.isOptionalArg();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0679");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.JSType jSType98 = enumElementType96.autoboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType99 = enumElementType96.getPrimitiveType();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertNull(jSType98);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0680");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        boolean boolean66 = parameterizedType63.matchesNumberContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType67 = parameterizedType63.toMaybeEnumElementType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(enumElementType67);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0681");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnEndLine();
        java.lang.String str2 = stringPosition0.getItem();
        java.lang.String str3 = stringPosition0.getItem();
        java.lang.String str4 = stringPosition0.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int6 = stringPosition5.getPositionOnStartLine();
        int int7 = stringPosition5.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str9 = stringPosition8.getItem();
        stringPosition8.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str12 = stringPosition8.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition13 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str14 = stringPosition13.getItem();
        stringPosition13.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        stringPosition13.setItem("INSTANCEOF 49\n    OR \n");
        stringPosition13.setItem("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition21 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int22 = stringPosition21.getPositionOnEndLine();
        int int23 = stringPosition21.getStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition24 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int25 = stringPosition24.getPositionOnEndLine();
        int int26 = stringPosition24.getStartLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.StringPosition> stringPositionList27 = com.google.common.collect.ImmutableList.of(stringPosition0, stringPosition5, stringPosition8, stringPosition13, stringPosition21, stringPosition24);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition28 = null;
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition29 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str30 = stringPosition29.getItem();
        stringPosition29.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str33 = stringPosition29.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition34 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int35 = stringPosition34.getPositionOnEndLine();
        java.lang.String str36 = stringPosition34.getItem();
        int int37 = stringPosition34.getStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition38 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int39 = stringPosition38.getPositionOnEndLine();
        java.lang.String str40 = stringPosition38.getItem();
        java.lang.String str41 = stringPosition38.getItem();
        java.lang.String str42 = stringPosition38.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition43 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int44 = stringPosition43.getPositionOnStartLine();
        int int45 = stringPosition43.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition46 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str47 = stringPosition46.getItem();
        stringPosition46.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str50 = stringPosition46.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition51 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str52 = stringPosition51.getItem();
        stringPosition51.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        stringPosition51.setItem("INSTANCEOF 49\n    OR \n");
        stringPosition51.setItem("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition59 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int60 = stringPosition59.getPositionOnEndLine();
        int int61 = stringPosition59.getStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition62 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int63 = stringPosition62.getPositionOnEndLine();
        int int64 = stringPosition62.getStartLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.StringPosition> stringPositionList65 = com.google.common.collect.ImmutableList.of(stringPosition38, stringPosition43, stringPosition46, stringPosition51, stringPosition59, stringPosition62);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.StringPosition> stringPositionList66 = com.google.common.collect.ImmutableList.of(stringPosition5, stringPosition28, stringPosition29, stringPosition34, stringPosition62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 1");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str12, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(stringPositionList27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str33, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str50, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(stringPositionList65);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0682");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        node3.setVarArgs(false);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = null;
        node3.setStaticSourceFile(staticSourceFile9);
        com.google.javascript.rhino.Node node11 = node3.getLastChild();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0683");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.isExpose();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getSuppressions();
        java.lang.Object obj4 = null;
        boolean boolean5 = strSet3.remove(obj4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0684");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        com.google.javascript.rhino.InputId inputId7 = null;
        node3.setInputId(inputId7);
        node3.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId11 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        com.google.javascript.rhino.InputId inputId12 = node3.getInputId();
        boolean boolean13 = node3.isThis();
        // The following exception was thrown during execution in test generation
        try {
            node3.setDouble((double) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR  [source_file: ] is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertNull(inputId12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0685");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType11.getImplementedInterfaces();
        java.lang.Iterable iterable15 = functionType11.getCtorImplementedInterfaces();
        boolean boolean16 = functionType11.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.isNoCompile();
        boolean boolean19 = jSDocInfo17.hasTypedefType();
        functionType11.setJSDocInfo(jSDocInfo17);
        com.google.javascript.rhino.jstype.ObjectType.Property property22 = functionType11.getSlot("hi!");
        boolean boolean23 = functionType11.isInstanceType();
        java.util.Set<java.lang.String> strSet24 = functionType11.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList33 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList42 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue41);
        boolean boolean43 = serializableList33.containsAll((java.util.Collection<java.io.Serializable>) serializableList42);
        boolean boolean45 = serializableList42.equals((java.lang.Object) 16);
        java.lang.Object obj46 = null;
        boolean boolean47 = serializableList42.equals(obj46);
        java.lang.Object[] objArray48 = serializableList42.toArray();
        boolean boolean49 = strSet24.retainAll((java.util.Collection<java.io.Serializable>) serializableList42);
        java.lang.String str50 = serializableList42.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable52 = serializableList42.get(46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (46) must be less than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(iterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(serializableList33);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(serializableList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str50, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0686");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean5 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.setLastGeneration(false);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = jSTypeRegistry12.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        node22.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node25 = node22.cloneTree();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(10, node25);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry17.createFunctionType(jSType18, node26);
        int int28 = functionType27.getMinArguments();
        boolean boolean29 = functionType27.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry12.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType27);
        boolean boolean31 = objectType30.matchesInt32Context();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry1.createObjectType("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}", node10, objectType30);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = node10.getExistingIntProp((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 32");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectType32);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0687");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node4 = node2.getLastChild();
        int int5 = node2.getSideEffectFlags();
        boolean boolean6 = node2.isObjectLit();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0688");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = jSTypeRegistry1.getErrorReporter();
        jSTypeRegistry1.forwardDeclareType("true");
        com.google.javascript.rhino.ErrorReporter errorReporter60 = jSTypeRegistry1.getErrorReporter();
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative62 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry1.getNativeType(jSTypeNative62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(errorReporter57);
        org.junit.Assert.assertNull(errorReporter60);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0689");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        int int65 = parameterizedType63.getPropertiesCount();
        boolean boolean66 = parameterizedType63.isUnionType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType67 = parameterizedType63.toMaybeEnumElementType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = enumElementType67.isPropertyTypeDeclared("OR  [slash_v: [10, 1, 4, -1, a, 100.0, 100.0, true]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(enumElementType67);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0690");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str19 = null; // flaky: functionType17.toString();
        boolean boolean20 = functionType17.isFunctionPrototypeType();
        boolean boolean21 = functionType17.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType17.getExtendedInterfaces();
        boolean boolean23 = functionType17.isReturnTypeInferred();
        boolean boolean24 = functionType17.isConstructor();
        boolean boolean25 = functionType17.isRecordType();
        boolean boolean26 = functionType17.isObject();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec28 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        node36.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node39 = node36.cloneTree();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(10, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry31.createFunctionType(jSType32, node40);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable43 = jSTypeRegistry31.getTypesWithProperty("hi!");
        jSTypeRegistry31.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType45 = assertionFunctionSpec28.getAssertedType(node29, jSTypeRegistry31);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        jSTypeRegistry47.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = jSTypeRegistry47.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        node58.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node61 = node58.cloneTree();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(10, node61);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry53.createFunctionType(jSType54, node62);
        jSTypeRegistry47.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        node71.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node74 = node71.cloneTree();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(10, node74);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry66.createFunctionType(jSType67, node75);
        int int77 = functionType76.getMinArguments();
        boolean boolean78 = functionType76.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable79 = functionType76.getImplementedInterfaces();
        java.lang.Iterable iterable80 = functionType76.getCtorImplementedInterfaces();
        boolean boolean81 = functionType76.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean83 = jSDocInfo82.isNoCompile();
        boolean boolean84 = jSDocInfo82.hasTypedefType();
        functionType76.setJSDocInfo(jSDocInfo82);
        com.google.javascript.rhino.jstype.ObjectType.Property property87 = functionType76.getSlot("hi!");
        boolean boolean88 = functionType76.isInstanceType();
        boolean boolean89 = functionType76.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType90 = jSTypeRegistry31.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType63, (com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = parameterizedType90.getTypeOfThis();
        int int92 = parameterizedType90.getPropertiesCount();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue93 = functionType17.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType90);
        com.google.javascript.rhino.jstype.JSType jSType94 = parameterizedType90.unboxesTo();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(jSTypeIterable43);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(objectTypeIterable50);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable79);
        org.junit.Assert.assertNotNull(iterable80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(property87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(parameterizedType90);
        org.junit.Assert.assertNotNull(objectType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(ternaryValue93);
        org.junit.Assert.assertNull(jSType94);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0691");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        node2.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = node2.cloneTree();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!");
        node5.addChildToFront(node7);
        boolean boolean9 = node7.isGetterDef();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0692");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0693");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isLabelName();
        com.google.javascript.rhino.Node node10 = node6.removeChildren();
        boolean boolean11 = node6.hasChildren();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0694");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        boolean boolean66 = parameterizedType63.isNoObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = parameterizedType63.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = functionType67.isFunctionPrototypeType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(functionType67);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0695");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("BITXOR \n    OR \n", 4095, (int) (short) 100);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0696");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("INSTANCEOF 49\n    OR \n");
        boolean boolean2 = node1.isNoSideEffectsCall();
        boolean boolean3 = node1.hasOneChild();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0697");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair57 = objectType14.getTypesUnderEquality(jSType56);
        com.google.javascript.rhino.jstype.ObjectType objectType58 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) objectType14);
        boolean boolean59 = objectType58.isNumber();
        boolean boolean60 = objectType58.isRegexpType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(typePair57);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0698");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        int int20 = serializableList8.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor21 = serializableList8.listIterator();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node28.isObjectLit();
        int int31 = serializableList8.lastIndexOf((java.lang.Object) boolean30);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition32 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition33 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition34 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.JSDocInfo.NamePosition[] namePositionArray35 = new com.google.javascript.rhino.JSDocInfo.NamePosition[] { namePosition32, namePosition33, namePosition34 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo.NamePosition[] namePositionArray36 = serializableList8.toArray(namePositionArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(serializableItor21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(namePositionArray35);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0699");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.isNoCompile();
        boolean boolean60 = jSDocInfo58.hasTypedefType();
        jSDocInfo58.setLicense("Named type with empty name component");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo58.getExtendedInterfaces();
        functionType53.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo58);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType53.getBindReturnType((int) (short) 10);
        boolean boolean67 = functionType66.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType66.unboxesTo();
        java.lang.Iterable iterable69 = functionType66.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = functionType66.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType66.getConstructor();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList63);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(jSType68);
        org.junit.Assert.assertNotNull(iterable69);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNull(functionType71);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0700");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.isNativeObjectType();
        boolean boolean95 = enumType91.removeProperty("");
        int int96 = enumType91.getPropertiesCount();
        boolean boolean98 = enumType91.isPropertyInExterns("java.io.IOException: Named type with empty name component");
        boolean boolean99 = enumType91.isNativeObjectType();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0701");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair12 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType10, jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair12.typeB;
        int int14 = serializableList8.indexOf((java.lang.Object) typePair12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList23 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue22);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList23.parallelStream();
        boolean boolean25 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList23);
        boolean boolean26 = serializableList8.isEmpty();
        java.util.Iterator<java.io.Serializable> serializableItor27 = serializableList8.iterator();
        java.io.Serializable serializable28 = serializableItor27.next();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList29 = com.google.common.collect.ImmutableList.copyOf(serializableItor27);
        boolean boolean30 = serializableList29.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        node37.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node40 = node37.cloneTree();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(10, node40);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry32.createFunctionType(jSType33, node41);
        int int43 = functionType42.getMinArguments();
        int int44 = functionType42.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType42.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType42.autobox();
        boolean boolean48 = functionType42.isOrdinaryFunction();
        boolean boolean49 = functionType42.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType42.getReturnType();
        boolean boolean51 = serializableList29.contains((java.lang.Object) jSType50);
        boolean boolean52 = jSType50.isAllType();
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(serializableList23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertEquals("'" + serializable28 + "' != '" + 10 + "'", serializable28, 10);
        org.junit.Assert.assertNotNull(serializableList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0702");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        boolean boolean66 = parameterizedType63.isNoObjectType();
        com.google.javascript.rhino.jstype.ObjectType.Property property68 = parameterizedType63.getSlot("Not declared as a constructor");
        boolean boolean70 = parameterizedType63.hasProperty("Not declared as a constructor");
        boolean boolean71 = parameterizedType63.isNoObjectType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(property68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0703");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        int int65 = parameterizedType63.getPropertiesCount();
        java.lang.String str66 = parameterizedType63.getReferenceName();
        boolean boolean67 = parameterizedType63.isConstructor();
        boolean boolean68 = parameterizedType63.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType63.findPropertyType("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = jSType70.isBooleanObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(jSType70);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0704");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean66 = parameterizedType63.isInstanceType();
        java.lang.Iterable iterable67 = parameterizedType63.getCtorImplementedInterfaces();
        boolean boolean68 = parameterizedType63.isOrdinaryFunction();
        boolean boolean70 = parameterizedType63.isPropertyTypeDeclared("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        boolean boolean71 = parameterizedType63.isUnknownType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = parameterizedType63.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(iterable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0705");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        boolean boolean14 = node8.isTry();
        node8.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        boolean boolean25 = node19.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node27 = node8.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(36, node5, node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean32 = node31.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node34 = node28.clonePropsFrom(node33);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression36 = new com.google.javascript.rhino.JSTypeExpression(node33, "INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        node43.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node43.cloneTree();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node46);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry38.createFunctionType(jSType39, node47);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable50 = jSTypeRegistry38.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        node57.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node60 = node57.cloneTree();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node60);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry52.createFunctionType(jSType53, node61);
        int int63 = functionType62.getMinArguments();
        int int64 = functionType62.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean67 = jSDocInfo66.isNoCompile();
        boolean boolean68 = jSDocInfo66.hasTypedefType();
        int int69 = jSDocInfo66.getImplementedInterfaceCount();
        functionType62.setPropertyJSDocInfo("", jSDocInfo66);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet71 = functionType62.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        node78.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node81 = node78.cloneTree();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(10, node81);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry73.createFunctionType(jSType74, node82);
        int int84 = functionType83.getMinArguments();
        boolean boolean85 = functionType83.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = functionType83.getImplementedInterfaces();
        java.lang.Iterable iterable87 = functionType83.getCtorImplementedInterfaces();
        boolean boolean88 = functionType83.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean90 = jSDocInfo89.isNoCompile();
        boolean boolean91 = jSDocInfo89.hasTypedefType();
        functionType83.setJSDocInfo(jSDocInfo89);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry38.createFunctionTypeWithNewReturnType(functionType62, (com.google.javascript.rhino.jstype.JSType) functionType83);
        boolean boolean94 = jSTypeExpression36.equals((java.lang.Object) functionType93);
        com.google.javascript.rhino.Node node95 = jSTypeExpression36.getRoot();
        boolean boolean96 = node95.isLocalResultCall();
        node95.detachChildren();
        boolean boolean98 = node95.isStringKey();
        boolean boolean99 = node95.isDefaultCase();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(jSTypeIterable50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet71 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet71.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable86);
        org.junit.Assert.assertNotNull(iterable87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0706");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 10L, 49, 43);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0707");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = null;
        node7.setJSDocInfo(jSDocInfo8);
        java.lang.String str10 = node7.getSourceFileName();
        boolean boolean11 = node7.isVoid();
        com.google.javascript.rhino.InputId inputId12 = com.google.javascript.jscomp.NodeUtil.getInputId(node7);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(inputId12);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0708");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        boolean boolean66 = parameterizedType63.isNoObjectType();
        boolean boolean67 = parameterizedType63.isTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType68 = parameterizedType63.toMaybeUnionType();
        boolean boolean69 = parameterizedType63.isRegexpType();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        jSTypeRegistry71.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable74 = jSTypeRegistry71.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        jSTypeRegistry71.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType87);
        jSTypeRegistry71.incrementGeneration();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray90 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry71.createUnionType(jSTypeNativeArray90);
        boolean boolean92 = parameterizedType63.canAssignTo(jSType91);
        boolean boolean93 = parameterizedType63.isAllType();
        boolean boolean94 = parameterizedType63.isInstanceType();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(unionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable74);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertNotNull(jSTypeNativeArray90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0709");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        int int40 = functionType38.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType38.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        boolean boolean55 = functionType38.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry16.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        java.lang.String str57 = functionType53.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        boolean boolean71 = functionType69.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType69.restrictByNotNullOrUndefined();
        functionType53.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType69);
        boolean boolean74 = jSTypeRegistry1.declareType("Not declared as a constructor", (com.google.javascript.rhino.jstype.JSType) functionType69);
        boolean boolean75 = functionType69.isNominalConstructor();
        int int76 = functionType69.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType69.collapseUnion();
        java.lang.Iterable iterable78 = functionType69.getCtorImplementedInterfaces();
        boolean boolean79 = functionType69.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.ObjectType.Property property81 = functionType69.getSlot("JSDocInfo");
        functionType69.clearCachedValues();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertNotNull(iterable78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(property81);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0710");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean66 = parameterizedType63.isInstanceType();
        boolean boolean67 = parameterizedType63.isNullable();
        boolean boolean69 = parameterizedType63.isPropertyTypeDeclared("Named type with empty name component");
        boolean boolean71 = parameterizedType63.removeProperty("Named type with empty name component");
        boolean boolean73 = parameterizedType63.hasProperty("OR  [slash_v: [10, 1, 4, -1, a, 100.0, 100.0, true]]");
        boolean boolean74 = parameterizedType63.matchesObjectContext();
        java.lang.String str75 = parameterizedType63.getReferenceName();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0711");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str19 = null; // flaky: functionType17.toString();
        boolean boolean20 = functionType17.isFunctionPrototypeType();
        boolean boolean21 = functionType17.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType17.getExtendedInterfaces();
        com.google.javascript.rhino.Node node23 = functionType17.getParametersNode();
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType17.getPropertyType("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType17.collapseUnion();
        boolean boolean27 = jSType26.isArrayType();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0712");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        jSDocInfo0.addSuppression("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        boolean boolean6 = jSDocInfo0.isExpose();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("Unknown class name");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0713");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setLength(4);
        java.util.Set<java.lang.String> strSet11 = node2.getDirectives();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = node14.copyInformationFromForTree(node18);
        boolean boolean20 = node14.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection21 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node14);
        boolean boolean22 = node14.isCatch();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        node25.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node28 = node25.cloneTree();
        int int29 = node25.getLineno();
        boolean boolean30 = node25.isReturn();
        node25.setType(31);
        boolean boolean33 = node25.isVoid();
        node14.addChildrenToBack(node25);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 36, 40960, 15);
        com.google.javascript.rhino.Node node39 = node38.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildBefore(node14, node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeCollection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0714");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        java.util.Iterator<java.io.Serializable> serializableItor12 = serializableList11.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        node19.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node22 = node19.cloneTree();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10, node22);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry14.createFunctionType(jSType15, node23);
        int int25 = functionType24.getMinArguments();
        boolean boolean26 = functionType24.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType24.getImplementedInterfaces();
        java.lang.Iterable iterable28 = functionType24.getCtorImplementedInterfaces();
        boolean boolean29 = functionType24.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.isNoCompile();
        boolean boolean32 = jSDocInfo30.hasTypedefType();
        functionType24.setJSDocInfo(jSDocInfo30);
        com.google.javascript.rhino.jstype.ObjectType.Property property35 = functionType24.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = functionType24.getCtorExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = functionType24.getTemplateTypeNames();
        boolean boolean38 = serializableList11.contains((java.lang.Object) functionType24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList48 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList57 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue56);
        boolean boolean58 = serializableList48.containsAll((java.util.Collection<java.io.Serializable>) serializableList57);
        int int60 = serializableList48.lastIndexOf((java.lang.Object) 49);
        java.lang.Object obj61 = null;
        int int62 = serializableList48.lastIndexOf(obj61);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = serializableList11.addAll(54, (java.util.Collection<java.io.Serializable>) serializableList48);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertNotNull(serializableItor12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNotNull(iterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(property35);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(serializableList48);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(serializableList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0715");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        int int9 = node8.getLineno();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = node12.copyInformationFromForTree(node16);
        boolean boolean18 = node16.isObjectLit();
        boolean boolean19 = node16.isLabelName();
        com.google.javascript.rhino.Node node20 = node8.srcrefTree(node16);
        com.google.javascript.rhino.jstype.JSType jSType21 = node20.getJSType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        node28.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node31 = node28.cloneTree();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node31);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry23.createFunctionType(jSType24, node32);
        int int34 = functionType33.getMinArguments();
        boolean boolean35 = functionType33.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = functionType33.getImplementedInterfaces();
        java.lang.Iterable iterable37 = functionType33.getCtorImplementedInterfaces();
        boolean boolean38 = functionType33.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.isNoCompile();
        boolean boolean41 = jSDocInfo39.hasTypedefType();
        functionType33.setJSDocInfo(jSDocInfo39);
        com.google.javascript.rhino.jstype.ObjectType.Property property44 = functionType33.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = functionType33.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        node52.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node55 = node52.cloneTree();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(10, node55);
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry47.createFunctionType(jSType48, node56);
        int int58 = functionType57.getMinArguments();
        int int59 = functionType57.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.isNoCompile();
        boolean boolean63 = jSDocInfo61.hasTypedefType();
        int int64 = jSDocInfo61.getImplementedInterfaceCount();
        functionType57.setPropertyJSDocInfo("", jSDocInfo61);
        boolean boolean66 = functionType33.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType57);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry1.createObjectType("JSDocInfo", node20, (com.google.javascript.rhino.jstype.ObjectType) functionType57);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString(100, "");
        node75.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node78 = node75.cloneTree();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(10, node78);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry70.createFunctionType(jSType71, node79);
        int int81 = functionType80.getMinArguments();
        int int82 = functionType80.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo84 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean85 = jSDocInfo84.isNoCompile();
        boolean boolean86 = jSDocInfo84.hasTypedefType();
        int int87 = jSDocInfo84.getImplementedInterfaceCount();
        functionType80.setPropertyJSDocInfo("", jSDocInfo84);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet89 = functionType80.getPossibleToBooleanOutcomes();
        int int90 = functionType80.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType.Property property92 = functionType80.getSlot("true");
        boolean boolean94 = functionType80.hasProperty("OR \n");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable95 = functionType80.getCtorExtendedInterfaces();
        boolean boolean96 = functionType80.hasInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.overwriteDeclaredType("(INSTANCEOF 49\n    OR \n)", (com.google.javascript.rhino.jstype.JSType) functionType80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(iterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(property44);
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet89 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet89.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNull(property92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0716");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        int int92 = node48.getCharno();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0717");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType98 = enumElementType96.toMaybeEnumElementType();
        boolean boolean99 = enumElementType96.canBeCalled();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertNotNull(enumElementType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0718");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        java.lang.String str28 = serializableList27.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList37 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList46 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue45);
        boolean boolean47 = serializableList37.containsAll((java.util.Collection<java.io.Serializable>) serializableList46);
        boolean boolean48 = serializableList27.containsAll((java.util.Collection<java.io.Serializable>) serializableList46);
        java.lang.Object obj49 = null;
        boolean boolean50 = serializableList46.contains(obj49);
        java.lang.Object[] objArray51 = serializableList46.toArray();
        java.lang.Object[] objArray52 = serializableList46.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = serializableList17.retainAll((java.util.Collection<java.io.Serializable>) serializableList46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str28, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(serializableList37);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(serializableList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0719");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node14.new FileLevelJsDocBuilder();
        node14.setSourceEncodedPosition(45);
        java.lang.String str21 = node14.toString(false, true, false);
        int int22 = node14.getLineno();
        boolean boolean23 = node14.isNE();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OR " + "'", str21, "OR ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0720");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        int int17 = functionType16.getMinArguments();
        boolean boolean18 = functionType16.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType16);
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType16.restrictByNotNullOrUndefined();
        boolean boolean22 = functionType16.hasOwnProperty("Function");
        com.google.javascript.rhino.jstype.ObjectType.Property property24 = functionType16.getSlot("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = jSTypeRegistry26.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        node37.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node40 = node37.cloneTree();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(10, node40);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry32.createFunctionType(jSType33, node41);
        jSTypeRegistry26.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair44 = functionType16.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.jstype.ObjectType.Property property46 = functionType42.getSlot("OR \n");
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType42.getReturnType();
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType42.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = functionType48.hasCachedValues();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(property24);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(typePair44);
        org.junit.Assert.assertNull(property46);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNull(functionType48);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0721");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList20 = com.google.common.collect.ImmutableList.of(booleanLiteralSet19);
        boolean boolean21 = serializableList17.equals((java.lang.Object) booleanLiteralSet19);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList22 = serializableList17.asList();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.io.Serializable> serializableList25 = serializableList17.subList(0, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (48) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(serializableList22);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0722");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean57 = functionType53.isArrayType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable58 = functionType53.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType59 = functionType53.getReturnType();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        jSTypeRegistry61.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = jSTypeRegistry61.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        node71.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node74 = node71.cloneTree();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(10, node74);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry66.createFunctionType(jSType67, node75);
        int int77 = functionType76.getMinArguments();
        boolean boolean78 = functionType76.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSTypeRegistry61.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType76);
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType76.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType76.getConstructor();
        boolean boolean82 = functionType53.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType76);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable83 = functionType76.getParameters();
        boolean boolean85 = functionType76.isPropertyInExterns("OR  [source_file: ]\n");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable58);
        org.junit.Assert.assertNotNull(jSType59);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(nodeIterable83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0723");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.isNativeObjectType();
        boolean boolean95 = enumType91.hasOwnProperty("(INSTANCEOF 49\n    OR \n)");
        java.lang.Iterable iterable96 = enumType91.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType98 = enumType91.getPropertyType("OR ");
        com.google.javascript.rhino.Node node99 = enumType91.getRootNode();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(iterable96);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertNull(node99);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0724");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        jSTypeRegistry1.forwardDeclareType("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType6 = jSTypeRegistry1.getNativeObjectType(jSTypeNative5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0725");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = enumType91.getOwnPropertyJSDocInfo("OR \n");
        com.google.javascript.rhino.jstype.JSType jSType94 = enumType91.autobox();
        boolean boolean95 = enumType91.matchesObjectContext();
        java.lang.String str96 = enumType91.getDisplayName();
        java.lang.Iterable iterable97 = enumType91.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType99 = enumType91.getPropertyType("OR  [slash_v: [10, 1, 4, -1, a, 100.0, 100.0, true]]");
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str96, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(iterable97);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0726");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("java.io.IOException: Named type with empty name component");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0727");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean58 = functionType53.isPropertyTypeDeclared("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable59 = functionType53.getAllImplementedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable59);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0728");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("Unknown class name");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(visibility6);
        org.junit.Assert.assertNull(strCollection7);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0729");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        jSTypeRegistry67.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = jSTypeRegistry67.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        node78.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node81 = node78.cloneTree();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(10, node81);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry73.createFunctionType(jSType74, node82);
        jSTypeRegistry67.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType83);
        java.lang.String str85 = null; // flaky: functionType83.toString();
        boolean boolean86 = functionType83.isFunctionPrototypeType();
        boolean boolean87 = parameterizedType63.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        int int88 = parameterizedType63.getPropertiesCount();
        boolean boolean90 = parameterizedType63.isPropertyTypeDeclared("java.io.IOException: Named type with empty name component");
        java.util.Set set91 = parameterizedType63.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType63.findPropertyType("OR  [length: OR ]\n");
        java.util.Set set94 = parameterizedType63.getOwnPropertyNames();
        boolean boolean95 = parameterizedType63.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(functionType83);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Function" + "'", str85, "Function");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertNull(jSType93);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0730");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnEndLine();
        java.lang.String str2 = stringPosition0.getItem();
        java.lang.String str3 = stringPosition0.getItem();
        java.lang.String str4 = stringPosition0.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int6 = stringPosition5.getPositionOnStartLine();
        int int7 = stringPosition5.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str9 = stringPosition8.getItem();
        stringPosition8.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str12 = stringPosition8.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition13 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str14 = stringPosition13.getItem();
        stringPosition13.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        stringPosition13.setItem("INSTANCEOF 49\n    OR \n");
        stringPosition13.setItem("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition21 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int22 = stringPosition21.getPositionOnEndLine();
        int int23 = stringPosition21.getStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition24 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int25 = stringPosition24.getPositionOnEndLine();
        int int26 = stringPosition24.getStartLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.StringPosition> stringPositionList27 = com.google.common.collect.ImmutableList.of(stringPosition0, stringPosition5, stringPosition8, stringPosition13, stringPosition21, stringPosition24);
        int int28 = stringPosition24.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str12, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(stringPositionList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0731");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair12 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType10, jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair12.typeB;
        int int14 = serializableList8.indexOf((java.lang.Object) typePair12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList23 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue22);
        java.util.stream.Stream<java.io.Serializable> serializableStream24 = serializableList23.parallelStream();
        boolean boolean25 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList23);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder27 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder28 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder29 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder30 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder31 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder32 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder33 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList34 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder27, serializableCollectionBuilder28, serializableCollectionBuilder29, serializableCollectionBuilder30, serializableCollectionBuilder31, serializableCollectionBuilder32, serializableCollectionBuilder33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList43 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList52 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue51);
        boolean boolean53 = serializableList43.containsAll((java.util.Collection<java.io.Serializable>) serializableList52);
        int int55 = serializableList43.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean60 = node59.isObjectLit();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node64 = node59.copyInformationFromForTree(node63);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.isObjectLit();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node72 = node67.copyInformationFromForTree(node71);
        boolean boolean73 = node71.isObjectLit();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean77 = node76.isObjectLit();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node81 = node76.copyInformationFromForTree(node80);
        boolean boolean82 = node81.isTrue();
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(41, node59, node71, node81);
        int int84 = serializableList43.lastIndexOf((java.lang.Object) node81);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder85 = serializableCollectionBuilder30.add((java.util.Collection<java.io.Serializable>) serializableList43);
        java.util.ListIterator<java.io.Serializable> serializableItor86 = serializableList43.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor88 = serializableList43.listIterator((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            serializableList8.add(40, (java.io.Serializable) serializableList43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(serializableList23);
        org.junit.Assert.assertNotNull(serializableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList34);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(serializableList43);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(serializableList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(serializableCollectionBuilder85);
        org.junit.Assert.assertNotNull(serializableItor86);
        org.junit.Assert.assertNotNull(serializableItor88);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0732");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.isNativeObjectType();
        boolean boolean94 = enumType91.isNativeObjectType();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0733");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        int int2 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(40960, 31, 16, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 40960?end-line: 16");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0734");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(1, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        int int7 = node6.getLineno();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean11 = node10.isObjectLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = node10.copyInformationFromForTree(node14);
        boolean boolean16 = node14.isObjectLit();
        boolean boolean17 = node14.isLabelName();
        com.google.javascript.rhino.Node node18 = node6.srcrefTree(node14);
        boolean boolean19 = node18.isRegExp();
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        node24.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = node24.cloneTree();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node27);
        boolean boolean29 = node27.isAdd();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        int int33 = node32.getLineno();
        boolean boolean34 = node32.isLabelName();
        boolean boolean35 = node32.isNumber();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList36 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node18, (java.lang.Cloneable) node27, (java.lang.Cloneable) node32);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship37 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node3, node32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node32);
        com.google.javascript.rhino.Node node39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node40 = node32.copyInformationFrom(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cloneableList36);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0735");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0736");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isArrayLit();
        node3.setLength((int) (byte) 1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean11 = node10.isObjectLit();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node15 = node10.copyInformationFromForTree(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean19 = node18.isObjectLit();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node23 = node18.copyInformationFromForTree(node22);
        boolean boolean24 = node22.isObjectLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        boolean boolean33 = node32.isTrue();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(41, node10, node22, node32);
        com.google.javascript.jscomp.CodingConvention.Bind bind35 = new com.google.javascript.jscomp.CodingConvention.Bind(node0, node3, node10);
        com.google.javascript.rhino.Node node36 = node10.removeChildren();
        boolean boolean37 = node10.isName();
        boolean boolean38 = node10.isOptionalArg();
        boolean boolean39 = node10.isVar();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0737");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        boolean boolean96 = enumType91.removeProperty("(INSTANCEOF 49\n    OR \n)");
        java.lang.String str97 = enumType91.getDisplayName();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType98 = enumType91.getElementsType();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str97, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(enumElementType98);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0738");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("hi!", throwable4);
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException("hi!", throwable7);
        java.io.IOException iOException10 = new java.io.IOException("");
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList18 = com.google.common.collect.ImmutableList.of(iOException2, iOException5, iOException8, iOException11, iOException14, iOException17);
        java.lang.Throwable[] throwableArray19 = iOException2.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException21 = new java.io.IOException("OR  [length: OR ]\n", (java.lang.Throwable) iOException20);
        org.junit.Assert.assertNotNull(iOExceptionList18);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0739");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        node20.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node23 = node20.cloneTree();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(10, node23);
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry15.createFunctionType(jSType16, node24);
        int int26 = functionType25.getMinArguments();
        int int27 = functionType25.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = functionType25.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        node35.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node38 = node35.cloneTree();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node38);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry30.createFunctionType(jSType31, node39);
        int int41 = functionType40.getMinArguments();
        boolean boolean42 = functionType25.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType40);
        boolean boolean43 = functionType11.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType40);
        java.util.Set<java.lang.String> strSet44 = functionType11.getOwnPropertyNames();
        boolean boolean46 = functionType11.isPropertyInExterns("JSDocInfo");
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        jSTypeRegistry48.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable51 = jSTypeRegistry48.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        node58.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node61 = node58.cloneTree();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(10, node61);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry53.createFunctionType(jSType54, node62);
        int int64 = functionType63.getMinArguments();
        boolean boolean65 = functionType63.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType66 = jSTypeRegistry48.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType63);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(100, "");
        node73.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node76 = node73.cloneTree();
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(10, node76);
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry68.createFunctionType(jSType69, node77);
        int int79 = functionType78.getMinArguments();
        int int80 = functionType78.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType81 = functionType78.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString(100, "");
        node88.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node91 = node88.cloneTree();
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(10, node91);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry83.createFunctionType(jSType84, node92);
        int int94 = functionType93.getMinArguments();
        boolean boolean95 = functionType78.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType93);
        boolean boolean96 = functionType93.isEmptyType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair97 = functionType63.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType93);
        boolean boolean98 = functionType11.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType93);
        boolean boolean99 = functionType93.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable51);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(typePair97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0740");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType11.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot17 = functionType11.getSlot("true");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = functionType11.getOwnerFunction();
        boolean boolean20 = functionType11.hasProperty("Function");
        int int21 = functionType11.getPropertiesCount();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNull(staticSlot17);
        org.junit.Assert.assertNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0741");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean5 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.setLastGeneration(false);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = jSTypeRegistry12.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        node22.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node25 = node22.cloneTree();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(10, node25);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry17.createFunctionType(jSType18, node26);
        int int28 = functionType27.getMinArguments();
        boolean boolean29 = functionType27.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = jSTypeRegistry12.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType27);
        boolean boolean31 = objectType30.matchesInt32Context();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry1.createObjectType("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}", node10, objectType30);
        node10.setSourceEncodedPosition(50);
        boolean boolean35 = node10.isUnscopedQualifiedName();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0742");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.hasThisType();
        boolean boolean4 = jSDocInfo0.hasReturnType();
        boolean boolean6 = jSDocInfo0.hasParameter("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0743");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean59 = jSDocInfo58.isNoCompile();
        boolean boolean60 = jSDocInfo58.hasTypedefType();
        jSDocInfo58.setLicense("Named type with empty name component");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList63 = jSDocInfo58.getExtendedInterfaces();
        functionType53.setPropertyJSDocInfo("Not declared as a type name", jSDocInfo58);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType53.getBindReturnType((int) (short) 10);
        boolean boolean67 = functionType66.isNumberObjectType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot69 = functionType66.getSlot("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = functionType66.getOwnImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = functionType66.getOwnPropertyJSDocInfo("OR  [length: OR ]\n");
        boolean boolean73 = functionType66.isNoResolvedType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList63);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(staticSlot69);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNull(jSDocInfo72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0744");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 36, 40960, 15);
        // The following exception was thrown during execution in test generation
        try {
            node3.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0745");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        boolean boolean66 = parameterizedType63.isNoObjectType();
        boolean boolean67 = parameterizedType63.isTemplateType();
        int int68 = parameterizedType63.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = parameterizedType63.getImplicitPrototype();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = parameterizedType63.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objectType69);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0746");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str94 = jSDocInfo93.getOriginalCommentString();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList95 = jSDocInfo93.getThrownTypes();
        enumType91.setPropertyJSDocInfo("[10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo93);
        boolean boolean97 = jSDocInfo93.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression98 = jSDocInfo93.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility99 = jSDocInfo93.getVisibility();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNotNull(jSTypeExpressionList95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(jSTypeExpression98);
        org.junit.Assert.assertNull(visibility99);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0747");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType11.getImplementedInterfaces();
        java.lang.Iterable iterable15 = functionType11.getCtorImplementedInterfaces();
        boolean boolean16 = functionType11.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.isNoCompile();
        boolean boolean19 = jSDocInfo17.hasTypedefType();
        functionType11.setJSDocInfo(jSDocInfo17);
        java.lang.String str21 = jSDocInfo17.getSourceName();
        boolean boolean22 = jSDocInfo17.isNoAlias();
        boolean boolean23 = jSDocInfo17.isExport();
        boolean boolean24 = jSDocInfo17.isOverride();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(iterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0748");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean5 = node4.isObjectLit();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node9 = node4.copyInformationFromForTree(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isArrayLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = node16.copyInformationFromForTree(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node24.isTry();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean34 = node33.isObjectLit();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node38 = node33.copyInformationFromForTree(node37);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        int int42 = node41.getLineno();
        com.google.javascript.rhino.Node[] nodeArray43 = new com.google.javascript.rhino.Node[] { node9, node12, node16, node24, node37, node41 };
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(10, nodeArray43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(30, nodeArray43, 39, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(nodeArray43);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0749");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = objectType20.setValidator(jSTypePredicate21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNotNull(objectType20);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0750");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType11.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot17 = functionType11.getSlot("true");
        int int18 = functionType11.getMinArguments();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = functionType11.getOwnPropertyJSDocInfo("INSTANCEOF 49\n    OR \n");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNull(staticSlot17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(jSDocInfo20);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0751");
        java.lang.CharSequence charSequence7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList8 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "(InputId: Not declared as a constructor)", (java.lang.CharSequence) "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", (java.lang.CharSequence) "?", (java.lang.CharSequence) "java.io.IOException: Function", (java.lang.CharSequence) "function (...[Function]): Function", (java.lang.CharSequence) "", (java.lang.CharSequence) "OR  10\n", charSequence7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 7");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0752");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.String str14 = null; // flaky: functionType11.toAnnotationString();
        com.google.javascript.rhino.Node node16 = functionType11.getPropertyNode("");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Function" + "'", str14, "Function");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0753");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        boolean boolean7 = node6.isVar();
        boolean boolean8 = node6.isQuotedString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo9 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0754");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isOrdinaryFunction();
        boolean boolean66 = parameterizedType63.matchesObjectContext();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0755");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str19 = null; // flaky: functionType17.toString();
        boolean boolean20 = functionType17.isFunctionPrototypeType();
        boolean boolean21 = functionType17.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType17.getExtendedInterfaces();
        com.google.javascript.rhino.Node node23 = functionType17.getParametersNode();
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType17.getPropertyType("INSTANCEOF 49\n    OR \n");
        boolean boolean26 = jSType25.hasAnyTemplate();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0756");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        stringPosition0.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        stringPosition0.setItem("INSTANCEOF 49\n    OR \n");
        stringPosition0.setItem("INSTANCEOF 49\n    OR \n");
        stringPosition0.setItem("STRING Not declared as a type name 32\n");
        java.lang.String str10 = stringPosition0.getItem();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "STRING Not declared as a type name 32\n" + "'", str10, "STRING Not declared as a type name 32\n");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0757");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean66 = parameterizedType63.isInstanceType();
        java.lang.Iterable iterable67 = parameterizedType63.getCtorImplementedInterfaces();
        boolean boolean68 = parameterizedType63.isNominalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = parameterizedType63.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(iterable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0758");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node25.isTrue();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(41, node3, node15, node25);
        node15.setLineno((int) (byte) 10);
        boolean boolean30 = node15.isUnscopedQualifiedName();
        int int31 = node15.getType();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0759");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isFromExterns();
        boolean boolean19 = node15.wasEmptyNode();
        boolean boolean20 = node15.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship21 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node7, node15);
        com.google.javascript.rhino.Node node22 = node15.cloneNode();
        // The following exception was thrown during execution in test generation
        try {
            node22.setDouble((double) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0760");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node7.isTrue();
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        boolean boolean12 = node7.getBooleanProp(41);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(staticSourceFile10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0761");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = jSTypeRegistry1.getErrorReporter();
        jSTypeRegistry1.forwardDeclareType("true");
        com.google.javascript.rhino.ErrorReporter errorReporter60 = jSTypeRegistry1.getErrorReporter();
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        node68.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node71 = node68.cloneTree();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(10, node71);
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry63.createFunctionType(jSType64, node72);
        int int74 = functionType73.getMinArguments();
        boolean boolean75 = functionType73.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType73.getImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable77 = functionType73.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType73);
        boolean boolean80 = functionType73.isPropertyInExterns("Unknown class name");
        boolean boolean82 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType73, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        boolean boolean83 = functionType73.matchesObjectContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNull(errorReporter57);
        org.junit.Assert.assertNull(errorReporter60);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertNotNull(objectTypeIterable77);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0762");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        node12.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = node12.cloneTree();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(10, node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry7.createFunctionType(jSType8, node16);
        jSTypeRegistry1.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType17);
        java.lang.String str19 = null; // flaky: functionType17.toString();
        boolean boolean20 = functionType17.isFunctionPrototypeType();
        boolean boolean21 = functionType17.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType17.getExtendedInterfaces();
        boolean boolean23 = functionType17.isReturnTypeInferred();
        boolean boolean24 = functionType17.isConstructor();
        boolean boolean25 = functionType17.isRecordType();
        boolean boolean26 = functionType17.isObject();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec28 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        node36.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node39 = node36.cloneTree();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(10, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry31.createFunctionType(jSType32, node40);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable43 = jSTypeRegistry31.getTypesWithProperty("hi!");
        jSTypeRegistry31.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType45 = assertionFunctionSpec28.getAssertedType(node29, jSTypeRegistry31);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        jSTypeRegistry47.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable50 = jSTypeRegistry47.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        node58.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node61 = node58.cloneTree();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(10, node61);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry53.createFunctionType(jSType54, node62);
        jSTypeRegistry47.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        node71.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node74 = node71.cloneTree();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(10, node74);
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry66.createFunctionType(jSType67, node75);
        int int77 = functionType76.getMinArguments();
        boolean boolean78 = functionType76.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable79 = functionType76.getImplementedInterfaces();
        java.lang.Iterable iterable80 = functionType76.getCtorImplementedInterfaces();
        boolean boolean81 = functionType76.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean83 = jSDocInfo82.isNoCompile();
        boolean boolean84 = jSDocInfo82.hasTypedefType();
        functionType76.setJSDocInfo(jSDocInfo82);
        com.google.javascript.rhino.jstype.ObjectType.Property property87 = functionType76.getSlot("hi!");
        boolean boolean88 = functionType76.isInstanceType();
        boolean boolean89 = functionType76.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType90 = jSTypeRegistry31.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType63, (com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = parameterizedType90.getTypeOfThis();
        int int92 = parameterizedType90.getPropertiesCount();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue93 = functionType17.testForEquality((com.google.javascript.rhino.jstype.JSType) parameterizedType90);
        boolean boolean95 = parameterizedType90.hasOwnProperty("hi!");
        boolean boolean96 = parameterizedType90.isInterface();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(jSTypeIterable43);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(objectTypeIterable50);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable79);
        org.junit.Assert.assertNotNull(iterable80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(property87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(parameterizedType90);
        org.junit.Assert.assertNotNull(objectType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(ternaryValue93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0763");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isArrayLit();
        int int4 = node2.getSourceOffset();
        boolean boolean5 = node2.isAdd();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isArrayLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = node29.copyInformationFromForTree(node33);
        boolean boolean35 = node29.isTry();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean39 = node38.isObjectLit();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node43 = node38.copyInformationFromForTree(node42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        int int47 = node46.getLineno();
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] { node14, node17, node21, node29, node42, node46 };
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, nodeArray48);
        node49.setWasEmptyNode(true);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection52 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean57 = node56.isObjectLit();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node61 = node56.copyInformationFromForTree(node60);
        boolean boolean62 = node56.isComma();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = node56.getJSDocInfo();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean67 = node66.isObjectLit();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node71 = node66.copyInformationFromForTree(node70);
        boolean boolean72 = node70.isObjectLit();
        boolean boolean73 = node70.isLabelName();
        boolean boolean74 = node56.hasChild(node70);
        node49.putProp(8, (java.lang.Object) boolean74);
        boolean boolean76 = node2.isEquivalentToTyped(node49);
        node2.addSuppression("Function.<Function>");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertNotNull(nodeCollection52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jSDocInfo63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0764");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder15 = node14.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = null;
        node14.setJSDocInfo(jSDocInfo16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList36 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue35);
        boolean boolean37 = serializableList27.containsAll((java.util.Collection<java.io.Serializable>) serializableList36);
        int int39 = serializableList27.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList27.listIterator();
        java.util.Iterator<java.io.Serializable> serializableItor41 = serializableList27.iterator();
        node14.putProp(54, (java.lang.Object) serializableList27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList51 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue50);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList52 = serializableList51.reverse();
        java.util.ListIterator<java.io.Serializable> serializableItor53 = serializableList51.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = serializableList27.addAll((java.util.Collection<java.io.Serializable>) serializableList51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(serializableList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableItor41);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(serializableList51);
        org.junit.Assert.assertNotNull(serializableList52);
        org.junit.Assert.assertNotNull(serializableItor53);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0765");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        int int20 = serializableList8.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor21 = serializableList8.listIterator();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node28.isObjectLit();
        int int31 = serializableList8.lastIndexOf((java.lang.Object) boolean30);
        boolean boolean32 = serializableList8.isEmpty();
        java.lang.String str33 = serializableList8.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable35 = serializableList8.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(serializableItor21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str33, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0766");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        node20.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node23 = node20.cloneTree();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(10, node23);
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry15.createFunctionType(jSType16, node24);
        int int26 = functionType25.getMinArguments();
        int int27 = functionType25.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = functionType25.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        node35.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node38 = node35.cloneTree();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node38);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry30.createFunctionType(jSType31, node39);
        int int41 = functionType40.getMinArguments();
        boolean boolean42 = functionType25.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType40);
        boolean boolean43 = functionType11.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.common.collect.ImmutableList<java.lang.String> strList44 = functionType40.getTemplateTypeNames();
        boolean boolean45 = functionType40.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0767");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isInc();
        node2.setString("");
        com.google.javascript.rhino.jstype.JSType jSType11 = node2.getJSType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSType11);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0768");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 12);
        boolean boolean2 = node1.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType3 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean15 = node14.isObjectLit();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node19 = node14.copyInformationFromForTree(node18);
        boolean boolean20 = node18.isObjectLit();
        boolean boolean21 = node18.isFromExterns();
        boolean boolean22 = node18.wasEmptyNode();
        boolean boolean23 = node18.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship24 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType3, node10, node18);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        boolean boolean33 = node31.isSetterDef();
        boolean boolean34 = node31.isString();
        com.google.javascript.rhino.Node node35 = node18.useSourceInfoIfMissingFrom(node31);
        boolean boolean36 = node1.isEquivalentTo(node18);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean40 = node39.isObjectLit();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node44 = node39.copyInformationFromForTree(node43);
        boolean boolean45 = node39.isComma();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = node39.getJSDocInfo();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean50 = node49.isObjectLit();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node54 = node49.copyInformationFromForTree(node53);
        boolean boolean55 = node53.isObjectLit();
        boolean boolean56 = node53.isLabelName();
        boolean boolean57 = node39.hasChild(node53);
        com.google.javascript.rhino.Node node58 = node18.srcref(node39);
        node18.addSuppression("OR  10\n");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + subclassType3 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType3.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(jSDocInfo46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0769");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType11.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType11.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot17 = functionType11.getSlot("true");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = functionType11.getOwnerFunction();
        boolean boolean20 = functionType11.hasProperty("Function");
        boolean boolean21 = functionType11.isObject();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType11.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        node29.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node32 = node29.cloneTree();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(10, node32);
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry24.createFunctionType(jSType25, node33);
        int int35 = functionType34.getMinArguments();
        boolean boolean36 = functionType34.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        node43.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node43.cloneTree();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node46);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry38.createFunctionType(jSType39, node47);
        int int49 = functionType48.getMinArguments();
        int int50 = functionType48.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = functionType48.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        node58.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node61 = node58.cloneTree();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(10, node61);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry53.createFunctionType(jSType54, node62);
        int int64 = functionType63.getMinArguments();
        boolean boolean65 = functionType48.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType63);
        boolean boolean66 = functionType34.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType63);
        functionType63.clearCachedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68);
        jSTypeRegistry69.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = jSTypeRegistry69.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(100, "");
        node80.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node83 = node80.cloneTree();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(10, node83);
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry75.createFunctionType(jSType76, node84);
        jSTypeRegistry69.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType85);
        java.lang.String str87 = null; // flaky: functionType85.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = null;
        functionType85.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo89);
        boolean boolean91 = functionType85.hasCachedValues();
        boolean boolean92 = functionType85.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType94 = functionType85.getBindReturnType(1);
        com.google.javascript.rhino.Node node95 = functionType85.getParametersNode();
        functionType63.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType85);
        boolean boolean97 = functionType11.hasEqualCallType(functionType85);
        com.google.javascript.rhino.jstype.JSType jSType99 = functionType11.findPropertyType("OR \n");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNull(staticSlot17);
        org.junit.Assert.assertNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(functionType85);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Function" + "'", str87, "Function");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(functionType94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(jSType99);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0770");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        com.google.javascript.rhino.Node node9 = node2.cloneNode();
        boolean boolean10 = node2.isGetterDef();
        // The following exception was thrown during execution in test generation
        try {
            node2.setDouble((double) 47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0771");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        boolean boolean2 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.setMutatesGlobalState();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0772");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isLabelName();
        boolean boolean5 = node2.isNumber();
        boolean boolean6 = node2.wasEmptyNode();
        boolean boolean7 = node2.isNot();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType9 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        node2.putProp(41, (java.lang.Object) subclassType9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isLabelName();
        java.lang.String str24 = node17.toString(true, false, true);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0, 50, (int) (byte) 0);
        com.google.javascript.rhino.Node node29 = node17.clonePropsFrom(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship31 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType9, node29, node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + subclassType9 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType9.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OR " + "'", str24, "OR ");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0773");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isFromExterns();
        boolean boolean19 = node15.wasEmptyNode();
        boolean boolean20 = node15.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship21 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node7, node15);
        com.google.javascript.rhino.Node node22 = node15.cloneNode();
        java.lang.Object obj24 = null;
        node22.putProp(100, obj24);
        java.lang.String str26 = node22.getString();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = node22.getExistingIntProp(43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 43");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0774");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        int int17 = node16.getLineno();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node24.isObjectLit();
        boolean boolean27 = node24.isLabelName();
        com.google.javascript.rhino.Node node28 = node16.srcrefTree(node24);
        com.google.javascript.rhino.jstype.JSType jSType29 = node28.getJSType();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(44, node28, node32);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        int int47 = functionType46.getMinArguments();
        int int48 = functionType46.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType49 = functionType46.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = functionType46.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot52 = functionType46.getSlot("true");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = jSTypeRegistry1.createObjectType("", node34, (com.google.javascript.rhino.jstype.ObjectType) functionType46);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        node60.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node63 = node60.cloneTree();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(10, node63);
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry55.createFunctionType(jSType56, node64);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        node72.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node75 = node72.cloneTree();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(10, node75);
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry67.createFunctionType(jSType68, node76);
        int int78 = functionType77.getMinArguments();
        int int79 = functionType77.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType80 = functionType77.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(100, "");
        node87.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node90 = node87.cloneTree();
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(10, node90);
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry82.createFunctionType(jSType83, node91);
        int int93 = functionType92.getMinArguments();
        boolean boolean94 = functionType77.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType92);
        com.google.javascript.rhino.jstype.JSType jSType95 = jSTypeRegistry55.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType92);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue96 = objectType53.testForEquality(jSType95);
        boolean boolean98 = ternaryValue96.toBoolean(false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(staticSlot52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(objectType80);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNotNull(ternaryValue96);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0775");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isFromExterns();
        boolean boolean10 = node6.wasEmptyNode();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        int int14 = node13.getLineno();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean18 = node17.isObjectLit();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = node17.copyInformationFromForTree(node21);
        boolean boolean23 = node21.isObjectLit();
        boolean boolean24 = node21.isLabelName();
        com.google.javascript.rhino.Node node25 = node13.srcrefTree(node21);
        node6.addChildrenToFront(node13);
        boolean boolean27 = node6.isName();
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newExpr(node6);
        node6.setSourceEncodedPositionForTree((int) (short) 10);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0776");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        int int17 = functionType16.getMinArguments();
        boolean boolean18 = functionType16.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType16);
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType16.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType16.findPropertyType("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType23 = functionType16.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0777");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.isObjectLit();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = node7.copyInformationFromForTree(node11);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        boolean boolean21 = node19.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node29.isTrue();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(41, node7, node19, node29);
        node19.setString("hi!");
        typePosition0.setItem(node19);
        boolean boolean35 = node19.isThrow();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0778");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        node3.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node6 = node3.cloneTree();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(10, node6);
        boolean boolean8 = node6.isAdd();
        boolean boolean9 = node6.isAnd();
        boolean boolean10 = node6.hasChildren();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0779");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean4 = node3.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean9 = node8.isObjectLit();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node13 = node8.copyInformationFromForTree(node12);
        boolean boolean14 = node8.isTry();
        node8.setOptionalArg(false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        boolean boolean25 = node19.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        com.google.javascript.rhino.Node node27 = node8.clonePropsFrom(node19);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(36, node5, node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean32 = node31.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node34 = node28.clonePropsFrom(node33);
        com.google.javascript.rhino.InputId inputId36 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        node34.setInputId(inputId36);
        com.google.javascript.rhino.InputId inputId38 = node34.getInputId();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 1.0f);
        java.lang.Object obj42 = node40.getProp(30);
        java.lang.String str43 = node40.getSourceFileName();
        boolean boolean44 = inputId38.equals((java.lang.Object) str43);
        java.lang.String str45 = inputId38.getIdName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(inputId38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str45, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0780");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        java.util.Iterator<java.io.Serializable> serializableItor12 = serializableList11.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        node19.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node22 = node19.cloneTree();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10, node22);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry14.createFunctionType(jSType15, node23);
        int int25 = functionType24.getMinArguments();
        boolean boolean26 = functionType24.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType24.getImplementedInterfaces();
        java.lang.Iterable iterable28 = functionType24.getCtorImplementedInterfaces();
        boolean boolean29 = functionType24.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.isNoCompile();
        boolean boolean32 = jSDocInfo30.hasTypedefType();
        functionType24.setJSDocInfo(jSDocInfo30);
        com.google.javascript.rhino.jstype.ObjectType.Property property35 = functionType24.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = functionType24.getCtorExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList37 = functionType24.getTemplateTypeNames();
        boolean boolean38 = serializableList11.contains((java.lang.Object) functionType24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.io.Serializable> serializableList41 = serializableList11.subList(29, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (29) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertNotNull(serializableItor12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNotNull(iterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(property35);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0781");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        com.google.javascript.rhino.jstype.JSType jSType15 = node14.getJSType();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(staticSourceFile16);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0782");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList36 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue35);
        boolean boolean37 = serializableList27.containsAll((java.util.Collection<java.io.Serializable>) serializableList36);
        boolean boolean39 = serializableList36.equals((java.lang.Object) 16);
        int int40 = serializableList36.size();
        boolean boolean41 = serializableList17.containsAll((java.util.Collection<java.io.Serializable>) serializableList36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean44 = jSDocInfo43.isNoCompile();
        boolean boolean45 = jSDocInfo43.hasTypedefType();
        int int46 = jSDocInfo43.getImplementedInterfaceCount();
        java.lang.String str48 = jSDocInfo43.getDescriptionForParameter("Named type with empty name component");
        java.lang.String str49 = jSDocInfo43.getLendsName();
        // The following exception was thrown during execution in test generation
        try {
            serializableList36.add((int) (byte) -1, (java.io.Serializable) str49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(serializableList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0783");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isSwitch();
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node7);
        boolean boolean12 = node7.isDec();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        boolean boolean21 = node15.isComma();
        java.lang.String str22 = node15.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = node34.copyInformationFromForTree(node38);
        boolean boolean40 = node38.isObjectLit();
        boolean boolean41 = node38.isFromExterns();
        boolean boolean42 = node38.wasEmptyNode();
        boolean boolean43 = node38.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship44 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType23, node30, node38);
        boolean boolean45 = node38.hasMoreThanOneChild();
        boolean boolean46 = node38.isThis();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(35, node7, node15, node38);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node38.siblings();
        boolean boolean49 = node38.isSwitch();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OR \n" + "'", str22, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType23 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType23.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0784");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        boolean boolean5 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0785");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        java.lang.Object[] objArray12 = serializableList8.toArray();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList21 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue20);
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableList21.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair25 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType23, jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = typePair25.typeB;
        int int27 = serializableList21.indexOf((java.lang.Object) typePair25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList36 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue35);
        java.util.stream.Stream<java.io.Serializable> serializableStream37 = serializableList36.parallelStream();
        boolean boolean38 = serializableList21.containsAll((java.util.Collection<java.io.Serializable>) serializableList36);
        boolean boolean39 = serializableList21.isEmpty();
        java.util.Iterator<java.io.Serializable> serializableItor40 = serializableList21.iterator();
        java.io.Serializable serializable41 = serializableItor40.next();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList42 = com.google.common.collect.ImmutableList.copyOf(serializableItor40);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = serializableList8.addAll((java.util.Collection<java.io.Serializable>) serializableList42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(serializableList21);
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(serializableList36);
        org.junit.Assert.assertNotNull(serializableStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertEquals("'" + serializable41 + "' != '" + 10 + "'", serializable41, 10);
        org.junit.Assert.assertNotNull(serializableList42);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0786");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isCall();
        java.lang.String str8 = node2.toString(false, true, false);
        boolean boolean9 = node2.isGetElem();
        com.google.javascript.rhino.Node node10 = node2.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = node10.isTrue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OR " + "'", str8, "OR ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0787");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList9 = serializableList8.reverse();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        node16.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node19 = node16.cloneTree();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node19);
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry11.createFunctionType(jSType12, node20);
        int int22 = functionType21.getMinArguments();
        int int23 = functionType21.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = functionType21.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = functionType21.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType25);
        boolean boolean27 = functionType25.hasInstanceType();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = functionType25.getParentScope();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = serializableList9.remove((java.lang.Object) objectType28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableList9);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectType28);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0788");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        boolean boolean20 = serializableList17.equals((java.lang.Object) 16);
        java.lang.Object obj21 = null;
        boolean boolean22 = serializableList17.equals(obj21);
        java.lang.Object[] objArray23 = serializableList17.toArray();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList32 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList41 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue40);
        boolean boolean42 = serializableList32.containsAll((java.util.Collection<java.io.Serializable>) serializableList41);
        boolean boolean44 = serializableList41.equals((java.lang.Object) 16);
        java.lang.Object obj45 = null;
        boolean boolean46 = serializableList41.equals(obj45);
        boolean boolean47 = serializableList17.containsAll((java.util.Collection<java.io.Serializable>) serializableList41);
        java.util.ListIterator<java.io.Serializable> serializableItor48 = serializableList41.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            serializableList41.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(serializableList32);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(serializableList41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(serializableItor48);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0789");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList4 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition1, typePosition2, typePosition3);
        com.google.javascript.rhino.Node node5 = typePosition1.getItem();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean9 = node8.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newExpr(node8);
        typePosition1.setItem(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typePositionList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0790");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        int int13 = functionType11.getPropertiesCount();
        boolean boolean14 = functionType11.canBeCalled();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        node21.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node24 = node21.cloneTree();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(10, node24);
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry16.createFunctionType(jSType17, node25);
        int int27 = functionType26.getMinArguments();
        boolean boolean28 = functionType26.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = functionType26.getImplementedInterfaces();
        java.lang.Iterable iterable30 = functionType26.getCtorImplementedInterfaces();
        boolean boolean31 = functionType26.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.isNoCompile();
        boolean boolean34 = jSDocInfo32.hasTypedefType();
        functionType26.setJSDocInfo(jSDocInfo32);
        com.google.javascript.rhino.jstype.ObjectType.Property property37 = functionType26.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = functionType26.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        node45.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node48 = node45.cloneTree();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(10, node48);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry40.createFunctionType(jSType41, node49);
        int int51 = functionType50.getMinArguments();
        int int52 = functionType50.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.isNoCompile();
        boolean boolean56 = jSDocInfo54.hasTypedefType();
        int int57 = jSDocInfo54.getImplementedInterfaceCount();
        functionType50.setPropertyJSDocInfo("", jSDocInfo54);
        boolean boolean59 = functionType26.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType50);
        java.lang.Iterable iterable60 = functionType50.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType50.getCtorExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList62 = functionType50.getTemplateTypeNames();
        boolean boolean63 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType11, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.Node node64 = functionType50.getRootNode();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean69 = node68.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newExpr(node68);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean74 = node73.isObjectLit();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node78 = node73.copyInformationFromForTree(node77);
        boolean boolean79 = node73.isTry();
        node73.setOptionalArg(false);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean85 = node84.isObjectLit();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node89 = node84.copyInformationFromForTree(node88);
        boolean boolean90 = node84.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection91 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node84);
        com.google.javascript.rhino.Node node92 = node73.clonePropsFrom(node84);
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node(36, node70, node92);
        boolean boolean94 = node93.isThis();
        functionType50.setSource(node93);
        java.lang.Appendable appendable96 = null;
        // The following exception was thrown during execution in test generation
        try {
            node93.appendStringTree(appendable96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertNotNull(iterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(property37);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(iterable60);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(nodeCollection91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0791");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        int int12 = functionType11.getMinArguments();
        boolean boolean13 = functionType11.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType11.getImplementedInterfaces();
        java.lang.Iterable iterable15 = functionType11.getCtorImplementedInterfaces();
        boolean boolean16 = functionType11.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.isNoCompile();
        boolean boolean19 = jSDocInfo17.hasTypedefType();
        functionType11.setJSDocInfo(jSDocInfo17);
        com.google.javascript.rhino.jstype.ObjectType.Property property22 = functionType11.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType11.getCtorExtendedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        node30.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node33 = node30.cloneTree();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(10, node33);
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry25.createFunctionType(jSType26, node34);
        int int36 = functionType35.getMinArguments();
        int int37 = functionType35.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean40 = jSDocInfo39.isNoCompile();
        boolean boolean41 = jSDocInfo39.hasTypedefType();
        int int42 = jSDocInfo39.getImplementedInterfaceCount();
        functionType35.setPropertyJSDocInfo("", jSDocInfo39);
        boolean boolean44 = functionType11.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType35);
        boolean boolean45 = functionType11.isFunctionPrototypeType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean48 = jSDocInfo47.isNoCompile();
        boolean boolean49 = jSDocInfo47.hasTypedefType();
        java.lang.String str50 = jSDocInfo47.getBlockDescription();
        boolean boolean51 = jSDocInfo47.isNoShadow();
        int int52 = jSDocInfo47.getParameterCount();
        jSDocInfo47.setLicense("");
        functionType11.setPropertyJSDocInfo("[10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo47);
        jSDocInfo47.setLicense("");
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = jSDocInfo47.getTemplateTypeNames();
        boolean boolean59 = jSDocInfo47.isConsistentIdGenerator();
        boolean boolean60 = jSDocInfo47.hasBaseType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(iterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(property22);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0792");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        int int25 = functionType23.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType23.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        int int39 = functionType38.getMinArguments();
        boolean boolean40 = functionType23.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        node63.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node66 = node63.cloneTree();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry58.createFunctionType(jSType59, node67);
        int int69 = functionType68.getMinArguments();
        boolean boolean70 = functionType68.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = functionType68.getImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = functionType68.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType68);
        boolean boolean75 = functionType68.isPropertyInExterns("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType76 = functionType68.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue77 = functionType53.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType53.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = jSType78.isOrdinaryFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable71);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertNotNull(ternaryValue77);
        org.junit.Assert.assertNull(jSType78);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0793");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        int int17 = functionType16.getMinArguments();
        boolean boolean18 = functionType16.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType16);
        com.google.javascript.rhino.jstype.JSType jSType20 = objectType19.unboxesTo();
        boolean boolean22 = objectType19.isPropertyTypeDeclared("Unknown class name");
        boolean boolean23 = objectType19.isRecordType();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0794");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        int int17 = functionType16.getMinArguments();
        boolean boolean18 = functionType16.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType16);
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType16.restrictByNotNullOrUndefined();
        boolean boolean22 = functionType16.hasOwnProperty("Function");
        boolean boolean23 = functionType16.hasAnyTemplate();
        boolean boolean24 = functionType16.canBeCalled();
        boolean boolean25 = functionType16.isReturnTypeInferred();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0795");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("(INSTANCEOF 49\n    OR \n)", 40, 1);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0796");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        boolean boolean98 = enumElementType97.matchesObjectContext();
        boolean boolean99 = enumElementType97.isNullable();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0797");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isDefine();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0798");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0799");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType2 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean6 = node5.isObjectLit();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node10 = node5.copyInformationFromForTree(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isObjectLit();
        boolean boolean20 = node17.isFromExterns();
        boolean boolean21 = node17.wasEmptyNode();
        boolean boolean22 = node17.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship23 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType2, node9, node17);
        boolean boolean24 = node17.isTypeOf();
        com.google.javascript.rhino.Node node25 = assertionFunctionSpec1.getAssertedParam(node17);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        node32.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        jSTypeRegistry39.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType41 = assertionFunctionSpec1.getAssertedType(node32, jSTypeRegistry39);
        boolean boolean43 = jSTypeRegistry39.hasNamespace("Unknown class name");
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType72.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        node82.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node85 = node82.cloneTree();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(10, node85);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry77.createFunctionType(jSType78, node86);
        int int88 = functionType87.getMinArguments();
        boolean boolean89 = functionType72.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry50.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.EnumType enumType91 = jSTypeRegistry39.createEnumType("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", node48, (com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType91.unboxesTo();
        boolean boolean93 = enumType91.hasCachedValues();
        com.google.javascript.rhino.Node node94 = enumType91.getSource();
        java.lang.Iterable iterable95 = enumType91.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType96 = enumType91.getElementsType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType97 = enumElementType96.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType98 = enumElementType96.toMaybeEnumElementType();
        int int99 = enumElementType98.getPropertiesCount();
        org.junit.Assert.assertTrue("'" + subclassType2 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType2.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jSType90);
        org.junit.Assert.assertNotNull(enumType91);
        org.junit.Assert.assertNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertNotNull(enumElementType96);
        org.junit.Assert.assertNotNull(enumElementType97);
        org.junit.Assert.assertNotNull(enumElementType98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test0800");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        node9.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node12 = node9.cloneTree();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(10, node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry4.createFunctionType(jSType5, node13);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry4.getTypesWithProperty("hi!");
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType18 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        jSTypeRegistry20.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = jSTypeRegistry20.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        node31.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node34 = node31.cloneTree();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(10, node34);
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry26.createFunctionType(jSType27, node35);
        jSTypeRegistry20.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType36);
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType49.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType49.getImplementedInterfaces();
        java.lang.Iterable iterable53 = functionType49.getCtorImplementedInterfaces();
        boolean boolean54 = functionType49.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        boolean boolean57 = jSDocInfo55.hasTypedefType();
        functionType49.setJSDocInfo(jSDocInfo55);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType49.getSlot("hi!");
        boolean boolean61 = functionType49.isInstanceType();
        boolean boolean62 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType63 = jSTypeRegistry4.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType36, (com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.ObjectType objectType64 = parameterizedType63.getTypeOfThis();
        boolean boolean65 = parameterizedType63.isCheckedUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        jSTypeRegistry67.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = jSTypeRegistry67.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        node78.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node81 = node78.cloneTree();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(10, node81);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry73.createFunctionType(jSType74, node82);
        jSTypeRegistry67.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType83);
        java.lang.String str85 = null; // flaky: functionType83.toString();
        boolean boolean86 = functionType83.isFunctionPrototypeType();
        boolean boolean87 = parameterizedType63.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType83);
        int int88 = parameterizedType63.getPropertiesCount();
        boolean boolean90 = parameterizedType63.isPropertyTypeDeclared("java.io.IOException: Named type with empty name component");
        boolean boolean91 = parameterizedType63.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType92 = parameterizedType63.getImplicitPrototype();
        boolean boolean93 = parameterizedType63.canBeCalled();
        com.google.javascript.rhino.JSDocInfo jSDocInfo94 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet95 = jSDocInfo94.getModifies();
        com.google.javascript.rhino.Node node96 = jSDocInfo94.getAssociatedNode();
        com.google.javascript.rhino.Node node97 = jSDocInfo94.getAssociatedNode();
        parameterizedType63.setJSDocInfo(jSDocInfo94);
        com.google.javascript.rhino.jstype.ObjectType objectType99 = parameterizedType63.getImplicitPrototype();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(iterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(parameterizedType63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(functionType83);
// flaky:         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Function" + "'", str85, "Function");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertNull(node96);
        org.junit.Assert.assertNull(node97);
        org.junit.Assert.assertNotNull(objectType99);
    }
}
