import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1601");
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
        boolean boolean68 = parameterizedType63.isPropertyTypeDeclared("OR  [length: OR ]\n");
        java.lang.Iterable iterable69 = parameterizedType63.getCtorImplementedInterfaces();
        int int70 = parameterizedType63.getPropertiesCount();
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(iterable69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1602");
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
        boolean boolean97 = enumElementType96.isNullable();
        boolean boolean98 = enumElementType96.matchesStringContext();
        boolean boolean99 = enumElementType96.matchesObjectContext();
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1603");
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
        int int21 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType.Property property23 = functionType11.getSlot("true");
        boolean boolean25 = functionType11.hasProperty("OR \n");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = functionType11.getCtorExtendedInterfaces();
        boolean boolean27 = functionType11.hasInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = jSTypeRegistry30.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        jSTypeRegistry30.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType46);
        jSTypeRegistry30.identifyNonNullableName("Named type with empty name component");
        jSTypeRegistry30.clearNamedTypes();
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
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType62.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = objectType65.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = objectType65.getOwnerFunction();
        boolean boolean68 = objectType65.isStringValueType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry30.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType65);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        int int73 = node72.getLineno();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean77 = node76.isObjectLit();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node81 = node76.copyInformationFromForTree(node80);
        boolean boolean82 = node80.isObjectLit();
        boolean boolean83 = node80.isLabelName();
        com.google.javascript.rhino.Node node84 = node72.srcrefTree(node80);
        boolean boolean85 = node84.isFromExterns();
        java.lang.String str86 = com.google.javascript.jscomp.NodeUtil.getSourceName(node84);
        com.google.javascript.rhino.Node node87 = node84.cloneTree();
        node87.setLength(51);
        boolean boolean90 = functionType11.defineInferredProperty("OR \n", jSType69, node87);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate91 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = functionType11.setValidator(jSTypePredicate91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(property23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1604");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isImplicitCast();
        boolean boolean5 = jSDocInfo0.isExport();
        boolean boolean6 = jSDocInfo0.isExport();
        boolean boolean7 = jSDocInfo0.isInterface();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1605");
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
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType46.getTypeOfThis();
        boolean boolean55 = functionType46.hasReferenceName();
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
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1606");
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
        com.google.javascript.rhino.jstype.JSType jSType96 = enumType91.getPropertyType("INSTANCEOF 49\n    OR \n");
        boolean boolean97 = enumType91.isNativeObjectType();
        java.lang.Class<?> wildcardClass98 = enumType91.getClass();
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
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1607");
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
        java.lang.Iterable iterable94 = enumType91.getCtorImplementedInterfaces();
        java.util.Set<java.lang.String> strSet95 = enumType91.getElements();
        int int96 = strSet95.size();
        java.util.Spliterator<java.lang.String> strSpliterator97 = strSet95.spliterator();
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
        org.junit.Assert.assertNotNull(iterable94);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(strSpliterator97);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1608");
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
        com.google.javascript.rhino.jstype.FunctionType functionType70 = parameterizedType63.toMaybeFunctionType();
        boolean boolean71 = parameterizedType63.hasAnyTemplateInternal();
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1609");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) '#');
        typePosition0.setItem(node2);
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1610");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode31 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode32 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode33 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode34 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList35 = com.google.common.collect.ImmutableList.of(resolveMode31, resolveMode32, resolveMode33, resolveMode34);
        jSTypeRegistry1.setResolveMode(resolveMode33);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        node43.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node43.cloneTree();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node46);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry38.createFunctionType(jSType39, node47);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        int int61 = functionType60.getMinArguments();
        int int62 = functionType60.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType63 = functionType60.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(100, "");
        node70.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node73 = node70.cloneTree();
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(10, node73);
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry65.createFunctionType(jSType66, node74);
        int int76 = functionType75.getMinArguments();
        boolean boolean77 = functionType60.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType75);
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry38.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType75);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString(100, "");
        node85.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node88 = node85.cloneTree();
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node(10, node88);
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry80.createFunctionType(jSType81, node89);
        int int91 = functionType90.getMinArguments();
        int int92 = functionType90.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType93 = jSTypeRegistry38.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType90);
        boolean boolean95 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType90, "(InputId: Not declared as a constructor)");
        com.google.javascript.rhino.jstype.ObjectType objectType96 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection97 = jSTypeRegistry1.getDirectImplementors(objectType96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + resolveMode31 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode31.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode32 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode32.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode33 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode33.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode34 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode34.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList35);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1611");
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
        int int28 = functionType26.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = functionType26.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        node36.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node39 = node36.cloneTree();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(10, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry31.createFunctionType(jSType32, node40);
        int int42 = functionType41.getMinArguments();
        boolean boolean43 = functionType26.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType41);
        boolean boolean44 = functionType26.isNoType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        node51.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node54 = node51.cloneTree();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(10, node54);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry46.createFunctionType(jSType47, node55);
        int int57 = functionType56.getMinArguments();
        int int58 = functionType56.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType56.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(100, "");
        node66.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node69 = node66.cloneTree();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(10, node69);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry61.createFunctionType(jSType62, node70);
        int int72 = functionType71.getMinArguments();
        boolean boolean73 = functionType56.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope74 = functionType71.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType26.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean76 = functionType11.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType26);
        java.lang.String str77 = functionType26.getNormalizedReferenceName();
        boolean boolean78 = functionType26.isNoObjectType();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType26.unboxesTo();
        int int80 = functionType26.getPropertiesCount();
        boolean boolean81 = functionType26.isRecordType();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1612");
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
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType21 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        boolean boolean38 = node36.isObjectLit();
        boolean boolean39 = node36.isFromExterns();
        boolean boolean40 = node36.wasEmptyNode();
        boolean boolean41 = node36.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship42 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType21, node28, node36);
        com.google.javascript.rhino.Node node43 = node36.cloneNode();
        java.lang.Object obj45 = null;
        node43.putProp(100, obj45);
        boolean boolean47 = node43.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node48 = node16.srcref(node43);
        boolean boolean49 = node48.isScript();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.isObjectLit();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node57 = node52.copyInformationFromForTree(node56);
        boolean boolean58 = node56.isObjectLit();
        boolean boolean59 = node56.isFromExterns();
        boolean boolean60 = node56.wasEmptyNode();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        int int64 = node63.getLineno();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean68 = node67.isObjectLit();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node72 = node67.copyInformationFromForTree(node71);
        boolean boolean73 = node71.isObjectLit();
        boolean boolean74 = node71.isLabelName();
        com.google.javascript.rhino.Node node75 = node63.srcrefTree(node71);
        node56.addChildrenToFront(node63);
        boolean boolean77 = node56.isRegExp();
        java.util.Set<java.lang.String> strSet78 = node56.getDirectives();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean82 = node81.isObjectLit();
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node86 = node81.copyInformationFromForTree(node85);
        boolean boolean87 = node85.isObjectLit();
        boolean boolean88 = node85.isLabelName();
        node85.setSourceFileForTesting("hi!");
        node85.setType(1);
        boolean boolean93 = node85.isReturn();
        // The following exception was thrown during execution in test generation
        try {
            node48.replaceChild(node56, node85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + subclassType21 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType21.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(strSet78);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1613");
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
        boolean boolean17 = functionType11.isOrdinaryFunction();
        boolean boolean18 = functionType11.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType11.getReturnType();
        boolean boolean21 = functionType11.hasOwnProperty("Named type with empty name component");
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
        boolean boolean39 = functionType33.isEmptyType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair40 = functionType11.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType33);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType33.getOwnImplementedInterfaces();
        com.google.javascript.rhino.jstype.TemplateType templateType42 = functionType33.toMaybeTemplateType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(iterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(typePair40);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertNull(templateType42);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1614");
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
        functionType38.clearResolved();
        boolean boolean43 = functionType38.isGlobalThisType();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1615");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.hasThisType();
        boolean boolean4 = jSDocInfo0.hasReturnType();
        boolean boolean6 = jSDocInfo0.hasParameter("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        boolean boolean8 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(visibility9);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1616");
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
        boolean boolean20 = functionType17.matchesStringContext();
        boolean boolean21 = functionType17.hasCachedValues();
        com.google.javascript.rhino.Node node23 = functionType17.getPropertyNode("false");
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1617");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("java.io.IOException: java.io.IOException: ", 17, (int) 'a');
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1618");
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
        boolean boolean27 = node22.isSyntheticBlock();
        boolean boolean28 = node22.hasChildren();
        boolean boolean29 = node22.isWith();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1619");
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
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType35.autobox();
        boolean boolean47 = jSType46.canBeCalled();
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
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1620");
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
        int int21 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType.Property property23 = functionType11.getSlot("true");
        boolean boolean25 = functionType11.hasProperty("OR \n");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = functionType11.getCtorExtendedInterfaces();
        boolean boolean27 = functionType11.hasInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        jSTypeRegistry30.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = jSTypeRegistry30.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        jSTypeRegistry30.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType46);
        jSTypeRegistry30.identifyNonNullableName("Named type with empty name component");
        jSTypeRegistry30.clearNamedTypes();
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
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType62.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = objectType65.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = objectType65.getOwnerFunction();
        boolean boolean68 = objectType65.isStringValueType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry30.createOptionalType((com.google.javascript.rhino.jstype.JSType) objectType65);
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        int int73 = node72.getLineno();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean77 = node76.isObjectLit();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node81 = node76.copyInformationFromForTree(node80);
        boolean boolean82 = node80.isObjectLit();
        boolean boolean83 = node80.isLabelName();
        com.google.javascript.rhino.Node node84 = node72.srcrefTree(node80);
        boolean boolean85 = node84.isFromExterns();
        java.lang.String str86 = com.google.javascript.jscomp.NodeUtil.getSourceName(node84);
        com.google.javascript.rhino.Node node87 = node84.cloneTree();
        node87.setLength(51);
        boolean boolean90 = functionType11.defineInferredProperty("OR \n", jSType69, node87);
        com.google.javascript.rhino.Node node91 = com.google.javascript.jscomp.NodeUtil.newExpr(node87);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(property23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(node91);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1621");
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
        boolean boolean53 = node2.isNE();
        node2.setType(49);
        com.google.javascript.rhino.Node node56 = node2.getNext();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node56);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1622");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList15 = functionType11.getTemplateTypeNames();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType11.getOwnImplementedInterfaces();
        boolean boolean17 = functionType11.isNullType();
        java.lang.String str18 = functionType11.getDisplayName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1623");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getOriginalCommentString();
        boolean boolean2 = jSDocInfo0.hasBaseType();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.hasType();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getReferences();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        boolean boolean7 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strCollection5);
        org.junit.Assert.assertNull(visibility6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1624");
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
        boolean boolean95 = enumType91.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumType enumType96 = enumType91.toMaybeEnumType();
        boolean boolean97 = enumType96.matchesNumberContext();
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
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(enumType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1625");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) '#');
        sideEffectFlags1.clearAllFlags();
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1626");
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
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType17.unboxesTo();
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
        org.junit.Assert.assertNull(jSType26);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1627");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        int int5 = node4.getLineno();
        boolean boolean6 = node4.isLabelName();
        boolean boolean7 = node4.isNumber();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node4 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0, nodeArray8, 12, 41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray8);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1628");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("OR ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(OR )" + "'", str1, "(OR )");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1629");
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
        com.google.javascript.rhino.jstype.FunctionType functionType16 = objectType14.getOwnerFunction();
        boolean boolean17 = objectType14.isStringValueType();
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
        com.google.javascript.rhino.jstype.FunctionType functionType33 = functionType29.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType29.autobox();
        boolean boolean35 = functionType29.isOrdinaryFunction();
        boolean boolean37 = functionType29.isPropertyInExterns("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType38 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType29.getReturnType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair40 = objectType14.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean42 = functionType29.isPropertyInExterns("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(typePair40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1630");
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
        boolean boolean17 = objectType16.isDateType();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = objectType16.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = functionType18.isRecordType();
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
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(functionType18);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1631");
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
        boolean boolean28 = node15.isDelProp();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str30 = jSDocInfo29.getDeprecationReason();
        boolean boolean31 = jSDocInfo29.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo29.getType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList33 = jSDocInfo29.getImplementedInterfaces();
        boolean boolean34 = jSDocInfo29.isIdGenerator();
        java.lang.String str36 = jSDocInfo29.getDescriptionForParameter("OR ");
        java.lang.String str37 = jSDocInfo29.getDescription();
        node15.setJSDocInfo(jSDocInfo29);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSTypeExpression32);
        org.junit.Assert.assertNotNull(jSTypeExpressionList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1632");
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
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection21 = jSDocInfo17.getMarkers();
        jSDocInfo17.setDeprecated(false);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo17.getTypedefType();
        int int25 = jSDocInfo17.getParameterCount();
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
        org.junit.Assert.assertNotNull(markerCollection21);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1633");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isLabelName();
        boolean boolean5 = node2.isNumber();
        boolean boolean6 = node2.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean11 = node10.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        boolean boolean21 = node15.isTry();
        node15.setOptionalArg(false);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        boolean boolean32 = node26.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection33 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node26);
        com.google.javascript.rhino.Node node34 = node15.clonePropsFrom(node26);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(36, node12, node34);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean39 = node38.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newExpr(node38);
        com.google.javascript.rhino.Node node41 = node35.clonePropsFrom(node40);
        boolean boolean42 = node41.isRegExp();
        boolean boolean43 = node41.isNull();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean48 = node47.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newExpr(node47);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.isObjectLit();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node57 = node52.copyInformationFromForTree(node56);
        boolean boolean58 = node52.isTry();
        node52.setOptionalArg(false);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean64 = node63.isObjectLit();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node68 = node63.copyInformationFromForTree(node67);
        boolean boolean69 = node63.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection70 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node63);
        com.google.javascript.rhino.Node node71 = node52.clonePropsFrom(node63);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(36, node49, node71);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean76 = node75.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newExpr(node75);
        com.google.javascript.rhino.Node node78 = node72.clonePropsFrom(node77);
        boolean boolean79 = node78.isRegExp();
        com.google.javascript.rhino.Node node80 = node41.clonePropsFrom(node78);
        com.google.javascript.rhino.Node node81 = node2.copyInformationFrom(node78);
        boolean boolean82 = node78.isAssignAdd();
        com.google.javascript.rhino.Node node84 = node78.getAncestor(50);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeCollection33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(nodeCollection70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1634");
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
        boolean boolean64 = parameterizedType63.isAllType();
        java.lang.String str65 = null; // flaky: parameterizedType63.toString();
        boolean boolean66 = parameterizedType63.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.UnionType unionType67 = parameterizedType63.toMaybeUnionType();
        com.google.javascript.rhino.jstype.FunctionType functionType68 = parameterizedType63.getConstructor();
        boolean boolean69 = parameterizedType63.matchesNumberContext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = parameterizedType63.getJSDocInfo();
        com.google.javascript.rhino.jstype.ObjectType.Property property72 = parameterizedType63.getOwnSlot("");
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Function.<Function>" + "'", str65, "Function.<Function>");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(unionType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(jSDocInfo70);
        org.junit.Assert.assertNull(property72);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1635");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isArrayLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node28 = node23.copyInformationFromForTree(node27);
        boolean boolean29 = node23.isTry();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        int int41 = node40.getLineno();
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] { node8, node11, node15, node23, node36, node40 };
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(10, nodeArray42);
        com.google.javascript.rhino.Node node44 = node43.cloneNode();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.isObjectLit();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node52 = node47.copyInformationFromForTree(node51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = null;
        node52.setJSDocInfo(jSDocInfo53);
        com.google.javascript.rhino.Node node55 = node44.srcref(node52);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1636");
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
        java.util.Iterator<java.lang.String> strItor17 = strSet16.iterator();
        java.util.Iterator<java.lang.String> strItor18 = strSet16.iterator();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList36 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue35);
        boolean boolean37 = serializableList27.containsAll((java.util.Collection<java.io.Serializable>) serializableList36);
        int int39 = serializableList27.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList27.listIterator();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean44 = node43.isObjectLit();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node48 = node43.copyInformationFromForTree(node47);
        boolean boolean49 = node47.isObjectLit();
        int int50 = serializableList27.lastIndexOf((java.lang.Object) boolean49);
        boolean boolean51 = serializableList27.isEmpty();
        java.lang.String str52 = serializableList27.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream53 = serializableList27.parallelStream();
        boolean boolean54 = strSet16.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(100, "");
        node61.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node64 = node61.cloneTree();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(10, node64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry56.createFunctionType(jSType57, node65);
        int int67 = functionType66.getMinArguments();
        int int68 = functionType66.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType66.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = objectType69.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet71 = objectType69.getOwnPropertyNames();
        java.util.Iterator<java.lang.String> strItor72 = strSet71.iterator();
        java.util.Iterator<java.lang.String> strItor73 = strSet71.iterator();
        boolean boolean74 = serializableList27.contains((java.lang.Object) strItor73);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(serializableList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str52, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(serializableStream53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(strItor72);
        org.junit.Assert.assertNotNull(strItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1637");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean5 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray7 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType8 = jSTypeRegistry1.createUnionType(jSTypeNativeArray7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = jSTypeRegistry1.createAnonymousObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable12 = jSTypeRegistry1.getTypesWithProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        jSTypeRegistry14.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry14.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        node25.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node28 = node25.cloneTree();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(10, node28);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry20.createFunctionType(jSType21, node29);
        jSTypeRegistry14.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType30);
        java.lang.String str32 = null; // flaky: functionType30.toString();
        boolean boolean33 = functionType30.matchesStringContext();
        boolean boolean34 = functionType30.hasCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry1.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType30);
        boolean boolean37 = jSTypeRegistry1.hasNamespace("[true, 100.0, 100.0, a, -1, 4, 1, 10]");
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray7);
        org.junit.Assert.assertNotNull(jSType8);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType10);
        org.junit.Assert.assertNotNull(jSTypeIterable12);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(functionType30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Function" + "'", str32, "Function");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1638");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getOriginalCommentString();
        boolean boolean2 = jSDocInfo0.hasBaseType();
        boolean boolean3 = jSDocInfo0.isNoSideEffects();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean5 = jSDocInfo0.isDefine();
        boolean boolean7 = jSDocInfo0.hasParameter("Node tree inequality:\nTree1:\nOR  32 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nNUMBER 12.0\n\n\nSubtree1: OR  32 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: NUMBER 12.0\n");
        boolean boolean8 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1639");
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
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType38.collapseUnion();
        com.google.javascript.rhino.Node node44 = functionType38.getPropertyNode("JSDocInfo");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType38.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1640");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        boolean boolean8 = jSDocInfo0.isConstant();
        boolean boolean9 = jSDocInfo0.hasThisType();
        jSDocInfo0.addSuppression("[true, 100.0, 100.0, a, -1, 4, 1, 10]");
        boolean boolean12 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1641");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isTypeOf();
        node2.addSuppression("java.io.IOException: Function");
        node2.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags10 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags10.setReturnsTainted();
        sideEffectFlags10.setReturnsTainted();
        sideEffectFlags10.setMutatesGlobalState();
        // The following exception was thrown during execution in test generation
        try {
            node2.setSideEffectFlags(sideEffectFlags10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got OR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1642");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo15.getEnumParameterType();
        java.util.Set<java.lang.String> strSet21 = jSDocInfo15.getSuppressions();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection22 = jSDocInfo15.getTypeNodes();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(nodeCollection22);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1643");
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
        java.lang.Iterable iterable94 = enumType91.getCtorImplementedInterfaces();
        boolean boolean96 = enumType91.removeProperty("Node tree inequality:\nTree1:\nOR  32 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nNUMBER 12.0\n\n\nSubtree1: OR  32 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: NUMBER 12.0\n");
        com.google.javascript.rhino.jstype.JSType jSType97 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType98 = enumType91.getLeastSupertype(jSType97);
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
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertNotNull(iterable94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1644");
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
        boolean boolean23 = node22.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = new com.google.javascript.rhino.JSTypeExpression(node22, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        boolean boolean26 = jSTypeExpression25.isVarArgs();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        jSTypeRegistry28.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = jSTypeRegistry28.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        node39.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node42 = node39.cloneTree();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(10, node42);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry34.createFunctionType(jSType35, node43);
        jSTypeRegistry28.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType44);
        java.lang.String str46 = null; // flaky: functionType44.toString();
        boolean boolean47 = functionType44.isFunctionPrototypeType();
        boolean boolean48 = functionType44.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType44.getExtendedInterfaces();
        boolean boolean50 = functionType44.isReturnTypeInferred();
        boolean boolean51 = functionType44.isConstructor();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType44.getAllImplementedInterfaces();
        boolean boolean53 = functionType44.isOrdinaryFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54);
        jSTypeRegistry55.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable58 = jSTypeRegistry55.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean59 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        jSTypeRegistry55.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray61 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry55.createUnionType(jSTypeNativeArray61);
        com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry55.createAnonymousObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = jSTypeRegistry55.getEachReferenceTypeWithProperty("(INSTANCEOF 49\n    OR \n)");
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        node72.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node75 = node72.cloneTree();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(10, node75);
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry67.createFunctionType(jSType68, node76);
        int int78 = functionType77.getMinArguments();
        boolean boolean79 = functionType77.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable80 = functionType77.getImplementedInterfaces();
        java.lang.Iterable iterable81 = functionType77.getCtorImplementedInterfaces();
        boolean boolean82 = functionType77.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo83 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean84 = jSDocInfo83.isNoCompile();
        boolean boolean85 = jSDocInfo83.hasTypedefType();
        functionType77.setJSDocInfo(jSDocInfo83);
        com.google.javascript.rhino.jstype.ObjectType.Property property88 = functionType77.getSlot("hi!");
        boolean boolean89 = functionType77.isInstanceType();
        boolean boolean90 = functionType77.isConstructor();
        boolean boolean91 = functionType77.isNativeObjectType();
        boolean boolean93 = functionType77.hasOwnProperty("OR \n");
        com.google.javascript.rhino.jstype.JSType jSType94 = jSTypeRegistry55.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) functionType77);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType95 = jSTypeExpression25.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType44, jSTypeRegistry55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: OR ");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(functionType44);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Function" + "'", str46, "Function");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray61);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(objectType63);
        org.junit.Assert.assertNotNull(objectTypeIterable65);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable80);
        org.junit.Assert.assertNotNull(iterable81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(property88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jSType94);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1645");
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
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType11.autobox();
        boolean boolean19 = jSType18.matchesStringContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNull(staticSlot17);
        org.junit.Assert.assertNotNull(jSType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1646");
        java.lang.String[] strArray8 = new java.lang.String[] { "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", "unknown", "Not declared as a type name", "", "", "(INSTANCEOF 49\n    OR \n)", "java.io.IOException: Named type with empty name component", "true" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        int int11 = strSet9.size();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList20 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue19);
        java.lang.String str21 = serializableList20.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList30 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList39 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue38);
        boolean boolean40 = serializableList30.containsAll((java.util.Collection<java.io.Serializable>) serializableList39);
        boolean boolean41 = serializableList20.containsAll((java.util.Collection<java.io.Serializable>) serializableList39);
        java.util.stream.Stream<java.io.Serializable> serializableStream42 = serializableList20.parallelStream();
        java.util.stream.Stream<java.io.Serializable> serializableStream43 = serializableList20.stream();
        boolean boolean44 = strSet9.containsAll((java.util.Collection<java.io.Serializable>) serializableList20);
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
        java.lang.Iterable iterable61 = functionType57.getCtorImplementedInterfaces();
        boolean boolean62 = functionType57.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.isNoCompile();
        boolean boolean65 = jSDocInfo63.hasTypedefType();
        functionType57.setJSDocInfo(jSDocInfo63);
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection67 = jSDocInfo63.getMarkers();
        jSDocInfo63.setDeprecated(false);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable70 = serializableList20.set(40, (java.io.Serializable) false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(serializableList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str21, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(serializableList30);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(serializableList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(serializableStream42);
        org.junit.Assert.assertNotNull(serializableStream43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertNotNull(iterable61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(markerCollection67);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1647");
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
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = objectType15.getGreatestSubtype(jSType16);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(jSType17);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1648");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 100);
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setThrows();
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1649");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        jSTypeRegistry4.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = jSTypeRegistry4.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        node14.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node17 = node14.cloneTree();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(10, node17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry9.createFunctionType(jSType10, node18);
        int int20 = functionType19.getMinArguments();
        boolean boolean21 = functionType19.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType22 = jSTypeRegistry4.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType19);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        node29.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node32 = node29.cloneTree();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(10, node32);
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry24.createFunctionType(jSType25, node33);
        int int35 = functionType34.getMinArguments();
        int int36 = functionType34.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = functionType34.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        node44.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node47 = node44.cloneTree();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(10, node47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry39.createFunctionType(jSType40, node48);
        int int50 = functionType49.getMinArguments();
        boolean boolean51 = functionType34.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType49);
        boolean boolean52 = functionType49.isEmptyType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair53 = functionType19.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType49);
        boolean boolean54 = functionType19.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType19.autobox();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType19);
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        node64.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node67 = node64.cloneTree();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(10, node67);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry59.createFunctionType(jSType60, node68);
        int int70 = functionType69.getMinArguments();
        int int71 = functionType69.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = functionType69.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType69.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType69.autobox();
        boolean boolean75 = functionType69.isOrdinaryFunction();
        boolean boolean77 = functionType69.isPropertyInExterns("Named type with empty name component");
        functionType69.clearCachedValues();
        com.google.javascript.rhino.jstype.EnumType enumType79 = functionType69.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType69.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry2.overwriteDeclaredType("(?)", (com.google.javascript.rhino.jstype.JSType) functionType69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectType22);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(typePair53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(enumType79);
        org.junit.Assert.assertNull(functionType80);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1650");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        int int5 = node4.getLineno();
        boolean boolean6 = node4.isLabelName();
        boolean boolean7 = node4.isNumber();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node4 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0, nodeArray8, 12, 41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-2147483648), nodeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeArray8);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1651");
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
        java.lang.Iterable iterable94 = enumType91.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot96 = enumType91.getOwnSlot("hi!");
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
        org.junit.Assert.assertNotNull(iterable94);
        org.junit.Assert.assertNull(jSTypeStaticSlot96);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1652");
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
        java.util.Iterator<java.lang.String> strItor17 = strSet16.iterator();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList26 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue25);
        java.lang.String str27 = serializableList26.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList36 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList45 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue44);
        boolean boolean46 = serializableList36.containsAll((java.util.Collection<java.io.Serializable>) serializableList45);
        boolean boolean47 = serializableList26.containsAll((java.util.Collection<java.io.Serializable>) serializableList45);
        java.util.stream.Stream<java.io.Serializable> serializableStream48 = serializableList26.parallelStream();
        boolean boolean49 = strSet16.containsAll((java.util.Collection<java.io.Serializable>) serializableList26);
        com.google.common.collect.UnmodifiableIterator<java.io.Serializable> serializableItor50 = serializableList26.iterator();
        boolean boolean51 = serializableList26.isEmpty();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList60 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue59);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList69 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue68);
        boolean boolean70 = serializableList60.containsAll((java.util.Collection<java.io.Serializable>) serializableList69);
        boolean boolean72 = serializableList69.equals((java.lang.Object) 16);
        java.lang.Object obj73 = null;
        boolean boolean74 = serializableList69.equals(obj73);
        java.lang.Object[] objArray75 = serializableList69.toArray();
        boolean boolean76 = serializableList69.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = serializableList26.removeAll((java.util.Collection<java.io.Serializable>) serializableList69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strItor17);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(serializableList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str27, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(serializableList36);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(serializableList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(serializableStream48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(serializableItor50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(serializableList60);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(serializableList69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1653");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        node2.setLineno(4095);
        boolean boolean13 = node2.hasOneChild();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node2.getJsDocBuilderForNode();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder14);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1654");
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
        boolean boolean67 = parameterizedType63.isConstructor();
        boolean boolean68 = parameterizedType63.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType63.getIndexType();
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jSType69);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1655");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        com.google.javascript.rhino.InputId inputId7 = null;
        node3.setInputId(inputId7);
        node3.setSourceFileForTesting("");
        java.lang.Object obj12 = node3.getProp(38);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1656");
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
        boolean boolean98 = enumElementType96.isObject();
        java.lang.String str99 = enumElementType96.getReferenceName();
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
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str99, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1657");
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
        boolean boolean53 = node2.isOnlyModifiesThisCall();
        boolean boolean54 = node2.isRegExp();
        boolean boolean55 = node2.isVarArgs();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1658");
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
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType17.findPropertyType("");
        com.google.javascript.rhino.Node node27 = functionType17.getSource();
        boolean boolean28 = functionType17.isInstanceType();
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
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1659");
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
        boolean boolean92 = parameterizedType63.isNoObjectType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet93 = parameterizedType63.getPossibleToBooleanOutcomes();
        boolean boolean95 = parameterizedType63.hasProperty("java.io.IOException: Named type with empty name component");
        boolean boolean96 = parameterizedType63.isBooleanObjectType();
        boolean boolean97 = parameterizedType63.isUnknownType();
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
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet93 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet93.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1660");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean10 = node2.isCatch();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec12 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        node20.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node23 = node20.cloneTree();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(10, node23);
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry15.createFunctionType(jSType16, node24);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable27 = jSTypeRegistry15.getTypesWithProperty("hi!");
        jSTypeRegistry15.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType29 = assertionFunctionSpec12.getAssertedType(node13, jSTypeRegistry15);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("OR \n");
        com.google.javascript.rhino.Node node32 = assertionFunctionSpec12.getAssertedParam(node31);
        com.google.javascript.rhino.Node node33 = node2.copyInformationFrom(node31);
        boolean boolean34 = node2.isNoSideEffectsCall();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertNotNull(jSTypeIterable27);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1661");
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
        boolean boolean93 = enumType91.matchesObjectContext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo95 = enumType91.getOwnPropertyJSDocInfo("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
        com.google.javascript.rhino.Node node96 = enumType91.getRootNode();
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(jSDocInfo95);
        org.junit.Assert.assertNull(node96);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1662");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.jstype.JSType jSType13 = jSTypeRegistry1.getType("");
        jSTypeRegistry1.identifyNonNullableName("?");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNull(jSType13);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1663");
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
        boolean boolean44 = functionType11.matchesNumberContext();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = functionType11.toObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectType45);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1664");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.setMutatesArguments();
        boolean boolean4 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.setMutatesArguments();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1665");
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
        com.google.javascript.rhino.Node node16 = node14.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = node16.cloneNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1666");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo17.getThisType();
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
        org.junit.Assert.assertNull(jSTypeExpression23);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1667");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean72 = jSDocInfo71.isNoCompile();
        boolean boolean73 = jSDocInfo71.hasTypedefType();
        int int74 = jSDocInfo71.getImplementedInterfaceCount();
        boolean boolean75 = jSDocInfo71.isExterns();
        boolean boolean76 = jSDocInfo71.isJavaDispatch();
        boolean boolean77 = jSDocInfo71.isIdGenerator();
        parameterizedType63.setPropertyJSDocInfo("Not declared as a constructor", jSDocInfo71);
        boolean boolean79 = parameterizedType63.hasAnyTemplateInternal();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1668");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("OR ");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1669");
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
        jSTypeRegistry16.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = jSTypeRegistry16.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        node26.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node29 = node26.cloneTree();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(10, node29);
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry21.createFunctionType(jSType22, node30);
        int int32 = functionType31.getMinArguments();
        boolean boolean33 = functionType31.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType34 = jSTypeRegistry16.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType31);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean39 = node38.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newExpr(node38);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean44 = node43.isObjectLit();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node48 = node43.copyInformationFromForTree(node47);
        boolean boolean49 = node43.isTry();
        node43.setOptionalArg(false);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean55 = node54.isObjectLit();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node59 = node54.copyInformationFromForTree(node58);
        boolean boolean60 = node54.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection61 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node54);
        com.google.javascript.rhino.Node node62 = node43.clonePropsFrom(node54);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(36, node40, node62);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean67 = node66.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newExpr(node66);
        com.google.javascript.rhino.Node node69 = node63.clonePropsFrom(node68);
        boolean boolean70 = node68.isAdd();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType31, node68);
        com.google.javascript.rhino.jstype.ObjectType.Property property73 = functionType31.getSlot("OR  [source_file: ]");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(nodeCollection61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertNull(property73);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1670");
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
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.autoboxesTo();
        java.util.Set<java.lang.String> strSet30 = functionType26.getPropertyNames();
        java.util.Set<java.lang.String> strSet31 = functionType26.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        node38.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node41 = node38.cloneTree();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(10, node41);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry33.createFunctionType(jSType34, node42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        node50.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node53 = node50.cloneTree();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(10, node53);
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry45.createFunctionType(jSType46, node54);
        int int56 = functionType55.getMinArguments();
        int int57 = functionType55.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType55.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        node65.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node68 = node65.cloneTree();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(10, node68);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry60.createFunctionType(jSType61, node69);
        int int71 = functionType70.getMinArguments();
        boolean boolean72 = functionType55.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType70);
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry33.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType70);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(100, "");
        node80.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node83 = node80.cloneTree();
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(10, node83);
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry75.createFunctionType(jSType76, node84);
        int int86 = functionType85.getMinArguments();
        int int87 = functionType85.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry33.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean89 = functionType85.isArrayType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable90 = functionType85.getAllExtendedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = strSet31.contains((java.lang.Object) objectTypeIterable90);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.LinkedHashSet cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable90);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1671");
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
        boolean boolean38 = functionType17.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType17.getReturnType();
        boolean boolean41 = functionType17.removeProperty("[true, 100.0, 100.0, a, -1, 4, 1, 10]");
        int int42 = functionType17.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType17.getTypeOfThis();
        boolean boolean44 = jSType43.isRecordType();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1672");
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
        boolean boolean17 = functionType11.isOrdinaryFunction();
        boolean boolean18 = functionType11.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType11.getReturnType();
        boolean boolean21 = functionType11.hasOwnProperty("Named type with empty name component");
        boolean boolean23 = functionType11.removeProperty("");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1673");
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
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node6);
        java.lang.String str28 = node6.getQualifiedName();
        boolean boolean29 = node6.isGetterDef();
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
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1674");
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
        com.google.javascript.rhino.jstype.FunctionType functionType70 = parameterizedType63.toMaybeFunctionType();
        boolean boolean71 = parameterizedType63.hasAnyTemplateInternal();
        boolean boolean72 = parameterizedType63.isInstanceType();
        com.google.javascript.rhino.jstype.ObjectType.Property property74 = parameterizedType63.getSlot("function (...[Function]): Function");
        java.util.Set set75 = parameterizedType63.getOwnPropertyNames();
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
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(property74);
        org.junit.Assert.assertNotNull(set75);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1675");
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
        boolean boolean48 = node44.isInc();
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1676");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
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
        boolean boolean25 = node18.isTypeOf();
        com.google.javascript.rhino.Node node26 = assertionFunctionSpec2.getAssertedParam(node18);
        java.lang.String str27 = node18.getString();
        com.google.javascript.rhino.InputId inputId28 = com.google.javascript.jscomp.NodeUtil.getInputId(node18);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) (short) 0);
        node18.addChildrenToFront(node30);
        boolean boolean32 = node30.isNew();
        com.google.javascript.rhino.Node node34 = node30.getAncestor(40960);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        int int38 = node37.getLineno();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = node41.copyInformationFromForTree(node45);
        boolean boolean47 = node45.isObjectLit();
        boolean boolean48 = node45.isLabelName();
        com.google.javascript.rhino.Node node49 = node37.srcrefTree(node45);
        boolean boolean50 = node49.isRegExp();
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node49);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        boolean boolean60 = node58.isAdd();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        int int64 = node63.getLineno();
        boolean boolean65 = node63.isLabelName();
        boolean boolean66 = node63.isNumber();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList67 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node49, (java.lang.Cloneable) node58, (java.lang.Cloneable) node63);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) (short) -1, node34, node63, 4095, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(inputId28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(cloneableList67);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1677");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isSetterDef();
        boolean boolean9 = node6.isString();
        boolean boolean10 = node6.isTry();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = node6.getExistingIntProp(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1678");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList12 = serializableList11.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        node19.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node22 = node19.cloneTree();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10, node22);
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry14.createFunctionType(jSType15, node23);
        int int25 = functionType24.getMinArguments();
        int int26 = functionType24.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType24.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType28 = functionType24.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot30 = functionType24.getSlot("true");
        com.google.javascript.rhino.jstype.FunctionType functionType31 = functionType24.getOwnerFunction();
        java.lang.String str32 = functionType24.getReferenceName();
        com.google.javascript.rhino.Node node33 = functionType24.getRootNode();
        com.google.javascript.rhino.Node node34 = functionType24.getRootNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = serializableList12.add((java.io.Serializable) node34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertNotNull(serializableList12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertNull(staticSlot30);
        org.junit.Assert.assertNull(functionType31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1679");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = parameterizedType78.toDebugHashCodeString();
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1680");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        int int2 = typePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(1, "");
        node5.removeProp(4095);
        typePosition0.setItem(node5);
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(40, (int) (byte) 10, (int) (byte) -1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 40?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1681");
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
        com.google.javascript.rhino.jstype.EnumElementType enumElementType70 = parameterizedType63.toMaybeEnumElementType();
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
        org.junit.Assert.assertNull(enumElementType70);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1682");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        boolean boolean20 = serializableList17.equals((java.lang.Object) 16);
        java.lang.Object obj21 = null;
        boolean boolean22 = serializableList17.equals(obj21);
        java.lang.Object[] objArray23 = serializableList17.toArray();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator24 = serializableList17.spliterator();
        boolean boolean25 = serializableList17.isEmpty();
        java.util.stream.Stream<java.io.Serializable> serializableStream26 = serializableList17.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.io.Serializable> serializableItor28 = serializableList17.listIterator(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (52) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(serializableSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(serializableStream26);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1683");
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
        com.google.javascript.rhino.jstype.JSType jSType68 = parameterizedType63.collapseUnion();
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jSType68);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1684");
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
        int int38 = serializableList26.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor39 = serializableList26.listIterator();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean43 = node42.isObjectLit();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node47 = node42.copyInformationFromForTree(node46);
        boolean boolean48 = node46.isObjectLit();
        int int49 = serializableList26.lastIndexOf((java.lang.Object) boolean48);
        boolean boolean50 = serializableList26.isEmpty();
        java.lang.String str51 = serializableList26.toString();
        java.util.stream.Stream<java.io.Serializable> serializableStream52 = serializableList26.parallelStream();
        java.lang.String str53 = serializableList26.toString();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList54 = serializableList26.asList();
        java.util.ListIterator<java.io.Serializable> serializableItor55 = serializableList26.listIterator();
        boolean boolean56 = serializableList26.isEmpty();
        boolean boolean57 = strSet16.removeAll((java.util.Collection<java.io.Serializable>) serializableList26);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(serializableItor39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str51, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(serializableStream52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str53, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(serializableList54);
        org.junit.Assert.assertNotNull(serializableItor55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1685");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        java.lang.Object[] objArray12 = serializableList8.toArray();
        java.lang.Object obj13 = null;
        int int14 = serializableList8.indexOf(obj13);
        java.util.ListIterator<java.io.Serializable> serializableItor16 = serializableList8.listIterator((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList19 = serializableList8.subList(50, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (50) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(serializableItor16);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1686");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        node4.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node7 = node4.cloneTree();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(10, node7);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node8);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        boolean boolean27 = node25.isObjectLit();
        boolean boolean28 = node25.isFromExterns();
        boolean boolean29 = node25.wasEmptyNode();
        boolean boolean30 = node25.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship31 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node17, node25);
        boolean boolean32 = node25.isTypeOf();
        boolean boolean33 = node25.hasChildren();
        boolean boolean34 = node25.isFalse();
        com.google.javascript.rhino.Node node35 = node8.copyInformationFromForTree(node25);
        int int36 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(35, node25, node37, 16, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + subclassType10 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType10.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1687");
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
        java.util.Set<java.lang.String> strSet33 = objectType32.getPropertyNames();
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
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1688");
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
        boolean boolean44 = functionType40.isOrdinaryFunction();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1689");
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
        boolean boolean17 = functionType11.isOrdinaryFunction();
        boolean boolean18 = functionType11.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType11.getReturnType();
        boolean boolean21 = functionType11.hasOwnProperty("Named type with empty name component");
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
        boolean boolean39 = functionType33.isEmptyType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair40 = functionType11.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean41 = functionType11.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType11.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = functionType11.getTypeOfThis();
        functionType11.clearResolved();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(iterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(typePair40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(objectType43);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1690");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableList8.parallelStream();
        boolean boolean10 = serializableList8.isEmpty();
        boolean boolean11 = serializableList8.isEmpty();
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1691");
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
        boolean boolean17 = objectType16.isDateType();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = objectType16.getTypeOfThis();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType18);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1692");
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
        boolean boolean97 = enumType91.removeProperty("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        boolean boolean98 = enumType91.isNativeObjectType();
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
        org.junit.Assert.assertNull(jSDocInfo93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1693");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        boolean boolean12 = functionType11.isAllType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        jSTypeRegistry14.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry14.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        node25.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node28 = node25.cloneTree();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(10, node28);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry20.createFunctionType(jSType21, node29);
        jSTypeRegistry14.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType30);
        java.lang.String str32 = null; // flaky: functionType30.toString();
        boolean boolean33 = functionType30.isFunctionPrototypeType();
        boolean boolean34 = functionType30.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType30.getExtendedInterfaces();
        boolean boolean36 = functionType30.isReturnTypeInferred();
        boolean boolean37 = functionType30.isConstructor();
        boolean boolean38 = functionType11.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.Node node40 = functionType30.getPropertyNode("Named type with empty name component");
        boolean boolean41 = functionType30.isInterface();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(functionType30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Function" + "'", str32, "Function");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1694");
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
        boolean boolean68 = functionType33.hasOwnProperty("JSDocInfo");
        int int69 = functionType33.getMinArguments();
        com.google.javascript.rhino.Node node71 = functionType33.getPropertyNode("Function");
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNull(node71);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1695");
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
        boolean boolean94 = enumType91.isCheckedUnknownType();
        java.lang.Iterable iterable95 = enumType91.getCtorImplementedInterfaces();
        boolean boolean97 = enumType91.isPropertyInExterns("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType98 = enumType91.unboxesTo();
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(jSType98);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1696");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition1 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        org.junit.Assert.assertNull(nodeSourcePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1697");
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
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(100, "");
        node76.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node79 = node76.cloneTree();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(10, node79);
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry71.createFunctionType(jSType72, node80);
        int int82 = functionType81.getMinArguments();
        int int83 = functionType81.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType84 = functionType81.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType85 = functionType81.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType85);
        java.lang.String str87 = null; // flaky: functionType85.toString();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair88 = parameterizedType63.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType85);
        com.google.javascript.rhino.jstype.ObjectType objectType89 = parameterizedType63.getParentScope();
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
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertNotNull(objectType86);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Function" + "'", str87, "Function");
        org.junit.Assert.assertNotNull(typePair88);
        org.junit.Assert.assertNotNull(objectType89);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1698");
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
        boolean boolean41 = serializableList8.isEmpty();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList42 = serializableList8.asList();
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator43 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList8.replaceAll(serializableUnaryOperator43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(serializableList42);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1699");
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
        boolean boolean29 = node28.isThis();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str36 = node32.checkTreeEquals(node35);
        boolean boolean37 = node35.isCall();
        boolean boolean38 = node35.isNew();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.Bind bind41 = new com.google.javascript.jscomp.CodingConvention.Bind(node28, node35, node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node40);
        boolean boolean43 = node40.isFromExterns();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1700");
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
        com.google.javascript.rhino.jstype.TemplateType templateType14 = functionType11.toMaybeTemplateType();
        boolean boolean15 = functionType11.isUnknownType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(templateType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1701");
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
        boolean boolean98 = enumElementType96.isNominalType();
        boolean boolean99 = enumElementType96.isNominalType();
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
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1702");
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
        boolean boolean77 = functionType69.isPropertyInExterns("INSTANCEOF 49\n    OR \n");
        boolean boolean78 = functionType69.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumType enumType79 = functionType69.toMaybeEnumType();
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(enumType79);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1703");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Named type with empty name component", (int) '#', (-1));
        boolean boolean4 = node3.isDo();
        boolean boolean5 = node3.isDefaultCase();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1704");
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
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean26 = node25.isArrayLit();
        boolean boolean27 = node25.isName();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        int int31 = node30.getLineno();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = node34.copyInformationFromForTree(node38);
        boolean boolean40 = node38.isObjectLit();
        boolean boolean41 = node38.isLabelName();
        com.google.javascript.rhino.Node node42 = node30.srcrefTree(node38);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder43 = node42.new FileLevelJsDocBuilder();
        node42.setSourceEncodedPosition(45);
        java.lang.String str49 = node42.toString(false, true, false);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) '4', node53, 49, 45);
        com.google.javascript.rhino.InputId inputId57 = null;
        node53.setInputId(inputId57);
        node53.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId61 = com.google.javascript.jscomp.NodeUtil.getInputId(node53);
        boolean boolean62 = node53.isThis();
        boolean boolean63 = node42.isEquivalentTo(node53);
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceChild(node25, node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "OR " + "'", str49, "OR ");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1705");
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
        java.lang.Iterable iterable97 = enumType91.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType98 = enumType91.unboxesTo();
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
        org.junit.Assert.assertNotNull(iterable97);
        org.junit.Assert.assertNull(jSType98);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1706");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        node15.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node18 = node15.cloneTree();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(10, node18);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry10.createFunctionType(jSType11, node19);
        int int21 = functionType20.getMinArguments();
        int int22 = functionType20.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType23 = functionType20.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable24 = objectType23.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet25 = objectType23.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        boolean boolean27 = strSet25.remove((java.lang.Object) ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue7.or(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList37 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue38.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue36.and(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList50 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue51.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue49.and(ternaryValue52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str55 = ternaryValue54.toString();
        boolean boolean57 = ternaryValue54.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue54.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue53.or(ternaryValue54);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue41.or(ternaryValue53);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = ternaryValue39.or(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = ternaryValue7.or(ternaryValue61);
        java.lang.String str63 = ternaryValue62.toString();
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(objectTypeIterable24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(serializableList37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(serializableList50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "unknown" + "'", str55, "unknown");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(ternaryValue62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "true" + "'", str63, "true");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1707");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = node2.getExistingIntProp((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: -1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1708");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo0.hasParameter("Not declared as a constructor");
        boolean boolean3 = jSDocInfo0.isExpose();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection4 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(markerCollection4);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1709");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isFromExterns();
        boolean boolean10 = node6.wasEmptyNode();
        boolean boolean11 = node6.isObjectLit();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1710");
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
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType41.getImplicitPrototype();
        boolean boolean44 = functionType41.removeProperty("Named type with empty name component");
        boolean boolean45 = functionType41.hasAnyTemplateInternal();
        boolean boolean46 = functionType41.isNativeObjectType();
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
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1711");
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
        boolean boolean17 = functionType11.isNumberObjectType();
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
        java.lang.Iterable iterable47 = functionType29.getCtorImplementedInterfaces();
        boolean boolean48 = functionType11.hasEqualCallType(functionType29);
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = functionType29.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType29.getParameterType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet51 = jSType50.getPossibleToBooleanOutcomes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
        org.junit.Assert.assertNotNull(iterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(jSDocInfo49);
        org.junit.Assert.assertNull(jSType50);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1712");
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
        com.google.javascript.rhino.Node node97 = functionType96.getRootNode();
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
        org.junit.Assert.assertNull(node97);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1713");
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
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType38.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType38.getPropertyType("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        node51.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node54 = node51.cloneTree();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(10, node54);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry46.createFunctionType(jSType47, node55);
        int int57 = functionType56.getMinArguments();
        int int58 = functionType56.getPropertiesCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean61 = jSDocInfo60.isNoCompile();
        boolean boolean62 = jSDocInfo60.hasTypedefType();
        int int63 = jSDocInfo60.getImplementedInterfaceCount();
        functionType56.setPropertyJSDocInfo("", jSDocInfo60);
        boolean boolean65 = functionType38.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType56);
        boolean boolean66 = functionType38.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType38.getRestrictedTypeGivenToBooleanOutcome(false);
        java.util.Set<java.lang.String> strSet69 = functionType38.getOwnPropertyNames();
        boolean boolean70 = functionType38.isUnionType();
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
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1714");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        boolean boolean3 = jSDocInfo0.hasType();
        boolean boolean4 = jSDocInfo0.isJavaDispatch();
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1715");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(32);
        com.google.javascript.rhino.Node node2 = node1.removeChildren();
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1716");
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
        boolean boolean94 = parameterizedType63.isFunctionPrototypeType();
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1717");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 1.0f);
        java.lang.Object obj5 = node3.getProp(30);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(40, node3, (int) (short) -1, 31);
        boolean boolean9 = node8.wasEmptyNode();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(2, node8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node10.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1718");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        int int12 = serializableList8.size();
        java.util.stream.Stream<java.io.Serializable> serializableStream13 = serializableList8.parallelStream();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}", (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = serializableList8.add((java.io.Serializable) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(serializableStream13);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1719");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        node2.setLineno(4095);
        boolean boolean13 = node2.hasOneChild();
        node2.putBooleanProp(0, true);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1720");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean5 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray7 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType8 = jSTypeRegistry1.createUnionType(jSTypeNativeArray7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = jSTypeRegistry1.createAnonymousObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable12 = jSTypeRegistry1.getTypesWithProperty("hi!");
        jSTypeRegistry1.incrementGeneration();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray7);
        org.junit.Assert.assertNotNull(jSType8);
        org.junit.Assert.assertNotNull(objectType9);
        org.junit.Assert.assertNotNull(objectType10);
        org.junit.Assert.assertNotNull(jSTypeIterable12);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1721");
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
        boolean boolean45 = strSet44.isEmpty();
        int int46 = strSet44.size();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1722");
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
        boolean boolean19 = node14.getBooleanProp((int) (short) -1);
        boolean boolean20 = node14.isIf();
        boolean boolean21 = node14.isTry();
        // The following exception was thrown during execution in test generation
        try {
            node14.setDouble((double) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: OR  is not a string node");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1723");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo15.getEnumParameterType();
        boolean boolean21 = jSDocInfo15.hasTypedefType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1724");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        stringPosition0.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        int int4 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("unknown");
        stringPosition0.setPositionInformation(50, 32, 50, 39);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1725");
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
        boolean boolean17 = functionType11.isOrdinaryFunction();
        boolean boolean18 = functionType11.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType11.getReturnType();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        jSTypeRegistry22.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = jSTypeRegistry22.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        jSTypeRegistry22.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType38);
        java.lang.String str40 = null; // flaky: functionType38.toString();
        boolean boolean41 = functionType38.isFunctionPrototypeType();
        boolean boolean42 = functionType38.isString();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList43 = functionType38.getSubTypes();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType44 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.isObjectLit();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node52 = node47.copyInformationFromForTree(node51);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean56 = node55.isObjectLit();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node60 = node55.copyInformationFromForTree(node59);
        boolean boolean61 = node59.isObjectLit();
        boolean boolean62 = node59.isFromExterns();
        boolean boolean63 = node59.wasEmptyNode();
        boolean boolean64 = node59.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship65 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType44, node51, node59);
        com.google.javascript.rhino.Node node66 = node59.cloneNode();
        boolean boolean67 = node66.isDelProp();
        boolean boolean68 = functionType11.defineDeclaredProperty("Function", (com.google.javascript.rhino.jstype.JSType) functionType38, node66);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        node71.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node74 = node71.cloneTree();
        int int75 = node71.getLineno();
        boolean boolean76 = node71.isReturn();
        node71.setType(31);
        boolean boolean79 = node71.isVoid();
        com.google.javascript.rhino.Node node80 = node66.copyInformationFromForTree(node71);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "Function", (int) '#', 44);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(0, node86);
        boolean boolean88 = node86.isInc();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node89 = node80.removeChildAfter(node86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Function" + "'", str40, "Function");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(functionTypeList43);
        org.junit.Assert.assertTrue("'" + subclassType44 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType44.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1726");
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
        int int21 = functionType11.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType.Property property23 = functionType11.getSlot("true");
        com.google.javascript.rhino.jstype.FunctionType functionType25 = functionType11.getBindReturnType(2);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable26 = functionType11.getAllExtendedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(property23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertNotNull(objectTypeIterable26);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1727");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        java.lang.Object[] objArray19 = serializableList8.toArray();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList29 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue28);
        boolean boolean31 = serializableList29.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = serializableList8.addAll(36, (java.util.Collection<java.io.Serializable>) serializableList29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(serializableList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1728");
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
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        boolean boolean30 = node28.isSetterDef();
        boolean boolean31 = node28.isString();
        com.google.javascript.rhino.Node node32 = node15.useSourceInfoIfMissingFrom(node28);
        boolean boolean33 = node32.isDelProp();
        boolean boolean34 = node32.isDebugger();
        int int35 = node32.getLength();
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1729");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable13 = jSTypeRegistry1.getTypesWithProperty("hi!");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.isNoCompile();
        boolean boolean31 = jSDocInfo29.hasTypedefType();
        int int32 = jSDocInfo29.getImplementedInterfaceCount();
        functionType25.setPropertyJSDocInfo("", jSDocInfo29);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet34 = functionType25.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        int int47 = functionType46.getMinArguments();
        boolean boolean48 = functionType46.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType46.getImplementedInterfaces();
        java.lang.Iterable iterable50 = functionType46.getCtorImplementedInterfaces();
        boolean boolean51 = functionType46.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean53 = jSDocInfo52.isNoCompile();
        boolean boolean54 = jSDocInfo52.hasTypedefType();
        functionType46.setJSDocInfo(jSDocInfo52);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry1.createFunctionTypeWithNewReturnType(functionType25, (com.google.javascript.rhino.jstype.JSType) functionType46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType56.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet34 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet34.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNotNull(iterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(functionType56);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1730");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "OR  [slash_v: [10, 1, 4, -1, a, 100.0, 100.0, true]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1731");
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable65 = functionType50.getParameters();
        boolean boolean67 = functionType50.isPropertyInExterns("Function.<Function>");
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
        org.junit.Assert.assertNotNull(nodeIterable65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1732");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getAuthors();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.hasType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1733");
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
        com.google.javascript.rhino.jstype.JSType jSType68 = parameterizedType63.getPropertyType("");
        java.util.Set set69 = parameterizedType63.getOwnPropertyNames();
        boolean boolean71 = parameterizedType63.isPropertyTypeDeclared("false");
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
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1734");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        jSDocInfo0.setLicense("");
        boolean boolean7 = jSDocInfo0.isDeprecated();
        boolean boolean8 = jSDocInfo0.isConstant();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1735");
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
        boolean boolean17 = functionType11.isOrdinaryFunction();
        boolean boolean18 = functionType11.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType11.getReturnType();
        boolean boolean21 = functionType11.hasOwnProperty("Named type with empty name component");
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
        boolean boolean39 = functionType33.isEmptyType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair40 = functionType11.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean41 = functionType11.matchesNumberContext();
        boolean boolean42 = functionType11.isCheckedUnknownType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertNotNull(iterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(typePair40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1736");
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
        boolean boolean92 = parameterizedType63.isNoObjectType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet93 = parameterizedType63.getPossibleToBooleanOutcomes();
        boolean boolean95 = parameterizedType63.hasProperty("java.io.IOException: Named type with empty name component");
        boolean boolean96 = parameterizedType63.isBooleanObjectType();
        boolean boolean97 = parameterizedType63.isOrdinaryFunction();
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
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet93 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet93.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1737");
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
        com.google.javascript.rhino.jstype.FunctionType functionType70 = parameterizedType63.toMaybeFunctionType();
        boolean boolean71 = parameterizedType63.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.ObjectType.Property property73 = parameterizedType63.getSlot("java.io.IOException: Named type with empty name component");
        com.google.javascript.rhino.jstype.EnumType enumType74 = parameterizedType63.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType75 = parameterizedType63.getParameterType();
        boolean boolean76 = parameterizedType63.isOrdinaryFunction();
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
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(property73);
        org.junit.Assert.assertNull(enumType74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1738");
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
        com.google.javascript.rhino.jstype.JSType jSType94 = enumType91.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = enumType91.getImplicitPrototype();
        java.lang.String str96 = enumType91.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType97 = enumType91.toMaybeUnionType();
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
        org.junit.Assert.assertNull(jSType94);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}" + "'", str96, "enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
        org.junit.Assert.assertNull(unionType97);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1739");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node13.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection20 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node13);
        com.google.javascript.rhino.Node node21 = node2.clonePropsFrom(node13);
        java.lang.String str25 = node2.toString(false, false, false);
        boolean boolean26 = node2.isObjectLit();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeCollection20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OR " + "'", str25, "OR ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1740");
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
        boolean boolean97 = enumElementType96.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType98 = enumElementType96.getConstructor();
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
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(functionType98);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1741");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList11 = serializableList8.asList();
        java.lang.Object[] objArray12 = serializableList8.toArray();
        java.lang.Object obj13 = null;
        int int14 = serializableList8.indexOf(obj13);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = serializableList8.subList(0, (int) (short) 0);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        node25.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node28 = node25.cloneTree();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(10, node28);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry20.createFunctionType(jSType21, node29);
        int int31 = functionType30.getMinArguments();
        boolean boolean32 = functionType30.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType30.restrictByNotNullOrUndefined();
        boolean boolean34 = jSType33.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        int int47 = functionType46.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.findPropertyType("Named type with empty name component");
        boolean boolean50 = jSType33.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType46);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable51 = serializableList8.set(42, (java.io.Serializable) functionType46);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1742");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        boolean boolean10 = serializableList8.equals((java.lang.Object) (byte) 1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList19 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList28 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue27);
        boolean boolean29 = serializableList19.containsAll((java.util.Collection<java.io.Serializable>) serializableList28);
        boolean boolean31 = serializableList28.equals((java.lang.Object) 16);
        java.lang.Object obj32 = null;
        boolean boolean33 = serializableList28.equals(obj32);
        java.lang.Object[] objArray34 = serializableList28.toArray();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator35 = serializableList28.spliterator();
        java.io.Serializable serializable37 = serializableList28.get((int) (short) 1);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator38 = serializableList28.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = serializableList8.removeAll((java.util.Collection<java.io.Serializable>) serializableList28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(serializableList19);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(serializableList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(serializableSpliterator35);
        org.junit.Assert.assertEquals("'" + serializable37 + "' != '" + (short) 1 + "'", serializable37, (short) 1);
        org.junit.Assert.assertNotNull(serializableSpliterator38);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1743");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(12, 37, 46);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        int int8 = node7.getLineno();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isLabelName();
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node15);
        boolean boolean20 = node19.isRegExp();
        boolean boolean21 = node19.isIn();
        com.google.javascript.rhino.Node node22 = node4.copyInformationFrom(node19);
        boolean boolean23 = node4.wasEmptyNode();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) '4', node27, 49, 45);
        com.google.javascript.rhino.InputId inputId31 = null;
        node27.setInputId(inputId31);
        node27.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId35 = com.google.javascript.jscomp.NodeUtil.getInputId(node27);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(49, node4, node27, node36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId35);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1744");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(32);
        node1.setSourceEncodedPosition(4);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        int int8 = node7.getLineno();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node15.isObjectLit();
        boolean boolean18 = node15.isLabelName();
        com.google.javascript.rhino.Node node19 = node7.srcrefTree(node15);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node19.new FileLevelJsDocBuilder();
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node19);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable22 = node19.getAncestors();
        boolean boolean23 = node19.isNumber();
        java.lang.Object obj25 = node19.getProp((int) (short) -1);
        node1.putProp((int) (short) 0, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1745");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative59 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry1.getNativeType(jSTypeNative59);
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
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1746");
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
        com.google.javascript.rhino.jstype.JSType jSType94 = enumType91.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = enumType91.getImplicitPrototype();
        boolean boolean96 = objectType95.isOrdinaryFunction();
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
        org.junit.Assert.assertNull(jSType94);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1747");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str7 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1748");
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
        com.google.javascript.rhino.jstype.JSType jSType94 = enumType91.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property96 = enumType91.getSlot("java.io.IOException: ");
        java.lang.String str97 = enumType91.toAnnotationString();
        boolean boolean98 = enumType91.isCheckedUnknownType();
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
        org.junit.Assert.assertNull(jSType94);
        org.junit.Assert.assertNull(property96);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Object" + "'", str97, "Object");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1749");
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
        boolean boolean17 = objectType14.isBooleanValueType();
        boolean boolean18 = objectType14.isNoObjectType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1750");
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
        boolean boolean94 = enumType91.isCheckedUnknownType();
        java.lang.Iterable iterable95 = enumType91.getCtorImplementedInterfaces();
        boolean boolean97 = enumType91.isPropertyInExterns("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType98 = enumType91.getImplicitPrototype();
        java.lang.String str99 = enumType91.getReferenceName();
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(objectType98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}" + "'", str99, "enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1751");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(35);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1752");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node3.isTry();
        node3.setLength(4);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node3.getJsDocBuilderForNode();
        boolean boolean13 = node3.isFor();
        boolean boolean14 = node3.isName();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        int int18 = node17.getLineno();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        boolean boolean27 = node25.isObjectLit();
        boolean boolean28 = node25.isLabelName();
        com.google.javascript.rhino.Node node29 = node17.srcrefTree(node25);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder30 = node29.new FileLevelJsDocBuilder();
        node29.setSourceEncodedPosition(45);
        boolean boolean33 = node29.isThrow();
        boolean boolean34 = node29.isString();
        java.lang.String str35 = node29.getString();
        com.google.javascript.rhino.Node node36 = node29.cloneTree();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = node36.getStaticSourceFile();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        node40.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node43 = node40.cloneTree();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean48 = node47.isObjectLit();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node52 = node47.copyInformationFromForTree(node51);
        boolean boolean53 = node51.isObjectLit();
        boolean boolean54 = node51.isSwitch();
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node51);
        boolean boolean56 = node51.isDec();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean60 = node59.isObjectLit();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node64 = node59.copyInformationFromForTree(node63);
        boolean boolean65 = node59.isComma();
        java.lang.String str66 = node59.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType67 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean71 = node70.isObjectLit();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node75 = node70.copyInformationFromForTree(node74);
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean79 = node78.isObjectLit();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node83 = node78.copyInformationFromForTree(node82);
        boolean boolean84 = node82.isObjectLit();
        boolean boolean85 = node82.isFromExterns();
        boolean boolean86 = node82.wasEmptyNode();
        boolean boolean87 = node82.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship88 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType67, node74, node82);
        boolean boolean89 = node82.hasMoreThanOneChild();
        boolean boolean90 = node82.isThis();
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(35, node51, node59, node82);
        com.google.javascript.rhino.Node node92 = node91.getLastChild();
        boolean boolean93 = node43.isEquivalentToTyped(node91);
        com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node(32, node3, node36, node91, 37, 0);
        boolean boolean97 = node3.isFunction();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(staticSourceFile37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "OR \n" + "'", str66, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType67 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType67.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1753");
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
        java.lang.String str42 = functionType38.getReferenceName();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot44 = functionType38.getSlot("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType38.getReturnType();
        jSType45.clearResolved();
        boolean boolean47 = jSType45.matchesObjectContext();
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(staticSlot44);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1754");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        node3.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node6 = node3.cloneTree();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(10, node6);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node7);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType9 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = node12.copyInformationFromForTree(node16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node24.isObjectLit();
        boolean boolean27 = node24.isFromExterns();
        boolean boolean28 = node24.wasEmptyNode();
        boolean boolean29 = node24.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship30 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType9, node16, node24);
        boolean boolean31 = node24.isTypeOf();
        boolean boolean32 = node24.hasChildren();
        boolean boolean33 = node24.isFalse();
        com.google.javascript.rhino.Node node34 = node7.copyInformationFromForTree(node24);
        int int35 = node24.getSourceOffset();
        boolean boolean36 = node24.isCase();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + subclassType9 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType9.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1755");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        jSTypeRegistry3.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable6 = jSTypeRegistry3.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        node14.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node17 = node14.cloneTree();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(10, node17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry9.createFunctionType(jSType10, node18);
        jSTypeRegistry3.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType19);
        java.lang.String str21 = null; // flaky: functionType19.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = null;
        functionType19.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo23);
        boolean boolean25 = functionType19.hasCachedValues();
        boolean boolean26 = functionType19.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType28 = functionType19.getBindReturnType(1);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        node35.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node38 = node35.cloneTree();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(10, node38);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry30.createFunctionType(jSType31, node39);
        int int41 = functionType40.getMinArguments();
        boolean boolean42 = functionType40.matchesStringContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = functionType28.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList52 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue51);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        node59.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node62 = node59.cloneTree();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(10, node62);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry54.createFunctionType(jSType55, node63);
        int int65 = functionType64.getMinArguments();
        int int66 = functionType64.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = functionType64.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable68 = objectType67.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet69 = objectType67.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        boolean boolean71 = strSet69.remove((java.lang.Object) ternaryValue70);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = ternaryValue51.or(ternaryValue70);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = ternaryValue43.xor(ternaryValue72);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = ternaryValue72.or(ternaryValue75);
        boolean boolean78 = ternaryValue76.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = ternaryValue1.xor(ternaryValue76);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(objectTypeIterable6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Function" + "'", str21, "Function");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(serializableList52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectTypeIterable68);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(ternaryValue79);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1756");
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
        int int25 = functionType11.getMinArguments();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1757");
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
        com.google.javascript.rhino.jstype.FunctionType functionType16 = objectType14.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        node23.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node26 = node23.cloneTree();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(10, node26);
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry18.createFunctionType(jSType19, node27);
        int int29 = functionType28.getMinArguments();
        int int30 = functionType28.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType31 = functionType28.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = objectType31.getCtorExtendedInterfaces();
        objectType14.matchConstraint(objectType31);
        boolean boolean35 = objectType14.hasProperty("(enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]})");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNull(functionType16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1758");
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
        boolean boolean77 = node49.isTry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = node49.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpect prop id 8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1759");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean14 = node13.isObjectLit();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node13.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection20 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node13);
        com.google.javascript.rhino.Node node21 = node2.clonePropsFrom(node13);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean26 = node25.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node25);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean31 = node30.isObjectLit();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node35 = node30.copyInformationFromForTree(node34);
        boolean boolean36 = node30.isTry();
        node30.setOptionalArg(false);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = node41.copyInformationFromForTree(node45);
        boolean boolean47 = node41.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection48 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node41);
        com.google.javascript.rhino.Node node49 = node30.clonePropsFrom(node41);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(36, node27, node49);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean54 = node53.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newExpr(node53);
        com.google.javascript.rhino.Node node56 = node50.clonePropsFrom(node55);
        com.google.javascript.rhino.InputId inputId58 = new com.google.javascript.rhino.InputId("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        node56.setInputId(inputId58);
        node2.setInputId(inputId58);
        com.google.javascript.rhino.Node node61 = node2.cloneNode();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeCollection20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeCollection48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node61);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1760");
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder1 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder2 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder4 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder5 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList7 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder0, serializableCollectionBuilder1, serializableCollectionBuilder2, serializableCollectionBuilder3, serializableCollectionBuilder4, serializableCollectionBuilder5, serializableCollectionBuilder6);
        com.google.common.collect.ImmutableList<java.util.Collection<java.io.Serializable>> serializableCollectionList8 = serializableCollectionBuilder4.build();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder9 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder10 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder11 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder12 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder13 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder14 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder15 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList16 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder9, serializableCollectionBuilder10, serializableCollectionBuilder11, serializableCollectionBuilder12, serializableCollectionBuilder13, serializableCollectionBuilder14, serializableCollectionBuilder15);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder17 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder18 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder19 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder20 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder21 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder22 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder23 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList24 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder17, serializableCollectionBuilder18, serializableCollectionBuilder19, serializableCollectionBuilder20, serializableCollectionBuilder21, serializableCollectionBuilder22, serializableCollectionBuilder23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList33 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue32);
        boolean boolean34 = serializableList33.isEmpty();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder35 = serializableCollectionBuilder23.add((java.util.Collection<java.io.Serializable>) serializableList33);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList36 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder4, serializableCollectionBuilder15, serializableCollectionBuilder35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList45 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue44);
        boolean boolean47 = serializableList45.equals((java.lang.Object) (byte) 1);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList48 = serializableList45.asList();
        java.lang.Object[] objArray49 = serializableList45.toArray();
        java.lang.Object obj50 = null;
        int int51 = serializableList45.indexOf(obj50);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList54 = serializableList45.subList(0, (int) (short) 0);
        boolean boolean55 = serializableList45.isEmpty();
        java.lang.String str56 = serializableList45.toString();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder57 = serializableCollectionBuilder35.add((java.util.Collection<java.io.Serializable>) serializableList45);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(serializableCollectionList8);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList16);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList24);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(serializableList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder35);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList36);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(serializableList45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(serializableList48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(serializableList54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str56, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(serializableCollectionBuilder57);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1761");
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
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry39.createNamedType("function (...[Function]): Function", "", (int) (short) 0, 130);
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
        org.junit.Assert.assertNotNull(jSType48);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1762");
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
        boolean boolean54 = node34.isExprResult();
        boolean boolean55 = node34.hasOneChild();
        com.google.javascript.rhino.InputId inputId56 = com.google.javascript.jscomp.NodeUtil.getInputId(node34);
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(inputId56);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1763");
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
        boolean boolean45 = functionType35.isEnumType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = functionType35.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1764");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str6 = node2.checkTreeEquals(node5);
        boolean boolean7 = node2.hasOneChild();
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1765");
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
        com.google.javascript.rhino.jstype.JSType jSType68 = parameterizedType63.getPropertyType("");
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
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(jSType68);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1766");
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
        java.lang.Object[] objArray18 = strSet16.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = strSet16.add("(InputId: Not declared as a constructor)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1767");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
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
        boolean boolean25 = node18.isTypeOf();
        com.google.javascript.rhino.Node node26 = assertionFunctionSpec2.getAssertedParam(node18);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean30 = node29.isObjectLit();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = node29.copyInformationFromForTree(node33);
        boolean boolean35 = node33.isObjectLit();
        node33.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType42 = assertionFunctionSpec2.getAssertedType(node33, jSTypeRegistry40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean46 = node45.isObjectLit();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node50 = node45.copyInformationFromForTree(node49);
        boolean boolean51 = node45.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection52 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node45);
        com.google.javascript.rhino.Node node53 = assertionFunctionSpec2.getAssertedParam(node45);
        java.lang.String str54 = assertionFunctionSpec2.getFunctionName();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean58 = node57.isArrayLit();
        int int59 = node57.getSourceOffset();
        boolean boolean60 = node57.isAdd();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        jSTypeRegistry62.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = jSTypeRegistry62.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean66 = jSTypeRegistry62.shouldTolerateUndefinedValues();
        jSTypeRegistry62.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray68 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry62.createUnionType(jSTypeNativeArray68);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry62.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType71 = jSTypeRegistry62.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType72 = assertionFunctionSpec2.getAssertedType(node57, jSTypeRegistry62);
        boolean boolean73 = node57.isTry();
        int int74 = node57.getSideEffectFlags();
        boolean boolean75 = node57.isAssign();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean79 = node78.isObjectLit();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node83 = node78.copyInformationFromForTree(node82);
        boolean boolean84 = node78.isComma();
        com.google.javascript.rhino.JSDocInfo jSDocInfo85 = node78.getJSDocInfo();
        boolean boolean86 = node78.isSwitch();
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString(100, "");
        node90.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node93 = node90.cloneTree();
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node(10, node93);
        boolean boolean95 = node93.isAdd();
        com.google.javascript.rhino.Node node96 = node78.useSourceInfoIfMissingFromForTree(node93);
        com.google.javascript.rhino.Node node99 = new com.google.javascript.rhino.Node(100, node57, node78, (-2147483648), (int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(nodeCollection52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "INSTANCEOF 49\n    OR \n" + "'", str54, "INSTANCEOF 49\n    OR \n");
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray68);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(jSDocInfo85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(node96);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1768");
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
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType11.getParameterType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType11, "");
        boolean boolean25 = functionType11.hasInstanceType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType26 = functionType11.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1769");
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
        boolean boolean78 = functionType69.isInstanceType();
        boolean boolean79 = functionType69.isOrdinaryFunction();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = functionType69.getJSDocInfo();
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
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(jSDocInfo80);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1770");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        jSDocInfo0.setDeprecated(false);
        boolean boolean6 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1771");
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
        java.lang.String str27 = node22.getQualifiedName();
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
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1772");
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
        com.google.javascript.rhino.jstype.JSType jSType66 = parameterizedType63.getParameterType();
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
        org.junit.Assert.assertNotNull(jSType66);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1773");
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
        int int57 = functionType53.getPropertiesCount();
        boolean boolean59 = functionType53.isPropertyTypeDeclared("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType53.getOwnerFunction();
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(functionType60);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1774");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        int int4 = node3.getLineno();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean8 = node7.isObjectLit();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node12 = node7.copyInformationFromForTree(node11);
        boolean boolean13 = node11.isObjectLit();
        boolean boolean14 = node11.isLabelName();
        com.google.javascript.rhino.Node node15 = node3.srcrefTree(node11);
        com.google.javascript.rhino.jstype.JSType jSType16 = node15.getJSType();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(44, node15, node19);
        boolean boolean22 = node19.isStringKey();
        boolean boolean23 = node19.isWith();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1775");
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
        boolean boolean56 = functionType46.matchesObjectContext();
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType46.autoboxesTo();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable58 = functionType46.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType46.getImplicitPrototype();
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(jSType57);
        org.junit.Assert.assertNotNull(objectTypeIterable58);
        org.junit.Assert.assertNotNull(objectType59);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1776");
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
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType41.getImplicitPrototype();
        boolean boolean44 = functionType41.removeProperty("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType41.getPropertyType("(INSTANCEOF 49\n    OR \n)");
        boolean boolean47 = functionType41.hasDisplayName();
        com.google.javascript.rhino.Node node49 = functionType41.getPropertyNode("(enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]})");
        boolean boolean50 = functionType41.isAllType();
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
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1777");
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
        boolean boolean29 = functionType11.isNoType();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        node36.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node39 = node36.cloneTree();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(10, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry31.createFunctionType(jSType32, node40);
        int int42 = functionType41.getMinArguments();
        int int43 = functionType41.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType41.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        node51.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node54 = node51.cloneTree();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(10, node54);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry46.createFunctionType(jSType47, node55);
        int int57 = functionType56.getMinArguments();
        boolean boolean58 = functionType41.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType56);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope59 = functionType56.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType11.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType56);
        boolean boolean61 = functionType56.hasCachedValues();
        boolean boolean63 = functionType56.isPropertyTypeDeclared("InputId: Not declared as a constructor");
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
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1778");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = functionType24.getPossibleToBooleanOutcomes();
        boolean boolean40 = functionType24.isTemplateType();
        boolean boolean41 = functionType24.isEnumElementType();
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
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1779");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) '#');
        boolean boolean2 = node1.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = node1.checkTreeEquals(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1780");
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
        boolean boolean23 = node14.isOr();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node14.siblings();
        boolean boolean25 = node14.isComma();
        boolean boolean26 = node14.hasMoreThanOneChild();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1781");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isDefine();
        boolean boolean5 = jSDocInfo0.isExterns();
        java.lang.String str6 = jSDocInfo0.getLendsName();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1782");
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
        boolean boolean93 = enumType91.removeProperty("hi!");
        boolean boolean94 = enumType91.hasCachedValues();
        boolean boolean96 = enumType91.isPropertyInExterns("java.io.IOException: Named type with empty name component");
        boolean boolean97 = enumType91.isNullable();
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1783");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        int int4 = node3.getLineno();
        boolean boolean5 = node3.isLabelName();
        boolean boolean6 = node3.isNumber();
        com.google.javascript.rhino.Node[] nodeArray7 = new com.google.javascript.rhino.Node[] { node3 };
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0, nodeArray7, 12, 41);
        boolean boolean11 = node10.isEmpty();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1784");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        java.lang.String str11 = node2.getSourceFileName();
        node2.setVarArgs(true);
        com.google.javascript.rhino.Node node14 = node2.getNext();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo15 = node14.getJSDocInfo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1785");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setOptionalArg(false);
        boolean boolean11 = node2.isNull();
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
        node2.putProp((int) '4', (java.lang.Object) node35);
        boolean boolean37 = node2.isCall();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1786");
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
        com.google.javascript.rhino.jstype.FunctionType functionType67 = parameterizedType63.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = functionType67.isNumberValueType();
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
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNull(functionType67);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1787");
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
        boolean boolean64 = parameterizedType63.isAllType();
        java.lang.String str65 = null; // flaky: parameterizedType63.toString();
        boolean boolean66 = parameterizedType63.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.UnionType unionType67 = parameterizedType63.toMaybeUnionType();
        com.google.javascript.rhino.jstype.FunctionType functionType68 = parameterizedType63.getConstructor();
        boolean boolean69 = parameterizedType63.canBeCalled();
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Function.<Function>" + "'", str65, "Function.<Function>");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(unionType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1788");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList20 = com.google.common.collect.ImmutableList.of(booleanLiteralSet19);
        boolean boolean21 = serializableList17.equals((java.lang.Object) booleanLiteralSet19);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList22 = serializableList17.asList();
        java.lang.String str23 = serializableList22.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25);
        jSTypeRegistry26.clearNamedTypes();
        // The following exception was thrown during execution in test generation
        try {
            serializableList22.add(8, (java.io.Serializable) jSTypeRegistry26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str23, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1789");
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
        jSTypeRegistry1.clearNamedTypes();
        java.util.List<java.lang.String> strList21 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.setTemplateTypeNames(strList21);
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
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1790");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        int int5 = jSDocInfo0.getParameterCount();
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getReferences();
        jSDocInfo0.addSuppression("java.io.IOException: java.io.IOException: ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strCollection6);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1791");
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
        java.lang.String str42 = functionType38.getReferenceName();
        boolean boolean44 = functionType38.isPropertyInExterns("Unknown class name");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = functionType38.toDebugHashCodeString();
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1792");
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
        com.google.javascript.rhino.jstype.ObjectType objectType20 = jSTypeRegistry1.createAnonymousObjectType();
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
        jSTypeRegistry37.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        node49.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node52 = node49.cloneTree();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(10, node52);
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry44.createFunctionType(jSType45, node53);
        int int55 = functionType54.getMinArguments();
        int int56 = functionType54.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType57 = functionType54.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable58 = objectType57.getCtorExtendedInterfaces();
        boolean boolean60 = objectType57.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        node67.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node70 = node67.cloneTree();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(10, node70);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry62.createFunctionType(jSType63, node71);
        int int73 = functionType72.getMinArguments();
        boolean boolean74 = functionType72.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType72.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] { jSType75 };
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry37.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType57, jSTypeArray76);
        com.google.javascript.rhino.Node node78 = jSTypeRegistry22.createParameters(jSTypeArray76);
        com.google.javascript.rhino.Node node79 = jSTypeRegistry1.createOptionalParameters(jSTypeArray76);
        jSTypeRegistry1.setLastGeneration(true);
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertNotNull(objectTypeIterable40);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(objectTypeIterable58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node79);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1793");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isSwitch();
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node6);
        boolean boolean11 = node6.isDec();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(1, "");
        boolean boolean15 = node14.isFalse();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node6.checkTreeEquals(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1794");
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
        int int50 = strSet24.size();
        java.util.Spliterator<java.lang.String> strSpliterator51 = strSet24.spliterator();
        java.io.IOException iOException53 = new java.io.IOException("");
        java.lang.Throwable throwable55 = null;
        java.io.IOException iOException56 = new java.io.IOException("hi!", throwable55);
        java.lang.Throwable throwable58 = null;
        java.io.IOException iOException59 = new java.io.IOException("hi!", throwable58);
        java.io.IOException iOException61 = new java.io.IOException("");
        java.io.IOException iOException62 = new java.io.IOException((java.lang.Throwable) iOException61);
        java.io.IOException iOException64 = new java.io.IOException("");
        java.io.IOException iOException65 = new java.io.IOException((java.lang.Throwable) iOException64);
        java.io.IOException iOException67 = new java.io.IOException("");
        java.io.IOException iOException68 = new java.io.IOException((java.lang.Throwable) iOException67);
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList69 = com.google.common.collect.ImmutableList.of(iOException53, iOException56, iOException59, iOException62, iOException65, iOException68);
        java.io.IOException iOException71 = new java.io.IOException("");
        java.lang.Throwable throwable73 = null;
        java.io.IOException iOException74 = new java.io.IOException("hi!", throwable73);
        java.lang.Throwable throwable76 = null;
        java.io.IOException iOException77 = new java.io.IOException("hi!", throwable76);
        java.io.IOException iOException79 = new java.io.IOException("");
        java.io.IOException iOException80 = new java.io.IOException((java.lang.Throwable) iOException79);
        java.io.IOException iOException82 = new java.io.IOException("");
        java.io.IOException iOException83 = new java.io.IOException((java.lang.Throwable) iOException82);
        java.io.IOException iOException85 = new java.io.IOException("");
        java.io.IOException iOException86 = new java.io.IOException((java.lang.Throwable) iOException85);
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList87 = com.google.common.collect.ImmutableList.of(iOException71, iOException74, iOException77, iOException80, iOException83, iOException86);
        iOException53.addSuppressed((java.lang.Throwable) iOException71);
        java.io.IOException iOException89 = new java.io.IOException((java.lang.Throwable) iOException71);
        java.lang.Throwable[] throwableArray90 = iOException71.getSuppressed();
        java.io.IOException iOException92 = new java.io.IOException("java.io.IOException: Function");
        iOException71.addSuppressed((java.lang.Throwable) iOException92);
        java.lang.Throwable[] throwableArray94 = iOException92.getSuppressed();
        java.lang.Throwable[] throwableArray95 = strSet24.toArray(throwableArray94);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(strSpliterator51);
        org.junit.Assert.assertNotNull(iOExceptionList69);
        org.junit.Assert.assertNotNull(iOExceptionList87);
        org.junit.Assert.assertNotNull(throwableArray90);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray95);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1795");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isLabelName();
        boolean boolean5 = node2.isNumber();
        boolean boolean6 = node2.isObjectLit();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec8 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType9 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean13 = node12.isObjectLit();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node17 = node12.copyInformationFromForTree(node16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node25 = node20.copyInformationFromForTree(node24);
        boolean boolean26 = node24.isObjectLit();
        boolean boolean27 = node24.isFromExterns();
        boolean boolean28 = node24.wasEmptyNode();
        boolean boolean29 = node24.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship30 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType9, node16, node24);
        boolean boolean31 = node24.isTypeOf();
        com.google.javascript.rhino.Node node32 = assertionFunctionSpec8.getAssertedParam(node24);
        int int33 = node24.getChildCount();
        node2.addChildrenToBack(node24);
        boolean boolean35 = node24.isParamList();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + subclassType9 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType9.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1796");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        java.lang.String str4 = ternaryValue3.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str6 = ternaryValue5.toString();
        boolean boolean8 = ternaryValue5.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue3.and(ternaryValue5);
        java.lang.String str10 = ternaryValue3.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unknown" + "'", str6, "unknown");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "true" + "'", str10, "true");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1797");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        com.google.javascript.rhino.Node node8 = node7.cloneTree();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        int int12 = node11.getLineno();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        boolean boolean21 = node19.isObjectLit();
        boolean boolean22 = node19.isLabelName();
        com.google.javascript.rhino.Node node23 = node11.srcrefTree(node19);
        boolean boolean24 = node19.isNumber();
        node8.addChildToFront(node19);
        boolean boolean26 = node19.isQualifiedName();
        node19.detachChildren();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        int int31 = node30.getLineno();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean35 = node34.isObjectLit();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node39 = node34.copyInformationFromForTree(node38);
        boolean boolean40 = node38.isObjectLit();
        boolean boolean41 = node38.isLabelName();
        com.google.javascript.rhino.Node node42 = node30.srcrefTree(node38);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder43 = node42.new FileLevelJsDocBuilder();
        java.lang.String str44 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node42);
        boolean boolean45 = node19.isEquivalentTo(node42);
        boolean boolean46 = node19.isIn();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1798");
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
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry1.getType("BITXOR \n    OR \n");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative64 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry1.getNativeType(jSTypeNative64);
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
        org.junit.Assert.assertNull(jSType63);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1799");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        boolean boolean15 = node14.isRegExp();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean20 = node19.isObjectLit();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node24 = node19.copyInformationFromForTree(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean28 = node27.isObjectLit();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node32 = node27.copyInformationFromForTree(node31);
        boolean boolean33 = node31.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = node36.copyInformationFromForTree(node40);
        boolean boolean42 = node41.isTrue();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(41, node19, node31, node41);
        com.google.javascript.rhino.Node node44 = node14.srcref(node41);
        boolean boolean45 = node14.isString();
        boolean boolean46 = node14.wasEmptyNode();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test1800");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = functionType11.getCtorExtendedInterfaces();
        boolean boolean17 = functionType11.hasProperty("STRING Not declared as a type name 32\n");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}
