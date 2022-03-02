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
        com.google.javascript.rhino.jstype.FunctionType functionType93 = enumType91.getConstructor();
        java.lang.String str94 = enumType91.getDisplayName();
        boolean boolean95 = enumType91.isTemplateType();
        boolean boolean97 = enumType91.isPropertyTypeInferred("(INSTANCEOF 49\n    OR \n)");
        com.google.javascript.rhino.jstype.JSType jSType99 = enumType91.getPropertyType("Node tree inequality:\nTree1:\nOR  32 [jsdoc_info: JSDocInfo]\n\n\nTree2:\nNUMBER 12.0\n\n\nSubtree1: OR  32 [jsdoc_info: JSDocInfo]\n\n\nSubtree2: NUMBER 12.0\n");
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
        org.junit.Assert.assertNull(functionType93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str94, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0802");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Not declared as a type name", 32, (int) (byte) 1);
        java.util.Set<java.lang.String> strSet4 = node3.getDirectives();
        boolean boolean5 = node3.wasEmptyNode();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags7 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags7.setReturnsTainted();
        sideEffectFlags7.setReturnsTainted();
        int int10 = sideEffectFlags7.valueOf();
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(sideEffectFlags7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 41 + "'", int10 == 41);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0803");
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
        com.google.javascript.rhino.Node node48 = node47.getLastChild();
        boolean boolean49 = node48.isSyntheticBlock();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean53 = node52.isObjectLit();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node57 = node52.copyInformationFromForTree(node56);
        boolean boolean58 = node52.isTry();
        node52.setLength(4);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder61 = node52.getJsDocBuilderForNode();
        boolean boolean62 = node52.isFor();
        com.google.javascript.rhino.Node node63 = node48.clonePropsFrom(node52);
        boolean boolean64 = node48.isCase();
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
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0804");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        boolean boolean15 = node14.isFromExterns();
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getSourceName(node14);
        com.google.javascript.rhino.Node node17 = node14.cloneTree();
        boolean boolean18 = node17.isUnscopedQualifiedName();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0805");
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
        boolean boolean24 = functionType11.isConstructor();
        boolean boolean25 = functionType11.isNativeObjectType();
        boolean boolean26 = functionType11.isString();
        boolean boolean27 = functionType11.hasDisplayName();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0806");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType11.getSubTypes();
        boolean boolean13 = functionType11.hasImplementedInterfaces();
        boolean boolean14 = functionType11.isGlobalThisType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType16 = functionType11.getTopMostDefiningType("function (...[Function]): Function");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0807");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getAuthors();
        java.lang.String str5 = jSDocInfo0.getLicense();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0808");
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
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType38.dereference();
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
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str65 = node61.checkTreeEquals(node64);
        boolean boolean66 = objectType42.defineInferredProperty("true", (com.google.javascript.rhino.jstype.JSType) functionType55, node61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = functionType55.getOwnPropertyJSDocInfo("Named type with empty name component");
        boolean boolean69 = functionType55.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.ObjectType.Property property71 = functionType55.getSlot("Named type with empty name component");
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
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(jSDocInfo68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(property71);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0809");
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
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags83 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        boolean boolean84 = sideEffectFlags83.areAllFlagsSet();
        sideEffectFlags83.clearAllFlags();
        sideEffectFlags83.setAllFlags();
        // The following exception was thrown during execution in test generation
        try {
            node78.setSideEffectFlags(sideEffectFlags83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0810");
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
        boolean boolean42 = functionType11.isGlobalThisType();
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0811");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isFromExterns();
        boolean boolean10 = node6.wasEmptyNode();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean16 = node15.isObjectLit();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node20 = node15.copyInformationFromForTree(node19);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node28 = node23.copyInformationFromForTree(node27);
        boolean boolean29 = node27.isObjectLit();
        boolean boolean30 = node27.isFromExterns();
        boolean boolean31 = node27.wasEmptyNode();
        boolean boolean32 = node27.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship33 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType12, node19, node27);
        com.google.javascript.rhino.Node node34 = node27.cloneNode();
        java.lang.Object obj36 = null;
        node34.putProp(100, obj36);
        node34.putBooleanProp(0, true);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) (byte) 1, node34);
        com.google.javascript.rhino.Node node42 = node6.srcrefTree(node34);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        int int46 = node45.getLineno();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean50 = node49.isObjectLit();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node54 = node49.copyInformationFromForTree(node53);
        boolean boolean55 = node53.isObjectLit();
        boolean boolean56 = node53.isLabelName();
        com.google.javascript.rhino.Node node57 = node45.srcrefTree(node53);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder58 = node57.new FileLevelJsDocBuilder();
        node57.setSourceEncodedPosition(45);
        boolean boolean61 = node57.isThrow();
        node57.putIntProp(7, 48);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType65 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean69 = node68.isObjectLit();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node73 = node68.copyInformationFromForTree(node72);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean77 = node76.isObjectLit();
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node81 = node76.copyInformationFromForTree(node80);
        boolean boolean82 = node80.isObjectLit();
        boolean boolean83 = node80.isFromExterns();
        boolean boolean84 = node80.wasEmptyNode();
        boolean boolean85 = node80.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship86 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType65, node72, node80);
        com.google.javascript.rhino.Node node87 = node80.cloneNode();
        boolean boolean88 = node87.wasEmptyNode();
        com.google.javascript.rhino.Node node89 = node57.srcref(node87);
        com.google.javascript.rhino.Node node91 = com.google.javascript.rhino.Node.newNumber((double) (short) 10);
        boolean boolean92 = node91.isArrayLit();
        // The following exception was thrown during execution in test generation
        try {
            node42.addChildBefore(node87, node91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + subclassType12 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType12.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + subclassType65 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType65.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0812");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isDo();
        com.google.javascript.rhino.Node node4 = node2.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            node4.putIntProp(2, 40960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0813");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType17.getCtorExtendedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType17.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType.Property property23 = functionType17.getSlot("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = jSTypeRegistry25.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        int int33 = node32.getLineno();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean37 = node36.isObjectLit();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node41 = node36.copyInformationFromForTree(node40);
        boolean boolean42 = node40.isObjectLit();
        boolean boolean43 = node40.isLabelName();
        com.google.javascript.rhino.Node node44 = node32.srcrefTree(node40);
        com.google.javascript.rhino.jstype.JSType jSType45 = node44.getJSType();
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
        com.google.javascript.rhino.jstype.ObjectType.Property property68 = functionType57.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable69 = functionType57.getCtorExtendedInterfaces();
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo85 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean86 = jSDocInfo85.isNoCompile();
        boolean boolean87 = jSDocInfo85.hasTypedefType();
        int int88 = jSDocInfo85.getImplementedInterfaceCount();
        functionType81.setPropertyJSDocInfo("", jSDocInfo85);
        boolean boolean90 = functionType57.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType81);
        com.google.javascript.rhino.jstype.ObjectType objectType91 = jSTypeRegistry25.createObjectType("JSDocInfo", node44, (com.google.javascript.rhino.jstype.ObjectType) functionType81);
        boolean boolean92 = functionType17.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType81);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable93 = functionType81.getImplementedInterfaces();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNull(property23);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(jSType45);
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
        org.junit.Assert.assertNull(property68);
        org.junit.Assert.assertNotNull(objectTypeIterable69);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(objectType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable93);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0814");
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
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType11.getParameterType();
        boolean boolean46 = functionType11.isReturnTypeInferred();
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
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0815");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node.AncestorIterable> ancestorIterableBuilder0 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node.AncestorIterable>();
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0816");
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
        com.google.javascript.rhino.Node node17 = functionType11.getPropertyNode("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType11.getTypeOfThis();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(objectType18);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0817");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.isInterface();
        boolean boolean8 = jSDocInfo0.hasParameterType("[true, 100.0, 100.0, a, -1, 4, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0818");
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
        com.google.javascript.rhino.jstype.ObjectType objectType93 = parameterizedType63.toObjectType();
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
        org.junit.Assert.assertNotNull(objectType93);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0819");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList25 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList34 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue33);
        boolean boolean35 = serializableList25.containsAll((java.util.Collection<java.io.Serializable>) serializableList34);
        int int37 = serializableList25.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = node41.copyInformationFromForTree(node45);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean50 = node49.isObjectLit();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node54 = node49.copyInformationFromForTree(node53);
        boolean boolean55 = node53.isObjectLit();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean59 = node58.isObjectLit();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node63 = node58.copyInformationFromForTree(node62);
        boolean boolean64 = node63.isTrue();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(41, node41, node53, node63);
        int int66 = serializableList25.lastIndexOf((java.lang.Object) node63);
        boolean boolean67 = strSet16.retainAll((java.util.Collection<java.io.Serializable>) serializableList25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = strSet16.add("true");
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
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(serializableList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0820");
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
        com.google.javascript.rhino.jstype.JSType jSType41 = typePair40.typeB;
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
        org.junit.Assert.assertNotNull(jSType41);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0821");
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
        com.google.javascript.rhino.ErrorReporter errorReporter57 = jSTypeRegistry1.getErrorReporter();
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean74 = jSDocInfo73.isNoCompile();
        boolean boolean75 = jSDocInfo73.hasTypedefType();
        int int76 = jSDocInfo73.getImplementedInterfaceCount();
        functionType69.setPropertyJSDocInfo("", jSDocInfo73);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = functionType69.getPossibleToBooleanOutcomes();
        int int79 = functionType69.getPropertiesCount();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean83 = node82.isUnscopedQualifiedName();
        node82.setSourceFileForTesting("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType69, node82);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry1.createUnionType(jSTypeArray87);
        boolean boolean89 = jSType88.isNullType();
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
        org.junit.Assert.assertNull(errorReporter57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0822");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet1 = jSDocInfo0.getModifies();
        boolean boolean2 = jSDocInfo0.isImplicitCast();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.lang.String str4 = jSDocInfo0.getLicense();
        java.lang.String str6 = jSDocInfo0.getDescriptionForParameter("OR  10\n");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0823");
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
        com.google.javascript.rhino.Node node96 = enumType91.getPropertyNode("OR  10\n");
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
        org.junit.Assert.assertNull(node96);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0824");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        int int5 = node4.getLineno();
        boolean boolean6 = node4.isLabelName();
        boolean boolean7 = node4.isNumber();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node4 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0, nodeArray8, 12, 41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((int) (short) 10, nodeArray8, 35, 29);
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0825");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnEndLine();
        java.lang.String str2 = stringPosition0.getItem();
        java.lang.String str3 = stringPosition0.getItem();
        java.lang.String str4 = stringPosition0.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int6 = stringPosition5.getPositionOnEndLine();
        java.lang.String str7 = stringPosition5.getItem();
        java.lang.String str8 = stringPosition5.getItem();
        java.lang.String str9 = stringPosition5.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition10 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int11 = stringPosition10.getPositionOnStartLine();
        int int12 = stringPosition10.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition13 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str14 = stringPosition13.getItem();
        stringPosition13.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str17 = stringPosition13.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition18 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str19 = stringPosition18.getItem();
        stringPosition18.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        stringPosition18.setItem("INSTANCEOF 49\n    OR \n");
        stringPosition18.setItem("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition26 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int27 = stringPosition26.getPositionOnEndLine();
        int int28 = stringPosition26.getStartLine();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition29 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int30 = stringPosition29.getPositionOnEndLine();
        int int31 = stringPosition29.getStartLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.StringPosition> stringPositionList32 = com.google.common.collect.ImmutableList.of(stringPosition5, stringPosition10, stringPosition13, stringPosition18, stringPosition26, stringPosition29);
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition33 = null;
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition34 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str35 = stringPosition34.getItem();
        stringPosition34.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str38 = stringPosition34.getItem();
        stringPosition34.setItem("OR  10\n");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition41 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int42 = stringPosition41.getPositionOnEndLine();
        java.lang.String str43 = stringPosition41.getItem();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition44 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str45 = stringPosition44.getItem();
        stringPosition44.setItem("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str48 = stringPosition44.getItem();
        stringPosition44.setItem("OR  10\n");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition51 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int52 = stringPosition51.getPositionOnEndLine();
        java.lang.String str53 = stringPosition51.getItem();
        int int54 = stringPosition51.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.StringPosition> stringPositionList55 = com.google.common.collect.ImmutableList.of(stringPosition0, stringPosition13, stringPosition33, stringPosition34, stringPosition41, stringPosition44, stringPosition51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 2");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str17, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(stringPositionList32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str38, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str48, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0826");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType56.getImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable61);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0827");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = null;
        functionType17.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo21);
        boolean boolean23 = functionType17.hasCachedValues();
        boolean boolean24 = functionType17.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = functionType17.getBindReturnType(1);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = functionType26.toMaybeFunctionType();
        boolean boolean28 = functionType27.isStringValueType();
        java.lang.String str29 = functionType27.getDisplayName();
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.isNoCompile();
        boolean boolean47 = jSDocInfo45.hasTypedefType();
        int int48 = jSDocInfo45.getImplementedInterfaceCount();
        functionType41.setPropertyJSDocInfo("", jSDocInfo45);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet50 = functionType41.getPossibleToBooleanOutcomes();
        int int51 = functionType41.getPropertiesCount();
        java.lang.String str52 = functionType41.getNormalizedReferenceName();
        functionType27.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType41);
        boolean boolean54 = functionType41.isTemplateType();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet50 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet50.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0828");
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
        boolean boolean30 = node28.isObjectLit();
        boolean boolean31 = node28.isSwitch();
        boolean boolean32 = node15.isEquivalentToTyped(node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean36 = node35.isObjectLit();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node40 = node35.copyInformationFromForTree(node39);
        boolean boolean41 = node40.isTrue();
        node28.addChildToFront(node40);
        com.google.javascript.rhino.jstype.JSType jSType43 = node40.getJSType();
        boolean boolean44 = node40.isParamList();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0829");
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
        com.google.javascript.rhino.jstype.TemplateType templateType69 = parameterizedType63.toMaybeTemplateType();
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
        org.junit.Assert.assertNull(templateType69);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0830");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((int) (short) 0, 7, 29);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        node11.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(10, node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry6.createFunctionType(jSType7, node15);
        boolean boolean17 = node15.isTypeOf();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec19 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean24 = node23.isObjectLit();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node28 = node23.copyInformationFromForTree(node27);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean32 = node31.isObjectLit();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node36 = node31.copyInformationFromForTree(node35);
        boolean boolean37 = node35.isObjectLit();
        boolean boolean38 = node35.isFromExterns();
        boolean boolean39 = node35.wasEmptyNode();
        boolean boolean40 = node35.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship41 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType20, node27, node35);
        boolean boolean42 = node35.isTypeOf();
        com.google.javascript.rhino.Node node43 = assertionFunctionSpec19.getAssertedParam(node35);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean47 = node46.isObjectLit();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node51 = node46.copyInformationFromForTree(node50);
        boolean boolean52 = node50.isObjectLit();
        node50.putBooleanProp(54, false);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56);
        jSTypeRegistry57.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType59 = assertionFunctionSpec19.getAssertedType(node50, jSTypeRegistry57);
        java.lang.Object obj61 = node50.getProp(36);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) (short) 0);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(44, node4, node15, node50, node63);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString(100, "");
        int int68 = node67.getLineno();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean72 = node71.isObjectLit();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node76 = node71.copyInformationFromForTree(node75);
        boolean boolean77 = node75.isObjectLit();
        boolean boolean78 = node75.isLabelName();
        com.google.javascript.rhino.Node node79 = node67.srcrefTree(node75);
        boolean boolean80 = node79.isFromExterns();
        java.lang.String str81 = com.google.javascript.jscomp.NodeUtil.getSourceName(node79);
        com.google.javascript.rhino.Node node82 = node79.cloneTree();
        node82.setLength(51);
        node63.addChildToBack(node82);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + subclassType20 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType20.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSType59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(node82);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0831");
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
        com.google.javascript.rhino.jstype.ObjectType objectType16 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType11);
        java.lang.String str17 = null; // flaky: functionType11.toAnnotationString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean20 = jSDocInfo19.isNoCompile();
        boolean boolean21 = jSDocInfo19.hasTypedefType();
        boolean boolean22 = jSDocInfo19.hasType();
        functionType11.setPropertyJSDocInfo("", jSDocInfo19);
        com.google.javascript.rhino.Node node24 = functionType11.getRootNode();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(objectType16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Function" + "'", str17, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0832");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 1.0f);
        com.google.javascript.rhino.Node node3 = node2.getFirstChild();
        boolean boolean4 = node2.isUnscopedQualifiedName();
        node2.setType(0);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        int int10 = node9.getLineno();
        boolean boolean11 = node9.isTypeOf();
        node9.addSuppression("java.io.IOException: Function");
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean17 = node16.isObjectLit();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node21 = node16.copyInformationFromForTree(node20);
        boolean boolean22 = node16.isComma();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = node16.getJSDocInfo();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        boolean boolean32 = node30.isObjectLit();
        boolean boolean33 = node30.isLabelName();
        boolean boolean34 = node16.hasChild(node30);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType35 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean39 = node38.isObjectLit();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node43 = node38.copyInformationFromForTree(node42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean47 = node46.isObjectLit();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node51 = node46.copyInformationFromForTree(node50);
        boolean boolean52 = node50.isObjectLit();
        boolean boolean53 = node50.isFromExterns();
        boolean boolean54 = node50.wasEmptyNode();
        boolean boolean55 = node50.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship56 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType35, node42, node50);
        com.google.javascript.rhino.Node node57 = node50.cloneNode();
        java.lang.Object obj59 = null;
        node57.putProp(100, obj59);
        boolean boolean61 = node57.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node62 = node30.srcref(node57);
        boolean boolean63 = node62.isScript();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(52, node2, node9, node62);
        boolean boolean65 = node9.isGetProp();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSDocInfo23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + subclassType35 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType35.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0833");
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
        boolean boolean69 = parameterizedType63.hasProperty("(INSTANCEOF 49\n    OR \n)");
        com.google.javascript.rhino.jstype.FunctionType functionType70 = parameterizedType63.getOwnerFunction();
        com.google.javascript.rhino.jstype.JSType jSType72 = parameterizedType63.findPropertyType("Not declared as a constructor");
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(functionType70);
        org.junit.Assert.assertNull(jSType72);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0834");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo98 = enumType91.getJSDocInfo();
        boolean boolean99 = enumType91.isBooleanValueType();
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
        org.junit.Assert.assertNull(jSDocInfo98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0835");
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
        boolean boolean21 = objectType20.isObject();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0836");
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
        boolean boolean42 = functionType38.matchesNumberContext();
        boolean boolean43 = functionType38.hasCachedValues();
        com.google.javascript.rhino.jstype.ObjectType.Property property45 = functionType38.getSlot("OR \n");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(property45);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0837");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("hi!", throwable5);
        java.lang.Throwable throwable8 = null;
        java.io.IOException iOException9 = new java.io.IOException("hi!", throwable8);
        java.io.IOException iOException11 = new java.io.IOException("");
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException("");
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("");
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList19 = com.google.common.collect.ImmutableList.of(iOException3, iOException6, iOException9, iOException12, iOException15, iOException18);
        java.lang.Throwable[] throwableArray20 = iOException9.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException("Named type with empty name component", (java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray22 = iOException21.getSuppressed();
        java.io.IOException iOException23 = new java.io.IOException("Named type with empty name component", (java.lang.Throwable) iOException21);
        java.io.IOException iOException25 = new java.io.IOException("");
        java.lang.Throwable throwable27 = null;
        java.io.IOException iOException28 = new java.io.IOException("hi!", throwable27);
        java.lang.Throwable throwable30 = null;
        java.io.IOException iOException31 = new java.io.IOException("hi!", throwable30);
        java.io.IOException iOException33 = new java.io.IOException("");
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException33);
        java.io.IOException iOException36 = new java.io.IOException("");
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) iOException36);
        java.io.IOException iOException39 = new java.io.IOException("");
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) iOException39);
        com.google.common.collect.ImmutableList<java.io.IOException> iOExceptionList41 = com.google.common.collect.ImmutableList.of(iOException25, iOException28, iOException31, iOException34, iOException37, iOException40);
        iOException23.addSuppressed((java.lang.Throwable) iOException34);
        org.junit.Assert.assertNotNull(iOExceptionList19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(iOExceptionList41);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0838");
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
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry1.getType("OR  10\n");
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0839");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean12 = node11.isObjectLit();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node16 = node11.copyInformationFromForTree(node15);
        boolean boolean17 = node11.isTry();
        node11.setOptionalArg(false);
        boolean boolean20 = node11.isNull();
        int int21 = serializableList8.lastIndexOf((java.lang.Object) boolean20);
        java.util.stream.Stream<java.io.Serializable> serializableStream22 = serializableList8.parallelStream();
        java.util.Iterator<java.io.Serializable> serializableItor23 = serializableList8.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        jSTypeRegistry25.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = jSTypeRegistry25.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        node36.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node39 = node36.cloneTree();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(10, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry31.createFunctionType(jSType32, node40);
        jSTypeRegistry25.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType41);
        java.lang.String str43 = null; // flaky: functionType41.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = null;
        functionType41.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo45);
        boolean boolean47 = functionType41.hasCachedValues();
        boolean boolean48 = functionType41.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = functionType41.getBindReturnType(1);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(100, "");
        node57.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node60 = node57.cloneTree();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node60);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry52.createFunctionType(jSType53, node61);
        int int63 = functionType62.getMinArguments();
        boolean boolean64 = functionType62.matchesStringContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = functionType50.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList74 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        node81.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node84 = node81.cloneTree();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(10, node84);
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry76.createFunctionType(jSType77, node85);
        int int87 = functionType86.getMinArguments();
        int int88 = functionType86.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = functionType86.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable90 = objectType89.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet91 = objectType89.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue92 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        boolean boolean93 = strSet91.remove((java.lang.Object) ternaryValue92);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue94 = ternaryValue73.or(ternaryValue92);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue95 = ternaryValue65.xor(ternaryValue94);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue97 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue98 = ternaryValue94.or(ternaryValue97);
        boolean boolean99 = serializableList8.contains((java.lang.Object) ternaryValue98);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(serializableStream22);
        org.junit.Assert.assertNotNull(serializableItor23);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(functionType41);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Function" + "'", str43, "Function");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(serializableList74);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNotNull(objectTypeIterable90);
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNotNull(ternaryValue92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(ternaryValue94);
        org.junit.Assert.assertNotNull(ternaryValue95);
        org.junit.Assert.assertNotNull(ternaryValue97);
        org.junit.Assert.assertNotNull(ternaryValue98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0840");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(100, "");
        int int6 = node5.getLineno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        boolean boolean15 = node13.isObjectLit();
        boolean boolean16 = node13.isLabelName();
        com.google.javascript.rhino.Node node17 = node5.srcrefTree(node13);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder18 = node17.new FileLevelJsDocBuilder();
        node17.setSourceEncodedPosition(45);
        java.lang.String str24 = node17.toString(false, true, false);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((int) '4', node28, 49, 45);
        com.google.javascript.rhino.InputId inputId32 = null;
        node28.setInputId(inputId32);
        node28.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId36 = com.google.javascript.jscomp.NodeUtil.getInputId(node28);
        boolean boolean37 = node28.isThis();
        boolean boolean38 = node17.isEquivalentTo(node28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(52, node2, node28, (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: second new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OR " + "'", str24, "OR ");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(inputId36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0841");
        com.google.javascript.rhino.jstype.BooleanLiteralSet[] booleanLiteralSetArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList1 = com.google.common.collect.ImmutableList.of(booleanLiteralSetArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0842");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isComma();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = node2.getJSDocInfo();
        boolean boolean10 = node2.isSwitch();
        boolean boolean11 = node2.wasEmptyNode();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0843");
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
        jSTypeRegistry1.incrementGeneration();
        jSTypeRegistry1.forwardDeclareType("[10, 1, 4, -1, a, 100.0, 100.0, true]");
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
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0844");
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
        boolean boolean70 = jSTypeRegistry39.isForwardDeclaredType("OR ");
        boolean boolean72 = jSTypeRegistry39.hasNamespace("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo89 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean90 = jSDocInfo89.isNoCompile();
        boolean boolean91 = jSDocInfo89.hasTypedefType();
        int int92 = jSDocInfo89.getImplementedInterfaceCount();
        functionType85.setPropertyJSDocInfo("", jSDocInfo89);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet94 = functionType85.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = functionType85.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType96 = functionType85.getParameterType();
        boolean boolean97 = functionType85.isNumber();
        boolean boolean98 = functionType85.matchesUint32Context();
        boolean boolean99 = jSTypeRegistry39.declareType("Function.<Function>", (com.google.javascript.rhino.jstype.JSType) functionType85);
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet94 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet94.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertNull(jSType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0845");
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
        boolean boolean99 = enumElementType96.isPropertyTypeInferred("false");
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0846");
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
        com.google.javascript.rhino.jstype.UnionType unionType57 = functionType53.toMaybeUnionType();
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
        org.junit.Assert.assertNull(unionType57);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0847");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = functionType31.getImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable72);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0848");
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
        com.google.javascript.rhino.jstype.EnumType enumType95 = enumType91.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType97 = enumType91.getPropertyType("java.io.IOException: Function");
        boolean boolean99 = enumType91.isPropertyTypeInferred("InputId: Not declared as a constructor");
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
        org.junit.Assert.assertNotNull(enumType95);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0849");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isCall();
        java.lang.String str8 = node2.toString(false, true, false);
        boolean boolean9 = node2.isGetElem();
        boolean boolean10 = node2.isLabelName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OR " + "'", str8, "OR ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0850");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList25 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue24);
        boolean boolean26 = serializableList16.containsAll((java.util.Collection<java.io.Serializable>) serializableList25);
        int int28 = serializableList16.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = node40.copyInformationFromForTree(node44);
        boolean boolean46 = node44.isObjectLit();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean50 = node49.isObjectLit();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node54 = node49.copyInformationFromForTree(node53);
        boolean boolean55 = node54.isTrue();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(41, node32, node44, node54);
        int int57 = serializableList16.lastIndexOf((java.lang.Object) node54);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder58 = serializableCollectionBuilder3.add((java.util.Collection<java.io.Serializable>) serializableList16);
        java.util.ListIterator<java.io.Serializable> serializableItor59 = serializableList16.listIterator();
        java.util.ListIterator<java.io.Serializable> serializableItor61 = serializableList16.listIterator((int) (short) 1);
        com.google.common.collect.ImmutableList<java.util.ListIterator<java.io.Serializable>> serializableItorList62 = com.google.common.collect.ImmutableList.of(serializableItor61);
        java.io.Serializable serializable63 = serializableItor61.next();
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(serializableList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(serializableCollectionBuilder58);
        org.junit.Assert.assertNotNull(serializableItor59);
        org.junit.Assert.assertNotNull(serializableItor61);
        org.junit.Assert.assertNotNull(serializableItorList62);
        org.junit.Assert.assertEquals("'" + serializable63 + "' != '" + (short) 1 + "'", serializable63, (short) 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0851");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = objectType41.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = objectType41.getOwnerFunction();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable59 = objectType58.getCtorExtendedInterfaces();
        objectType41.matchConstraint(objectType58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = objectType41.toMaybeFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        jSTypeRegistry63.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = jSTypeRegistry63.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
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
        com.google.javascript.rhino.jstype.FunctionType functionType82 = functionType78.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType78.autobox();
        boolean boolean84 = functionType78.isOrdinaryFunction();
        boolean boolean86 = functionType78.isPropertyInExterns("Named type with empty name component");
        boolean boolean88 = jSTypeRegistry63.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType78, "");
        boolean boolean89 = functionType61.hasEqualCallType(functionType78);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType61.dereference();
        functionType17.matchConstraint(objectType90);
        com.google.javascript.rhino.JSDocInfo jSDocInfo93 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean94 = jSDocInfo93.isNoCompile();
        boolean boolean95 = jSDocInfo93.hasTypedefType();
        boolean boolean96 = jSDocInfo93.hasFileOverview();
        java.lang.String str97 = jSDocInfo93.getDeprecationReason();
        boolean boolean98 = jSDocInfo93.isNoSideEffects();
        functionType17.setPropertyJSDocInfo("STRING Not declared as a type name 32\n", jSDocInfo93);
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
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(objectTypeIterable42);
        org.junit.Assert.assertNull(functionType43);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectTypeIterable59);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(str97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0852");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isDo();
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
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        boolean boolean38 = node36.isObjectLit();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = node41.copyInformationFromForTree(node45);
        boolean boolean47 = node46.isTrue();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(41, node24, node36, node46);
        com.google.javascript.rhino.Node node49 = node19.srcref(node46);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 1.0f);
        boolean boolean52 = node51.isInc();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder53 = node51.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean58 = node57.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node57);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean63 = node62.isObjectLit();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node67 = node62.copyInformationFromForTree(node66);
        boolean boolean68 = node62.isTry();
        node62.setOptionalArg(false);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean74 = node73.isObjectLit();
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node78 = node73.copyInformationFromForTree(node77);
        boolean boolean79 = node73.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection80 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node73);
        com.google.javascript.rhino.Node node81 = node62.clonePropsFrom(node73);
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node(36, node59, node81);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean86 = node85.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node87 = com.google.javascript.jscomp.NodeUtil.newExpr(node85);
        com.google.javascript.rhino.Node node88 = node82.clonePropsFrom(node87);
        node51.addChildrenToFront(node88);
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(52, node3, node19, node51);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder91 = node51.new FileLevelJsDocBuilder();
        fileLevelJsDocBuilder91.append("STRING Not declared as a type name 32\n");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(nodeCollection80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node88);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0853");
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
        java.lang.String str38 = functionType17.getDisplayName();
        functionType17.clearCachedValues();
        boolean boolean40 = functionType17.isRegexpType();
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
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0854");
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
        boolean boolean37 = node34.isNumber();
        com.google.javascript.rhino.Node node38 = node34.getLastSibling();
        boolean boolean39 = node34.isUnscopedQualifiedName();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0855");
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
        int int98 = enumElementType96.getPropertiesCount();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType99 = enumElementType96.toMaybeEnumElementType();
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
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertNotNull(enumElementType99);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0856");
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
        boolean boolean32 = strSet30.add("false");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0857");
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
        int int28 = serializableList8.size();
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList29 = serializableList8.asList();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        jSTypeRegistry31.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = jSTypeRegistry31.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        jSTypeRegistry31.setLastGeneration(false);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable38 = jSTypeRegistry31.getTypesWithProperty("unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        jSTypeRegistry40.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeRegistry[] jSTypeRegistryArray42 = new com.google.javascript.rhino.jstype.JSTypeRegistry[] { jSTypeRegistry31, jSTypeRegistry40 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSTypeRegistry[] jSTypeRegistryArray43 = serializableList8.toArray(jSTypeRegistryArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertNotNull(serializableList29);
        org.junit.Assert.assertNotNull(objectTypeIterable34);
        org.junit.Assert.assertNotNull(jSTypeIterable38);
        org.junit.Assert.assertNotNull(jSTypeRegistryArray42);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0858");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = functionType11.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType11.getAllImplementedInterfaces();
        java.lang.String str47 = functionType11.getReferenceName();
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
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0859");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean5 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        node13.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node16 = node13.cloneTree();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(10, node16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry8.createFunctionType(jSType9, node17);
        int int19 = functionType18.getMinArguments();
        boolean boolean20 = functionType18.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType18.getImplementedInterfaces();
        java.lang.Iterable iterable22 = functionType18.getCtorImplementedInterfaces();
        boolean boolean23 = functionType18.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.isNoCompile();
        boolean boolean26 = jSDocInfo24.hasTypedefType();
        functionType18.setJSDocInfo(jSDocInfo24);
        com.google.javascript.rhino.jstype.ObjectType.Property property29 = functionType18.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType18.getCtorExtendedInterfaces();
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean47 = jSDocInfo46.isNoCompile();
        boolean boolean48 = jSDocInfo46.hasTypedefType();
        int int49 = jSDocInfo46.getImplementedInterfaceCount();
        functionType42.setPropertyJSDocInfo("", jSDocInfo46);
        boolean boolean51 = functionType18.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType42);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType18.getCtorImplementedInterfaces();
        boolean boolean53 = functionType18.matchesInt32Context();
        functionType18.clearResolved();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(100, "");
        node61.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node64 = node61.cloneTree();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(10, node64);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry56.createFunctionType(jSType57, node65);
        int int67 = functionType66.getMinArguments();
        boolean boolean68 = functionType66.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType66.getTypeOfThis();
        com.google.common.collect.ImmutableList<java.lang.String> strList70 = functionType66.getTemplateTypeNames();
        boolean boolean72 = functionType66.isPropertyTypeDeclared("(INSTANCEOF 49\n    OR \n)");
        boolean boolean73 = functionType66.matchesInt32Context();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry1.createFunctionTypeWithNewReturnType(functionType18, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.EnumType enumType75 = functionType74.toMaybeEnumType();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(iterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(property29);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertNull(enumType75);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0860");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        int int20 = serializableList8.lastIndexOf((java.lang.Object) 49);
        java.util.ListIterator<java.io.Serializable> serializableItor21 = serializableList8.listIterator();
        java.lang.Object obj22 = null;
        int int23 = serializableList8.lastIndexOf(obj22);
        java.lang.Object[] objArray24 = serializableList8.toArray();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList33 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue32);
        java.util.stream.Stream<java.io.Serializable> serializableStream34 = serializableList33.parallelStream();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair37 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType35, jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = typePair37.typeB;
        int int39 = serializableList33.indexOf((java.lang.Object) typePair37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList48 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue47);
        java.util.stream.Stream<java.io.Serializable> serializableStream49 = serializableList48.parallelStream();
        boolean boolean50 = serializableList33.containsAll((java.util.Collection<java.io.Serializable>) serializableList48);
        boolean boolean51 = serializableList33.isEmpty();
        java.util.Iterator<java.io.Serializable> serializableItor52 = serializableList33.iterator();
        boolean boolean54 = serializableList33.contains((java.lang.Object) "Function");
        boolean boolean55 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList64 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList73 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue72);
        boolean boolean74 = serializableList64.containsAll((java.util.Collection<java.io.Serializable>) serializableList73);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue82 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList83 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue82);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue91 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList92 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue91);
        boolean boolean93 = serializableList83.containsAll((java.util.Collection<java.io.Serializable>) serializableList92);
        boolean boolean95 = serializableList92.equals((java.lang.Object) 16);
        int int96 = serializableList92.size();
        boolean boolean97 = serializableList73.containsAll((java.util.Collection<java.io.Serializable>) serializableList92);
        boolean boolean98 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList73);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(serializableItor21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(serializableList33);
        org.junit.Assert.assertNotNull(serializableStream34);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(serializableList48);
        org.junit.Assert.assertNotNull(serializableStream49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(serializableItor52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(serializableList64);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertNotNull(serializableList73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(ternaryValue82);
        org.junit.Assert.assertNotNull(serializableList83);
        org.junit.Assert.assertNotNull(ternaryValue91);
        org.junit.Assert.assertNotNull(serializableList92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 8 + "'", int96 == 8);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0861");
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
        boolean boolean39 = functionType30.isInterface();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0862");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue4.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.and(ternaryValue4);
        java.lang.String str9 = ternaryValue4.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "true" + "'", str9, "true");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0863");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (short) 100, 51, 50, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 50");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0864");
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
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node14);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(100, "");
        node20.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node23 = node20.cloneTree();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(10, node23);
        boolean boolean25 = node23.isAdd();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        int int29 = node28.getLineno();
        boolean boolean30 = node28.isLabelName();
        boolean boolean31 = node28.isNumber();
        com.google.common.collect.ImmutableList<java.lang.Cloneable> cloneableList32 = com.google.common.collect.ImmutableList.of((java.lang.Cloneable) node14, (java.lang.Cloneable) node23, (java.lang.Cloneable) node28);
        boolean boolean33 = node14.isVoid();
        int int34 = node14.getSourceOffset();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cloneableList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0865");
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
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType53.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType53.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType53.autobox();
        boolean boolean59 = functionType53.isOrdinaryFunction();
        boolean boolean60 = functionType53.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType53.getReturnType();
        boolean boolean63 = functionType53.hasOwnProperty("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType53.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair65 = functionType11.getTypesUnderInequality(jSType64);
        boolean boolean66 = functionType11.isUnionType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str67 = functionType11.toDebugHashCodeString();
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
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertNotNull(typePair65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0866");
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
        com.google.javascript.rhino.jstype.FunctionType functionType41 = functionType37.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType41);
        boolean boolean43 = functionType41.hasInstanceType();
        boolean boolean44 = functionType11.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = functionType41.toDebugHashCodeString();
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
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0867");
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
        java.lang.String str20 = jSDocInfo15.getSourceName();
        boolean boolean21 = jSDocInfo15.isExport();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0868");
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
        boolean boolean27 = node22.isDo();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        node34.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node37 = node34.cloneTree();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(10, node37);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry29.createFunctionType(jSType30, node38);
        int int40 = functionType39.getMinArguments();
        boolean boolean41 = functionType39.matchesStringContext();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = functionType39.getImplementedInterfaces();
        java.lang.Iterable iterable43 = functionType39.getCtorImplementedInterfaces();
        boolean boolean44 = functionType39.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.isNoCompile();
        boolean boolean47 = jSDocInfo45.hasTypedefType();
        functionType39.setJSDocInfo(jSDocInfo45);
        node22.setJSDocInfo(jSDocInfo45);
        boolean boolean50 = jSDocInfo45.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList51 = jSDocInfo45.getImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable42);
        org.junit.Assert.assertNotNull(iterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList51);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0869");
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
        boolean boolean98 = enumType91.matchesNumberContext();
        boolean boolean99 = enumType91.matchesNumberContext();
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0870");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        typePosition0.setPositionInformation((int) (short) 10, 4, 54, 45);
        com.google.javascript.rhino.Node node7 = typePosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0871");
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
        com.google.javascript.rhino.Node node15 = functionType11.getPropertyNode("java.io.IOException: Function");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0872");
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
        com.google.javascript.rhino.jstype.ObjectType objectType16 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType11);
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.isNoCompile();
        boolean boolean34 = jSDocInfo32.hasTypedefType();
        int int35 = jSDocInfo32.getImplementedInterfaceCount();
        functionType28.setPropertyJSDocInfo("", jSDocInfo32);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = functionType28.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.ObjectType objectType38 = functionType28.getImplicitPrototype();
        boolean boolean39 = functionType11.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType28);
        boolean boolean40 = functionType28.isFunctionPrototypeType();
        boolean boolean41 = functionType28.isEmptyType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0873");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        boolean boolean9 = node2.hasMoreThanOneChild();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node2.getJsDocBuilderForNode();
        boolean boolean11 = node2.isFalse();
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0874");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.hasModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0875");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType53.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType53.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType53.autobox();
        boolean boolean59 = functionType53.isOrdinaryFunction();
        boolean boolean60 = functionType53.canBeCalled();
        boolean boolean62 = functionType53.isPropertyTypeInferred("JSDocInfo");
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType53.restrictByNotNullOrUndefined();
        boolean boolean64 = functionType53.isNullType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean66 = functionType53.isFunctionPrototypeType();
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
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0876");
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
        com.google.javascript.rhino.jstype.FunctionType functionType99 = functionType11.getConstructor();
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
        org.junit.Assert.assertNull(functionType99);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0877");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue4.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.and(ternaryValue4);
        boolean boolean10 = ternaryValue4.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue4.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue14.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue14.or(ternaryValue16);
        java.lang.String str18 = ternaryValue17.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue4.xor(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "true" + "'", str18, "true");
        org.junit.Assert.assertNotNull(ternaryValue19);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0878");
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
        com.google.javascript.rhino.jstype.ObjectType objectType97 = enumType91.getImplicitPrototype();
        boolean boolean98 = enumType91.isFunctionPrototypeType();
        com.google.javascript.rhino.Node node99 = enumType91.getSource();
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
        org.junit.Assert.assertNotNull(objectType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(node99);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0879");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType17.getCtorExtendedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType17.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType.Property property23 = functionType17.getSlot("Not declared as a type name");
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
        com.google.javascript.rhino.jstype.ObjectType objectType38 = functionType35.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = functionType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType35.autobox();
        boolean boolean41 = functionType35.isOrdinaryFunction();
        boolean boolean42 = functionType35.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType35.getReturnType();
        boolean boolean45 = functionType35.hasOwnProperty("Named type with empty name component");
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
        boolean boolean63 = functionType57.isEmptyType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair64 = functionType35.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType57);
        boolean boolean65 = functionType35.matchesNumberContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = functionType17.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType35);
        com.google.javascript.rhino.Node node68 = functionType17.getPropertyNode("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType17.getPrototype();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNull(property23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertNotNull(iterable61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(typePair64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(objectType69);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0880");
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
        boolean boolean70 = functionType38.hasAnyTemplateInternal();
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
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0881");
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
        com.google.javascript.rhino.jstype.ObjectType objectType70 = functionType66.getParentScope();
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
        org.junit.Assert.assertNotNull(objectType70);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0882");
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
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean22 = node21.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        boolean boolean32 = node26.isTry();
        node26.setOptionalArg(false);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean38 = node37.isObjectLit();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node42 = node37.copyInformationFromForTree(node41);
        boolean boolean43 = node37.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection44 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node37);
        com.google.javascript.rhino.Node node45 = node26.clonePropsFrom(node37);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(36, node23, node45);
        com.google.javascript.rhino.Node node47 = node14.useSourceInfoIfMissingFrom(node46);
        com.google.javascript.rhino.Node node48 = node14.getLastSibling();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean52 = node51.isObjectLit();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node56 = node51.copyInformationFromForTree(node55);
        boolean boolean57 = node55.isObjectLit();
        boolean boolean58 = node55.isLabelName();
        node55.setSourceFileForTesting("hi!");
        node55.setType(1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(100, "");
        int int66 = node65.getLineno();
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean70 = node69.isObjectLit();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node74 = node69.copyInformationFromForTree(node73);
        boolean boolean75 = node73.isObjectLit();
        boolean boolean76 = node73.isLabelName();
        com.google.javascript.rhino.Node node77 = node65.srcrefTree(node73);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder78 = node77.new FileLevelJsDocBuilder();
        java.lang.String str79 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node77);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable80 = node77.getAncestors();
        int int81 = node77.getSourceOffset();
        boolean boolean82 = node77.isScript();
        // The following exception was thrown during execution in test generation
        try {
            node14.addChildBefore(node55, node77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeCollection44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(ancestorIterable80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0883");
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
        boolean boolean68 = functionType66.hasReferenceName();
        boolean boolean69 = functionType66.isInterface();
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0884");
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
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList22 = functionType17.getSubTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType17.getAllImplementedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = functionType17.toDebugHashCodeString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(functionTypeList22);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0885");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode19 = null;
        jSTypeRegistry4.setResolveMode(resolveMode19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(100, "");
        node27.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node30 = node27.cloneTree();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(10, node30);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry22.createFunctionType(jSType23, node31);
        int int33 = functionType32.getMinArguments();
        int int34 = functionType32.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = functionType32.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = functionType32.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType32.autobox();
        boolean boolean38 = functionType32.isOrdinaryFunction();
        boolean boolean40 = functionType32.isPropertyInExterns("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType41 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType32);
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType32.getReturnType();
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry4.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType32, "[10, 1, 4, -1, a, 100.0, 100.0, true]", "", (int) (short) 0, 100);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative48 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry4.getNativeFunctionType(jSTypeNative48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(jSType47);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0886");
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
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType11.getPropertyType("java.io.IOException: Function");
        boolean boolean20 = jSType19.isInterface();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0887");
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
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType41.getPropertyType("java.io.IOException: Function");
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
        org.junit.Assert.assertNotNull(jSType48);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0888");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        int int20 = serializableList8.lastIndexOf((java.lang.Object) 49);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean25 = node24.isObjectLit();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node29 = node24.copyInformationFromForTree(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        boolean boolean38 = node36.isObjectLit();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean42 = node41.isObjectLit();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node46 = node41.copyInformationFromForTree(node45);
        boolean boolean47 = node46.isTrue();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(41, node24, node36, node46);
        int int49 = serializableList8.lastIndexOf((java.lang.Object) node46);
        boolean boolean50 = node46.isDo();
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(serializableList8);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(serializableList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0889");
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
        int int67 = node58.getChildCount();
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0890");
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
        int int35 = node33.getLength();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0891");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(100, "");
        node8.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node11 = node8.cloneTree();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(10, node11);
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry3.createFunctionType(jSType4, node12);
        com.google.javascript.rhino.jstype.JSType jSType15 = jSTypeRegistry3.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        node22.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node25 = node22.cloneTree();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(10, node25);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry17.createFunctionType(jSType18, node26);
        int int28 = functionType27.getMinArguments();
        int int29 = functionType27.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType30 = functionType27.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = functionType27.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType27.autobox();
        functionType27.clearCachedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(100, "");
        node41.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node44 = node41.cloneTree();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node44);
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry36.createFunctionType(jSType37, node45);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable48 = jSTypeRegistry36.getTypesWithProperty("hi!");
        jSTypeRegistry36.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        jSTypeRegistry51.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable54 = jSTypeRegistry51.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        jSTypeRegistry51.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(100, "");
        node63.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node66 = node63.cloneTree();
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(10, node66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry58.createFunctionType(jSType59, node67);
        int int69 = functionType68.getMinArguments();
        int int70 = functionType68.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType71 = functionType68.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = objectType71.getCtorExtendedInterfaces();
        boolean boolean74 = objectType71.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        node81.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node84 = node81.cloneTree();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(10, node84);
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry76.createFunctionType(jSType77, node85);
        int int87 = functionType86.getMinArguments();
        boolean boolean88 = functionType86.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType86.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray90 = new com.google.javascript.rhino.jstype.JSType[] { jSType89 };
        com.google.javascript.rhino.jstype.FunctionType functionType91 = jSTypeRegistry51.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType71, jSTypeArray90);
        com.google.javascript.rhino.Node node92 = jSTypeRegistry36.createParameters(jSTypeArray90);
        com.google.javascript.rhino.jstype.FunctionType functionType93 = jSTypeRegistry3.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType27, false, jSTypeArray90);
        com.google.javascript.rhino.Node node94 = jSTypeRegistry1.createParameters(jSTypeArray90);
        jSTypeRegistry1.identifyNonNullableName("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objectType30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertNotNull(jSTypeIterable48);
        org.junit.Assert.assertNotNull(objectTypeIterable54);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertNotNull(jSTypeArray90);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNotNull(functionType93);
        org.junit.Assert.assertNotNull(node94);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0892");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("INSTANCEOF 49\n    OR \n");
        boolean boolean2 = node1.isNoSideEffectsCall();
        boolean boolean3 = node1.isParamList();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0893");
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
        java.lang.String str18 = objectType14.getDisplayName();
        objectType14.clearResolved();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Function" + "'", str18, "Function");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0894");
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
        // The following exception was thrown during execution in test generation
        try {
            serializableList16.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(serializableList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder18);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0895");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        boolean boolean7 = node6.isVar();
        java.lang.Object obj9 = node6.getProp(4);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable10 = node6.getAncestors();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(ancestorIterable10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0896");
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder1 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder2 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder4 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder5 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList7 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder0, serializableCollectionBuilder1, serializableCollectionBuilder2, serializableCollectionBuilder3, serializableCollectionBuilder4, serializableCollectionBuilder5, serializableCollectionBuilder6);
        java.util.Collection[] collectionArray9 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.io.Serializable>[] serializableCollectionArray10 = (java.util.Collection<java.io.Serializable>[]) collectionArray9;
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder11 = serializableCollectionBuilder2.add(serializableCollectionArray10);
        com.google.common.collect.ImmutableList<java.util.Collection<java.io.Serializable>> serializableCollectionList12 = serializableCollectionBuilder11.build();
        com.google.common.collect.ImmutableList<java.util.Collection<java.io.Serializable>> serializableCollectionList13 = serializableCollectionBuilder11.build();
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(collectionArray9);
        org.junit.Assert.assertNotNull(serializableCollectionArray10);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder11);
        org.junit.Assert.assertNotNull(serializableCollectionList12);
        org.junit.Assert.assertNotNull(serializableCollectionList13);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0897");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        node2.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node5 = node2.cloneTree();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean10 = node9.isObjectLit();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node14 = node9.copyInformationFromForTree(node13);
        boolean boolean15 = node13.isObjectLit();
        boolean boolean16 = node13.isSwitch();
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node13);
        boolean boolean18 = node13.isDec();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean22 = node21.isObjectLit();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node26 = node21.copyInformationFromForTree(node25);
        boolean boolean27 = node21.isComma();
        java.lang.String str28 = node21.toStringTree();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType29 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean33 = node32.isObjectLit();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node37 = node32.copyInformationFromForTree(node36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node45 = node40.copyInformationFromForTree(node44);
        boolean boolean46 = node44.isObjectLit();
        boolean boolean47 = node44.isFromExterns();
        boolean boolean48 = node44.wasEmptyNode();
        boolean boolean49 = node44.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship50 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType29, node36, node44);
        boolean boolean51 = node44.hasMoreThanOneChild();
        boolean boolean52 = node44.isThis();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(35, node13, node21, node44);
        com.google.javascript.rhino.Node node54 = node53.getLastChild();
        boolean boolean55 = node5.isEquivalentToTyped(node53);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo56 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "OR \n" + "'", str28, "OR \n");
        org.junit.Assert.assertTrue("'" + subclassType29 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType29.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0898");
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
        com.google.javascript.rhino.Node node96 = enumType91.getPropertyNode("true");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable97 = enumType91.getCtorImplementedInterfaces();
        boolean boolean98 = enumType91.matchesNumberContext();
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
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertNull(node96);
        org.junit.Assert.assertNotNull(objectTypeIterable97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}" + "'", str99, "enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0899");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 1.0f);
        com.google.javascript.rhino.Node node2 = node1.getFirstChild();
        boolean boolean3 = node1.isUnscopedQualifiedName();
        node1.setType(0);
        boolean boolean6 = node1.isComma();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0900");
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
        jSTypeRegistry16.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        node28.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node31 = node28.cloneTree();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node31);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry23.createFunctionType(jSType24, node32);
        int int34 = functionType33.getMinArguments();
        int int35 = functionType33.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType33.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = objectType36.getCtorExtendedInterfaces();
        boolean boolean39 = objectType36.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        node46.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node49 = node46.cloneTree();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(10, node49);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry41.createFunctionType(jSType42, node50);
        int int52 = functionType51.getMinArguments();
        boolean boolean53 = functionType51.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType51.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] { jSType54 };
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry16.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType36, jSTypeArray55);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry1.createParameters(jSTypeArray55);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative58 = null;
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray59 = new com.google.javascript.rhino.jstype.JSTypeNative[] { jSTypeNative58 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry1.createUnionType(jSTypeNativeArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(jSTypeIterable13);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeNativeArray59);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0901");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(100, "");
        int int5 = node4.getLineno();
        boolean boolean6 = node4.isLabelName();
        boolean boolean7 = node4.isNumber();
        com.google.javascript.rhino.Node[] nodeArray8 = new com.google.javascript.rhino.Node[] { node4 };
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0, nodeArray8, 12, 41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((int) (byte) -1, nodeArray8);
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
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0902");
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder0 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder1 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder2 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder3 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder4 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder5 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder6 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList7 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder0, serializableCollectionBuilder1, serializableCollectionBuilder2, serializableCollectionBuilder3, serializableCollectionBuilder4, serializableCollectionBuilder5, serializableCollectionBuilder6);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder8 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder9 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder10 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder11 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder12 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder13 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder14 = new com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>>> serializableCollectionBuilderList15 = com.google.common.collect.ImmutableList.of(serializableCollectionBuilder8, serializableCollectionBuilder9, serializableCollectionBuilder10, serializableCollectionBuilder11, serializableCollectionBuilder12, serializableCollectionBuilder13, serializableCollectionBuilder14);
        java.util.Collection[] collectionArray17 = new java.util.Collection[0];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.io.Serializable>[] serializableCollectionArray18 = (java.util.Collection<java.io.Serializable>[]) collectionArray17;
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder19 = serializableCollectionBuilder14.add(serializableCollectionArray18);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder20 = serializableCollectionBuilder0.add(serializableCollectionArray18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList29 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList38 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue37);
        boolean boolean39 = serializableList29.containsAll((java.util.Collection<java.io.Serializable>) serializableList38);
        com.google.common.collect.ImmutableList.Builder<java.util.Collection<java.io.Serializable>> serializableCollectionBuilder40 = serializableCollectionBuilder20.add((java.util.Collection<java.io.Serializable>) serializableList29);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList7);
        org.junit.Assert.assertNotNull(serializableCollectionBuilderList15);
        org.junit.Assert.assertNotNull(collectionArray17);
        org.junit.Assert.assertNotNull(serializableCollectionArray18);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder19);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder20);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(serializableList29);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(serializableList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollectionBuilder40);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0903");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isTry();
        node2.setLength(4);
        java.util.Set<java.lang.String> strSet11 = node2.getDirectives();
        boolean boolean12 = node2.isGetElem();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0904");
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
        com.google.javascript.rhino.Node node37 = functionType17.getSource();
        java.lang.Iterable iterable38 = functionType17.getCtorImplementedInterfaces();
        int int39 = functionType17.getPropertiesCount();
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
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(iterable38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0905");
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
        com.google.javascript.rhino.ErrorReporter errorReporter57 = jSTypeRegistry1.getErrorReporter();
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean74 = jSDocInfo73.isNoCompile();
        boolean boolean75 = jSDocInfo73.hasTypedefType();
        int int76 = jSDocInfo73.getImplementedInterfaceCount();
        functionType69.setPropertyJSDocInfo("", jSDocInfo73);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = functionType69.getPossibleToBooleanOutcomes();
        int int79 = functionType69.getPropertiesCount();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString((int) (short) 10, "");
        boolean boolean83 = node82.isUnscopedQualifiedName();
        node82.setSourceFileForTesting("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType69, node82);
        java.util.List<java.lang.String> strList87 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.setTemplateTypeNames(strList87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(errorReporter57);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(functionType86);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0906");
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
        boolean boolean67 = parameterizedType63.isNoObjectType();
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
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0907");
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = functionType38.getParameters();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType38.getTypeOfThis();
        com.google.javascript.rhino.jstype.UnionType unionType45 = objectType44.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = unionType45.getDisplayName();
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
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNull(unionType45);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0908");
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
        java.util.stream.Stream<java.io.Serializable> serializableStream34 = serializableList8.parallelStream();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList43 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList52 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue51);
        boolean boolean53 = serializableList43.containsAll((java.util.Collection<java.io.Serializable>) serializableList52);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet54 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList55 = com.google.common.collect.ImmutableList.of(booleanLiteralSet54);
        boolean boolean56 = serializableList52.equals((java.lang.Object) booleanLiteralSet54);
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList57 = serializableList52.asList();
        java.lang.String str58 = serializableList57.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = serializableList8.addAll((java.util.Collection<java.io.Serializable>) serializableList57);
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
        org.junit.Assert.assertNotNull(serializableStream34);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(serializableList43);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(serializableList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet54 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet54.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(serializableList57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str58, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0909");
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
        boolean boolean30 = functionType11.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType11.getRestrictedTypeGivenToBooleanOutcome(false);
        boolean boolean33 = functionType11.isNullType();
        boolean boolean34 = functionType11.isReturnTypeInferred();
        boolean boolean35 = functionType11.hasReferenceName();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0910");
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
        com.google.javascript.rhino.jstype.FunctionType functionType99 = enumElementType96.getConstructor();
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
        org.junit.Assert.assertNull(functionType99);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0911");
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
        boolean boolean94 = parameterizedType90.isNullable();
        com.google.javascript.rhino.jstype.EnumType enumType95 = parameterizedType90.toMaybeEnumType();
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(enumType95);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0912");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) (short) 10);
        node1.setVarArgs(true);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0913");
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
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString(100, "");
        int int53 = node52.getLineno();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean57 = node56.isObjectLit();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node61 = node56.copyInformationFromForTree(node60);
        boolean boolean62 = node60.isObjectLit();
        boolean boolean63 = node60.isLabelName();
        com.google.javascript.rhino.Node node64 = node52.srcrefTree(node60);
        com.google.javascript.rhino.jstype.JSType jSType65 = node64.getJSType();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean69 = node68.isObjectLit();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(44, node64, node68);
        boolean boolean71 = node68.isNumber();
        functionType29.setSource(node68);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0914");
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
        int int18 = functionType16.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = functionType16.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = functionType16.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType16.autobox();
        boolean boolean22 = functionType16.isOrdinaryFunction();
        boolean boolean24 = functionType16.isPropertyInExterns("Named type with empty name component");
        boolean boolean26 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType16, "");
        jSTypeRegistry1.setLastGeneration(false);
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable43 = functionType40.getImplementedInterfaces();
        java.lang.Iterable iterable44 = functionType40.getCtorImplementedInterfaces();
        boolean boolean45 = functionType40.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean47 = jSDocInfo46.isNoCompile();
        boolean boolean48 = jSDocInfo46.hasTypedefType();
        functionType40.setJSDocInfo(jSDocInfo46);
        com.google.javascript.rhino.jstype.ObjectType.Property property51 = functionType40.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType40.getCtorExtendedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList53 = functionType40.getTemplateTypeNames();
        jSTypeRegistry1.setTemplateTypeNames((java.util.List<java.lang.String>) strList53);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((int) '4', node59, 49, 45);
        com.google.javascript.rhino.InputId inputId63 = null;
        node59.setInputId(inputId63);
        node59.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId67 = com.google.javascript.jscomp.NodeUtil.getInputId(node59);
        boolean boolean68 = node59.isThis();
        node59.setCharno(54);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71);
        jSTypeRegistry72.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable75 = jSTypeRegistry72.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString(100, "");
        node83.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node86 = node83.cloneTree();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(10, node86);
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry78.createFunctionType(jSType79, node87);
        jSTypeRegistry72.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType88);
        java.lang.String str90 = null; // flaky: functionType88.toString();
        boolean boolean91 = functionType88.isFunctionPrototypeType();
        boolean boolean92 = functionType88.isString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable93 = functionType88.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType94 = jSTypeRegistry1.createObjectType("Function", node59, (com.google.javascript.rhino.jstype.ObjectType) functionType88);
        boolean boolean95 = objectType94.isNullType();
        boolean boolean96 = objectType94.hasReferenceName();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable43);
        org.junit.Assert.assertNotNull(iterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(property51);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(inputId67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable75);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(functionType88);
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Function" + "'", str90, "Function");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable93);
        org.junit.Assert.assertNotNull(objectType94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0915");
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
            boolean boolean17 = node16.isDec();
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0916");
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
        boolean boolean27 = node6.isRegExp();
        java.util.Set<java.lang.String> strSet28 = node6.getDirectives();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString(100, "");
        java.lang.String str35 = node31.checkTreeEquals(node34);
        boolean boolean36 = node34.isCall();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        int int41 = node40.getLineno();
        boolean boolean42 = node40.isLabelName();
        boolean boolean43 = node40.isNumber();
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node40 };
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0, nodeArray44, 12, 41);
        java.lang.Object obj49 = node47.getProp(8);
        com.google.javascript.jscomp.CodingConvention.Bind bind50 = new com.google.javascript.jscomp.CodingConvention.Bind(node6, node34, node47);
        java.util.Set<java.lang.String> strSet51 = node34.getDirectives();
        boolean boolean52 = node34.isLocalResultCall();
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
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(strSet51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0917");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str2 = inputId1.getIdName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str2, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0918");
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
        boolean boolean55 = objectType54.isUnknownType();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0919");
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
        boolean boolean67 = parameterizedType63.isConstructor();
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0920");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getDescriptionForParameter("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0921");
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
        boolean boolean97 = node95.isQualifiedName();
        boolean boolean98 = node95.isTry();
        boolean boolean99 = node95.isVoid();
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
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0922");
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
        com.google.javascript.rhino.jstype.FunctionType functionType93 = enumType91.getConstructor();
        java.lang.String str94 = enumType91.getDisplayName();
        boolean boolean96 = enumType91.removeProperty("JSDocInfo");
        com.google.javascript.rhino.jstype.JSType jSType98 = enumType91.getRestrictedTypeGivenToBooleanOutcome(false);
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
        org.junit.Assert.assertNull(functionType93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str94, "InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0923");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isComma();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable10 = node2.getAncestors();
        com.google.javascript.rhino.Node node11 = node2.removeChildren();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertNotNull(ancestorIterable10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0924");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList8 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList17 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue16);
        boolean boolean18 = serializableList8.containsAll((java.util.Collection<java.io.Serializable>) serializableList17);
        boolean boolean20 = serializableList17.equals((java.lang.Object) 16);
        java.lang.Object obj21 = null;
        boolean boolean22 = serializableList17.equals(obj21);
        java.lang.Object[] objArray23 = serializableList17.toArray();
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec25 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(100, "");
        node33.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node36 = node33.cloneTree();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(10, node36);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry28.createFunctionType(jSType29, node37);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry28.getTypesWithProperty("hi!");
        jSTypeRegistry28.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType42 = assertionFunctionSpec25.getAssertedType(node26, jSTypeRegistry28);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        jSTypeRegistry44.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable47 = jSTypeRegistry44.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(100, "");
        node55.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node58 = node55.cloneTree();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(10, node58);
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry50.createFunctionType(jSType51, node59);
        jSTypeRegistry44.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType60);
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
        java.lang.Iterable iterable77 = functionType73.getCtorImplementedInterfaces();
        boolean boolean78 = functionType73.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean80 = jSDocInfo79.isNoCompile();
        boolean boolean81 = jSDocInfo79.hasTypedefType();
        functionType73.setJSDocInfo(jSDocInfo79);
        com.google.javascript.rhino.jstype.ObjectType.Property property84 = functionType73.getSlot("hi!");
        boolean boolean85 = functionType73.isInstanceType();
        boolean boolean86 = functionType73.isConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType87 = jSTypeRegistry28.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType60, (com.google.javascript.rhino.jstype.JSType) functionType73);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = parameterizedType87.getTypeOfThis();
        boolean boolean89 = parameterizedType87.isCheckedUnknownType();
        boolean boolean90 = parameterizedType87.isNoObjectType();
        boolean boolean91 = parameterizedType87.isTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType92 = parameterizedType87.toMaybeUnionType();
        com.google.javascript.rhino.jstype.FunctionType functionType93 = parameterizedType87.getOwnerFunction();
        boolean boolean94 = serializableList17.contains((java.lang.Object) parameterizedType87);
        java.lang.Iterable iterable95 = parameterizedType87.getCtorImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNotNull(objectTypeIterable47);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertNotNull(iterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(property84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(parameterizedType87);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(unionType92);
        org.junit.Assert.assertNull(functionType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(iterable95);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0925");
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
        boolean boolean79 = functionType53.isStringObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0926");
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
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        jSTypeRegistry16.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = jSTypeRegistry16.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        jSTypeRegistry16.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        node28.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node31 = node28.cloneTree();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node31);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry23.createFunctionType(jSType24, node32);
        int int34 = functionType33.getMinArguments();
        int int35 = functionType33.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType33.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = objectType36.getCtorExtendedInterfaces();
        boolean boolean39 = objectType36.hasOwnProperty("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(100, "");
        node46.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node49 = node46.cloneTree();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(10, node49);
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry41.createFunctionType(jSType42, node50);
        int int52 = functionType51.getMinArguments();
        boolean boolean53 = functionType51.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType51.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] { jSType54 };
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry16.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) objectType36, jSTypeArray55);
        boolean boolean57 = functionType11.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType56);
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
        com.google.javascript.rhino.jstype.ObjectType objectType72 = functionType69.getTypeOfThis();
        com.google.common.collect.ImmutableList<java.lang.String> strList73 = functionType69.getTemplateTypeNames();
        boolean boolean75 = functionType69.isPropertyTypeDeclared("(INSTANCEOF 49\n    OR \n)");
        boolean boolean76 = functionType56.hasEqualCallType(functionType69);
        boolean boolean77 = functionType69.hasImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78);
        jSTypeRegistry79.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = jSTypeRegistry79.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry85 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84);
        com.google.javascript.rhino.jstype.JSType jSType86 = null;
        com.google.javascript.rhino.Node node90 = com.google.javascript.rhino.Node.newString(100, "");
        node90.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node93 = node90.cloneTree();
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node(10, node93);
        com.google.javascript.rhino.jstype.FunctionType functionType95 = jSTypeRegistry85.createFunctionType(jSType86, node94);
        jSTypeRegistry79.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType95);
        java.lang.String str97 = null; // flaky: functionType95.toString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable98 = functionType95.getCtorExtendedInterfaces();
        boolean boolean99 = functionType69.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType95);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(functionType95);
