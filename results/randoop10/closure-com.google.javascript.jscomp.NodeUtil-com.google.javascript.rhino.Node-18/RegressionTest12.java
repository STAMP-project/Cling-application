import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02401");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = jSDocInfo2.getTypeNodes();
        int int10 = jSDocInfo2.getExtendedInterfacesCount();
        java.lang.String str11 = jSDocInfo2.toString();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSDocInfo" + "'", str11, "JSDocInfo");
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02402");
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
        jSTypeRegistry1.unregisterPropertyOnType("JSDocInfo", jSType40);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        boolean boolean51 = node49.isQuotedString();
        com.google.javascript.rhino.Node node52 = node49.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry44.createFunctionType(jSType45, node52);
        boolean boolean54 = functionType53.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList55 = functionType53.getSubTypes();
        com.google.javascript.rhino.Node node56 = functionType53.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = functionType53.getJSDocInfo();
        boolean boolean58 = functionType53.matchesStringContext();
        boolean boolean59 = functionType53.isParameterizedType();
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry1.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.ObjectType objectType61 = jSTypeRegistry1.createAnonymousObjectType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
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
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(functionTypeList55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(jSDocInfo57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectType61);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02403");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        int int6 = jSDocInfo0.getImplementedInterfaceCount();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeCollection9);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02404");
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
        boolean boolean16 = functionType10.isParameterizedType();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType10.getConstructor();
        boolean boolean18 = functionType10.isDateType();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = functionType10.getBindReturnType((int) (byte) 0);
        boolean boolean21 = functionType10.canBeCalled();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02405");
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
        com.google.javascript.rhino.jstype.ObjectType objectType15 = functionType10.toObjectType();
        java.lang.String str16 = functionType10.toDebugHashCodeString();
        boolean boolean17 = functionType10.isFunctionPrototypeType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable25 = node24.children();
        boolean boolean26 = node24.isQuotedString();
        com.google.javascript.rhino.Node node27 = node24.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry19.createFunctionType(jSType20, node27);
        boolean boolean29 = functionType28.isArrayType();
        boolean boolean30 = functionType28.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType31 = functionType28.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = objectType31.getCtorExtendedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList37 = com.google.common.collect.ImmutableList.of(jSDocInfo33, jSDocInfo34, jSDocInfo35, jSDocInfo36);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = jSDocInfo36.getReturnType();
        boolean boolean39 = jSDocInfo36.isImplicitCast();
        objectType31.setJSDocInfo(jSDocInfo36);
        boolean boolean41 = jSDocInfo36.isHidden();
        boolean boolean42 = jSDocInfo36.isHidden();
        java.lang.String str43 = jSDocInfo36.getLendsName();
        jSDocInfo36.setDeprecated(true);
        functionType10.setJSDocInfo(jSDocInfo36);
        java.lang.String str47 = jSDocInfo36.getReturnDescription();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(objectType15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "function ({1474018528}): {1474018528}" + "'", str16, "function ({1474018528}): {1474018528}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertNotNull(jSDocInfoList37);
        org.junit.Assert.assertNull(jSTypeExpression38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02406");
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
        int int79 = node77.getLineno();
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
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02407");
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
        boolean boolean32 = functionType29.isPropertyTypeDeclared("[10, 0]");
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType29.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType29.getIndexType();
        boolean boolean35 = functionType29.isEnumElementType();
        java.lang.String str36 = functionType29.getDisplayName();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType29.getOwnImplementedInterfaces();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02408");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objList2.spliterator();
        java.lang.String str7 = objList2.toString();
        java.lang.Object[] objArray8 = objList2.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList12 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray32 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList33 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList33, objArray32);
        boolean boolean36 = objList33.add((java.lang.Object) 100.0d);
        java.util.Iterator<java.lang.Object> objItor37 = objList33.iterator();
        java.lang.Object[] objArray38 = objList33.toArray();
        java.util.Spliterator<java.lang.Object> objSpliterator39 = objList33.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = objList2.addAll((java.util.Collection<java.lang.Object>) objList33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objSpliterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[10, 0]" + "'", str7, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 0]");
        org.junit.Assert.assertNotNull(objList12);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objItor37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertNotNull(objSpliterator39);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02409");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node7 = jSTypeRegistry1.createParameters(jSTypeArray6);
        boolean boolean8 = node7.isFor();
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02410");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        boolean boolean5 = node3.isDo();
        int int6 = node3.getChildCount();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node3.children();
        boolean boolean8 = node3.isCall();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02411");
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
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry38.getType("hi!");
        jSTypeRegistry38.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node44 = jSTypeRegistry38.createParameters(jSTypeArray43);
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
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node71.children();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry38.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType59, node71);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node80.children();
        boolean boolean82 = node80.isQuotedString();
        com.google.javascript.rhino.Node node83 = node80.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry75.createFunctionType(jSType76, node83);
        boolean boolean85 = functionType84.isArrayType();
        boolean boolean87 = functionType84.isPropertyTypeInferred("JSDocInfo");
        boolean boolean88 = functionType84.isInstanceType();
        com.google.javascript.rhino.jstype.FunctionType functionType89 = functionType84.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = functionType84.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry38.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType84);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode92 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        jSTypeRegistry38.setResolveMode(resolveMode92);
        jSTypeRegistry1.setResolveMode(resolveMode92);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(node44);
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
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(nodeIterable81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + resolveMode92 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode92.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02412");
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
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable22 = node20.getAncestors();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean27 = node26.hasOneChild();
        node26.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node26.getAncestors();
        int int31 = node26.getChildCount();
        node20.addChildrenToFront(node26);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        node36.setLength(0);
        boolean boolean41 = node36.isVar();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean46 = node45.hasOneChild();
        node36.addChildToBack(node45);
        node45.detachChildren();
        boolean boolean49 = node26.isEquivalentTo(node45);
        node45.putBooleanProp(2147483647, false);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(39, node57);
        boolean boolean59 = node58.isIf();
        node58.detachChildren();
        boolean boolean61 = node58.isSyntheticBlock();
        com.google.javascript.rhino.Node node62 = node45.copyInformationFrom(node58);
        node62.setOptionalArg(false);
        // The following exception was thrown during execution in test generation
        try {
            node62.setString("function ({373829632}): {373829632}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
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
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02413");
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
        boolean boolean32 = functionType10.isUnknownType();
        boolean boolean33 = functionType10.isStringObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = functionType10.getJSDocInfo();
        boolean boolean36 = functionType10.hasProperty("function ({1730032944}): {1730032944}");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSDocInfo34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02414");
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
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        com.google.javascript.rhino.Node node39 = node36.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry31.createFunctionType(jSType32, node39);
        com.google.javascript.rhino.jstype.FunctionType functionType41 = functionType40.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType42 = functionType41.toMaybeEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable50 = node49.children();
        boolean boolean51 = node49.isQuotedString();
        com.google.javascript.rhino.Node node52 = node49.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry44.createFunctionType(jSType45, node52);
        boolean boolean54 = functionType53.isArrayType();
        java.lang.String str55 = functionType53.toAnnotationString();
        boolean boolean56 = functionType53.isStringObjectType();
        functionType41.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType53);
        jSTypeRegistry1.registerPropertyOnType("()", (com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node65.children();
        boolean boolean67 = node65.isQuotedString();
        com.google.javascript.rhino.Node node68 = node65.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry60.createFunctionType(jSType61, node68);
        boolean boolean70 = functionType69.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType69.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType69.toMaybeFunctionType();
        boolean boolean75 = functionType73.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType73.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType73);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet78 = functionType73.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType73.findPropertyType("(function ({1699758420}): {1699758420})");
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
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNull(enumElementType42);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(nodeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "function (...[?]): ?" + "'", str55, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeIterable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet78 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet78.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(jSType80);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02415");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({2135610525}): {2135610525}");
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02416");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        boolean boolean12 = node10.isQuotedString();
        com.google.javascript.rhino.Node node13 = node10.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry5.createFunctionType(jSType6, node13);
        boolean boolean15 = functionType14.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = functionType14.getPossibleToBooleanOutcomes();
        boolean boolean17 = functionType14.isResolved();
        boolean boolean18 = functionType14.hasImplementedInterfaces();
        boolean boolean19 = functionType14.isReturnTypeInferred();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = objList2.remove((java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02417");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node1.setCharno((int) (short) 1);
        boolean boolean4 = node1.isArrayLit();
        boolean boolean5 = node1.isDo();
        node1.setCharno((int) (short) -1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList12 = com.google.common.collect.ImmutableList.of(jSDocInfo8, jSDocInfo9, jSDocInfo10, jSDocInfo11);
        boolean boolean14 = jSDocInfo10.hasParameterType("hi!");
        boolean boolean15 = jSDocInfo10.hasReturnType();
        boolean boolean16 = jSDocInfo10.hasModifies();
        boolean boolean18 = jSDocInfo10.hasParameter("java.io.IOException: ");
        jSDocInfo10.setLicense("function ({1839678788}): {1839678788}");
        boolean boolean21 = jSDocInfo10.hasType();
        java.lang.String str22 = jSDocInfo10.getFileOverview();
        java.util.Set<java.lang.String> strSet23 = jSDocInfo10.getSuppressions();
        node1.setDirectives(strSet23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02418");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType12 = functionType11.toMaybeEnumElementType();
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
        functionType11.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType23);
        boolean boolean28 = functionType23.matchesObjectContext();
        com.google.javascript.rhino.jstype.ObjectType.Property property30 = functionType23.getOwnSlot("function ({1160807699}): {1160807699}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType31 = functionType23.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertNull(enumElementType12);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (...[?]): ?" + "'", str25, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(property30);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02419");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        boolean boolean11 = node9.isQuotedString();
        com.google.javascript.rhino.Node node12 = node9.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry4.createFunctionType(jSType5, node12);
        com.google.javascript.rhino.jstype.JSType jSType15 = jSTypeRegistry4.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        java.lang.String str28 = functionType26.toAnnotationString();
        boolean boolean29 = functionType26.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry4.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType26, "NUMBER 0.0 36");
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
        com.google.javascript.rhino.jstype.FunctionType functionType46 = functionType42.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry4.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType42);
        jSTypeRegistry4.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node55.children();
        boolean boolean57 = node55.isQuotedString();
        com.google.javascript.rhino.Node node58 = node55.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry50.createFunctionType(jSType51, node58);
        boolean boolean60 = functionType59.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType59.restrictByNotNullOrUndefined();
        boolean boolean62 = functionType59.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType67 = jSTypeRegistry4.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType59, "function ({1160807699}): {1160807699}", "hi!", (int) (short) -1, 32);
        jSTypeRegistry4.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType69 = assertionFunctionSpec1.getAssertedType(node2, jSTypeRegistry4);
        java.util.List<com.google.javascript.rhino.jstype.JSType> jSTypeList70 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node71 = jSTypeRegistry4.createParametersWithVarArgs(jSTypeList70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function (...[?]): ?" + "'", str28, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNull(jSType69);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02420");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        node5.setSourceFileForTesting("");
        node5.setLineno(7);
        boolean boolean10 = node5.isObjectLit();
        boolean boolean11 = node5.isObjectLit();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList27 = functionType25.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] { functionType25, functionType38 };
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry14.createUnionType(jSTypeArray40);
        boolean boolean42 = jSType41.isDateType();
        node5.putProp(41, (java.lang.Object) boolean42);
        boolean boolean44 = node5.isNew();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(functionTypeList27);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02421");
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
        boolean boolean48 = node47.isCase();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable49 = node47.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor50 = ancestorIterable49.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(ancestorIterable49);
        org.junit.Assert.assertNotNull(nodeItor50);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02422");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList25 = com.google.common.collect.ImmutableList.of(jSDocInfo21, jSDocInfo22, jSDocInfo23, jSDocInfo24);
        boolean boolean27 = jSDocInfo23.hasParameterType("hi!");
        boolean boolean28 = jSDocInfo23.hasReturnType();
        boolean boolean29 = jSDocInfo23.hasModifies();
        java.util.Set<java.lang.String> strSet30 = jSDocInfo23.getParameterNames();
        int int31 = strSet30.size();
        node18.setDirectives(strSet30);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = null;
        node18.setStaticSourceFile(staticSourceFile33);
        node18.setType(11);
        boolean boolean37 = node18.isLabel();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02423");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = functionType10.getConstructor();
        boolean boolean12 = functionType10.canBeCalled();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02424");
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
        boolean boolean48 = node47.isCase();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable49 = node47.getAncestors();
        boolean boolean50 = node47.isTypeOf();
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(ancestorIterable49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02425");
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
        boolean boolean16 = functionType10.matchesStringContext();
        com.google.javascript.rhino.Node node18 = functionType10.getPropertyNode("{1936444324}");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType29.isArrayType();
        boolean boolean32 = functionType29.isPropertyTypeInferred("JSDocInfo");
        boolean boolean34 = functionType29.hasOwnProperty("");
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
        boolean boolean49 = functionType29.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType45);
        boolean boolean50 = functionType29.isReturnTypeInferred();
        boolean boolean51 = functionType29.isGlobalThisType();
        boolean boolean52 = functionType29.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType10.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        java.lang.Iterable iterable54 = functionType29.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType29.getPropertyType("function ({1031820917}): {1031820917}");
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType29.collapseUnion();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(iterable54);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(jSType57);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02426");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = booleanLiteralSet13.intersection(booleanLiteralSet14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = functionType26.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = booleanLiteralSet28.union(booleanLiteralSet30);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = booleanLiteralSet13.union(booleanLiteralSet31);
        boolean boolean34 = booleanLiteralSet13.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet35 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = booleanLiteralSet13.union(booleanLiteralSet35);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = booleanLiteralSet12.intersection(booleanLiteralSet35);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet40 = booleanLiteralSet38.intersection(booleanLiteralSet39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet53 = functionType51.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet55 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = booleanLiteralSet53.union(booleanLiteralSet55);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet57 = booleanLiteralSet38.union(booleanLiteralSet56);
        boolean boolean59 = booleanLiteralSet38.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet60 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = booleanLiteralSet38.union(booleanLiteralSet60);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = booleanLiteralSet12.intersection(booleanLiteralSet38);
        boolean boolean64 = booleanLiteralSet62.contains(true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet35 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet35.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet40 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet40.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet53 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet53.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet55 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet55.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet57 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet57.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet60 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet60.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02427");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesArguments();
        sideEffectFlags0.setReturnsTainted();
        sideEffectFlags0.setMutatesArguments();
        int int4 = sideEffectFlags0.valueOf();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02428");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        boolean boolean5 = objList2.isEmpty();
        java.util.Iterator<java.lang.Object> objItor6 = objList2.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList9 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray10 = objList9.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor11 = objList9.listIterator();
        int int12 = objList9.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor14 = objList9.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(39, node19);
        boolean boolean21 = node20.isIf();
        node20.detachChildren();
        boolean boolean23 = node20.isVoid();
        boolean boolean24 = node20.isNE();
        int int25 = objList9.indexOf((java.lang.Object) node20);
        boolean boolean26 = objList9.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Object> objList27 = objList9.reverse();
        java.lang.Object[] objArray28 = objList27.toArray();
        boolean boolean29 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList27);
        boolean boolean30 = objList2.isEmpty();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(objList9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(objItor14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objList27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0, 10]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02429");
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
        com.google.common.collect.ImmutableList<java.lang.Object> objList53 = objList47.asList();
        java.lang.Object[] objArray54 = objList47.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList57 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray58 = objList57.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor59 = objList57.listIterator();
        int int60 = objList57.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor62 = objList57.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(39, node67);
        boolean boolean69 = node68.isIf();
        node68.detachChildren();
        boolean boolean71 = node68.isVoid();
        boolean boolean72 = node68.isNE();
        int int73 = objList57.indexOf((java.lang.Object) node68);
        com.google.common.collect.ImmutableList<java.lang.Object> objList74 = objList57.asList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = objList47.removeAll((java.util.Collection<java.lang.Object>) objList57);
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
        org.junit.Assert.assertNotNull(objList53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, 0]");
        org.junit.Assert.assertNotNull(objList57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(objItor62);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objList74);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02430");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2);
        com.google.javascript.rhino.jstype.JSType jSType5 = jSTypeRegistry3.getType("hi!");
        jSTypeRegistry3.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.Node node17 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry9.createFunctionType(jSType10, node17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        com.google.javascript.rhino.Node node30 = node27.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry22.createFunctionType(jSType23, node30);
        boolean boolean32 = functionType31.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList33 = functionType31.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        boolean boolean45 = functionType44.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] { functionType31, functionType44 };
        com.google.javascript.rhino.jstype.JSType jSType47 = jSTypeRegistry20.createUnionType(jSTypeArray46);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry9.createOptionalParameters(jSTypeArray46);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry3.createOptionalParameters(jSTypeArray46);
        com.google.javascript.rhino.Node node50 = jSTypeRegistry1.createParametersWithVarArgs(jSTypeArray46);
        node50.removeProp((int) 'a');
        int int53 = node50.getSourceOffset();
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(functionTypeList33);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02431");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("false");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02432");
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
        com.google.javascript.rhino.Node node80 = functionType26.getRootNode();
        com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType26.getConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = functionType26.getImplicitPrototype();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable83 = functionType26.getExtendedInterfaces();
        boolean boolean84 = functionType26.isNumber();
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair86 = functionType26.getTypesUnderInequality(jSType85);
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
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNull(functionType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertNotNull(objectTypeIterable83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02433");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean3 = typePosition2.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int5 = typePosition4.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node7 = typePosition6.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean9 = typePosition8.hasBrackets();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node14, "hi!");
        boolean boolean19 = node14.isCatch();
        java.lang.String str20 = node14.getQualifiedName();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("{1936444324}", (int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship25 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType10, node14, node24);
        typePosition8.setItem(node14);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition27 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition28 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean29 = typePosition28.hasBrackets();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = new com.google.javascript.rhino.JSTypeExpression(node34, "hi!");
        boolean boolean39 = node34.isCatch();
        java.lang.String str40 = node34.getQualifiedName();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString("{1936444324}", (int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship45 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType30, node34, node44);
        typePosition28.setItem(node34);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition47 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition47.setPositionInformation(0, 42, (int) (short) 1, (int) 'a');
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition53 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition53.setPositionInformation(0, 42, (int) (short) 1, (int) 'a');
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition59 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition59.setPositionInformation(0, 42, (int) (short) 1, (int) 'a');
        typePosition59.setPositionInformation(36, 9, 38, 50);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition70 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node71 = typePosition70.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition72 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node73 = typePosition72.getItem();
        boolean boolean74 = typePosition72.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition75 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        int int76 = typePosition75.getEndLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition77 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node78 = typePosition77.getItem();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition79 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean80 = typePosition79.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition[] typePositionArray81 = new com.google.javascript.rhino.JSDocInfo.TypePosition[] { typePosition75, typePosition77, typePosition79 };
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList82 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition2, typePosition4, typePosition6, typePosition8, typePosition27, typePosition28, typePosition47, typePosition53, typePosition59, typePosition70, typePosition72, typePositionArray81);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList83 = com.google.common.collect.ImmutableList.of(typePosition0);
        int int84 = typePosition0.getEndLine();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(typePositionArray81);
        org.junit.Assert.assertNotNull(typePositionList82);
        org.junit.Assert.assertNotNull(typePositionList83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02434");
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
        com.google.javascript.rhino.jstype.FunctionType functionType64 = functionType56.getConstructor();
        functionType56.clearCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType56.unboxesTo();
        boolean boolean67 = functionType56.isNumberValueType();
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
        org.junit.Assert.assertNull(functionType64);
        org.junit.Assert.assertNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02435");
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
        jSTypeRegistry1.identifyNonNullableName("function ({478768705}): {478768705}");
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
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        boolean boolean56 = node54.isQuotedString();
        com.google.javascript.rhino.Node node57 = node54.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry49.createFunctionType(jSType50, node57);
        boolean boolean59 = functionType58.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType58.getPropertyType("InputId: hi!");
        boolean boolean62 = functionType42.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType58);
        boolean boolean63 = functionType42.isReturnTypeInferred();
        boolean boolean64 = functionType42.isUnknownType();
        boolean boolean66 = functionType42.removeProperty("function ({1905212938}): {1905212938}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = functionType42.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry1.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType42);
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable76 = node75.children();
        boolean boolean77 = node75.isQuotedString();
        com.google.javascript.rhino.Node node78 = node75.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry70.createFunctionType(jSType71, node78);
        boolean boolean80 = functionType79.isArrayType();
        java.lang.String str81 = functionType79.toAnnotationString();
        boolean boolean82 = functionType79.isStringObjectType();
        boolean boolean83 = functionType79.isNullType();
        com.google.javascript.rhino.jstype.ObjectType objectType84 = functionType79.getParentScope();
        com.google.common.collect.ImmutableList<java.lang.String> strList85 = functionType79.getTemplateTypeNames();
        jSTypeRegistry1.setTemplateTypeNames((java.util.List<java.lang.String>) strList85);
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function ({89689103}): {89689103}" + "'", str28, "function ({89689103}): {89689103}");
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(nodeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "function (...[?]): ?" + "'", str81, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertNotNull(strList85);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02436");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException("");
        java.io.IOException iOException5 = new java.io.IOException("Not declared as a type name", (java.lang.Throwable) iOException4);
        java.io.IOException iOException8 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray9 = iOException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = iOException8.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException8);
        java.io.IOException iOException13 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = iOException13.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = iOException17.getSuppressed();
        java.lang.Throwable[] throwableArray20 = iOException17.getSuppressed();
        java.io.IOException iOException22 = new java.io.IOException("");
        java.io.IOException iOException25 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray26 = iOException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = iOException25.getSuppressed();
        java.io.IOException iOException28 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException25);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList29 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException8, (java.lang.Throwable) iOException13, (java.lang.Throwable) iOException17, (java.lang.Throwable) iOException22, (java.lang.Throwable) iOException28);
        iOException5.addSuppressed((java.lang.Throwable) iOException22);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray32 = iOException31.getSuppressed();
        java.io.IOException iOException34 = new java.io.IOException("function ({172131644}): {172131644}");
        iOException31.addSuppressed((java.lang.Throwable) iOException34);
        iOException1.addSuppressed((java.lang.Throwable) iOException31);
        java.lang.Throwable[] throwableArray37 = iOException31.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableList29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02437");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable6 = node5.children();
        boolean boolean7 = node5.isQuotedString();
        node5.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable10 = node5.getAncestors();
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = node5.hasChild(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        node16.setLength(0);
        boolean boolean21 = node16.isLabelName();
        com.google.javascript.rhino.Node node22 = node5.srcrefTree(node16);
        boolean boolean23 = node5.isDebugger();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int28 = node27.getSourceOffset();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        node27.addChildrenToBack(node32);
        node27.detachChildren();
        boolean boolean36 = node27.isOr();
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean41 = node40.hasOneChild();
        node40.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable44 = node40.getAncestors();
        int int45 = node40.getChildCount();
        node40.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node48 = node27.copyInformationFrom(node40);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int53 = node52.getSourceOffset();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        node52.addChildrenToBack(node57);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int64 = node63.getSourceOffset();
        com.google.javascript.rhino.Node node65 = node52.useSourceInfoIfMissingFrom(node63);
        boolean boolean66 = node40.isEquivalentToTyped(node63);
        boolean boolean67 = node63.isReturn();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((int) '4', node5, node63, 36, 2147483647);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(12, node70);
        boolean boolean72 = node70.hasMoreThanOneChild();
        boolean boolean73 = node70.isFromExterns();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ancestorIterable10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(ancestorIterable44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02438");
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
        jSTypeRegistry1.identifyNonNullableName("function ({478768705}): {478768705}");
        boolean boolean33 = jSTypeRegistry1.hasNamespace("function ({1704073426}): {1704073426}");
        jSTypeRegistry1.identifyNonNullableName("function ({1591600607}): {1591600607}");
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function ({1665364163}): {1665364163}" + "'", str28, "function ({1665364163}): {1665364163}");
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02439");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        boolean boolean15 = functionType10.isNativeObjectType();
        functionType10.clearCachedValues();
        boolean boolean17 = functionType10.isDateType();
        boolean boolean18 = functionType10.isNumberObjectType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02440");
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
        boolean boolean36 = jSTypeRegistry1.hasNamespace("Named type with empty name component");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        node42.addChildrenToBack(node47);
        boolean boolean50 = node47.isGetElem();
        int int51 = node47.getType();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = functionType67.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType67.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node78.children();
        boolean boolean80 = node78.isQuotedString();
        com.google.javascript.rhino.Node node81 = node78.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry73.createFunctionType(jSType74, node81);
        boolean boolean83 = functionType67.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType82);
        boolean boolean84 = functionType67.isNullable();
        int int85 = functionType67.getMaxArguments();
        boolean boolean86 = functionType67.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.JSType jSType87 = functionType67.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry1.createFromTypeNodes(node47, "function ({1040007472}): {1040007472}", (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node in type expression: NUMBER 0.0 36");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 39 + "'", int51 == 39);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(nodeIterable79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2147483647 + "'", int85 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(jSType87);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02441");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.hasDisplayName();
        boolean boolean13 = functionType10.removeProperty("InputId: hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType24.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType28 = functionType24.toMaybeFunctionType();
        boolean boolean30 = functionType28.removeProperty("hi!");
        boolean boolean32 = functionType28.isPropertyInExterns("Not declared as a type name");
        boolean boolean33 = functionType28.isInstanceType();
        boolean boolean35 = functionType28.hasProperty("");
        boolean boolean36 = functionType10.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType28);
        com.google.javascript.rhino.jstype.ObjectType.Property property38 = functionType10.getOwnSlot("function ({63005133}): {63005133}");
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType10.getReturnType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(property38);
        org.junit.Assert.assertNotNull(jSType39);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02442");
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
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.jstype.ObjectType objectType37 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType38 = jSTypeRegistry1.createObjectType(objectType37);
        boolean boolean39 = objectType38.matchesStringContext();
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
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(objectType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02443");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node13.addChildrenToBack(node18);
        node13.detachChildren();
        boolean boolean22 = node13.isOr();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean27 = node26.hasOneChild();
        node26.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node26.getAncestors();
        int int31 = node26.getChildCount();
        node26.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node34 = node13.copyInformationFrom(node26);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean39 = node38.hasOneChild();
        boolean boolean40 = node38.isOnlyModifiesThisCall();
        boolean boolean41 = node38.isLabel();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(39, node46);
        boolean boolean48 = node47.isIf();
        node47.detachChildren();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 0, node13, node38, node47);
        int int51 = node38.getSourcePosition();
        boolean boolean52 = node38.hasOneChild();
        int int53 = objList2.lastIndexOf((java.lang.Object) boolean52);
        com.google.common.collect.ImmutableList<java.lang.Object> objList54 = objList2.reverse();
        java.lang.Object[] objArray64 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList65 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList65, objArray64);
        java.lang.Object[] objArray67 = objList65.toArray();
        java.util.stream.Stream<java.lang.Object> objStream68 = objList65.parallelStream();
        int int69 = objList65.size();
        boolean boolean70 = objList65.isEmpty();
        java.lang.Object[] objArray71 = objList65.toArray();
        java.util.ListIterator<java.lang.Object> objItor73 = objList65.listIterator((int) (short) 1);
        boolean boolean74 = objList54.equals((java.lang.Object) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node81.children();
        boolean boolean83 = node81.isQuotedString();
        com.google.javascript.rhino.Node node84 = node81.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry76.createFunctionType(jSType77, node84);
        boolean boolean86 = functionType85.isArrayType();
        boolean boolean88 = functionType85.isPropertyTypeInferred("JSDocInfo");
        boolean boolean90 = functionType85.hasOwnProperty("");
        com.google.javascript.rhino.Node node91 = functionType85.getParametersNode();
        boolean boolean92 = functionType85.hasCachedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType93 = functionType85.getParentScope();
        java.lang.String str94 = functionType85.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = objList54.add((java.lang.Object) str94);
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 147456 + "'", int51 == 147456);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(objList54);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(nodeIterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(objectType93);
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02444");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = jSTypeRegistry1.getErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative9 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec10 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({1702558995}): {1702558995}", jSTypeNative9);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(100, "Not declared as a type name");
        boolean boolean15 = node14.isDebugger();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        node19.setLength(0);
        boolean boolean24 = node19.isLabelName();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean29 = node28.hasOneChild();
        node28.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable32 = node28.getAncestors();
        boolean boolean33 = node28.isNoSideEffectsCall();
        node28.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(2, node14, node19, node28, 15, 0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = assertionFunctionSpec10.getAssertedType(node38, jSTypeRegistry39);
        boolean boolean41 = node38.isLabel();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry1.createInterfaceType("function ({407806340}): {407806340}", node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(errorReporter6);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ancestorIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02445");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable56 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = functionType23.getBindReturnType(4);
        java.lang.String str59 = functionType23.toDebugHashCodeString();
        boolean boolean61 = functionType23.removeProperty("Unknown class name");
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
        org.junit.Assert.assertNotNull(objectTypeIterable56);
        org.junit.Assert.assertNotNull(functionType58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "function ({702386145}): {702386145}" + "'", str59, "function ({702386145}): {702386145}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02446");
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
        boolean boolean26 = node25.isString();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node25.getStaticSourceFile();
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getSourceName(node25);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02447");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean12 = functionType10.isPropertyTypeDeclared("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        boolean boolean26 = functionType23.isPropertyTypeInferred("JSDocInfo");
        boolean boolean28 = functionType23.hasOwnProperty("");
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
        boolean boolean43 = functionType23.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean44 = functionType23.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        boolean boolean53 = node51.isQuotedString();
        com.google.javascript.rhino.Node node54 = node51.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry46.createFunctionType(jSType47, node54);
        boolean boolean56 = functionType55.isArrayType();
        boolean boolean58 = functionType55.isPropertyTypeInferred("JSDocInfo");
        boolean boolean60 = functionType55.hasOwnProperty("");
        com.google.javascript.rhino.Node node61 = functionType55.getParametersNode();
        boolean boolean62 = functionType55.hasCachedValues();
        functionType23.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType55);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType23.getAllImplementedInterfaces();
        boolean boolean65 = functionType23.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node72.children();
        boolean boolean74 = node72.isQuotedString();
        com.google.javascript.rhino.Node node75 = node72.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry67.createFunctionType(jSType68, node75);
        boolean boolean77 = functionType76.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType76.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType76.toMaybeFunctionType();
        boolean boolean82 = functionType80.removeProperty("hi!");
        boolean boolean83 = functionType80.matchesStringContext();
        functionType23.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType80);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair85 = functionType10.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        boolean boolean86 = functionType23.isNoType();
        boolean boolean88 = functionType23.hasProperty("function ({652819703}): {652819703}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(typePair85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02448");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        boolean boolean5 = node3.isOnlyModifiesThisCall();
        boolean boolean6 = node3.isSyntheticBlock();
        boolean boolean7 = node3.isAssign();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02449");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("function ({148690972}): {148690972}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.isNoCompile();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo2.getAuthors();
        boolean boolean5 = jSDocInfo2.isInterface();
        int int6 = jSDocInfo2.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo2.hasTypedefType();
        node1.setJSDocInfo(jSDocInfo2);
        java.util.Set<java.lang.String> strSet9 = jSDocInfo2.getParameterNames();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02450");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setMutatesGlobalState();
        sideEffectFlags0.setMutatesGlobalState();
        sideEffectFlags0.setMutatesThis();
        boolean boolean6 = sideEffectFlags0.areAllFlagsSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02451");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList30 = com.google.common.collect.ImmutableList.of(jSDocInfo26, jSDocInfo27, jSDocInfo28, jSDocInfo29);
        boolean boolean32 = jSDocInfo28.hasParameterType("hi!");
        boolean boolean33 = jSDocInfo28.hasReturnType();
        boolean boolean34 = jSDocInfo28.hasModifies();
        java.util.Set<java.lang.String> strSet35 = jSDocInfo28.getParameterNames();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int40 = node39.getSourceOffset();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        node39.addChildrenToBack(node44);
        node39.detachChildren();
        node39.setLineno(16);
        boolean boolean50 = node39.isSwitch();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(39, node55);
        boolean boolean57 = node56.isIf();
        node56.detachChildren();
        boolean boolean59 = node39.hasChild(node56);
        boolean boolean60 = node39.isDebugger();
        boolean boolean61 = node39.isFalse();
        boolean boolean62 = node39.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList67 = com.google.common.collect.ImmutableList.of(jSDocInfo63, jSDocInfo64, jSDocInfo65, jSDocInfo66);
        boolean boolean69 = jSDocInfo65.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet70 = jSDocInfo65.getSuppressions();
        node39.setDirectives(strSet70);
        com.google.common.collect.ImmutableList<java.lang.Object> objList74 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream75 = objList74.parallelStream();
        boolean boolean76 = strSet70.retainAll((java.util.Collection<java.lang.Object>) objList74);
        boolean boolean77 = strSet35.containsAll((java.util.Collection<java.lang.Object>) objList74);
        int int78 = objList74.size();
        com.google.common.collect.ImmutableList<java.lang.Object> objList81 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str82 = objList81.toString();
        java.lang.Object[] objArray83 = objList81.toArray();
        java.util.Iterator<java.lang.Object> objItor84 = objList81.iterator();
        boolean boolean85 = objList74.containsAll((java.util.Collection<java.lang.Object>) objList81);
        node23.putProp(0, (java.lang.Object) objList74);
        java.lang.Object obj87 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean88 = objList74.add(obj87);
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
        org.junit.Assert.assertNotNull(jSDocInfoList30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNotNull(objList74);
        org.junit.Assert.assertNotNull(objStream75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(objList81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "[10, 0]" + "'", str82, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02452");
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
        boolean boolean83 = functionType82.isNoType();
        boolean boolean84 = functionType82.isEnumElementType();
        java.lang.String str85 = functionType82.getDisplayName();
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
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02453");
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
        com.google.javascript.rhino.jstype.FunctionType functionType47 = functionType14.toMaybeFunctionType();
        int int48 = functionType47.getMaxArguments();
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
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02454");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({1702558995}): {1702558995}", jSTypeNative1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean4 = jSDocInfo3.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo3.getEnumParameterType();
        boolean boolean6 = jSDocInfo3.isExterns();
        boolean boolean7 = jSDocInfo3.isIdGenerator();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean12 = node11.hasOneChild();
        node11.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable15 = node11.getAncestors();
        int int16 = node11.getChildCount();
        java.lang.String str17 = node11.toString();
        jSDocInfo3.setAssociatedNode(node11);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry20.getType("hi!");
        boolean boolean24 = jSTypeRegistry20.isForwardDeclaredType("JSDocInfo");
        jSTypeRegistry20.incrementGeneration();
        com.google.javascript.rhino.jstype.JSType jSType26 = assertionFunctionSpec2.getAssertedType(node11, jSTypeRegistry20);
        com.google.common.collect.ImmutableList<java.lang.Object> objList29 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream30 = objList29.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList31 = objList29.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList32 = objList29.reverse();
        java.lang.Object[] objArray33 = objList32.toArray();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        node37.addChildrenToBack(node42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int49 = node48.getSourceOffset();
        com.google.javascript.rhino.Node node50 = node37.useSourceInfoIfMissingFrom(node48);
        boolean boolean51 = objList32.contains((java.lang.Object) node50);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int57 = node56.getSourceOffset();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        node56.addChildrenToBack(node61);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int68 = node67.getSourceOffset();
        com.google.javascript.rhino.Node node69 = node56.useSourceInfoIfMissingFrom(node67);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(10, node56, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean75 = node72.isEquivalentTo(node74);
        boolean boolean76 = node72.isSwitch();
        com.google.javascript.rhino.InputId inputId78 = new com.google.javascript.rhino.InputId("hi!");
        node72.setInputId(inputId78);
        java.lang.String str80 = inputId78.toString();
        node50.setInputId(inputId78);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node83.setCharno((int) (short) 1);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable86 = node83.siblings();
        boolean boolean87 = node83.hasMoreThanOneChild();
        boolean boolean88 = node83.isDefaultCase();
        com.google.javascript.rhino.Node node89 = node50.useSourceInfoIfMissingFrom(node83);
        boolean boolean90 = node50.isGetElem();
        boolean boolean91 = node50.isTrue();
        boolean boolean92 = node11.isEquivalentToTyped(node50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ancestorIterable15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "NUMBER 0.0 36" + "'", str17, "NUMBER 0.0 36");
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(objList29);
        org.junit.Assert.assertNotNull(objStream30);
        org.junit.Assert.assertNotNull(objList31);
        org.junit.Assert.assertNotNull(objList32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, 10]");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "InputId: hi!" + "'", str80, "InputId: hi!");
        org.junit.Assert.assertNotNull(nodeIterable86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02455");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("function ({58203979}): {58203979}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02456");
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
        boolean boolean25 = node3.isFalse();
        boolean boolean26 = node3.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList31 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo30);
        boolean boolean33 = jSDocInfo29.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet34 = jSDocInfo29.getSuppressions();
        node3.setDirectives(strSet34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = strSet34.add("function ({458767227}): {458767227}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02457");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType3 = jSTypeRegistry1.getType("hi!");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node7 = jSTypeRegistry1.createParameters(jSTypeArray6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.Node node17 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry9.createFunctionType(jSType10, node17);
        boolean boolean19 = functionType18.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType22 = functionType18.toMaybeFunctionType();
        boolean boolean24 = functionType22.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType22.getExtendedInterfaces();
        boolean boolean26 = functionType22.isNumberObjectType();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType22.getPropertyType("NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot30 = functionType22.getOwnSlot("[10, 0]");
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType22, node34);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        boolean boolean50 = functionType47.isPropertyTypeInferred("JSDocInfo");
        boolean boolean51 = functionType47.isInstanceType();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = functionType47.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.FunctionType functionType53 = functionType47.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType47);
        jSTypeRegistry1.incrementGeneration();
        jSTypeRegistry1.identifyNonNullableName("function ({65329556}): {65329556}");
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSType21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNull(jSTypeStaticSlot30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNotNull(jSType54);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02458");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        boolean boolean27 = functionType25.isRegexpType();
        boolean boolean29 = functionType25.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean30 = functionType10.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType25);
        boolean boolean31 = functionType25.hasImplementedInterfaces();
        boolean boolean32 = functionType25.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType43.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType43.restrictByNotNullOrUndefined();
        boolean boolean46 = functionType25.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType43);
        boolean boolean47 = functionType43.isConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean50 = jSDocInfo49.isNoCompile();
        java.lang.String str51 = jSDocInfo49.toString();
        functionType43.setPropertyJSDocInfo("function ({2011901449}): {2011901449}", jSDocInfo49);
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType43.getPropertyType("function ({1691750865}): {1691750865}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "JSDocInfo" + "'", str51, "JSDocInfo");
        org.junit.Assert.assertNotNull(jSType54);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02459");
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
        boolean boolean14 = functionType10.hasProperty("java.io.IOException: ");
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry16.getType("hi!");
        jSTypeRegistry16.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node22 = jSTypeRegistry16.createParameters(jSTypeArray21);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node25.setCharno((int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry29.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        java.lang.String str53 = functionType51.toAnnotationString();
        boolean boolean54 = functionType51.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType56 = jSTypeRegistry29.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType51, "NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.ObjectType objectType57 = jSTypeRegistry16.createObjectType("function ({1839678788}): {1839678788}", node25, (com.google.javascript.rhino.jstype.ObjectType) functionType51);
        functionType10.matchConstraint(objectType57);
        boolean boolean59 = functionType10.isNoResolvedType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "function (...[?]): ?" + "'", str53, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(objectType57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02460");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet7 = jSDocInfo2.getSuppressions();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo2.getEnumParameterType();
        boolean boolean9 = jSDocInfo2.hasEnumParameterType();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo2.getAuthors();
        java.lang.String str11 = jSDocInfo2.getReturnDescription();
        boolean boolean12 = jSDocInfo2.isNoCompile();
        boolean boolean13 = jSDocInfo2.isImplicitCast();
        boolean boolean14 = jSDocInfo2.isNoAlias();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02461");
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
        com.google.common.collect.ImmutableList<java.lang.Object> objList38 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray39 = objList38.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor40 = objList38.listIterator();
        boolean boolean42 = objList38.contains((java.lang.Object) (short) 10);
        java.lang.Object obj43 = null;
        boolean boolean44 = objList38.equals(obj43);
        com.google.common.collect.ImmutableList<java.lang.Object> objList47 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray48 = objList47.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor49 = objList47.listIterator();
        int int50 = objList47.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor52 = objList47.listIterator((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Object> objList55 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray56 = objList55.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor57 = objList55.listIterator();
        int int58 = objList55.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor60 = objList55.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(39, node65);
        boolean boolean67 = node66.isIf();
        node66.detachChildren();
        boolean boolean69 = node66.isVoid();
        boolean boolean70 = node66.isNE();
        int int71 = objList55.indexOf((java.lang.Object) node66);
        boolean boolean72 = objList55.isEmpty();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Object>> objListList73 = com.google.common.collect.ImmutableList.of(objList16, objList38, objList47, objList55);
        java.util.stream.Stream<java.lang.Object> objStream74 = objList47.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Object> objList77 = objList47.subList(15, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (15) must not be greater than size (2)");
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
        org.junit.Assert.assertNotNull(objList38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objList47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(objItor52);
        org.junit.Assert.assertNotNull(objList55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(objItor60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objListList73);
        org.junit.Assert.assertNotNull(objStream74);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02462");
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
        java.lang.String str36 = functionType14.getDisplayName();
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
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02463");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = jSDocInfo2.getTypeNodes();
        boolean boolean10 = jSDocInfo2.hasReturnType();
        jSDocInfo2.setLicense("function ({1691750865}): {1691750865}");
        boolean boolean13 = jSDocInfo2.isConstant();
        boolean boolean14 = jSDocInfo2.containsDeclaration();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02464");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean3 = node2.isSwitch();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node2);
        com.google.javascript.rhino.Node node5 = node2.getNext();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        node9.detachChildren();
        node9.setLineno(16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(39, node24);
        boolean boolean26 = node25.isIf();
        node25.detachChildren();
        boolean boolean28 = node25.isVoid();
        com.google.javascript.rhino.Node node29 = node9.useSourceInfoIfMissingFrom(node25);
        boolean boolean30 = node9.isInstanceOf();
        node9.removeProp(32);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = node9.getStaticSourceFile();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int40 = node39.getSourceOffset();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        node39.addChildrenToBack(node44);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int51 = node50.getSourceOffset();
        com.google.javascript.rhino.Node node52 = node39.useSourceInfoIfMissingFrom(node50);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(10, node39, 49, (int) (short) 100);
        boolean boolean56 = node39.isComma();
        boolean boolean57 = node39.isScript();
        com.google.javascript.rhino.Node node58 = node39.getParent();
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int64 = node63.getSourceOffset();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable69 = node68.children();
        node63.addChildrenToBack(node68);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int75 = node74.getSourceOffset();
        com.google.javascript.rhino.Node node76 = node63.useSourceInfoIfMissingFrom(node74);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(10, node63, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean82 = node79.isEquivalentTo(node81);
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 36", 54, 49);
        com.google.javascript.rhino.Node node87 = node79.useSourceInfoIfMissingFromForTree(node86);
        node86.putBooleanProp((int) (byte) 100, false);
        node86.setLength(48);
        boolean boolean93 = node86.isOr();
        node86.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node96 = new com.google.javascript.rhino.Node(10, node58, node86);
        boolean boolean97 = node86.isCase();
        com.google.javascript.jscomp.CodingConvention.Bind bind98 = new com.google.javascript.jscomp.CodingConvention.Bind(node5, node9, node86);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(staticSourceFile33);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeIterable69);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02465");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node18 = node5.useSourceInfoIfMissingFrom(node16);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(10, node5, 49, (int) (short) 100);
        boolean boolean22 = node5.isComma();
        boolean boolean23 = node5.isScript();
        com.google.javascript.rhino.Node node24 = node5.getParent();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(10, node29, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean48 = node45.isEquivalentTo(node47);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("NUMBER 0.0 36", 54, 49);
        com.google.javascript.rhino.Node node53 = node45.useSourceInfoIfMissingFromForTree(node52);
        node52.putBooleanProp((int) (byte) 100, false);
        node52.setLength(48);
        boolean boolean59 = node52.isOr();
        node52.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(10, node24, node52);
        boolean boolean63 = node52.isSwitch();
        boolean boolean64 = node52.hasOneChild();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02466");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.children();
        boolean boolean6 = node4.isQuotedString();
        node4.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable9 = node4.getAncestors();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = node4.hasChild(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        node16.addChildrenToBack(node21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int28 = node27.getSourceOffset();
        com.google.javascript.rhino.Node node29 = node16.useSourceInfoIfMissingFrom(node27);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(10, node16, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean35 = node32.isEquivalentTo(node34);
        boolean boolean36 = node32.isSwitch();
        com.google.javascript.rhino.InputId inputId38 = new com.google.javascript.rhino.InputId("hi!");
        node32.setInputId(inputId38);
        java.lang.String str40 = inputId38.toString();
        node4.setInputId(inputId38);
        boolean boolean42 = node4.isIn();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node4);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int48 = node47.getSourceOffset();
        boolean boolean49 = node47.isDo();
        int int50 = node47.getChildCount();
        boolean boolean51 = node47.isTrue();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int57 = node56.getSourceOffset();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        node56.addChildrenToBack(node61);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int68 = node67.getSourceOffset();
        com.google.javascript.rhino.Node node69 = node56.useSourceInfoIfMissingFrom(node67);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(10, node56, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean75 = node72.isEquivalentTo(node74);
        boolean boolean76 = node72.isSwitch();
        com.google.javascript.rhino.InputId inputId78 = new com.google.javascript.rhino.InputId("hi!");
        node72.setInputId(inputId78);
        java.lang.String str80 = inputId78.toString();
        java.lang.String str81 = inputId78.getIdName();
        java.lang.String str82 = inputId78.toString();
        node47.setInputId(inputId78);
        node43.setInputId(inputId78);
        // The following exception was thrown during execution in test generation
        try {
            node43.setString("function ({916744697}): {916744697}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ancestorIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "InputId: hi!" + "'", str40, "InputId: hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "InputId: hi!" + "'", str80, "InputId: hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "InputId: hi!" + "'", str82, "InputId: hi!");
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02467");
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
        jSTypeRegistry1.unregisterPropertyOnType("JSDocInfo", jSType40);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative45 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec46 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({1702558995}): {1702558995}", jSTypeNative45);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(100, "Not declared as a type name");
        boolean boolean51 = node50.isDebugger();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node55.children();
        boolean boolean57 = node55.isQuotedString();
        node55.setLength(0);
        boolean boolean60 = node55.isLabelName();
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean65 = node64.hasOneChild();
        node64.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable68 = node64.getAncestors();
        boolean boolean69 = node64.isNoSideEffectsCall();
        node64.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(2, node50, node55, node64, 15, 0);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = null;
        com.google.javascript.rhino.jstype.JSType jSType76 = assertionFunctionSpec46.getAssertedType(node74, jSTypeRegistry75);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry1.createInterfaceType("function ({1321496826}): {1321496826}", node74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
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
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(ancestorIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(jSType76);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02468");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue0.xor(ternaryValue1);
        java.lang.String str3 = ternaryValue2.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue4.xor(ternaryValue5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue2.xor(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue8.xor(ternaryValue9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue6.or(ternaryValue10);
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
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType22.getPropertyType("Unknown class name");
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
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = functionType22.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType37);
        java.lang.String str44 = ternaryValue43.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue11.or(ternaryValue43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue11.not();
        boolean boolean48 = ternaryValue46.toBoolean(false);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "false" + "'", str3, "false");
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType26);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "unknown" + "'", str44, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02469");
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
        boolean boolean18 = functionType14.hasOwnProperty("false");
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList19 = functionType14.getSubTypes();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = functionType14.setValidator(jSTypePredicate20);
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
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(functionTypeList19);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02470");
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
        boolean boolean26 = node25.isNull();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int32 = node31.getSourceOffset();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        node31.addChildrenToBack(node36);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node44 = node31.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node31, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet48 = node47.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable49 = node47.getAncestors();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean54 = node53.hasOneChild();
        node53.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable57 = node53.getAncestors();
        int int58 = node53.getChildCount();
        node47.addChildrenToFront(node53);
        boolean boolean60 = node25.isEquivalentToTyped(node53);
        int int61 = node25.getLength();
        com.google.javascript.rhino.Node node62 = node25.getFirstChild();
        com.google.javascript.rhino.InputId inputId63 = node62.getInputId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass64 = inputId63.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(strSet48);
        org.junit.Assert.assertNotNull(ancestorIterable49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(ancestorIterable57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(inputId63);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02471");
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
        boolean boolean32 = functionType26.hasDisplayName();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList33 = functionType26.getSubTypes();
        java.lang.String str34 = functionType26.getDisplayName();
        boolean boolean36 = functionType26.isPropertyInExterns("function ({1364769836}): {1364769836}");
        boolean boolean37 = functionType26.isString();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(functionTypeList33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02472");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        node15.detachChildren();
        node15.setLineno(16);
        node8.addChildrenToFront(node15);
        boolean boolean27 = node15.isNoSideEffectsCall();
        boolean boolean28 = node15.isWhile();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02473");
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
        com.google.javascript.rhino.Node node34 = functionType10.getPropertyNode("InputId: hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType35 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType10);
        boolean boolean36 = functionType10.isBooleanValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.children();
        boolean boolean47 = node45.isQuotedString();
        com.google.javascript.rhino.Node node48 = node45.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry40.createFunctionType(jSType41, node48);
        boolean boolean50 = functionType49.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList51 = functionType49.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        boolean boolean60 = node58.isQuotedString();
        com.google.javascript.rhino.Node node61 = node58.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry53.createFunctionType(jSType54, node61);
        boolean boolean63 = functionType62.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] { functionType49, functionType62 };
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry38.createUnionType(jSTypeArray64);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope66 = null;
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry38.getType(jSTypeStaticScope66, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable79 = node78.children();
        boolean boolean80 = node78.isQuotedString();
        com.google.javascript.rhino.Node node81 = node78.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry73.createFunctionType(jSType74, node81);
        boolean boolean83 = functionType82.isArrayType();
        boolean boolean84 = jSType71.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType82);
        java.lang.Iterable iterable85 = functionType82.getCtorImplementedInterfaces();
        boolean boolean86 = functionType82.isNativeObjectType();
        boolean boolean87 = functionType82.isOrdinaryFunction();
        functionType10.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType82);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot90 = functionType82.getOwnSlot("function ({513084192}): {513084192}");
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
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(functionTypeList51);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(nodeIterable79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(iterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot90);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02474");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        java.lang.String str15 = functionType10.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        boolean boolean28 = functionType26.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType26.findPropertyType("");
        functionType26.clearCachedValues();
        functionType10.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType26);
        boolean boolean33 = functionType10.isNativeObjectType();
        boolean boolean34 = functionType10.matchesNumberContext();
        boolean boolean35 = functionType10.isEnumElementType();
        boolean boolean36 = functionType10.isTemplateType();
        boolean boolean38 = functionType10.isPropertyTypeInferred("function ({1610321739}): {1610321739}");
        com.google.javascript.rhino.jstype.StaticSlot staticSlot40 = functionType10.getSlot("(function ({95400268}): {95400268})");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jSType30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(staticSlot40);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02475");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        jSTypeRegistry1.identifyNonNullableName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType14 = jSTypeRegistry1.getType("function ({10866166}): {10866166}");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        java.lang.String str21 = node19.getQualifiedName();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        node25.addChildrenToBack(node30);
        node25.detachChildren();
        node25.setLineno(16);
        boolean boolean36 = node25.isSwitch();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(39, node41);
        boolean boolean43 = node42.isIf();
        node42.detachChildren();
        boolean boolean45 = node25.hasChild(node42);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = null;
        node25.setStaticSourceFile(staticSourceFile46);
        int int48 = node19.getIndexOfChild(node25);
        java.lang.String str52 = node25.toString(true, true, true);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        boolean boolean64 = functionType63.isArrayType();
        boolean boolean66 = functionType63.isPropertyTypeInferred("JSDocInfo");
        boolean boolean68 = functionType63.hasOwnProperty("");
        com.google.javascript.rhino.Node node69 = functionType63.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable77 = node76.children();
        boolean boolean78 = node76.isQuotedString();
        com.google.javascript.rhino.Node node79 = node76.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry71.createFunctionType(jSType72, node79);
        boolean boolean81 = functionType80.isArrayType();
        boolean boolean82 = functionType80.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = functionType80.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable84 = functionType80.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType63.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.EnumType enumType86 = jSTypeRegistry1.createEnumType("function ({1404115361}): {1404115361}", node25, (com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = enumType86.getOwnPropertyJSDocInfo("function ({204880278}): {204880278}");
        boolean boolean89 = enumType86.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType90 = enumType86.toMaybeEnumType();
        boolean boolean91 = enumType90.hasDisplayName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NUMBER 0.0 16" + "'", str52, "NUMBER 0.0 16");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(nodeIterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertNotNull(objectTypeIterable84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertNotNull(enumType86);
        org.junit.Assert.assertNull(jSDocInfo88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(enumType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02476");
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
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = objectType13.setValidator(jSTypePredicate23);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02477");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo3.isDeprecated();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean10 = node9.hasOneChild();
        node9.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable13 = node9.getAncestors();
        int int14 = node9.getChildCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList19 = com.google.common.collect.ImmutableList.of(jSDocInfo15, jSDocInfo16, jSDocInfo17, jSDocInfo18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo18.getReturnType();
        boolean boolean21 = jSDocInfo18.hasEnumParameterType();
        node9.setJSDocInfo(jSDocInfo18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean24 = jSDocInfo23.hasFileOverview();
        boolean boolean25 = jSDocInfo23.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList30 = com.google.common.collect.ImmutableList.of(jSDocInfo26, jSDocInfo27, jSDocInfo28, jSDocInfo29);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = jSDocInfo27.getTypedefType();
        boolean boolean32 = jSDocInfo27.hasType();
        boolean boolean33 = jSDocInfo27.hasThisType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList34 = com.google.common.collect.ImmutableList.of(jSDocInfo3, jSDocInfo18, jSDocInfo23, jSDocInfo27);
        boolean boolean35 = jSDocInfo27.hasEnumParameterType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ancestorIterable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList30);
        org.junit.Assert.assertNull(jSTypeExpression31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02478");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType43.getExtendedInterfaces();
        boolean boolean47 = functionType43.isNumberObjectType();
        node3.setJSType((com.google.javascript.rhino.jstype.JSType) functionType43);
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType43.getPropertyType("function ({1179551152}): {1179551152}");
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
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType50);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02479");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        java.lang.String str5 = node3.getQualifiedName();
        boolean boolean6 = node3.isHook();
        java.lang.String str7 = node3.getQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02480");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int8 = node7.getSourceOffset();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        node7.addChildrenToBack(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int19 = node18.getSourceOffset();
        com.google.javascript.rhino.Node node20 = node7.useSourceInfoIfMissingFrom(node18);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10, node7, 49, (int) (short) 100);
        boolean boolean24 = node7.isComma();
        boolean boolean25 = node7.isAssignAdd();
        boolean boolean26 = node7.isQualifiedName();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean31 = node30.hasOneChild();
        node30.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable34 = node30.getAncestors();
        int int35 = node30.getChildCount();
        java.lang.String str36 = node30.toString();
        com.google.javascript.rhino.Node node37 = node7.useSourceInfoIfMissingFromForTree(node30);
        com.google.javascript.rhino.Node node38 = node7.cloneTree();
        java.lang.String str39 = node7.getSourceFileName();
        com.google.javascript.rhino.Node node40 = node2.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int46 = node45.getSourceOffset();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        node45.addChildrenToBack(node50);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int57 = node56.getSourceOffset();
        com.google.javascript.rhino.Node node58 = node45.useSourceInfoIfMissingFrom(node56);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(10, node45, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet62 = node61.getDirectives();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int67 = node66.getSourceOffset();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node71.children();
        node66.addChildrenToBack(node71);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int78 = node77.getSourceOffset();
        com.google.javascript.rhino.Node node79 = node66.useSourceInfoIfMissingFrom(node77);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int82 = node66.getIndexOfChild(node81);
        com.google.javascript.rhino.Node node83 = node61.srcref(node66);
        boolean boolean84 = node61.isDelProp();
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node(0, node2, node61, 43, 40);
        node61.putBooleanProp((int) (short) 1, false);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(ancestorIterable34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "NUMBER 0.0 36" + "'", str36, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(strSet62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02481");
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
        node27.setLength(48);
        com.google.javascript.rhino.Node node34 = node27.removeFirstChild();
        java.lang.String str38 = node27.toString(false, false, false);
        node27.putBooleanProp(1, true);
        java.lang.Appendable appendable42 = null;
        // The following exception was thrown during execution in test generation
        try {
            node27.appendStringTree(appendable42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpect prop id 1");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "STRING NUMBER 0.0 36" + "'", str38, "STRING NUMBER 0.0 36");
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02482");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        jSTypeRegistry1.identifyNonNullableName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType14 = jSTypeRegistry1.getType("function ({10866166}): {10866166}");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        java.lang.String str21 = node19.getQualifiedName();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        node25.addChildrenToBack(node30);
        node25.detachChildren();
        node25.setLineno(16);
        boolean boolean36 = node25.isSwitch();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(39, node41);
        boolean boolean43 = node42.isIf();
        node42.detachChildren();
        boolean boolean45 = node25.hasChild(node42);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = null;
        node25.setStaticSourceFile(staticSourceFile46);
        int int48 = node19.getIndexOfChild(node25);
        java.lang.String str52 = node25.toString(true, true, true);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        boolean boolean64 = functionType63.isArrayType();
        boolean boolean66 = functionType63.isPropertyTypeInferred("JSDocInfo");
        boolean boolean68 = functionType63.hasOwnProperty("");
        com.google.javascript.rhino.Node node69 = functionType63.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable77 = node76.children();
        boolean boolean78 = node76.isQuotedString();
        com.google.javascript.rhino.Node node79 = node76.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry71.createFunctionType(jSType72, node79);
        boolean boolean81 = functionType80.isArrayType();
        boolean boolean82 = functionType80.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = functionType80.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable84 = functionType80.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType63.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.EnumType enumType86 = jSTypeRegistry1.createEnumType("function ({1404115361}): {1404115361}", node25, (com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.JSDocInfo jSDocInfo88 = enumType86.getOwnPropertyJSDocInfo("function ({204880278}): {204880278}");
        boolean boolean89 = enumType86.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType90 = enumType86.toMaybeEnumType();
        com.google.javascript.rhino.jstype.JSType jSType91 = enumType90.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType92 = enumType90.unboxesTo();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NUMBER 0.0 16" + "'", str52, "NUMBER 0.0 16");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(nodeIterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertNotNull(objectTypeIterable84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertNotNull(enumType86);
        org.junit.Assert.assertNull(jSDocInfo88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(enumType90);
        org.junit.Assert.assertNull(jSType91);
        org.junit.Assert.assertNull(jSType92);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02483");
        java.io.IOException iOException1 = new java.io.IOException("function ({2135610525}): {2135610525}");
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02484");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(10);
        sideEffectFlags1.clearAllFlags();
        int int3 = sideEffectFlags1.valueOf();
        boolean boolean4 = sideEffectFlags1.areAllFlagsSet();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02485");
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
        boolean boolean90 = functionType83.isResolved();
        boolean boolean91 = functionType83.isDateType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet92 = functionType83.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.Node node93 = functionType83.getRootNode();
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
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet92 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet92.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(node93);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02486");
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
        jSTypeRegistry1.unregisterPropertyOnType("JSDocInfo", jSType40);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry43.getType("hi!");
        jSTypeRegistry43.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        boolean boolean56 = node54.isQuotedString();
        com.google.javascript.rhino.Node node57 = node54.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry49.createFunctionType(jSType50, node57);
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList73 = functionType71.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node80.children();
        boolean boolean82 = node80.isQuotedString();
        com.google.javascript.rhino.Node node83 = node80.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry75.createFunctionType(jSType76, node83);
        boolean boolean85 = functionType84.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] { functionType71, functionType84 };
        com.google.javascript.rhino.jstype.JSType jSType87 = jSTypeRegistry60.createUnionType(jSTypeArray86);
        com.google.javascript.rhino.Node node88 = jSTypeRegistry49.createOptionalParameters(jSTypeArray86);
        com.google.javascript.rhino.Node node89 = jSTypeRegistry43.createOptionalParameters(jSTypeArray86);
        com.google.javascript.rhino.Node node90 = jSTypeRegistry1.createParametersWithVarArgs(jSTypeArray86);
        jSTypeRegistry1.setLastGeneration(true);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
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
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(functionTypeList73);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(nodeIterable81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jSTypeArray86);
        org.junit.Assert.assertNotNull(jSType87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02487");
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
        java.lang.Object[] objArray20 = objList2.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList21 = objList2.reverse();
        com.google.common.collect.ImmutableList<java.lang.Object> objList22 = objList21.asList();
        java.util.Spliterator<java.lang.Object> objSpliterator23 = objList21.spliterator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList28 = com.google.common.collect.ImmutableList.of(jSDocInfo24, jSDocInfo25, jSDocInfo26, jSDocInfo27);
        boolean boolean30 = jSDocInfo26.hasParameterType("hi!");
        boolean boolean31 = jSDocInfo26.hasReturnType();
        boolean boolean32 = jSDocInfo26.hasModifies();
        java.util.Set<java.lang.String> strSet33 = jSDocInfo26.getParameterNames();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        node37.addChildrenToBack(node42);
        node37.detachChildren();
        node37.setLineno(16);
        boolean boolean48 = node37.isSwitch();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(39, node53);
        boolean boolean55 = node54.isIf();
        node54.detachChildren();
        boolean boolean57 = node37.hasChild(node54);
        boolean boolean58 = node37.isDebugger();
        boolean boolean59 = node37.isFalse();
        boolean boolean60 = node37.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList65 = com.google.common.collect.ImmutableList.of(jSDocInfo61, jSDocInfo62, jSDocInfo63, jSDocInfo64);
        boolean boolean67 = jSDocInfo63.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet68 = jSDocInfo63.getSuppressions();
        node37.setDirectives(strSet68);
        com.google.common.collect.ImmutableList<java.lang.Object> objList72 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream73 = objList72.parallelStream();
        boolean boolean74 = strSet68.retainAll((java.util.Collection<java.lang.Object>) objList72);
        boolean boolean75 = strSet33.containsAll((java.util.Collection<java.lang.Object>) objList72);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = objList21.retainAll((java.util.Collection<java.lang.Object>) objList72);
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
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, 0]");
        org.junit.Assert.assertNotNull(objList21);
        org.junit.Assert.assertNotNull(objList22);
        org.junit.Assert.assertNotNull(objSpliterator23);
        org.junit.Assert.assertNotNull(jSDocInfoList28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(objList72);
        org.junit.Assert.assertNotNull(objStream73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02488");
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
        boolean boolean15 = functionType10.isRecordType();
        boolean boolean16 = functionType10.isNumberValueType();
        boolean boolean17 = functionType10.isFunctionPrototypeType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02489");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        java.lang.String str15 = functionType10.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = functionType10.getPossibleToBooleanOutcomes();
        boolean boolean17 = functionType10.canBeCalled();
        boolean boolean18 = functionType10.hasReferenceName();
        boolean boolean19 = functionType10.isStringValueType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02490");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.isNoCompile();
        java.lang.String str16 = jSDocInfo14.toString();
        boolean boolean17 = jSDocInfo14.isExpose();
        int int18 = jSDocInfo14.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection19 = jSDocInfo14.getTypeNodes();
        boolean boolean20 = objList10.contains((java.lang.Object) jSDocInfo14);
        boolean boolean21 = jSDocInfo14.hasType();
        java.util.Collection<java.lang.String> strCollection22 = jSDocInfo14.getReferences();
        java.lang.String str23 = jSDocInfo14.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JSDocInfo" + "'", str16, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strCollection22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "JSDocInfo" + "'", str23, "JSDocInfo");
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02491");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        int int3 = namePosition0.getPositionOnEndLine();
        int int4 = namePosition0.getPositionOnEndLine();
        namePosition0.setPositionInformation(45, 1, 51, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02492");
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
        boolean boolean30 = functionType23.isPropertyInExterns("JSDocInfo");
        com.google.javascript.rhino.Node node31 = functionType23.getParametersNode();
        boolean boolean32 = node31.isRegExp();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int37 = node36.getSourceOffset();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        node36.addChildrenToBack(node41);
        node36.detachChildren();
        node36.setLineno(16);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(39, node51);
        boolean boolean53 = node52.isIf();
        node52.detachChildren();
        boolean boolean55 = node52.isVoid();
        com.google.javascript.rhino.Node node56 = node36.useSourceInfoIfMissingFrom(node52);
        node56.putIntProp((int) (byte) 100, (int) (short) 1);
        com.google.javascript.rhino.Node node60 = node31.useSourceInfoFromForTree(node56);
        boolean boolean61 = node60.isIn();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02493");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo0.hasDescriptionForParameter("");
        boolean boolean7 = jSDocInfo0.isConstructor();
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        boolean boolean9 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str10 = jSDocInfo0.getBlockDescription();
        jSDocInfo0.setLicense("{671747480}");
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02494");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo3.getReturnType();
        java.lang.String str7 = jSDocInfo3.getDescriptionForParameter("InputId: hi!");
        boolean boolean8 = jSDocInfo3.isDeprecated();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int13 = node12.getSourceOffset();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        node12.addChildrenToBack(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node25 = node12.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int28 = node12.getIndexOfChild(node27);
        jSDocInfo3.setAssociatedNode(node27);
        boolean boolean30 = jSDocInfo3.isJavaDispatch();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02495");
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
        com.google.javascript.rhino.jstype.ObjectType objectType33 = functionType10.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType10.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType35 = jSType34.toObjectType();
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
        org.junit.Assert.assertNotNull(objectType33);
        org.junit.Assert.assertNull(jSType34);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02496");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "InputId: hi!", "", "hi!", "[10, 0]" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        int int8 = strSet6.size();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        boolean boolean14 = node12.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = new com.google.javascript.rhino.JSTypeExpression(node12, "hi!");
        boolean boolean17 = node12.isCatch();
        java.lang.String str18 = node12.getQualifiedName();
        boolean boolean19 = node12.isBreak();
        boolean boolean20 = strSet6.contains((java.lang.Object) node12);
        com.google.common.collect.ImmutableList<java.lang.Object> objList23 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream24 = objList23.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = objList23.asList();
        boolean boolean26 = objList23.isEmpty();
        java.util.Iterator<java.lang.Object> objItor27 = objList23.iterator();
        boolean boolean28 = strSet6.removeAll((java.util.Collection<java.lang.Object>) objList23);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int33 = node32.getSourceOffset();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        node32.addChildrenToBack(node37);
        node32.detachChildren();
        boolean boolean41 = node32.isOr();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean46 = node45.hasOneChild();
        node45.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable49 = node45.getAncestors();
        int int50 = node45.getChildCount();
        node45.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node53 = node32.copyInformationFrom(node45);
        boolean boolean54 = node45.isGetProp();
        boolean boolean55 = node45.hasMoreThanOneChild();
        boolean boolean56 = strSet6.equals((java.lang.Object) node45);
        com.google.common.collect.ImmutableList<java.util.AbstractSet<java.lang.String>> strSetList57 = com.google.common.collect.ImmutableList.of((java.util.AbstractSet<java.lang.String>) strSet6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objList23);
        org.junit.Assert.assertNotNull(objStream24);
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(ancestorIterable49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strSetList57);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02497");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo2.isExport();
        int int6 = jSDocInfo2.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo2.isNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo2.getBaseType();
        boolean boolean9 = jSDocInfo2.hasModifies();
        boolean boolean11 = jSDocInfo2.hasParameter("function ({362706984}): {362706984}");
        java.lang.String str12 = jSDocInfo2.getDeprecationReason();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02498");
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
        boolean boolean26 = node25.isNull();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int32 = node31.getSourceOffset();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        node31.addChildrenToBack(node36);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int43 = node42.getSourceOffset();
        com.google.javascript.rhino.Node node44 = node31.useSourceInfoIfMissingFrom(node42);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(10, node31, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet48 = node47.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable49 = node47.getAncestors();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean54 = node53.hasOneChild();
        node53.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable57 = node53.getAncestors();
        int int58 = node53.getChildCount();
        node47.addChildrenToFront(node53);
        boolean boolean60 = node25.isEquivalentToTyped(node53);
        int int61 = node25.getLength();
        boolean boolean62 = node25.isRegExp();
        int int63 = node25.getLength();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(strSet48);
        org.junit.Assert.assertNotNull(ancestorIterable49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(ancestorIterable57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02499");
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
        node41.addSuppression("java.io.IOException: ");
        boolean boolean44 = node41.isVarArgs();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newExpr(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02500");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        jSTypeRegistry1.identifyNonNullableName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType14 = jSTypeRegistry1.getType("function ({10866166}): {10866166}");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        java.lang.String str21 = node19.getQualifiedName();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int26 = node25.getSourceOffset();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        node25.addChildrenToBack(node30);
        node25.detachChildren();
        node25.setLineno(16);
        boolean boolean36 = node25.isSwitch();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(39, node41);
        boolean boolean43 = node42.isIf();
        node42.detachChildren();
        boolean boolean45 = node25.hasChild(node42);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = null;
        node25.setStaticSourceFile(staticSourceFile46);
        int int48 = node19.getIndexOfChild(node25);
        java.lang.String str52 = node25.toString(true, true, true);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        boolean boolean64 = functionType63.isArrayType();
        boolean boolean66 = functionType63.isPropertyTypeInferred("JSDocInfo");
        boolean boolean68 = functionType63.hasOwnProperty("");
        com.google.javascript.rhino.Node node69 = functionType63.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable77 = node76.children();
        boolean boolean78 = node76.isQuotedString();
        com.google.javascript.rhino.Node node79 = node76.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry71.createFunctionType(jSType72, node79);
        boolean boolean81 = functionType80.isArrayType();
        boolean boolean82 = functionType80.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = functionType80.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable84 = functionType80.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType63.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.EnumType enumType86 = jSTypeRegistry1.createEnumType("function ({1404115361}): {1404115361}", node25, (com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.FunctionType functionType87 = enumType86.getConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType88 = enumType86.getImplicitPrototype();
        boolean boolean89 = enumType86.matchesNumberContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType90 = enumType86.getElementsType();
        com.google.javascript.rhino.jstype.JSType jSType91 = enumElementType90.getPrimitiveType();
        boolean boolean93 = enumElementType90.isPropertyTypeInferred("NUMBER 0.0 36 [input_id: InputId: hi!]");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.EnumElementType> enumElementTypeList94 = com.google.common.collect.ImmutableList.of(enumElementType90);
        boolean boolean96 = enumElementType90.hasProperty("function ({1802776371}): {1802776371}");
        com.google.javascript.rhino.jstype.ObjectType objectType97 = enumElementType90.getImplicitPrototype();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean98 = objectType97.isFunctionPrototypeType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NUMBER 0.0 16" + "'", str52, "NUMBER 0.0 16");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(nodeIterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectType83);
        org.junit.Assert.assertNotNull(objectTypeIterable84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertNotNull(enumType86);
        org.junit.Assert.assertNull(functionType87);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(enumElementType90);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(enumElementTypeList94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(objectType97);
    }

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02501");
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
        boolean boolean16 = functionType10.isOrdinaryFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType10.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02502");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node16, "hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(jSTypeExpression19);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02503");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = node1.getJSDocInfo();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node6 = node4.getAncestor(47);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        node4.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node12 = node1.useSourceInfoFrom(node10);
        node12.setWasEmptyNode(false);
        boolean boolean15 = node12.isScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = node12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSDocInfo2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02504");
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
        com.google.javascript.rhino.Node node23 = node3.getNext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = node23.isQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02505");
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
        boolean boolean16 = functionType10.isInstanceType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType10.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType10.getParameterType();
        java.util.Set<java.lang.String> strSet19 = functionType10.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType10.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = jSType20.getDisplayName();
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(jSType20);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02506");
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
        boolean boolean96 = node73.isNull();
        java.lang.Object obj98 = node73.getProp(10);
        boolean boolean99 = node73.isInc();
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
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02507");
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
        int int15 = functionType10.getPropertiesCount();
        boolean boolean16 = functionType10.isReturnTypeInferred();
        boolean boolean18 = functionType10.hasOwnProperty("function ({1475224443}): {1475224443}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02508");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode29 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry1.setResolveMode(resolveMode29);
        com.google.javascript.rhino.jstype.JSType jSType35 = jSTypeRegistry1.createNamedType("function (function (...[?]): ?, ...[function (...[?]): ?]): function (...[?]): ?", "Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n", 41, 53);
        com.google.javascript.rhino.jstype.JSType jSType36 = jSType35.unboxesTo();
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
        org.junit.Assert.assertTrue("'" + resolveMode29 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode29.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(jSType35);
        org.junit.Assert.assertNull(jSType36);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02509");
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
        boolean boolean16 = functionType10.matchesStringContext();
        com.google.javascript.rhino.Node node18 = functionType10.getPropertyNode("{1936444324}");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType29.isArrayType();
        boolean boolean32 = functionType29.isPropertyTypeInferred("JSDocInfo");
        boolean boolean34 = functionType29.hasOwnProperty("");
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
        boolean boolean49 = functionType29.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType45);
        boolean boolean50 = functionType29.isReturnTypeInferred();
        boolean boolean51 = functionType29.isGlobalThisType();
        boolean boolean52 = functionType29.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType10.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType10, "function ({1839678788}): {1839678788}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNull(objectType55);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02510");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.isConstant();
        boolean boolean9 = jSDocInfo2.hasParameter("[10, 0]");
        java.lang.String str10 = jSDocInfo2.getBlockDescription();
        int int11 = jSDocInfo2.getImplementedInterfaceCount();
        boolean boolean12 = jSDocInfo2.hasFileOverview();
        boolean boolean13 = jSDocInfo2.isConstant();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02511");
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
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList49 = functionType47.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = functionType47.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType51 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType47);
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType47.getImplicitPrototype();
        int int53 = functionType47.getMaxArguments();
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
        org.junit.Assert.assertNull(functionTypeList49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02512");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo3.getReturnType();
        boolean boolean6 = jSDocInfo3.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo3.getEnumParameterType();
        boolean boolean8 = jSDocInfo3.hasType();
        java.lang.String str9 = jSDocInfo3.getReturnDescription();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo3.getAuthors();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strCollection10);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02513");
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
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable22 = node20.getAncestors();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean27 = node26.hasOneChild();
        node26.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node26.getAncestors();
        int int31 = node26.getChildCount();
        node20.addChildrenToFront(node26);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node36.children();
        boolean boolean38 = node36.isQuotedString();
        node36.setLength(0);
        boolean boolean41 = node36.isVar();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean46 = node45.hasOneChild();
        node36.addChildToBack(node45);
        node45.detachChildren();
        boolean boolean49 = node26.isEquivalentTo(node45);
        node45.setLineno((int) '4');
        boolean boolean52 = node45.isNot();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02514");
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
            java.util.List<java.lang.Object> objList39 = objList16.subList(49, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (49) must not be greater than size (2)");
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
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02515");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.removeProp(36);
        boolean boolean9 = node3.isInc();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        boolean boolean14 = node13.isTypeOf();
        node3.addChildrenToFront(node13);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node13);
        boolean boolean17 = staticSourceFile16.isExtern();
        int int19 = staticSourceFile16.getLineOfOffset(42);
        java.lang.String str20 = staticSourceFile16.getName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(staticSourceFile16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[10, 0]" + "'", str20, "[10, 0]");
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02516");
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
        java.lang.Appendable appendable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            node27.appendStringTree(appendable29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02517");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet13 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = booleanLiteralSet13.intersection(booleanLiteralSet14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet28 = functionType26.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet30 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet31 = booleanLiteralSet28.union(booleanLiteralSet30);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = booleanLiteralSet13.union(booleanLiteralSet31);
        boolean boolean34 = booleanLiteralSet13.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet35 = com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = booleanLiteralSet13.union(booleanLiteralSet35);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet37 = booleanLiteralSet12.intersection(booleanLiteralSet35);
        boolean boolean39 = booleanLiteralSet12.contains(false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet13 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet13.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet28 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet28.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet30 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet30.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet31 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet31.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet35 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet35.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet37 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet37.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02518");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo2.isExport();
        boolean boolean6 = jSDocInfo2.containsDeclaration();
        java.lang.String str7 = jSDocInfo2.getBlockDescription();
        java.lang.String str8 = jSDocInfo2.getDeprecationReason();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02519");
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
        boolean boolean18 = functionType14.isNumberObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType19 = functionType14.toMaybeEnumElementType();
        boolean boolean20 = functionType14.hasReferenceName();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(enumElementType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02520");
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
        boolean boolean13 = jSType12.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = jSType12.toObjectType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = objectType14.getCtorImplementedInterfaces();
        boolean boolean16 = objectType14.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = objectType14.getPossibleToBooleanOutcomes();
        boolean boolean18 = objectType14.isDateType();
        boolean boolean19 = objectType14.isStringObjectType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02521");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.isNoAlias();
        java.lang.String str9 = jSDocInfo2.getDeprecationReason();
        java.lang.String str10 = jSDocInfo2.getLicense();
        boolean boolean11 = jSDocInfo2.isNoSideEffects();
        boolean boolean12 = jSDocInfo2.isNoTypeCheck();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02522");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (short) 10, 37, 15);
        node3.setSourceFileForTesting("function ({97160775}): {97160775}");
        boolean boolean6 = node3.isVar();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02523");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str3 = objList2.toString();
        java.lang.Object[] objArray4 = objList2.toArray();
        java.lang.Object[] objArray5 = objList2.toArray();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean7 = jSDocInfo6.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo6.getEnumParameterType();
        boolean boolean9 = jSDocInfo6.isExterns();
        boolean boolean10 = jSDocInfo6.isIdGenerator();
        boolean boolean11 = jSDocInfo6.isDeprecated();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = jSDocInfo6.getTemplateTypeNames();
        boolean boolean13 = jSDocInfo6.isHidden();
        boolean boolean14 = jSDocInfo6.isNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo6.getParameterType("function ({1591600607}): {1591600607}");
        java.lang.String str17 = jSDocInfo6.getReturnDescription();
        boolean boolean18 = jSDocInfo6.isDefine();
        boolean boolean19 = objList2.contains((java.lang.Object) jSDocInfo6);
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02524");
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
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType24.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType28 = functionType24.toMaybeFunctionType();
        boolean boolean30 = functionType28.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType28.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType28.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        boolean boolean44 = functionType28.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType43);
        boolean boolean45 = functionType28.isNullable();
        com.google.javascript.rhino.jstype.ObjectType.Property property47 = functionType28.getSlot("function ({172131644}): {172131644}");
        boolean boolean48 = objectType13.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType28);
        boolean boolean49 = objectType13.isBooleanObjectType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(property47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02525");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node1.setCharno((int) (short) 1);
        boolean boolean4 = node1.isArrayLit();
        boolean boolean5 = node1.isVarArgs();
        boolean boolean6 = node1.isFor();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = node1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02526");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02527");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.hasDisplayName();
        boolean boolean12 = functionType10.hasDisplayName();
        boolean boolean13 = functionType10.matchesInt32Context();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        boolean boolean22 = node20.isQuotedString();
        com.google.javascript.rhino.Node node23 = node20.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry15.createFunctionType(jSType16, node23);
        boolean boolean25 = functionType24.hasDisplayName();
        boolean boolean26 = functionType10.hasEqualCallType(functionType24);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable34 = node33.children();
        boolean boolean35 = node33.isQuotedString();
        com.google.javascript.rhino.Node node36 = node33.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry28.createFunctionType(jSType29, node36);
        boolean boolean38 = functionType37.isArrayType();
        boolean boolean39 = functionType37.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = functionType37.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType37.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.children();
        boolean boolean50 = node48.isQuotedString();
        com.google.javascript.rhino.Node node51 = node48.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry43.createFunctionType(jSType44, node51);
        boolean boolean53 = functionType52.isArrayType();
        boolean boolean54 = functionType52.isRegexpType();
        boolean boolean56 = functionType52.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean57 = functionType37.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType52);
        boolean boolean58 = functionType52.hasImplementedInterfaces();
        boolean boolean59 = functionType52.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable67 = node66.children();
        boolean boolean68 = node66.isQuotedString();
        com.google.javascript.rhino.Node node69 = node66.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry61.createFunctionType(jSType62, node69);
        boolean boolean71 = functionType70.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType70.restrictByNotNullOrUndefined();
        boolean boolean73 = functionType52.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType70);
        boolean boolean74 = functionType24.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType52);
        boolean boolean75 = functionType52.matchesStringContext();
        boolean boolean76 = functionType52.isNumberObjectType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(nodeIterable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02528");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objList2.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor8 = objList2.listIterator(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (53) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objSpliterator6);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02529");
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
        node27.setLength(48);
        com.google.javascript.rhino.Node node34 = node27.removeFirstChild();
        java.lang.String str38 = node27.toString(false, false, false);
        node27.putBooleanProp(1, true);
        int int42 = node27.getSideEffectFlags();
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
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "STRING NUMBER 0.0 36" + "'", str38, "STRING NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02530");
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
        jSDocInfo0.addSuppression("NUMBER 0.0");
        java.util.Collection<java.lang.String> strCollection13 = jSDocInfo0.getReferences();
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
        org.junit.Assert.assertNull(strCollection13);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02531");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet7 = jSDocInfo2.getSuppressions();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo2.getVisibility();
        java.lang.String str9 = jSDocInfo2.getMeaning();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo2.getEnumParameterType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(visibility8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02532");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getOwnImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = functionType10.getParameters();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(nodeIterable15);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02533");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        java.lang.String str9 = node3.toString();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        com.google.javascript.rhino.Node node19 = node16.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry11.createFunctionType(jSType12, node19);
        boolean boolean21 = functionType20.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType20.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType24 = functionType20.toMaybeFunctionType();
        boolean boolean26 = functionType24.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType24.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType24.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        com.google.javascript.rhino.Node node38 = node35.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry30.createFunctionType(jSType31, node38);
        boolean boolean40 = functionType24.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean41 = functionType24.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType24.getPropertyType("");
        boolean boolean44 = functionType24.isOrdinaryFunction();
        boolean boolean45 = functionType24.matchesNumberContext();
        node3.setJSType((com.google.javascript.rhino.jstype.JSType) functionType24);
        java.lang.String str47 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "NUMBER 0.0 36" + "'", str9, "NUMBER 0.0 36");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02534");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(10, nodeArray2, 51, 32);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), nodeArray2);
        boolean boolean7 = node6.isTypeOf();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02535");
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
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType23.restrictByNotNullOrUndefined();
        boolean boolean26 = jSType25.isNoResolvedType();
        boolean boolean27 = jSType25.isNominalConstructor();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = functionType10.testForEquality(jSType25);
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType10.getReturnType();
        java.lang.String str30 = jSType29.toAnnotationString();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "?" + "'", str30, "?");
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02536");
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
        boolean boolean89 = functionType83.isNoObjectType();
        java.lang.String str90 = functionType83.toString();
        boolean boolean91 = functionType83.isObject();
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "function (...[?]): ?" + "'", str90, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02537");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = functionType10.getOwnPropertyJSDocInfo("function ({2062255495}): {2062255495}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = functionType10.getOwnPropertyJSDocInfo("function ({694975932}): {694975932}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNull(jSDocInfo17);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02538");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean9 = jSTypeExpression7.equals((java.lang.Object) (short) -1);
        boolean boolean10 = jSTypeExpression7.isOptionalArg();
        boolean boolean11 = jSTypeExpression7.isOptionalArg();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02539");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = node1.getJSDocInfo();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("");
        com.google.javascript.rhino.Node node6 = node4.getAncestor(47);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) 'a', 29, 49);
        node4.addChildrenToBack(node10);
        com.google.javascript.rhino.Node node12 = node1.useSourceInfoFrom(node10);
        node1.setType(30);
        boolean boolean15 = node1.isString();
        boolean boolean16 = node1.isReturn();
        org.junit.Assert.assertNull(jSDocInfo2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02540");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("NUMBER 0.0 36 [synthetic: 1]\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02541");
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
        boolean boolean33 = functionType14.isOrdinaryFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        boolean boolean47 = functionType45.isRegexpType();
        boolean boolean49 = functionType45.isPropertyTypeDeclared("InputId: hi!");
        com.google.javascript.rhino.Node node50 = functionType45.getRootNode();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable51 = functionType45.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType45.restrictByNotNullOrUndefined();
        boolean boolean53 = functionType45.isParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
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
        com.google.javascript.rhino.Node node68 = functionType65.getRootNode();
        java.util.Set<java.lang.String> strSet69 = functionType65.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable77 = node76.children();
        boolean boolean78 = node76.isQuotedString();
        com.google.javascript.rhino.Node node79 = node76.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry71.createFunctionType(jSType72, node79);
        boolean boolean81 = functionType80.isArrayType();
        boolean boolean82 = functionType80.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType85 = functionType80.toObjectType();
        java.util.Set<java.lang.String> strSet86 = objectType85.getPropertyNames();
        boolean boolean87 = functionType65.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType85);
        int int88 = objectType85.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType45.resolve(errorReporter54, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType85);
        com.google.javascript.rhino.jstype.JSType jSType90 = functionType14.forceResolve(errorReporter34, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType45);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(objectTypeIterable51);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(functionTypeList67);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(nodeIterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertNotNull(jSType90);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02542");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node7 = node5.getFirstChild();
        boolean boolean8 = node7.isDec();
        java.lang.Object obj10 = node7.getProp(22);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        java.lang.Object[] objArray23 = objList21.toArray();
        java.util.stream.Stream<java.lang.Object> objStream24 = objList21.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList27 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray28 = objList27.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor29 = objList27.listIterator();
        boolean boolean31 = objList27.contains((java.lang.Object) (short) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = objList27.equals(obj32);
        java.lang.String str34 = objList27.toString();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        node38.setLength(0);
        boolean boolean43 = node38.isScript();
        boolean boolean44 = node38.hasChildren();
        int int45 = objList27.lastIndexOf((java.lang.Object) node38);
        boolean boolean46 = objList21.addAll((java.util.Collection<java.lang.Object>) objList27);
        com.google.common.collect.ImmutableList<java.lang.Object> objList49 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray50 = objList49.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor51 = objList49.listIterator();
        boolean boolean53 = objList49.contains((java.lang.Object) (short) 10);
        java.lang.Object obj54 = null;
        boolean boolean55 = objList49.equals(obj54);
        com.google.common.collect.ImmutableList<java.lang.Object> objList58 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray59 = objList58.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor60 = objList58.listIterator();
        int int61 = objList58.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor63 = objList58.listIterator((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Object> objList66 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray67 = objList66.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor68 = objList66.listIterator();
        int int69 = objList66.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor71 = objList66.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(39, node76);
        boolean boolean78 = node77.isIf();
        node77.detachChildren();
        boolean boolean80 = node77.isVoid();
        boolean boolean81 = node77.isNE();
        int int82 = objList66.indexOf((java.lang.Object) node77);
        boolean boolean83 = objList66.isEmpty();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Object>> objListList84 = com.google.common.collect.ImmutableList.of(objList27, objList49, objList58, objList66);
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean89 = node88.hasOneChild();
        boolean boolean90 = objList58.equals((java.lang.Object) node88);
        java.lang.Object obj92 = node88.getProp((int) (byte) -1);
        com.google.javascript.rhino.jstype.JSType jSType93 = node88.getJSType();
        double double94 = node88.getDouble();
        boolean boolean95 = node7.isEquivalentTo(node88);
        int int96 = node88.getChildCount();
        boolean boolean97 = node88.isArrayLit();
        com.google.javascript.rhino.Node node98 = node88.getFirstChild();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream24);
        org.junit.Assert.assertNotNull(objList27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[10, 0]" + "'", str34, "[10, 0]");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objList49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objList58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertNotNull(objItor63);
        org.junit.Assert.assertNotNull(objList66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(objItor71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(objListList84);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(jSType93);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(node98);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02543");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = ternaryValue0.xor(ternaryValue1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = ternaryValue0.and(ternaryValue3);
        java.lang.String str5 = ternaryValue4.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue4.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue7.xor(ternaryValue8);
        java.lang.String str10 = ternaryValue9.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = ternaryValue11.xor(ternaryValue12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue9.xor(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue15.xor(ternaryValue16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue13.or(ternaryValue17);
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
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType29.getPropertyType("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        boolean boolean45 = functionType44.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType44.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType44.toMaybeFunctionType();
        com.google.javascript.rhino.Node node49 = functionType44.getRootNode();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = functionType29.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType44);
        java.lang.String str51 = ternaryValue50.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue18.or(ternaryValue50);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue4.or(ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = ternaryValue54.xor(ternaryValue55);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue18.xor(ternaryValue54);
        java.lang.String str58 = ternaryValue54.toString();
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
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "unknown" + "'", str51, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "false" + "'", str58, "false");
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02544");
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
        int int15 = functionType10.getPropertiesCount();
        boolean boolean16 = functionType10.matchesStringContext();
        boolean boolean18 = functionType10.hasOwnProperty("Node tree inequality:\nTree1:\nNUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nTree2:\nSTRING {1936444324} 32\n\n\nSubtree1: NUMBER 0.0 36 [var_args_name: 1] [source_file: [10, 0]]\n\n\nSubtree2: STRING {1936444324} 32\n");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry20.getType("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable30 = node29.children();
        boolean boolean31 = node29.isQuotedString();
        com.google.javascript.rhino.Node node32 = node29.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry24.createFunctionType(jSType25, node32);
        boolean boolean34 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList49 = functionType47.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        boolean boolean58 = node56.isQuotedString();
        com.google.javascript.rhino.Node node59 = node56.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry51.createFunctionType(jSType52, node59);
        boolean boolean61 = functionType60.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] { functionType47, functionType60 };
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry36.createUnionType(jSTypeArray62);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope64 = null;
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry36.getType(jSTypeStaticScope64, "[10, 0]", "", (int) (byte) 1, (int) (byte) 10);
        com.google.javascript.rhino.ErrorReporter errorReporter70 = jSTypeRegistry36.getErrorReporter();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray71 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry36.createUnionType(jSTypeNativeArray71);
        com.google.javascript.rhino.jstype.JSType jSType73 = jSTypeRegistry24.createUnionType(jSTypeNativeArray71);
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry20.createUnionType(jSTypeNativeArray71);
        boolean boolean75 = functionType10.canTestForEqualityWith(jSType74);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(nodeIterable30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(functionTypeList49);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNull(errorReporter70);
        org.junit.Assert.assertNotNull(jSTypeNativeArray71);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02545");
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
        boolean boolean56 = functionType23.isUnknownType();
        boolean boolean57 = functionType23.isNullable();
        boolean boolean59 = functionType23.hasProperty("NUMBER 0.0 16");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType60 = functionType23.cloneWithoutArrowType();
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02546");
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
        boolean boolean16 = functionType10.isInstanceType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType10.getAllImplementedInterfaces();
        boolean boolean18 = functionType10.isGlobalThisType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType29.isArrayType();
        boolean boolean32 = functionType29.isPropertyTypeInferred("JSDocInfo");
        boolean boolean34 = functionType29.hasOwnProperty("");
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
        boolean boolean49 = functionType29.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType45);
        boolean boolean50 = functionType45.canBeCalled();
        boolean boolean51 = functionType45.isInstanceType();
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
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType62.findPropertyType("");
        functionType62.clearCachedValues();
        boolean boolean68 = functionType45.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean70 = functionType45.hasProperty("function ({1160807699}): {1160807699}");
        boolean boolean71 = functionType45.matchesNumberContext();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet72 = functionType45.getPossibleToBooleanOutcomes();
        java.lang.String str73 = functionType45.getDisplayName();
        functionType10.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType45);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet72 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet72.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02547");
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
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable22 = node20.getAncestors();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean27 = node26.hasOneChild();
        node26.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node26.getAncestors();
        int int31 = node26.getChildCount();
        node20.addChildrenToFront(node26);
        com.google.javascript.rhino.Node node34 = node26.getChildAtIndex(0);
        boolean boolean35 = node26.isOnlyModifiesThisCall();
        boolean boolean36 = node26.isLabel();
        boolean boolean37 = node26.isSetterDef();
        boolean boolean38 = node26.isScript();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02548");
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
        com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType10.toMaybeFunctionType();
        boolean boolean81 = functionType80.isOrdinaryFunction();
        java.lang.String str82 = functionType80.getReferenceName();
        boolean boolean84 = functionType80.hasOwnProperty("NUMBER 0.0");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable85 = functionType80.getImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable85);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02549");
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
        boolean boolean40 = node6.isBlock();
        boolean boolean41 = node6.isGetElem();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02550");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        node3.setDouble((double) 100);
        int int12 = node3.getSourceOffset();
        node3.detachChildren();
        boolean boolean14 = node3.isLocalResultCall();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node18.setSourceFileForTesting("[10, 0]");
        node18.setVarArgs(true);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder24 = node18.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node25 = node3.copyInformationFrom(node18);
        boolean boolean26 = node25.isFor();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02551");
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
        boolean boolean49 = functionType10.isNumber();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02552");
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
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        boolean boolean27 = functionType26.isArrayType();
        boolean boolean28 = functionType26.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = functionType26.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType26.getAllImplementedInterfaces();
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
        boolean boolean45 = functionType41.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean46 = functionType26.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType41);
        boolean boolean47 = functionType41.matchesStringContext();
        boolean boolean48 = functionType41.hasReferenceName();
        boolean boolean49 = functionType10.hasEqualCallType(functionType41);
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType41.getReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = jSDocInfo52.getThisType();
        java.lang.String str54 = jSDocInfo52.getOriginalCommentString();
        boolean boolean55 = jSDocInfo52.isConstructor();
        functionType41.setPropertyJSDocInfo("function ({959037785}): {959037785}", jSDocInfo52);
        boolean boolean58 = functionType41.hasOwnProperty("");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNull(jSTypeExpression53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02553");
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
        com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet81 = functionType10.getPossibleToBooleanOutcomes();
        boolean boolean83 = booleanLiteralSet81.contains(true);
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
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet81 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet81.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02554");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        boolean boolean23 = node21.isQuotedString();
        com.google.javascript.rhino.Node node24 = node21.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry16.createFunctionType(jSType17, node24);
        boolean boolean26 = functionType25.isArrayType();
        boolean boolean27 = functionType25.isRegexpType();
        boolean boolean29 = functionType25.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean30 = functionType10.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType25);
        boolean boolean31 = functionType25.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot33 = functionType25.getOwnSlot("()");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = functionType25.getOwnImplementedInterfaces();
        boolean boolean35 = functionType25.isUnionType();
        boolean boolean36 = functionType25.matchesObjectContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot33);
        org.junit.Assert.assertNotNull(objectTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02555");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("hi!");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        java.lang.String str7 = node5.getQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList12 = com.google.common.collect.ImmutableList.of(jSDocInfo8, jSDocInfo9, jSDocInfo10, jSDocInfo11);
        java.util.Set<java.lang.String> strSet13 = jSDocInfo11.getSuppressions();
        strSet13.clear();
        node5.setDirectives(strSet13);
        boolean boolean16 = inputId1.equals((java.lang.Object) strSet13);
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet13.spliterator();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(jSDocInfoList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02556");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        boolean boolean2 = booleanLiteralSet0.contains(false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        boolean boolean11 = node9.isQuotedString();
        com.google.javascript.rhino.Node node12 = node9.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry4.createFunctionType(jSType5, node12);
        boolean boolean14 = functionType13.isArrayType();
        boolean boolean16 = functionType13.isPropertyTypeInferred("JSDocInfo");
        boolean boolean18 = functionType13.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType29.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType29.getPropertyType("InputId: hi!");
        boolean boolean33 = functionType13.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean34 = functionType29.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType29.unboxesTo();
        boolean boolean36 = functionType29.isInterface();
        boolean boolean38 = functionType29.isPropertyInExterns("NUMBER 0.0 36\n");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = functionType29.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet40 = booleanLiteralSet0.intersection(booleanLiteralSet39);
        boolean boolean42 = booleanLiteralSet40.contains(false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet40 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet40.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02557");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        java.util.Set<java.lang.String> strSet5 = jSDocInfo3.getSuppressions();
        java.lang.String str6 = jSDocInfo3.getDescription();
        java.lang.String str7 = jSDocInfo3.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList12 = com.google.common.collect.ImmutableList.of(jSDocInfo8, jSDocInfo9, jSDocInfo10, jSDocInfo11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo11.getReturnType();
        boolean boolean14 = jSDocInfo11.isConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility15 = jSDocInfo11.getVisibility();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList20 = com.google.common.collect.ImmutableList.of(jSDocInfo16, jSDocInfo17, jSDocInfo18, jSDocInfo19);
        boolean boolean22 = jSDocInfo18.hasParameterType("hi!");
        jSDocInfo18.setLicense("JSDocInfo");
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = jSDocInfo25.getEnumParameterType();
        boolean boolean28 = jSDocInfo25.isExterns();
        boolean boolean29 = jSDocInfo25.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = jSDocInfo25.getType();
        int int31 = jSDocInfo25.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList36 = com.google.common.collect.ImmutableList.of(jSDocInfo32, jSDocInfo33, jSDocInfo34, jSDocInfo35);
        boolean boolean38 = jSDocInfo34.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet39 = jSDocInfo34.getSuppressions();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean41 = jSDocInfo40.isDefine();
        boolean boolean42 = jSDocInfo40.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList47 = com.google.common.collect.ImmutableList.of(jSDocInfo43, jSDocInfo44, jSDocInfo45, jSDocInfo46);
        boolean boolean49 = jSDocInfo45.hasParameterType("hi!");
        jSDocInfo45.setLicense("JSDocInfo");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList52 = jSDocInfo45.getExtendedInterfaces();
        boolean boolean53 = jSDocInfo45.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList58 = com.google.common.collect.ImmutableList.of(jSDocInfo54, jSDocInfo55, jSDocInfo56, jSDocInfo57);
        boolean boolean60 = jSDocInfo56.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet61 = jSDocInfo56.getSuppressions();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression62 = jSDocInfo56.getEnumParameterType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList63 = com.google.common.collect.ImmutableList.of(jSDocInfo3, jSDocInfo11, jSDocInfo18, jSDocInfo25, jSDocInfo34, jSDocInfo40, jSDocInfo45, jSDocInfo56);
        boolean boolean64 = jSDocInfo25.isConstant();
        java.lang.String str65 = jSDocInfo25.getBlockDescription();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(jSDocInfoList12);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(visibility15);
        org.junit.Assert.assertNotNull(jSDocInfoList20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSTypeExpression27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jSTypeExpression30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(jSDocInfoList36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNull(jSTypeExpression62);
        org.junit.Assert.assertNotNull(jSDocInfoList63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02558");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean2 = node1.isBlock();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        node6.setLength(0);
        boolean boolean11 = node6.isVar();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean16 = node15.hasOneChild();
        node6.addChildToBack(node15);
        node1.addChildToBack(node6);
        boolean boolean19 = node1.isThis();
        boolean boolean20 = node1.isDec();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02559");
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
        com.google.javascript.rhino.jstype.EnumType enumType30 = objectType29.toMaybeEnumType();
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function ({1658382477}): {1658382477}" + "'", str28, "function ({1658382477}): {1658382477}");
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertNull(enumType30);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02560");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.children();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        node9.addChildrenToBack(node14);
        node9.detachChildren();
        boolean boolean18 = node9.isOr();
        com.google.javascript.rhino.Node node19 = node4.copyInformationFrom(node9);
        boolean boolean20 = node4.isThrow();
        com.google.javascript.rhino.Node node21 = node4.removeFirstChild();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int27 = node26.getSourceOffset();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        node26.addChildrenToBack(node31);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node39 = node26.useSourceInfoIfMissingFrom(node37);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(10, node26, 49, (int) (short) 100);
        java.util.Set<java.lang.String> strSet43 = node42.getDirectives();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable44 = node42.getAncestors();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean49 = node48.hasOneChild();
        node48.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable52 = node48.getAncestors();
        int int53 = node48.getChildCount();
        node42.addChildrenToFront(node48);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        boolean boolean60 = node58.isQuotedString();
        node58.setLength(0);
        boolean boolean63 = node58.isVar();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean68 = node67.hasOneChild();
        node58.addChildToBack(node67);
        node67.detachChildren();
        boolean boolean71 = node48.isEquivalentTo(node67);
        node67.putBooleanProp(2147483647, false);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(39, node79);
        boolean boolean81 = node80.isIf();
        node80.detachChildren();
        boolean boolean83 = node80.isSyntheticBlock();
        com.google.javascript.rhino.Node node84 = node67.copyInformationFrom(node80);
        node84.setOptionalArg(false);
        boolean boolean87 = node84.isVar();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(10, node4, node84, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: second new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(strSet43);
        org.junit.Assert.assertNotNull(ancestorIterable44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(ancestorIterable52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02561");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.isConstant();
        boolean boolean9 = jSDocInfo2.hasParameter("[10, 0]");
        java.util.Set<java.lang.String> strSet10 = jSDocInfo2.getSuppressions();
        boolean boolean11 = jSDocInfo2.isJavaDispatch();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02562");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(1);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02563");
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
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node55.children();
        boolean boolean57 = node55.isQuotedString();
        com.google.javascript.rhino.Node node58 = node55.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry50.createFunctionType(jSType51, node58);
        boolean boolean60 = functionType59.isArrayType();
        boolean boolean61 = functionType59.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = functionType59.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = functionType59.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node70.children();
        boolean boolean72 = node70.isQuotedString();
        com.google.javascript.rhino.Node node73 = node70.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry65.createFunctionType(jSType66, node73);
        boolean boolean75 = functionType74.isArrayType();
        boolean boolean76 = functionType74.isRegexpType();
        boolean boolean78 = functionType74.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean79 = functionType59.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType74);
        boolean boolean80 = functionType74.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot82 = functionType74.getOwnSlot("()");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable83 = functionType74.getOwnImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType84 = jSType47.resolve(errorReporter48, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType74);
        boolean boolean85 = jSType47.isFunctionType();
        boolean boolean86 = jSType47.matchesNumberContext();
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function ({655841333}): {655841333}" + "'", str28, "function ({655841333}): {655841333}");
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
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot82);
        org.junit.Assert.assertNotNull(objectTypeIterable83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02564");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        boolean boolean7 = node3.isLocalResultCall();
        boolean boolean8 = node3.isTrue();
        boolean boolean9 = node3.isExprResult();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02565");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        node3.setDouble((double) 100);
        int int12 = node3.getSourceOffset();
        node3.setSourceEncodedPosition(47);
        boolean boolean15 = node3.isSetterDef();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02566");
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
        java.util.Collection[][][] collectionArray62 = new java.util.Collection[0][][];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[][][] objCollectionArray63 = (java.util.Collection<java.lang.Object>[][][]) collectionArray62;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object>[][][] objCollectionArray64 = objList55.toArray(objCollectionArray63);
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
        org.junit.Assert.assertNotNull(collectionArray62);
        org.junit.Assert.assertNotNull(objCollectionArray63);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02567");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode29 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry1.setResolveMode(resolveMode29);
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
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        boolean boolean52 = node50.isQuotedString();
        com.google.javascript.rhino.Node node53 = node50.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry45.createFunctionType(jSType46, node53);
        boolean boolean55 = functionType54.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType54.restrictByNotNullOrUndefined();
        boolean boolean57 = jSType56.isNoResolvedType();
        boolean boolean58 = jSType56.isNominalConstructor();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = functionType41.testForEquality(jSType56);
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType41.getReturnType();
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry1.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType41, "", "function ({988655030}): {988655030}", 49, 53);
        jSTypeRegistry1.forwardDeclareType("function ({658319330}): {658319330}");
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
        org.junit.Assert.assertTrue("'" + resolveMode29 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode29.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(jSType65);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02568");
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
        boolean boolean23 = jSDocInfo18.isNoSideEffects();
        boolean boolean24 = jSDocInfo18.isIdGenerator();
        boolean boolean26 = jSDocInfo18.hasParameterType("function ({1179551152}): {1179551152}");
        com.google.common.collect.ImmutableList<java.lang.Object> objList29 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream30 = objList29.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList31 = objList29.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList32 = objList29.reverse();
        java.lang.Object[] objArray33 = objList32.toArray();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int38 = node37.getSourceOffset();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        node37.addChildrenToBack(node42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int49 = node48.getSourceOffset();
        com.google.javascript.rhino.Node node50 = node37.useSourceInfoIfMissingFrom(node48);
        boolean boolean51 = objList32.contains((java.lang.Object) node50);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int57 = node56.getSourceOffset();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        node56.addChildrenToBack(node61);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int68 = node67.getSourceOffset();
        com.google.javascript.rhino.Node node69 = node56.useSourceInfoIfMissingFrom(node67);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(10, node56, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean75 = node72.isEquivalentTo(node74);
        boolean boolean76 = node72.isSwitch();
        com.google.javascript.rhino.InputId inputId78 = new com.google.javascript.rhino.InputId("hi!");
        node72.setInputId(inputId78);
        java.lang.String str80 = inputId78.toString();
        node50.setInputId(inputId78);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node83.setCharno((int) (short) 1);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable86 = node83.siblings();
        boolean boolean87 = node83.hasMoreThanOneChild();
        boolean boolean88 = node83.isDefaultCase();
        com.google.javascript.rhino.Node node89 = node50.useSourceInfoIfMissingFrom(node83);
        boolean boolean90 = node50.isGetElem();
        boolean boolean91 = node50.isTrue();
        jSDocInfo18.setAssociatedNode(node50);
        boolean boolean93 = jSDocInfo18.isExpose();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objList29);
        org.junit.Assert.assertNotNull(objStream30);
        org.junit.Assert.assertNotNull(objList31);
        org.junit.Assert.assertNotNull(objList32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, 10]");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "InputId: hi!" + "'", str80, "InputId: hi!");
        org.junit.Assert.assertNotNull(nodeIterable86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02569");
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
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType41.getPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType41.toObjectType();
        java.util.Set<java.lang.String> strSet47 = objectType46.getPropertyNames();
        jSTypeRegistry1.registerPropertyOnType("function ({1077595546}): {1077595546}", (com.google.javascript.rhino.jstype.JSType) objectType46);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = objectType46.toMaybeFunctionType();
        boolean boolean50 = objectType46.isArrayType();
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
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02570");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean12 = functionType10.isPropertyTypeDeclared("");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        boolean boolean26 = functionType23.isPropertyTypeInferred("JSDocInfo");
        boolean boolean28 = functionType23.hasOwnProperty("");
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
        boolean boolean43 = functionType23.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean44 = functionType23.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        boolean boolean53 = node51.isQuotedString();
        com.google.javascript.rhino.Node node54 = node51.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry46.createFunctionType(jSType47, node54);
        boolean boolean56 = functionType55.isArrayType();
        boolean boolean58 = functionType55.isPropertyTypeInferred("JSDocInfo");
        boolean boolean60 = functionType55.hasOwnProperty("");
        com.google.javascript.rhino.Node node61 = functionType55.getParametersNode();
        boolean boolean62 = functionType55.hasCachedValues();
        functionType23.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType55);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType23.getAllImplementedInterfaces();
        boolean boolean65 = functionType23.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node72.children();
        boolean boolean74 = node72.isQuotedString();
        com.google.javascript.rhino.Node node75 = node72.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry67.createFunctionType(jSType68, node75);
        boolean boolean77 = functionType76.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType76.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType80 = functionType76.toMaybeFunctionType();
        boolean boolean82 = functionType80.removeProperty("hi!");
        boolean boolean83 = functionType80.matchesStringContext();
        functionType23.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType80);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair85 = functionType10.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        boolean boolean86 = functionType10.matchesObjectContext();
        boolean boolean87 = functionType10.isObject();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot89 = functionType10.getSlot("Unknown class name");
        boolean boolean90 = functionType10.isCheckedUnknownType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(typePair85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(staticSlot89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02571");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList22 = com.google.common.collect.ImmutableList.of(jSDocInfo18, jSDocInfo19, jSDocInfo20, jSDocInfo21);
        java.util.Set<java.lang.String> strSet23 = jSDocInfo21.getSuppressions();
        functionType10.setPropertyJSDocInfo("", jSDocInfo21);
        boolean boolean26 = jSDocInfo21.hasParameter("InputId: hi!");
        boolean boolean27 = jSDocInfo21.isConsistentIdGenerator();
        java.lang.String str28 = jSDocInfo21.toString();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(jSDocInfoList22);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "JSDocInfo" + "'", str28, "JSDocInfo");
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02572");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.setLastGeneration(false);
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable13 = node12.children();
        boolean boolean14 = node12.isQuotedString();
        com.google.javascript.rhino.Node node15 = node12.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry7.createFunctionType(jSType8, node15);
        boolean boolean17 = functionType16.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList18 = functionType16.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        boolean boolean30 = functionType29.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] { functionType16, functionType29 };
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry5.createUnionType(jSTypeArray31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        com.google.javascript.rhino.jstype.FunctionType functionType45 = functionType44.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = functionType45.toMaybeEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node53.children();
        boolean boolean55 = node53.isQuotedString();
        com.google.javascript.rhino.Node node56 = node53.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry48.createFunctionType(jSType49, node56);
        boolean boolean58 = functionType57.isArrayType();
        java.lang.String str59 = functionType57.toAnnotationString();
        boolean boolean60 = functionType57.isStringObjectType();
        functionType45.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType57);
        jSTypeRegistry5.registerPropertyOnType("()", (com.google.javascript.rhino.jstype.JSType) functionType57);
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
        com.google.javascript.rhino.Node node77 = functionType74.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = functionType74.getJSDocInfo();
        jSTypeRegistry5.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) functionType74);
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable87 = node86.children();
        boolean boolean88 = node86.isQuotedString();
        com.google.javascript.rhino.Node node89 = node86.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry81.createFunctionType(jSType82, node89);
        boolean boolean91 = functionType90.isArrayType();
        boolean boolean93 = functionType90.isPropertyTypeInferred("JSDocInfo");
        boolean boolean94 = functionType74.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType90);
        com.google.javascript.rhino.jstype.FunctionType functionType95 = functionType74.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType96 = jSTypeRegistry1.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType95);
        boolean boolean97 = functionType95.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(functionTypeList18);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(enumElementType46);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeIterable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "function (...[?]): ?" + "'", str59, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(functionTypeList76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(jSDocInfo78);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(nodeIterable87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(node89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(functionType95);
        org.junit.Assert.assertNotNull(jSType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02573");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        java.lang.String str12 = functionType10.toAnnotationString();
        boolean boolean13 = functionType10.isStringObjectType();
        boolean boolean14 = functionType10.isNullType();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = functionType10.getParentScope();
        boolean boolean16 = objectType15.isUnknownType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = objectType15.getJSDocInfo();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "function (...[?]): ?" + "'", str12, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSDocInfo17);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02574");
        com.google.common.collect.ImmutableList<java.lang.Object> objList3 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray4 = objList3.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor5 = objList3.listIterator();
        boolean boolean7 = objList3.contains((java.lang.Object) (short) 10);
        java.lang.Object obj8 = null;
        boolean boolean9 = objList3.equals(obj8);
        java.lang.String str10 = objList3.toString();
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
        int int35 = objList3.lastIndexOf((java.lang.Object) node31);
        int int36 = node31.getSourceOffset();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable37 = node31.children();
        boolean boolean38 = node31.isDefaultCase();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(4095, node31, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            node41.setString("function ({1658382477}): {1658382477}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 4095");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[10, 0]" + "'", str10, "[10, 0]");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(nodeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02575");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getLineno();
        boolean boolean9 = node3.isExprResult();
        boolean boolean10 = node3.isAnd();
        int int11 = node3.getSourceOffset();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags12 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags12.clearSideEffectFlags();
        int int14 = sideEffectFlags12.valueOf();
        sideEffectFlags12.clearSideEffectFlags();
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(sideEffectFlags12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02576");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node1.setCharno((int) (short) 1);
        boolean boolean4 = node1.isArrayLit();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = node1.getJSDocInfo();
        boolean boolean6 = node1.isString();
        com.google.javascript.rhino.Node node7 = node1.cloneTree();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02577");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList25 = com.google.common.collect.ImmutableList.of(jSDocInfo21, jSDocInfo22, jSDocInfo23, jSDocInfo24);
        boolean boolean27 = jSDocInfo23.hasParameterType("hi!");
        boolean boolean28 = jSDocInfo23.hasReturnType();
        boolean boolean29 = jSDocInfo23.hasModifies();
        java.util.Set<java.lang.String> strSet30 = jSDocInfo23.getParameterNames();
        int int31 = strSet30.size();
        node18.setDirectives(strSet30);
        java.lang.Object[] objArray33 = strSet30.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList37 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray57 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList58 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList58, objArray57);
        boolean boolean61 = objList58.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node65.children();
        boolean boolean67 = objList58.contains((java.lang.Object) nodeIterable66);
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator68 = nodeIterable66.spliterator();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator69 = nodeIterable66.spliterator();
        boolean boolean70 = strSet30.contains((java.lang.Object) nodeIterable66);
        java.lang.Object[] objArray71 = strSet30.toArray();
        int int72 = strSet30.size();
        java.lang.Object[] objArray73 = strSet30.toArray();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objList37);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeIterable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(nodeSpliterator68);
        org.junit.Assert.assertNotNull(nodeSpliterator69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02578");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.hasChildren();
        boolean boolean12 = node8.isEmpty();
        node8.putBooleanProp(147456, true);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node8.children();
        node8.setVarArgs(true);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeIterable16);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02579");
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
        boolean boolean39 = strSet13.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.Object> objList43 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray63 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList64 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList64, objArray63);
        boolean boolean67 = objList64.add((java.lang.Object) 100.0d);
        java.util.stream.Stream<java.lang.Object> objStream68 = objList64.parallelStream();
        boolean boolean69 = strSet13.retainAll((java.util.Collection<java.lang.Object>) objList64);
        boolean boolean70 = strSet13.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objList43);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objStream68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02580");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        node15.detachChildren();
        node15.setLineno(16);
        node8.addChildrenToFront(node15);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        node30.addChildrenToBack(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node43 = node30.useSourceInfoIfMissingFrom(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int46 = node30.getIndexOfChild(node45);
        node30.detachChildren();
        boolean boolean48 = node8.isEquivalentToTyped(node30);
        boolean boolean49 = node8.isDebugger();
        boolean boolean50 = node8.isVarArgs();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02581");
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
        int int43 = node20.getSourcePosition();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 147456 + "'", int43 == 147456);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02582");
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
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType45.restrictByNotNullOrUndefined();
        java.util.Set<java.lang.String> strSet48 = functionType45.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType49 = functionType45.toMaybeParameterizedType();
        boolean boolean50 = functionType14.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType45);
        boolean boolean51 = functionType14.hasReferenceName();
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
        org.junit.Assert.assertNotNull(jSType47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNull(parameterizedType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02583");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode29 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry1.setResolveMode(resolveMode29);
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = jSTypeRegistry1.getErrorReporter();
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
        org.junit.Assert.assertTrue("'" + resolveMode29 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode29.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNull(errorReporter32);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02584");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        node3.detachChildren();
        node3.setLineno(16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(39, node18);
        boolean boolean20 = node19.isIf();
        node19.detachChildren();
        boolean boolean22 = node19.isVoid();
        com.google.javascript.rhino.Node node23 = node3.useSourceInfoIfMissingFrom(node19);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        boolean boolean32 = node30.isQuotedString();
        com.google.javascript.rhino.Node node33 = node30.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry25.createFunctionType(jSType26, node33);
        boolean boolean35 = functionType34.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType34.getPropertyType("InputId: hi!");
        boolean boolean38 = functionType34.hasCachedValues();
        node23.setJSType((com.google.javascript.rhino.jstype.JSType) functionType34);
        int int40 = functionType34.getPropertiesCount();
        boolean boolean41 = functionType34.matchesStringContext();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02585");
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
        com.google.javascript.rhino.jstype.ObjectType objectType85 = functionType82.getImplicitPrototype();
        boolean boolean87 = functionType82.hasProperty("function ({373829632}): {373829632}");
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
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02586");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (byte) 0, (int) '4', 30);
        boolean boolean4 = node3.isDo();
        boolean boolean5 = node3.isSwitch();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        boolean boolean11 = node9.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = new com.google.javascript.rhino.JSTypeExpression(node9, "hi!");
        boolean boolean15 = jSTypeExpression13.equals((java.lang.Object) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression13);
        com.google.javascript.rhino.Node node17 = jSTypeExpression13.getRoot();
        com.google.javascript.rhino.Node node18 = node3.useSourceInfoIfMissingFromForTree(node17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeExpression16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02587");
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
        boolean boolean13 = functionType10.isObject();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02588");
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
        boolean boolean32 = functionType10.isGlobalThisType();
        boolean boolean33 = functionType10.canBeCalled();
        boolean boolean34 = functionType10.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = functionType10.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType37 = objectType35.findPropertyType("NUMBER 0.0 9 [input_id: 12]");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNull(jSType37);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02589");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        java.util.Set<java.lang.String> strSet7 = jSDocInfo2.getSuppressions();
        java.lang.String str8 = jSDocInfo2.toString();
        boolean boolean9 = jSDocInfo2.isDefine();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSDocInfo" + "'", str8, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02590");
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
        boolean boolean29 = jSType28.isRegexpType();
        boolean boolean30 = jSType28.isEmptyType();
        boolean boolean31 = jSType28.isFunctionPrototypeType();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02591");
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
        boolean boolean12 = jSDocInfo2.containsDeclaration();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02592");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02593");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = functionType10.isArrayType();
        com.google.javascript.rhino.jstype.UnionType unionType12 = functionType10.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType13 = unionType12.autoboxesTo();
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
        org.junit.Assert.assertNull(unionType12);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02594");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        int int10 = node3.getCharno();
        boolean boolean11 = node3.isReturn();
        boolean boolean12 = node3.isAssign();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02595");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        boolean boolean11 = node8.isGetElem();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        node15.detachChildren();
        node15.setLineno(16);
        node8.addChildrenToFront(node15);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int31 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        node30.addChildrenToBack(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int42 = node41.getSourceOffset();
        com.google.javascript.rhino.Node node43 = node30.useSourceInfoIfMissingFrom(node41);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int46 = node30.getIndexOfChild(node45);
        node30.detachChildren();
        boolean boolean48 = node8.isEquivalentToTyped(node30);
        boolean boolean49 = node8.isLocalResultCall();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newExpr(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02596");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = functionType26.getOwnImplementedInterfaces();
        boolean boolean35 = functionType26.isEnumType();
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
        org.junit.Assert.assertNotNull(objectTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02597");
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
        boolean boolean48 = functionType47.hasDisplayName();
        boolean boolean49 = functionType47.hasDisplayName();
        boolean boolean50 = functionType47.matchesInt32Context();
        boolean boolean51 = functionType47.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType47.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        com.google.javascript.rhino.jstype.JSType jSType65 = jSTypeRegistry54.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node72.children();
        boolean boolean74 = node72.isQuotedString();
        com.google.javascript.rhino.Node node75 = node72.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry67.createFunctionType(jSType68, node75);
        boolean boolean77 = functionType76.isArrayType();
        java.lang.String str78 = functionType76.toAnnotationString();
        boolean boolean79 = functionType76.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry54.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType76, "NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray82 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node83 = jSTypeRegistry54.createOptionalParameters(jSTypeArray82);
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry1.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType47, jSTypeArray82);
        boolean boolean85 = jSTypeRegistry1.shouldTolerateUndefinedValues();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "function (...[?]): ?" + "'", str78, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(jSTypeArray82);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02598");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        boolean boolean8 = objList2.equals(obj7);
        java.lang.String str9 = objList2.toString();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable14 = node13.children();
        boolean boolean15 = node13.isQuotedString();
        node13.setLength(0);
        boolean boolean18 = node13.isScript();
        boolean boolean19 = node13.hasChildren();
        int int20 = objList2.lastIndexOf((java.lang.Object) node13);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        com.google.javascript.rhino.Node node30 = node27.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry22.createFunctionType(jSType23, node30);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry22.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet47 = functionType45.getPossibleToBooleanOutcomes();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType45.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType45.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType45.restrictByNotNullOrUndefined();
        boolean boolean51 = jSTypeRegistry22.declareType("function ({1035943170}): {1035943170}", (com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry22.getType("function ({930192739}): {930192739}");
        int int54 = objList2.lastIndexOf((java.lang.Object) jSTypeRegistry22);
        int int55 = objList2.size();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[10, 0]" + "'", str9, "[10, 0]");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet47 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet47.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02599");
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
        java.lang.String str33 = functionType14.getReferenceName();
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
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02600");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = new com.google.javascript.rhino.JSTypeExpression(node16, "hi!");
        boolean boolean19 = jSTypeExpression18.isOptionalArg();
        boolean boolean20 = jSTypeExpression18.isVarArgs();
        com.google.javascript.rhino.Node node21 = jSTypeExpression18.getRoot();
        boolean boolean22 = jSTypeExpression18.isVarArgs();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }
}
