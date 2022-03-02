import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00401");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        boolean boolean47 = enumElementType46.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType48 = enumElementType46.toMaybeEnumElementType();
        boolean boolean49 = enumElementType46.isNullable();
        boolean boolean50 = enumElementType46.isAllType();
        boolean boolean51 = enumElementType46.isStringObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, false);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry54.createFunctionType(jSType55, jSTypeArray56);
        boolean boolean58 = functionType57.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable59 = functionType57.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType57.unboxesTo();
        boolean boolean62 = functionType57.removeProperty("");
        int int63 = functionType57.getMaxArguments();
        java.lang.String str64 = functionType57.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry67.createFunctionType(jSType68, jSTypeArray69);
        boolean boolean71 = functionType70.isNominalType();
        functionType57.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType70);
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, false);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry75.createFunctionType(jSType76, jSTypeArray77);
        boolean boolean79 = functionType78.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable80 = functionType78.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType78.unboxesTo();
        boolean boolean83 = functionType78.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType84 = functionType78.getImplicitPrototype();
        functionType57.setPrototypeBasedOn(objectType84);
        boolean boolean86 = objectType84.isFunctionType();
        boolean boolean87 = enumElementType46.isSubtype((com.google.javascript.rhino.jstype.JSType) objectType84);
        int int88 = enumElementType46.getPropertiesCount();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(enumElementType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable59);
        org.junit.Assert.assertNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable80);
        org.junit.Assert.assertNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(objectType84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00402");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setItem("Not declared as a type name");
        int int3 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("function (): {283828748}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00403");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition1 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        org.junit.Assert.assertNull(nodeSourcePosition1);
        org.junit.Assert.assertNull(stringPosition2);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00404");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean91 = parameterizedType89.isPropertyTypeDeclared("function (): {308555690}");
        boolean boolean92 = parameterizedType89.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType89.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType95 = parameterizedType89.getPropertyType("function (): {308555690}");
        com.google.javascript.rhino.jstype.EnumType enumType96 = parameterizedType89.toMaybeEnumType();
        boolean boolean97 = parameterizedType89.isNoType();
        java.lang.String str98 = parameterizedType89.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType99 = parameterizedType89.collapseUnion();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNull(enumType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(str98);
        org.junit.Assert.assertNotNull(jSType99);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00405");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList6.parallelStream();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        int int9 = strComparableList6.indexOf((java.lang.Object) visibility8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, false);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry12.createFunctionType(jSType13, jSTypeArray14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry18.createFunctionType(jSType19, jSTypeArray20);
        boolean boolean22 = functionType21.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList27 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor28 = strComparableList27.iterator();
        boolean boolean29 = functionType21.equals((java.lang.Object) strComparableItor28);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, false);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry33.createFunctionType(jSType34, jSTypeArray35);
        boolean boolean37 = functionType36.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = functionType36.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node39 = null;
        boolean boolean40 = functionType21.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType36, node39);
        boolean boolean42 = functionType36.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry45.createFunctionType(jSType46, jSTypeArray47);
        boolean boolean49 = functionType48.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList54 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor55 = strComparableList54.iterator();
        boolean boolean56 = functionType48.equals((java.lang.Object) strComparableItor55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = functionType62.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair65 = functionType48.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean66 = jSTypeRegistry12.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType36, (com.google.javascript.rhino.jstype.ObjectType) functionType62);
        boolean boolean67 = strComparableList6.contains((java.lang.Object) functionType62);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = strComparableList6.add((java.lang.Comparable<java.lang.String>) "function (): {1228830430}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + visibility8 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility8.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strComparableList27);
        org.junit.Assert.assertNotNull(strComparableItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strComparableList54);
        org.junit.Assert.assertNotNull(strComparableItor55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNull(jSDocInfo64);
        org.junit.Assert.assertNotNull(typePair65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00406");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node15 = node13.cloneTree();
        node15.setSourceEncodedPosition((int) (short) 10);
        boolean boolean18 = node15.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node30.setString("");
        com.google.javascript.rhino.Node node33 = node26.useSourceInfoIfMissingFromForTree(node30);
        node30.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        boolean boolean42 = functionType41.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry21.createObjectType("hi!", node30, (com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry21.createParametersWithVarArgs(jSTypeArray44);
        boolean boolean46 = node45.isIn();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(52, node15, node45, 42, (int) (byte) 0);
        boolean boolean50 = node15.isContinue();
        boolean boolean51 = node15.isGetProp();
        com.google.javascript.rhino.Node node52 = node15.getFirstChild();
        boolean boolean53 = node15.isDelProp();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node61.setString("");
        com.google.javascript.rhino.Node node64 = node57.useSourceInfoIfMissingFromForTree(node61);
        boolean boolean65 = node57.isGetElem();
        com.google.javascript.rhino.Node node66 = node57.cloneNode();
        boolean boolean67 = node66.isContinue();
        com.google.javascript.rhino.Node node68 = node66.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo69.hasParameterType("[, hi!, STRING hi!, STRING hi!]");
        node66.setJSDocInfo(jSDocInfo69);
        com.google.javascript.rhino.Node node73 = node15.useSourceInfoIfMissingFromForTree(node66);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node66);
        node66.addSuppression("Object");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00407");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry14.createFunctionType(jSType15, jSTypeArray16);
        boolean boolean18 = functionType17.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType17.unboxesTo();
        boolean boolean22 = functionType17.removeProperty("");
        int int23 = functionType17.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, false);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry26.createFunctionType(jSType27, jSTypeArray28);
        boolean boolean30 = functionType29.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType29.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType29.unboxesTo();
        boolean boolean34 = functionType29.removeProperty("");
        int int35 = functionType29.getMaxArguments();
        java.lang.String str36 = functionType29.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        functionType29.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        boolean boolean45 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType17, (com.google.javascript.rhino.jstype.JSType) functionType42);
        boolean boolean46 = functionType17.isNullType();
        boolean boolean47 = functionType17.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType48 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType17);
        jSTypeRegistry2.incrementGeneration();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType48);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00408");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType51.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType51.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        functionType62.setJSDocInfo(jSDocInfo66);
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType51.resolve(errorReporter56, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = enumType44.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = functionType51.getOwnPropertyJSDocInfo("function (): {308555690}");
        boolean boolean72 = functionType51.hasImplementedInterfaces();
        boolean boolean73 = functionType51.hasDisplayName();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType74 = functionType51.toMaybeEnumElementType();
        boolean boolean75 = functionType51.hasInstanceType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNull(jSDocInfo71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(enumElementType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00409");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        functionType5.setJSDocInfo(jSDocInfo9);
        boolean boolean11 = jSDocInfo9.hasEnumParameterType();
        boolean boolean12 = jSDocInfo9.isNoTypeCheck();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00410");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        boolean boolean5 = node3.isEmpty();
        node3.setSourceEncodedPosition(54);
        int int8 = node3.getChildCount();
        boolean boolean9 = node3.isQuotedString();
        int int10 = node3.getType();
        int int11 = node3.getLineno();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00411");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean91 = parameterizedType89.isPropertyTypeDeclared("function (): {308555690}");
        boolean boolean92 = parameterizedType89.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType89.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType95 = parameterizedType89.getPropertyType("function (): {308555690}");
        com.google.javascript.rhino.jstype.EnumType enumType96 = parameterizedType89.toMaybeEnumType();
        boolean boolean97 = parameterizedType89.isNoType();
        java.lang.String str98 = parameterizedType89.getReferenceName();
        com.google.javascript.rhino.jstype.TemplateType templateType99 = parameterizedType89.toMaybeTemplateType();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNull(enumType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(str98);
        org.junit.Assert.assertNull(templateType99);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00412");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node15 = node3.detachFromParent();
        int int16 = node3.getCharno();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, false);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry26.createFunctionType(jSType27, jSTypeArray28);
        boolean boolean30 = functionType29.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType29.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType29.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType29.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = functionType22.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType29);
        com.google.javascript.rhino.Node node35 = functionType22.getParametersNode();
        boolean boolean36 = node35.isNot();
        // The following exception was thrown during execution in test generation
        try {
            node3.removeChild(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable31);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00413");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean11 = strComparableList4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strComparableList4.add((java.lang.Comparable<java.lang.String>) "function (): {1386872197}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00414");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node46 = node45.removeFirstChild();
        boolean boolean47 = node45.isCase();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo48 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00415");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        boolean boolean47 = enumElementType46.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType48 = enumElementType46.toMaybeEnumElementType();
        boolean boolean49 = enumElementType46.isNullable();
        boolean boolean50 = enumElementType46.hasReferenceName();
        boolean boolean51 = enumElementType46.hasDisplayName();
        com.google.javascript.rhino.jstype.ObjectType objectType52 = enumElementType46.getImplicitPrototype();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(enumElementType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(objectType52);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00416");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        node54.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, false);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        boolean boolean66 = functionType65.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry45.createObjectType("hi!", node54, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry1.createObjectType("", node42, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        boolean boolean69 = objectType68.isEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType70 = objectType68.getConstructor();
        boolean boolean71 = objectType68.isGlobalThisType();
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00417");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        boolean boolean48 = enumType45.hasProperty("[, hi!, STRING hi!, STRING hi!]");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType49 = enumType45.getElementsType();
        boolean boolean50 = enumType45.hasCachedValues();
        java.lang.Iterable iterable51 = enumType45.getCtorImplementedInterfaces();
        boolean boolean53 = enumType45.hasOwnProperty("function (): {78785902}");
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(enumElementType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(iterable51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00418");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}", jSTypeNative1);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00419");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING hi!");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node29.setString("");
        com.google.javascript.rhino.Node node32 = node25.useSourceInfoIfMissingFromForTree(node29);
        node29.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, false);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry37.createFunctionType(jSType38, jSTypeArray39);
        boolean boolean41 = functionType40.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType42 = jSTypeRegistry20.createObjectType("hi!", node29, (com.google.javascript.rhino.jstype.ObjectType) functionType40);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node50.setString("");
        com.google.javascript.rhino.Node node53 = node46.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean54 = node46.isGetElem();
        com.google.javascript.rhino.Node node55 = node46.cloneNode();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node63.setString("");
        com.google.javascript.rhino.Node node66 = node59.useSourceInfoIfMissingFromForTree(node63);
        boolean boolean67 = node59.isGetElem();
        int int69 = node59.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newExpr(node59);
        com.google.javascript.rhino.Node node71 = node46.clonePropsFrom(node59);
        boolean boolean72 = node71.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable73 = node71.siblings();
        boolean boolean74 = node71.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship75 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType17, node29, node71);
        node3.addChildrenToBack(node29);
        com.google.javascript.rhino.Node node77 = node29.removeChildren();
        boolean boolean78 = node29.isBreak();
        boolean boolean79 = node29.isHook();
        boolean boolean80 = node29.isFunction();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + subclassType17 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType17.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectType42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(nodeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00420");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.Node node6 = functionType5.getRootNode();
        boolean boolean7 = functionType5.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.getReturnType();
        boolean boolean9 = jSType8.isNoType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00421");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node46 = node45.removeFirstChild();
        boolean boolean47 = node45.isFalse();
        boolean boolean48 = node45.isNot();
        java.lang.String str49 = node45.toString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "EXPR_RESULT" + "'", str49, "EXPR_RESULT");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00422");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        jSTypeRegistry2.forwardDeclareType("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        boolean boolean20 = functionType19.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList25 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor26 = strComparableList25.iterator();
        boolean boolean27 = functionType19.equals((java.lang.Object) strComparableItor26);
        com.google.javascript.rhino.Node node28 = functionType19.getSource();
        boolean boolean29 = functionType19.isNumberObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = functionType19.getBindReturnType(0);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList45 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor46 = strComparableList45.iterator();
        boolean boolean47 = functionType39.equals((java.lang.Object) strComparableItor46);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry50.createFunctionType(jSType51, jSTypeArray52);
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = functionType53.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair56 = functionType39.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean57 = functionType39.isNominalType();
        functionType39.clearCachedValues();
        functionType39.clearResolved();
        jSTypeRegistry2.unregisterPropertyOnType("java.io.IOException: ", (com.google.javascript.rhino.jstype.JSType) functionType39);
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative62 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType63 = jSTypeRegistry2.getNativeObjectType(jSTypeNative62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableList25);
        org.junit.Assert.assertNotNull(strComparableItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertNotNull(jSType32);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strComparableList45);
        org.junit.Assert.assertNotNull(strComparableItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNull(jSDocInfo55);
        org.junit.Assert.assertNotNull(typePair56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00423");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int5 = node4.getLineno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node13.setString("");
        com.google.javascript.rhino.Node node16 = node9.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean17 = node9.isGetElem();
        com.google.javascript.rhino.Node node18 = node9.cloneNode();
        boolean boolean19 = node18.isContinue();
        com.google.javascript.rhino.Node node20 = node18.cloneTree();
        node20.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node20.getStaticSourceFile();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(46, node4, node20, (int) (byte) -1, (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        int int40 = node30.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newExpr(node30);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean53 = node45.isGetElem();
        com.google.javascript.rhino.Node node54 = node45.cloneNode();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node62.setString("");
        com.google.javascript.rhino.Node node65 = node58.useSourceInfoIfMissingFromForTree(node62);
        boolean boolean66 = node58.isGetElem();
        int int68 = node58.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newExpr(node58);
        com.google.javascript.rhino.Node node70 = node45.clonePropsFrom(node58);
        boolean boolean71 = node45.isGetElem();
        com.google.javascript.rhino.Node node72 = node41.useSourceInfoFrom(node45);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(40);
        boolean boolean75 = node74.isAdd();
        node72.addChildToFront(node74);
        com.google.javascript.rhino.Node node77 = node4.useSourceInfoFrom(node74);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable78 = node77.getAncestors();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(staticSourceFile23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(ancestorIterable78);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00424");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("function (): {78785902}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00425");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean3 = jSDocInfo0.hasDescriptionForParameter("hi!");
        boolean boolean4 = jSDocInfo0.isNoAlias();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00426");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getEnumParameterType();
        boolean boolean4 = jSDocInfo0.isInterface();
        java.lang.String str5 = jSDocInfo0.getSourceName();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00427");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        com.google.javascript.rhino.Node node18 = functionType5.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry21.createFunctionType(jSType22, jSTypeArray23);
        boolean boolean25 = functionType24.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList30 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor31 = strComparableList30.iterator();
        boolean boolean32 = functionType24.equals((java.lang.Object) strComparableItor31);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType39.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = functionType24.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType39, node42);
        boolean boolean45 = functionType39.removeProperty("Not declared as a type name");
        boolean boolean46 = functionType5.hasEqualCallType(functionType39);
        boolean boolean47 = functionType5.isTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType5.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strComparableList30);
        org.junit.Assert.assertNotNull(strComparableItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00428");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        boolean boolean4 = node3.isFor();
        com.google.javascript.rhino.Node node5 = node3.getNext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            node5.setJSDocInfo(jSDocInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00429");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node13 = node7.cloneNode();
        boolean boolean14 = node13.isDelProp();
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            node13.appendStringTree(appendable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00430");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString((int) (short) -1, "true");
        boolean boolean7 = node6.isBlock();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry2.createInterfaceType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00431");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder0 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>>();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList1 = nodeSourcePositionBuilder0.build();
        org.junit.Assert.assertNotNull(nodeSourcePositionList1);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00432");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean12 = strComparableList9.equals((java.lang.Object) 10.0f);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry15.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        boolean boolean25 = jSTypeRegistry15.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        com.google.javascript.rhino.Node node39 = node30.cloneNode();
        boolean boolean40 = node39.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = node39.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = functionType50.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry44.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = functionType50.getJSDocInfo();
        boolean boolean56 = functionType50.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType57 = jSTypeRegistry15.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node39, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.Node node58 = enumType57.getSource();
        java.lang.String str59 = enumType57.toString();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType60 = enumType57.getElementsType();
        com.google.javascript.rhino.jstype.JSType jSType61 = enumElementType60.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = enumElementType60.getImplicitPrototype();
        java.lang.Class<?> wildcardClass63 = enumElementType60.getClass();
        boolean boolean64 = strComparableList9.contains((java.lang.Object) enumElementType60);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList69 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList74 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean75 = strComparableList69.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList74);
        boolean boolean76 = strComparableList69.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator77 = strComparableList69.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = strComparableList9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(staticSourceFile41);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(jSDocInfo52);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNull(jSDocInfo54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(enumType57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}" + "'", str59, "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertNotNull(enumElementType60);
        org.junit.Assert.assertNull(jSType61);
        org.junit.Assert.assertNull(objectType62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strComparableList69);
        org.junit.Assert.assertNotNull(strComparableList74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator77);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00433");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType9 = functionType5.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable18 = functionType16.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType16.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        functionType16.setJSDocInfo(jSDocInfo20);
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType5.resolve(errorReporter10, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType16);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType28.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType28.getIndexType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType38 = functionType28.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNotNull(ternaryValue37);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00434");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor57 = strComparableList56.iterator();
        boolean boolean58 = functionType50.equals((java.lang.Object) strComparableItor57);
        boolean boolean59 = functionType50.isArrayType();
        boolean boolean60 = functionType50.isInterface();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType50.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, false);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry64.createAnonymousObjectType();
        boolean boolean66 = objectType65.isNominalType();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry2.createFunctionTypeWithNewReturnType(functionType50, (com.google.javascript.rhino.jstype.JSType) objectType65);
        functionType67.clearCachedValues();
        boolean boolean69 = functionType67.hasCachedValues();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strComparableItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00435");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int6 = node5.getLineno();
        boolean boolean7 = node5.isEmpty();
        boolean boolean8 = node5.isLocalResultCall();
        boolean boolean9 = node5.isFromExterns();
        boolean boolean10 = node5.isNoSideEffectsCall();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship11 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node1, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00436");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("java.io.IOException: ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00437");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "JSDocInfo");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00438");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean37 = functionType33.isUnknownType();
        boolean boolean38 = functionType33.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType33.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = functionType33.getPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry44.createFunctionType(jSType45, jSTypeArray46);
        boolean boolean48 = functionType47.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType47.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType47.unboxesTo();
        boolean boolean52 = functionType47.removeProperty("");
        int int53 = functionType47.getMaxArguments();
        java.lang.String str54 = functionType47.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry57.createFunctionType(jSType58, jSTypeArray59);
        boolean boolean61 = functionType60.isNominalType();
        functionType47.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType60);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, false);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry65.createFunctionType(jSType66, jSTypeArray67);
        boolean boolean69 = functionType68.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = functionType68.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType68.unboxesTo();
        boolean boolean73 = functionType68.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType74 = functionType68.getImplicitPrototype();
        functionType47.setPrototypeBasedOn(objectType74);
        boolean boolean76 = objectType74.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType33.resolve(errorReporter41, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType74);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(jSType39);
        org.junit.Assert.assertNotNull(objectType40);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(jSType77);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00439");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        functionType5.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, false);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry29.createFunctionType(jSType30, jSTypeArray31);
        boolean boolean33 = functionType32.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType39.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType39.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = functionType32.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean45 = functionType39.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, false);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry55.createFunctionType(jSType56, jSTypeArray57);
        boolean boolean59 = functionType58.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable60 = functionType58.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType58.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType62 = functionType58.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = functionType51.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType58);
        com.google.javascript.rhino.Node node64 = functionType51.getSource();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType51.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, false);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry69.createFunctionType(jSType70, jSTypeArray71);
        boolean boolean73 = functionType72.isNominalType();
        int int74 = functionType72.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList86 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor87 = strComparableList86.iterator();
        boolean boolean88 = functionType80.equals((java.lang.Object) strComparableItor87);
        com.google.javascript.rhino.Node node89 = functionType80.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList90 = com.google.common.collect.ImmutableList.of(functionType26, functionType39, functionType51, functionType72, functionType80);
        boolean boolean91 = functionType5.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean93 = functionType5.removeProperty("function (): {704344377}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable94 = functionType5.getExtendedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable60);
        org.junit.Assert.assertNull(jSType61);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(strComparableList86);
        org.junit.Assert.assertNotNull(strComparableItor87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(node89);
        org.junit.Assert.assertNotNull(functionTypeList90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable94);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00440");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isDebugger();
        node12.addSuppression("function (): {1534343319}");
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        com.google.javascript.rhino.Node node28 = node19.cloneNode();
        boolean boolean29 = node28.isDebugger();
        boolean boolean30 = node28.isArrayLit();
        boolean boolean31 = node28.isReturn();
        node28.setString("JSDocInfo");
        com.google.javascript.rhino.jstype.JSType jSType34 = node28.getJSType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = node12.clonePropsFrom(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSType34);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00441");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry8.createFunctionType(jSType9, jSTypeArray10);
        boolean boolean12 = functionType11.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType18.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType18.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = functionType11.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType18);
        boolean boolean24 = functionType18.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType37.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType37.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType37.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = functionType30.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node43 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType30.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        int int53 = functionType51.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList65 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor66 = strComparableList65.iterator();
        boolean boolean67 = functionType59.equals((java.lang.Object) strComparableItor66);
        com.google.javascript.rhino.Node node68 = functionType59.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList69 = com.google.common.collect.ImmutableList.of(functionType5, functionType18, functionType30, functionType51, functionType59);
        boolean boolean70 = functionType30.isFunctionType();
        boolean boolean71 = functionType30.canBeCalled();
        boolean boolean72 = functionType30.isInterface();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strComparableList65);
        org.junit.Assert.assertNotNull(strComparableItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(functionTypeList69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00442");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType5.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        boolean boolean20 = functionType19.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList25 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor26 = strComparableList25.iterator();
        boolean boolean27 = functionType19.equals((java.lang.Object) strComparableItor26);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry31.createFunctionType(jSType32, jSTypeArray33);
        boolean boolean35 = functionType34.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable36 = functionType34.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node37 = null;
        boolean boolean38 = functionType19.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType34, node37);
        boolean boolean40 = functionType34.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType41 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType34);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean53 = node45.isGetElem();
        com.google.javascript.rhino.Node node54 = node45.cloneNode();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node62.setString("");
        com.google.javascript.rhino.Node node65 = node58.useSourceInfoIfMissingFromForTree(node62);
        boolean boolean66 = node58.isGetElem();
        int int68 = node58.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newExpr(node58);
        com.google.javascript.rhino.Node node70 = node45.clonePropsFrom(node58);
        boolean boolean71 = node70.isNot();
        boolean boolean72 = functionType5.defineDeclaredProperty("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) objectType41, node70);
        com.google.javascript.rhino.Node node73 = node70.getParent();
        // The following exception was thrown during execution in test generation
        try {
            double double74 = node73.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableList25);
        org.junit.Assert.assertNotNull(strComparableItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(node73);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00443");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean91 = parameterizedType89.isPropertyTypeDeclared("function (): {308555690}");
        boolean boolean92 = parameterizedType89.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo94 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean95 = jSDocInfo94.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility96 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo94.setVisibility(visibility96);
        boolean boolean98 = jSDocInfo94.isDefine();
        parameterizedType89.setPropertyJSDocInfo("function (): {1215648818}", jSDocInfo94);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + visibility96 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility96.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00444");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        int int25 = node11.getLineno();
        boolean boolean26 = node11.isRegExp();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00445");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node45 = enumType44.getSource();
        boolean boolean46 = enumType44.isNullable();
        java.util.Set<java.lang.String> strSet47 = enumType44.getElements();
        // The following exception was thrown during execution in test generation
        try {
            strSet47.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strSet47);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00446");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        int int25 = node11.getLineno();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = new com.google.javascript.rhino.JSTypeExpression(node11, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        boolean boolean28 = jSTypeExpression27.isVarArgs();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00447");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int4 = node3.getLineno();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = new com.google.javascript.rhino.JSTypeExpression(node3, "unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry11.createFunctionType(jSType12, jSTypeArray13);
        boolean boolean15 = functionType14.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType14.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.unboxesTo();
        boolean boolean19 = functionType14.removeProperty("");
        int int20 = functionType14.getMaxArguments();
        java.lang.String str21 = functionType14.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, false);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry24.createFunctionType(jSType25, jSTypeArray26);
        boolean boolean28 = functionType27.isNominalType();
        functionType14.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType27);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType35.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType35.unboxesTo();
        boolean boolean40 = functionType35.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType35.getImplicitPrototype();
        functionType14.setPrototypeBasedOn(objectType41);
        boolean boolean44 = jSTypeRegistry8.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType14, "hi!");
        java.lang.Iterable iterable45 = functionType14.getCtorImplementedInterfaces();
        boolean boolean46 = jSTypeExpression6.equals((java.lang.Object) functionType14);
        boolean boolean47 = functionType14.isInstanceType();
        java.util.Set<java.lang.String> strSet48 = functionType14.getOwnPropertyNames();
        boolean boolean49 = functionType14.isInterface();
        boolean boolean50 = functionType14.matchesNumberContext();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectType41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(iterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00448");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable12 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property15 = functionType10.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = jSTypeRegistry2.getErrorReporter();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry21.createFunctionType(jSType22, jSTypeArray23);
        boolean boolean25 = functionType24.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType44.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType44.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType48 = functionType44.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = functionType37.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean50 = functionType44.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        boolean boolean57 = functionType56.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, false);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry60.createFunctionType(jSType61, jSTypeArray62);
        boolean boolean64 = functionType63.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = functionType63.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType63.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType63.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = functionType56.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.Node node69 = functionType56.getSource();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType56.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter72 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter72, false);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry74.createFunctionType(jSType75, jSTypeArray76);
        boolean boolean78 = functionType77.isNominalType();
        int int79 = functionType77.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, false);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray84 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry82.createFunctionType(jSType83, jSTypeArray84);
        boolean boolean86 = functionType85.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList91 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor92 = strComparableList91.iterator();
        boolean boolean93 = functionType85.equals((java.lang.Object) strComparableItor92);
        com.google.javascript.rhino.Node node94 = functionType85.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList95 = com.google.common.collect.ImmutableList.of(functionType31, functionType44, functionType56, functionType77, functionType85);
        functionType85.clearCachedValues();
        boolean boolean97 = functionType85.isGlobalThisType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType98 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType24, (com.google.javascript.rhino.jstype.JSType) functionType85);
        java.lang.Iterable iterable99 = parameterizedType98.getCtorImplementedInterfaces();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(property15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNull(errorReporter17);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable65);
        org.junit.Assert.assertNull(jSType66);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(strComparableList91);
        org.junit.Assert.assertNotNull(strComparableItor92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(node94);
        org.junit.Assert.assertNotNull(functionTypeList95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(parameterizedType98);
        org.junit.Assert.assertNotNull(iterable99);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00449");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        functionType5.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.unboxesTo();
        boolean boolean31 = functionType26.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType26.getImplicitPrototype();
        functionType5.setPrototypeBasedOn(objectType32);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry36.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isNominalType();
        boolean boolean46 = jSTypeRegistry36.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node55.setString("");
        com.google.javascript.rhino.Node node58 = node51.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean59 = node51.isGetElem();
        com.google.javascript.rhino.Node node60 = node51.cloneNode();
        boolean boolean61 = node60.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = node60.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, false);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, false);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry68.createFunctionType(jSType69, jSTypeArray70);
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = functionType71.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry65.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = functionType71.getJSDocInfo();
        boolean boolean77 = functionType71.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType78 = jSTypeRegistry36.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node60, (com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.EnumType enumType79 = enumType78.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType80 = enumType79.getElementsType();
        com.google.javascript.rhino.jstype.JSType jSType82 = enumElementType80.getPropertyType("true");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair83 = functionType5.getTypesUnderEquality(jSType82);
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType5.unboxesTo();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(staticSourceFile62);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertNull(jSDocInfo73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNull(jSDocInfo75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(enumType78);
        org.junit.Assert.assertNotNull(enumType79);
        org.junit.Assert.assertNotNull(enumElementType80);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(typePair83);
        org.junit.Assert.assertNull(jSType84);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00450");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo0.hasParameterType("[, hi!, STRING hi!, STRING hi!]");
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00451");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node45 = enumType44.getSource();
        java.lang.String str46 = enumType44.toString();
        boolean boolean48 = enumType44.isPropertyTypeDeclared("[, hi!, STRING hi!, STRING hi!]");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, false);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, false);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry54.createFunctionType(jSType55, jSTypeArray56);
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = functionType57.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType60 = jSTypeRegistry51.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType57);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType57.getCtorExtendedInterfaces();
        enumType44.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType57);
        java.lang.String str63 = enumType44.getDisplayName();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}" + "'", str46, "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNull(jSDocInfo59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str63, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00452");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(40);
        boolean boolean2 = node1.isAdd();
        boolean boolean3 = node1.isThis();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00453");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.isNoCompile();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection14 = jSDocInfo12.getMarkers();
        functionType5.setJSDocInfo(jSDocInfo12);
        boolean boolean16 = jSDocInfo12.isOverride();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection17 = jSDocInfo12.getTypeNodes();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(markerCollection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeCollection17);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00454");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node8.isTry();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        com.google.javascript.rhino.Node node39 = node30.cloneNode();
        boolean boolean40 = node39.isContinue();
        com.google.javascript.rhino.Node[] nodeArray41 = new com.google.javascript.rhino.Node[] { node17, node39 };
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0, nodeArray41, 4095, 46);
        boolean boolean45 = node44.isDefaultCase();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node53.setString("");
        com.google.javascript.rhino.Node node56 = node49.useSourceInfoIfMissingFromForTree(node53);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node64.setString("");
        com.google.javascript.rhino.Node node67 = node60.useSourceInfoIfMissingFromForTree(node64);
        node64.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node77.setString("");
        com.google.javascript.rhino.Node node80 = node73.useSourceInfoIfMissingFromForTree(node77);
        boolean boolean81 = node73.isGetElem();
        int int83 = node73.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newExpr(node73);
        com.google.javascript.rhino.Node node85 = node64.srcrefTree(node84);
        java.lang.String str86 = node56.checkTreeEquals(node84);
        boolean boolean87 = node84.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node88 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(45, node8, node44, node84, node88, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodeArray41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str86, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00455");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType38, "");
        jSTypeRegistry1.setLastGeneration(false);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable44 = jSTypeRegistry1.getTypesWithProperty("([, hi!, STRING hi!, STRING hi!])");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative45 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType46 = jSTypeRegistry1.getNativeObjectType(jSTypeNative45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(jSTypeIterable44);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00456");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry8.createFunctionType(jSType9, jSTypeArray10);
        boolean boolean12 = functionType11.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType18.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType18.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = functionType11.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType18);
        boolean boolean24 = functionType18.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType37.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType37.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType37.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = functionType30.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node43 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType30.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        int int53 = functionType51.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList65 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor66 = strComparableList65.iterator();
        boolean boolean67 = functionType59.equals((java.lang.Object) strComparableItor66);
        com.google.javascript.rhino.Node node68 = functionType59.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList69 = com.google.common.collect.ImmutableList.of(functionType5, functionType18, functionType30, functionType51, functionType59);
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate70 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = functionType18.setValidator(jSTypePredicate70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strComparableList65);
        org.junit.Assert.assertNotNull(strComparableItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(functionTypeList69);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00457");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.lang.String str12 = functionType5.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        functionType5.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType26.unboxesTo();
        boolean boolean31 = functionType26.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType26.getImplicitPrototype();
        functionType5.setPrototypeBasedOn(objectType32);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry36.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isNominalType();
        boolean boolean46 = jSTypeRegistry36.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node55.setString("");
        com.google.javascript.rhino.Node node58 = node51.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean59 = node51.isGetElem();
        com.google.javascript.rhino.Node node60 = node51.cloneNode();
        boolean boolean61 = node60.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile62 = node60.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, false);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, false);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry68.createFunctionType(jSType69, jSTypeArray70);
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = functionType71.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry65.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = functionType71.getJSDocInfo();
        boolean boolean77 = functionType71.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType78 = jSTypeRegistry36.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node60, (com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.EnumType enumType79 = enumType78.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType80 = enumType79.getElementsType();
        com.google.javascript.rhino.jstype.JSType jSType82 = enumElementType80.getPropertyType("true");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair83 = functionType5.getTypesUnderEquality(jSType82);
        java.lang.String str84 = functionType5.getReferenceName();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(staticSourceFile62);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertNull(jSDocInfo73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNull(jSDocInfo75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(enumType78);
        org.junit.Assert.assertNotNull(enumType79);
        org.junit.Assert.assertNotNull(enumElementType80);
        org.junit.Assert.assertNotNull(jSType82);
        org.junit.Assert.assertNotNull(typePair83);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00458");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean17 = jSDocInfo15.hasParameterType("[, hi!, STRING hi!, STRING hi!]");
        node12.setJSDocInfo(jSDocInfo15);
        boolean boolean19 = node12.isOptionalArg();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00459");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00460");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node4);
        boolean boolean15 = node4.isNot();
        com.google.javascript.rhino.Node node16 = node4.cloneNode();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(48, node4);
        boolean boolean18 = node17.isSwitch();
        boolean boolean19 = node17.isWith();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00461");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = functionType19.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType19);
        boolean boolean23 = functionType5.isNominalType();
        functionType5.clearCachedValues();
        com.google.javascript.rhino.Node node25 = functionType5.getParametersNode();
        boolean boolean26 = node25.hasMoreThanOneChild();
        boolean boolean27 = node25.isBlock();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00462");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        boolean boolean15 = node12.isVarArgs();
        boolean boolean16 = node12.isDebugger();
        java.lang.Appendable appendable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            node12.appendStringTree(appendable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00463");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, false);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry6.createFunctionType(jSType7, jSTypeArray8);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        int int18 = functionType16.getMinArguments();
        jSTypeRegistry6.unregisterPropertyOnType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", (com.google.javascript.rhino.jstype.JSType) functionType16);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry22.createFunctionType(jSType23, jSTypeArray24);
        boolean boolean26 = functionType25.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType25.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType25.unboxesTo();
        boolean boolean30 = functionType25.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType31 = functionType25.getImplicitPrototype();
        boolean boolean32 = functionType16.differsFrom((com.google.javascript.rhino.jstype.JSType) objectType31);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        boolean boolean34 = jSTypeRegistry2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) objectType31, objectType33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = objectType31.testForEquality(jSType35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00464");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType23.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = functionType16.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node29 = functionType16.getSource();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableList41.iterator();
        boolean boolean43 = functionType35.equals((java.lang.Object) strComparableItor42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = functionType35.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType50, node53);
        boolean boolean56 = functionType50.removeProperty("Not declared as a type name");
        boolean boolean57 = functionType16.hasEqualCallType(functionType50);
        boolean boolean58 = strComparableList9.equals((java.lang.Object) functionType16);
        boolean boolean59 = functionType16.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType16.unboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, false);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry63.createFunctionType(jSType64, jSTypeArray65);
        boolean boolean67 = functionType66.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable68 = functionType66.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType66.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        functionType66.setJSDocInfo(jSDocInfo70);
        com.google.javascript.rhino.JSDocInfo jSDocInfo72 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean73 = jSDocInfo72.hasReturnType();
        boolean boolean74 = jSDocInfo72.containsDeclaration();
        functionType66.setJSDocInfo(jSDocInfo72);
        functionType16.setJSDocInfo(jSDocInfo72);
        java.util.Set<java.lang.String> strSet77 = jSDocInfo72.getParameterNames();
        java.lang.Object[] objArray78 = strSet77.toArray();
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNotNull(jSType27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(jSType60);
        org.junit.Assert.assertNotNull(jSTypeArray65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable68);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00465");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean17 = jSDocInfo15.hasParameterType("[, hi!, STRING hi!, STRING hi!]");
        node12.setJSDocInfo(jSDocInfo15);
        boolean boolean20 = jSDocInfo15.hasParameter("unknown");
        boolean boolean21 = jSDocInfo15.isNoCompile();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00466");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setItem("Not declared as a type name");
        int int3 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("function (): {283828748}");
        int int6 = stringPosition0.getStartLine();
        java.lang.String str7 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "function (): {283828748}" + "'", str7, "function (): {283828748}");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00467");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType7 = functionType5.getParameterType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean19 = node11.isGetElem();
        com.google.javascript.rhino.Node node20 = node11.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node11);
        boolean boolean22 = node11.isNot();
        functionType5.setSource(node11);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable24 = node11.children();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator25 = nodeIterable24.spliterator();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertNotNull(nodeSpliterator25);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00468");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = functionType19.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType19);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.ObjectType objectType26 = jSTypeRegistry25.createAnonymousObjectType();
        jSTypeRegistry25.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType33.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property38 = functionType33.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry25.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean40 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, jSType39);
        java.lang.String str41 = jSType39.toAnnotationString();
        boolean boolean42 = jSType39.matchesInt32Context();
        boolean boolean43 = jSType39.isInstanceType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType36);
        org.junit.Assert.assertNull(property38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(function (): ?|null)" + "'", str41, "(function (): ?|null)");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00469");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean37 = functionType33.matchesStringContext();
        boolean boolean38 = functionType33.canBeCalled();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node46.setString("");
        com.google.javascript.rhino.Node node49 = node42.useSourceInfoIfMissingFromForTree(node46);
        java.lang.String str50 = node42.toString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean52 = jSDocInfo51.hasReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility53 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo51.setVisibility(visibility53);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression55 = jSDocInfo51.getEnumParameterType();
        node42.setJSDocInfo(jSDocInfo51);
        functionType33.setJSDocInfo(jSDocInfo51);
        boolean boolean58 = functionType33.matchesNumberContext();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "STRING hi!" + "'", str50, "STRING hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + visibility53 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility53.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNull(jSTypeExpression55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00470");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1, false);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node12.setString("");
        com.google.javascript.rhino.Node node15 = node8.useSourceInfoIfMissingFromForTree(node12);
        node12.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry3.createObjectType("hi!", node12, (com.google.javascript.rhino.jstype.ObjectType) functionType23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node33.setString("");
        com.google.javascript.rhino.Node node36 = node29.useSourceInfoIfMissingFromForTree(node33);
        boolean boolean37 = node29.isGetElem();
        com.google.javascript.rhino.Node node38 = node29.cloneNode();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node46.setString("");
        com.google.javascript.rhino.Node node49 = node42.useSourceInfoIfMissingFromForTree(node46);
        boolean boolean50 = node42.isGetElem();
        int int52 = node42.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newExpr(node42);
        com.google.javascript.rhino.Node node54 = node29.clonePropsFrom(node42);
        boolean boolean55 = node54.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node54.siblings();
        boolean boolean57 = node54.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship58 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node12, node54);
        boolean boolean59 = node12.isGetterDef();
        com.google.javascript.rhino.InputId inputId60 = node12.getInputId();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile61 = node12.getStaticSourceFile();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node69.setString("");
        com.google.javascript.rhino.Node node72 = node65.useSourceInfoIfMissingFromForTree(node69);
        boolean boolean73 = node65.isGetElem();
        int int75 = node65.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newExpr(node65);
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int81 = node80.getLineno();
        boolean boolean82 = node80.isEmpty();
        com.google.javascript.rhino.InputId inputId83 = com.google.javascript.jscomp.NodeUtil.getInputId(node80);
        boolean boolean84 = node76.isEquivalentToTyped(node80);
        int int85 = node12.getIndexOfChild(node80);
        com.google.javascript.rhino.InputId inputId86 = com.google.javascript.jscomp.NodeUtil.getInputId(node12);
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(inputId60);
        org.junit.Assert.assertNull(staticSourceFile61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(inputId83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNull(inputId86);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00471");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition2 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int3 = namePosition2.getPositionOnEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition4 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int5 = namePosition4.getPositionOnEndLine();
        int int6 = namePosition4.getEndLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition7 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int8 = namePosition7.getPositionOnEndLine();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList9 = com.google.common.collect.ImmutableList.of(namePosition0, namePosition2, namePosition4, namePosition7);
        namePosition4.setPositionInformation(0, 41, 3, 30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(namePositionList9);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00472");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        node8.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        int int27 = node17.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        com.google.javascript.rhino.Node node29 = node8.srcrefTree(node28);
        int int30 = node28.getSideEffectFlags();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType31 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node43.setString("");
        com.google.javascript.rhino.Node node46 = node39.useSourceInfoIfMissingFromForTree(node43);
        node43.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, false);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry51.createFunctionType(jSType52, jSTypeArray53);
        boolean boolean55 = functionType54.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType56 = jSTypeRegistry34.createObjectType("hi!", node43, (com.google.javascript.rhino.jstype.ObjectType) functionType54);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node64.setString("");
        com.google.javascript.rhino.Node node67 = node60.useSourceInfoIfMissingFromForTree(node64);
        boolean boolean68 = node60.isGetElem();
        com.google.javascript.rhino.Node node69 = node60.cloneNode();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node77.setString("");
        com.google.javascript.rhino.Node node80 = node73.useSourceInfoIfMissingFromForTree(node77);
        boolean boolean81 = node73.isGetElem();
        int int83 = node73.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newExpr(node73);
        com.google.javascript.rhino.Node node85 = node60.clonePropsFrom(node73);
        boolean boolean86 = node85.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable87 = node85.siblings();
        boolean boolean88 = node85.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship89 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType31, node43, node85);
        boolean boolean90 = node43.isGetterDef();
        com.google.javascript.rhino.Node node91 = node43.cloneTree();
        com.google.javascript.rhino.Node node95 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int96 = node95.getLineno();
        boolean boolean97 = node95.isEmpty();
        com.google.javascript.rhino.InputId inputId98 = com.google.javascript.jscomp.NodeUtil.getInputId(node95);
        com.google.javascript.rhino.Node node99 = new com.google.javascript.rhino.Node((int) (short) 100, node28, node91, node95);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + subclassType31 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType31.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(nodeIterable87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(inputId98);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00473");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry15.createAnonymousObjectType();
        jSTypeRegistry15.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable25 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType26 = functionType23.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property28 = functionType23.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType29 = jSTypeRegistry15.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry2.getGreatestSubtypeWithProperty(jSType29, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        java.lang.String str32 = jSType31.toString();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNull(property28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "None" + "'", str32, "None");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00474");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        java.lang.Object[] objArray6 = strComparableList4.toArray();
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[, hi!, STRING hi!, STRING hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[, hi!, STRING hi!, STRING hi!]");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00475");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        node23.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry31.createFunctionType(jSType32, jSTypeArray33);
        boolean boolean35 = functionType34.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = jSTypeRegistry14.createObjectType("hi!", node23, (com.google.javascript.rhino.jstype.ObjectType) functionType34);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry14.createParametersWithVarArgs(jSTypeArray37);
        com.google.javascript.rhino.Node node39 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, false);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry42.createFunctionType(jSType43, jSTypeArray44);
        boolean boolean46 = functionType45.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList51 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor52 = strComparableList51.iterator();
        boolean boolean53 = functionType45.equals((java.lang.Object) strComparableItor52);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = functionType59.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType45.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType59);
        boolean boolean63 = functionType45.isNominalType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = functionType45.getOwnPropertyJSDocInfo("[, hi!, STRING hi!, STRING hi!]");
        com.google.javascript.rhino.jstype.StaticSlot staticSlot67 = functionType45.getSlot("unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node79.setString("");
        com.google.javascript.rhino.Node node82 = node75.useSourceInfoIfMissingFromForTree(node79);
        node79.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter85 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry87 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter85, false);
        com.google.javascript.rhino.jstype.JSType jSType88 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry87.createFunctionType(jSType88, jSTypeArray89);
        boolean boolean91 = functionType90.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry70.createObjectType("hi!", node79, (com.google.javascript.rhino.jstype.ObjectType) functionType90);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray93 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node94 = jSTypeRegistry70.createParametersWithVarArgs(jSTypeArray93);
        com.google.javascript.rhino.jstype.FunctionType functionType95 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType45, jSTypeArray93);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative97 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType98 = jSTypeRegistry2.getNativeType(jSTypeNative97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strComparableList51);
        org.junit.Assert.assertNotNull(strComparableItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertNull(jSDocInfo61);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(jSDocInfo65);
        org.junit.Assert.assertNull(staticSlot67);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(jSTypeArray93);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(functionType95);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00476");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        boolean boolean45 = node26.isGetElem();
        boolean boolean46 = node26.hasChildren();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00477");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 1, 100, (int) ' ');
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        boolean boolean15 = node7.isGetElem();
        com.google.javascript.rhino.Node node16 = node7.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node7);
        boolean boolean18 = node7.isNot();
        com.google.javascript.rhino.Node node19 = node3.useSourceInfoFromForTree(node7);
        int int20 = node7.getSourceOffset();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(staticSourceFile17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00478");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        int int5 = node4.getLineno();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node13.setString("");
        com.google.javascript.rhino.Node node16 = node9.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean17 = node9.isGetElem();
        com.google.javascript.rhino.Node node18 = node9.cloneNode();
        boolean boolean19 = node18.isContinue();
        com.google.javascript.rhino.Node node20 = node18.cloneTree();
        node20.setSourceEncodedPosition((int) (short) 10);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node20.getStaticSourceFile();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(46, node4, node20, (int) (byte) -1, (-1));
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        int int40 = node30.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newExpr(node30);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean53 = node45.isGetElem();
        com.google.javascript.rhino.Node node54 = node45.cloneNode();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node62.setString("");
        com.google.javascript.rhino.Node node65 = node58.useSourceInfoIfMissingFromForTree(node62);
        boolean boolean66 = node58.isGetElem();
        int int68 = node58.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newExpr(node58);
        com.google.javascript.rhino.Node node70 = node45.clonePropsFrom(node58);
        boolean boolean71 = node45.isGetElem();
        com.google.javascript.rhino.Node node72 = node41.useSourceInfoFrom(node45);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(40);
        boolean boolean75 = node74.isAdd();
        node72.addChildToFront(node74);
        com.google.javascript.rhino.Node node77 = node4.useSourceInfoFrom(node74);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder78 = node74.new FileLevelJsDocBuilder();
        boolean boolean79 = node74.isTypeOf();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(staticSourceFile23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00479");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        com.google.javascript.rhino.Node node14 = node5.cloneNode();
        boolean boolean15 = node14.isContinue();
        com.google.javascript.rhino.Node node16 = node14.cloneTree();
        node16.setSourceEncodedPosition((int) (short) 10);
        boolean boolean19 = node16.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        node31.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry22.createObjectType("hi!", node31, (com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node46 = jSTypeRegistry22.createParametersWithVarArgs(jSTypeArray45);
        boolean boolean47 = node46.isIn();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(52, node16, node46, 42, (int) (byte) 0);
        node16.setSourceFileForTesting("STRING hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (byte) -1, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00480");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        node3.setQuotedString();
        java.lang.Appendable appendable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            node3.appendStringTree(appendable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00481");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = functionType8.getJSDocInfo();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType13 = functionType8.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType14 = parameterizedType13.toObjectType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNull(jSDocInfo12);
        org.junit.Assert.assertNull(parameterizedType13);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00482");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType5.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType5.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType13.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNull(functionType13);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00483");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        int int41 = node31.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        com.google.javascript.rhino.Node node43 = node18.clonePropsFrom(node31);
        boolean boolean44 = node18.isGetElem();
        com.google.javascript.rhino.Node node45 = node14.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(40);
        boolean boolean48 = node47.isAdd();
        node45.addChildToFront(node47);
        boolean boolean50 = node45.isNoSideEffectsCall();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00484");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        java.lang.String str3 = ternaryValue2.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = ternaryValue4.and(ternaryValue5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue2.and(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue6.or(ternaryValue9);
        boolean boolean12 = ternaryValue6.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue13.and(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue6.xor(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue1.and(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "unknown" + "'", str3, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00485");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType20.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = functionType5.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType20, node23);
        java.util.Set<java.lang.String> strSet25 = functionType5.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType5.getParentScope();
        com.google.javascript.rhino.Node node28 = functionType5.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor42 = strComparableList41.iterator();
        boolean boolean43 = functionType35.equals((java.lang.Object) strComparableItor42);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = functionType35.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType50, node53);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot56 = functionType50.getOwnSlot("true");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable57 = functionType50.getCtorExtendedInterfaces();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node65.setString("");
        com.google.javascript.rhino.Node node68 = node61.useSourceInfoIfMissingFromForTree(node65);
        node65.setIsSyntheticBlock(false);
        boolean boolean71 = functionType5.defineSynthesizedProperty("function (): {522475926}", (com.google.javascript.rhino.jstype.JSType) functionType50, node65);
        boolean boolean72 = functionType5.isNominalType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strComparableItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot56);
        org.junit.Assert.assertNotNull(objectTypeIterable57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00486");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType5.isConstructor();
        boolean boolean19 = functionType5.isNativeObjectType();
        boolean boolean20 = functionType5.isVoidType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00487");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        boolean boolean37 = functionType33.matchesStringContext();
        boolean boolean38 = functionType33.canBeCalled();
        boolean boolean39 = functionType33.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType33.autobox();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSType40);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00488");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry14.createFunctionType(jSType15, jSTypeArray16);
        boolean boolean18 = functionType17.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType17.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType17.unboxesTo();
        boolean boolean22 = functionType17.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType23 = functionType17.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType25 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) objectType23, "unknown");
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node37.setString("");
        com.google.javascript.rhino.Node node40 = node33.useSourceInfoIfMissingFromForTree(node37);
        node37.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry45.createFunctionType(jSType46, jSTypeArray47);
        boolean boolean49 = functionType48.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry28.createObjectType("hi!", node37, (com.google.javascript.rhino.jstype.ObjectType) functionType48);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node52 = jSTypeRegistry28.createParametersWithVarArgs(jSTypeArray51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        jSTypeRegistry28.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType59);
        boolean boolean63 = functionType59.matchesStringContext();
        boolean boolean64 = functionType59.canBeCalled();
        boolean boolean65 = functionType59.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = jSType66.canAssignTo(jSType67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectType23);
        org.junit.Assert.assertNotNull(jSType25);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jSType66);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00489");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType7 = functionType5.getParameterType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        boolean boolean19 = node11.isGetElem();
        com.google.javascript.rhino.Node node20 = node11.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node11);
        boolean boolean22 = node11.isNot();
        functionType5.setSource(node11);
        boolean boolean24 = node11.isFunction();
        boolean boolean25 = node11.isAssign();
        boolean boolean26 = node11.isNot();
        boolean boolean27 = node11.isHook();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00490");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        boolean boolean46 = enumType45.matchesObjectContext();
        boolean boolean47 = enumType45.hasAnyTemplate();
        com.google.javascript.rhino.jstype.UnionType unionType48 = enumType45.toMaybeUnionType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(unionType48);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00491");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = functionType42.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType42.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection46 = jSTypeRegistry2.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        int int47 = functionType42.getMinArguments();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = functionType42.getOwnPropertyJSDocInfo("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        functionType42.clearCachedValues();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable44);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(functionTypeCollection46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(jSDocInfo49);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00492");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType9 = functionType5.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable18 = functionType16.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType16.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        functionType16.setJSDocInfo(jSDocInfo20);
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType5.resolve(errorReporter10, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType23 = functionType5.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSType22);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00493");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node10.setString("");
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoIfMissingFromForTree(node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        node21.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        int int40 = node30.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newExpr(node30);
        com.google.javascript.rhino.Node node42 = node21.srcrefTree(node41);
        java.lang.String str43 = node13.checkTreeEquals(node41);
        boolean boolean44 = node41.hasMoreThanOneChild();
        boolean boolean45 = node41.isNE();
        com.google.javascript.rhino.Node node46 = assertionFunctionSpec2.getAssertedParam(node41);
        boolean boolean47 = node46.isOnlyModifiesThisCall();
        boolean boolean48 = node46.isSetterDef();
        int int50 = node46.getIntProp(0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str43, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00494");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node((-1), nodeArray1);
        int int3 = node2.getSourceOffset();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        int int30 = node20.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        com.google.javascript.rhino.Node node32 = node11.srcrefTree(node31);
        node2.addChildToBack(node32);
        boolean boolean34 = node32.isIf();
        boolean boolean35 = node32.isObjectLit();
        org.junit.Assert.assertNotNull(nodeArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00495");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable12 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.unboxesTo();
        boolean boolean15 = functionType10.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = functionType10.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType10.dereference();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType10);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = jSTypeRegistry2.createAnonymousObjectType();
        boolean boolean21 = jSTypeRegistry2.isForwardDeclaredType("enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00496");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType20.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = functionType5.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType20, node23);
        java.util.Set<java.lang.String> strSet25 = functionType5.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType5.getParentScope();
        com.google.javascript.rhino.Node node28 = functionType5.getPropertyNode("");
        functionType5.clearResolved();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00497");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList5 = strComparableList4.reverse();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.asList();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = strComparableList6.subList((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (-1) must not be negative");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList5);
        org.junit.Assert.assertNotNull(strComparableList6);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00498");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = jSTypeRegistry2.getErrorReporter();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        boolean boolean20 = functionType19.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType19.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType19.unboxesTo();
        boolean boolean24 = functionType19.removeProperty("");
        int int25 = functionType19.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node37.setString("");
        com.google.javascript.rhino.Node node40 = node33.useSourceInfoIfMissingFromForTree(node37);
        node37.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry45.createFunctionType(jSType46, jSTypeArray47);
        boolean boolean49 = functionType48.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry28.createObjectType("hi!", node37, (com.google.javascript.rhino.jstype.ObjectType) functionType48);
        functionType19.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType48);
        com.google.javascript.rhino.Node node53 = functionType48.getPropertyNode("");
        jSTypeRegistry2.unregisterPropertyOnType("java.io.IOException: ", (com.google.javascript.rhino.jstype.JSType) functionType48);
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection56 = jSTypeRegistry2.getDirectImplementors(objectType55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNull(errorReporter12);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectType50);
        org.junit.Assert.assertNull(node53);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00499");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = functionType5.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, false);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = jSTypeRegistry10.createAnonymousObjectType();
        jSTypeRegistry10.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType18.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property23 = functionType18.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType24 = jSTypeRegistry10.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType18);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry27.createAnonymousObjectType();
        boolean boolean29 = objectType28.isNominalType();
        boolean boolean30 = jSType24.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType28);
        boolean boolean31 = functionType5.canAssignTo(jSType24);
        boolean boolean32 = functionType5.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType5.findPropertyType("function (): {605977660}");
        boolean boolean35 = functionType5.hasImplementedInterfaces();
        boolean boolean36 = functionType5.isNumber();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNull(property23);
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00500");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "function (): {1162238616}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00501");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType51.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType51.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        functionType62.setJSDocInfo(jSDocInfo66);
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType51.resolve(errorReporter56, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = enumType44.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.jstype.ObjectType.Property property71 = enumType44.getSlot("");
        boolean boolean73 = enumType44.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.FunctionType functionType74 = enumType44.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = functionType74.isOrdinaryFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNull(property71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(functionType74);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00502");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableList6.set((int) '4', (java.lang.Comparable<java.lang.String>) "{proxy:function (): {2056212234}}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00503");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean17 = jSDocInfo15.hasParameterType("[, hi!, STRING hi!, STRING hi!]");
        node12.setJSDocInfo(jSDocInfo15);
        // The following exception was thrown during execution in test generation
        try {
            node12.setSideEffectFlags((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00504");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = node14.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EXPR_RESULT is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00505");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.Node node14 = functionType5.getSource();
        boolean boolean15 = functionType5.isNumberObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType5.getBindReturnType(0);
        boolean boolean18 = functionType5.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType20 = functionType5.findPropertyType("STRING hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType5.getImplicitPrototype();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = functionType5.getOwnPropertyJSDocInfo("{proxy:function (): {1600284777}}");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNull(jSDocInfo23);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00506");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, false);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        node15.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry6.createObjectType("hi!", node15, (com.google.javascript.rhino.jstype.ObjectType) functionType26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry6.createParametersWithVarArgs(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType37.getCtorImplementedInterfaces();
        jSTypeRegistry6.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType46.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection50 = jSTypeRegistry6.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType46);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry6.createParametersWithVarArgs(jSTypeArray55);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry2.createUnionType(jSTypeArray55);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry2.createAnonymousObjectType();
        boolean boolean61 = objectType59.hasOwnProperty("function (): {1686674006}");
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertNotNull(functionTypeCollection50);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00507");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType9 = functionType5.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable18 = functionType16.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType16.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        functionType16.setJSDocInfo(jSDocInfo20);
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType5.resolve(errorReporter10, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType16);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        node34.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, false);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry42.createFunctionType(jSType43, jSTypeArray44);
        boolean boolean46 = functionType45.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = jSTypeRegistry25.createObjectType("hi!", node34, (com.google.javascript.rhino.jstype.ObjectType) functionType45);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node49 = jSTypeRegistry25.createParametersWithVarArgs(jSTypeArray48);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        boolean boolean57 = functionType56.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable58 = functionType56.getCtorImplementedInterfaces();
        jSTypeRegistry25.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType56);
        boolean boolean60 = functionType56.matchesStringContext();
        boolean boolean61 = functionType56.isFunctionType();
        boolean boolean63 = functionType56.isPropertyTypeDeclared("function (): {1479300960}");
        boolean boolean64 = functionType16.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType56);
        boolean boolean65 = functionType16.isConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNotNull(jSType9);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00508");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node45 = enumType44.getSource();
        java.lang.String str46 = enumType44.toString();
        com.google.javascript.rhino.jstype.JSType jSType48 = enumType44.getPropertyType("function (): {308555690}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = null;
        enumType44.setPropertyJSDocInfo("([, hi!, STRING hi!, STRING hi!])", jSDocInfo50);
        java.lang.String str52 = enumType44.getReferenceName();
        boolean boolean53 = enumType44.canBeCalled();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}" + "'", str46, "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}" + "'", str52, "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00509");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        boolean boolean7 = functionType5.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = functionType5.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, false);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry12.createFunctionType(jSType13, jSTypeArray14);
        boolean boolean16 = functionType15.isNominalType();
        boolean boolean17 = functionType15.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType5.forceResolve(errorReporter9, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType19 = functionType15.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSType18);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00510");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        boolean boolean30 = node29.isDebugger();
        node3.addChildToFront(node29);
        boolean boolean32 = node29.isReturn();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType33 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node45.setString("");
        com.google.javascript.rhino.Node node48 = node41.useSourceInfoIfMissingFromForTree(node45);
        node45.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        boolean boolean57 = functionType56.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = jSTypeRegistry36.createObjectType("hi!", node45, (com.google.javascript.rhino.jstype.ObjectType) functionType56);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node66.setString("");
        com.google.javascript.rhino.Node node69 = node62.useSourceInfoIfMissingFromForTree(node66);
        boolean boolean70 = node62.isGetElem();
        com.google.javascript.rhino.Node node71 = node62.cloneNode();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node79.setString("");
        com.google.javascript.rhino.Node node82 = node75.useSourceInfoIfMissingFromForTree(node79);
        boolean boolean83 = node75.isGetElem();
        int int85 = node75.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newExpr(node75);
        com.google.javascript.rhino.Node node87 = node62.clonePropsFrom(node75);
        boolean boolean88 = node87.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable89 = node87.siblings();
        boolean boolean90 = node87.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship91 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType33, node45, node87);
        boolean boolean92 = node45.isGetterDef();
        com.google.javascript.rhino.Node node93 = node29.clonePropsFrom(node45);
        // The following exception was thrown during execution in test generation
        try {
            node45.setDouble((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + subclassType33 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType33.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(nodeIterable89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00511");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node15 = node3.detachFromParent();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        boolean boolean30 = node29.isContinue();
        com.google.javascript.rhino.Node node31 = node29.cloneTree();
        node31.setSourceEncodedPosition((int) (short) 10);
        boolean boolean34 = node31.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, false);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node46.setString("");
        com.google.javascript.rhino.Node node49 = node42.useSourceInfoIfMissingFromForTree(node46);
        node46.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, false);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry54.createFunctionType(jSType55, jSTypeArray56);
        boolean boolean58 = functionType57.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry37.createObjectType("hi!", node46, (com.google.javascript.rhino.jstype.ObjectType) functionType57);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node61 = jSTypeRegistry37.createParametersWithVarArgs(jSTypeArray60);
        boolean boolean62 = node61.isIn();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(52, node31, node61, 42, (int) (byte) 0);
        com.google.javascript.rhino.Node node66 = node15.useSourceInfoFromForTree(node31);
        boolean boolean67 = node66.isDec();
        node66.setLength(38);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00512");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        boolean boolean25 = functionType22.isStringObjectType();
        com.google.javascript.rhino.Node node26 = functionType22.getRootNode();
        int int27 = functionType22.getExtendedInterfacesCount();
        boolean boolean28 = functionType22.isInterface();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00513");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder0 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder2 = nodeSourcePositionBuilder0.add((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition1);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean4 = typePosition3.hasBrackets();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder5 = nodeSourcePositionBuilder0.add((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition3);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionList6 = nodeSourcePositionBuilder5.build();
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder0);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder5);
        org.junit.Assert.assertNotNull(nodeSourcePositionList6);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00514");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        boolean boolean12 = node3.isCase();
        java.lang.String str13 = node3.getQualifiedName();
        node3.setSourceEncodedPosition(44);
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got STRING");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00515");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        com.google.javascript.rhino.Node node14 = node5.cloneNode();
        boolean boolean15 = node14.isContinue();
        com.google.javascript.rhino.Node node16 = node14.cloneTree();
        boolean boolean17 = node14.isLocalResultCall();
        typePosition1.setItem(node14);
        com.google.javascript.rhino.Node node19 = typePosition1.getItem();
        com.google.javascript.rhino.Node node20 = node19.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(10, node20, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00516");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExterns();
        boolean boolean3 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00517");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType20.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = functionType5.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType20, node23);
        java.util.Set<java.lang.String> strSet25 = functionType5.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType5.getParentScope();
        com.google.javascript.rhino.Node node28 = functionType5.getPropertyNode("");
        boolean boolean30 = functionType5.isPropertyTypeDeclared("Not declared as a constructor");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00518");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        boolean boolean28 = jSTypeRegistry2.isForwardDeclaredType("function (): {704344377}");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00519");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean3 = jSDocInfo0.hasDescriptionForParameter("hi!");
        int int4 = jSDocInfo0.getParameterCount();
        boolean boolean5 = jSDocInfo0.hasType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00520");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType19 = jSTypeRegistry16.createFunctionType(jSType17, jSTypeArray18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = functionType19.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType19);
        com.google.javascript.rhino.Node node24 = functionType5.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = functionType30.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType33 = functionType30.unboxesTo();
        boolean boolean35 = functionType30.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType30.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType30.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        boolean boolean65 = functionType59.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType66 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType59);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node74.setString("");
        com.google.javascript.rhino.Node node77 = node70.useSourceInfoIfMissingFromForTree(node74);
        boolean boolean78 = node70.isGetElem();
        com.google.javascript.rhino.Node node79 = node70.cloneNode();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node87.setString("");
        com.google.javascript.rhino.Node node90 = node83.useSourceInfoIfMissingFromForTree(node87);
        boolean boolean91 = node83.isGetElem();
        int int93 = node83.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node94 = com.google.javascript.jscomp.NodeUtil.newExpr(node83);
        com.google.javascript.rhino.Node node95 = node70.clonePropsFrom(node83);
        boolean boolean96 = node95.isNot();
        boolean boolean97 = functionType30.defineDeclaredProperty("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) objectType66, node95);
        boolean boolean98 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, (com.google.javascript.rhino.jstype.JSType) objectType66);
        boolean boolean99 = objectType66.isNumberObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertNull(jSDocInfo21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNull(jSType37);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00521");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor57 = strComparableList56.iterator();
        boolean boolean58 = functionType50.equals((java.lang.Object) strComparableItor57);
        boolean boolean59 = functionType50.isArrayType();
        boolean boolean60 = functionType50.isInterface();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType50.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, false);
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry64.createAnonymousObjectType();
        boolean boolean66 = objectType65.isNominalType();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry2.createFunctionTypeWithNewReturnType(functionType50, (com.google.javascript.rhino.jstype.JSType) objectType65);
        functionType67.clearCachedValues();
        boolean boolean70 = functionType67.isPropertyTypeDeclared("function (): {1730712169}");
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strComparableItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00522");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isDec();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 52);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        com.google.javascript.rhino.Node node44 = node35.cloneNode();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node52.setString("");
        com.google.javascript.rhino.Node node55 = node48.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean56 = node48.isGetElem();
        int int58 = node48.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node48);
        com.google.javascript.rhino.Node node60 = node35.clonePropsFrom(node48);
        boolean boolean61 = node60.isReturn();
        com.google.javascript.jscomp.CodingConvention.Bind bind62 = new com.google.javascript.jscomp.CodingConvention.Bind(node28, node31, node60);
        node31.detachChildren();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, false);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry66.createFunctionType(jSType67, jSTypeArray68);
        boolean boolean70 = functionType69.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, false);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry73.createFunctionType(jSType74, jSTypeArray75);
        boolean boolean77 = functionType76.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType76.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType76.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType76.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = functionType69.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType76);
        com.google.javascript.rhino.Node node82 = functionType69.getParametersNode();
        boolean boolean83 = node82.isNot();
        boolean boolean84 = node31.isEquivalentToTyped(node82);
        boolean boolean85 = node31.isGetProp();
        boolean boolean86 = node31.isArrayLit();
        boolean boolean87 = node31.isEmpty();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(ternaryValue81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00523");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        functionType5.setJSDocInfo(jSDocInfo9);
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        boolean boolean13 = jSDocInfo11.containsDeclaration();
        functionType5.setJSDocInfo(jSDocInfo11);
        boolean boolean15 = functionType5.isUnknownType();
        boolean boolean16 = functionType5.matchesNumberContext();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00524");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList6.parallelStream();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        int int9 = strComparableList6.indexOf((java.lang.Object) visibility8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, false);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry12.createFunctionType(jSType13, jSTypeArray14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry18.createFunctionType(jSType19, jSTypeArray20);
        boolean boolean22 = functionType21.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList27 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor28 = strComparableList27.iterator();
        boolean boolean29 = functionType21.equals((java.lang.Object) strComparableItor28);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, false);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry33.createFunctionType(jSType34, jSTypeArray35);
        boolean boolean37 = functionType36.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = functionType36.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node39 = null;
        boolean boolean40 = functionType21.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType36, node39);
        boolean boolean42 = functionType36.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry45.createFunctionType(jSType46, jSTypeArray47);
        boolean boolean49 = functionType48.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList54 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor55 = strComparableList54.iterator();
        boolean boolean56 = functionType48.equals((java.lang.Object) strComparableItor55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = functionType62.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair65 = functionType48.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean66 = jSTypeRegistry12.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType36, (com.google.javascript.rhino.jstype.ObjectType) functionType62);
        boolean boolean67 = strComparableList6.contains((java.lang.Object) functionType62);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator68 = strComparableList6.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable71 = strComparableList6.set(0, (java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + visibility8 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility8.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strComparableList27);
        org.junit.Assert.assertNotNull(strComparableItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strComparableList54);
        org.junit.Assert.assertNotNull(strComparableItor55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNull(jSDocInfo64);
        org.junit.Assert.assertNotNull(typePair65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator68);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00525");
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo1.isNoCompile();
        java.lang.String str3 = jSDocInfo1.getOriginalCommentString();
        boolean boolean4 = jSDocInfo1.isExport();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = jSDocInfo1.getVisibility();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative7 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec8 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative7);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node16.setString("");
        com.google.javascript.rhino.Node node19 = node12.useSourceInfoIfMissingFromForTree(node16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node27.setString("");
        com.google.javascript.rhino.Node node30 = node23.useSourceInfoIfMissingFromForTree(node27);
        node27.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node40.setString("");
        com.google.javascript.rhino.Node node43 = node36.useSourceInfoIfMissingFromForTree(node40);
        boolean boolean44 = node36.isGetElem();
        int int46 = node36.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newExpr(node36);
        com.google.javascript.rhino.Node node48 = node27.srcrefTree(node47);
        java.lang.String str49 = node19.checkTreeEquals(node47);
        boolean boolean50 = node47.hasMoreThanOneChild();
        boolean boolean51 = node47.isNE();
        com.google.javascript.rhino.Node node52 = assertionFunctionSpec8.getAssertedParam(node47);
        node52.setSourceEncodedPositionForTree(54);
        jSDocInfo1.setAssociatedNode(node52);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node67.setString("");
        com.google.javascript.rhino.Node node70 = node63.useSourceInfoIfMissingFromForTree(node67);
        node67.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((int) (short) -1, node52, node59, node67);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, false);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry76.createFunctionType(jSType77, jSTypeArray78);
        boolean boolean80 = functionType79.isNominalType();
        boolean boolean81 = functionType79.isInterface();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = functionType79.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, false);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createFunctionType(jSType87, jSTypeArray88);
        boolean boolean90 = functionType89.isNominalType();
        boolean boolean91 = functionType89.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType92 = functionType79.forceResolve(errorReporter83, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType89);
        node73.setJSType((com.google.javascript.rhino.jstype.JSType) functionType79);
        boolean boolean94 = node73.isIf();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(visibility5);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str49, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(jSTypeArray78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(jSDocInfo82);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00526");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation(8, (int) '#', (int) (byte) 100, (int) '#');
        stringPosition0.setItem("([, hi!, STRING hi!, STRING hi!])");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00527");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1, false);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node12.setString("");
        com.google.javascript.rhino.Node node15 = node8.useSourceInfoIfMissingFromForTree(node12);
        node12.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = jSTypeRegistry3.createObjectType("hi!", node12, (com.google.javascript.rhino.jstype.ObjectType) functionType23);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node33.setString("");
        com.google.javascript.rhino.Node node36 = node29.useSourceInfoIfMissingFromForTree(node33);
        boolean boolean37 = node29.isGetElem();
        com.google.javascript.rhino.Node node38 = node29.cloneNode();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node46.setString("");
        com.google.javascript.rhino.Node node49 = node42.useSourceInfoIfMissingFromForTree(node46);
        boolean boolean50 = node42.isGetElem();
        int int52 = node42.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newExpr(node42);
        com.google.javascript.rhino.Node node54 = node29.clonePropsFrom(node42);
        boolean boolean55 = node54.isNot();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node54.siblings();
        boolean boolean57 = node54.isOr();
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship58 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node12, node54);
        node54.setLength((int) '#');
        node54.setIsSyntheticBlock(true);
        boolean boolean63 = node54.isFromExterns();
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.MIXIN));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectType25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00528");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags11 = new com.google.javascript.rhino.Node.SideEffectFlags();
        int int12 = strComparableList4.lastIndexOf((java.lang.Object) sideEffectFlags11);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableList4.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList14 = strComparableList4.reverse();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable22 = functionType20.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType20.unboxesTo();
        boolean boolean25 = functionType20.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType26 = functionType20.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, false);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry29.createFunctionType(jSType30, jSTypeArray31);
        boolean boolean33 = functionType32.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = functionType32.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType35 = functionType32.unboxesTo();
        boolean boolean37 = functionType32.removeProperty("");
        boolean boolean39 = functionType32.isPropertyTypeDeclared("Not declared as a type name");
        boolean boolean40 = functionType20.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean41 = functionType20.isStringObjectType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = strComparableList4.remove((java.lang.Object) boolean41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertNotNull(strComparableList14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objectType26);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable34);
        org.junit.Assert.assertNull(jSType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00529");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder41 = node10.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean53 = node45.isGetElem();
        boolean boolean54 = node45.isFromExterns();
        boolean boolean55 = node45.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder56 = node45.new FileLevelJsDocBuilder();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.FileLevelJsDocBuilder> fileLevelJsDocBuilderList57 = com.google.common.collect.ImmutableList.of(fileLevelJsDocBuilder41, fileLevelJsDocBuilder56);
        fileLevelJsDocBuilder41.append("function (): {621165152}");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilderList57);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00530");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry1.getGreatestSubtypeWithProperty(jSType38, "");
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList52 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor53 = strComparableList52.iterator();
        boolean boolean54 = functionType46.equals((java.lang.Object) strComparableItor53);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, false);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry58.createFunctionType(jSType59, jSTypeArray60);
        boolean boolean62 = functionType61.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable63 = functionType61.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node64 = null;
        boolean boolean65 = functionType46.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType61, node64);
        boolean boolean67 = functionType61.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType61);
        boolean boolean69 = functionType61.matchesObjectContext();
        boolean boolean70 = functionType61.isNumberObjectType();
        boolean boolean71 = functionType61.isUnionType();
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strComparableList52);
        org.junit.Assert.assertNotNull(strComparableItor53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00531");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node7.isTry();
        com.google.javascript.rhino.Node node12 = node7.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = node12.getChildCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00532");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("STRING hi!");
        java.lang.String str2 = inputId1.getIdName();
        java.lang.String str3 = inputId1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "STRING hi!" + "'", str2, "STRING hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "InputId: STRING hi!" + "'", str3, "InputId: STRING hi!");
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00533");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType12.isObject();
        boolean boolean20 = functionType12.isPropertyTypeInferred("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.jstype.StaticSlot staticSlot22 = functionType12.getSlot("java.io.IOException: ");
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType12.findPropertyType("function (): {704344377}");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(staticSlot22);
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00534");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (byte) 100, 0, 35, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 35");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00535");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            node1.setDouble(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: STRING Named type with empty name component is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00536");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isNot();
        boolean boolean30 = node28.wasEmptyNode();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00537");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable53 = functionType51.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType55 = functionType51.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable64 = functionType62.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType62.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        functionType62.setJSDocInfo(jSDocInfo66);
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType51.resolve(errorReporter56, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = enumType44.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.jstype.ObjectType.Property property71 = enumType44.getSlot("");
        boolean boolean73 = enumType44.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.FunctionType functionType74 = enumType44.getOwnerFunction();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable53);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable64);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNull(property71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(functionType74);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00538");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        functionType5.setJSDocInfo(jSDocInfo9);
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.hasReturnType();
        boolean boolean13 = jSDocInfo11.containsDeclaration();
        functionType5.setJSDocInfo(jSDocInfo11);
        jSDocInfo11.addSuppression("unknown");
        java.lang.String str17 = jSDocInfo11.getOriginalCommentString();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00539");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        node7.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node7.srcrefTree(node27);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node36.setString("");
        com.google.javascript.rhino.Node node39 = node32.useSourceInfoIfMissingFromForTree(node36);
        boolean boolean40 = node32.isGetElem();
        int int42 = node32.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newExpr(node32);
        com.google.javascript.rhino.Node node44 = node32.detachFromParent();
        com.google.javascript.rhino.Node node45 = node28.useSourceInfoIfMissingFromForTree(node44);
        java.lang.String str46 = node44.getSourceFileName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00540");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        int int14 = node4.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        com.google.javascript.rhino.Node node16 = node4.detachFromParent();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(4, node4, 30, (int) (short) 0);
        boolean boolean20 = node4.isBreak();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00541");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList8 = functionType5.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry11.createFunctionType(jSType12, jSTypeArray13);
        boolean boolean15 = functionType14.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType14.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.unboxesTo();
        boolean boolean19 = functionType14.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType14.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType14.dereference();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        int int34 = functionType28.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, false);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry37.createFunctionType(jSType38, jSTypeArray39);
        boolean boolean41 = functionType40.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable42 = functionType40.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType40.unboxesTo();
        boolean boolean45 = functionType40.removeProperty("");
        int int46 = functionType40.getMaxArguments();
        java.lang.String str47 = functionType40.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry50.createFunctionType(jSType51, jSTypeArray52);
        boolean boolean54 = functionType53.isNominalType();
        functionType40.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType53);
        boolean boolean56 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType28, (com.google.javascript.rhino.jstype.JSType) functionType53);
        boolean boolean57 = functionType28.isNullType();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, false);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry60.createFunctionType(jSType61, jSTypeArray62);
        boolean boolean64 = functionType63.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable65 = functionType63.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType63.getRestrictedTypeGivenToBooleanOutcome(true);
        boolean boolean68 = functionType63.matchesUint32Context();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, false);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry71.createFunctionType(jSType72, jSTypeArray73);
        boolean boolean75 = functionType74.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType74.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType74.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, false);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry81.createFunctionType(jSType82, jSTypeArray83);
        boolean boolean85 = functionType84.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable86 = functionType84.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType87 = functionType84.unboxesTo();
        boolean boolean89 = functionType84.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType84.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType91 = functionType84.dereference();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList92 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.ObjectType) functionType5, (com.google.javascript.rhino.jstype.ObjectType) functionType28, (com.google.javascript.rhino.jstype.ObjectType) functionType63, (com.google.javascript.rhino.jstype.ObjectType) functionType74, objectType91);
        boolean boolean93 = functionType74.isConstructor();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot95 = functionType74.getSlot("Unknown class name");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(functionTypeList8);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable42);
        org.junit.Assert.assertNull(jSType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable65);
        org.junit.Assert.assertNotNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertNotNull(jSTypeArray83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable86);
        org.junit.Assert.assertNull(jSType87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertNotNull(objectType91);
        org.junit.Assert.assertNotNull(objectTypeList92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(staticSlot95);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00542");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node15 = node13.cloneTree();
        boolean boolean16 = node13.isLocalResultCall();
        typePosition0.setItem(node13);
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder18 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition19 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder20 = nodeSourcePositionBuilder18.add((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition19);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition21 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder22 = nodeSourcePositionBuilder18.add((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition21);
        boolean boolean23 = typePosition21.hasBrackets();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition24 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node25 = typePosition24.getItem();
        int int26 = typePosition24.getStartLine();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition27 = null;
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition28 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        typePosition28.setPositionInformation(16, 54, 54, 48);
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition34 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node42.setString("");
        com.google.javascript.rhino.Node node45 = node38.useSourceInfoIfMissingFromForTree(node42);
        boolean boolean46 = node38.isGetElem();
        com.google.javascript.rhino.Node node47 = node38.cloneNode();
        boolean boolean48 = node47.isContinue();
        com.google.javascript.rhino.Node node49 = node47.cloneTree();
        boolean boolean50 = node47.isLocalResultCall();
        typePosition34.setItem(node47);
        boolean boolean52 = typePosition34.hasBrackets();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder53 = com.google.common.collect.ImmutableList.builder();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition54 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>> nodeSourcePositionBuilder55 = nodeSourcePositionBuilder53.add((com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node>) typePosition54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node63.setString("");
        com.google.javascript.rhino.Node node66 = node59.useSourceInfoIfMissingFromForTree(node63);
        boolean boolean67 = node59.isGetElem();
        int int69 = node59.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newExpr(node59);
        com.google.javascript.rhino.Node node71 = node59.detachFromParent();
        boolean boolean72 = node59.isQuotedString();
        boolean boolean73 = node59.isNoSideEffectsCall();
        typePosition54.setItem(node59);
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.TypePosition> typePositionList75 = com.google.common.collect.ImmutableList.of(typePosition0, typePosition21, typePosition24, typePosition27, typePosition28, typePosition34, typePosition54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 3");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder18);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder20);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder53);
        org.junit.Assert.assertNotNull(nodeSourcePositionBuilder55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00543");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType31.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        functionType31.setJSDocInfo(jSDocInfo35);
        boolean boolean37 = jSDocInfo35.isHidden();
        functionType22.setPropertyJSDocInfo("", jSDocInfo35);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = jSDocInfo35.getType();
        boolean boolean40 = jSDocInfo35.hasThisType();
        boolean boolean41 = jSDocInfo35.isNoSideEffects();
        int int42 = jSDocInfo35.getExtendedInterfacesCount();
        boolean boolean43 = jSDocInfo35.hasBaseType();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00544");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode45 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode46 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode47 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode48 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode49 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode50 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode51 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode52 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode53 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeList54 = com.google.common.collect.ImmutableList.of(resolveMode45, resolveMode46, resolveMode47, resolveMode48, resolveMode49, resolveMode50, resolveMode51, resolveMode52, resolveMode53);
        jSTypeRegistry2.setResolveMode(resolveMode49);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, false);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry58.createFunctionType(jSType59, jSTypeArray60);
        boolean boolean62 = functionType61.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, false);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry65.createFunctionType(jSType66, jSTypeArray67);
        boolean boolean69 = functionType68.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = functionType68.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType68.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType72 = functionType68.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = functionType61.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType61, "");
        java.util.Set<java.lang.String> strSet76 = functionType61.getOwnPropertyNames();
        boolean boolean77 = functionType61.isEnumType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertTrue("'" + resolveMode45 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode45.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode46 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode46.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode47 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode47.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode48 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode48.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode49 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode49.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode50 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode50.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode51 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode51.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode52 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode52.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode53 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode53.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList54);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00545");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean90 = parameterizedType89.isInstanceType();
        com.google.javascript.rhino.jstype.TemplateType templateType91 = parameterizedType89.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.EnumType enumType92 = parameterizedType89.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = enumType92.hasAnyTemplate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(templateType91);
        org.junit.Assert.assertNull(enumType92);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00546");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableItor12.next();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00547");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = jSTypeRegistry14.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry18.createFunctionType(jSType19, jSTypeArray20);
        boolean boolean22 = functionType21.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable23 = functionType21.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType21.unboxesTo();
        boolean boolean26 = functionType21.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType21.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType21.getIndexType();
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType21.getIndexType();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, false);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry32.createFunctionType(jSType33, jSTypeArray34);
        boolean boolean36 = functionType35.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable37 = functionType35.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType38 = functionType35.unboxesTo();
        boolean boolean40 = functionType35.removeProperty("");
        int int41 = functionType35.getMaxArguments();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry44.createFunctionType(jSType45, jSTypeArray46);
        boolean boolean48 = functionType47.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable49 = functionType47.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType47.unboxesTo();
        boolean boolean52 = functionType47.removeProperty("");
        int int53 = functionType47.getMaxArguments();
        java.lang.String str54 = functionType47.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry57.createFunctionType(jSType58, jSTypeArray59);
        boolean boolean61 = functionType60.isNominalType();
        functionType47.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType60);
        boolean boolean63 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType35, (com.google.javascript.rhino.jstype.JSType) functionType60);
        boolean boolean64 = functionType35.isNullType();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> jSTypeList65 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.JSType) functionType21, (com.google.javascript.rhino.jstype.JSType) functionType35);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType15, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList65);
        com.google.javascript.rhino.jstype.ObjectType objectType67 = objectType15.getImplicitPrototype();
        boolean boolean68 = objectType15.isString();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable23);
        org.junit.Assert.assertNull(jSType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable37);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable49);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSTypeList65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00548");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean91 = parameterizedType89.isPropertyTypeDeclared("function (): {308555690}");
        boolean boolean92 = parameterizedType89.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType89.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType95 = parameterizedType89.getPropertyType("function (): {308555690}");
        com.google.javascript.rhino.jstype.ObjectType objectType96 = parameterizedType89.getTypeOfThis();
        objectType96.clearCachedValues();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNotNull(objectType96);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00549");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean12 = node4.isGetElem();
        com.google.javascript.rhino.Node node13 = node4.cloneNode();
        boolean boolean14 = node13.isContinue();
        com.google.javascript.rhino.Node node15 = node13.cloneTree();
        node15.setSourceEncodedPosition((int) (short) 10);
        boolean boolean18 = node15.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node30.setString("");
        com.google.javascript.rhino.Node node33 = node26.useSourceInfoIfMissingFromForTree(node30);
        node30.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        boolean boolean42 = functionType41.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = jSTypeRegistry21.createObjectType("hi!", node30, (com.google.javascript.rhino.jstype.ObjectType) functionType41);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node45 = jSTypeRegistry21.createParametersWithVarArgs(jSTypeArray44);
        boolean boolean46 = node45.isIn();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(52, node15, node45, 42, (int) (byte) 0);
        boolean boolean50 = node15.isContinue();
        boolean boolean51 = node15.isGetProp();
        com.google.javascript.rhino.Node node52 = node15.getFirstChild();
        boolean boolean53 = node15.isDelProp();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node61.setString("");
        com.google.javascript.rhino.Node node64 = node57.useSourceInfoIfMissingFromForTree(node61);
        boolean boolean65 = node57.isGetElem();
        com.google.javascript.rhino.Node node66 = node57.cloneNode();
        boolean boolean67 = node66.isContinue();
        com.google.javascript.rhino.Node node68 = node66.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean71 = jSDocInfo69.hasParameterType("[, hi!, STRING hi!, STRING hi!]");
        node66.setJSDocInfo(jSDocInfo69);
        com.google.javascript.rhino.Node node73 = node15.useSourceInfoIfMissingFromForTree(node66);
        com.google.javascript.rhino.Node node74 = node15.detachFromParent();
        java.lang.String str75 = node15.getString();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objectType43);
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00550");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        com.google.javascript.rhino.Node node14 = node5.cloneNode();
        boolean boolean15 = node14.isContinue();
        com.google.javascript.rhino.Node node16 = node14.cloneTree();
        node16.setSourceEncodedPosition((int) (short) 10);
        boolean boolean19 = node16.isSetterDef();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        node31.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, false);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry39.createFunctionType(jSType40, jSTypeArray41);
        boolean boolean43 = functionType42.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType44 = jSTypeRegistry22.createObjectType("hi!", node31, (com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node46 = jSTypeRegistry22.createParametersWithVarArgs(jSTypeArray45);
        boolean boolean47 = node46.isIn();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(52, node16, node46, 42, (int) (byte) 0);
        boolean boolean51 = node16.isContinue();
        boolean boolean52 = node16.isGetProp();
        com.google.javascript.rhino.Node node53 = node16.getFirstChild();
        boolean boolean54 = node16.isDelProp();
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node62.setString("");
        com.google.javascript.rhino.Node node65 = node58.useSourceInfoIfMissingFromForTree(node62);
        boolean boolean66 = node58.isGetElem();
        com.google.javascript.rhino.Node node67 = node58.cloneNode();
        boolean boolean68 = node67.isContinue();
        com.google.javascript.rhino.Node node69 = node67.cloneTree();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean72 = jSDocInfo70.hasParameterType("[, hi!, STRING hi!, STRING hi!]");
        node67.setJSDocInfo(jSDocInfo70);
        com.google.javascript.rhino.Node node74 = node16.useSourceInfoIfMissingFromForTree(node67);
        typePosition0.setItem(node67);
        boolean boolean76 = typePosition0.hasBrackets();
        int int77 = typePosition0.getEndLine();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00551");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry8.createFunctionType(jSType9, jSTypeArray10);
        boolean boolean12 = functionType11.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry15.createFunctionType(jSType16, jSTypeArray17);
        boolean boolean19 = functionType18.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable20 = functionType18.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType18.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType18.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = functionType11.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType18);
        boolean boolean24 = functionType18.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType37.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType40 = functionType37.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType37.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = functionType30.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.Node node43 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType30.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        boolean boolean52 = functionType51.isNominalType();
        int int53 = functionType51.getPropertiesCount();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList65 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor66 = strComparableList65.iterator();
        boolean boolean67 = functionType59.equals((java.lang.Object) strComparableItor66);
        com.google.javascript.rhino.Node node68 = functionType59.getSource();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.FunctionType> functionTypeList69 = com.google.common.collect.ImmutableList.of(functionType5, functionType18, functionType30, functionType51, functionType59);
        boolean boolean70 = functionType51.matchesInt32Context();
        boolean boolean71 = functionType51.isConstructor();
        boolean boolean73 = functionType51.isPropertyTypeInferred("function (): {308555690}");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable20);
        org.junit.Assert.assertNull(jSType21);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strComparableList65);
        org.junit.Assert.assertNotNull(strComparableItor66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(functionTypeList69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00552");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.rhino.Node node15 = node3.detachFromParent();
        boolean boolean16 = node3.isQuotedString();
        boolean boolean17 = node3.isNoSideEffectsCall();
        boolean boolean18 = node3.isSyntheticBlock();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = new com.google.javascript.rhino.JSTypeExpression(node3, "function (): {522475926}");
        boolean boolean21 = jSTypeExpression20.isVarArgs();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00553");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        com.google.javascript.rhino.Node node14 = node5.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node5);
        boolean boolean16 = node5.isTypeOf();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node24.setString("");
        com.google.javascript.rhino.Node node27 = node20.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean28 = node20.isGetElem();
        com.google.javascript.rhino.Node node29 = node20.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node20);
        boolean boolean31 = node20.isTypeOf();
        boolean boolean32 = node5.hasChild(node20);
        com.google.javascript.rhino.Node node33 = node5.cloneTree();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0, node1, node5, node35, 39, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(staticSourceFile15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(staticSourceFile30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00554");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00555");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable12 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property15 = functionType10.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, false);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry22.createFunctionType(jSType23, jSTypeArray24);
        boolean boolean26 = functionType25.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType25.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType25.unboxesTo();
        boolean boolean30 = functionType25.removeProperty("");
        int int31 = functionType25.getMaxArguments();
        java.lang.String str32 = functionType25.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry35.createFunctionType(jSType36, jSTypeArray37);
        boolean boolean39 = functionType38.isNominalType();
        functionType25.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType38);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType46.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.unboxesTo();
        boolean boolean51 = functionType46.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType52 = functionType46.getImplicitPrototype();
        functionType25.setPrototypeBasedOn(objectType52);
        boolean boolean55 = jSTypeRegistry19.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType25, "hi!");
        java.lang.Iterable iterable56 = functionType25.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node64.setString("");
        com.google.javascript.rhino.Node node67 = node60.useSourceInfoIfMissingFromForTree(node64);
        boolean boolean68 = node60.isGetElem();
        com.google.javascript.rhino.Node node69 = node60.cloneNode();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node77.setString("");
        com.google.javascript.rhino.Node node80 = node73.useSourceInfoIfMissingFromForTree(node77);
        boolean boolean81 = node73.isGetElem();
        int int83 = node73.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newExpr(node73);
        com.google.javascript.rhino.Node node85 = node60.clonePropsFrom(node73);
        boolean boolean86 = functionType10.defineSynthesizedProperty("unknown", (com.google.javascript.rhino.jstype.JSType) functionType25, node60);
        boolean boolean87 = functionType25.matchesUint32Context();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(property15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectType52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(iterable56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00556");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ParameterizedType> parameterizedTypeBuilder0 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.ParameterizedType>();
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00557");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function (): {605977660}");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        node9.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        int int28 = node18.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newExpr(node18);
        com.google.javascript.rhino.Node node30 = node9.srcrefTree(node29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, false);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType39.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType42 = jSTypeRegistry33.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType39);
        jSTypeRegistry33.forwardDeclareType("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor57 = strComparableList56.iterator();
        boolean boolean58 = functionType50.equals((java.lang.Object) strComparableItor57);
        com.google.javascript.rhino.Node node59 = functionType50.getSource();
        boolean boolean60 = functionType50.isNumberObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType62 = functionType50.getBindReturnType(0);
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry33.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.jstype.JSType jSType64 = assertionFunctionSpec1.getAssertedType(node30, jSTypeRegistry33);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable65 = node30.getAncestors();
        java.lang.String str66 = node30.toStringTree();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strComparableItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNotNull(jSType63);
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertNotNull(ancestorIterable65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "STRING \n" + "'", str66, "STRING \n");
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00558");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, false);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray6 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType7 = jSTypeRegistry4.createFunctionType(jSType5, jSTypeArray6);
        boolean boolean8 = functionType7.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable9 = functionType7.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType7.unboxesTo();
        boolean boolean12 = functionType7.removeProperty("");
        int int13 = functionType7.getMaxArguments();
        java.lang.String str14 = functionType7.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, false);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry17.createFunctionType(jSType18, jSTypeArray19);
        boolean boolean21 = functionType20.isNominalType();
        functionType7.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType20);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable30 = functionType28.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType28.unboxesTo();
        boolean boolean33 = functionType28.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType34 = functionType28.getImplicitPrototype();
        functionType7.setPrototypeBasedOn(objectType34);
        boolean boolean37 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType7, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node54.setString("");
        com.google.javascript.rhino.Node node57 = node50.useSourceInfoIfMissingFromForTree(node54);
        node54.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, false);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry62.createFunctionType(jSType63, jSTypeArray64);
        boolean boolean66 = functionType65.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = jSTypeRegistry45.createObjectType("hi!", node54, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        com.google.javascript.rhino.jstype.ObjectType objectType68 = jSTypeRegistry1.createObjectType("", node42, (com.google.javascript.rhino.jstype.ObjectType) functionType65);
        boolean boolean69 = functionType65.isNominalType();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, false);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry72.createFunctionType(jSType73, jSTypeArray74);
        boolean boolean76 = functionType75.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList81 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor82 = strComparableList81.iterator();
        boolean boolean83 = functionType75.equals((java.lang.Object) strComparableItor82);
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, false);
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry86.createFunctionType(jSType87, jSTypeArray88);
        com.google.javascript.rhino.JSDocInfo jSDocInfo91 = functionType89.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair92 = functionType75.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType89);
        boolean boolean93 = functionType75.isNominalType();
        functionType65.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType75);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType95 = functionType75.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray6);
        org.junit.Assert.assertNotNull(functionType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objectType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strComparableList81);
        org.junit.Assert.assertNotNull(strComparableItor82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(jSDocInfo91);
        org.junit.Assert.assertNotNull(typePair92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00559");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableList4.iterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList4.reverse();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableList6.parallelStream();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        int int9 = strComparableList6.indexOf((java.lang.Object) visibility8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, false);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry12.createFunctionType(jSType13, jSTypeArray14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, false);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry18.createFunctionType(jSType19, jSTypeArray20);
        boolean boolean22 = functionType21.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList27 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor28 = strComparableList27.iterator();
        boolean boolean29 = functionType21.equals((java.lang.Object) strComparableItor28);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, false);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry33.createFunctionType(jSType34, jSTypeArray35);
        boolean boolean37 = functionType36.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = functionType36.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node39 = null;
        boolean boolean40 = functionType21.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType36, node39);
        boolean boolean42 = functionType36.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry45.createFunctionType(jSType46, jSTypeArray47);
        boolean boolean49 = functionType48.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList54 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor55 = strComparableList54.iterator();
        boolean boolean56 = functionType48.equals((java.lang.Object) strComparableItor55);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = functionType62.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair65 = functionType48.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean66 = jSTypeRegistry12.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType36, (com.google.javascript.rhino.jstype.ObjectType) functionType62);
        boolean boolean67 = strComparableList6.contains((java.lang.Object) functionType62);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator68 = strComparableList6.spliterator();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList69 = strComparableList6.reverse();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable71 = strComparableList6.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableList6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + visibility8 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility8.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strComparableList27);
        org.junit.Assert.assertNotNull(strComparableItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strComparableList54);
        org.junit.Assert.assertNotNull(strComparableItor55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertNull(jSDocInfo64);
        org.junit.Assert.assertNotNull(typePair65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator68);
        org.junit.Assert.assertNotNull(strComparableList69);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00560");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) -1, "true");
        boolean boolean3 = node2.isBlock();
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node2);
        boolean boolean5 = node2.isFromExterns();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00561");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, false);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry28.createFunctionType(jSType29, jSTypeArray30);
        boolean boolean32 = functionType31.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable33 = functionType31.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        functionType31.setJSDocInfo(jSDocInfo35);
        boolean boolean37 = jSDocInfo35.isHidden();
        functionType22.setPropertyJSDocInfo("", jSDocInfo35);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = jSDocInfo35.getType();
        boolean boolean40 = jSDocInfo35.hasReturnType();
        boolean boolean41 = jSDocInfo35.isConstant();
        java.util.Collection<java.lang.String> strCollection42 = jSDocInfo35.getReferences();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable33);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSTypeExpression39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(strCollection42);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00562");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((int) (short) 1, 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00563");
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec1 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("hi!");
        java.lang.String str2 = assertionFunctionSpec1.getFunctionName();
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node10.setString("");
        com.google.javascript.rhino.Node node13 = node6.useSourceInfoIfMissingFromForTree(node10);
        boolean boolean14 = node6.isGetElem();
        com.google.javascript.rhino.Node node15 = node6.cloneNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean27 = node19.isGetElem();
        int int29 = node19.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newExpr(node19);
        com.google.javascript.rhino.Node node31 = node6.clonePropsFrom(node19);
        boolean boolean32 = node6.isGetElem();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, false);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry38.createFunctionType(jSType39, jSTypeArray40);
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = functionType41.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry35.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        boolean boolean51 = functionType50.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable52 = functionType50.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType53 = functionType50.unboxesTo();
        boolean boolean55 = functionType50.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType56 = functionType50.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry35.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) objectType56, "unknown");
        com.google.javascript.rhino.jstype.JSType jSType59 = assertionFunctionSpec1.getAssertedType(node6, jSTypeRegistry35);
        boolean boolean61 = jSTypeRegistry35.hasNamespace("function (): {308555690}");
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry35.getType("function (): {605977660}");
        jSTypeRegistry35.forwardDeclareType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry35.overwriteDeclaredType("", jSType67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNull(jSDocInfo43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable52);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectType56);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNull(jSType59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jSType63);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00564");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        boolean boolean7 = functionType5.isDateType();
        boolean boolean8 = functionType5.isResolved();
        com.google.javascript.rhino.Node node10 = functionType5.getPropertyNode("[, hi!, STRING hi!, STRING hi!]");
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry13.createFunctionType(jSType14, jSTypeArray15);
        boolean boolean17 = functionType16.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList22 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor23 = strComparableList22.iterator();
        boolean boolean24 = functionType16.equals((java.lang.Object) strComparableItor23);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = functionType30.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair33 = functionType16.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry36.createAnonymousObjectType();
        jSTypeRegistry36.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable46 = functionType44.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType47 = functionType44.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property49 = functionType44.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry36.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean51 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType16, jSType50);
        boolean boolean52 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType5, (com.google.javascript.rhino.jstype.JSType) functionType16);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, false);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray57 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry55.createFunctionType(jSType56, jSTypeArray57);
        boolean boolean59 = functionType58.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList64 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor65 = strComparableList64.iterator();
        boolean boolean66 = functionType58.equals((java.lang.Object) strComparableItor65);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, false);
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry69.createFunctionType(jSType70, jSTypeArray71);
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = functionType72.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair75 = functionType58.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType72);
        boolean boolean76 = functionType58.isNominalType();
        functionType58.clearCachedValues();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable78 = functionType58.getAllExtendedInterfaces();
        boolean boolean79 = functionType16.canAssignTo((com.google.javascript.rhino.jstype.JSType) functionType58);
        int int80 = functionType16.getMinArguments();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableList22);
        org.junit.Assert.assertNotNull(strComparableItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNull(jSDocInfo32);
        org.junit.Assert.assertNotNull(typePair33);
        org.junit.Assert.assertNotNull(objectType37);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable46);
        org.junit.Assert.assertNull(jSType47);
        org.junit.Assert.assertNull(property49);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strComparableList64);
        org.junit.Assert.assertNotNull(strComparableItor65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNull(jSDocInfo74);
        org.junit.Assert.assertNotNull(typePair75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00565");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList8 = functionType5.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, false);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry11.createFunctionType(jSType12, jSTypeArray13);
        boolean boolean15 = functionType14.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable16 = functionType14.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType14.unboxesTo();
        boolean boolean19 = functionType14.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = functionType14.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = functionType14.dereference();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair22 = functionType5.getTypesUnderShallowInequality((com.google.javascript.rhino.jstype.JSType) objectType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = objectType21.getIndexType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = objectType21.getImplicitPrototype();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(functionTypeList8);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectType20);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(typePair22);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(objectType24);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00566");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("function (): {1672370403}");
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(0, 47, 0, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-char: 47?end-char: 30");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00567");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        boolean boolean45 = enumType44.matchesStringContext();
        boolean boolean46 = enumType44.matchesNumberContext();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, false);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry50.createFunctionType(jSType51, jSTypeArray52);
        boolean boolean54 = functionType53.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable55 = functionType53.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType53.getRestrictedTypeGivenToBooleanOutcome(true);
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, false);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry60.createFunctionType(jSType61, jSTypeArray62);
        boolean boolean64 = functionType63.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry67 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65, false);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry67.createFunctionType(jSType68, jSTypeArray69);
        boolean boolean71 = functionType70.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = functionType70.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType73 = functionType70.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType70.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = functionType63.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType70);
        boolean boolean76 = functionType70.isObject();
        boolean boolean78 = functionType70.isPropertyTypeInferred("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType53.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType70);
        com.google.javascript.rhino.jstype.JSType jSType80 = enumType44.forceResolve(errorReporter47, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType53);
        boolean boolean81 = enumType44.isEmptyType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable55);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertNull(jSType73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00568");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry8.createFunctionType(jSType9, jSTypeArray10);
        boolean boolean12 = functionType11.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList17 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableList17.iterator();
        boolean boolean19 = functionType11.equals((java.lang.Object) strComparableItor18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = functionType11.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType26, node29);
        boolean boolean32 = functionType26.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry35.createFunctionType(jSType36, jSTypeArray37);
        boolean boolean39 = functionType38.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList44 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor45 = strComparableList44.iterator();
        boolean boolean46 = functionType38.equals((java.lang.Object) strComparableItor45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, false);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry49.createFunctionType(jSType50, jSTypeArray51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = functionType52.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair55 = functionType38.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType52);
        boolean boolean56 = jSTypeRegistry2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType26, (com.google.javascript.rhino.jstype.ObjectType) functionType52);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry2.getType("Not declared as a type name");
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = jSTypeRegistry2.getErrorReporter();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableList17);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strComparableList44);
        org.junit.Assert.assertNotNull(strComparableItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNull(jSDocInfo54);
        org.junit.Assert.assertNotNull(typePair55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(jSType58);
        org.junit.Assert.assertNull(errorReporter60);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00569");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = functionType5.getTemplateTypeNames();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType5.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00570");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.jstype.JSType jSType12 = functionType8.autobox();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType8.getConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNull(functionType14);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00571");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList4 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList9 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        boolean boolean10 = strComparableList4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList9);
        boolean boolean12 = strComparableList9.equals((java.lang.Object) 10.0f);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, false);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = jSTypeRegistry15.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry20.createFunctionType(jSType21, jSTypeArray22);
        boolean boolean24 = functionType23.isNominalType();
        boolean boolean25 = jSTypeRegistry15.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node34.setString("");
        com.google.javascript.rhino.Node node37 = node30.useSourceInfoIfMissingFromForTree(node34);
        boolean boolean38 = node30.isGetElem();
        com.google.javascript.rhino.Node node39 = node30.cloneNode();
        boolean boolean40 = node39.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = node39.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, false);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry47.createFunctionType(jSType48, jSTypeArray49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = functionType50.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry44.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = functionType50.getJSDocInfo();
        boolean boolean56 = functionType50.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType57 = jSTypeRegistry15.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node39, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.Node node58 = enumType57.getSource();
        java.lang.String str59 = enumType57.toString();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType60 = enumType57.getElementsType();
        com.google.javascript.rhino.jstype.JSType jSType61 = enumElementType60.autoboxesTo();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = enumElementType60.getImplicitPrototype();
        java.lang.Class<?> wildcardClass63 = enumElementType60.getClass();
        boolean boolean64 = strComparableList9.contains((java.lang.Object) enumElementType60);
        java.util.Collection<java.lang.Comparable<java.lang.String>> strComparableCollection65 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean66 = strComparableList9.retainAll(strComparableCollection65);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList4);
        org.junit.Assert.assertNotNull(strComparableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType16);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(staticSourceFile41);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertNull(jSDocInfo52);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNull(jSDocInfo54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(enumType57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}" + "'", str59, "enum{Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n}");
        org.junit.Assert.assertNotNull(enumElementType60);
        org.junit.Assert.assertNull(jSType61);
        org.junit.Assert.assertNull(objectType62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00572");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList11 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList11.iterator();
        boolean boolean13 = functionType5.equals((java.lang.Object) strComparableItor12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.hasReturnType();
        boolean boolean17 = jSDocInfo15.containsDeclaration();
        functionType5.setPropertyJSDocInfo("STRING hi!", jSDocInfo15);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType5.getOwnImplementedInterfaces();
        com.google.javascript.rhino.Node node20 = functionType5.getRootNode();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = functionType26.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.jstype.ObjectType objectType32 = jSTypeRegistry31.createAnonymousObjectType();
        jSTypeRegistry31.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, false);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry36.createFunctionType(jSType37, jSTypeArray38);
        boolean boolean40 = functionType39.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType39.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType39.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property44 = functionType39.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry31.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.ObjectType objectType49 = jSTypeRegistry48.createAnonymousObjectType();
        boolean boolean50 = objectType49.isNominalType();
        boolean boolean51 = jSType45.canAssignTo((com.google.javascript.rhino.jstype.JSType) objectType49);
        boolean boolean52 = functionType26.canAssignTo(jSType45);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, false);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry57.createFunctionType(jSType58, jSTypeArray59);
        boolean boolean61 = functionType60.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable62 = functionType60.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType63 = functionType60.unboxesTo();
        boolean boolean65 = functionType60.removeProperty("");
        int int66 = functionType60.getMaxArguments();
        java.lang.String str67 = functionType60.getDisplayName();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isNominalType();
        functionType60.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType73);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, false);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType81 = jSTypeRegistry78.createFunctionType(jSType79, jSTypeArray80);
        boolean boolean82 = functionType81.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable83 = functionType81.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType81.unboxesTo();
        boolean boolean86 = functionType81.removeProperty("");
        com.google.javascript.rhino.jstype.ObjectType objectType87 = functionType81.getImplicitPrototype();
        functionType60.setPrototypeBasedOn(objectType87);
        boolean boolean90 = jSTypeRegistry54.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) functionType60, "hi!");
        boolean boolean91 = functionType60.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue92 = functionType26.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType60);
        com.google.javascript.rhino.jstype.JSType jSType93 = functionType5.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType26);
        boolean boolean94 = jSType93.isOrdinaryFunction();
        boolean boolean95 = jSType93.canBeCalled();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableList11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNull(property44);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(objectType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable62);
        org.junit.Assert.assertNull(jSType63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable83);
        org.junit.Assert.assertNull(jSType84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(ternaryValue92);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00573");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00574");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, false);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray10 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry8.createFunctionType(jSType9, jSTypeArray10);
        boolean boolean12 = functionType11.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList17 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableList17.iterator();
        boolean boolean19 = functionType11.equals((java.lang.Object) strComparableItor18);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable28 = functionType26.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = functionType11.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType26, node29);
        boolean boolean32 = functionType26.removeProperty("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, false);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry35.createFunctionType(jSType36, jSTypeArray37);
        boolean boolean39 = functionType38.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList44 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor45 = strComparableList44.iterator();
        boolean boolean46 = functionType38.equals((java.lang.Object) strComparableItor45);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, false);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry49.createFunctionType(jSType50, jSTypeArray51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = functionType52.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType.TypePair typePair55 = functionType38.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType52);
        boolean boolean56 = jSTypeRegistry2.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType26, (com.google.javascript.rhino.jstype.ObjectType) functionType52);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry2.getType("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, false);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry61.createFunctionType(jSType62, jSTypeArray63);
        boolean boolean65 = functionType64.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType64.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType64.unboxesTo();
        boolean boolean69 = functionType64.removeProperty("");
        boolean boolean71 = functionType64.isPropertyTypeDeclared("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType72 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType64);
        boolean boolean73 = functionType64.isNumberObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableList17);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strComparableList44);
        org.junit.Assert.assertNotNull(strComparableItor45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNull(jSDocInfo54);
        org.junit.Assert.assertNotNull(typePair55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(jSType58);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00575");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable12 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType10.unboxesTo();
        com.google.javascript.rhino.jstype.ObjectType.Property property15 = functionType10.getSlot("unknown");
        com.google.javascript.rhino.jstype.JSType jSType16 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType10.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType10, "function (): {1386872197}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = objectType19.isUnknownType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(property15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNull(objectType19);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00576");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = functionType8.getJSDocInfo();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType8.toObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNull(jSDocInfo12);
        org.junit.Assert.assertNotNull(objectType13);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00577");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node8.setString("");
        com.google.javascript.rhino.Node node11 = node4.useSourceInfoIfMissingFromForTree(node8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node19.setString("");
        com.google.javascript.rhino.Node node22 = node15.useSourceInfoIfMissingFromForTree(node19);
        node19.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node32.setString("");
        com.google.javascript.rhino.Node node35 = node28.useSourceInfoIfMissingFromForTree(node32);
        boolean boolean36 = node28.isGetElem();
        int int38 = node28.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newExpr(node28);
        com.google.javascript.rhino.Node node40 = node19.srcrefTree(node39);
        java.lang.String str41 = node11.checkTreeEquals(node39);
        boolean boolean42 = node39.hasMoreThanOneChild();
        node39.setCharno(37);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1), node39, (int) (byte) -1, 36);
        boolean boolean48 = node47.isAssignAdd();
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node50 = node47.useSourceInfoIfMissingFrom(node49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str41, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00578");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        boolean boolean10 = functionType5.removeProperty("");
        int int11 = functionType5.getMaxArguments();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList12 = functionType5.getSubTypes();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType5.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, false);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = jSTypeRegistry16.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, false);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType24 = jSTypeRegistry21.createFunctionType(jSType22, jSTypeArray23);
        boolean boolean25 = functionType24.isNominalType();
        boolean boolean26 = jSTypeRegistry16.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType24);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node35.setString("");
        com.google.javascript.rhino.Node node38 = node31.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean39 = node31.isGetElem();
        com.google.javascript.rhino.Node node40 = node31.cloneNode();
        boolean boolean41 = node40.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile42 = node40.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, false);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, false);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry48.createFunctionType(jSType49, jSTypeArray50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = functionType51.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType54 = jSTypeRegistry45.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = functionType51.getJSDocInfo();
        boolean boolean57 = functionType51.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType58 = jSTypeRegistry16.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node40, (com.google.javascript.rhino.jstype.JSType) functionType51);
        com.google.javascript.rhino.Node node59 = enumType58.getSource();
        boolean boolean61 = enumType58.removeProperty("function (): {621165152}");
        com.google.javascript.rhino.jstype.JSType jSType62 = enumType58.collapseUnion();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType63 = enumType58.getElementsType();
        boolean boolean64 = functionType5.canAssignTo((com.google.javascript.rhino.jstype.JSType) enumType58);
        boolean boolean65 = enumType58.matchesNumberContext();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(functionTypeList12);
        org.junit.Assert.assertNull(functionType13);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(staticSourceFile42);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNull(jSDocInfo53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNull(jSDocInfo55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(enumType58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(enumElementType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00579");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder41 = node10.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean53 = node45.isGetElem();
        boolean boolean54 = node45.isFromExterns();
        boolean boolean55 = node45.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder56 = node45.new FileLevelJsDocBuilder();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.FileLevelJsDocBuilder> fileLevelJsDocBuilderList57 = com.google.common.collect.ImmutableList.of(fileLevelJsDocBuilder41, fileLevelJsDocBuilder56);
        fileLevelJsDocBuilder56.append("function (): {957460694}");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilderList57);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00580");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        boolean boolean7 = functionType5.isDateType();
        com.google.javascript.rhino.Node node9 = functionType5.getPropertyNode("STRING hi!");
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00581");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 41, 16, 15);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00582");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node20.setString("");
        com.google.javascript.rhino.Node node23 = node16.useSourceInfoIfMissingFromForTree(node20);
        boolean boolean24 = node16.isGetElem();
        int int26 = node16.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        com.google.javascript.rhino.Node node28 = node3.clonePropsFrom(node16);
        boolean boolean29 = node28.isDec();
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 52);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        com.google.javascript.rhino.Node node44 = node35.cloneNode();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node52.setString("");
        com.google.javascript.rhino.Node node55 = node48.useSourceInfoIfMissingFromForTree(node52);
        boolean boolean56 = node48.isGetElem();
        int int58 = node48.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node48);
        com.google.javascript.rhino.Node node60 = node35.clonePropsFrom(node48);
        boolean boolean61 = node60.isReturn();
        com.google.javascript.jscomp.CodingConvention.Bind bind62 = new com.google.javascript.jscomp.CodingConvention.Bind(node28, node31, node60);
        boolean boolean63 = node28.isBreak();
        boolean boolean64 = node28.isSetterDef();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean66 = jSDocInfo65.isNoCompile();
        java.lang.String str67 = jSDocInfo65.getOriginalCommentString();
        boolean boolean68 = jSDocInfo65.hasBaseType();
        java.util.Set<java.lang.String> strSet69 = jSDocInfo65.getSuppressions();
        int int70 = strSet69.size();
        node28.setDirectives(strSet69);
        boolean boolean72 = strSet69.isEmpty();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00583");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, false);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node15.setString("");
        com.google.javascript.rhino.Node node18 = node11.useSourceInfoIfMissingFromForTree(node15);
        node15.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, false);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry23.createFunctionType(jSType24, jSTypeArray25);
        boolean boolean27 = functionType26.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = jSTypeRegistry6.createObjectType("hi!", node15, (com.google.javascript.rhino.jstype.ObjectType) functionType26);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node30 = jSTypeRegistry6.createParametersWithVarArgs(jSTypeArray29);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        boolean boolean38 = functionType37.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable39 = functionType37.getCtorImplementedInterfaces();
        jSTypeRegistry6.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, false);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry43.createFunctionType(jSType44, jSTypeArray45);
        boolean boolean47 = functionType46.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable48 = functionType46.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType46.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection50 = jSTypeRegistry6.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType46);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, false);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry53.createFunctionType(jSType54, jSTypeArray55);
        com.google.javascript.rhino.Node node57 = jSTypeRegistry6.createParametersWithVarArgs(jSTypeArray55);
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry2.createUnionType(jSTypeArray55);
        com.google.javascript.rhino.jstype.ObjectType objectType59 = jSTypeRegistry2.createAnonymousObjectType();
        boolean boolean60 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.FunctionType functionType61 = null;
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry2.createFunctionTypeWithNewReturnType(functionType61, jSType62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objectType28);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable39);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertNotNull(functionTypeCollection50);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00584");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable7 = functionType5.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType8 = functionType5.unboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        functionType5.setJSDocInfo(jSDocInfo9);
        boolean boolean11 = jSDocInfo9.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo9.getThisType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00585");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, false);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType8 = jSTypeRegistry5.createFunctionType(jSType6, jSTypeArray7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = functionType8.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType11 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType8);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, false);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node23.setString("");
        com.google.javascript.rhino.Node node26 = node19.useSourceInfoIfMissingFromForTree(node23);
        node23.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry31.createFunctionType(jSType32, jSTypeArray33);
        boolean boolean35 = functionType34.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = jSTypeRegistry14.createObjectType("hi!", node23, (com.google.javascript.rhino.jstype.ObjectType) functionType34);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node38 = jSTypeRegistry14.createParametersWithVarArgs(jSTypeArray37);
        com.google.javascript.rhino.Node node39 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray37);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, false);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node51.setString("");
        com.google.javascript.rhino.Node node54 = node47.useSourceInfoIfMissingFromForTree(node51);
        node51.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, false);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry59.createFunctionType(jSType60, jSTypeArray61);
        boolean boolean63 = functionType62.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType64 = jSTypeRegistry42.createObjectType("hi!", node51, (com.google.javascript.rhino.jstype.ObjectType) functionType62);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node66 = jSTypeRegistry42.createParametersWithVarArgs(jSTypeArray65);
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable75 = functionType73.getCtorImplementedInterfaces();
        jSTypeRegistry42.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType73);
        com.google.javascript.rhino.ErrorReporter errorReporter77 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter77, false);
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry79.createFunctionType(jSType80, jSTypeArray81);
        boolean boolean83 = functionType82.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable84 = functionType82.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType82.unboxesTo();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection86 = jSTypeRegistry42.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType82);
        com.google.javascript.rhino.ErrorReporter errorReporter87 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry89 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter87, false);
        com.google.javascript.rhino.jstype.JSType jSType90 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray91 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry89.createFunctionType(jSType90, jSTypeArray91);
        com.google.javascript.rhino.Node node93 = jSTypeRegistry42.createParametersWithVarArgs(jSTypeArray91);
        com.google.javascript.rhino.Node node94 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray91);
        java.lang.Object obj96 = node94.getProp((int) (short) -1);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertNotNull(functionType8);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(jSType11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(jSTypeArray65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable75);
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable84);
        org.junit.Assert.assertNull(jSType85);
        org.junit.Assert.assertNotNull(functionTypeCollection86);
        org.junit.Assert.assertNotNull(jSTypeArray91);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00586");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean90 = parameterizedType89.isInstanceType();
        com.google.javascript.rhino.jstype.TemplateType templateType91 = parameterizedType89.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.TemplateType templateType92 = parameterizedType89.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = parameterizedType89.hasAnyTemplateInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(templateType91);
        org.junit.Assert.assertNull(templateType92);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00587");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 44);
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00588");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = enumType45.getImplicitPrototype();
        boolean boolean48 = enumType45.isTemplateType();
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertNotNull(objectType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00589");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (short) 100);
        boolean boolean2 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.clearSideEffectFlags();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00590");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        boolean boolean15 = node14.isNE();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00591");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray25 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray25);
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, false);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType33 = jSTypeRegistry30.createFunctionType(jSType31, jSTypeArray32);
        boolean boolean34 = functionType33.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType33.getCtorImplementedInterfaces();
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType33);
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry2.getType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, false);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry41.createFunctionType(jSType42, jSTypeArray43);
        boolean boolean45 = functionType44.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList50 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor51 = strComparableList50.iterator();
        boolean boolean52 = functionType44.equals((java.lang.Object) strComparableItor51);
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, false);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry56.createFunctionType(jSType57, jSTypeArray58);
        boolean boolean60 = functionType59.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType59.getCtorImplementedInterfaces();
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = functionType44.defineSynthesizedProperty("", (com.google.javascript.rhino.jstype.JSType) functionType59, node62);
        java.util.Set<java.lang.String> strSet64 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType44.getParentScope();
        com.google.javascript.rhino.Node node67 = functionType44.getPropertyNode("");
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, false);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray72 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry70.createFunctionType(jSType71, jSTypeArray72);
        boolean boolean74 = functionType73.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, false);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry77.createFunctionType(jSType78, jSTypeArray79);
        boolean boolean81 = functionType80.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable82 = functionType80.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType80.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType80.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = functionType73.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean86 = functionType80.isNumberObjectType();
        boolean boolean87 = functionType80.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType80.getParameterType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType89 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType44, jSType88);
        boolean boolean91 = parameterizedType89.isPropertyTypeDeclared("function (): {308555690}");
        boolean boolean92 = parameterizedType89.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType89.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType95 = parameterizedType89.getPropertyType("function (): {308555690}");
        com.google.javascript.rhino.jstype.EnumType enumType96 = parameterizedType89.toMaybeEnumType();
        boolean boolean97 = parameterizedType89.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType98 = parameterizedType89.collapseUnion();
        boolean boolean99 = parameterizedType89.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strComparableList50);
        org.junit.Assert.assertNotNull(strComparableItor51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(jSTypeArray72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable82);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(jSType88);
        org.junit.Assert.assertNotNull(parameterizedType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(jSType95);
        org.junit.Assert.assertNull(enumType96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(jSType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00592");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node3.cloneNode();
        boolean boolean13 = node12.isContinue();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        node14.putIntProp((int) (short) -1, 0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00593");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = jSTypeRegistry2.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, false);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry7.createFunctionType(jSType8, jSTypeArray9);
        boolean boolean11 = functionType10.isNominalType();
        boolean boolean12 = jSTypeRegistry2.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node21.setString("");
        com.google.javascript.rhino.Node node24 = node17.useSourceInfoIfMissingFromForTree(node21);
        boolean boolean25 = node17.isGetElem();
        com.google.javascript.rhino.Node node26 = node17.cloneNode();
        boolean boolean27 = node26.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = node26.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, false);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, false);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry34.createFunctionType(jSType35, jSTypeArray36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = functionType37.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry31.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = functionType37.getJSDocInfo();
        boolean boolean43 = functionType37.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry2.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node26, (com.google.javascript.rhino.jstype.JSType) functionType37);
        com.google.javascript.rhino.jstype.EnumType enumType45 = enumType44.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType46 = enumType45.getElementsType();
        boolean boolean47 = enumElementType46.matchesObjectContext();
        int int48 = enumElementType46.getPropertiesCount();
        boolean boolean49 = enumElementType46.matchesObjectContext();
        com.google.javascript.rhino.jstype.ObjectType objectType50 = enumElementType46.getImplicitPrototype();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = objectType50.matchesObjectContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectType3);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(staticSourceFile28);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertNull(jSDocInfo41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(enumElementType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(objectType50);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00594");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isUnionType();
        int int14 = functionType12.getMinArguments();
        jSTypeRegistry2.unregisterPropertyOnType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", (com.google.javascript.rhino.jstype.JSType) functionType12);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = jSTypeRegistry2.getEachReferenceTypeWithProperty("Unknown class name");
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, false);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = jSTypeRegistry20.createAnonymousObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, false);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry25.createFunctionType(jSType26, jSTypeArray27);
        boolean boolean29 = functionType28.isNominalType();
        boolean boolean30 = jSTypeRegistry20.declareType("function (): {621165152}", (com.google.javascript.rhino.jstype.JSType) functionType28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node39.setString("");
        com.google.javascript.rhino.Node node42 = node35.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean43 = node35.isGetElem();
        com.google.javascript.rhino.Node node44 = node35.cloneNode();
        boolean boolean45 = node44.isExprResult();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = node44.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, false);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, false);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry52.createFunctionType(jSType53, jSTypeArray54);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = functionType55.getOwnPropertyJSDocInfo("");
        com.google.javascript.rhino.jstype.JSType jSType58 = jSTypeRegistry49.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = functionType55.getJSDocInfo();
        boolean boolean61 = functionType55.hasOwnProperty("Unknown class name");
        com.google.javascript.rhino.jstype.EnumType enumType62 = jSTypeRegistry20.createEnumType("Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n", node44, (com.google.javascript.rhino.jstype.JSType) functionType55);
        com.google.javascript.rhino.jstype.EnumType enumType63 = enumType62.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType64 = enumType63.getElementsType();
        boolean boolean65 = enumElementType64.matchesObjectContext();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType66 = enumElementType64.toMaybeEnumElementType();
        boolean boolean67 = enumElementType64.isNullable();
        boolean boolean68 = enumElementType64.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) enumElementType64);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection71 = jSTypeRegistry2.getDirectImplementors(objectType70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable17);
        org.junit.Assert.assertNotNull(objectType21);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(staticSourceFile46);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNull(jSDocInfo57);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertNull(jSDocInfo59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(enumType62);
        org.junit.Assert.assertNotNull(enumType63);
        org.junit.Assert.assertNotNull(enumElementType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(enumElementType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00595");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 10, "hi!");
        boolean boolean4 = node2.getBooleanProp(40);
        boolean boolean5 = node2.isFromExterns();
        node2.setLength(46);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00596");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node11.setString("");
        com.google.javascript.rhino.Node node14 = node7.useSourceInfoIfMissingFromForTree(node11);
        node11.setIsSyntheticBlock(false);
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, false);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry19.createFunctionType(jSType20, jSTypeArray21);
        boolean boolean23 = functionType22.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = jSTypeRegistry2.createObjectType("hi!", node11, (com.google.javascript.rhino.jstype.ObjectType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, false);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry27.createFunctionType(jSType28, jSTypeArray29);
        boolean boolean31 = functionType30.isUnionType();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList36 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!", (java.lang.Comparable<java.lang.String>) "STRING hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor37 = strComparableList36.iterator();
        boolean boolean38 = functionType30.equals((java.lang.Object) strComparableItor37);
        com.google.javascript.rhino.Node node39 = functionType30.getSource();
        com.google.javascript.rhino.jstype.JSType jSType41 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType30, "hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, false);
        com.google.javascript.rhino.jstype.ObjectType objectType45 = jSTypeRegistry44.createAnonymousObjectType();
        boolean boolean46 = objectType45.isNominalType();
        boolean boolean47 = objectType45.isNominalType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair48 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType30, (com.google.javascript.rhino.jstype.JSType) objectType45);
        com.google.javascript.rhino.jstype.JSType jSType49 = typePair48.typeA;
        com.google.javascript.rhino.jstype.JSType jSType50 = jSType49.autoboxesTo();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectType24);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strComparableList36);
        org.junit.Assert.assertNotNull(strComparableItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(objectType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNull(jSType50);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00597");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node18.setString("");
        com.google.javascript.rhino.Node node21 = node14.useSourceInfoIfMissingFromForTree(node18);
        node18.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node31.setString("");
        com.google.javascript.rhino.Node node34 = node27.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean35 = node27.isGetElem();
        int int37 = node27.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        com.google.javascript.rhino.Node node39 = node18.srcrefTree(node38);
        java.lang.String str40 = node10.checkTreeEquals(node38);
        boolean boolean41 = node38.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node49.setString("");
        com.google.javascript.rhino.Node node52 = node45.useSourceInfoIfMissingFromForTree(node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node60.setString("");
        com.google.javascript.rhino.Node node63 = node56.useSourceInfoIfMissingFromForTree(node60);
        node60.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node73.setString("");
        com.google.javascript.rhino.Node node76 = node69.useSourceInfoIfMissingFromForTree(node73);
        boolean boolean77 = node69.isGetElem();
        int int79 = node69.getIntProp((int) (byte) -1);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newExpr(node69);
        com.google.javascript.rhino.Node node81 = node60.srcrefTree(node80);
        java.lang.String str82 = node52.checkTreeEquals(node80);
        com.google.javascript.rhino.Node node83 = node38.useSourceInfoFrom(node80);
        boolean boolean84 = node38.isDelProp();
        int int85 = node38.getSideEffectFlags();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str40, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n" + "'", str82, "Node tree inequality:\nTree1:\nSTRING hi!\n\n\nTree2:\nEXPR_RESULT\n    STRING hi!\n\n\nSubtree1: STRING hi!\n\n\nSubtree2: EXPR_RESULT\n    STRING hi!\n");
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00598");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node9.setString("");
        com.google.javascript.rhino.Node node12 = node5.useSourceInfoIfMissingFromForTree(node9);
        boolean boolean13 = node5.isGetElem();
        com.google.javascript.rhino.Node node14 = node5.cloneNode();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node22.setString("");
        com.google.javascript.rhino.Node node25 = node18.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean26 = node18.isGetElem();
        com.google.javascript.rhino.Node node27 = node18.cloneNode();
        boolean boolean28 = node27.isContinue();
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] { node5, node27 };
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0, nodeArray29, 4095, 46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(16, nodeArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00599");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray4 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry2.createFunctionType(jSType3, jSTypeArray4);
        boolean boolean6 = functionType5.isUnionType();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, false);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType12 = jSTypeRegistry9.createFunctionType(jSType10, jSTypeArray11);
        boolean boolean13 = functionType12.isNominalType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType12.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType12.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getReturnType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = functionType5.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType12);
        boolean boolean18 = functionType12.isNumberObjectType();
        boolean boolean19 = functionType12.isEmptyType();
        org.junit.Assert.assertNotNull(jSTypeArray4);
        org.junit.Assert.assertNotNull(functionType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test00600");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString("hi!", 54, (int) (short) -1);
        node7.setString("");
        com.google.javascript.rhino.Node node10 = node3.useSourceInfoIfMissingFromForTree(node7);
        boolean boolean11 = node3.isGetElem();
        int int13 = node3.getIntProp((int) (byte) -1);
        boolean boolean14 = node3.isLabel();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = new com.google.javascript.rhino.JSTypeExpression(node3, "STRING hi!");
        com.google.javascript.rhino.Node node17 = jSTypeExpression16.getRoot();
        com.google.javascript.rhino.Node node18 = jSTypeExpression16.getRoot();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression16);
        boolean boolean20 = jSTypeExpression19.isOptionalArg();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(jSTypeExpression19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }
}