// flaky:         org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Function" + "'", str97, "Function");
        org.junit.Assert.assertNotNull(objectTypeIterable98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0927");
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
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType11.restrictByNotNullOrUndefined();
        boolean boolean15 = jSType14.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        node22.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node25 = node22.cloneTree();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(10, node25);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry17.createFunctionType(jSType18, node26);
        int int28 = functionType27.getMinArguments();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType27.findPropertyType("Named type with empty name component");
        boolean boolean31 = jSType14.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType27);
        java.lang.String str32 = functionType27.getDisplayName();
        boolean boolean33 = functionType27.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0928");
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
        jSTypeRegistry1.setLastGeneration(false);
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
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0929");
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
        com.google.javascript.rhino.jstype.ObjectType objectType42 = functionType38.dereference();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet43 = objectType42.getPossibleToBooleanOutcomes();
        java.util.Set<java.lang.String> strSet44 = objectType42.getOwnPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = strSet44.add("INSTANCEOF 49\n    OR \n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet43 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet43.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(strSet44);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0930");
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
        boolean boolean30 = functionType26.isNativeObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0931");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.isConstant();
        boolean boolean3 = jSDocInfo0.isExterns();
        java.lang.String str4 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0932");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 1, "");
        boolean boolean3 = node2.isIn();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0933");
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
        java.lang.String str26 = node19.toString();
        boolean boolean27 = node19.isNull();
        int int28 = node19.getCharno();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "OR " + "'", str26, "OR ");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0934");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet1 = jSDocInfo0.getModifies();
        boolean boolean2 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0935");
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
        boolean boolean47 = functionType35.hasProperty("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean50 = jSDocInfo49.isNoCompile();
        boolean boolean51 = jSDocInfo49.hasTypedefType();
        int int52 = jSDocInfo49.getImplementedInterfaceCount();
        boolean boolean53 = jSDocInfo49.isExterns();
        boolean boolean54 = jSDocInfo49.isJavaDispatch();
        boolean boolean55 = jSDocInfo49.isNoShadow();
        functionType35.setPropertyJSDocInfo("?", jSDocInfo49);
        boolean boolean58 = functionType35.hasProperty("[10, 1, 4, -1, a, 100.0, 100.0, true]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = functionType35.toDebugHashCodeString();
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
        org.junit.Assert.assertNotNull(iterable45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0936");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int1 = typePosition0.getEndLine();
        typePosition0.setPositionInformation((int) (short) 10, 4, 54, 45);
        int int7 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "");
        node14.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node17 = node14.cloneTree();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(10, node17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry9.createFunctionType(jSType10, node18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(100, "");
        int int25 = node24.getLineno();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean29 = node28.isObjectLit();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node33 = node28.copyInformationFromForTree(node32);
        boolean boolean34 = node32.isObjectLit();
        boolean boolean35 = node32.isLabelName();
        com.google.javascript.rhino.Node node36 = node24.srcrefTree(node32);
        com.google.javascript.rhino.jstype.JSType jSType37 = node36.getJSType();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean41 = node40.isObjectLit();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(44, node36, node40);
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
        com.google.javascript.rhino.jstype.FunctionType functionType58 = functionType54.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot60 = functionType54.getSlot("true");
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry9.createObjectType("", node42, (com.google.javascript.rhino.jstype.ObjectType) functionType54);
        boolean boolean62 = node42.isExprResult();
        boolean boolean63 = node42.isIf();
        typePosition0.setItem(node42);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 45 + "'", int7 == 45);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(jSType37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertNull(staticSlot60);
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0937");
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
        boolean boolean30 = node28.isObjectLit();
        boolean boolean31 = node28.isSwitch();
        boolean boolean32 = node15.isEquivalentToTyped(node28);
        boolean boolean33 = node28.isComma();
        com.google.javascript.rhino.Node node34 = node28.getParent();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0938");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        node6.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(10, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry1.createFunctionType(jSType2, node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.Node node14 = objectType12.getPropertyNode("STRING Not declared as a type name 32\n");
        com.google.javascript.rhino.Node node15 = objectType12.getRootNode();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0939");
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
        boolean boolean69 = parameterizedType63.isNativeObjectType();
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
        org.junit.Assert.assertNotNull(iterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0940");
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
        boolean boolean27 = node22.isDo();
        boolean boolean28 = node22.isOr();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0941");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0942");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(49, (int) (short) 0, 42);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0943");
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        jSTypeRegistry2.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable5 = jSTypeRegistry2.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(100, "");
        node13.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node16 = node13.cloneTree();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(10, node16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry8.createFunctionType(jSType9, node17);
        jSTypeRegistry2.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType18);
        java.lang.String str20 = null; // flaky: functionType18.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = null;
        functionType18.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo22);
        boolean boolean24 = functionType18.hasCachedValues();
        boolean boolean25 = functionType18.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType27 = functionType18.getBindReturnType(1);
        com.google.javascript.rhino.Node node28 = functionType18.getParametersNode();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(53, node28);
        int int30 = node29.getType();
        org.junit.Assert.assertNotNull(objectTypeIterable5);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(functionType18);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Function" + "'", str20, "Function");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 53 + "'", int30 == 53);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0944");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node2.isInc();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0945");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isLabelName();
        node6.setSourceFileForTesting("hi!");
        node6.setType(1);
        node6.setSourceEncodedPosition(2);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((int) '4', node19, 49, 45);
        com.google.javascript.rhino.InputId inputId23 = null;
        node19.setInputId(inputId23);
        node19.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId27 = com.google.javascript.jscomp.NodeUtil.getInputId(node19);
        boolean boolean28 = node19.isThis();
        boolean boolean29 = node19.isUnscopedQualifiedName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node19);
        node6.setStaticSourceFile(staticSourceFile30);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = new com.google.javascript.rhino.JSTypeExpression(node6, "InputId: Not declared as a constructor");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(inputId27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(staticSourceFile30);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0946");
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
        java.util.Set set68 = parameterizedType63.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = parameterizedType63.getImplicitPrototype();
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
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(objectType69);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0947");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType17.getCtorExtendedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType17.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType.Property property23 = functionType17.getSlot("Not declared as a type name");
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
        com.google.javascript.rhino.jstype.ObjectType objectType38 = functionType35.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = functionType35.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType35.autobox();
        boolean boolean41 = functionType35.isOrdinaryFunction();
        boolean boolean42 = functionType35.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType35.getReturnType();
        boolean boolean45 = functionType35.hasOwnProperty("Named type with empty name component");
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
        boolean boolean63 = functionType57.isEmptyType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair64 = functionType35.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType57);
        boolean boolean65 = functionType35.matchesNumberContext();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = functionType17.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType35);
        com.google.javascript.rhino.Node node68 = functionType17.getPropertyNode("Unknown class name");
        boolean boolean69 = functionType17.hasCachedValues();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNull(property23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertNotNull(iterable61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(typePair64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0948");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue4.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue0.and(ternaryValue4);
        boolean boolean10 = ternaryValue4.toBoolean(false);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        jSTypeRegistry12.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = jSTypeRegistry12.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(100, "");
        node23.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node26 = node23.cloneTree();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(10, node26);
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry18.createFunctionType(jSType19, node27);
        jSTypeRegistry12.registerPropertyOnType("OR \n", (com.google.javascript.rhino.jstype.JSType) functionType28);
        java.lang.String str30 = null; // flaky: functionType28.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = null;
        functionType28.setPropertyJSDocInfo("InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]", jSDocInfo32);
        boolean boolean34 = functionType28.hasCachedValues();
        boolean boolean35 = functionType28.matchesObjectContext();
        com.google.javascript.rhino.jstype.FunctionType functionType37 = functionType28.getBindReturnType(1);
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = functionType37.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType49);
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
        boolean boolean73 = ternaryValue70.toBoolean(true);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList74 = com.google.common.collect.ImmutableList.of(ternaryValue4, ternaryValue52, ternaryValue70);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(functionType28);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Function" + "'", str30, "Function");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(ternaryValue52);
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(ternaryValueList74);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0949");
        com.google.common.collect.ImmutableList<java.lang.Object[]> objArrayList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(objArrayList0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0950");
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
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node25.getJsDocBuilderForNode();
        boolean boolean27 = node25.isNot();
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
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0951");
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
        java.lang.Iterable iterable95 = enumType91.getCtorImplementedInterfaces();
        boolean boolean97 = enumType91.isPropertyTypeInferred("OR  [source_file: ]\n");
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
        org.junit.Assert.assertNotNull(iterable95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0952");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDeprecationReason();
        boolean boolean2 = jSDocInfo0.hasFileOverview();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isDefine();
        boolean boolean5 = jSDocInfo0.isExterns();
        java.lang.String str6 = jSDocInfo0.getLendsName();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str9 = jSDocInfo8.getDeprecationReason();
        boolean boolean10 = jSDocInfo8.hasFileOverview();
        boolean boolean11 = jSDocInfo8.isExterns();
        boolean boolean12 = jSDocInfo8.isImplicitCast();
        int int13 = jSDocInfo8.getParameterCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo8.setVisibility(visibility14);
        jSDocInfo0.setVisibility(visibility14);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + visibility14 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility14.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0953");
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
        boolean boolean31 = node2.isDec();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0954");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 36, 40960, 15);
        boolean boolean4 = node3.isDefaultCase();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0955");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str9 = jSDocInfo8.getOriginalCommentString();
        boolean boolean10 = jSDocInfo8.hasBaseType();
        node2.setJSDocInfo(jSDocInfo8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo8.getBaseType();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0956");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = functionType16.getOwnPropertyJSDocInfo("Function");
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType16.unboxesTo();
        com.google.javascript.rhino.Node node49 = functionType16.getPropertyNode("Unknown class name");
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
        org.junit.Assert.assertNull(jSDocInfo46);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0957");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean4 = jSDocInfo0.isExterns();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0958");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((int) '4', node3, 49, 45);
        boolean boolean7 = node6.isVar();
        com.google.javascript.rhino.Node node9 = node6.getAncestor((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = node9.isExprResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0959");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newExpr(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0960");
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
        int int18 = node14.getType();
        int int19 = node14.getLineno();
        boolean boolean20 = node14.isDebugger();
        boolean boolean21 = node14.isNoSideEffectsCall();
        boolean boolean22 = node14.isThrow();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0961");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isLabelName();
        boolean boolean5 = node2.isNumber();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node2.siblings();
        boolean boolean7 = node2.isStringKey();
        boolean boolean8 = node2.isTypeOf();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0962");
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
        boolean boolean34 = objectType30.hasProperty("hi!");
        java.util.Set<java.lang.String> strSet35 = objectType30.getOwnPropertyNames();
        boolean boolean36 = strSet35.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0963");
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
        boolean boolean29 = serializableList8.contains((java.lang.Object) "Function");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = objectType45.getCtorExtendedInterfaces();
        java.util.Set<java.lang.String> strSet47 = objectType45.getOwnPropertyNames();
        java.util.Iterator<java.lang.String> strItor48 = strSet47.iterator();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList57 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue56);
        java.lang.String str58 = serializableList57.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList67 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue66);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList76 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue75);
        boolean boolean77 = serializableList67.containsAll((java.util.Collection<java.io.Serializable>) serializableList76);
        boolean boolean78 = serializableList57.containsAll((java.util.Collection<java.io.Serializable>) serializableList76);
        java.util.stream.Stream<java.io.Serializable> serializableStream79 = serializableList57.parallelStream();
        boolean boolean80 = strSet47.containsAll((java.util.Collection<java.io.Serializable>) serializableList57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = serializableList8.addAll(46, (java.util.Collection<java.io.Serializable>) serializableList57);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strItor48);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(serializableList57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[10, 1, 4, -1, a, 100.0, 100.0, true]" + "'", str58, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNotNull(serializableList67);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(serializableList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(serializableStream79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0964");
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
        jSTypeRegistry39.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry39.createNamedType("OR  [slash_v: [10, 1, 4, -1, a, 100.0, 100.0, true]]", "java.io.IOException: Named type with empty name component", (-2147483648), 2);
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
        org.junit.Assert.assertNotNull(jSType73);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0965");
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
        com.google.javascript.rhino.Node node37 = jSTypeExpression36.getRoot();
        boolean boolean38 = node37.isCall();
        boolean boolean39 = node37.isCall();
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getSourceName(node37);
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
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0966");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(100, "");
        node48.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node51 = node48.cloneTree();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(10, node51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry43.createFunctionType(jSType44, node52);
        int int54 = functionType53.getMinArguments();
        int int55 = functionType53.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType53.getImplicitPrototype();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = functionType53.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType58 = functionType53.autobox();
        boolean boolean59 = functionType53.isOrdinaryFunction();
        boolean boolean60 = functionType53.canBeCalled();
        boolean boolean62 = functionType53.isPropertyTypeInferred("JSDocInfo");
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType53.restrictByNotNullOrUndefined();
        boolean boolean64 = functionType53.isNullType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry1.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean66 = jSType65.matchesInt32Context();
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
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0967");
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
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean69 = node68.isObjectLit();
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node73 = node68.copyInformationFromForTree(node72);
        boolean boolean74 = node68.isTry();
        node68.setOptionalArg(false);
        java.lang.String str77 = node68.getSourceFileName();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((int) '4', node81, 49, 45);
        com.google.javascript.rhino.InputId inputId85 = null;
        node81.setInputId(inputId85);
        node81.setSourceFileForTesting("");
        com.google.javascript.rhino.InputId inputId89 = com.google.javascript.jscomp.NodeUtil.getInputId(node81);
        boolean boolean90 = node81.isThis();
        boolean boolean91 = node81.isUnscopedQualifiedName();
        boolean boolean93 = node81.getBooleanProp(7);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection94 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node81);
        // The following exception was thrown during execution in test generation
        try {
            node63.addChildBefore(node68, node81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNull(inputId89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(nodeCollection94);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0968");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isTypeOf();
        com.google.javascript.rhino.Node node6 = node2.getAncestor((int) (byte) 1);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0969");
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
        boolean boolean27 = node17.isComma();
        boolean boolean28 = node17.isFalse();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0970");
        com.google.common.collect.ImmutableList.Builder<java.util.Spliterator<java.io.Serializable>> serializableSpliteratorBuilder0 = com.google.common.collect.ImmutableList.builder();
        org.junit.Assert.assertNotNull(serializableSpliteratorBuilder0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0971");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isSwitch();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((int) (short) -1, node7);
        int int12 = node7.getCharno();
        int int13 = node7.getSourceOffset();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean19 = node18.isObjectLit();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node23 = node18.copyInformationFromForTree(node22);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean27 = node26.isObjectLit();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node31 = node26.copyInformationFromForTree(node30);
        boolean boolean32 = node30.isObjectLit();
        boolean boolean33 = node30.isFromExterns();
        boolean boolean34 = node30.wasEmptyNode();
        boolean boolean35 = node30.isQuotedString();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship36 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType15, node22, node30);
        com.google.javascript.rhino.Node node37 = node30.cloneNode();
        java.lang.Object obj39 = null;
        node37.putProp(100, obj39);
        node37.putBooleanProp(0, true);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) (byte) 1, node37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node45 = node7.removeChildAfter(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + subclassType15 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType15.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0972");
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
        boolean boolean91 = functionType11.isNoObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0973");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]})" + "'", str1, "(enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]})");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0974");
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
        boolean boolean30 = functionType11.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = functionType11.canTestForEqualityWith(jSType31);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0975");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Set<java.lang.String> strSet1 = jSDocInfo0.getModifies();
        boolean boolean2 = jSDocInfo0.isImplicitCast();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        java.util.Spliterator<java.lang.String> strSpliterator4 = strSet3.spliterator();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSpliterator4);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0976");
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
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable29 = node28.getAncestors();
        java.lang.Appendable appendable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            node28.appendStringTree(appendable30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 36");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(ancestorIterable29);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0977");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean7 = node6.isObjectLit();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node11 = node6.copyInformationFromForTree(node10);
        boolean boolean12 = node10.isObjectLit();
        boolean boolean13 = node10.isLabelName();
        com.google.javascript.rhino.Node node14 = node2.srcrefTree(node10);
        boolean boolean15 = node14.isFromExterns();
        boolean boolean16 = node14.hasChildren();
        node14.setSourceFileForTesting("Named type with empty name component");
        boolean boolean19 = node14.isOr();
        boolean boolean20 = node14.isDebugger();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0978");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList1 = com.google.common.collect.ImmutableList.of(booleanLiteralSet0);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet2 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = booleanLiteralSet0.union(booleanLiteralSet2);
        boolean boolean5 = booleanLiteralSet3.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet6 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet7 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet8 = booleanLiteralSet6.union(booleanLiteralSet7);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet9 = booleanLiteralSet3.intersection(booleanLiteralSet6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList18 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.TRUE;
        com.google.common.collect.ImmutableList<java.io.Serializable> serializableList27 = com.google.common.collect.ImmutableList.of((java.io.Serializable) 10, (java.io.Serializable) (short) 1, (java.io.Serializable) '4', (java.io.Serializable) (short) -1, (java.io.Serializable) 'a', (java.io.Serializable) 100.0f, (java.io.Serializable) 100.0f, (java.io.Serializable) ternaryValue26);
        boolean boolean28 = serializableList18.containsAll((java.util.Collection<java.io.Serializable>) serializableList27);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet29 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.BooleanLiteralSet> booleanLiteralSetList30 = com.google.common.collect.ImmutableList.of(booleanLiteralSet29);
        boolean boolean31 = serializableList27.equals((java.lang.Object) booleanLiteralSet29);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = booleanLiteralSet3.union(booleanLiteralSet29);
        boolean boolean34 = booleanLiteralSet32.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList1);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet2 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet2.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet3 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet3.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet6 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet6.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet7 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet7.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet8 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet8.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet9 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet9.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(serializableList18);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(serializableList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertNotNull(booleanLiteralSetList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0979");
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
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(100, "");
        int int59 = node58.getLineno();
        boolean boolean60 = node58.isTypeOf();
        functionType46.setSource(node58);
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean63 = jSDocInfo62.isNoCompile();
        boolean boolean64 = jSDocInfo62.hasTypedefType();
        java.lang.String str65 = jSDocInfo62.getBlockDescription();
        boolean boolean66 = jSDocInfo62.isNoShadow();
        int int67 = jSDocInfo62.getParameterCount();
        java.util.Collection<java.lang.String> strCollection68 = jSDocInfo62.getAuthors();
        functionType46.setJSDocInfo(jSDocInfo62);
        java.lang.String str70 = jSDocInfo62.getOriginalCommentString();
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
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(strCollection68);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0980");
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
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList22 = functionType17.getSubTypes();
        com.google.javascript.rhino.jstype.ObjectType objectType23 = functionType17.getPrototype();
        boolean boolean24 = functionType17.matchesStringContext();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot26 = functionType17.getSlot("java.io.IOException: Function");
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(functionType17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Function" + "'", str19, "Function");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(functionTypeList22);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(staticSlot26);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0981");
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Function.<Function>" + "'", str65, "Function.<Function>");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(unionType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0982");
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
        boolean boolean49 = functionType11.isVoidType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = functionType11.toDebugHashCodeString();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0983");
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
        boolean boolean17 = functionType11.isEmptyType();
        java.util.Set<java.lang.String> strSet18 = functionType11.getPropertyNames();
        java.lang.String str19 = functionType11.getReferenceName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(iterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0984");
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
        com.google.javascript.rhino.jstype.EnumType enumType95 = enumType91.toMaybeEnumType();
        boolean boolean96 = enumType91.matchesNumberContext();
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
        org.junit.Assert.assertNotNull(enumType95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0985");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = jSTypeRegistry4.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry4.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType23 = objectType21.findPropertyType("enum{InputId: [10, 1, 4, -1, a, 100.0, 100.0, true]}");
        boolean boolean25 = objectType21.isPropertyTypeInferred("Not declared as a constructor");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0986");
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
        com.google.javascript.rhino.jstype.EnumType enumType20 = objectType19.toMaybeEnumType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = objectType19.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(100, "");
        node28.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node31 = node28.cloneTree();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node31);
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry23.createFunctionType(jSType24, node32);
        int int34 = functionType33.getMinArguments();
        int int35 = functionType33.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType33.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(100, "");
        node43.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node43.cloneTree();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node46);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry38.createFunctionType(jSType39, node47);
        int int49 = functionType48.getMinArguments();
        boolean boolean50 = functionType33.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType48);
        boolean boolean51 = functionType33.isNoType();
        boolean boolean52 = functionType33.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType33.getRestrictedTypeGivenToBooleanOutcome(false);
        boolean boolean55 = functionType33.isNullType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType56 = functionType33.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = functionType33.getBindReturnType((int) '4');
        boolean boolean59 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) objectType19, (com.google.javascript.rhino.jstype.JSType) functionType58);
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNull(enumType20);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(enumElementType56);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0987");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(41);
        sideEffectFlags1.setReturnsTainted();
        int int3 = sideEffectFlags1.valueOf();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesArguments();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0988");
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
        java.util.Set<java.lang.String> strSet97 = enumType91.getElements();
        com.google.javascript.rhino.jstype.JSType jSType98 = enumType91.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str99 = jSType98.getDisplayName();
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
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(strSet97);
        org.junit.Assert.assertNull(jSType98);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0989");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        int int3 = node2.getLineno();
        boolean boolean4 = node2.isLabelName();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        com.google.javascript.rhino.Node node7 = node2.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = node7.isDebugger();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(staticSourceFile5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0990");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean3 = node2.isObjectLit();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node7 = node2.copyInformationFromForTree(node6);
        boolean boolean8 = node6.isObjectLit();
        boolean boolean9 = node6.isSwitch();
        node6.setSourceEncodedPosition(50);
        boolean boolean12 = node6.isInc();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo13 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0991");
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
        boolean boolean23 = node22.isDelProp();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(50, "[10, 1, 4, -1, a, 100.0, 100.0, true]");
        int int27 = node22.getIndexOfChild(node26);
        boolean boolean28 = node26.isComma();
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0992");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("", 35, (int) (byte) -1);
        boolean boolean4 = node3.isAssignAdd();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0993");
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
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType11.getPropertyType("java.io.IOException: Function");
        com.google.javascript.rhino.jstype.JSType jSType20 = jSType19.autobox();
        boolean boolean21 = jSType20.isEmptyType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0994");
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
        int int97 = enumElementType96.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType99 = enumElementType96.getPropertyType("Function.<Function>");
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
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0995");
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
        boolean boolean21 = jSDocInfo17.isOverride();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0996");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry1.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        boolean boolean5 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        jSTypeRegistry8.clearNamedTypes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable11 = jSTypeRegistry8.getEachReferenceTypeWithProperty("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString(100, "");
        node18.setLineno((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = node18.cloneTree();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(10, node21);
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry13.createFunctionType(jSType14, node22);
        int int24 = functionType23.getMinArguments();
        boolean boolean25 = functionType23.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSTypeRegistry8.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType23);
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.restrictByNotNullOrUndefined();
        boolean boolean29 = functionType23.hasOwnProperty("Function");
        com.google.javascript.rhino.jstype.ObjectType.Property property31 = functionType23.getSlot("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = functionType23.getOwnPropertyJSDocInfo("INSTANCEOF 49\n    OR \n");
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType23, "OR  [slash_v: [10, 1, 4, -1, a, 100.0, 100.0, true]]", "Not declared as a type name", 8, 52);
        boolean boolean39 = jSType38.hasAnyTemplate();
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(property31);
        org.junit.Assert.assertNull(jSDocInfo33);
        org.junit.Assert.assertNotNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0997");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString(100, "");
        boolean boolean4 = node3.isObjectLit();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node8 = node3.copyInformationFromForTree(node7);
        boolean boolean9 = node7.isObjectLit();
        boolean boolean10 = node7.isFromExterns();
        boolean boolean11 = node7.isExprResult();
        boolean boolean12 = node7.isInstanceOf();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0, node7, 0, (-1));
        com.google.javascript.rhino.Node node16 = node15.removeFirstChild();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0998");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(100, "");
        com.google.javascript.rhino.Node node3 = node2.getLastChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = node3.getLastSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test0999");
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
        com.google.javascript.rhino.jstype.FunctionType functionType68 = parameterizedType63.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.EnumType enumType69 = parameterizedType63.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType63.collapseUnion();
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
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNull(enumType69);
        org.junit.Assert.assertNotNull(jSType70);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test1000");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = functionType11.getAllExtendedInterfaces();
        boolean boolean46 = functionType11.isNullable();
        boolean boolean47 = functionType11.isNoType();
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
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }
}
