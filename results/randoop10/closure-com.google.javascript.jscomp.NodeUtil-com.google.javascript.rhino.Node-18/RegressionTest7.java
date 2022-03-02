import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01401");
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
        java.lang.Iterable iterable48 = functionType45.getCtorImplementedInterfaces();
        boolean boolean49 = functionType45.isNativeObjectType();
        boolean boolean50 = functionType45.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.EnumType enumType51 = functionType45.toMaybeEnumType();
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
        org.junit.Assert.assertNotNull(iterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(enumType51);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01402");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo2.getParameterNames();
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
        com.google.javascript.rhino.Node node25 = functionType20.getRootNode();
        boolean boolean26 = functionType20.isInstanceType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType20.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType20.getParameterType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = functionType20.getImplementedInterfaces();
        boolean boolean30 = strSet9.equals((java.lang.Object) functionType20);
        boolean boolean31 = strSet9.isEmpty();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01403");
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
        boolean boolean19 = node3.isThrow();
        node3.setWasEmptyNode(true);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeIterable14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01404");
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
        boolean boolean82 = functionType10.isOrdinaryFunction();
        java.lang.String str83 = functionType10.getDisplayName();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate84 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = functionType10.setValidator(jSTypePredicate84);
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
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01405");
        com.google.common.collect.ImmutableList<java.lang.Object> objList3 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        boolean boolean27 = objList24.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        boolean boolean33 = objList24.contains((java.lang.Object) nodeIterable32);
        java.lang.Object[] objArray34 = objList24.toArray();
        java.lang.Object[] objArray35 = objList24.toArray();
        java.util.Iterator<java.lang.Object> objItor36 = objList24.iterator();
        int int37 = objList24.size();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList42 = com.google.common.collect.ImmutableList.of(jSDocInfo38, jSDocInfo39, jSDocInfo40, jSDocInfo41);
        java.util.Set<java.lang.String> strSet43 = jSDocInfo41.getSuppressions();
        strSet43.clear();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList49 = com.google.common.collect.ImmutableList.of(jSDocInfo45, jSDocInfo46, jSDocInfo47, jSDocInfo48);
        boolean boolean51 = jSDocInfo47.hasParameterType("hi!");
        java.lang.String str52 = jSDocInfo47.getDeprecationReason();
        boolean boolean53 = strSet43.equals((java.lang.Object) str52);
        com.google.common.collect.ImmutableList<java.lang.Object> objList56 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Object> objList60 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray80 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList81 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList81, objArray80);
        boolean boolean84 = objList81.add((java.lang.Object) 100.0d);
        boolean boolean85 = objList56.containsAll((java.util.Collection<java.lang.Object>) objList81);
        boolean boolean86 = strSet43.retainAll((java.util.Collection<java.lang.Object>) objList81);
        int int87 = objList24.lastIndexOf((java.lang.Object) strSet43);
        java.lang.Object[] objArray88 = strSet43.toArray();
        org.junit.Assert.assertNotNull(objList3);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertNotNull(objItor36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 22 + "'", int37 == 22);
        org.junit.Assert.assertNotNull(jSDocInfoList42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(jSDocInfoList49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objList56);
        org.junit.Assert.assertNotNull(objList60);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[]");
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01406");
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
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int39 = node38.getSourceOffset();
        boolean boolean40 = node38.isDo();
        node26.addChildToFront(node38);
        boolean boolean42 = node38.isAssign();
        boolean boolean43 = node38.isEmpty();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int48 = node47.getSourceOffset();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        node47.addChildrenToBack(node52);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int59 = node58.getSourceOffset();
        com.google.javascript.rhino.Node node60 = node47.useSourceInfoIfMissingFrom(node58);
        node60.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(39, node67);
        com.google.javascript.rhino.Node node69 = node60.srcref(node68);
        boolean boolean70 = node69.isCall();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable71 = node69.siblings();
        node38.addChildrenToBack(node69);
        boolean boolean73 = node38.isStringKey();
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
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(nodeIterable71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01407");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable31 = functionType23.getAllExtendedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable31);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01408");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isExterns();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01409");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = functionType26.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType26.getSuperClassConstructor();
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
        org.junit.Assert.assertNull(jSDocInfo80);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01410");
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
        java.util.Set<java.lang.String> strSet16 = objectType15.getPropertyNames();
        com.google.common.collect.ImmutableList<java.lang.Object> objList19 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray20 = objList19.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor21 = objList19.listIterator();
        boolean boolean23 = objList19.contains((java.lang.Object) (short) 10);
        boolean boolean24 = strSet16.removeAll((java.util.Collection<java.lang.Object>) objList19);
        // The following exception was thrown during execution in test generation
        try {
            objList19.clear();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(objList19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01411");
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
        java.util.Set<java.lang.String> strSet85 = functionType82.getOwnPropertyNames();
        boolean boolean86 = functionType82.isRegexpType();
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
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01412");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.lang.Object[] objArray6 = objList5.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor7 = objList5.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = node14.children();
        boolean boolean16 = node14.isQuotedString();
        com.google.javascript.rhino.Node node17 = node14.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry9.createFunctionType(jSType10, node17);
        com.google.javascript.rhino.jstype.JSType jSType20 = jSTypeRegistry9.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        com.google.javascript.rhino.Node node30 = node27.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry22.createFunctionType(jSType23, node30);
        boolean boolean32 = functionType31.isArrayType();
        java.lang.String str33 = functionType31.toAnnotationString();
        boolean boolean34 = functionType31.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry9.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType31, "NUMBER 0.0 36");
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType47.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType51 = functionType47.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry9.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType47);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable60 = node59.children();
        boolean boolean61 = node59.isQuotedString();
        com.google.javascript.rhino.Node node62 = node59.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry54.createFunctionType(jSType55, node62);
        boolean boolean64 = functionType63.isArrayType();
        boolean boolean65 = functionType63.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType66 = functionType63.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = functionType63.getAllImplementedInterfaces();
        java.lang.String str68 = functionType63.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet69 = functionType63.getPossibleToBooleanOutcomes();
        boolean boolean70 = functionType63.canBeCalled();
        java.util.Set<java.lang.String> strSet71 = functionType63.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = functionType63.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType73 = jSTypeRegistry9.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType63);
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry9.createNamedType("BITXOR", "{1936444324}", 52, (int) (short) 1);
        jSTypeRegistry9.clearTemplateTypeNames();
        jSTypeRegistry9.setLastGeneration(true);
        boolean boolean82 = objList5.equals((java.lang.Object) jSTypeRegistry9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Object> objItor84 = objList5.listIterator(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (12) must not be greater than size (2)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0, 10]");
        org.junit.Assert.assertNotNull(objItor7);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNull(jSType20);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "function (...[?]): ?" + "'", str33, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet69 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet69.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(objectType73);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01413");
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
        boolean boolean23 = jSDocInfo18.isHidden();
        java.util.Set<java.lang.String> strSet24 = jSDocInfo18.getSuppressions();
        boolean boolean25 = jSDocInfo18.isConstant();
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
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01414");
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
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType10.toMaybeFunctionType();
        java.lang.String str14 = functionType13.getReferenceName();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList15 = functionType13.getSubTypes();
        java.lang.Iterable iterable16 = functionType13.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        boolean boolean18 = functionType13.isAllType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(functionTypeList15);
        org.junit.Assert.assertNotNull(iterable16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01415");
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
        boolean boolean75 = functionType74.hasDisplayName();
        boolean boolean76 = functionType74.hasDisplayName();
        boolean boolean77 = functionType74.matchesInt32Context();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = functionType74.getTypeOfThis();
        boolean boolean79 = functionType56.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) objectType78);
        com.google.javascript.rhino.jstype.JSType jSType80 = objectType78.getIndexType();
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(jSType80);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01416");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH;
        com.google.javascript.rhino.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter1);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.children();
        boolean boolean9 = node7.isQuotedString();
        com.google.javascript.rhino.Node node10 = node7.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType11 = jSTypeRegistry2.createFunctionType(jSType3, node10);
        boolean boolean12 = functionType11.isArrayType();
        boolean boolean14 = functionType11.isPropertyTypeInferred("JSDocInfo");
        boolean boolean16 = functionType11.hasOwnProperty("");
        com.google.javascript.rhino.Node node17 = functionType11.getParametersNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = new com.google.javascript.rhino.JSTypeExpression(node17, "hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression19);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet21 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet22 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet23 = booleanLiteralSet21.intersection(booleanLiteralSet22);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        boolean boolean32 = node30.isQuotedString();
        com.google.javascript.rhino.Node node33 = node30.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry25.createFunctionType(jSType26, node33);
        boolean boolean35 = functionType34.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet36 = functionType34.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet38 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet39 = booleanLiteralSet36.union(booleanLiteralSet38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet40 = booleanLiteralSet21.union(booleanLiteralSet39);
        boolean boolean41 = jSTypeExpression20.equals((java.lang.Object) booleanLiteralSet21);
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable49 = node48.children();
        boolean boolean50 = node48.isQuotedString();
        com.google.javascript.rhino.Node node51 = node48.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry43.createFunctionType(jSType44, node51);
        boolean boolean53 = functionType52.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet54 = functionType52.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet55 = com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
        boolean boolean57 = booleanLiteralSet55.contains(false);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet58 = booleanLiteralSet54.union(booleanLiteralSet55);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet59 = booleanLiteralSet21.intersection(booleanLiteralSet55);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet60 = booleanLiteralSet0.intersection(booleanLiteralSet59);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet0 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet0.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(functionType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet21 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet21.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet22 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet22.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet23 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet23.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet36 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet36.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet38 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet38.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet39 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet39.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet40 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet40.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeIterable49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet54 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet54.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet55 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE + "'", booleanLiteralSet55.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet58 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet58.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet59 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet59.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet60 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY + "'", booleanLiteralSet60.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.EMPTY));
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01417");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01418");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((int) (byte) 0);
        int int20 = node4.getIndexOfChild(node19);
        boolean boolean21 = node19.isIf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList26 = com.google.common.collect.ImmutableList.of(jSDocInfo22, jSDocInfo23, jSDocInfo24, jSDocInfo25);
        boolean boolean28 = jSDocInfo24.hasParameterType("hi!");
        boolean boolean29 = jSDocInfo24.hasReturnType();
        boolean boolean30 = jSDocInfo24.hasModifies();
        java.util.Set<java.lang.String> strSet31 = jSDocInfo24.getParameterNames();
        int int32 = strSet31.size();
        node19.setDirectives(strSet31);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = null;
        node19.setStaticSourceFile(staticSourceFile34);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(50, node19, (int) (byte) 10, 31);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = node19.getJSDocInfo();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean44 = node43.hasOneChild();
        node43.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable47 = node43.getAncestors();
        int int48 = node43.getChildCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList53 = com.google.common.collect.ImmutableList.of(jSDocInfo49, jSDocInfo50, jSDocInfo51, jSDocInfo52);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression54 = jSDocInfo52.getReturnType();
        boolean boolean55 = jSDocInfo52.hasEnumParameterType();
        node43.setJSDocInfo(jSDocInfo52);
        com.google.javascript.rhino.Node node57 = node43.getFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            node19.addChildrenToFront(node57);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(ancestorIterable47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(jSDocInfoList53);
        org.junit.Assert.assertNull(jSTypeExpression54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(node57);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01419");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean56 = jSDocInfo55.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression57 = jSDocInfo55.getEnumParameterType();
        boolean boolean58 = jSDocInfo55.isExterns();
        boolean boolean59 = jSDocInfo55.isIdGenerator();
        boolean boolean60 = jSDocInfo55.isDeprecated();
        com.google.common.collect.ImmutableList<java.lang.String> strList61 = jSDocInfo55.getTemplateTypeNames();
        boolean boolean62 = jSDocInfo55.isHidden();
        boolean boolean63 = objList29.equals((java.lang.Object) boolean62);
        com.google.common.collect.ImmutableList<java.lang.Object> objList66 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray67 = objList66.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor68 = objList66.listIterator();
        boolean boolean70 = objList66.contains((java.lang.Object) (short) 10);
        boolean boolean71 = objList29.addAll((java.util.Collection<java.lang.Object>) objList66);
        com.google.common.collect.ImmutableList<java.lang.Object> objList72 = objList66.asList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = objList2.retainAll((java.util.Collection<java.lang.Object>) objList66);
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jSTypeExpression57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objList66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(objList72);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01420");
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
        java.lang.String str29 = node27.getQualifiedName();
        boolean boolean30 = node27.isLocalResultCall();
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01421");
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
        boolean boolean31 = functionType26.isStringObjectType();
        com.google.javascript.rhino.jstype.UnionType unionType32 = functionType26.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = unionType32.isFunctionPrototypeType();
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
        org.junit.Assert.assertNull(unionType32);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01422");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable30 = jSTypeRegistry1.getTypesWithProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = jSTypeRegistry1.getEachReferenceTypeWithProperty("function ({774120819}): {774120819}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry1.getTypesWithProperty("function ({1985330600}): {1985330600}");
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection36 = jSTypeRegistry1.getDirectImplementors(objectType35);
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
        org.junit.Assert.assertNotNull(jSTypeIterable30);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01423");
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
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        int int21 = objList2.indexOf((java.lang.Object) visibility20);
        com.google.common.collect.ImmutableList<java.lang.Object> objList22 = objList2.reverse();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = node26.children();
        boolean boolean28 = node26.isQuotedString();
        node26.setLength(0);
        boolean boolean31 = node26.isNew();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        node35.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable40 = node35.getAncestors();
        com.google.javascript.rhino.Node node41 = node26.useSourceInfoIfMissingFrom(node35);
        boolean boolean42 = node35.isExprResult();
        com.google.javascript.rhino.JSDocInfo jSDocInfo43 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList47 = com.google.common.collect.ImmutableList.of(jSDocInfo43, jSDocInfo44, jSDocInfo45, jSDocInfo46);
        boolean boolean49 = jSDocInfo45.hasParameterType("hi!");
        boolean boolean50 = jSDocInfo45.hasReturnType();
        boolean boolean51 = jSDocInfo45.hasModifies();
        java.util.Set<java.lang.String> strSet52 = jSDocInfo45.getParameterNames();
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
        com.google.javascript.rhino.Node node68 = functionType63.getRootNode();
        boolean boolean69 = functionType63.isInstanceType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable70 = functionType63.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType63.getParameterType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable72 = functionType63.getImplementedInterfaces();
        boolean boolean73 = strSet52.equals((java.lang.Object) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType63.getConstructor();
        node35.setJSType((com.google.javascript.rhino.jstype.JSType) functionType74);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = objList22.add((java.lang.Object) node35);
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
        org.junit.Assert.assertTrue("'" + visibility20 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility20.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objList22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(ancestorIterable40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(nodeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable70);
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertNotNull(objectTypeIterable72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(functionType74);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01424");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = iOException11.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException19 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = iOException19.getSuppressed();
        java.io.IOException iOException22 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException19);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList23 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException2, (java.lang.Throwable) iOException7, (java.lang.Throwable) iOException11, (java.lang.Throwable) iOException16, (java.lang.Throwable) iOException22);
        java.io.IOException iOException25 = new java.io.IOException("");
        iOException11.addSuppressed((java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray28 = iOException25.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableList23);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01425");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType36 = functionType14.getSuperClassConstructor();
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
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01426");
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
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node37 = node34.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry29.createFunctionType(jSType30, node37);
        boolean boolean39 = functionType38.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType41 = functionType38.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType42 = functionType38.toMaybeFunctionType();
        boolean boolean44 = functionType42.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable45 = functionType42.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType42.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node53.children();
        boolean boolean55 = node53.isQuotedString();
        com.google.javascript.rhino.Node node56 = node53.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry48.createFunctionType(jSType49, node56);
        boolean boolean58 = functionType42.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType57);
        boolean boolean59 = functionType42.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType42.getPropertyType("");
        boolean boolean62 = functionType42.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType42.getPropertyType("function ({1265812580}): {1265812580}");
        int int65 = objList2.indexOf((java.lang.Object) functionType42);
        java.util.Spliterator<java.lang.Object> objSpliterator66 = objList2.spliterator();
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
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSType41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable45);
        org.junit.Assert.assertNull(jSType46);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeIterable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(objSpliterator66);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01427");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        java.lang.String str17 = node16.toString();
        boolean boolean18 = node16.isThis();
        boolean boolean19 = node16.isComma();
        boolean boolean20 = node16.isDo();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int25 = node24.getSourceOffset();
        java.lang.String str26 = node24.getQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList31 = com.google.common.collect.ImmutableList.of(jSDocInfo27, jSDocInfo28, jSDocInfo29, jSDocInfo30);
        java.util.Set<java.lang.String> strSet32 = jSDocInfo30.getSuppressions();
        strSet32.clear();
        node24.setDirectives(strSet32);
        boolean boolean35 = node24.isQualifiedName();
        boolean boolean36 = node24.isStringKey();
        com.google.javascript.rhino.Node node37 = node16.srcrefTree(node24);
        boolean boolean38 = node37.isQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "NUMBER 0.0 36" + "'", str17, "NUMBER 0.0 36");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(jSDocInfoList31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01428");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet35 = node34.getDirectives();
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
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01429");
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
        boolean boolean57 = jSTypeRegistry1.isForwardDeclaredType("function ({213423908}): {213423908}");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSType jSType63 = jSTypeRegistry1.createNamedType("STRING NUMBER 0.0 36", "function ({1265812580}): {1265812580}", 49, (int) '#');
        jSTypeRegistry1.resetForTypeCheck();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSType63);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01430");
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
        com.google.common.collect.ImmutableList<java.lang.Object> objList40 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray60 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList61 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList61, objArray60);
        boolean boolean64 = objList61.add((java.lang.Object) 100.0d);
        java.util.stream.Stream<java.lang.Object> objStream65 = objList61.parallelStream();
        boolean boolean66 = strSet36.retainAll((java.util.Collection<java.lang.Object>) objList61);
        java.util.function.UnaryOperator<java.lang.Object> objUnaryOperator67 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList61.replaceAll(objUnaryOperator67);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(objList40);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objStream65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01431");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(29, "function ({1905212938}): {1905212938}", 32, (int) ' ');
        node4.setVarArgs(true);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01432");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isIf();
        node5.detachChildren();
        boolean boolean8 = node5.isVoid();
        boolean boolean9 = node5.isNE();
        boolean boolean10 = node5.isUnscopedQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            node5.setDouble(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Number node not created with Node.newNumber");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01433");
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
        boolean boolean31 = functionType25.matchesStringContext();
        boolean boolean33 = functionType25.removeProperty("function ({1265812580}): {1265812580}");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01434");
        com.google.common.collect.ImmutableList<java.lang.reflect.AnnotatedElement> annotatedElementList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(annotatedElementList0);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01435");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList10 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList10, objArray9);
        java.lang.Object[] objArray12 = objList10.toArray();
        java.util.stream.Stream<java.lang.Object> objStream13 = objList10.parallelStream();
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
        com.google.javascript.rhino.jstype.JSType jSType29 = functionType25.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot31 = functionType25.getOwnSlot("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable39 = node38.children();
        boolean boolean40 = node38.isQuotedString();
        com.google.javascript.rhino.Node node41 = node38.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry33.createFunctionType(jSType34, node41);
        boolean boolean43 = functionType42.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType42.restrictByNotNullOrUndefined();
        boolean boolean45 = jSType44.isNoResolvedType();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
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
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray73 = new com.google.javascript.rhino.jstype.JSType[] { functionType58, functionType71 };
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry47.createUnionType(jSTypeArray73);
        boolean boolean75 = jSType74.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable83 = node82.children();
        boolean boolean84 = node82.isQuotedString();
        com.google.javascript.rhino.Node node85 = node82.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry77.createFunctionType(jSType78, node85);
        boolean boolean87 = functionType86.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType86.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType90 = functionType86.toMaybeFunctionType();
        boolean boolean91 = functionType86.isNominalType();
        com.google.javascript.rhino.jstype.JSType jSType92 = jSType74.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType86);
        boolean boolean93 = jSType44.canAssignTo(jSType92);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair94 = functionType25.getTypesUnderShallowInequality(jSType44);
        boolean boolean95 = jSType44.isAllType();
        // The following exception was thrown during execution in test generation
        try {
            objList10.add(45, (java.lang.Object) jSType44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 45, Size: 9");
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
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSType29);
        org.junit.Assert.assertNull(jSTypeStaticSlot31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(functionTypeList60);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(nodeIterable83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(jSType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(typePair94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01436");
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
        boolean boolean18 = functionType10.isPropertyInExterns("");
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node25.children();
        boolean boolean27 = node25.isQuotedString();
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry20.createFunctionType(jSType21, node28);
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry20.getType("");
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
        boolean boolean46 = functionType42.isPropertyTypeDeclared("InputId: hi!");
        java.lang.String str47 = functionType42.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType48 = jSTypeRegistry20.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType42.getPropertyType("hi!");
        boolean boolean51 = functionType10.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType42);
        java.util.Set<java.lang.String> strSet52 = functionType10.getPropertyNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot54 = functionType10.getSlot("?");
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
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(nodeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "function ({920451481}): {920451481}" + "'", str47, "function ({920451481}): {920451481}");
        org.junit.Assert.assertNotNull(objectType48);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNull(staticSlot54);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01437");
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
        boolean boolean32 = functionType10.isOrdinaryFunction();
        boolean boolean33 = functionType10.isResolved();
        java.lang.String str34 = functionType10.getReferenceName();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01438");
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
        boolean boolean59 = functionType58.hasReferenceName();
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01439");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function ({842248975}): {842248975}", jSTypeNative1);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01440");
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
        java.lang.String str34 = functionType29.getNormalizedReferenceName();
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
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01441");
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
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int52 = node51.getSourceOffset();
        com.google.javascript.rhino.Node node53 = node40.useSourceInfoIfMissingFrom(node51);
        boolean boolean54 = node40.wasEmptyNode();
        com.google.javascript.rhino.Node node55 = node15.useSourceInfoFrom(node40);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int61 = node60.getSourceOffset();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node65.children();
        node60.addChildrenToBack(node65);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int72 = node71.getSourceOffset();
        com.google.javascript.rhino.Node node73 = node60.useSourceInfoIfMissingFrom(node71);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(10, node60, 49, (int) (short) 100);
        boolean boolean77 = node60.isComma();
        boolean boolean78 = node60.isAssignAdd();
        node60.removeProp((int) (short) 0);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection81 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node60);
        // The following exception was thrown during execution in test generation
        try {
            node55.addChildrenToBack(node60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeIterable66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(nodeCollection81);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01442");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo0.hasDescriptionForParameter("");
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01443");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isEmpty();
        node3.detachChildren();
        com.google.javascript.rhino.InputId inputId7 = node3.getInputId();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int13 = node12.getSourceOffset();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        node12.addChildrenToBack(node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int24 = node23.getSourceOffset();
        com.google.javascript.rhino.Node node25 = node12.useSourceInfoIfMissingFrom(node23);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(10, node12, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean31 = node28.isEquivalentTo(node30);
        boolean boolean32 = node28.isSwitch();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node28);
        java.lang.Object obj35 = node28.getProp(54);
        boolean boolean36 = node3.isEquivalentTo(node28);
        boolean boolean37 = node3.isFunction();
        boolean boolean38 = node3.isBlock();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(staticSourceFile33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01444");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isVar();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean13 = node12.hasOneChild();
        node3.addChildToBack(node12);
        boolean boolean15 = node12.isInc();
        node12.addSuppression("false");
        java.lang.String str18 = node12.getQualifiedName();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01445");
        com.google.common.collect.ImmutableList<java.lang.Object> objList3 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray23 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        boolean boolean27 = objList24.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable32 = node31.children();
        boolean boolean33 = objList24.contains((java.lang.Object) nodeIterable32);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList44 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList44, objArray43);
        java.lang.Object[] objArray46 = objList44.toArray();
        java.util.stream.Stream<java.lang.Object> objStream47 = objList44.parallelStream();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean50 = objList44.equals((java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream51 = objList44.parallelStream();
        java.lang.String[] strArray56 = new java.lang.String[] { "", "JSDocInfo", "", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        int int59 = strSet57.size();
        java.lang.String[] strArray64 = new java.lang.String[] { "", "JSDocInfo", "", "JSDocInfo" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        int int67 = strSet65.size();
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!", "InputId: hi!", "", "hi!", "[10, 0]" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        int int76 = strSet74.size();
        java.lang.String[] strArray87 = new java.lang.String[] { "Named type with empty name component", "InputId: hi!", "(function ({1535407544}): {1535407544})", "Not declared as a type name", "false", "{1936444324}", "function ({1839678788}): {1839678788}", "function ({1704073426}): {1704073426}", "function ({1110454636}): {1110454636}", "{671747480}" };
        java.util.LinkedHashSet<java.lang.String> strSet88 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet88, strArray87);
        com.google.common.collect.ImmutableList<java.util.LinkedHashSet<java.lang.String>> strSetList90 = com.google.common.collect.ImmutableList.of(strSet57, strSet65, strSet74, strSet88);
        strSet65.clear();
        boolean boolean92 = objList44.equals((java.lang.Object) strSet65);
        boolean boolean93 = objList24.addAll((java.util.Collection<java.lang.Object>) objList44);
        java.util.stream.Stream<java.lang.Object> objStream94 = objList24.parallelStream();
        org.junit.Assert.assertNotNull(objList3);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(nodeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objStream51);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(strSetList90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(objStream94);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01446");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>> jSTypeStaticScopeBuilder0 = com.google.common.collect.ImmutableList.builder();
        org.junit.Assert.assertNotNull(jSTypeStaticScopeBuilder0);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01447");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(12);
        int int2 = sideEffectFlags1.valueOf();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01448");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        int int5 = objList2.size();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray9 = objList8.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor10 = objList8.listIterator();
        boolean boolean12 = objList8.contains((java.lang.Object) (short) 10);
        java.lang.Object obj13 = null;
        boolean boolean14 = objList8.equals(obj13);
        java.lang.String str15 = objList8.toString();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList26 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList26, objArray25);
        java.lang.Object[] objArray28 = objList26.toArray();
        java.util.stream.Stream<java.lang.Object> objStream29 = objList26.parallelStream();
        int int30 = objList26.size();
        boolean boolean31 = objList8.containsAll((java.util.Collection<java.lang.Object>) objList26);
        boolean boolean32 = objList2.containsAll((java.util.Collection<java.lang.Object>) objList8);
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry34.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = node52.isQuotedString();
        com.google.javascript.rhino.Node node55 = node52.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry47.createFunctionType(jSType48, node55);
        boolean boolean57 = functionType56.isArrayType();
        java.lang.String str58 = functionType56.toAnnotationString();
        boolean boolean59 = functionType56.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry34.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType56, "NUMBER 0.0 36");
        jSTypeRegistry34.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable70 = node69.children();
        boolean boolean71 = node69.isQuotedString();
        com.google.javascript.rhino.Node node72 = node69.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry64.createFunctionType(jSType65, node72);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType73.toMaybeFunctionType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection75 = jSTypeRegistry34.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType74);
        functionType74.clearResolved();
        boolean boolean77 = functionType74.hasAnyTemplate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = objList8.remove((java.lang.Object) boolean77);
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
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[10, 0]" + "'", str15, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "function (...[?]): ?" + "'", str58, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(nodeIterable70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertNotNull(functionTypeCollection75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01449");
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
        boolean boolean83 = functionType26.isString();
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
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01450");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo1.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo1.getEnumParameterType();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo1.getModifies();
        jSDocInfo1.setLicense("function (...[?]): ?");
        boolean boolean10 = jSDocInfo1.isNoCompile();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo1.getSuppressions();
        java.lang.Object[] objArray12 = strSet11.toArray();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01451");
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
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable67 = node66.children();
        boolean boolean68 = node66.isQuotedString();
        com.google.javascript.rhino.Node node69 = node66.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry61.createFunctionType(jSType62, node69);
        boolean boolean71 = functionType70.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList72 = functionType70.getSubTypes();
        com.google.javascript.rhino.Node node73 = functionType70.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = functionType70.getJSDocInfo();
        jSTypeRegistry1.registerPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) functionType70);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable83 = node82.children();
        boolean boolean84 = node82.isQuotedString();
        com.google.javascript.rhino.Node node85 = node82.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry77.createFunctionType(jSType78, node85);
        boolean boolean87 = functionType86.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet88 = functionType86.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.FunctionType functionType89 = functionType86.toMaybeFunctionType();
        java.lang.String str90 = functionType89.getReferenceName();
        boolean boolean92 = functionType89.hasProperty("function ({1265812580}): {1265812580}");
        com.google.javascript.rhino.jstype.ObjectType objectType93 = null;
        boolean boolean94 = jSTypeRegistry1.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType89, objectType93);
        jSTypeRegistry1.incrementGeneration();
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
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(nodeIterable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(functionTypeList72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNull(jSDocInfo74);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(nodeIterable83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNotNull(functionType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet88 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet88.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01452");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        boolean boolean21 = node4.isComma();
        boolean boolean22 = node4.isAssignAdd();
        node4.removeProp((int) (short) 0);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection25 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo26 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeCollection25);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01453");
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
        boolean boolean24 = node20.isNull();
        java.lang.Appendable appendable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            node20.appendStringTree(appendable25);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01454");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean4 = node3.hasOneChild();
        node3.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        int int8 = node3.getChildCount();
        node3.setSourceFileForTesting("");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node3);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        node15.detachChildren();
        boolean boolean24 = node15.isOr();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean29 = node28.hasOneChild();
        node28.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable32 = node28.getAncestors();
        int int33 = node28.getChildCount();
        node28.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node36 = node15.copyInformationFrom(node28);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable46 = node45.children();
        node40.addChildrenToBack(node45);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int52 = node51.getSourceOffset();
        com.google.javascript.rhino.Node node53 = node40.useSourceInfoIfMissingFrom(node51);
        boolean boolean54 = node28.isEquivalentToTyped(node51);
        boolean boolean55 = node51.isReturn();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = node51.getJSDocInfo();
        com.google.javascript.rhino.Node node57 = node3.copyInformationFrom(node51);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable62 = node61.children();
        boolean boolean63 = node61.isQuotedString();
        node61.setLength(0);
        boolean boolean66 = node61.isVar();
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean71 = node70.hasOneChild();
        node61.addChildToBack(node70);
        boolean boolean73 = node70.isInc();
        com.google.javascript.rhino.Node node74 = node51.useSourceInfoIfMissingFromForTree(node70);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ancestorIterable32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeIterable46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(jSDocInfo56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01455");
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
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = jSTypeRegistry1.createParametersWithVarArgs(jSTypeArray32);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function ({1408434092}): {1408434092}" + "'", str28, "function ({1408434092}): {1408434092}");
        org.junit.Assert.assertNotNull(objectType29);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01456");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isIf();
        node5.detachChildren();
        node5.setVarArgs(true);
        boolean boolean10 = node5.isFunction();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01457");
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
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node35 = node32.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry27.createFunctionType(jSType28, node35);
        boolean boolean37 = functionType36.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList38 = functionType36.getSubTypes();
        com.google.javascript.rhino.Node node39 = functionType36.getRootNode();
        java.util.Set<java.lang.String> strSet40 = functionType36.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope42 = null;
        com.google.javascript.rhino.jstype.JSType jSType43 = functionType36.resolve(errorReporter41, jSTypeStaticScope42);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType10.forceResolve(errorReporter25, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType36);
        functionType10.clearCachedValues();
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
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(functionTypeList38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNotNull(jSType44);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01458");
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
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType36.getIndexType();
        boolean boolean38 = functionType36.canBeCalled();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope39 = functionType36.getParentScope();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = functionType36.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType41 = functionType40.getTypeOfThis();
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
        org.junit.Assert.assertNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertNotNull(objectType41);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01459");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType10.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType12 = objectType11.collapseUnion();
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
        boolean boolean64 = jSType12.equals((java.lang.Object) functionType23);
        com.google.javascript.rhino.ErrorReporter errorReporter65 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable72 = node71.children();
        boolean boolean73 = node71.isQuotedString();
        com.google.javascript.rhino.Node node74 = node71.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType75 = jSTypeRegistry66.createFunctionType(jSType67, node74);
        boolean boolean76 = functionType75.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList77 = functionType75.getSubTypes();
        com.google.javascript.rhino.Node node78 = functionType75.getRootNode();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair79 = functionType23.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType75);
        java.lang.Iterable iterable80 = functionType23.getCtorImplementedInterfaces();
        boolean boolean81 = functionType23.matchesNumberContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSType12);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(nodeIterable72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(functionType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(functionTypeList77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(typePair79);
        org.junit.Assert.assertNotNull(iterable80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01460");
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
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable23 = node22.children();
        boolean boolean24 = node22.isQuotedString();
        com.google.javascript.rhino.Node node25 = node22.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType26 = jSTypeRegistry17.createFunctionType(jSType18, node25);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = functionType26.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType28 = objectType27.collapseUnion();
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
        boolean boolean59 = functionType39.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType55);
        boolean boolean60 = functionType39.isUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable68 = node67.children();
        boolean boolean69 = node67.isQuotedString();
        com.google.javascript.rhino.Node node70 = node67.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry62.createFunctionType(jSType63, node70);
        boolean boolean72 = functionType71.isArrayType();
        boolean boolean74 = functionType71.isPropertyTypeInferred("JSDocInfo");
        boolean boolean76 = functionType71.hasOwnProperty("");
        com.google.javascript.rhino.Node node77 = functionType71.getParametersNode();
        boolean boolean78 = functionType71.hasCachedValues();
        functionType39.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType71);
        boolean boolean80 = jSType28.equals((java.lang.Object) functionType39);
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable88 = node87.children();
        boolean boolean89 = node87.isQuotedString();
        com.google.javascript.rhino.Node node90 = node87.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType91 = jSTypeRegistry82.createFunctionType(jSType83, node90);
        boolean boolean92 = functionType91.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList93 = functionType91.getSubTypes();
        com.google.javascript.rhino.Node node94 = functionType91.getRootNode();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair95 = functionType39.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType91);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair96 = functionType10.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType97 = typePair96.typeB;
        com.google.javascript.rhino.jstype.JSType jSType98 = typePair96.typeB;
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertNotNull(objectType27);
        org.junit.Assert.assertNotNull(jSType28);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(nodeIterable88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(functionTypeList93);
        org.junit.Assert.assertNull(node94);
        org.junit.Assert.assertNotNull(typePair95);
        org.junit.Assert.assertNotNull(typePair96);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertNotNull(jSType98);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01461");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isNew();
        boolean boolean9 = node3.isNew();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags10 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags10.clearSideEffectFlags();
        int int12 = sideEffectFlags10.valueOf();
        sideEffectFlags10.clearSideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags14 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags14.clearSideEffectFlags();
        int int16 = sideEffectFlags14.valueOf();
        sideEffectFlags14.setThrows();
        sideEffectFlags14.setAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags20 = new com.google.javascript.rhino.Node.SideEffectFlags(43);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags21 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags21.setMutatesThis();
        sideEffectFlags21.setAllFlags();
        boolean boolean24 = sideEffectFlags21.areAllFlagsSet();
        sideEffectFlags21.clearSideEffectFlags();
        sideEffectFlags21.setAllFlags();
        int int27 = sideEffectFlags21.valueOf();
        sideEffectFlags21.setMutatesGlobalState();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.SideEffectFlags> sideEffectFlagsList29 = com.google.common.collect.ImmutableList.of(sideEffectFlags10, sideEffectFlags14, sideEffectFlags20, sideEffectFlags21);
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(sideEffectFlags20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got NUMBER");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlagsList29);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01462");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean3 = node2.isSwitch();
        boolean boolean4 = node2.hasOneChild();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder5 = node2.getJsDocBuilderForNode();
        fileLevelJsDocBuilder5.append("[10, 0]");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder5);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01463");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.ListIterator<java.lang.Object> objItor3 = objList2.listIterator();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.children();
        boolean boolean9 = node7.isQuotedString();
        node7.setLength(0);
        boolean boolean12 = node7.isScript();
        int int13 = node7.getChildCount();
        boolean boolean14 = objList2.contains((java.lang.Object) node7);
        com.google.common.collect.ImmutableList<java.lang.Object> objList17 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray18 = objList17.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor19 = objList17.listIterator();
        boolean boolean21 = objList17.contains((java.lang.Object) (short) 10);
        java.lang.Object obj22 = null;
        boolean boolean23 = objList17.equals(obj22);
        java.lang.String str24 = objList17.toString();
        java.lang.Object[] objArray34 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList35 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList35, objArray34);
        java.lang.Object[] objArray37 = objList35.toArray();
        java.util.stream.Stream<java.lang.Object> objStream38 = objList35.parallelStream();
        int int39 = objList35.size();
        boolean boolean40 = objList17.containsAll((java.util.Collection<java.lang.Object>) objList35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = objList2.removeAll((java.util.Collection<java.lang.Object>) objList17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objList17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[10, 0]" + "'", str24, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01464");
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
        boolean boolean25 = jSDocInfo18.isNoAlias();
        java.util.Set<java.lang.String> strSet26 = jSDocInfo18.getParameterNames();
        // The following exception was thrown during execution in test generation
        try {
            strSet26.clear();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(jSDocInfoList19);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01465");
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
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        boolean boolean53 = node51.isQuotedString();
        com.google.javascript.rhino.Node node54 = node51.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry46.createFunctionType(jSType47, node54);
        boolean boolean56 = functionType55.isArrayType();
        boolean boolean57 = functionType55.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType55.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable59 = functionType55.getAllImplementedInterfaces();
        java.lang.String str60 = functionType55.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = functionType55.getPossibleToBooleanOutcomes();
        boolean boolean62 = functionType55.canBeCalled();
        java.util.Set<java.lang.String> strSet63 = functionType55.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType64 = functionType55.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType55);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry1.createNamedType("BITXOR", "{1936444324}", 52, (int) (short) 1);
        jSTypeRegistry1.resetForTypeCheck();
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectTypeIterable59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(jSType70);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01466");
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
        boolean boolean57 = jSTypeRegistry1.isForwardDeclaredType("function ({213423908}): {213423908}");
        jSTypeRegistry1.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node65.children();
        boolean boolean67 = node65.isQuotedString();
        com.google.javascript.rhino.Node node68 = node65.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry60.createFunctionType(jSType61, node68);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = functionType69.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType71 = objectType70.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType.Property property73 = objectType70.getSlot("");
        com.google.javascript.rhino.Node node77 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable78 = node77.children();
        boolean boolean79 = node77.isQuotedString();
        node77.setLength(0);
        boolean boolean82 = node77.isVar();
        com.google.javascript.rhino.Node node86 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean87 = node86.hasOneChild();
        node77.addChildToBack(node86);
        node77.setType(49);
        boolean boolean91 = objectType70.equals((java.lang.Object) 49);
        boolean boolean92 = objectType70.isNumber();
        boolean boolean94 = jSTypeRegistry1.canPropertyBeDefined((com.google.javascript.rhino.jstype.JSType) objectType70, "function (function (...[?]): ?, ...[function (...[?]): ?]): function (...[?]): ?");
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType95 = objectType70.toMaybeParameterizedType();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeIterable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNull(property73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(nodeIterable78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(parameterizedType95);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01467");
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
        boolean boolean16 = functionType14.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = functionType14.getOwnSlot("hi!");
        boolean boolean21 = objList2.contains((java.lang.Object) "hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList22 = objList2.reverse();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean24 = jSDocInfo23.isNoCompile();
        java.util.Collection<java.lang.String> strCollection25 = jSDocInfo23.getAuthors();
        boolean boolean26 = objList2.equals((java.lang.Object) jSDocInfo23);
        com.google.common.collect.ImmutableList<java.lang.Object> objList29 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream30 = objList29.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList31 = objList29.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList32 = objList29.reverse();
        java.lang.Object[] objArray33 = objList32.toArray();
        com.google.common.collect.UnmodifiableIterator<java.lang.Object> objItor34 = objList32.iterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor35 = objList32.listIterator();
        java.util.Iterator<java.lang.Object> objItor36 = objList32.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = objList2.addAll((java.util.Collection<java.lang.Object>) objList32);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(strCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objList29);
        org.junit.Assert.assertNotNull(objStream30);
        org.junit.Assert.assertNotNull(objList31);
        org.junit.Assert.assertNotNull(objList32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0, 10]");
        org.junit.Assert.assertNotNull(objItor34);
        org.junit.Assert.assertNotNull(objItor35);
        org.junit.Assert.assertNotNull(objItor36);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01468");
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
        com.google.javascript.rhino.jstype.ObjectType objectType76 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType24, "(function ({1535407544}): {1535407544})");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = objectType76.matchesUint32Context();
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
        org.junit.Assert.assertNull(objectType76);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01469");
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
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType10.getPropertyType("JSDocInfo");
        java.lang.Iterable iterable17 = functionType10.getCtorExtendedInterfaces();
        int int18 = functionType10.getMinArguments();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(iterable17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01470");
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
        com.google.javascript.rhino.InputId inputId26 = new com.google.javascript.rhino.InputId("hi!");
        node20.setInputId(inputId26);
        java.lang.String str28 = inputId26.toString();
        java.io.IOException iOException31 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray32 = iOException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = iOException31.getSuppressed();
        java.io.IOException iOException34 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException31);
        java.io.IOException iOException36 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray37 = iOException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = iOException36.getSuppressed();
        java.io.IOException iOException40 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray41 = iOException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = iOException40.getSuppressed();
        java.lang.Throwable[] throwableArray43 = iOException40.getSuppressed();
        java.io.IOException iOException45 = new java.io.IOException("");
        java.io.IOException iOException48 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray49 = iOException48.getSuppressed();
        java.lang.Throwable[] throwableArray50 = iOException48.getSuppressed();
        java.io.IOException iOException51 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException48);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList52 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException31, (java.lang.Throwable) iOException36, (java.lang.Throwable) iOException40, (java.lang.Throwable) iOException45, (java.lang.Throwable) iOException51);
        boolean boolean53 = inputId26.equals((java.lang.Object) iOException45);
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) iOException45);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "InputId: hi!" + "'", str28, "InputId: hi!");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01471");
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
        com.google.common.collect.ImmutableList<java.lang.Object> objList38 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray58 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList59 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList59, objArray58);
        boolean boolean62 = objList59.add((java.lang.Object) 100.0d);
        java.util.stream.Stream<java.lang.Object> objStream63 = objList59.parallelStream();
        objList59.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = objList2.retainAll((java.util.Collection<java.lang.Object>) objList59);
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
        org.junit.Assert.assertNotNull(objList38);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objStream63);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01472");
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
        boolean boolean56 = functionType47.isPropertyTypeDeclared("function ({1259214183}): {1259214183}");
        boolean boolean57 = functionType47.isNominalConstructor();
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01473");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = jSTypeExpression7.isOptionalArg();
        boolean boolean9 = jSTypeExpression7.isOptionalArg();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression7);
        com.google.javascript.rhino.Node node11 = jSTypeExpression7.getRoot();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeExpression10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01474");
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
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType40 = jSTypeRegistry38.getType("hi!");
        jSTypeRegistry38.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node44 = jSTypeRegistry38.createParameters(jSTypeArray43);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node47.setCharno((int) (short) 1);
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node56.children();
        boolean boolean58 = node56.isQuotedString();
        com.google.javascript.rhino.Node node59 = node56.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry51.createFunctionType(jSType52, node59);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry51.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable70 = node69.children();
        boolean boolean71 = node69.isQuotedString();
        com.google.javascript.rhino.Node node72 = node69.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry64.createFunctionType(jSType65, node72);
        boolean boolean74 = functionType73.isArrayType();
        java.lang.String str75 = functionType73.toAnnotationString();
        boolean boolean76 = functionType73.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType78 = jSTypeRegistry51.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType73, "NUMBER 0.0 36");
        com.google.javascript.rhino.jstype.ObjectType objectType79 = jSTypeRegistry38.createObjectType("function ({1839678788}): {1839678788}", node47, (com.google.javascript.rhino.jstype.ObjectType) functionType73);
        com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry22.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) objectType79, "(function ({561668705}): {561668705})", "function ({1688808893}): {1688808893}", (int) (byte) -1, 39);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative85 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry22.getNativeFunctionType(jSTypeNative85);
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
        org.junit.Assert.assertNull(jSType40);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertNull(jSType62);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(nodeIterable70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "function (...[?]): ?" + "'", str75, "function (...[?]): ?");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertNotNull(objectType79);
        org.junit.Assert.assertNotNull(jSType84);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01475");
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
        java.lang.String str16 = functionType10.getReferenceName();
        functionType10.clearCachedValues();
        java.lang.String str18 = functionType10.toDebugHashCodeString();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "function ({1115737890}): {1115737890}" + "'", str18, "function ({1115737890}): {1115737890}");
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01476");
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
        boolean boolean23 = jSDocInfo18.isHidden();
        boolean boolean24 = jSDocInfo18.isInterface();
        boolean boolean26 = jSDocInfo18.hasDescriptionForParameter("java.io.IOException: ");
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
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01477");
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
        java.util.List<java.lang.String> strList32 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry1.setTemplateTypeNames(strList32);
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
        org.junit.Assert.assertTrue("'" + resolveMode29 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode29.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01478");
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
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = node13.getStaticSourceFile();
        boolean boolean22 = node13.isLocalResultCall();
        boolean boolean23 = node13.isTypeOf();
        boolean boolean24 = node13.isSwitch();
        node13.setSourceEncodedPositionForTree(8);
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
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01479");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType48 = functionType45.toMaybeParameterizedType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType49 = functionType45.toMaybeParameterizedType();
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
        org.junit.Assert.assertNull(parameterizedType48);
        org.junit.Assert.assertNull(parameterizedType49);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01480");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = marker0.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(typePosition6);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01481");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo58 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01482");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable30 = jSTypeRegistry1.getTypesWithProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = jSTypeRegistry1.getEachReferenceTypeWithProperty("function ({774120819}): {774120819}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry1.getTypesWithProperty("function ({1985330600}): {1985330600}");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList47 = functionType45.getSubTypes();
        com.google.javascript.rhino.Node node48 = functionType45.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = functionType45.getJSDocInfo();
        boolean boolean50 = functionType45.matchesStringContext();
        boolean boolean51 = functionType45.isParameterizedType();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable59 = node58.children();
        boolean boolean60 = node58.isQuotedString();
        com.google.javascript.rhino.Node node61 = node58.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry53.createFunctionType(jSType54, node61);
        boolean boolean63 = functionType62.isArrayType();
        boolean boolean65 = functionType62.isPropertyTypeInferred("JSDocInfo");
        boolean boolean66 = functionType62.isInstanceType();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry1.createFunctionTypeWithNewThisType(functionType45, (com.google.javascript.rhino.jstype.ObjectType) functionType62);
        int int68 = functionType45.getPropertiesCount();
        java.lang.String str69 = functionType45.toDebugHashCodeString();
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
        org.junit.Assert.assertNotNull(jSTypeIterable30);
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(functionTypeList47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(jSDocInfo49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(nodeIterable59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "function ({882899876}): {882899876}" + "'", str69, "function ({882899876}): {882899876}");
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01483");
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
        boolean boolean18 = functionType10.isRegexpType();
        boolean boolean19 = functionType10.isFunctionPrototypeType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList25 = com.google.common.collect.ImmutableList.of(jSDocInfo21, jSDocInfo22, jSDocInfo23, jSDocInfo24);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = jSDocInfo24.getReturnType();
        boolean boolean27 = jSDocInfo24.hasEnumParameterType();
        boolean boolean28 = jSDocInfo24.hasModifies();
        jSDocInfo24.addSuppression("java.io.IOException: ");
        boolean boolean31 = jSDocInfo24.isConstructor();
        java.lang.Object[] objArray41 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList42 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList42, objArray41);
        java.lang.Object[] objArray44 = objList42.toArray();
        java.util.stream.Stream<java.lang.Object> objStream45 = objList42.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean47 = jSDocInfo46.isNoCompile();
        java.lang.String str48 = jSDocInfo46.toString();
        boolean boolean49 = jSDocInfo46.isExpose();
        int int50 = jSDocInfo46.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection51 = jSDocInfo46.getTypeNodes();
        boolean boolean52 = objList42.contains((java.lang.Object) jSDocInfo46);
        boolean boolean53 = jSDocInfo46.hasType();
        boolean boolean54 = jSDocInfo46.isNoSideEffects();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility55 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo46.setVisibility(visibility55);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList61 = com.google.common.collect.ImmutableList.of(jSDocInfo57, jSDocInfo58, jSDocInfo59, jSDocInfo60);
        boolean boolean62 = jSDocInfo60.isConstructor();
        boolean boolean64 = jSDocInfo60.hasParameterType("[10, 0]");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility65 = jSDocInfo60.getVisibility();
        boolean boolean66 = jSDocInfo60.hasReturnType();
        java.lang.Object[] objArray76 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList77 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList77, objArray76);
        java.lang.Object[] objArray79 = objList77.toArray();
        java.util.stream.Stream<java.lang.Object> objStream80 = objList77.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean82 = jSDocInfo81.isNoCompile();
        java.lang.String str83 = jSDocInfo81.toString();
        boolean boolean84 = jSDocInfo81.isExpose();
        int int85 = jSDocInfo81.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection86 = jSDocInfo81.getTypeNodes();
        boolean boolean87 = objList77.contains((java.lang.Object) jSDocInfo81);
        boolean boolean88 = jSDocInfo81.hasType();
        boolean boolean89 = jSDocInfo81.isNoSideEffects();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility90 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo81.setVisibility(visibility90);
        jSDocInfo60.setVisibility(visibility90);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList93 = com.google.common.collect.ImmutableList.of(visibility55, visibility90);
        jSDocInfo24.setVisibility(visibility55);
        boolean boolean95 = jSDocInfo24.hasModifies();
        functionType10.setPropertyJSDocInfo("Named type with empty name component", jSDocInfo24);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList25);
        org.junit.Assert.assertNull(jSTypeExpression26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "JSDocInfo" + "'", str48, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(nodeCollection51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + visibility55 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility55.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNotNull(jSDocInfoList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(visibility65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "JSDocInfo" + "'", str83, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(nodeCollection86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + visibility90 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility90.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNotNull(visibilityList93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01484");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet14 = com.google.javascript.rhino.jstype.BooleanLiteralSet.get(true);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet15 = booleanLiteralSet12.union(booleanLiteralSet14);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet16 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet17 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = booleanLiteralSet16.intersection(booleanLiteralSet17);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet19 = booleanLiteralSet14.union(booleanLiteralSet17);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet20 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        com.google.javascript.rhino.Node node30 = node27.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry22.createFunctionType(jSType23, node30);
        com.google.javascript.rhino.jstype.JSType jSType33 = jSTypeRegistry22.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable41 = node40.children();
        boolean boolean42 = node40.isQuotedString();
        com.google.javascript.rhino.Node node43 = node40.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry35.createFunctionType(jSType36, node43);
        boolean boolean45 = functionType44.isArrayType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet46 = functionType44.getPossibleToBooleanOutcomes();
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
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry22.createFunctionTypeWithVarArgs((com.google.javascript.rhino.jstype.JSType) functionType44, jSTypeArray74);
        boolean boolean77 = functionType44.isUnknownType();
        boolean boolean78 = functionType44.isNullable();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet79 = functionType44.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet80 = booleanLiteralSet20.intersection(booleanLiteralSet79);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet81 = booleanLiteralSet17.intersection(booleanLiteralSet20);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet14 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet14.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet15 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet15.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet16 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet16.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet17 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet17.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet18 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet18.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet19 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet19.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet20 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet20.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertNull(jSType33);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(nodeIterable41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet46 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet46.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
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
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet79 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet79.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet80 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet80.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet81 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet81.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01485");
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
        boolean boolean32 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable40 = node39.children();
        boolean boolean41 = node39.isQuotedString();
        com.google.javascript.rhino.Node node42 = node39.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry34.createFunctionType(jSType35, node42);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = functionType43.getParentScope();
        com.google.javascript.rhino.jstype.JSType jSType45 = objectType44.collapseUnion();
        com.google.javascript.rhino.jstype.ObjectType.Property property47 = objectType44.getSlot("");
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node55.children();
        boolean boolean57 = node55.isQuotedString();
        com.google.javascript.rhino.Node node58 = node55.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry50.createFunctionType(jSType51, node58);
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable69 = node68.children();
        boolean boolean70 = node68.isQuotedString();
        com.google.javascript.rhino.Node node71 = node68.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry63.createFunctionType(jSType64, node71);
        boolean boolean73 = functionType72.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList74 = functionType72.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node81.children();
        boolean boolean83 = node81.isQuotedString();
        com.google.javascript.rhino.Node node84 = node81.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry76.createFunctionType(jSType77, node84);
        boolean boolean86 = functionType85.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] { functionType72, functionType85 };
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry61.createUnionType(jSTypeArray87);
        com.google.javascript.rhino.Node node89 = jSTypeRegistry50.createOptionalParameters(jSTypeArray87);
        com.google.javascript.rhino.jstype.FunctionType functionType90 = jSTypeRegistry31.createFunctionType((com.google.javascript.rhino.jstype.JSType) objectType44, false, jSTypeArray87);
        com.google.javascript.rhino.Node node91 = jSTypeRegistry1.createOptionalParameters(jSTypeArray87);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative92 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType93 = jSTypeRegistry1.getNativeObjectType(jSTypeNative92);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "function ({1116524804}): {1116524804}" + "'", str28, "function ({1116524804}): {1116524804}");
        org.junit.Assert.assertNotNull(objectType29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertNotNull(objectType44);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNull(property47);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeIterable69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(functionTypeList74);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(nodeIterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(functionType90);
        org.junit.Assert.assertNotNull(node91);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01486");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo2.getParameterNames();
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
        com.google.javascript.rhino.Node node25 = functionType20.getRootNode();
        boolean boolean26 = functionType20.isInstanceType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType20.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType28 = functionType20.getParameterType();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable29 = functionType20.getImplementedInterfaces();
        boolean boolean30 = strSet9.equals((java.lang.Object) functionType20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = strSet9.add("BITXOR 49\n    NUMBER 0.0 36\n        NUMBER 0.0 36\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(jSType28);
        org.junit.Assert.assertNotNull(objectTypeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01487");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList25 = functionType23.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node35 = node32.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry27.createFunctionType(jSType28, node35);
        boolean boolean37 = functionType36.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] { functionType23, functionType36 };
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry12.createUnionType(jSTypeArray38);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry1.createOptionalParameters(jSTypeArray38);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        boolean boolean53 = functionType51.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType51.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable55 = functionType51.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node62.children();
        boolean boolean64 = node62.isQuotedString();
        com.google.javascript.rhino.Node node65 = node62.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry57.createFunctionType(jSType58, node65);
        boolean boolean67 = functionType66.isArrayType();
        boolean boolean68 = functionType66.isRegexpType();
        boolean boolean70 = functionType66.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean71 = functionType51.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean72 = functionType66.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType66.toMaybeFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node80.children();
        boolean boolean82 = node80.isQuotedString();
        com.google.javascript.rhino.Node node83 = node80.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry75.createFunctionType(jSType76, node83);
        boolean boolean85 = functionType84.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType86 = functionType84.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot88 = functionType84.getSlot("[10, 0]");
        boolean boolean89 = jSTypeRegistry1.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType66, (com.google.javascript.rhino.jstype.ObjectType) functionType84);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = jSTypeRegistry1.createAnonymousObjectType();
        com.google.javascript.rhino.jstype.JSType jSType91 = objectType90.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.UnionType unionType92 = jSType91.toMaybeUnionType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(functionTypeList25);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(objectTypeIterable55);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(nodeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(nodeIterable81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertNull(staticSlot88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(objectType90);
        org.junit.Assert.assertNull(jSType91);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01488");
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
        int int25 = jSDocInfo21.getParameterCount();
        boolean boolean26 = jSDocInfo21.isConsistentIdGenerator();
        boolean boolean27 = jSDocInfo21.hasThisType();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01489");
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
        boolean boolean34 = node27.isOr();
        com.google.javascript.rhino.Node node35 = node27.cloneNode();
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node53.children();
        boolean boolean55 = node53.isQuotedString();
        node53.setLength(0);
        boolean boolean58 = node53.isNew();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable66 = node65.children();
        boolean boolean67 = node65.isQuotedString();
        com.google.javascript.rhino.Node node68 = node65.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry60.createFunctionType(jSType61, node68);
        boolean boolean70 = functionType69.isArrayType();
        boolean boolean72 = functionType69.isPropertyTypeInferred("JSDocInfo");
        boolean boolean74 = functionType69.hasOwnProperty("");
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node81.children();
        boolean boolean83 = node81.isQuotedString();
        com.google.javascript.rhino.Node node84 = node81.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry76.createFunctionType(jSType77, node84);
        boolean boolean86 = functionType85.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType85.getPropertyType("InputId: hi!");
        boolean boolean89 = functionType69.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean90 = functionType85.canBeCalled();
        boolean boolean91 = functionType85.isInstanceType();
        com.google.javascript.rhino.jstype.ObjectType objectType92 = jSTypeRegistry38.createObjectType("hi!", node53, (com.google.javascript.rhino.jstype.ObjectType) functionType85);
        com.google.javascript.rhino.Node node95 = new com.google.javascript.rhino.Node((-1), node53, (int) 'a', 22);
        boolean boolean96 = node27.hasChild(node53);
        boolean boolean97 = node53.isTypeOf();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeIterable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeIterable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(nodeIterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01490");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor4 = objList2.listIterator();
        boolean boolean6 = objList2.contains((java.lang.Object) (short) 10);
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor7 = objList2.listIterator();
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList18 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.lang.Object[] objArray20 = objList18.toArray();
        java.util.stream.Stream<java.lang.Object> objStream21 = objList18.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList24 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray25 = objList24.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor26 = objList24.listIterator();
        boolean boolean28 = objList24.contains((java.lang.Object) (short) 10);
        java.lang.Object obj29 = null;
        boolean boolean30 = objList24.equals(obj29);
        java.lang.String str31 = objList24.toString();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node35.children();
        boolean boolean37 = node35.isQuotedString();
        node35.setLength(0);
        boolean boolean40 = node35.isScript();
        boolean boolean41 = node35.hasChildren();
        int int42 = objList24.lastIndexOf((java.lang.Object) node35);
        boolean boolean43 = objList18.addAll((java.util.Collection<java.lang.Object>) objList24);
        com.google.common.collect.ImmutableList<java.lang.Object> objList46 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objList46.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor48 = objList46.listIterator();
        boolean boolean50 = objList46.contains((java.lang.Object) (short) 10);
        java.lang.Object obj51 = null;
        boolean boolean52 = objList46.equals(obj51);
        com.google.common.collect.ImmutableList<java.lang.Object> objList55 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray56 = objList55.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor57 = objList55.listIterator();
        int int58 = objList55.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor60 = objList55.listIterator((int) (byte) 1);
        com.google.common.collect.ImmutableList<java.lang.Object> objList63 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray64 = objList63.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor65 = objList63.listIterator();
        int int66 = objList63.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor68 = objList63.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node74 = new com.google.javascript.rhino.Node(39, node73);
        boolean boolean75 = node74.isIf();
        node74.detachChildren();
        boolean boolean77 = node74.isVoid();
        boolean boolean78 = node74.isNE();
        int int79 = objList63.indexOf((java.lang.Object) node74);
        boolean boolean80 = objList63.isEmpty();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Object>> objListList81 = com.google.common.collect.ImmutableList.of(objList24, objList46, objList55, objList63);
        java.util.stream.Stream<java.lang.Object> objStream82 = objList24.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = objList2.removeAll((java.util.Collection<java.lang.Object>) objList24);
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
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream21);
        org.junit.Assert.assertNotNull(objList24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[10, 0]" + "'", str31, "[10, 0]");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objList46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objList55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertNotNull(objItor60);
        org.junit.Assert.assertNotNull(objList63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertNotNull(objItor68);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(objListList81);
        org.junit.Assert.assertNotNull(objStream82);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01491");
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
        com.google.common.collect.ImmutableList<java.lang.Object> objList20 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList24 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray44 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList45 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList45, objArray44);
        boolean boolean48 = objList45.add((java.lang.Object) 100.0d);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable53 = node52.children();
        boolean boolean54 = objList45.contains((java.lang.Object) nodeIterable53);
        java.lang.Object[] objArray55 = objList45.toArray();
        java.lang.Object[] objArray56 = objList45.toArray();
        boolean boolean57 = objList20.equals((java.lang.Object) objArray56);
        com.google.common.collect.ImmutableList<java.lang.Object> objList61 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream62 = objList61.parallelStream();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor63 = objList61.listIterator();
        java.lang.String str64 = objList61.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = objList20.addAll(30, (java.util.Collection<java.lang.Object>) objList61);
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
        org.junit.Assert.assertNotNull(objList20);
        org.junit.Assert.assertNotNull(objList24);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(nodeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objList61);
        org.junit.Assert.assertNotNull(objStream62);
        org.junit.Assert.assertNotNull(objItor63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "[10, 0]" + "'", str64, "[10, 0]");
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01492");
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
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        boolean boolean53 = node51.isQuotedString();
        com.google.javascript.rhino.Node node54 = node51.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry46.createFunctionType(jSType47, node54);
        boolean boolean56 = functionType55.isArrayType();
        boolean boolean57 = functionType55.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType55.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable59 = functionType55.getAllImplementedInterfaces();
        java.lang.String str60 = functionType55.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = functionType55.getPossibleToBooleanOutcomes();
        boolean boolean62 = functionType55.canBeCalled();
        java.util.Set<java.lang.String> strSet63 = functionType55.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType64 = functionType55.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType55);
        jSTypeRegistry1.identifyNonNullableName("{1108018228}");
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectTypeIterable59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType65);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01493");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        java.util.Set<java.lang.String> strSet5 = jSDocInfo3.getSuppressions();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        java.lang.String str11 = node9.getQualifiedName();
        boolean boolean12 = node9.isNE();
        boolean boolean13 = strSet5.equals((java.lang.Object) boolean12);
        strSet5.clear();
        java.util.Iterator<java.lang.String> strItor15 = strSet5.iterator();
        com.google.common.collect.ImmutableList<java.lang.Object> objList18 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray19 = objList18.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor20 = objList18.listIterator();
        boolean boolean22 = objList18.contains((java.lang.Object) (short) 10);
        java.lang.Object obj23 = null;
        boolean boolean24 = objList18.equals(obj23);
        java.lang.String str25 = objList18.toString();
        boolean boolean26 = strSet5.removeAll((java.util.Collection<java.lang.Object>) objList18);
        com.google.common.collect.ImmutableList<java.lang.Object> objList29 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        com.google.common.collect.ImmutableList<java.lang.Object> objList33 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray53 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        boolean boolean57 = objList54.add((java.lang.Object) 100.0d);
        boolean boolean58 = objList29.containsAll((java.util.Collection<java.lang.Object>) objList54);
        java.lang.Object[] objArray59 = objList29.toArray();
        boolean boolean60 = strSet5.retainAll((java.util.Collection<java.lang.Object>) objList29);
        com.google.javascript.rhino.JSDocInfo jSDocInfo61 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean62 = jSDocInfo61.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression63 = jSDocInfo61.getEnumParameterType();
        boolean boolean64 = jSDocInfo61.isExterns();
        boolean boolean65 = jSDocInfo61.isIdGenerator();
        java.lang.String str66 = jSDocInfo61.toString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = jSDocInfo61.getEnumParameterType();
        boolean boolean68 = jSDocInfo61.hasThisType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = objList29.add((java.lang.Object) boolean68);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor15);
        org.junit.Assert.assertNotNull(objList18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[10, 0]" + "'", str25, "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objList29);
        org.junit.Assert.assertNotNull(objList33);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jSTypeExpression63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "JSDocInfo" + "'", str66, "JSDocInfo");
        org.junit.Assert.assertNull(jSTypeExpression67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01494");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType10.getParameterType();
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
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType26.getPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType10.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType26);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType32 = functionType26.toMaybeEnumElementType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertNull(enumElementType32);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01495");
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
        java.lang.String str57 = functionType23.getReferenceName();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType23.getTypeOfThis();
        boolean boolean59 = functionType23.isFunctionPrototypeType();
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
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01496");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objList2.spliterator();
        java.util.Spliterator<java.lang.Object> objSpliterator7 = objList2.spliterator();
        java.util.Iterator<java.lang.Object> objItor8 = objList2.iterator();
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objList2.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        boolean boolean19 = node17.isQuotedString();
        com.google.javascript.rhino.Node node20 = node17.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry12.createFunctionType(jSType13, node20);
        com.google.javascript.rhino.jstype.JSType jSType23 = jSTypeRegistry12.getType("");
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        boolean boolean32 = node30.isQuotedString();
        com.google.javascript.rhino.Node node33 = node30.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry25.createFunctionType(jSType26, node33);
        boolean boolean35 = functionType34.isArrayType();
        boolean boolean36 = functionType34.isRegexpType();
        boolean boolean38 = functionType34.isPropertyTypeDeclared("InputId: hi!");
        java.lang.String str39 = functionType34.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType objectType40 = jSTypeRegistry12.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType34);
        java.lang.String str41 = objectType40.toDebugHashCodeString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = objList2.set((int) (byte) 0, (java.lang.Object) objectType40);
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
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(objSpliterator9);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "function ({425622652}): {425622652}" + "'", str39, "function ({425622652}): {425622652}");
        org.junit.Assert.assertNotNull(objectType40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "{615768217}" + "'", str41, "{615768217}");
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01497");
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
        com.google.javascript.rhino.jstype.FunctionType functionType13 = functionType10.toMaybeFunctionType();
        java.lang.String str14 = functionType13.getReferenceName();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList15 = functionType13.getSubTypes();
        java.lang.Iterable iterable16 = functionType13.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTypeOfThis();
        boolean boolean18 = functionType13.hasReferenceName();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(functionTypeList15);
        org.junit.Assert.assertNotNull(iterable16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01498");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative23 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec24 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative23);
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
        boolean boolean49 = node45.isSwitch();
        com.google.javascript.rhino.Node node50 = assertionFunctionSpec24.getAssertedParam(node45);
        boolean boolean51 = jSTypeExpression18.equals((java.lang.Object) node50);
        java.lang.String str52 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node50);
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
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01499");
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
        boolean boolean56 = functionType55.isUnknownType();
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
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01500");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo3.getReturnType();
        boolean boolean6 = jSDocInfo3.hasEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo3.getParameterType("InputId: hi!");
        boolean boolean9 = jSDocInfo3.isNoAlias();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01501");
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
        java.util.Set<java.lang.String> strSet35 = functionType26.getPropertyNames();
        boolean boolean36 = functionType26.isStringValueType();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01502");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.removeProp(36);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean10 = node3.hasChildren();
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable21 = node20.children();
        node15.addChildrenToBack(node20);
        node15.detachChildren();
        node15.setLineno(16);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(39, node30);
        boolean boolean32 = node31.isIf();
        node31.detachChildren();
        boolean boolean34 = node31.isVoid();
        com.google.javascript.rhino.Node node35 = node15.useSourceInfoIfMissingFrom(node31);
        node35.removeProp((int) (short) 0);
        boolean boolean38 = node35.isNew();
        com.google.javascript.rhino.Node node39 = node3.useSourceInfoIfMissingFrom(node35);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable45 = node44.children();
        boolean boolean46 = node44.isQuotedString();
        node44.setLength(0);
        boolean boolean49 = node44.isScript();
        boolean boolean50 = node44.hasChildren();
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable56 = node55.children();
        boolean boolean57 = node55.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = new com.google.javascript.rhino.JSTypeExpression(node55, "hi!");
        boolean boolean60 = node55.isCatch();
        java.lang.String str61 = node55.getQualifiedName();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString("{1936444324}", (int) ' ', (int) (short) 1);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship66 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType51, node55, node65);
        int int67 = node44.getIndexOfChild(node55);
        node35.putProp((int) (short) 10, (java.lang.Object) int67);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(nodeIterable21);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(nodeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01503");
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
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        int int21 = objList2.indexOf((java.lang.Object) visibility20);
        com.google.common.collect.ImmutableList<java.lang.Object> objList25 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray26 = objList25.toArray();
        com.google.common.collect.ImmutableList<java.lang.Object> objList27 = objList25.reverse();
        java.util.Iterator<java.lang.Object> objItor28 = objList25.iterator();
        java.util.ListIterator<java.lang.Object> objItor30 = objList25.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = objList2.addAll(53, (java.util.Collection<java.lang.Object>) objList25);
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
        org.junit.Assert.assertTrue("'" + visibility20 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility20.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objList25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10, 0]");
        org.junit.Assert.assertNotNull(objList27);
        org.junit.Assert.assertNotNull(objItor28);
        org.junit.Assert.assertNotNull(objItor30);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01504");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean8 = jSTypeExpression7.isOptionalArg();
        com.google.javascript.rhino.Node node9 = jSTypeExpression7.getRoot();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable17 = node16.children();
        boolean boolean18 = node16.isQuotedString();
        com.google.javascript.rhino.Node node19 = node16.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry11.createFunctionType(jSType12, node19);
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry11.getType("");
        boolean boolean23 = jSTypeRegistry11.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable31 = node30.children();
        boolean boolean32 = node30.isQuotedString();
        com.google.javascript.rhino.Node node33 = node30.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry25.createFunctionType(jSType26, node33);
        boolean boolean35 = functionType34.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType36 = functionType34.restrictByNotNullOrUndefined();
        boolean boolean37 = jSType36.isUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry11.createOptionalNullableType(jSType36);
        boolean boolean39 = jSTypeExpression7.equals((java.lang.Object) jSType36);
        boolean boolean40 = jSTypeExpression7.isVarArgs();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01505");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = node12.getExistingIntProp(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 42");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeIterable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ancestorIterable17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01506");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType34 = functionType14.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
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
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01507");
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
        boolean boolean15 = functionType10.isInstanceType();
        java.lang.Iterable iterable16 = functionType10.getCtorImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(iterable16);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01508");
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
        java.lang.String str43 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node42);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable44 = node42.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor45 = ancestorIterable44.iterator();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor46 = ancestorIterable44.iterator();
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
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(ancestorIterable44);
        org.junit.Assert.assertNotNull(nodeItor45);
        org.junit.Assert.assertNotNull(nodeItor46);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01509");
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
        boolean boolean25 = jSDocInfo17.isExport();
        boolean boolean26 = jSDocInfo17.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = jSDocInfo17.getParameterType("function ({507366191}): {507366191}");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection29 = jSDocInfo17.getTypeNodes();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSTypeExpression28);
        org.junit.Assert.assertNotNull(nodeCollection29);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01510");
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
        boolean boolean73 = functionType67.hasProperty("InputId: hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType74 = functionType67.dereference();
        boolean boolean75 = functionType67.canBeCalled();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet76 = functionType67.getPossibleToBooleanOutcomes();
        int int77 = functionType67.getExtendedInterfacesCount();
        java.util.Set<java.lang.String> strSet78 = functionType67.getOwnPropertyNames();
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
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet76 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet76.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(strSet78);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01511");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 51, (int) (byte) 0, 0);
        boolean boolean4 = node3.isNumber();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01512");
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
        boolean boolean79 = jSTypeRegistry1.hasNamespace("function ({1265812580}): {1265812580}");
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
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01513");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(4095, "java.io.IOException: ", 47, 39);
        boolean boolean5 = node4.isAdd();
        boolean boolean6 = node4.isTrue();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01514");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber(0.0d);
        boolean boolean3 = node2.isNE();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(4095, node2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString((int) 'a', "hi!");
        node5.addChildToFront(node8);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01515");
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
        com.google.javascript.rhino.jstype.StaticSlot staticSlot14 = functionType10.getSlot("[10, 0]");
        functionType10.clearResolved();
        boolean boolean17 = functionType10.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType10.getTypeOfThis();
        boolean boolean19 = functionType10.isNoResolvedType();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertNull(staticSlot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01516");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream3 = objList2.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList5 = objList2.reverse();
        com.google.common.collect.ImmutableList<java.lang.Object> objList8 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray9 = objList8.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor10 = objList8.listIterator();
        boolean boolean12 = objList8.contains((java.lang.Object) (short) 10);
        java.lang.Object obj13 = null;
        boolean boolean14 = objList8.equals(obj13);
        java.lang.String str15 = objList8.toString();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList26 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList26, objArray25);
        java.lang.Object[] objArray28 = objList26.toArray();
        java.util.stream.Stream<java.lang.Object> objStream29 = objList26.parallelStream();
        int int30 = objList26.size();
        boolean boolean31 = objList8.containsAll((java.util.Collection<java.lang.Object>) objList26);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList42 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList42, objArray41);
        java.lang.Object[] objArray44 = objList42.toArray();
        java.util.stream.Stream<java.lang.Object> objStream45 = objList42.parallelStream();
        int int46 = objList42.size();
        objList42.clear();
        boolean boolean48 = objList8.containsAll((java.util.Collection<java.lang.Object>) objList42);
        java.util.stream.Stream<java.lang.Object> objStream49 = objList42.parallelStream();
        java.util.stream.Stream<java.lang.Object> objStream50 = objList42.stream();
        boolean boolean51 = objList5.containsAll((java.util.Collection<java.lang.Object>) objList42);
        java.util.ListIterator<java.lang.Object> objItor52 = objList5.listIterator();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objStream3);
        org.junit.Assert.assertNotNull(objList4);
        org.junit.Assert.assertNotNull(objList5);
        org.junit.Assert.assertNotNull(objList8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[10, 0]" + "'", str15, "[10, 0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objStream49);
        org.junit.Assert.assertNotNull(objStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objItor52);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01517");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable19 = functionType10.getCtorImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable19);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01518");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) '4', "function ({1110454636}): {1110454636}", (int) (short) 10, 118833);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01519");
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
        boolean boolean18 = staticSourceFile16.isExtern();
        int int20 = staticSourceFile16.getLineOffset(2);
        int int22 = staticSourceFile16.getLineOfOffset(0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(staticSourceFile16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2147483648) + "'", int20 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01520");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int6 = node5.getSourceOffset();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node10.children();
        node5.addChildrenToBack(node10);
        node5.detachChildren();
        boolean boolean14 = node5.isOr();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean19 = node18.hasOneChild();
        node18.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable22 = node18.getAncestors();
        int int23 = node18.getChildCount();
        node18.setSourceFileForTesting("");
        com.google.javascript.rhino.Node node26 = node5.copyInformationFrom(node18);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean31 = node30.hasOneChild();
        boolean boolean32 = node30.isOnlyModifiesThisCall();
        boolean boolean33 = node30.isLabel();
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(39, node38);
        boolean boolean40 = node39.isIf();
        node39.detachChildren();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) (short) 0, node5, node30, node39);
        boolean boolean43 = node42.isNoSideEffectsCall();
        java.lang.String str44 = com.google.javascript.jscomp.NodeUtil.getSourceName(node42);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int50 = node49.getSourceOffset();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        node49.addChildrenToBack(node54);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int61 = node60.getSourceOffset();
        com.google.javascript.rhino.Node node62 = node49.useSourceInfoIfMissingFrom(node60);
        node62.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable69 = node68.children();
        boolean boolean70 = node68.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression72 = new com.google.javascript.rhino.JSTypeExpression(node68, "hi!");
        boolean boolean73 = jSTypeExpression72.isOptionalArg();
        boolean boolean74 = jSTypeExpression72.isOptionalArg();
        com.google.javascript.rhino.Node node75 = jSTypeExpression72.getRoot();
        node75.setSourceEncodedPositionForTree((int) (short) 100);
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean82 = node81.hasOneChild();
        boolean boolean83 = node81.isOnlyModifiesThisCall();
        boolean boolean84 = node81.isLabel();
        int int85 = node81.getType();
        com.google.javascript.jscomp.CodingConvention.Bind bind86 = new com.google.javascript.jscomp.CodingConvention.Bind(node62, node75, node81);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node(22, node42, node45, node62, 53, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ancestorIterable22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(nodeIterable69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 39 + "'", int85 == 39);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01521");
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
        com.google.common.collect.ImmutableList<java.lang.Object> objList20 = objList2.asList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = objList20.remove((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(objList20);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01522");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        boolean boolean21 = node4.isComma();
        boolean boolean22 = node4.isAssignAdd();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean27 = node26.hasOneChild();
        node26.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable30 = node26.getAncestors();
        int int31 = node26.getChildCount();
        com.google.javascript.rhino.Node node32 = node4.srcref(node26);
        boolean boolean33 = node4.isDefaultCase();
        boolean boolean34 = node4.isGetProp();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ancestorIterable30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01523");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean5 = jSDocInfo3.isConstructor();
        boolean boolean7 = jSDocInfo3.hasParameterType("[10, 0]");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo3.getVisibility();
        boolean boolean9 = jSDocInfo3.isExport();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node13.addChildrenToBack(node18);
        node13.detachChildren();
        node13.setLineno(16);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(39, node28);
        boolean boolean30 = node29.isIf();
        node29.detachChildren();
        boolean boolean32 = node29.isVoid();
        com.google.javascript.rhino.Node node33 = node13.useSourceInfoIfMissingFrom(node29);
        jSDocInfo3.setAssociatedNode(node13);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = jSDocInfo3.getThisType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(visibility8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(jSTypeExpression35);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01524");
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
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(48, "false");
        boolean boolean72 = node71.isSwitch();
        com.google.common.collect.ImmutableList<java.lang.Object> objList75 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray76 = objList75.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor77 = objList75.listIterator();
        int int78 = objList75.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor80 = objList75.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node(39, node85);
        boolean boolean87 = node86.isIf();
        node86.detachChildren();
        boolean boolean89 = node86.isVoid();
        boolean boolean90 = node86.isNE();
        int int91 = objList75.indexOf((java.lang.Object) node86);
        com.google.javascript.rhino.Node node92 = node71.useSourceInfoIfMissingFrom(node86);
        boolean boolean93 = node92.isIf();
        int int94 = objList36.indexOf((java.lang.Object) boolean93);
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
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objList75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(objItor80);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01525");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType49 = functionType45.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = parameterizedType49.isEnumType();
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
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(jSDocInfo48);
        org.junit.Assert.assertNull(parameterizedType49);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01526");
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
        node62.setDouble((double) 100.0f);
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
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01527");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType33 = functionType26.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jSType32);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01528");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable14 = functionType10.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType10.toMaybeFunctionType();
        java.lang.String str16 = functionType15.toString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable17 = functionType15.getExtendedInterfaces();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "function (...[?]): ?" + "'", str16, "function (...[?]): ?");
        org.junit.Assert.assertNotNull(objectTypeIterable17);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01529");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setMutatesThis();
        sideEffectFlags0.setAllFlags();
        boolean boolean3 = sideEffectFlags0.areAllFlagsSet();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.clearAllFlags();
        sideEffectFlags0.setMutatesThis();
        boolean boolean7 = sideEffectFlags0.areAllFlagsSet();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01530");
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
        boolean boolean35 = jSDocInfo3.containsDeclaration();
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
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01531");
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
        java.util.Set<java.lang.String> strSet25 = jSDocInfo21.getParameterNames();
        java.util.Collection<java.lang.String> strCollection26 = jSDocInfo21.getAuthors();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList27 = jSDocInfo21.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList28 = jSDocInfo21.getTemplateTypeNames();
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
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(strCollection26);
        org.junit.Assert.assertNotNull(jSTypeExpressionList27);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01532");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray3 = objList2.toArray();
        java.lang.Object[] objArray4 = objList2.toArray();
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[10, 0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10, 0]");
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01533");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable40 = functionType34.getAllImplementedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable40);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01534");
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
        com.google.common.collect.ImmutableList<java.lang.Object> objList23 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray24 = objList23.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor25 = objList23.listIterator();
        int int26 = objList23.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor28 = objList23.listIterator((int) (byte) 1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(39, node33);
        boolean boolean35 = node34.isIf();
        node34.detachChildren();
        boolean boolean37 = node34.isVoid();
        boolean boolean38 = node34.isNE();
        int int39 = objList23.indexOf((java.lang.Object) node34);
        boolean boolean40 = objList23.isEmpty();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility41 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        int int42 = objList23.indexOf((java.lang.Object) visibility41);
        com.google.common.collect.ImmutableList<java.lang.Object> objList43 = objList23.reverse();
        int int44 = objList43.size();
        boolean boolean45 = objList10.addAll((java.util.Collection<java.lang.Object>) objList43);
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable54 = node53.children();
        boolean boolean55 = node53.isQuotedString();
        com.google.javascript.rhino.Node node56 = node53.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry48.createFunctionType(jSType49, node56);
        boolean boolean59 = functionType57.isPropertyTypeDeclared("");
        boolean boolean60 = functionType57.isObject();
        boolean boolean61 = functionType57.hasReferenceName();
        // The following exception was thrown during execution in test generation
        try {
            objList43.add(0, (java.lang.Object) functionType57);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JSDocInfo" + "'", str16, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objList23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(objItor28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + visibility41 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility41.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(nodeIterable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01535");
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
        int int43 = node25.getSourcePosition();
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
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01536");
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
        java.lang.String str15 = functionType10.getReferenceName();
        boolean boolean16 = functionType10.hasReferenceName();
        java.lang.Class<?> wildcardClass17 = functionType10.getClass();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01537");
        java.io.IOException iOException4 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = iOException13.getSuppressed();
        java.lang.Throwable[] throwableArray16 = iOException13.getSuppressed();
        java.io.IOException iOException18 = new java.io.IOException("");
        java.io.IOException iOException21 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray22 = iOException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = iOException21.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException21);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList25 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException4, (java.lang.Throwable) iOException9, (java.lang.Throwable) iOException13, (java.lang.Throwable) iOException18, (java.lang.Throwable) iOException24);
        java.io.IOException iOException26 = new java.io.IOException("function ({2062255495}): {2062255495}", (java.lang.Throwable) iOException18);
        java.io.IOException iOException27 = new java.io.IOException("function ({1364769836}): {1364769836}", (java.lang.Throwable) iOException18);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableList25);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01538");
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
        boolean boolean11 = jSDocInfo2.isExpose();
        com.google.javascript.rhino.Node node12 = jSDocInfo2.getAssociatedNode();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01539");
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
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType27.toMaybeFunctionType();
        boolean boolean31 = inputId1.equals((java.lang.Object) functionType27);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean36 = node35.hasOneChild();
        node35.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable39 = node35.getAncestors();
        boolean boolean40 = node35.isNoSideEffectsCall();
        com.google.javascript.rhino.InputId inputId42 = new com.google.javascript.rhino.InputId("NUMBER 0.0 36 [input_id: InputId: hi!]");
        node35.setInputId(inputId42);
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node50.children();
        boolean boolean52 = node50.isQuotedString();
        com.google.javascript.rhino.Node node53 = node50.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry45.createFunctionType(jSType46, node53);
        boolean boolean55 = functionType54.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList56 = functionType54.getSubTypes();
        com.google.javascript.rhino.Node node57 = functionType54.getRootNode();
        java.util.Set<java.lang.String> strSet58 = functionType54.getOwnPropertyNames();
        node35.setDirectives(strSet58);
        boolean boolean60 = inputId1.equals((java.lang.Object) node35);
        boolean boolean61 = node35.isIf();
        com.google.javascript.rhino.Node node63 = node35.getAncestor(30);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(jSDocInfoList12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet29 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet29.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(ancestorIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(functionTypeList56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01540");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry1.getType("");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType14 = jSTypeRegistry1.getNativeObjectType(jSTypeNative13);
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
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01541");
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
        boolean boolean17 = functionType10.matchesObjectContext();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(objectType15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "function ({412787101}): {412787101}" + "'", str16, "function ({412787101}): {412787101}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01542");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable32 = jSTypeRegistry1.getTypesWithProperty("(function ({1399396790}): {1399396790})");
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33);
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable42 = node41.children();
        boolean boolean43 = node41.isQuotedString();
        com.google.javascript.rhino.Node node44 = node41.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry36.createFunctionType(jSType37, node44);
        boolean boolean46 = functionType45.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList47 = functionType45.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node54.children();
        boolean boolean56 = node54.isQuotedString();
        com.google.javascript.rhino.Node node57 = node54.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry49.createFunctionType(jSType50, node57);
        boolean boolean59 = functionType58.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] { functionType45, functionType58 };
        com.google.javascript.rhino.jstype.JSType jSType61 = jSTypeRegistry34.createUnionType(jSTypeArray60);
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry1.createNullableType(jSType61);
        boolean boolean63 = jSType62.isBooleanValueType();
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
        org.junit.Assert.assertNotNull(jSTypeIterable32);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(nodeIterable42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(functionTypeList47);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01543");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = new com.google.javascript.rhino.JSTypeExpression(node3, "hi!");
        boolean boolean9 = jSTypeExpression7.equals((java.lang.Object) (short) -1);
        com.google.javascript.rhino.Node node10 = jSTypeExpression7.getRoot();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable18 = node17.children();
        boolean boolean19 = node17.isQuotedString();
        com.google.javascript.rhino.Node node20 = node17.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry12.createFunctionType(jSType13, node20);
        boolean boolean22 = functionType21.isArrayType();
        boolean boolean23 = functionType21.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType25 = functionType21.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot27 = functionType21.getOwnSlot("hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList33 = com.google.common.collect.ImmutableList.of(jSDocInfo29, jSDocInfo30, jSDocInfo31, jSDocInfo32);
        java.util.Set<java.lang.String> strSet34 = jSDocInfo32.getSuppressions();
        functionType21.setPropertyJSDocInfo("", jSDocInfo32);
        int int36 = jSDocInfo32.getParameterCount();
        boolean boolean37 = jSDocInfo32.isConsistentIdGenerator();
        boolean boolean38 = jSTypeExpression7.equals((java.lang.Object) jSDocInfo32);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeIterable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSType25);
        org.junit.Assert.assertNull(jSTypeStaticSlot27);
        org.junit.Assert.assertNotNull(jSDocInfoList33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01544");
        com.google.common.collect.ImmutableList<java.util.LinkedHashSet<java.lang.String>> strSetList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(strSetList0);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01545");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isIf();
        node5.removeProp(54);
        boolean boolean9 = node5.isIf();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01546");
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
        boolean boolean25 = jSDocInfo18.isNoAlias();
        java.util.Set<java.lang.String> strSet26 = jSDocInfo18.getParameterNames();
        java.lang.String str27 = jSDocInfo18.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection28 = jSDocInfo18.getTypeNodes();
        boolean boolean29 = jSDocInfo18.isJavaDispatch();
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
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(nodeCollection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01547");
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
        com.google.javascript.rhino.jstype.StaticSlot staticSlot33 = functionType10.getSlot("function (...[?]): ?");
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType10.unboxesTo();
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
        org.junit.Assert.assertNull(staticSlot33);
        org.junit.Assert.assertNull(jSType34);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01548");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int5 = node4.getSourceOffset();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node9.children();
        node4.addChildrenToBack(node9);
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int16 = node15.getSourceOffset();
        com.google.javascript.rhino.Node node17 = node4.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(10, node4, 49, (int) (short) 100);
        com.google.javascript.rhino.Node node22 = node4.getAncestor(51);
        boolean boolean23 = node4.isVarArgs();
        boolean boolean24 = node4.isCase();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01549");
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
        int int61 = node53.getLength();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression63 = new com.google.javascript.rhino.JSTypeExpression(node53, "Unknown class name");
        java.lang.Object obj64 = null;
        boolean boolean65 = jSTypeExpression63.equals(obj64);
        boolean boolean66 = jSTypeExpression63.isOptionalArg();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01550");
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
        boolean boolean47 = node16.wasEmptyNode();
        com.google.javascript.rhino.Node node48 = node16.getLastChild();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile49 = node16.getStaticSourceFile();
        boolean boolean50 = node16.isRegExp();
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
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(staticSourceFile49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01551");
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
        java.util.Set<java.lang.String> strSet18 = functionType10.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType10.autobox();
        boolean boolean20 = functionType10.isNumberValueType();
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
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01552");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        int int2 = stringPosition0.getPositionOnStartLine();
        int int3 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01553");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType10.getParameterType();
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
        com.google.javascript.rhino.jstype.JSType jSType30 = functionType26.getPropertyType("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType10.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) functionType26);
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
        jSType31.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        boolean boolean66 = jSType31.isConstructor();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(functionType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSType30);
        org.junit.Assert.assertNotNull(jSType31);
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01554");
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
        node23.putIntProp((int) (byte) 100, (int) (short) 1);
        boolean boolean27 = node23.isAdd();
        node23.removeProp(50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = node23.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpect prop id 100");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01555");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        node3.setLineno(9);
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            node3.appendStringTree(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01556");
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
        // The following exception was thrown during execution in test generation
        try {
            int int59 = node50.getExistingIntProp(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01557");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.ListIterator<java.lang.Object> objItor3 = objList2.listIterator();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable8 = node7.children();
        boolean boolean9 = node7.isQuotedString();
        node7.setLength(0);
        boolean boolean12 = node7.isScript();
        int int13 = node7.getChildCount();
        boolean boolean14 = objList2.contains((java.lang.Object) node7);
        java.lang.Object[] objArray24 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        java.lang.Object[] objArray27 = objList25.toArray();
        java.util.stream.Stream<java.lang.Object> objStream28 = objList25.parallelStream();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (byte) 0);
        boolean boolean31 = objList25.equals((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray32 = objList25.toArray();
        java.lang.Object obj33 = null;
        boolean boolean34 = objList25.remove(obj33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = objList2.retainAll((java.util.Collection<java.lang.Object>) objList25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeIterable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01558");
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
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        java.lang.Object[] objArray23 = objList21.toArray();
        java.util.stream.Stream<java.lang.Object> objStream24 = objList21.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean26 = jSDocInfo25.isNoCompile();
        java.lang.String str27 = jSDocInfo25.toString();
        boolean boolean28 = jSDocInfo25.isExpose();
        int int29 = jSDocInfo25.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection30 = jSDocInfo25.getTypeNodes();
        boolean boolean31 = objList21.contains((java.lang.Object) jSDocInfo25);
        boolean boolean32 = jSDocInfo25.hasType();
        boolean boolean33 = jSDocInfo25.isNoSideEffects();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility34 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo25.setVisibility(visibility34);
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList40 = com.google.common.collect.ImmutableList.of(jSDocInfo36, jSDocInfo37, jSDocInfo38, jSDocInfo39);
        boolean boolean41 = jSDocInfo39.isConstructor();
        boolean boolean43 = jSDocInfo39.hasParameterType("[10, 0]");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility44 = jSDocInfo39.getVisibility();
        boolean boolean45 = jSDocInfo39.hasReturnType();
        java.lang.Object[] objArray55 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList56 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList56, objArray55);
        java.lang.Object[] objArray58 = objList56.toArray();
        java.util.stream.Stream<java.lang.Object> objStream59 = objList56.parallelStream();
        com.google.javascript.rhino.JSDocInfo jSDocInfo60 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean61 = jSDocInfo60.isNoCompile();
        java.lang.String str62 = jSDocInfo60.toString();
        boolean boolean63 = jSDocInfo60.isExpose();
        int int64 = jSDocInfo60.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection65 = jSDocInfo60.getTypeNodes();
        boolean boolean66 = objList56.contains((java.lang.Object) jSDocInfo60);
        boolean boolean67 = jSDocInfo60.hasType();
        boolean boolean68 = jSDocInfo60.isNoSideEffects();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility69 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo60.setVisibility(visibility69);
        jSDocInfo39.setVisibility(visibility69);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList72 = com.google.common.collect.ImmutableList.of(visibility34, visibility69);
        jSDocInfo3.setVisibility(visibility34);
        java.util.Set<java.lang.String> strSet74 = jSDocInfo3.getSuppressions();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "JSDocInfo" + "'", str27, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodeCollection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + visibility34 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility34.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNotNull(jSDocInfoList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(visibility44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "JSDocInfo" + "'", str62, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(nodeCollection65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + visibility69 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility69.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNotNull(visibilityList72);
        org.junit.Assert.assertNotNull(strSet74);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01559");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = functionType10.autobox();
        boolean boolean18 = jSType17.isInterface();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSDocInfo16);
        org.junit.Assert.assertNotNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01560");
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
        boolean boolean25 = jSDocInfo18.isNoAlias();
        java.util.Set<java.lang.String> strSet26 = jSDocInfo18.getParameterNames();
        java.lang.String str27 = jSDocInfo18.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection28 = jSDocInfo18.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = jSDocInfo18.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = jSDocInfo18.getThisType();
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
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(nodeCollection28);
        org.junit.Assert.assertNull(jSTypeExpression29);
        org.junit.Assert.assertNull(jSTypeExpression30);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01561");
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
        node13.putBooleanProp(2, true);
        node13.removeProp(9);
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
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01562");
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
        boolean boolean40 = node6.isFunction();
        com.google.javascript.rhino.Node node41 = node6.getLastSibling();
        boolean boolean42 = node41.isGetProp();
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
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01563");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression1 = jSDocInfo0.getThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertNull(jSTypeExpression1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01564");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property53 = functionType10.getSlot("JSDocInfo");
        boolean boolean54 = functionType10.isObject();
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
        org.junit.Assert.assertNull(property53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01565");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        boolean boolean11 = jSTypeRegistry1.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int17 = node16.getSourceOffset();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable22 = node21.children();
        node16.addChildrenToBack(node21);
        node16.detachChildren();
        node16.setLineno(16);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(39, node31);
        boolean boolean33 = node32.isIf();
        node32.detachChildren();
        boolean boolean35 = node32.isVoid();
        com.google.javascript.rhino.Node node36 = node16.useSourceInfoIfMissingFrom(node32);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable44 = node43.children();
        boolean boolean45 = node43.isQuotedString();
        com.google.javascript.rhino.Node node46 = node43.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry38.createFunctionType(jSType39, node46);
        boolean boolean48 = functionType47.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType47.getPropertyType("InputId: hi!");
        boolean boolean51 = functionType47.hasCachedValues();
        node36.setJSType((com.google.javascript.rhino.jstype.JSType) functionType47);
        int int53 = functionType47.getPropertiesCount();
        jSTypeRegistry1.registerPropertyOnType("function ({2062255495}): {2062255495}", (com.google.javascript.rhino.jstype.JSType) functionType47);
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
        com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType65.toMaybeFunctionType();
        boolean boolean69 = functionType65.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry1.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType65);
        boolean boolean71 = functionType65.isNominalConstructor();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeIterable22);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(nodeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(functionTypeList67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01566");
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
        java.lang.Object obj56 = null;
        // The following exception was thrown during execution in test generation
        try {
            objList54.add(48, obj56);
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
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01567");
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
        boolean boolean16 = functionType14.isRegexpType();
        com.google.javascript.rhino.jstype.JSType jSType18 = functionType14.findPropertyType("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = functionType14.getOwnSlot("hi!");
        boolean boolean21 = objList2.contains((java.lang.Object) "hi!");
        com.google.common.collect.ImmutableList<java.lang.Object> objList22 = objList2.reverse();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean24 = jSDocInfo23.isNoCompile();
        java.util.Collection<java.lang.String> strCollection25 = jSDocInfo23.getAuthors();
        boolean boolean26 = objList2.equals((java.lang.Object) jSDocInfo23);
        com.google.common.collect.ImmutableList<java.lang.Object> objList30 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream31 = objList30.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList32 = objList30.asList();
        java.util.Iterator<java.lang.Object> objItor33 = objList32.iterator();
        java.util.Iterator<java.lang.Object> objItor34 = objList32.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = objList2.addAll(1, (java.util.Collection<java.lang.Object>) objList32);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objList22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(strCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objList30);
        org.junit.Assert.assertNotNull(objStream31);
        org.junit.Assert.assertNotNull(objList32);
        org.junit.Assert.assertNotNull(objItor33);
        org.junit.Assert.assertNotNull(objItor34);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01568");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getEndLine();
        int int2 = stringPosition0.getStartLine();
        int int3 = stringPosition0.getPositionOnEndLine();
        int int4 = stringPosition0.getPositionOnStartLine();
        int int5 = stringPosition0.getEndLine();
        java.lang.String str6 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01569");
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
        java.util.Set<java.lang.String> strSet16 = functionType10.getPropertyNames();
        java.util.Collection[][] collectionArray18 = new java.util.Collection[0][];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Object>[][] objCollectionArray19 = (java.util.Collection<java.lang.Object>[][]) collectionArray18;
        com.google.common.collect.ImmutableList<java.util.Collection<java.lang.Object>[]> objCollectionArrayList20 = com.google.common.collect.ImmutableList.copyOf(objCollectionArray19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = strSet16.remove((java.lang.Object) objCollectionArrayList20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(collectionArray18);
        org.junit.Assert.assertNotNull(objCollectionArray19);
        org.junit.Assert.assertNotNull(objCollectionArrayList20);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01570");
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
        com.google.javascript.rhino.jstype.JSType jSType70 = typePair69.typeB;
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
        org.junit.Assert.assertNotNull(jSType70);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01571");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = iOException11.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("");
        java.io.IOException iOException19 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = iOException19.getSuppressed();
        java.io.IOException iOException22 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException19);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList23 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException2, (java.lang.Throwable) iOException7, (java.lang.Throwable) iOException11, (java.lang.Throwable) iOException16, (java.lang.Throwable) iOException22);
        java.io.IOException iOException25 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray26 = iOException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = iOException25.getSuppressed();
        java.lang.Throwable[] throwableArray28 = iOException25.getSuppressed();
        java.lang.Throwable[] throwableArray29 = iOException25.getSuppressed();
        com.google.common.collect.ImmutableList<java.lang.Object> objList33 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray53 = new java.lang.Object[] { "", 10L, (short) -1, (short) 100, 0, ' ', (-1), 1.0d, 100.0f, 39, ' ', 1.0d, (byte) 0, 0L, 10.0f, "hi!", ' ', 0, 10.0f, 43, (short) 10 };
        java.util.ArrayList<java.lang.Object> objList54 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList54, objArray53);
        boolean boolean57 = objList54.add((java.lang.Object) 100.0d);
        java.util.stream.Stream<java.lang.Object> objStream58 = objList54.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList61 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.util.stream.Stream<java.lang.Object> objStream62 = objList61.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList63 = objList61.asList();
        com.google.common.collect.ImmutableList<java.lang.Object> objList64 = objList61.reverse();
        java.lang.Object[] objArray65 = objList64.toArray();
        boolean boolean66 = objList54.retainAll((java.util.Collection<java.lang.Object>) objList64);
        java.io.IOException iOException69 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray70 = iOException69.getSuppressed();
        java.lang.Throwable[] throwableArray71 = iOException69.getSuppressed();
        java.io.IOException iOException72 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException69);
        boolean boolean73 = objList64.contains((java.lang.Object) iOException69);
        java.io.IOException iOException76 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray77 = iOException76.getSuppressed();
        java.lang.Throwable[] throwableArray78 = iOException76.getSuppressed();
        java.io.IOException iOException79 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException76);
        java.io.IOException iOException81 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray82 = iOException81.getSuppressed();
        java.lang.Throwable[] throwableArray83 = iOException81.getSuppressed();
        java.io.IOException iOException85 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray86 = iOException85.getSuppressed();
        java.lang.Throwable[] throwableArray87 = iOException85.getSuppressed();
        java.lang.Throwable[] throwableArray88 = iOException85.getSuppressed();
        java.io.IOException iOException90 = new java.io.IOException("");
        java.io.IOException iOException93 = new java.io.IOException("");
        java.lang.Throwable[] throwableArray94 = iOException93.getSuppressed();
        java.lang.Throwable[] throwableArray95 = iOException93.getSuppressed();
        java.io.IOException iOException96 = new java.io.IOException("JSDocInfo", (java.lang.Throwable) iOException93);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList97 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException76, (java.lang.Throwable) iOException81, (java.lang.Throwable) iOException85, (java.lang.Throwable) iOException90, (java.lang.Throwable) iOException96);
        iOException69.addSuppressed((java.lang.Throwable) iOException96);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList99 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException16, (java.lang.Throwable) iOException25, (java.lang.Throwable) iOException69);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableList23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(objList33);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[, 10, -1, 100, 0,  , -1, 1.0, 100.0, 39,  , 1.0, 0, 0, 10.0, hi!,  , 0, 10.0, 43, 10]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objStream58);
        org.junit.Assert.assertNotNull(objList61);
        org.junit.Assert.assertNotNull(objStream62);
        org.junit.Assert.assertNotNull(objList63);
        org.junit.Assert.assertNotNull(objList64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[0, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[0, 10]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray95);
        org.junit.Assert.assertNotNull(throwableList97);
        org.junit.Assert.assertNotNull(throwableList99);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01572");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        java.util.Set<java.lang.String> strSet5 = jSDocInfo3.getSuppressions();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int10 = node9.getSourceOffset();
        java.lang.String str11 = node9.getQualifiedName();
        boolean boolean12 = node9.isNE();
        boolean boolean13 = strSet5.equals((java.lang.Object) boolean12);
        strSet5.clear();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (byte) 10, (-1), '#', (short) 0, 100.0d, (byte) 1, 10L, (byte) 100, (-1) };
        java.util.ArrayList<java.lang.Object> objList25 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList25, objArray24);
        java.lang.Object[] objArray27 = objList25.toArray();
        java.util.stream.Stream<java.lang.Object> objStream28 = objList25.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Object> objList31 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray32 = objList31.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor33 = objList31.listIterator();
        boolean boolean35 = objList31.contains((java.lang.Object) (short) 10);
        java.lang.Object obj36 = null;
        boolean boolean37 = objList31.equals(obj36);
        java.lang.String str38 = objList31.toString();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable43 = node42.children();
        boolean boolean44 = node42.isQuotedString();
        node42.setLength(0);
        boolean boolean47 = node42.isScript();
        boolean boolean48 = node42.hasChildren();
        int int49 = objList31.lastIndexOf((java.lang.Object) node42);
        boolean boolean50 = objList25.addAll((java.util.Collection<java.lang.Object>) objList31);
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean52 = jSDocInfo51.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = jSDocInfo51.getEnumParameterType();
        boolean boolean54 = jSDocInfo51.isExterns();
        boolean boolean55 = jSDocInfo51.isIdGenerator();
        boolean boolean56 = jSDocInfo51.isDeprecated();
        com.google.common.collect.ImmutableList<java.lang.String> strList57 = jSDocInfo51.getTemplateTypeNames();
        boolean boolean58 = jSDocInfo51.isHidden();
        boolean boolean59 = objList25.equals((java.lang.Object) boolean58);
        boolean boolean60 = strSet5.retainAll((java.util.Collection<java.lang.Object>) objList25);
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
        boolean boolean75 = objList25.remove((java.lang.Object) jSType74);
        objList25.clear();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, -1, #, 0, 100.0, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(objStream28);
        org.junit.Assert.assertNotNull(objList31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[10, 0]" + "'", str38, "[10, 0]");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(nodeIterable43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSTypeExpression53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(nodeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01573");
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
        boolean boolean19 = functionType10.removeProperty("JSDocInfo");
        boolean boolean20 = functionType10.isStringObjectType();
        com.google.javascript.rhino.jstype.ObjectType.Property property22 = functionType10.getSlot("function ({775221821}): {775221821}");
        java.lang.Iterable iterable23 = functionType10.getCtorExtendedInterfaces();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(property22);
        org.junit.Assert.assertNotNull(iterable23);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01574");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(39, node4);
        boolean boolean6 = node5.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        int int8 = node7.getSourcePosition();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01575");
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
        com.google.javascript.rhino.jstype.FunctionType functionType19 = functionType10.toMaybeFunctionType();
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
        org.junit.Assert.assertNotNull(functionType19);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01576");
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
        int int33 = node9.getSideEffectFlags();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01577");
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
        boolean boolean73 = functionType67.hasProperty("InputId: hi!");
        boolean boolean74 = functionType67.isInstanceType();
        boolean boolean76 = functionType67.isPropertyTypeDeclared("Node tree inequality:\nTree1:\nNUMBER 0.0 36 [input_id: InputId: hi!]\n\n\nTree2:\nNUMBER 50.0 36 [source_file: ]\n\n\nSubtree1: NUMBER 0.0 36 [input_id: InputId: hi!]\n\n\nSubtree2: NUMBER 50.0 36 [source_file: ]\n");
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01578");
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
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable52 = node51.children();
        boolean boolean53 = node51.isQuotedString();
        com.google.javascript.rhino.Node node54 = node51.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry46.createFunctionType(jSType47, node54);
        boolean boolean56 = functionType55.isArrayType();
        boolean boolean57 = functionType55.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType58 = functionType55.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable59 = functionType55.getAllImplementedInterfaces();
        java.lang.String str60 = functionType55.getReferenceName();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet61 = functionType55.getPossibleToBooleanOutcomes();
        boolean boolean62 = functionType55.canBeCalled();
        java.util.Set<java.lang.String> strSet63 = functionType55.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.ObjectType objectType64 = functionType55.getImplicitPrototype();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = jSTypeRegistry1.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType55);
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry1.createNamedType("BITXOR", "{1936444324}", 52, (int) (short) 1);
        boolean boolean72 = jSTypeRegistry1.isForwardDeclaredType("function ({774120819}): {774120819}");
        jSTypeRegistry1.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable82 = node81.children();
        boolean boolean83 = node81.isQuotedString();
        com.google.javascript.rhino.Node node84 = node81.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry76.createFunctionType(jSType77, node84);
        boolean boolean86 = functionType85.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType88 = functionType85.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType89 = functionType85.toMaybeFunctionType();
        boolean boolean90 = functionType85.isNominalType();
        boolean boolean91 = functionType85.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType92 = jSTypeRegistry1.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType85);
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertNotNull(objectTypeIterable59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet61 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet61.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(objectType64);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(nodeIterable82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(jSType92);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01579");
        com.google.common.collect.ImmutableList<java.lang.Object> objList2 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.String str3 = objList2.toString();
        com.google.common.collect.ImmutableList<java.lang.Object> objList4 = objList2.asList();
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
        com.google.javascript.rhino.ErrorReporter errorReporter47 = jSTypeRegistry7.getErrorReporter();
        com.google.javascript.rhino.jstype.JSType jSType52 = jSTypeRegistry7.createNamedType("[10, 0]", "NUMBER 0.0 36\n", 32, 4095);
        com.google.javascript.rhino.jstype.JSType jSType54 = jSType52.findPropertyType("function ({1077595546}): {1077595546}");
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSType54.toMaybeFunctionType();
        // The following exception was thrown during execution in test generation
        try {
            objList4.add((int) '#', (java.lang.Object) functionType55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[10, 0]" + "'", str3, "[10, 0]");
        org.junit.Assert.assertNotNull(objList4);
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
        org.junit.Assert.assertNull(errorReporter47);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertNull(functionType55);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01580");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 32, 8, 52);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = jSTypeRegistry7.createNamedType("{1108018228}", "(Not declared as a type name)", 38, (int) (short) 10);
        node3.putProp(51, (java.lang.Object) "(Not declared as a type name)");
        boolean boolean14 = node3.isNull();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01581");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.hasModifies();
        boolean boolean10 = jSDocInfo2.hasParameter("java.io.IOException: ");
        boolean boolean11 = jSDocInfo2.isExterns();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01582");
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
        boolean boolean39 = functionType37.isNoObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01583");
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
        boolean boolean33 = functionType26.canBeCalled();
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
        boolean boolean65 = functionType44.isArrayType();
        java.lang.String str66 = functionType44.toString();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = functionType44.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType26.getGreatestSubtype((com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean69 = functionType26.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType26.getBindReturnType(42);
        java.lang.String str72 = functionType26.toDebugHashCodeString();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "function (...[?]): ?" + "'", str66, "function (...[?]): ?");
        org.junit.Assert.assertNotNull(objectType67);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(functionType71);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "function ({148690972}): {148690972}" + "'", str72, "function ({148690972}): {148690972}");
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01584");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        boolean boolean5 = node3.isQuotedString();
        node3.setLength(0);
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.hasChildren();
        boolean boolean10 = node3.isCatch();
        java.lang.String str11 = node3.toStringTree();
        boolean boolean12 = node3.isCatch();
        boolean boolean13 = node3.isDebugger();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "NUMBER 0.0 36\n" + "'", str11, "NUMBER 0.0 36\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01585");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("STRING NUMBER 0.0 36");
        node1.setType(41);
        com.google.javascript.rhino.Node node5 = node1.getChildAtIndex(0);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01586");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable83 = functionType82.getExtendedInterfaces();
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
        org.junit.Assert.assertNotNull(objectTypeIterable83);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01587");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable7 = node6.children();
        boolean boolean8 = node6.isQuotedString();
        com.google.javascript.rhino.Node node9 = node6.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry1.createFunctionType(jSType2, node9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable20 = node19.children();
        boolean boolean21 = node19.isQuotedString();
        com.google.javascript.rhino.Node node22 = node19.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry14.createFunctionType(jSType15, node22);
        boolean boolean24 = functionType23.isArrayType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList25 = functionType23.getSubTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isQuotedString();
        com.google.javascript.rhino.Node node35 = node32.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType36 = jSTypeRegistry27.createFunctionType(jSType28, node35);
        boolean boolean37 = functionType36.isArrayType();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] { functionType23, functionType36 };
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry12.createUnionType(jSTypeArray38);
        com.google.javascript.rhino.Node node40 = jSTypeRegistry1.createOptionalParameters(jSTypeArray38);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable48 = node47.children();
        boolean boolean49 = node47.isQuotedString();
        com.google.javascript.rhino.Node node50 = node47.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry42.createFunctionType(jSType43, node50);
        boolean boolean52 = functionType51.isArrayType();
        boolean boolean53 = functionType51.isRegexpType();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = functionType51.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable55 = functionType51.getAllImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable63 = node62.children();
        boolean boolean64 = node62.isQuotedString();
        com.google.javascript.rhino.Node node65 = node62.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry57.createFunctionType(jSType58, node65);
        boolean boolean67 = functionType66.isArrayType();
        boolean boolean68 = functionType66.isRegexpType();
        boolean boolean70 = functionType66.isPropertyTypeDeclared("InputId: hi!");
        boolean boolean71 = functionType51.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean72 = functionType66.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = functionType66.toMaybeFunctionType();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable81 = node80.children();
        boolean boolean82 = node80.isQuotedString();
        com.google.javascript.rhino.Node node83 = node80.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry75.createFunctionType(jSType76, node83);
        boolean boolean85 = functionType84.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType86 = functionType84.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot88 = functionType84.getSlot("[10, 0]");
        boolean boolean89 = jSTypeRegistry1.resetImplicitPrototype((com.google.javascript.rhino.jstype.JSType) functionType66, (com.google.javascript.rhino.jstype.ObjectType) functionType84);
        com.google.javascript.rhino.jstype.ObjectType objectType90 = functionType84.getTypeOfThis();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(functionTypeList25);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(functionType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objectType54);
        org.junit.Assert.assertNotNull(objectTypeIterable55);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(nodeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(nodeIterable81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertNull(staticSlot88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(objectType90);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01588");
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
        int int61 = node53.getLength();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression63 = new com.google.javascript.rhino.JSTypeExpression(node53, "Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo66 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList68 = com.google.common.collect.ImmutableList.of(jSDocInfo64, jSDocInfo65, jSDocInfo66, jSDocInfo67);
        boolean boolean69 = jSDocInfo67.isConstructor();
        boolean boolean71 = jSDocInfo67.hasParameterType("[10, 0]");
        boolean boolean72 = jSTypeExpression63.equals((java.lang.Object) jSDocInfo67);
        boolean boolean73 = jSTypeExpression63.isOptionalArg();
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
        org.junit.Assert.assertNotNull(jSDocInfoList68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01589");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) (byte) 0);
        node1.setCharno((int) (short) 1);
        node1.setSourceFileForTesting("function ({1458513118}): {1458513118}");
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01590");
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
        com.google.javascript.rhino.jstype.ObjectType objectType89 = functionType83.getImplicitPrototype();
        boolean boolean90 = functionType83.hasReferenceName();
        boolean boolean92 = functionType83.isPropertyTypeInferred("function ({1458513118}): {1458513118}");
        boolean boolean93 = functionType83.isBooleanValueType();
        boolean boolean94 = functionType83.isBooleanValueType();
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
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01591");
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
        com.google.common.collect.ImmutableList<java.lang.Object> objList41 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray42 = objList41.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor43 = objList41.listIterator();
        int int44 = objList41.size();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor46 = objList41.listIterator((int) (byte) 1);
        boolean boolean47 = strSet22.removeAll((java.util.Collection<java.lang.Object>) objList41);
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
        org.junit.Assert.assertNotNull(objList41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(objItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01592");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.children();
        node4.setSourceFileForTesting("[10, 0]");
        boolean boolean8 = node4.isLocalResultCall();
        boolean boolean9 = node4.isScript();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int14 = node13.getSourceOffset();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable19 = node18.children();
        node13.addChildrenToBack(node18);
        boolean boolean21 = node18.isGetElem();
        int int22 = node18.getType();
        com.google.javascript.rhino.jstype.JSType jSType23 = node18.getJSType();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable29 = node28.children();
        node28.setSourceFileForTesting("[10, 0]");
        node28.setVarArgs(true);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable38 = node37.children();
        boolean boolean39 = node37.isQuotedString();
        node37.setLength(0);
        boolean boolean42 = node37.isVar();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int47 = node46.getSourceOffset();
        boolean boolean48 = node46.isDo();
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int53 = node52.getSourceOffset();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable58 = node57.children();
        node52.addChildrenToBack(node57);
        node52.detachChildren();
        node52.setLineno(16);
        boolean boolean63 = node52.isSwitch();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(39, node68);
        boolean boolean70 = node69.isIf();
        node69.detachChildren();
        boolean boolean72 = node52.hasChild(node69);
        boolean boolean73 = node52.isDebugger();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(52, node28, node37, node46, node52, (int) '#', (-1));
        com.google.javascript.rhino.Node node77 = node18.copyInformationFromForTree(node28);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship78 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node4, node18);
        com.google.javascript.rhino.Node node79 = node4.removeFirstChild();
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeIterable19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 39 + "'", int22 == 39);
        org.junit.Assert.assertNull(jSType23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeIterable29);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(nodeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(nodeIterable58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNull(node79);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01593");
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
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable28 = node27.children();
        boolean boolean29 = node27.isQuotedString();
        com.google.javascript.rhino.Node node30 = node27.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry22.createFunctionType(jSType23, node30);
        boolean boolean32 = functionType31.isArrayType();
        com.google.javascript.rhino.jstype.JSType jSType34 = functionType31.getPropertyType("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType35 = functionType31.toMaybeFunctionType();
        boolean boolean37 = functionType35.removeProperty("hi!");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable38 = functionType35.getExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType39 = functionType35.getParameterType();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        boolean boolean48 = node46.isQuotedString();
        com.google.javascript.rhino.Node node49 = node46.removeFirstChild();
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry41.createFunctionType(jSType42, node49);
        boolean boolean51 = functionType35.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType50);
        boolean boolean52 = functionType35.isNullable();
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType35.getPropertyType("");
        boolean boolean55 = functionType35.isOrdinaryFunction();
        boolean boolean56 = functionType35.matchesNumberContext();
        com.google.javascript.rhino.Node node57 = functionType35.getRootNode();
        boolean boolean58 = functionType35.isEnumElementType();
        boolean boolean59 = functionType35.isNoType();
        boolean boolean60 = objList10.add((java.lang.Object) functionType35);
        boolean boolean61 = functionType35.hasCachedValues();
        boolean boolean62 = functionType35.isUnknownType();
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
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable38);
        org.junit.Assert.assertNull(jSType39);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01594");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int4 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable9 = node8.children();
        node3.addChildrenToBack(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int15 = node14.getSourceOffset();
        com.google.javascript.rhino.Node node16 = node3.useSourceInfoIfMissingFrom(node14);
        java.lang.String str17 = node16.toString();
        com.google.javascript.rhino.jstype.JSType jSType18 = node16.getJSType();
        com.google.common.collect.ImmutableList<java.lang.Object> objList21 = com.google.common.collect.ImmutableList.of((java.lang.Object) 10L, (java.lang.Object) (byte) 0);
        java.lang.Object[] objArray22 = objList21.toArray();
        com.google.common.collect.UnmodifiableListIterator<java.lang.Object> objItor23 = objList21.listIterator();
        boolean boolean25 = objList21.contains((java.lang.Object) (short) 10);
        java.lang.Object obj26 = null;
        boolean boolean27 = objList21.equals(obj26);
        java.lang.String str28 = objList21.toString();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable33 = node32.children();
        boolean boolean34 = node32.isQuotedString();
        node32.setLength(0);
        boolean boolean37 = node32.isScript();
        boolean boolean38 = node32.hasChildren();
        int int39 = objList21.lastIndexOf((java.lang.Object) node32);
        boolean boolean40 = node16.hasChild(node32);
        node32.removeProp(35);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeIterable9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "NUMBER 0.0 36" + "'", str17, "NUMBER 0.0 36");
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertNotNull(objList21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, 0]");
        org.junit.Assert.assertNotNull(objItor23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[10, 0]" + "'", str28, "[10, 0]");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01595");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable4 = node3.children();
        node3.setSourceFileForTesting("[10, 0]");
        node3.removeProp(36);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        java.lang.String str11 = node3.getSourceFileName();
        boolean boolean12 = node3.isNot();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeIterable4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[10, 0]" + "'", str11, "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01596");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo1 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList4 = com.google.common.collect.ImmutableList.of(jSDocInfo0, jSDocInfo1, jSDocInfo2, jSDocInfo3);
        boolean boolean6 = jSDocInfo2.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo2.hasReturnType();
        boolean boolean8 = jSDocInfo2.isNoAlias();
        java.lang.String str9 = jSDocInfo2.toString();
        com.google.javascript.rhino.Node node10 = jSDocInfo2.getAssociatedNode();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection11 = jSDocInfo2.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo2.getTypedefType();
        org.junit.Assert.assertNotNull(jSDocInfoList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSDocInfo" + "'", str9, "JSDocInfo");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(markerCollection11);
        org.junit.Assert.assertNull(jSTypeExpression12);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01597");
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
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec25 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name");
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int30 = node29.getSourceOffset();
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable35 = node34.children();
        node29.addChildrenToBack(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        int int41 = node40.getSourceOffset();
        com.google.javascript.rhino.Node node42 = node29.useSourceInfoIfMissingFrom(node40);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newNumber((double) 0, 36, 0);
        boolean boolean47 = node46.hasOneChild();
        node46.setLength(0);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable50 = node46.getAncestors();
        int int51 = node46.getLineno();
        boolean boolean52 = node46.isLocalResultCall();
        com.google.javascript.rhino.Node node53 = node42.useSourceInfoFromForTree(node46);
        com.google.javascript.rhino.Node node54 = assertionFunctionSpec25.getAssertedParam(node42);
        int int55 = node20.getIndexOfChild(node54);
        node20.setOptionalArg(true);
        boolean boolean58 = node20.isFor();
        boolean boolean59 = node20.isWhile();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeIterable10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(nodeIterable35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(ancestorIterable50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 36 + "'", int51 == 36);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01598");
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
        com.google.javascript.rhino.jstype.StaticSlot staticSlot14 = functionType10.getSlot("{1733647448}");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet12 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet12.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(staticSlot14);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01599");
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
        node88.setSourceEncodedPositionForTree(147456);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile99 = node88.getStaticSourceFile();
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
        org.junit.Assert.assertNull(staticSourceFile99);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test01600");
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
        boolean boolean43 = objectType42.isFunctionPrototypeType();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }
}
