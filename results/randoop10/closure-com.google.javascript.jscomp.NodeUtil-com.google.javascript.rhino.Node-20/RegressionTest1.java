import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00201");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        boolean boolean19 = strComparableList18.isEmpty();
        java.util.AbstractList[] abstractListArray21 = new java.util.AbstractList[0];
        @SuppressWarnings("unchecked")
        java.util.AbstractList<java.lang.Comparable<java.lang.String>>[] strComparableListArray22 = (java.util.AbstractList<java.lang.Comparable<java.lang.String>>[]) abstractListArray21;
        com.google.common.collect.ImmutableList<java.util.AbstractList<java.lang.Comparable<java.lang.String>>> strComparableListList23 = com.google.common.collect.ImmutableList.of(strComparableListArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>[] strComparableCollectionArray24 = strComparableList18.toArray((java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>[]) strComparableListArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(abstractListArray21);
        org.junit.Assert.assertNotNull(strComparableListArray22);
        org.junit.Assert.assertNotNull(strComparableListList23);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00202");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType67.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.TemplateType templateType70 = parameterizedType67.toMaybeTemplateType();
        boolean boolean72 = parameterizedType67.isPropertyTypeInferred("hi!");
        com.google.javascript.rhino.jstype.JSType jSType74 = parameterizedType67.findPropertyType("{1687381779}");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable75 = parameterizedType67.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType77 = parameterizedType67.getPropertyType("InputId: hi!");
        boolean boolean78 = jSType77.isFunctionType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumElementType69);
        org.junit.Assert.assertNull(templateType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNotNull(objectTypeIterable75);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00203");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable10 = jSTypeRegistry8.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable15 = jSTypeRegistry13.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean16 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray18 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList19 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList19, jSTypeArray18);
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry13.createFunctionTypeWithVarArgs(jSType17, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList19);
        boolean boolean22 = functionType21.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable27 = jSTypeRegistry25.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean28 = jSTypeRegistry25.shouldTolerateUndefinedValues();
        boolean boolean29 = jSTypeRegistry25.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node38 = node35.useSourceInfoIfMissingFromForTree(node37);
        boolean boolean39 = node37.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable44 = jSTypeRegistry42.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean45 = jSTypeRegistry42.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList48 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList48, jSTypeArray47);
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry42.createFunctionTypeWithVarArgs(jSType46, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList48);
        boolean boolean51 = functionType50.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType52 = jSTypeRegistry25.createEnumType("false", node37, (com.google.javascript.rhino.jstype.JSType) functionType50);
        java.util.Set<java.lang.String> strSet53 = functionType50.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair54 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType21, (com.google.javascript.rhino.jstype.JSType) functionType50);
        com.google.javascript.rhino.Node node55 = functionType21.getSource();
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType21.getPropertyType("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node63 = jSTypeRegistry61.createParameters(jSTypeArray62);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry8.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType21, true, jSTypeArray62);
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType21, "({1789792193})");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative67 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType68 = jSTypeRegistry2.getNativeType(jSTypeNative67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable10);
        org.junit.Assert.assertNotNull(jSTypeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(enumType52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertNotNull(jSType66);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00204");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node9 = node6.useSourceInfoIfMissingFromForTree(node8);
        boolean boolean10 = node8.isExprResult();
        int int11 = node8.getLineno();
        boolean boolean12 = node8.isOr();
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isRelationalOperation(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(6, node1, node8, 38, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00205");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        boolean boolean21 = node15.isGetterDef();
        node15.setLineno((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            node15.setSideEffectFlags(54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got SHEQ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00206");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        node4.setVarArgs(false);
        boolean boolean10 = node4.isDebugger();
        boolean boolean11 = node4.isNoSideEffectsCall();
        com.google.javascript.rhino.InputId inputId13 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str14 = inputId13.toString();
        node4.setInputId(inputId13);
        java.lang.String str16 = inputId13.getIdName();
        java.lang.String str17 = inputId13.toString();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "InputId: hi!" + "'", str14, "InputId: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "InputId: hi!" + "'", str17, "InputId: hi!");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00207");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node9 = node6.useSourceInfoIfMissingFromForTree(node8);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean15 = node14.isDefaultCase();
        node14.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId18 = node14.getInputId();
        node14.detachChildren();
        com.google.javascript.rhino.Node node20 = node8.copyInformationFrom(node14);
        int int21 = node14.getType();
        java.lang.String[] strArray27 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        node14.setDirectives((java.util.Set<java.lang.String>) strSet28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node38 = node35.useSourceInfoIfMissingFromForTree(node37);
        int int39 = node35.getSourceOffset();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(35, node14, node35);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node48 = node45.useSourceInfoIfMissingFromForTree(node47);
        boolean boolean49 = node47.isHook();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean52 = node51.isFalse();
        boolean boolean53 = node51.isQualifiedName();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 2, 54, (int) (short) 100);
        com.google.javascript.rhino.Node node58 = node51.srcref(node57);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node66 = node63.useSourceInfoIfMissingFromForTree(node65);
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean72 = node71.isDefaultCase();
        node71.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId75 = node71.getInputId();
        node71.detachChildren();
        com.google.javascript.rhino.Node node77 = node65.copyInformationFrom(node71);
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node85 = node82.useSourceInfoIfMissingFromForTree(node84);
        node85.setLineno(10);
        com.google.javascript.rhino.Node node88 = node71.copyInformationFrom(node85);
        com.google.javascript.rhino.Node[] nodeArray89 = new com.google.javascript.rhino.Node[] { node14, node47, node51, node88 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(45, nodeArray89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: duplicate child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(inputId75);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(nodeArray89);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00208");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        functionType10.clearCachedValues();
        int int12 = functionType10.getExtendedInterfacesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getTypeOfThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean16 = jSDocInfo15.isDefine();
        boolean boolean18 = jSDocInfo15.hasParameter("{796389407}");
        boolean boolean19 = jSDocInfo15.hasType();
        objectType13.setPropertyJSDocInfo("{2120122849}", jSDocInfo15);
        objectType13.clearResolved();
        com.google.javascript.rhino.jstype.ObjectType objectType22 = objectType13.getImplicitPrototype();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(objectType22);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00209");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList1 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableList1.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.String str6 = ternaryValue5.toString();
        boolean boolean7 = strComparableList1.contains((java.lang.Object) str6);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList26 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray25);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator27 = strComparableList26.spliterator();
        int int29 = strComparableList26.lastIndexOf((java.lang.Object) "false");
        com.google.common.collect.UnmodifiableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor30 = strComparableList26.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = strComparableList1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList1);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "false" + "'", str6, "false");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strComparableList26);
        org.junit.Assert.assertNotNull(strComparableSpliterator27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strComparableItor30);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00210");
        com.google.common.collect.ImmutableList.Builder<java.util.AbstractCollection<java.lang.Comparable<java.lang.String>>> strComparableCollectionBuilder0 = com.google.common.collect.ImmutableList.builder();
        org.junit.Assert.assertNotNull(strComparableCollectionBuilder0);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00211");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType32.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable73 = jSTypeRegistry71.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean74 = jSTypeRegistry71.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList77 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList77, jSTypeArray76);
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry71.createFunctionTypeWithVarArgs(jSType75, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList77);
        boolean boolean80 = functionType79.canBeCalled();
        boolean boolean81 = functionType79.hasAnyTemplateInternal();
        int int82 = functionType79.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = functionType79.getParentScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType84 = functionType68.getLeastSupertype((com.google.javascript.rhino.jstype.JSType) objectType83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertNotNull(jSTypeIterable73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objectType83);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00212");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean4 = node3.isGetProp();
        boolean boolean5 = node3.isNumber();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node10.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int17 = node16.getType();
        boolean boolean18 = node16.isBlock();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, node3, node10, node16, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node22 = node3.detachFromParent();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node30 = node27.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean36 = node35.isDefaultCase();
        node35.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId39 = node35.getInputId();
        node35.detachChildren();
        com.google.javascript.rhino.Node node41 = node29.copyInformationFrom(node35);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node49 = node46.useSourceInfoIfMissingFromForTree(node48);
        node49.setLineno(10);
        com.google.javascript.rhino.Node node52 = node35.copyInformationFrom(node49);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node22, node35, (int) ' ', 1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node63 = node60.useSourceInfoIfMissingFromForTree(node62);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder71 = node70.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean77 = node76.isDefaultCase();
        node76.setVarArgs(true);
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node((int) 'a', node70, node76, node84);
        boolean boolean86 = node85.isGetterDef();
        com.google.javascript.rhino.Node node88 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(45, node85, node88, 44, 16);
        boolean boolean92 = node85.isOptionalArg();
        com.google.javascript.rhino.Node node93 = node85.getNext();
        com.google.javascript.jscomp.CodingConvention.Bind bind94 = new com.google.javascript.jscomp.CodingConvention.Bind(node55, node63, node85);
        java.lang.Class<?> wildcardClass95 = node55.getClass();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00213");
        com.google.javascript.rhino.Node[] nodeArray1 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(4095, nodeArray1);
        java.lang.Object obj4 = null;
        node2.putProp((int) 'a', obj4);
        org.junit.Assert.assertNotNull(nodeArray1);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00214");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node6.isExprResult();
        boolean boolean9 = node6.isDelProp();
        com.google.javascript.rhino.InputId inputId10 = node6.getInputId();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node19 = node16.useSourceInfoIfMissingFromForTree(node18);
        node19.setLineno(10);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder28 = node27.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean34 = node33.isDefaultCase();
        node33.setVarArgs(true);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((int) 'a', node27, node33, node41);
        boolean boolean43 = node42.isGetterDef();
        boolean boolean44 = node42.isQuotedString();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int50 = node49.getType();
        node49.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int58 = node57.getType();
        node57.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(40, node19, node42, node49, node57);
        boolean boolean62 = node42.isArrayLit();
        com.google.javascript.rhino.Node node63 = node6.useSourceInfoIfMissingFromForTree(node42);
        boolean boolean64 = node42.isIn();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(inputId10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 45 + "'", int50 == 45);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 45 + "'", int58 == 45);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00215");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("{905855295}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00216");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType67.autobox();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable74 = jSTypeRegistry72.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean75 = jSTypeRegistry72.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList78 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList78, jSTypeArray77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry72.createFunctionTypeWithVarArgs(jSType76, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList78);
        boolean boolean81 = jSType69.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean83 = functionType80.isPropertyTypeInferred("SHEQ  1 [var_args_name: 1]\n");
        java.lang.String str84 = functionType80.getReferenceName();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(jSTypeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00217");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("function (): {1698042926}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00218");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        java.util.List<java.lang.String> strList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry2.setTemplateTypeNames(strList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00219");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags23 = new com.google.javascript.rhino.Node.SideEffectFlags(100);
        sideEffectFlags23.setAllFlags();
        sideEffectFlags23.setMutatesGlobalState();
        // The following exception was thrown during execution in test generation
        try {
            node20.setSideEffectFlags(sideEffectFlags23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got BITXOR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00220");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry9.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean12 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable17 = jSTypeRegistry15.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean18 = jSTypeRegistry15.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable23 = jSTypeRegistry21.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean24 = jSTypeRegistry21.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = jSTypeRegistry21.getErrorReporter();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList26 = com.google.common.collect.ImmutableList.of(jSTypeRegistry2, jSTypeRegistry9, jSTypeRegistry15, jSTypeRegistry21);
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable31 = jSTypeRegistry29.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean32 = jSTypeRegistry29.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable37 = jSTypeRegistry35.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean38 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList41, jSTypeArray40);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry35.createFunctionTypeWithVarArgs(jSType39, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        boolean boolean44 = functionType43.canBeCalled();
        boolean boolean45 = functionType43.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry29.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType43, jSTypeArray46);
        com.google.javascript.rhino.Node node48 = jSTypeRegistry9.createOptionalParameters(jSTypeArray46);
        com.google.javascript.rhino.ErrorReporter errorReporter49 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter49, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable53 = jSTypeRegistry51.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean54 = jSTypeRegistry51.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList57 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList57, jSTypeArray56);
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry51.createFunctionTypeWithVarArgs(jSType55, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList57);
        boolean boolean60 = functionType59.canBeCalled();
        boolean boolean61 = functionType59.hasAnyTemplateInternal();
        int int62 = functionType59.getPropertiesCount();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection63 = jSTypeRegistry9.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType59);
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList64 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType59.setImplementedInterfaces(objectTypeList64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(errorReporter25);
        org.junit.Assert.assertNotNull(jSTypeRegistryList26);
        org.junit.Assert.assertNotNull(jSTypeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(jSTypeIterable53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(functionTypeCollection63);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00221");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean23 = node22.isGetProp();
        boolean boolean24 = node22.isNumber();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder30 = node29.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int36 = node35.getType();
        boolean boolean37 = node35.isBlock();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((int) (short) 10, node22, node29, node35, (int) (byte) 10, 44);
        boolean boolean41 = strComparableList18.contains((java.lang.Object) 44);
        boolean boolean42 = strComparableList18.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList18.add(47, (java.lang.Comparable<java.lang.String>) "{2044072356}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 45 + "'", int36 == 45);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00222");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder26 = node25.getJsDocBuilderForNode();
        node20.addChildrenToFront(node25);
        com.google.javascript.rhino.Node node28 = node25.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = node28.isInstanceOf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder26);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00223");
        java.lang.String[] strArray1 = new java.lang.String[] { "Unknown class name" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.Iterator<java.lang.String> strItor4 = strSet2.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator5 = strSet2.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable10 = jSTypeRegistry8.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean11 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry8.createFunctionTypeWithVarArgs(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        boolean boolean17 = functionType16.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable22 = jSTypeRegistry20.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean23 = jSTypeRegistry20.shouldTolerateUndefinedValues();
        boolean boolean24 = jSTypeRegistry20.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node33 = node30.useSourceInfoIfMissingFromForTree(node32);
        boolean boolean34 = node32.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable39 = jSTypeRegistry37.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean40 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList43 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43, jSTypeArray42);
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry37.createFunctionTypeWithVarArgs(jSType41, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList43);
        boolean boolean46 = functionType45.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType47 = jSTypeRegistry20.createEnumType("false", node32, (com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType45.getConstructor();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair49 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType16, (com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.jstype.JSType.TypePair[] typePairArray50 = new com.google.javascript.rhino.jstype.JSType.TypePair[] { typePair49 };
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair[] typePairArray51 = strSet2.toArray(typePairArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strSpliterator5);
        org.junit.Assert.assertNotNull(jSTypeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(enumType47);
        org.junit.Assert.assertNull(functionType48);
        org.junit.Assert.assertNotNull(typePairArray50);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00224");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        enumType29.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo33);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean48 = node47.isDefaultCase();
        node47.setVarArgs(true);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) 'a', node41, node47, node55);
        boolean boolean57 = enumType29.defineElement("{209777139}", node55);
        java.lang.Iterable iterable58 = enumType29.getCtorExtendedInterfaces();
        java.lang.String str59 = enumType29.getReferenceName();
        boolean boolean61 = enumType29.isPropertyTypeInferred("{209777139}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = enumType29.getJSDocInfo();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(iterable58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "enum{false}" + "'", str59, "enum{false}");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jSDocInfo62);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00225");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.canBeCalled();
        boolean boolean12 = functionType10.isStringValueType();
        boolean boolean13 = functionType10.isNoObjectType();
        boolean boolean14 = functionType10.isAllType();
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            functionType10.setExtendedInterfaces(objectTypeList15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00226");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.size();
        strComparableList2.clear();
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("{proxy:function (): {882920012}}");
        boolean boolean9 = strComparableList2.remove((java.lang.Object) "{proxy:function (): {882920012}}");
        strComparableList2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableList2.listIterator(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00227");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", jSTypeNative1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean8 = node7.isDefaultCase();
        node7.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId11 = node7.getInputId();
        node7.detachChildren();
        boolean boolean13 = node7.isNot();
        boolean boolean14 = node7.isSetterDef();
        com.google.javascript.rhino.Node node15 = assertionFunctionSpec2.getAssertedParam(node7);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder22 = node21.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean28 = node27.isDefaultCase();
        node27.setVarArgs(true);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) 'a', node21, node27, node35);
        com.google.javascript.rhino.InputId inputId37 = node21.getInputId();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node45 = node42.useSourceInfoIfMissingFromForTree(node44);
        node45.setLineno(10);
        int int48 = node45.getType();
        java.util.Set<java.lang.String> strSet49 = node45.getDirectives();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean55 = node54.isDefaultCase();
        node54.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId58 = node54.getInputId();
        boolean boolean59 = node54.isCase();
        boolean boolean60 = node54.isInc();
        com.google.javascript.jscomp.CodingConvention.Bind bind61 = new com.google.javascript.jscomp.CodingConvention.Bind(node21, node45, node54);
        int int62 = node45.getSourceOffset();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = null;
        com.google.javascript.rhino.jstype.JSType jSType64 = assertionFunctionSpec2.getAssertedType(node45, jSTypeRegistry63);
        boolean boolean65 = node45.isBlock();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 45 + "'", int48 == 45);
        org.junit.Assert.assertNull(strSet49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(inputId58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00228");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node11.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean18 = node17.isDefaultCase();
        node17.setVarArgs(true);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) 'a', node11, node17, node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        com.google.javascript.rhino.Node node28 = node4.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node25.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry32.createFunctionTypeWithVarArgs(jSType36, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        boolean boolean41 = functionType40.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        boolean boolean48 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node57 = node54.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean58 = node56.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable63 = jSTypeRegistry61.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean64 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry61.createFunctionTypeWithVarArgs(jSType65, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean70 = functionType69.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType71 = jSTypeRegistry44.createEnumType("false", node56, (com.google.javascript.rhino.jstype.JSType) functionType69);
        java.util.Set<java.lang.String> strSet72 = functionType69.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType40, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.Node node74 = functionType40.getSource();
        node25.setJSType((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType40.getPrototype();
        java.lang.String str77 = functionType40.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType78 = functionType40.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(staticSourceFile29);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(enumType71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "function (): ?" + "'", str77, "function (): ?");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00229");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        java.util.Set<java.lang.String> strSet30 = functionType27.getOwnPropertyNames();
        strSet30.clear();
        strSet30.clear();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00230");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Comparable<java.lang.String>> strComparableList21 = strComparableList18.subList((int) ' ', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (32) must not be greater than size (17)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00231");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        node9.setLength(52);
        node9.setLength(29);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00232");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        boolean boolean78 = strComparableList18.contains((java.lang.Object) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream79 = strComparableList18.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList80 = strComparableList18.reverse();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = strComparableList80.add((java.lang.Comparable<java.lang.String>) "{1250412085}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strComparableStream79);
        org.junit.Assert.assertNotNull(strComparableList80);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00233");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType67.toMaybeEnumElementType();
        int int70 = parameterizedType67.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType71 = parameterizedType67.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType72 = objectType71.unboxesTo();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumElementType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNull(jSType72);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00234");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = parameterizedType67.getConstructor();
        boolean boolean69 = parameterizedType67.isAllType();
        boolean boolean70 = parameterizedType67.matchesStringContext();
        com.google.javascript.rhino.jstype.JSType jSType71 = parameterizedType67.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType73 = jSType71.getRestrictedTypeGivenToBooleanOutcome(true);
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(jSType73);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00235");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean4 = node3.isGetProp();
        boolean boolean5 = node3.isNumber();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node10.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int17 = node16.getType();
        boolean boolean18 = node16.isBlock();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, node3, node10, node16, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node22 = node3.detachFromParent();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node30 = node27.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean36 = node35.isDefaultCase();
        node35.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId39 = node35.getInputId();
        node35.detachChildren();
        com.google.javascript.rhino.Node node41 = node29.copyInformationFrom(node35);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node49 = node46.useSourceInfoIfMissingFromForTree(node48);
        node49.setLineno(10);
        com.google.javascript.rhino.Node node52 = node35.copyInformationFrom(node49);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node22, node35, (int) ' ', 1);
        boolean boolean56 = node22.isHook();
        boolean boolean57 = node22.isObjectLit();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00236");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType32.getOwnerFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = functionType32.dereference();
        java.lang.String str70 = functionType32.getReferenceName();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable71 = functionType32.getAllImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(objectTypeIterable71);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00237");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        org.junit.Assert.assertNotNull(ternaryValue0);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00238");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        enumType29.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo33);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean48 = node47.isDefaultCase();
        node47.setVarArgs(true);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) 'a', node41, node47, node55);
        boolean boolean57 = enumType29.defineElement("{209777139}", node55);
        java.lang.Iterable iterable58 = enumType29.getCtorExtendedInterfaces();
        com.google.javascript.rhino.Node node59 = enumType29.getSource();
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder66 = node65.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean72 = node71.isDefaultCase();
        node71.setVarArgs(true);
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node((int) 'a', node65, node71, node79);
        boolean boolean81 = node80.isGetterDef();
        boolean boolean82 = node80.isQuotedString();
        node80.setSourceEncodedPosition(4);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression86 = new com.google.javascript.rhino.JSTypeExpression(node80, "Unknown class name");
        com.google.javascript.rhino.Node node87 = jSTypeExpression86.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            node59.removeChild(node87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(iterable58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node87);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00239");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isDefine();
        boolean boolean3 = jSDocInfo0.hasParameter("{796389407}");
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getEnumParameterType();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean11 = node10.isDefaultCase();
        boolean boolean12 = node10.isTry();
        com.google.javascript.rhino.Node node13 = node10.getLastSibling();
        boolean boolean14 = node10.isBlock();
        boolean boolean15 = node10.isNE();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.io.Serializable> serializableList16 = com.google.common.collect.ImmutableList.of((java.io.Serializable) jSTypeExpression5, (java.io.Serializable) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 0");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00240");
        com.google.javascript.rhino.Node[] nodeArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(4, nodeArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00241");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        java.lang.String str77 = strComparableList37.toString();
        boolean boolean79 = strComparableList37.equals((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable81 = strComparableList37.remove(8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" + "'", str77, "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00242");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean4 = node3.isGetProp();
        boolean boolean5 = node3.isNumber();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node10.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int17 = node16.getType();
        boolean boolean18 = node16.isBlock();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, node3, node10, node16, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node22 = node3.detachFromParent();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node30 = node27.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean36 = node35.isDefaultCase();
        node35.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId39 = node35.getInputId();
        node35.detachChildren();
        com.google.javascript.rhino.Node node41 = node29.copyInformationFrom(node35);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node49 = node46.useSourceInfoIfMissingFromForTree(node48);
        node49.setLineno(10);
        com.google.javascript.rhino.Node node52 = node35.copyInformationFrom(node49);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node22, node35, (int) ' ', 1);
        boolean boolean56 = node22.isHook();
        java.lang.String str57 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node22);
        boolean boolean58 = node22.isString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo59 = node22.getJSDocInfo();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(jSDocInfo59);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00243");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.Node[]> nodeArrayBuilder0 = com.google.common.collect.ImmutableList.builder();
        org.junit.Assert.assertNotNull(nodeArrayBuilder0);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00244");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable8 = node6.getAncestors();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = node6.getExistingIntProp(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 12");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(ancestorIterable8);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00245");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = parameterizedType67.getOwnerFunction();
        boolean boolean70 = parameterizedType67.isNoResolvedType();
        com.google.javascript.rhino.jstype.ObjectType objectType71 = parameterizedType67.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = parameterizedType67.getTypesUnderInequality(jSType72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectType71);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00246");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.canBeCalled();
        boolean boolean12 = functionType10.isStringValueType();
        boolean boolean13 = functionType10.isNoObjectType();
        boolean boolean14 = functionType10.isRecordType();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable19 = jSTypeRegistry17.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean20 = jSTypeRegistry17.shouldTolerateUndefinedValues();
        boolean boolean21 = jSTypeRegistry17.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node30 = node27.useSourceInfoIfMissingFromForTree(node29);
        boolean boolean31 = node29.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable36 = jSTypeRegistry34.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean37 = jSTypeRegistry34.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry34.createFunctionTypeWithVarArgs(jSType38, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        boolean boolean43 = functionType42.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType44 = jSTypeRegistry17.createEnumType("false", node29, (com.google.javascript.rhino.jstype.JSType) functionType42);
        boolean boolean46 = enumType44.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = null;
        enumType44.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo48);
        boolean boolean51 = enumType44.isPropertyInExterns("Unknown class name");
        com.google.javascript.rhino.Node node53 = enumType44.getPropertyNode("Not declared as a type name");
        boolean boolean55 = enumType44.isPropertyTypeInferred("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean56 = functionType10.isSubtype((com.google.javascript.rhino.jstype.JSType) enumType44);
        boolean boolean58 = functionType10.hasProperty("{1267158518}");
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(enumType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00247");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node20.isGetterDef();
        boolean boolean22 = node20.isQuotedString();
        node20.setSourceEncodedPosition(4);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = new com.google.javascript.rhino.JSTypeExpression(node20, "Unknown class name");
        com.google.javascript.rhino.Node node27 = jSTypeExpression26.getRoot();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression26);
        boolean boolean29 = jSTypeExpression28.isVarArgs();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(jSTypeExpression28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00248");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType67.autobox();
        java.util.Set set70 = parameterizedType67.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.UnionType unionType71 = parameterizedType67.toMaybeUnionType();
        boolean boolean72 = parameterizedType67.canBeCalled();
        boolean boolean73 = parameterizedType67.isInstanceType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = parameterizedType67.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = parameterizedType67.hasAnyTemplateInternal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(unionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(jSDocInfo74);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00249");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = node20.getStaticSourceFile();
        java.lang.String str22 = node20.toString();
        // The following exception was thrown during execution in test generation
        try {
            node20.setSideEffectFlags((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got BITXOR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(staticSourceFile21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "BITXOR 10" + "'", str22, "BITXOR 10");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00250");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        jSTypeRegistry2.forwardDeclareType("{1687381779}");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType14 = jSTypeRegistry2.createUnionType(jSTypeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00251");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isDefine();
        boolean boolean3 = jSDocInfo0.hasParameter("{796389407}");
        boolean boolean4 = jSDocInfo0.hasType();
        jSDocInfo0.setDeprecated(false);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00252");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.size();
        strComparableList2.clear();
        java.lang.Object[] objArray7 = strComparableList2.toArray();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00253");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDebugger();
        boolean boolean7 = node4.isString();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean20 = node19.isDefaultCase();
        node19.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) 'a', node13, node19, node27);
        com.google.javascript.rhino.InputId inputId29 = node13.getInputId();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoFrom(node13);
        com.google.javascript.rhino.Node node31 = node4.cloneTree();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node39 = node36.useSourceInfoIfMissingFromForTree(node38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean45 = node44.isDefaultCase();
        node44.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId48 = node44.getInputId();
        node44.detachChildren();
        com.google.javascript.rhino.Node node50 = node38.copyInformationFrom(node44);
        java.lang.String str51 = node44.toStringTree();
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        node44.setJSType(jSType52);
        boolean boolean54 = node44.isObjectLit();
        node31.addChildToBack(node44);
        boolean boolean56 = node31.isInc();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable57 = node31.getAncestors();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node65 = node62.useSourceInfoIfMissingFromForTree(node64);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean71 = node70.isDefaultCase();
        node70.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId74 = node70.getInputId();
        node70.detachChildren();
        com.google.javascript.rhino.Node node76 = node64.copyInformationFrom(node70);
        com.google.javascript.rhino.Node node77 = node31.copyInformationFrom(node70);
        com.google.javascript.rhino.Node node79 = node77.getAncestor(4097);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "SHEQ  1 [var_args_name: 1]\n" + "'", str51, "SHEQ  1 [var_args_name: 1]\n");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(ancestorIterable57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(inputId74);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNull(node79);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00254");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node8 = node5.useSourceInfoIfMissingFromForTree(node7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean11 = node10.isFalse();
        boolean boolean12 = node7.hasChild(node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean18 = node17.isDefaultCase();
        node17.setVarArgs(true);
        node17.setVarArgs(false);
        boolean boolean23 = node17.isDebugger();
        boolean boolean24 = node17.isNoSideEffectsCall();
        com.google.javascript.rhino.InputId inputId26 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str27 = inputId26.toString();
        node17.setInputId(inputId26);
        node7.setInputId(inputId26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newExpr(node7);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder37 = node36.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean43 = node42.isDefaultCase();
        node42.setVarArgs(true);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) 'a', node36, node42, node50);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean57 = node56.isDefaultCase();
        node56.setVarArgs(true);
        node56.setVarArgs(false);
        node56.setLength((int) (byte) 0);
        node56.removeProp((int) 'a');
        boolean boolean66 = node56.isSwitch();
        com.google.javascript.rhino.Node node71 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int72 = node71.getType();
        com.google.javascript.rhino.Node node78 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder79 = node78.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node84 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean85 = node84.isDefaultCase();
        node84.setVarArgs(true);
        com.google.javascript.rhino.Node node92 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node((int) 'a', node78, node84, node92);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile94 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node92);
        com.google.javascript.rhino.Node node95 = node71.useSourceInfoFromForTree(node92);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node98 = new com.google.javascript.rhino.Node(46, node30, node36, node56, node71, 40, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "InputId: hi!" + "'", str27, "InputId: hi!");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 45 + "'", int72 == 45);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder79);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertNull(staticSourceFile94);
        org.junit.Assert.assertNotNull(node95);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00255");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = parameterizedType67.getConstructor();
        boolean boolean69 = parameterizedType67.isNominalType();
        boolean boolean70 = parameterizedType67.isNullable();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = parameterizedType67.getJSDocInfo();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate72 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = parameterizedType67.setValidator(jSTypePredicate72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(jSDocInfo71);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00256");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType67.toMaybeEnumElementType();
        int int70 = parameterizedType67.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType71 = parameterizedType67.getTypeOfThis();
        java.lang.String str72 = parameterizedType67.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType73 = parameterizedType67.toMaybeFunctionType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumElementType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objectType71);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "{proxy:function (): {693061641}}" + "'", str72, "{proxy:function (): {693061641}}");
        org.junit.Assert.assertNotNull(functionType73);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00257");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node24 = jSTypeRegistry22.createParameters(jSTypeArray23);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable29 = jSTypeRegistry27.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean30 = jSTypeRegistry27.shouldTolerateUndefinedValues();
        boolean boolean31 = jSTypeRegistry27.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node40 = node37.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean41 = node39.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList50 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList50, jSTypeArray49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry44.createFunctionTypeWithVarArgs(jSType48, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList50);
        boolean boolean53 = functionType52.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType54 = jSTypeRegistry27.createEnumType("false", node39, (com.google.javascript.rhino.jstype.JSType) functionType52);
        java.util.Set<java.lang.String> strSet55 = functionType52.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable60 = jSTypeRegistry58.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean61 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node71 = node68.useSourceInfoIfMissingFromForTree(node70);
        boolean boolean72 = node70.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable77 = jSTypeRegistry75.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean78 = jSTypeRegistry75.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList81 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList81, jSTypeArray80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry75.createFunctionTypeWithVarArgs(jSType79, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList81);
        boolean boolean84 = functionType83.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType85 = jSTypeRegistry58.createEnumType("false", node70, (com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.jstype.FunctionType functionType86 = functionType83.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType87 = jSTypeRegistry22.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType52, (com.google.javascript.rhino.jstype.JSType) functionType86);
        boolean boolean88 = parameterizedType87.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType87.getIndexType();
        boolean boolean90 = strComparableList18.equals((java.lang.Object) jSType89);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "{815546278}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(enumType54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(jSTypeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(enumType85);
        org.junit.Assert.assertNull(functionType86);
        org.junit.Assert.assertNotNull(parameterizedType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00258");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        java.util.Set<java.lang.String> strSet30 = functionType27.getOwnPropertyNames();
        boolean boolean31 = functionType27.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable36 = jSTypeRegistry34.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean37 = jSTypeRegistry34.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry34.createFunctionTypeWithVarArgs(jSType38, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        boolean boolean43 = functionType42.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable48 = jSTypeRegistry46.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean49 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        boolean boolean50 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node59 = node56.useSourceInfoIfMissingFromForTree(node58);
        boolean boolean60 = node58.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable65 = jSTypeRegistry63.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean66 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList69 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList69, jSTypeArray68);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry63.createFunctionTypeWithVarArgs(jSType67, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList69);
        boolean boolean72 = functionType71.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType73 = jSTypeRegistry46.createEnumType("false", node58, (com.google.javascript.rhino.jstype.JSType) functionType71);
        java.util.Set<java.lang.String> strSet74 = functionType71.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair75 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType42, (com.google.javascript.rhino.jstype.JSType) functionType71);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable76 = functionType71.getImplementedInterfaces();
        boolean boolean77 = functionType27.hasEqualCallType(functionType71);
        boolean boolean78 = functionType27.matchesUint32Context();
        boolean boolean80 = functionType27.isPropertyTypeDeclared("");
        boolean boolean81 = functionType27.isUnknownType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(enumType73);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(objectTypeIterable76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00259");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        node9.setLength(52);
        boolean boolean23 = node9.isSetterDef();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node31 = node28.useSourceInfoIfMissingFromForTree(node30);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean34 = node33.isFalse();
        boolean boolean35 = node30.hasChild(node33);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean41 = node40.isDefaultCase();
        node40.setVarArgs(true);
        node40.setVarArgs(false);
        boolean boolean46 = node40.isDebugger();
        boolean boolean47 = node40.isNoSideEffectsCall();
        com.google.javascript.rhino.InputId inputId49 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str50 = inputId49.toString();
        node40.setInputId(inputId49);
        node30.setInputId(inputId49);
        com.google.javascript.rhino.Node node53 = node30.cloneTree();
        com.google.javascript.rhino.Node node54 = node9.copyInformationFrom(node53);
        boolean boolean55 = node9.isThis();
        boolean boolean56 = node9.isOr();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "InputId: hi!" + "'", str50, "InputId: hi!");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00260");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean6 = node5.isDefaultCase();
        node5.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId9 = node5.getInputId();
        node5.detachChildren();
        boolean boolean11 = node5.isNull();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList14 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean15 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableList14.add((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableList14.size();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean23 = node22.isDefaultCase();
        node22.setVarArgs(true);
        node22.setVarArgs(false);
        boolean boolean28 = strComparableList14.contains((java.lang.Object) node22);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int34 = node33.getType();
        node33.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(54, node5, node22, node33);
        // The following exception was thrown during execution in test generation
        try {
            node37.setString("Not declared as a type name");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 54");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 45 + "'", int34 == 45);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00261");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node4.isSwitch();
        boolean boolean9 = node4.isName();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder16 = node15.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean22 = node21.isDefaultCase();
        node21.setVarArgs(true);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) 'a', node15, node21, node29);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node29);
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node39 = node36.useSourceInfoIfMissingFromForTree(node38);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean42 = node41.isFalse();
        boolean boolean43 = node38.hasChild(node41);
        com.google.javascript.rhino.Node node44 = node29.useSourceInfoFromForTree(node38);
        com.google.javascript.rhino.Node node45 = node4.srcrefTree(node29);
        // The following exception was thrown during execution in test generation
        try {
            node29.setDouble((double) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SHEQ  is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(staticSourceFile31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00262");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isDefine();
        boolean boolean3 = jSDocInfo0.hasParameter("{796389407}");
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getModifies();
        boolean boolean6 = jSDocInfo0.hasDescriptionForParameter("{726289308}");
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00263");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13, jSTypeArray12);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry7.createFunctionTypeWithVarArgs(jSType11, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.Node node16 = jSTypeRegistry2.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        com.google.javascript.rhino.jstype.JSType jSType18 = jSTypeRegistry2.getType("NUMBER 100.0");
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00264");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        enumType29.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo33);
        boolean boolean36 = enumType29.isPropertyInExterns("Unknown class name");
        boolean boolean37 = enumType29.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType38 = enumType29.unboxesTo();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSType38);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00265");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        boolean boolean6 = node4.isTry();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = node4.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SHEQ  1 is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00266");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry9.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean12 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList15, jSTypeArray14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry9.createFunctionTypeWithVarArgs(jSType13, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList15);
        boolean boolean18 = functionType17.canBeCalled();
        boolean boolean19 = functionType17.hasAnyTemplateInternal();
        int int20 = functionType17.getPropertiesCount();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType17.getOwnImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType17);
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(4095, nodeArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry2.createInterfaceType("{126693880}", node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(nodeArray25);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00267");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node5 = node4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            node5.setVarArgs(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00268");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean4 = node3.isGetProp();
        boolean boolean5 = node3.isNumber();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node10.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int17 = node16.getType();
        boolean boolean18 = node16.isBlock();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, node3, node10, node16, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node22 = node3.detachFromParent();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node30 = node27.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean36 = node35.isDefaultCase();
        node35.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId39 = node35.getInputId();
        node35.detachChildren();
        com.google.javascript.rhino.Node node41 = node29.copyInformationFrom(node35);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node49 = node46.useSourceInfoIfMissingFromForTree(node48);
        node49.setLineno(10);
        com.google.javascript.rhino.Node node52 = node35.copyInformationFrom(node49);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node22, node35, (int) ' ', 1);
        boolean boolean56 = node55.isTry();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags58 = new com.google.javascript.rhino.Node.SideEffectFlags(100);
        sideEffectFlags58.setAllFlags();
        sideEffectFlags58.setMutatesGlobalState();
        sideEffectFlags58.setThrows();
        sideEffectFlags58.setThrows();
        // The following exception was thrown during execution in test generation
        try {
            node55.setSideEffectFlags(sideEffectFlags58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got ERROR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00269");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.size();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry8.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable15 = jSTypeRegistry13.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean16 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        boolean boolean17 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node26 = node23.useSourceInfoIfMissingFromForTree(node25);
        boolean boolean27 = node25.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable32 = jSTypeRegistry30.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean33 = jSTypeRegistry30.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList36 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList36, jSTypeArray35);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry30.createFunctionTypeWithVarArgs(jSType34, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList36);
        boolean boolean39 = functionType38.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType40 = jSTypeRegistry13.createEnumType("false", node25, (com.google.javascript.rhino.jstype.JSType) functionType38);
        java.util.Set<java.lang.String> strSet41 = functionType38.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        boolean boolean48 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node57 = node54.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean58 = node56.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable63 = jSTypeRegistry61.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean64 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry61.createFunctionTypeWithVarArgs(jSType65, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean70 = functionType69.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType71 = jSTypeRegistry44.createEnumType("false", node56, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType69.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = jSTypeRegistry8.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType38, (com.google.javascript.rhino.jstype.JSType) functionType72);
        java.lang.String str74 = functionType38.toString();
        boolean boolean75 = strComparableList2.remove((java.lang.Object) str74);
        boolean boolean77 = strComparableList2.contains((java.lang.Object) "{967704162}");
        java.lang.Object[] objArray78 = strComparableList2.toArray();
        java.util.stream.Stream[] streamArray80 = new java.util.stream.Stream[0];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>>[] strComparableStreamArray81 = (java.util.stream.Stream<java.lang.Comparable<java.lang.String>>[]) streamArray80;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.Comparable<java.lang.String>>[] strComparableStreamArray82 = strComparableList2.toArray((java.util.stream.Stream<java.lang.Comparable<java.lang.String>>[]) streamArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(enumType40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(enumType71);
        org.junit.Assert.assertNull(functionType72);
        org.junit.Assert.assertNotNull(parameterizedType73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "function (): ?" + "'", str74, "function (): ?");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[, ]");
        org.junit.Assert.assertNotNull(streamArray80);
        org.junit.Assert.assertNotNull(strComparableStreamArray81);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00270");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList47 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray46);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator48 = strComparableList47.spliterator();
        boolean boolean49 = strSet26.equals((java.lang.Object) strComparableList47);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList51 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor52 = strComparableList51.iterator();
        boolean boolean53 = strSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList51);
        boolean boolean54 = strSet26.isEmpty();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strComparableList47);
        org.junit.Assert.assertNotNull(strComparableSpliterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strComparableList51);
        org.junit.Assert.assertNotNull(strComparableItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00271");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        boolean boolean32 = enumType29.matchesStringContext();
        boolean boolean33 = enumType29.isConstructor();
        com.google.javascript.rhino.jstype.EnumType enumType34 = enumType29.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType35 = enumType29.toMaybeEnumElementType();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean42 = node41.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection43 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node41);
        boolean boolean44 = node41.isLabel();
        boolean boolean45 = node41.isGetterDef();
        boolean boolean46 = enumType29.defineElement("{proxy:function (): {125279184}}", node41);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = node41.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SHEQ  1 is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNull(enumElementType35);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeCollection43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00272");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        boolean boolean32 = enumType29.matchesStringContext();
        java.lang.String str33 = enumType29.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = enumType29.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = functionType34.isRecordType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{898347690}" + "'", str33, "{898347690}");
        org.junit.Assert.assertNull(functionType34);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00273");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean2 = node1.isFalse();
        boolean boolean3 = node1.isGetterDef();
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00274");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        boolean boolean69 = parameterizedType67.isConstructor();
        boolean boolean70 = parameterizedType67.isEmptyType();
        boolean boolean72 = parameterizedType67.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.FunctionType functionType73 = parameterizedType67.getConstructor();
        boolean boolean74 = parameterizedType67.isInstanceType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str77 = jSDocInfo76.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression78 = jSDocInfo76.getType();
        parameterizedType67.setPropertyJSDocInfo("NUMBER 100.0", jSDocInfo76);
        boolean boolean81 = parameterizedType67.hasOwnProperty("{585923242}");
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(jSTypeExpression78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00275");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Unknown class name", jSTypeNative1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node11 = node8.useSourceInfoIfMissingFromForTree(node10);
        node11.setLineno(10);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node19.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean26 = node25.isDefaultCase();
        node25.setVarArgs(true);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((int) 'a', node19, node25, node33);
        boolean boolean35 = node34.isGetterDef();
        boolean boolean36 = node34.isQuotedString();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int42 = node41.getType();
        node41.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int50 = node49.getType();
        node49.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(40, node11, node34, node41, node49);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node60 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node61 = node58.useSourceInfoIfMissingFromForTree(node60);
        node61.setIsSyntheticBlock(true);
        java.lang.String str64 = node61.getString();
        boolean boolean65 = node53.hasChild(node61);
        com.google.javascript.rhino.ErrorReporter errorReporter66 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter66, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node70 = jSTypeRegistry68.createParameters(jSTypeArray69);
        com.google.javascript.rhino.jstype.JSType jSType71 = assertionFunctionSpec2.getAssertedType(node53, jSTypeRegistry68);
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean75 = node74.isGetProp();
        boolean boolean76 = node74.isNumber();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder82 = node81.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int88 = node87.getType();
        boolean boolean89 = node87.isBlock();
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node((int) (short) 10, node74, node81, node87, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node93 = node74.detachFromParent();
        int int94 = node53.getIndexOfChild(node93);
        boolean boolean95 = node53.isParamList();
        boolean boolean96 = node53.isHook();
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 45 + "'", int42 == 45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 45 + "'", int50 == 45);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder82);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 45 + "'", int88 == 45);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00276");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList47 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray46);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator48 = strComparableList47.spliterator();
        boolean boolean49 = strSet26.equals((java.lang.Object) strComparableList47);
        java.lang.Object[] objArray50 = strSet26.toArray();
        java.lang.Object[] objArray51 = strSet26.toArray();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strComparableList47);
        org.junit.Assert.assertNotNull(strComparableSpliterator48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00277");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean36 = enumType34.isPropertyTypeDeclared("");
        boolean boolean37 = enumType34.matchesStringContext();
        boolean boolean39 = enumType34.isPropertyTypeInferred("Not declared as a type name");
        boolean boolean41 = enumType34.isPropertyTypeDeclared("{1400315076}");
        boolean boolean42 = enumType34.isNumberValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable47 = jSTypeRegistry45.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean48 = jSTypeRegistry45.shouldTolerateUndefinedValues();
        boolean boolean49 = jSTypeRegistry45.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node58 = node55.useSourceInfoIfMissingFromForTree(node57);
        boolean boolean59 = node57.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable64 = jSTypeRegistry62.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean65 = jSTypeRegistry62.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList68 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList68, jSTypeArray67);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry62.createFunctionTypeWithVarArgs(jSType66, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList68);
        boolean boolean71 = functionType70.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType72 = jSTypeRegistry45.createEnumType("false", node57, (com.google.javascript.rhino.jstype.JSType) functionType70);
        boolean boolean74 = enumType72.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = null;
        enumType72.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo76);
        boolean boolean79 = enumType72.isPropertyInExterns("Unknown class name");
        com.google.javascript.rhino.Node node81 = enumType72.getPropertyNode("Not declared as a type name");
        boolean boolean83 = enumType72.isPropertyTypeInferred("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean84 = enumType72.matchesStringContext();
        boolean boolean85 = enumType72.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter86 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry88 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter86, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable90 = jSTypeRegistry88.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean91 = jSTypeRegistry88.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType92 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray93 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList94 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList94, jSTypeArray93);
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry88.createFunctionTypeWithVarArgs(jSType92, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList94);
        com.google.javascript.rhino.jstype.JSType jSType97 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.ObjectType) enumType34, (com.google.javascript.rhino.jstype.JSType) enumType72, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList94);
        boolean boolean98 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.resetForTypeCheck();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(enumType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(jSTypeArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00278");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        java.util.Set<java.lang.String> strSet42 = functionType39.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        boolean boolean44 = functionType39.isInstanceType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = functionType39.getOwnPropertyJSDocInfo("{142159271}");
        java.util.Set<java.lang.String> strSet47 = functionType39.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable52 = jSTypeRegistry50.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean53 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList56 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList56, jSTypeArray55);
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry50.createFunctionTypeWithVarArgs(jSType54, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList56);
        jSTypeRegistry50.forwardDeclareType("{1687381779}");
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray61 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType62 = jSTypeRegistry50.createUnionType(jSTypeNativeArray61);
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node67 = jSTypeRegistry65.createParameters(jSTypeArray66);
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable72 = jSTypeRegistry70.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean73 = jSTypeRegistry70.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList76 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList76, jSTypeArray75);
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry70.createFunctionTypeWithVarArgs(jSType74, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList76);
        com.google.javascript.rhino.Node node79 = jSTypeRegistry65.createParameters((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList76);
        com.google.javascript.rhino.Node node80 = jSTypeRegistry50.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList76);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = strSet47.contains((java.lang.Object) node80);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.javascript.rhino.Node cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(jSDocInfo46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(jSTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertNotNull(jSTypeNativeArray61);
        org.junit.Assert.assertNotNull(jSType62);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(jSTypeIterable72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node80);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00279");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node20.isGetterDef();
        boolean boolean22 = node20.isQuotedString();
        node20.setSourceEncodedPosition(4);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = new com.google.javascript.rhino.JSTypeExpression(node20, "Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression26);
        boolean boolean28 = jSTypeExpression27.isVarArgs();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression27);
        com.google.javascript.rhino.Node node30 = jSTypeExpression29.getRoot();
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node32 = node30.useSourceInfoFrom(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSTypeExpression27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeExpression29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00280");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry8.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable15 = jSTypeRegistry13.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean16 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        boolean boolean17 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node26 = node23.useSourceInfoIfMissingFromForTree(node25);
        boolean boolean27 = node25.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable32 = jSTypeRegistry30.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean33 = jSTypeRegistry30.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList36 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList36, jSTypeArray35);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry30.createFunctionTypeWithVarArgs(jSType34, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList36);
        boolean boolean39 = functionType38.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType40 = jSTypeRegistry13.createEnumType("false", node25, (com.google.javascript.rhino.jstype.JSType) functionType38);
        java.util.Set<java.lang.String> strSet41 = functionType38.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        boolean boolean48 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node57 = node54.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean58 = node56.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable63 = jSTypeRegistry61.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean64 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry61.createFunctionTypeWithVarArgs(jSType65, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean70 = functionType69.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType71 = jSTypeRegistry44.createEnumType("false", node56, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType69.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = jSTypeRegistry8.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType38, (com.google.javascript.rhino.jstype.JSType) functionType72);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = parameterizedType73.getConstructor();
        com.google.javascript.rhino.jstype.TemplateType templateType75 = parameterizedType73.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType73.collapseUnion();
        boolean boolean77 = parameterizedType73.isNoResolvedType();
        jSTypeRegistry2.registerPropertyOnType("{1789057375}", (com.google.javascript.rhino.jstype.JSType) parameterizedType73);
        boolean boolean79 = parameterizedType73.isEmptyType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = null;
        parameterizedType73.setPropertyJSDocInfo("{1395256719}", jSDocInfo81);
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(enumType40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(enumType71);
        org.junit.Assert.assertNull(functionType72);
        org.junit.Assert.assertNotNull(parameterizedType73);
        org.junit.Assert.assertNull(functionType74);
        org.junit.Assert.assertNull(templateType75);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00281");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        enumType29.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo33);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean48 = node47.isDefaultCase();
        node47.setVarArgs(true);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) 'a', node41, node47, node55);
        boolean boolean57 = enumType29.defineElement("{209777139}", node55);
        java.lang.Iterable iterable58 = enumType29.getCtorExtendedInterfaces();
        com.google.javascript.rhino.Node node59 = enumType29.getSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo60 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(iterable58);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00282");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        boolean boolean69 = parameterizedType67.isConstructor();
        com.google.javascript.rhino.jstype.EnumType enumType70 = parameterizedType67.toMaybeEnumType();
        java.lang.String str71 = parameterizedType67.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = parameterizedType67.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = functionType72.isEnumElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(enumType70);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "{proxy:function (): {1098739832}}" + "'", str71, "{proxy:function (): {1098739832}}");
        org.junit.Assert.assertNull(functionType72);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00283");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        boolean boolean78 = strComparableList18.contains((java.lang.Object) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream79 = strComparableList18.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList80 = strComparableList18.reverse();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable82 = strComparableList80.remove(38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strComparableStream79);
        org.junit.Assert.assertNotNull(strComparableList80);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00284");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDescription();
        java.lang.String str2 = jSDocInfo0.getLicense();
        int int3 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        boolean boolean6 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00285");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType67.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.TemplateType templateType70 = parameterizedType67.toMaybeTemplateType();
        boolean boolean72 = parameterizedType67.isPropertyTypeInferred("hi!");
        com.google.javascript.rhino.jstype.JSType jSType74 = parameterizedType67.findPropertyType("{1687381779}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = parameterizedType67.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType67.getTypeOfThis();
        boolean boolean77 = jSType76.canBeCalled();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumElementType69);
        org.junit.Assert.assertNull(templateType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(jSType74);
        org.junit.Assert.assertNull(jSDocInfo75);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00286");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 44);
        com.google.javascript.rhino.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter2, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable6 = jSTypeRegistry4.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean7 = jSTypeRegistry4.shouldTolerateUndefinedValues();
        boolean boolean8 = jSTypeRegistry4.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node17 = node14.useSourceInfoIfMissingFromForTree(node16);
        boolean boolean18 = node16.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable23 = jSTypeRegistry21.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean24 = jSTypeRegistry21.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList27 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList27, jSTypeArray26);
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry21.createFunctionTypeWithVarArgs(jSType25, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList27);
        boolean boolean30 = functionType29.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType31 = jSTypeRegistry4.createEnumType("false", node16, (com.google.javascript.rhino.jstype.JSType) functionType29);
        boolean boolean33 = enumType31.isPropertyTypeDeclared("");
        boolean boolean34 = enumType31.matchesStringContext();
        boolean boolean35 = enumType31.isConstructor();
        com.google.javascript.rhino.jstype.EnumType enumType36 = enumType31.toMaybeEnumType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType37 = enumType31.toMaybeEnumElementType();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean44 = node43.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection45 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node43);
        boolean boolean46 = node43.isLabel();
        boolean boolean47 = node43.isGetterDef();
        boolean boolean48 = enumType31.defineElement("{proxy:function (): {125279184}}", node43);
        com.google.javascript.rhino.Node node49 = node1.srcref(node43);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node43.getStaticSourceFile();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(jSTypeIterable6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(enumType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(enumType36);
        org.junit.Assert.assertNull(enumElementType37);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeCollection45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(staticSourceFile50);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00287");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable10 = jSTypeRegistry8.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean11 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry8.createFunctionTypeWithVarArgs(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        boolean boolean17 = functionType16.canBeCalled();
        boolean boolean18 = functionType16.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray19 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType20 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType16, jSTypeArray19);
        com.google.javascript.rhino.jstype.JSType jSType21 = functionType16.getIndexType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ParameterizedType parameterizedType22 = jSType21.toMaybeParameterizedType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeArray19);
        org.junit.Assert.assertNotNull(functionType20);
        org.junit.Assert.assertNull(jSType21);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00288");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        java.util.Set<java.lang.String> strSet30 = functionType27.getOwnPropertyNames();
        boolean boolean31 = functionType27.isInterface();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet32 = functionType27.getPossibleToBooleanOutcomes();
        boolean boolean34 = booleanLiteralSet32.contains(true);
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet32 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet32.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00289");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node5 = node4.getParent();
        int int6 = node4.getChildCount();
        int int8 = node4.getIntProp(0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00290");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable4 = jSTypeRegistry2.getEachReferenceTypeWithProperty("{2044072356}");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node9 = jSTypeRegistry7.createParameters(jSTypeArray8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter10, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable14 = jSTypeRegistry12.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean15 = jSTypeRegistry12.shouldTolerateUndefinedValues();
        boolean boolean16 = jSTypeRegistry12.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node25 = node22.useSourceInfoIfMissingFromForTree(node24);
        boolean boolean26 = node24.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter27, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable31 = jSTypeRegistry29.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean32 = jSTypeRegistry29.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList35 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList35, jSTypeArray34);
        com.google.javascript.rhino.jstype.FunctionType functionType37 = jSTypeRegistry29.createFunctionTypeWithVarArgs(jSType33, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList35);
        boolean boolean38 = functionType37.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType39 = jSTypeRegistry12.createEnumType("false", node24, (com.google.javascript.rhino.jstype.JSType) functionType37);
        java.util.Set<java.lang.String> strSet40 = functionType37.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable45 = jSTypeRegistry43.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean46 = jSTypeRegistry43.shouldTolerateUndefinedValues();
        boolean boolean47 = jSTypeRegistry43.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node53 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node56 = node53.useSourceInfoIfMissingFromForTree(node55);
        boolean boolean57 = node55.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable62 = jSTypeRegistry60.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean63 = jSTypeRegistry60.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList66 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList66, jSTypeArray65);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry60.createFunctionTypeWithVarArgs(jSType64, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList66);
        boolean boolean69 = functionType68.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType70 = jSTypeRegistry43.createEnumType("false", node55, (com.google.javascript.rhino.jstype.JSType) functionType68);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType68.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType72 = jSTypeRegistry7.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType37, (com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean73 = parameterizedType72.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType74 = parameterizedType72.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.TemplateType templateType75 = parameterizedType72.toMaybeTemplateType();
        boolean boolean77 = parameterizedType72.isPropertyTypeInferred("hi!");
        com.google.javascript.rhino.jstype.JSType jSType79 = parameterizedType72.findPropertyType("{1687381779}");
        com.google.javascript.rhino.jstype.ObjectType.Property property81 = parameterizedType72.getOwnSlot("hi!");
        boolean boolean82 = parameterizedType72.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType83 = parameterizedType72.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType84 = jSTypeRegistry2.createDefaultObjectUnion((com.google.javascript.rhino.jstype.JSType) parameterizedType72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(jSTypeIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(functionType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(enumType39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(jSTypeIterable45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jSTypeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(enumType70);
        org.junit.Assert.assertNull(functionType71);
        org.junit.Assert.assertNotNull(parameterizedType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(enumElementType74);
        org.junit.Assert.assertNull(templateType75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(jSType79);
        org.junit.Assert.assertNull(property81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(objectType83);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00291");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(4095, nodeArray2);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(52, nodeArray2);
        boolean boolean5 = node4.hasChildren();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00292");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node6.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) 'a', node6, node12, node20);
        boolean boolean22 = node21.isGetterDef();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(45, node21, node24, 44, 16);
        boolean boolean28 = node24.isFalse();
        boolean boolean29 = node24.isTypeOf();
        boolean boolean30 = node24.isSyntheticBlock();
        boolean boolean31 = node24.isScript();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00293");
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder7 = node6.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) 'a', node6, node12, node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node29 = node26.useSourceInfoIfMissingFromForTree(node28);
        int int30 = node26.getSourceOffset();
        com.google.javascript.rhino.Node node31 = node20.clonePropsFrom(node26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(1, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00294");
        java.lang.String[] strArray1 = new java.lang.String[] { "{proxy:function (): {882920012}}" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList5 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strSet2.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList5);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList25 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray24);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList44 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray43);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList63 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray62);
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList82 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray81);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList83 = com.google.common.collect.ImmutableList.of(strComparableList25, strComparableList44, strComparableList63, strComparableList82);
        java.lang.String str84 = strComparableList44.toString();
        boolean boolean86 = strComparableList44.equals((java.lang.Object) 4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = strComparableList5.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strComparableList25);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strComparableList44);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strComparableList63);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strComparableList82);
        org.junit.Assert.assertNotNull(strComparableListList83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" + "'", str84, "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00295");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList0 = com.google.common.collect.ImmutableList.of();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = strComparableList0.add((java.lang.Comparable<java.lang.String>) "{proxy:function (): {693061641}}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList0);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00296");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean36 = enumType34.isPropertyTypeDeclared("");
        boolean boolean37 = enumType34.matchesStringContext();
        java.lang.String str38 = enumType34.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = enumType34.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = enumType34.getJSDocInfo();
        enumType34.clearCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) enumType34, "", "Not declared as a type name", 36, (int) '#');
        boolean boolean48 = jSTypeRegistry2.hasNamespace("{581538441}");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative49 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType50 = jSTypeRegistry2.getNativeObjectType(jSTypeNative49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{26278333}" + "'", str38, "{26278333}");
        org.junit.Assert.assertNull(functionType39);
        org.junit.Assert.assertNull(jSDocInfo40);
        org.junit.Assert.assertNotNull(jSType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00297");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        node4.detachChildren();
        boolean boolean10 = node4.isNot();
        boolean boolean11 = node4.isVoid();
        boolean boolean12 = node4.isParamList();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00298");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("{1631953089}", (int) (short) -1, 45);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00299");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType69 = parameterizedType67.getTypeOfThis();
        boolean boolean71 = parameterizedType67.isPropertyTypeInferred("InputId: hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType72 = parameterizedType67.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType72.getPropertyType("{209777139}");
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objectType69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(jSType74);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00300");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDebugger();
        boolean boolean7 = node4.isString();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean20 = node19.isDefaultCase();
        node19.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) 'a', node13, node19, node27);
        com.google.javascript.rhino.InputId inputId29 = node13.getInputId();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoFrom(node13);
        com.google.javascript.rhino.Node node31 = node4.cloneTree();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node39 = node36.useSourceInfoIfMissingFromForTree(node38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean45 = node44.isDefaultCase();
        node44.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId48 = node44.getInputId();
        node44.detachChildren();
        com.google.javascript.rhino.Node node50 = node38.copyInformationFrom(node44);
        java.lang.String str51 = node44.toStringTree();
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        node44.setJSType(jSType52);
        boolean boolean54 = node44.isObjectLit();
        node31.addChildToBack(node44);
        boolean boolean56 = node31.isInc();
        node31.putBooleanProp(97, true);
        java.lang.Object obj61 = node31.getProp(37);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "SHEQ  1 [var_args_name: 1]\n" + "'", str51, "SHEQ  1 [var_args_name: 1]\n");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00301");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative21 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec22 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", jSTypeNative21);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean28 = node27.isDefaultCase();
        node27.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId31 = node27.getInputId();
        node27.detachChildren();
        boolean boolean33 = node27.isNot();
        boolean boolean34 = node27.isSetterDef();
        com.google.javascript.rhino.Node node35 = assertionFunctionSpec22.getAssertedParam(node27);
        int int36 = strComparableList18.indexOf((java.lang.Object) assertionFunctionSpec22);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList55 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray54);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator56 = strComparableList55.spliterator();
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node64 = node61.useSourceInfoIfMissingFromForTree(node63);
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean67 = node66.isFalse();
        boolean boolean68 = node63.hasChild(node66);
        boolean boolean69 = strComparableList55.contains((java.lang.Object) boolean68);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor70 = strComparableList55.iterator();
        boolean boolean71 = strComparableList18.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList55);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "{12965601}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(inputId31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strComparableList55);
        org.junit.Assert.assertNotNull(strComparableSpliterator56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strComparableItor70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00302");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node11.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean18 = node17.isDefaultCase();
        node17.setVarArgs(true);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) 'a', node11, node17, node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        com.google.javascript.rhino.Node node28 = node4.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node25.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry32.createFunctionTypeWithVarArgs(jSType36, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        boolean boolean41 = functionType40.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        boolean boolean48 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node57 = node54.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean58 = node56.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable63 = jSTypeRegistry61.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean64 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry61.createFunctionTypeWithVarArgs(jSType65, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean70 = functionType69.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType71 = jSTypeRegistry44.createEnumType("false", node56, (com.google.javascript.rhino.jstype.JSType) functionType69);
        java.util.Set<java.lang.String> strSet72 = functionType69.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType40, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.Node node74 = functionType40.getSource();
        node25.setJSType((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType40.getPrototype();
        boolean boolean77 = functionType40.isEmptyType();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(staticSourceFile29);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(enumType71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00303");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean31 = strSet26.remove((java.lang.Object) node30);
        com.google.javascript.rhino.Node node33 = node30.getAncestor(53);
        boolean boolean34 = node30.isNumber();
        node30.setCharno(31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo37 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00304");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        node15.setSourceEncodedPositionForTree(45);
        boolean boolean23 = node15.isQualifiedName();
        boolean boolean24 = node15.isDefaultCase();
        com.google.javascript.rhino.Node node25 = node15.getFirstChild();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative27 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec28 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", jSTypeNative27);
        java.lang.String str29 = assertionFunctionSpec28.getFunctionName();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder36 = node35.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean42 = node41.isDefaultCase();
        node41.setVarArgs(true);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) 'a', node35, node41, node49);
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable55 = jSTypeRegistry53.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean56 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable61 = jSTypeRegistry59.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean62 = jSTypeRegistry59.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList65 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList65, jSTypeArray64);
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry59.createFunctionTypeWithVarArgs(jSType63, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList65);
        boolean boolean68 = functionType67.canBeCalled();
        boolean boolean69 = functionType67.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry53.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType67, jSTypeArray70);
        com.google.javascript.rhino.jstype.JSType jSType72 = assertionFunctionSpec28.getAssertedType(node35, jSTypeRegistry53);
        // The following exception was thrown during execution in test generation
        try {
            node25.removeChild(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" + "'", str29, "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(jSTypeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertNull(jSType72);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00305");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.jstype.JSType jSType7 = jSTypeRegistry2.createNamedType("{375517443}", "ASSIGN_MOD", 53, 0);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray11 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node12 = jSTypeRegistry10.createParameters(jSTypeArray11);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable17 = jSTypeRegistry15.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean18 = jSTypeRegistry15.shouldTolerateUndefinedValues();
        boolean boolean19 = jSTypeRegistry15.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node28 = node25.useSourceInfoIfMissingFromForTree(node27);
        boolean boolean29 = node27.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry32.createFunctionTypeWithVarArgs(jSType36, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        boolean boolean41 = functionType40.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType42 = jSTypeRegistry15.createEnumType("false", node27, (com.google.javascript.rhino.jstype.JSType) functionType40);
        java.util.Set<java.lang.String> strSet43 = functionType40.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable48 = jSTypeRegistry46.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean49 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        boolean boolean50 = jSTypeRegistry46.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node58 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node59 = node56.useSourceInfoIfMissingFromForTree(node58);
        boolean boolean60 = node58.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable65 = jSTypeRegistry63.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean66 = jSTypeRegistry63.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray68 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList69 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList69, jSTypeArray68);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry63.createFunctionTypeWithVarArgs(jSType67, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList69);
        boolean boolean72 = functionType71.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType73 = jSTypeRegistry46.createEnumType("false", node58, (com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = functionType71.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType75 = jSTypeRegistry10.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType40, (com.google.javascript.rhino.jstype.JSType) functionType74);
        boolean boolean76 = parameterizedType75.isNativeObjectType();
        com.google.javascript.rhino.Node node78 = parameterizedType75.getPropertyNode("");
        boolean boolean79 = parameterizedType75.isUnknownType();
        boolean boolean80 = parameterizedType75.isRecordType();
        boolean boolean81 = jSType7.canAssignTo((com.google.javascript.rhino.jstype.JSType) parameterizedType75);
        java.util.Set set82 = parameterizedType75.getOwnPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = set82.add("ASSIGN_MOD");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSType7);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(jSTypeIterable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(enumType42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(jSTypeIterable48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jSTypeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(enumType73);
        org.junit.Assert.assertNull(functionType74);
        org.junit.Assert.assertNotNull(parameterizedType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(set82);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00306");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable15 = jSTypeRegistry13.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean16 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        boolean boolean35 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node44 = node41.useSourceInfoIfMissingFromForTree(node43);
        boolean boolean45 = node43.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable50 = jSTypeRegistry48.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean51 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList54, jSTypeArray53);
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry48.createFunctionTypeWithVarArgs(jSType52, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList54);
        boolean boolean57 = functionType56.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType58 = jSTypeRegistry31.createEnumType("false", node43, (com.google.javascript.rhino.jstype.JSType) functionType56);
        java.util.Set<java.lang.String> strSet59 = functionType56.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair60 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType27, (com.google.javascript.rhino.jstype.JSType) functionType56);
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType56.autoboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable66 = jSTypeRegistry64.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean67 = jSTypeRegistry64.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList70 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList70, jSTypeArray69);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry64.createFunctionTypeWithVarArgs(jSType68, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList70);
        com.google.javascript.rhino.jstype.FunctionType functionType73 = jSTypeRegistry13.createFunctionTypeWithVarArgs(jSType61, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList70);
        com.google.javascript.rhino.Node node74 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList70);
        boolean boolean76 = jSTypeRegistry2.isForwardDeclaredType("");
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean83 = node82.isDefaultCase();
        node82.setVarArgs(true);
        node82.setVarArgs(false);
        node82.setLength((int) (byte) 0);
        node82.removeProp((int) 'a');
        node82.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node94 = node82.cloneTree();
        com.google.javascript.rhino.Node node95 = com.google.javascript.jscomp.NodeUtil.newExpr(node82);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry2.createInterfaceType("{1803496761}", node95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(jSTypeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(enumType58);
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertNull(jSType61);
        org.junit.Assert.assertNotNull(jSTypeIterable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(functionType73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(node95);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00307");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder27 = node26.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean33 = node32.isDefaultCase();
        node32.setVarArgs(true);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((int) 'a', node26, node32, node40);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile42 = null;
        node32.setStaticSourceFile(staticSourceFile42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node44 = node19.getChildBefore(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00308");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        boolean boolean19 = strComparableList18.isEmpty();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList38 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray37);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator39 = strComparableList38.spliterator();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean43 = node42.isGetProp();
        boolean boolean44 = node42.isNumber();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder50 = node49.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int56 = node55.getType();
        boolean boolean57 = node55.isBlock();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((int) (short) 10, node42, node49, node55, (int) (byte) 10, 44);
        boolean boolean61 = strComparableList38.contains((java.lang.Object) 44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = strComparableList18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strComparableList38);
        org.junit.Assert.assertNotNull(strComparableSpliterator39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 45 + "'", int56 == 45);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00309");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType3 = null;
        boolean boolean5 = jSTypeRegistry2.canPropertyBeDefined(jSType3, "Unknown class name");
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node14 = node11.useSourceInfoIfMissingFromForTree(node13);
        boolean boolean15 = node13.isExprResult();
        com.google.javascript.rhino.Node node16 = node13.cloneTree();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        boolean boolean23 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node32 = node29.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean33 = node31.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable38 = jSTypeRegistry36.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean39 = jSTypeRegistry36.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList42 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList42, jSTypeArray41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry36.createFunctionTypeWithVarArgs(jSType40, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList42);
        boolean boolean45 = functionType44.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType46 = jSTypeRegistry19.createEnumType("false", node31, (com.google.javascript.rhino.jstype.JSType) functionType44);
        boolean boolean48 = enumType46.isPropertyTypeDeclared("");
        boolean boolean49 = enumType46.canBeCalled();
        com.google.javascript.rhino.jstype.UnionType unionType50 = enumType46.toMaybeUnionType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = jSTypeRegistry2.createObjectType("{581538441}", node13, (com.google.javascript.rhino.jstype.ObjectType) enumType46);
        com.google.javascript.rhino.ErrorReporter errorReporter52 = jSTypeRegistry2.getErrorReporter();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(enumType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(unionType50);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNull(errorReporter52);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00310");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean4 = node3.isGetProp();
        boolean boolean5 = node3.isNumber();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node10.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int17 = node16.getType();
        boolean boolean18 = node16.isBlock();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((int) (short) 10, node3, node10, node16, (int) (byte) 10, 44);
        com.google.javascript.rhino.Node node22 = node3.detachFromParent();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node30 = node27.useSourceInfoIfMissingFromForTree(node29);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean36 = node35.isDefaultCase();
        node35.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId39 = node35.getInputId();
        node35.detachChildren();
        com.google.javascript.rhino.Node node41 = node29.copyInformationFrom(node35);
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node49 = node46.useSourceInfoIfMissingFromForTree(node48);
        node49.setLineno(10);
        com.google.javascript.rhino.Node node52 = node35.copyInformationFrom(node49);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node22, node35, (int) ' ', 1);
        boolean boolean56 = node22.isHook();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder63 = node62.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean69 = node68.isDefaultCase();
        node68.setVarArgs(true);
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node((int) 'a', node62, node68, node76);
        boolean boolean78 = node77.isGetterDef();
        boolean boolean79 = node77.isQuotedString();
        com.google.javascript.rhino.Node node80 = node22.useSourceInfoFrom(node77);
        boolean boolean81 = node80.isInstanceOf();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00311");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean6 = node5.isDefaultCase();
        node5.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId9 = node5.getInputId();
        node5.detachChildren();
        boolean boolean11 = node5.isAssignAdd();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(54, node5, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputId9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00312");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(48);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00313");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = functionType27.getConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable35 = jSTypeRegistry33.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean36 = jSTypeRegistry33.shouldTolerateUndefinedValues();
        boolean boolean37 = jSTypeRegistry33.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node46 = node43.useSourceInfoIfMissingFromForTree(node45);
        boolean boolean47 = node45.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable52 = jSTypeRegistry50.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean53 = jSTypeRegistry50.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList56 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList56, jSTypeArray55);
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry50.createFunctionTypeWithVarArgs(jSType54, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList56);
        boolean boolean59 = functionType58.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType60 = jSTypeRegistry33.createEnumType("false", node45, (com.google.javascript.rhino.jstype.JSType) functionType58);
        boolean boolean62 = enumType60.isPropertyTypeDeclared("");
        boolean boolean63 = enumType60.matchesStringContext();
        boolean boolean64 = functionType27.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) enumType60);
        boolean boolean65 = functionType27.matchesInt32Context();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(jSTypeIterable35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(enumType60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00314");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        java.util.Set<java.lang.String> strSet42 = functionType39.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType39.autoboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = jSType44.isRecordType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(jSType44);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00315");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node5 = node4.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = node5.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00316");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList1 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableList1.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableList1.iterator();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList22 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray21);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList41 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray40);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList60 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray59);
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList79 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray78);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList80 = com.google.common.collect.ImmutableList.of(strComparableList22, strComparableList41, strComparableList60, strComparableList79);
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor81 = strComparableList22.iterator();
        boolean boolean82 = strComparableList1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList22);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList84 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        boolean boolean85 = strComparableList84.isEmpty();
        java.lang.Object[] objArray86 = strComparableList84.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = strComparableList22.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList84);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList1);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strComparableList22);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strComparableList41);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strComparableList60);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strComparableList79);
        org.junit.Assert.assertNotNull(strComparableListList80);
        org.junit.Assert.assertNotNull(strComparableItor81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strComparableList84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[]");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00317");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = functionType39.getConstructor();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType10.findPropertyType("");
        com.google.javascript.rhino.jstype.ObjectType objectType46 = functionType10.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType47 = functionType10.getTypeOfThis();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType48 = functionType10.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNull(functionType42);
        org.junit.Assert.assertNull(jSType45);
        org.junit.Assert.assertNotNull(objectType46);
        org.junit.Assert.assertNotNull(objectType47);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00318");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = null;
        parameterizedType67.setJSDocInfo(jSDocInfo69);
        com.google.javascript.rhino.jstype.JSType jSType71 = parameterizedType67.collapseUnion();
        boolean boolean72 = parameterizedType67.isNumberObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00319");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDebugger();
        boolean boolean7 = node4.isString();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean20 = node19.isDefaultCase();
        node19.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) 'a', node13, node19, node27);
        com.google.javascript.rhino.InputId inputId29 = node13.getInputId();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoFrom(node13);
        com.google.javascript.rhino.Node node31 = node4.cloneTree();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = node31.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: SHEQ  1 is not a number node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00320");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        boolean boolean21 = node20.isObjectLit();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags23 = new com.google.javascript.rhino.Node.SideEffectFlags((int) (byte) 10);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags25 = new com.google.javascript.rhino.Node.SideEffectFlags(100);
        sideEffectFlags25.setAllFlags();
        boolean boolean27 = sideEffectFlags25.areAllFlagsSet();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags29 = new com.google.javascript.rhino.Node.SideEffectFlags(100);
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags31 = new com.google.javascript.rhino.Node.SideEffectFlags(100);
        sideEffectFlags31.setAllFlags();
        boolean boolean33 = sideEffectFlags31.areAllFlagsSet();
        boolean boolean34 = sideEffectFlags31.areAllFlagsSet();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags36 = new com.google.javascript.rhino.Node.SideEffectFlags(100);
        sideEffectFlags36.setAllFlags();
        sideEffectFlags36.setMutatesGlobalState();
        sideEffectFlags36.setThrows();
        sideEffectFlags36.setMutatesThis();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.Node.SideEffectFlags> sideEffectFlagsList41 = com.google.common.collect.ImmutableList.of(sideEffectFlags23, sideEffectFlags25, sideEffectFlags29, sideEffectFlags31, sideEffectFlags36);
        // The following exception was thrown during execution in test generation
        try {
            node20.setSideEffectFlags(sideEffectFlags36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got BITXOR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(sideEffectFlagsList41);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00321");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDebugger();
        boolean boolean7 = node4.isString();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean20 = node19.isDefaultCase();
        node19.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) 'a', node13, node19, node27);
        com.google.javascript.rhino.InputId inputId29 = node13.getInputId();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoFrom(node13);
        com.google.javascript.rhino.Node node31 = node4.cloneTree();
        com.google.javascript.rhino.Node node36 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node38 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node39 = node36.useSourceInfoIfMissingFromForTree(node38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean45 = node44.isDefaultCase();
        node44.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId48 = node44.getInputId();
        node44.detachChildren();
        com.google.javascript.rhino.Node node50 = node38.copyInformationFrom(node44);
        java.lang.String str51 = node44.toStringTree();
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        node44.setJSType(jSType52);
        boolean boolean54 = node44.isObjectLit();
        node31.addChildToBack(node44);
        boolean boolean56 = node31.isInc();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable57 = node31.getAncestors();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node64 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node65 = node62.useSourceInfoIfMissingFromForTree(node64);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean71 = node70.isDefaultCase();
        node70.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId74 = node70.getInputId();
        node70.detachChildren();
        com.google.javascript.rhino.Node node76 = node64.copyInformationFrom(node70);
        com.google.javascript.rhino.Node node77 = node31.copyInformationFrom(node70);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable78 = node77.siblings();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "SHEQ  1 [var_args_name: 1]\n" + "'", str51, "SHEQ  1 [var_args_name: 1]\n");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(ancestorIterable57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(inputId74);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(nodeIterable78);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00322");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(100);
        sideEffectFlags1.setAllFlags();
        boolean boolean3 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setAllFlags();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00323");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        boolean boolean78 = strComparableList18.contains((java.lang.Object) (short) 10);
        boolean boolean79 = strComparableList18.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Comparable<java.lang.String>> strComparableList82 = strComparableList18.subList((int) (short) 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (100) must not be greater than size (17)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00324");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean10 = node9.isFalse();
        boolean boolean11 = node6.hasChild(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean17 = node16.isDefaultCase();
        node16.setVarArgs(true);
        node16.setVarArgs(false);
        boolean boolean22 = node16.isDebugger();
        boolean boolean23 = node16.isNoSideEffectsCall();
        com.google.javascript.rhino.InputId inputId25 = new com.google.javascript.rhino.InputId("hi!");
        java.lang.String str26 = inputId25.toString();
        node16.setInputId(inputId25);
        node6.setInputId(inputId25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newExpr(node6);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = node6.useSourceInfoFromForTree(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "InputId: hi!" + "'", str26, "InputId: hi!");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00325");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable10 = jSTypeRegistry8.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean11 = jSTypeRegistry8.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList14 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList14, jSTypeArray13);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry8.createFunctionTypeWithVarArgs(jSType12, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList14);
        boolean boolean17 = functionType16.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable22 = jSTypeRegistry20.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean23 = jSTypeRegistry20.shouldTolerateUndefinedValues();
        boolean boolean24 = jSTypeRegistry20.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node33 = node30.useSourceInfoIfMissingFromForTree(node32);
        boolean boolean34 = node32.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable39 = jSTypeRegistry37.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean40 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList43 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList43, jSTypeArray42);
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry37.createFunctionTypeWithVarArgs(jSType41, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList43);
        boolean boolean46 = functionType45.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType47 = jSTypeRegistry20.createEnumType("false", node32, (com.google.javascript.rhino.jstype.JSType) functionType45);
        java.util.Set<java.lang.String> strSet48 = functionType45.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair49 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType16, (com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.javascript.rhino.jstype.JSType jSType50 = functionType45.autoboxesTo();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable55 = jSTypeRegistry53.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean56 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList59 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList59, jSTypeArray58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry53.createFunctionTypeWithVarArgs(jSType57, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList59);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType50, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList59);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType63 = functionType62.getInstanceType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(enumType47);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNull(jSType50);
        org.junit.Assert.assertNotNull(jSTypeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(functionType62);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00326");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType67.autobox();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable74 = jSTypeRegistry72.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean75 = jSTypeRegistry72.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList78 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList78, jSTypeArray77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry72.createFunctionTypeWithVarArgs(jSType76, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList78);
        boolean boolean81 = jSType69.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType80);
        com.google.javascript.rhino.jstype.FunctionType functionType82 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = functionType80.hasEqualCallType(functionType82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(jSTypeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00327");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00328");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList37 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray36);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList56 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray55);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList75 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray74);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList76 = com.google.common.collect.ImmutableList.of(strComparableList18, strComparableList37, strComparableList56, strComparableList75);
        java.lang.String str77 = strComparableList37.toString();
        // The following exception was thrown during execution in test generation
        try {
            strComparableList37.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strComparableList37);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strComparableList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strComparableList75);
        org.junit.Assert.assertNotNull(strComparableListList76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" + "'", str77, "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00329");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.incrementGeneration();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean9 = node8.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node8);
        boolean boolean11 = node8.isLabel();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = functionType39.getConstructor();
        com.google.javascript.rhino.jstype.EnumType enumType43 = jSTypeRegistry1.createEnumType("SHEQ  1 [var_args_name: 1]\n", node8, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType44 = functionType39.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSType44.findPropertyType("{1504890026}");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNull(functionType42);
        org.junit.Assert.assertNotNull(enumType43);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNull(jSType46);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00330");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        boolean boolean32 = enumType29.matchesStringContext();
        java.lang.String str33 = enumType29.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = enumType29.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = enumType29.getJSDocInfo();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder43 = node42.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean49 = node48.isDefaultCase();
        node48.setVarArgs(true);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) 'a', node42, node48, node56);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile58 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node56);
        com.google.javascript.rhino.Node node63 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node65 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node66 = node63.useSourceInfoIfMissingFromForTree(node65);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean69 = node68.isFalse();
        boolean boolean70 = node65.hasChild(node68);
        com.google.javascript.rhino.Node node71 = node56.useSourceInfoFromForTree(node65);
        boolean boolean72 = enumType29.defineElement("", node65);
        com.google.javascript.rhino.jstype.ObjectType.Property property74 = enumType29.getSlot("{1631953089}");
        com.google.javascript.rhino.jstype.ObjectType objectType75 = enumType29.getImplicitPrototype();
        boolean boolean76 = objectType75.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{1981320789}" + "'", str33, "{1981320789}");
        org.junit.Assert.assertNull(functionType34);
        org.junit.Assert.assertNull(jSDocInfo35);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNull(staticSourceFile58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(property74);
        org.junit.Assert.assertNotNull(objectType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00331");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList13 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList13, jSTypeArray12);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = jSTypeRegistry7.createFunctionTypeWithVarArgs(jSType11, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList13);
        boolean boolean16 = functionType15.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        boolean boolean23 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node32 = node29.useSourceInfoIfMissingFromForTree(node31);
        boolean boolean33 = node31.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable38 = jSTypeRegistry36.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean39 = jSTypeRegistry36.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList42 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList42, jSTypeArray41);
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry36.createFunctionTypeWithVarArgs(jSType40, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList42);
        boolean boolean45 = functionType44.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType46 = jSTypeRegistry19.createEnumType("false", node31, (com.google.javascript.rhino.jstype.JSType) functionType44);
        java.util.Set<java.lang.String> strSet47 = functionType44.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair48 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType15, (com.google.javascript.rhino.jstype.JSType) functionType44);
        com.google.javascript.rhino.Node node49 = functionType15.getSource();
        com.google.javascript.rhino.jstype.JSType jSType51 = functionType15.getPropertyType("hi!");
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node57 = jSTypeRegistry55.createParameters(jSTypeArray56);
        com.google.javascript.rhino.jstype.FunctionType functionType58 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType15, true, jSTypeArray56);
        boolean boolean60 = functionType58.hasOwnProperty("{1789792193}");
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean62 = functionType58.isSubtype(jSType61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(enumType46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(jSType51);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00332");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = parameterizedType67.getConstructor();
        com.google.javascript.rhino.jstype.TemplateType templateType69 = parameterizedType67.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType70 = parameterizedType67.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType71 = parameterizedType67.getParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo73 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str74 = jSDocInfo73.getDescription();
        java.lang.String str75 = jSDocInfo73.getDeprecationReason();
        java.lang.String str76 = jSDocInfo73.getMeaning();
        parameterizedType67.setPropertyJSDocInfo("{796389407}", jSDocInfo73);
        boolean boolean78 = jSDocInfo73.hasEnumParameterType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertNull(templateType69);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertNull(jSType71);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00333");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        java.util.Set<java.lang.String> strSet42 = functionType39.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.Node node44 = functionType10.getSource();
        boolean boolean45 = functionType10.isInstanceType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00334");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = com.google.javascript.rhino.jstype.ObjectType.cast(jSType0);
        org.junit.Assert.assertNull(objectType1);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00335");
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType0 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int6 = node5.getType();
        boolean boolean7 = node5.isDebugger();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean11 = node10.isGetProp();
        boolean boolean12 = node10.isNumber();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder18 = node17.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int24 = node23.getType();
        boolean boolean25 = node23.isBlock();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (short) 10, node10, node17, node23, (int) (byte) 10, 44);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship29 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType0, node5, node23);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = null;
        node23.setStaticSourceFile(staticSourceFile30);
        boolean boolean32 = node23.isRegExp();
        boolean boolean33 = node23.isAdd();
        org.junit.Assert.assertTrue("'" + subclassType0 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType0.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 45 + "'", int24 == 45);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00336");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "{proxy:function (): {125279184}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00337");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        enumType29.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo33);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean48 = node47.isDefaultCase();
        node47.setVarArgs(true);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) 'a', node41, node47, node55);
        boolean boolean57 = enumType29.defineElement("{209777139}", node55);
        com.google.javascript.rhino.jstype.FunctionType functionType58 = enumType29.getOwnerFunction();
        boolean boolean59 = enumType29.isNoResolvedType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(functionType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00338");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node4);
        boolean boolean7 = node4.isLabel();
        boolean boolean8 = node4.isGetterDef();
        int int9 = node4.getSourceOffset();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable10 = node4.siblings();
        // The following exception was thrown during execution in test generation
        try {
            node4.setSideEffectFlags(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got SHEQ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(nodeIterable10);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00339");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        boolean boolean19 = strComparableList18.isEmpty();
        boolean boolean20 = strComparableList18.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = strComparableList18.remove((java.lang.Object) "{581538441}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00340");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node5.isScript();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00341");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.size();
        strComparableList2.clear();
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("{proxy:function (): {882920012}}");
        boolean boolean9 = strComparableList2.remove((java.lang.Object) "{proxy:function (): {882920012}}");
        strComparableList2.clear();
        strComparableList2.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00342");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        boolean boolean69 = parameterizedType67.hasReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType70 = parameterizedType67.toMaybeFunctionType();
        boolean boolean71 = parameterizedType67.matchesStringContext();
        boolean boolean72 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType74 = parameterizedType67.findPropertyType("{1560722860}");
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(jSType74);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00343");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        boolean boolean32 = enumType29.canBeCalled();
        boolean boolean33 = enumType29.hasCachedValues();
        int int34 = enumType29.getPropertiesCount();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00344");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node2);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node11);
        boolean boolean14 = node11.isLabel();
        boolean boolean15 = node11.isHook();
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean21 = node20.isDefaultCase();
        node20.setVarArgs(true);
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean29 = node28.isDefaultCase();
        node28.setVarArgs(true);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(29, node11, node20, node28);
        boolean boolean33 = node28.isDebugger();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder40 = node39.getJsDocBuilderForNode();
        boolean boolean41 = node39.isCase();
        com.google.javascript.rhino.jstype.JSType jSType42 = node39.getJSType();
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean45 = node44.isFalse();
        boolean boolean46 = node44.isQualifiedName();
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 2, 54, (int) (short) 100);
        com.google.javascript.rhino.Node node51 = node44.srcref(node50);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(16, node39, node50, (int) (byte) -1, 4095);
        boolean boolean55 = node50.isInstanceOf();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(48, node2, node28, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(inputId5);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00345");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode3 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS;
        jSTypeRegistry2.setResolveMode(resolveMode3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable22 = jSTypeRegistry20.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean23 = jSTypeRegistry20.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable28 = jSTypeRegistry26.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean29 = jSTypeRegistry26.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = jSTypeRegistry26.getErrorReporter();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSTypeRegistry> jSTypeRegistryList31 = com.google.common.collect.ImmutableList.of(jSTypeRegistry7, jSTypeRegistry14, jSTypeRegistry20, jSTypeRegistry26);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable36 = jSTypeRegistry34.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean37 = jSTypeRegistry34.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList40 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList40, jSTypeArray39);
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry34.createFunctionTypeWithVarArgs(jSType38, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.Node node43 = jSTypeRegistry7.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.Node node44 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList40);
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry2.getType("{375517443}");
        org.junit.Assert.assertTrue("'" + resolveMode3 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode3.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(errorReporter30);
        org.junit.Assert.assertNotNull(jSTypeRegistryList31);
        org.junit.Assert.assertNotNull(jSTypeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNull(jSType46);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00346");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        enumType29.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo33);
        com.google.javascript.rhino.Node node41 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node41.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean48 = node47.isDefaultCase();
        node47.setVarArgs(true);
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((int) 'a', node41, node47, node55);
        boolean boolean57 = enumType29.defineElement("{209777139}", node55);
        java.lang.Iterable iterable58 = enumType29.getCtorExtendedInterfaces();
        com.google.javascript.rhino.Node node59 = enumType29.getSource();
        boolean boolean60 = node59.isScript();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(iterable58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00347");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        node4.setSourceFileForTesting("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = node4.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00348");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        boolean boolean69 = parameterizedType67.isConstructor();
        boolean boolean70 = parameterizedType67.isEmptyType();
        boolean boolean71 = parameterizedType67.isStringObjectType();
        com.google.javascript.rhino.jstype.TemplateType templateType72 = parameterizedType67.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType73 = parameterizedType67.getParameterType();
        boolean boolean74 = parameterizedType67.matchesObjectContext();
        com.google.javascript.rhino.jstype.ObjectType.Property property76 = parameterizedType67.getSlot("enum{false}");
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(templateType72);
        org.junit.Assert.assertNull(jSType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(property76);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00349");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList1 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableList1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableList1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList6 = strComparableList1.subList(32, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (32) must not be greater than size (1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList1);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00350");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean6 = node5.isDefaultCase();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        boolean boolean8 = node5.isLabel();
        boolean boolean9 = node5.isHook();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean13 = node12.isGetProp();
        boolean boolean14 = node12.isNumber();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder20 = node19.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int26 = node25.getType();
        boolean boolean27 = node25.isBlock();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((int) (short) 10, node12, node19, node25, (int) (byte) 10, 44);
        node25.setSourceEncodedPositionForTree(45);
        boolean boolean33 = node25.isSetterDef();
        com.google.javascript.rhino.Node node34 = node5.useSourceInfoIfMissingFromForTree(node25);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean41 = node40.isDefaultCase();
        node40.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId44 = node40.getInputId();
        node40.detachChildren();
        boolean boolean46 = node40.isNull();
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList49 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean50 = strComparableList49.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean51 = strComparableList49.add((java.lang.Comparable<java.lang.String>) "");
        int int52 = strComparableList49.size();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean58 = node57.isDefaultCase();
        node57.setVarArgs(true);
        node57.setVarArgs(false);
        boolean boolean63 = strComparableList49.contains((java.lang.Object) node57);
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int69 = node68.getType();
        node68.setSourceEncodedPosition((int) (byte) 0);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(54, node40, node57, node68);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((int) (byte) 1, node25, node68, 36, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: first new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 45 + "'", int26 == 45);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 45 + "'", int69 == 45);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00351");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", jSTypeNative1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean8 = node7.isDefaultCase();
        node7.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId11 = node7.getInputId();
        node7.detachChildren();
        boolean boolean13 = node7.isNot();
        boolean boolean14 = node7.isSetterDef();
        com.google.javascript.rhino.Node node15 = assertionFunctionSpec2.getAssertedParam(node7);
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder22 = node21.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean28 = node27.isDefaultCase();
        node27.setVarArgs(true);
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((int) 'a', node21, node27, node35);
        com.google.javascript.rhino.InputId inputId37 = node21.getInputId();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node45 = node42.useSourceInfoIfMissingFromForTree(node44);
        node45.setLineno(10);
        int int48 = node45.getType();
        java.util.Set<java.lang.String> strSet49 = node45.getDirectives();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean55 = node54.isDefaultCase();
        node54.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId58 = node54.getInputId();
        boolean boolean59 = node54.isCase();
        boolean boolean60 = node54.isInc();
        com.google.javascript.jscomp.CodingConvention.Bind bind61 = new com.google.javascript.jscomp.CodingConvention.Bind(node21, node45, node54);
        int int62 = node45.getSourceOffset();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = null;
        com.google.javascript.rhino.jstype.JSType jSType64 = assertionFunctionSpec2.getAssertedType(node45, jSTypeRegistry63);
        java.lang.String str65 = assertionFunctionSpec2.getFunctionName();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputId11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 45 + "'", int48 == 45);
        org.junit.Assert.assertNull(strSet49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(inputId58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(jSType64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" + "'", str65, "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00352");
        com.google.common.collect.ImmutableList.Builder<java.lang.Object> objBuilder0 = com.google.common.collect.ImmutableList.builder();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList19 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray18);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList38 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray37);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList57 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray56);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList76 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray75);
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>>> strComparableListList77 = com.google.common.collect.ImmutableList.of(strComparableList19, strComparableList38, strComparableList57, strComparableList76);
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor78 = strComparableList76.iterator();
        com.google.common.collect.ImmutableList.Builder<java.lang.Object> objBuilder79 = objBuilder0.addAll((java.util.Iterator<java.lang.Comparable<java.lang.String>>) strComparableItor78);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor80 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.ImmutableList.Builder<java.lang.Object> objBuilder81 = objBuilder79.addAll(strComparableItor80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objBuilder0);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strComparableList19);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strComparableList38);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strComparableList57);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strComparableList76);
        org.junit.Assert.assertNotNull(strComparableListList77);
        org.junit.Assert.assertNotNull(strComparableItor78);
        org.junit.Assert.assertNotNull(objBuilder79);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00353");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        jSTypeRegistry2.forwardDeclareType("{1687381779}");
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray13 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType14 = jSTypeRegistry2.createUnionType(jSTypeNativeArray13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter15, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable19 = jSTypeRegistry17.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean20 = jSTypeRegistry17.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList23 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList23, jSTypeArray22);
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry17.createFunctionTypeWithVarArgs(jSType21, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList23);
        com.google.javascript.rhino.Node node26 = jSTypeRegistry2.createParametersWithVarArgs((java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList23);
        boolean boolean27 = node26.isAdd();
        com.google.javascript.rhino.Node node32 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node33 = node32.getParent();
        int int34 = node32.getChildCount();
        int int36 = node32.getIntProp(0);
        com.google.javascript.rhino.InputId inputId37 = com.google.javascript.jscomp.NodeUtil.getInputId(node32);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder44 = node43.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean50 = node49.isDefaultCase();
        node49.setVarArgs(true);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) 'a', node43, node49, node57);
        boolean boolean59 = node43.isScript();
        boolean boolean60 = node43.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            node26.addChildBefore(node32, node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(jSTypeNativeArray13);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(jSTypeIterable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00354");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getDescription();
        boolean boolean2 = jSDocInfo0.isExpose();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("{960305327}");
        boolean boolean6 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00355");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable11 = jSTypeRegistry9.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean12 = jSTypeRegistry9.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList15, jSTypeArray14);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry9.createFunctionTypeWithVarArgs(jSType13, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList15);
        boolean boolean18 = functionType17.canBeCalled();
        boolean boolean19 = functionType17.hasAnyTemplateInternal();
        int int20 = functionType17.getPropertiesCount();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable21 = functionType17.getOwnImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry2.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType23 = functionType17.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable21);
        org.junit.Assert.assertNotNull(jSType22);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00356");
        int int1 = com.google.javascript.jscomp.NodeUtil.getInverseOperator((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00357");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean13 = node12.isDefaultCase();
        node12.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId16 = node12.getInputId();
        node12.detachChildren();
        com.google.javascript.rhino.Node node18 = node6.copyInformationFrom(node12);
        int int19 = node12.getType();
        java.lang.String[] strArray25 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        node12.setDirectives((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean31 = strSet26.remove((java.lang.Object) node30);
        java.lang.Object[] objArray32 = strSet26.toArray();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList51 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray50);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator52 = strComparableList51.spliterator();
        boolean boolean53 = strSet26.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList51);
        java.lang.String[] strArray55 = new java.lang.String[] { "{proxy:function (): {882920012}}" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList59 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        boolean boolean60 = strSet56.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList59);
        boolean boolean62 = strComparableList59.equals((java.lang.Object) "{1667996542}");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator63 = strComparableList59.spliterator();
        boolean boolean64 = strComparableList51.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList59);
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList83 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray82);
        boolean boolean84 = strComparableList83.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = strComparableList51.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList83);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!], Unknown class name]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strComparableList51);
        org.junit.Assert.assertNotNull(strComparableSpliterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strComparableList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strComparableList83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00358");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.canBeCalled();
        boolean boolean12 = functionType10.hasAnyTemplateInternal();
        int int13 = functionType10.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType10.getParentScope();
        java.lang.String str15 = functionType10.getNormalizedReferenceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType10.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00359");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        enumType29.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo33);
        boolean boolean36 = enumType29.isPropertyInExterns("Unknown class name");
        boolean boolean37 = enumType29.isUnknownType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00360");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        functionType10.clearCachedValues();
        int int12 = functionType10.getExtendedInterfacesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType10.getTypeOfThis();
        boolean boolean14 = objectType13.isNumberObjectType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00361");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        boolean boolean69 = parameterizedType67.isConstructor();
        boolean boolean70 = parameterizedType67.isEmptyType();
        boolean boolean71 = parameterizedType67.isStringObjectType();
        com.google.javascript.rhino.jstype.TemplateType templateType72 = parameterizedType67.toMaybeTemplateType();
        boolean boolean73 = parameterizedType67.matchesUint32Context();
        com.google.javascript.rhino.jstype.ObjectType objectType74 = parameterizedType67.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType75 = objectType74.getParameterType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(templateType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertNull(jSType75);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00362");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        node9.setLength(52);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00363");
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList1 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "");
        com.google.common.collect.UnmodifiableIterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableList1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableList1.spliterator();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList23 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray22);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableList23.spliterator();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node32 = node29.useSourceInfoIfMissingFromForTree(node31);
        com.google.javascript.rhino.Node node34 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean35 = node34.isFalse();
        boolean boolean36 = node31.hasChild(node34);
        boolean boolean37 = strComparableList23.contains((java.lang.Object) boolean36);
        int int38 = strComparableList23.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = strComparableList1.addAll(51, (java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableList1);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strComparableList23);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 17 + "'", int38 == 17);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00364");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean2 = node1.isFalse();
        boolean boolean3 = node1.isQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo4 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00365");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder12 = node11.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean18 = node17.isDefaultCase();
        node17.setVarArgs(true);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) 'a', node11, node17, node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node25);
        com.google.javascript.rhino.Node node28 = node4.useSourceInfoFromForTree(node25);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node25.getStaticSourceFile();
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable34 = jSTypeRegistry32.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean35 = jSTypeRegistry32.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList38 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList38, jSTypeArray37);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry32.createFunctionTypeWithVarArgs(jSType36, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList38);
        boolean boolean41 = functionType40.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        boolean boolean48 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node57 = node54.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean58 = node56.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable63 = jSTypeRegistry61.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean64 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry61.createFunctionTypeWithVarArgs(jSType65, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean70 = functionType69.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType71 = jSTypeRegistry44.createEnumType("false", node56, (com.google.javascript.rhino.jstype.JSType) functionType69);
        java.util.Set<java.lang.String> strSet72 = functionType69.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair73 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType40, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.Node node74 = functionType40.getSource();
        node25.setJSType((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.javascript.rhino.jstype.ObjectType objectType76 = functionType40.getPrototype();
        java.lang.String str77 = functionType40.toString();
        com.google.javascript.rhino.jstype.ObjectType objectType78 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType40);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType80 = functionType40.getTopMostDefiningType("{1631934685}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(staticSourceFile29);
        org.junit.Assert.assertNotNull(jSTypeIterable34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(enumType71);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(objectType76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "function (): ?" + "'", str77, "function (): ?");
        org.junit.Assert.assertNotNull(objectType78);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00366");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.canBeCalled();
        boolean boolean12 = functionType10.hasAnyTemplateInternal();
        int int13 = functionType10.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType10.getParentScope();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable15 = functionType10.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionType10.cloneWithoutArrowType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(nodeIterable15);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00367");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean5 = node4.isDefaultCase();
        node4.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId8 = node4.getInputId();
        node4.detachChildren();
        boolean boolean10 = node4.isNot();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder11 = node4.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node16 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node19 = node16.useSourceInfoIfMissingFromForTree(node18);
        node19.setIsSyntheticBlock(true);
        java.lang.String str22 = node19.getString();
        boolean boolean23 = node19.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder30 = node29.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean36 = node35.isDefaultCase();
        node35.setVarArgs(true);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) 'a', node29, node35, node43);
        boolean boolean45 = node29.isScript();
        boolean boolean46 = node29.isObjectLit();
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildAfter(node19, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00368");
        com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode> resolveModeBuilder0 = new com.google.common.collect.ImmutableList.Builder<com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode>();
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00369");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node6 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node7 = node4.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean8 = node4.isSwitch();
        boolean boolean9 = node4.isName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo10 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00370");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType69 = parameterizedType67.autobox();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable74 = jSTypeRegistry72.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean75 = jSTypeRegistry72.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList78 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList78, jSTypeArray77);
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry72.createFunctionTypeWithVarArgs(jSType76, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList78);
        boolean boolean81 = jSType69.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean83 = functionType80.isPropertyTypeInferred("SHEQ  1 [var_args_name: 1]\n");
        com.google.javascript.rhino.jstype.FunctionType functionType84 = functionType80.getOwnerFunction();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(jSTypeIterable74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(functionType84);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00371");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        boolean boolean32 = enumType29.matchesStringContext();
        java.lang.String str33 = enumType29.getReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable39 = jSTypeRegistry37.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean40 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        boolean boolean41 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node50 = node47.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean51 = node49.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable56 = jSTypeRegistry54.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean57 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList60 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60, jSTypeArray59);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry54.createFunctionTypeWithVarArgs(jSType58, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        boolean boolean63 = functionType62.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType64 = jSTypeRegistry37.createEnumType("false", node49, (com.google.javascript.rhino.jstype.JSType) functionType62);
        java.util.Set<java.lang.String> strSet65 = functionType62.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType66 = enumType29.resolve(errorReporter34, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType62);
        boolean boolean67 = jSType66.isOrdinaryFunction();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "enum{false}" + "'", str33, "enum{false}");
        org.junit.Assert.assertNotNull(jSTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(enumType64);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00372");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean3 = node2.isGetProp();
        boolean boolean4 = node2.isNumber();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder10 = node9.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int16 = node15.getType();
        boolean boolean17 = node15.isBlock();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 10, node2, node9, node15, (int) (byte) 10, 44);
        node9.setLength(52);
        boolean boolean23 = node9.isSetterDef();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection24 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node9);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeCollection24);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00373");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = enumType29.getOwnPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n");
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable38 = jSTypeRegistry36.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean39 = jSTypeRegistry36.shouldTolerateUndefinedValues();
        boolean boolean40 = jSTypeRegistry36.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node49 = node46.useSourceInfoIfMissingFromForTree(node48);
        boolean boolean50 = node48.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable55 = jSTypeRegistry53.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean56 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList59 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList59, jSTypeArray58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry53.createFunctionTypeWithVarArgs(jSType57, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList59);
        boolean boolean62 = functionType61.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType63 = jSTypeRegistry36.createEnumType("false", node48, (com.google.javascript.rhino.jstype.JSType) functionType61);
        boolean boolean65 = enumType63.isPropertyTypeDeclared("");
        boolean boolean66 = enumType63.matchesStringContext();
        java.lang.String str67 = enumType63.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType68 = enumType63.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = enumType63.getJSDocInfo();
        enumType63.clearCachedValues();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = enumType29.testForEquality((com.google.javascript.rhino.jstype.JSType) enumType63);
        java.lang.String str72 = enumType29.getReferenceName();
        java.lang.String str73 = enumType29.getDisplayName();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSDocInfo33);
        org.junit.Assert.assertNotNull(jSTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(enumType63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "{1453078922}" + "'", str67, "{1453078922}");
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertNull(jSDocInfo69);
        org.junit.Assert.assertNotNull(ternaryValue71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "enum{false}" + "'", str72, "enum{false}");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "false" + "'", str73, "false");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00374");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(true)" + "'", str1, "(true)");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00375");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0);
        jSTypeRegistry1.incrementGeneration();
        jSTypeRegistry1.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType5 = jSTypeRegistry1.getNativeFunctionType(jSTypeNative4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00376");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node20.isCatch();
        int int22 = node20.getLineno();
        boolean boolean23 = node20.isDebugger();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00377");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node5.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean12 = node11.isDefaultCase();
        node11.setVarArgs(true);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) 'a', node5, node11, node19);
        boolean boolean21 = node5.isScript();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder22 = node5.new FileLevelJsDocBuilder();
        fileLevelJsDocBuilder22.append("SHEQ  1 [var_args_name: 1]\n");
        fileLevelJsDocBuilder22.append("{1018263462}");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00378");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray23 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node24 = jSTypeRegistry22.createParameters(jSTypeArray23);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable29 = jSTypeRegistry27.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean30 = jSTypeRegistry27.shouldTolerateUndefinedValues();
        boolean boolean31 = jSTypeRegistry27.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node40 = node37.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean41 = node39.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList50 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList50, jSTypeArray49);
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry44.createFunctionTypeWithVarArgs(jSType48, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList50);
        boolean boolean53 = functionType52.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType54 = jSTypeRegistry27.createEnumType("false", node39, (com.google.javascript.rhino.jstype.JSType) functionType52);
        java.util.Set<java.lang.String> strSet55 = functionType52.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable60 = jSTypeRegistry58.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean61 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        boolean boolean62 = jSTypeRegistry58.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node70 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node71 = node68.useSourceInfoIfMissingFromForTree(node70);
        boolean boolean72 = node70.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable77 = jSTypeRegistry75.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean78 = jSTypeRegistry75.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray80 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList81 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList81, jSTypeArray80);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry75.createFunctionTypeWithVarArgs(jSType79, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList81);
        boolean boolean84 = functionType83.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType85 = jSTypeRegistry58.createEnumType("false", node70, (com.google.javascript.rhino.jstype.JSType) functionType83);
        com.google.javascript.rhino.jstype.FunctionType functionType86 = functionType83.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType87 = jSTypeRegistry22.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType52, (com.google.javascript.rhino.jstype.JSType) functionType86);
        boolean boolean88 = parameterizedType87.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType89 = parameterizedType87.getIndexType();
        boolean boolean90 = strComparableList18.equals((java.lang.Object) jSType89);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream91 = strComparableList18.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean93 = strComparableList18.add((java.lang.Comparable<java.lang.String>) "BITXOR 10");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(jSTypeIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(enumType54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(jSTypeIterable60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSTypeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(enumType85);
        org.junit.Assert.assertNull(functionType86);
        org.junit.Assert.assertNotNull(parameterizedType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(strComparableStream91);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00379");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNullable();
        boolean boolean69 = parameterizedType67.isFunctionType();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00380");
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList2 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableList2.add((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableList2.size();
        strComparableList2.clear();
        com.google.javascript.rhino.InputId inputId8 = new com.google.javascript.rhino.InputId("{proxy:function (): {882920012}}");
        boolean boolean9 = strComparableList2.remove((java.lang.Object) "{proxy:function (): {882920012}}");
        strComparableList2.clear();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList29 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray28);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator30 = strComparableList29.spliterator();
        com.google.javascript.rhino.Node node35 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node38 = node35.useSourceInfoIfMissingFromForTree(node37);
        com.google.javascript.rhino.Node node40 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean41 = node40.isFalse();
        boolean boolean42 = node37.hasChild(node40);
        boolean boolean43 = strComparableList29.contains((java.lang.Object) boolean42);
        boolean boolean44 = strComparableList2.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable46 = strComparableList29.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strComparableList29);
        org.junit.Assert.assertNotNull(strComparableSpliterator30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00381");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        jSTypeRegistry2.forwardDeclareType("{1687381779}");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00382");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(4095, nodeArray2);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(52, nodeArray2);
        boolean boolean5 = node4.isOr();
        com.google.javascript.rhino.Node node8 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean9 = node8.isGetProp();
        boolean boolean10 = node8.isNumber();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder16 = node15.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node21 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int22 = node21.getType();
        boolean boolean23 = node21.isBlock();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((int) (short) 10, node8, node15, node21, (int) (byte) 10, 44);
        boolean boolean27 = node21.isGetterDef();
        boolean boolean28 = node21.isDec();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean34 = node33.isDefaultCase();
        node33.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId37 = node33.getInputId();
        boolean boolean38 = node33.isCase();
        boolean boolean39 = node33.isInc();
        // The following exception was thrown during execution in test generation
        try {
            node4.addChildBefore(node21, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The existing child node of the parent should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 45 + "'", int22 == 45);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00383");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean36 = enumType34.isPropertyTypeDeclared("");
        boolean boolean37 = enumType34.matchesStringContext();
        java.lang.String str38 = enumType34.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType39 = enumType34.getConstructor();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = enumType34.getJSDocInfo();
        enumType34.clearCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType46 = jSTypeRegistry2.getType((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) enumType34, "", "Not declared as a type name", 36, (int) '#');
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "{1257785945}" + "'", str38, "{1257785945}");
        org.junit.Assert.assertNull(functionType39);
        org.junit.Assert.assertNull(jSDocInfo40);
        org.junit.Assert.assertNotNull(jSType46);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00384");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType67.toMaybeEnumElementType();
        int int70 = parameterizedType67.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType71 = parameterizedType67.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType72 = parameterizedType67.getIndexType();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot74 = parameterizedType67.getOwnSlot("{1270882157}");
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumElementType69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objectType71);
        org.junit.Assert.assertNull(jSType72);
        org.junit.Assert.assertNull(jSTypeStaticSlot74);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00385");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        int int5 = node4.getType();
        boolean boolean6 = node4.isDebugger();
        boolean boolean7 = node4.isString();
        com.google.javascript.rhino.Node node13 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder14 = node13.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean20 = node19.isDefaultCase();
        node19.setVarArgs(true);
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) 'a', node13, node19, node27);
        com.google.javascript.rhino.InputId inputId29 = node13.getInputId();
        com.google.javascript.rhino.Node node30 = node4.useSourceInfoFrom(node13);
        boolean boolean31 = node30.isFromExterns();
        boolean boolean32 = node30.isLocalResultCall();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(inputId29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00386");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(37, "{1891986765}", 30, 3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node12 = node9.useSourceInfoIfMissingFromForTree(node11);
        boolean boolean13 = node11.isExprResult();
        com.google.javascript.rhino.Node node14 = node11.cloneTree();
        node11.setCharno(29);
        boolean boolean17 = node11.isBreak();
        com.google.javascript.rhino.Node node22 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder23 = node22.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node24 = node22.getLastSibling();
        boolean boolean26 = node22.getBooleanProp(17);
        com.google.javascript.rhino.Node node31 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node34 = node31.useSourceInfoIfMissingFromForTree(node33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean40 = node39.isDefaultCase();
        node39.setVarArgs(true);
        com.google.javascript.rhino.InputId inputId43 = node39.getInputId();
        node39.detachChildren();
        com.google.javascript.rhino.Node node45 = node33.copyInformationFrom(node39);
        int int46 = node39.getType();
        java.lang.String[] strArray52 = new java.lang.String[] { "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "Unknown class name", "Unknown class name", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]", "[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        node39.setDirectives((java.util.Set<java.lang.String>) strSet53);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean58 = strSet53.remove((java.lang.Object) node57);
        boolean boolean59 = node57.isString();
        com.google.javascript.rhino.Node node60 = node22.useSourceInfoFromForTree(node57);
        // The following exception was thrown during execution in test generation
        try {
            node4.replaceChildAfter(node11, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputId43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 45 + "'", int46 == 45);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00387");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean31 = enumType29.isPropertyTypeDeclared("");
        boolean boolean32 = enumType29.canBeCalled();
        boolean boolean33 = enumType29.hasCachedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable38 = jSTypeRegistry36.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean39 = jSTypeRegistry36.shouldTolerateUndefinedValues();
        boolean boolean40 = jSTypeRegistry36.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node49 = node46.useSourceInfoIfMissingFromForTree(node48);
        boolean boolean50 = node48.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable55 = jSTypeRegistry53.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean56 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList59 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList59, jSTypeArray58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry53.createFunctionTypeWithVarArgs(jSType57, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList59);
        boolean boolean62 = functionType61.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType63 = jSTypeRegistry36.createEnumType("false", node48, (com.google.javascript.rhino.jstype.JSType) functionType61);
        com.google.javascript.rhino.jstype.FunctionType functionType64 = enumType63.getConstructor();
        enumType29.matchConstraint((com.google.javascript.rhino.jstype.ObjectType) enumType63);
        com.google.javascript.rhino.Node node67 = enumType63.getPropertyNode("[, hi!, hi!, hi!, , , hi!, hi!, hi!, , , , hi!, hi!, hi!, , hi!]");
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(enumType63);
        org.junit.Assert.assertNull(functionType64);
        org.junit.Assert.assertNull(node67);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00388");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType69 = parameterizedType67.toMaybeEnumElementType();
        com.google.javascript.rhino.jstype.TemplateType templateType70 = parameterizedType67.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.UnionType unionType71 = parameterizedType67.toMaybeUnionType();
        com.google.javascript.rhino.jstype.FunctionType functionType72 = parameterizedType67.getOwnerFunction();
        int int73 = parameterizedType67.getPropertiesCount();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(enumElementType69);
        org.junit.Assert.assertNull(templateType70);
        org.junit.Assert.assertNull(unionType71);
        org.junit.Assert.assertNull(functionType72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00389");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        boolean boolean69 = parameterizedType67.isConstructor();
        boolean boolean70 = parameterizedType67.isEmptyType();
        boolean boolean72 = parameterizedType67.isPropertyTypeDeclared("");
        com.google.javascript.rhino.jstype.FunctionType functionType73 = parameterizedType67.getConstructor();
        boolean boolean74 = parameterizedType67.isInstanceType();
        com.google.javascript.rhino.jstype.EnumType enumType75 = parameterizedType67.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType76 = enumType75.getOwnerFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(functionType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(enumType75);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00390");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter6, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray9 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node10 = jSTypeRegistry8.createParameters(jSTypeArray9);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable15 = jSTypeRegistry13.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean16 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        boolean boolean17 = jSTypeRegistry13.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node26 = node23.useSourceInfoIfMissingFromForTree(node25);
        boolean boolean27 = node25.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter28, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable32 = jSTypeRegistry30.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean33 = jSTypeRegistry30.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray35 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList36 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList36, jSTypeArray35);
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry30.createFunctionTypeWithVarArgs(jSType34, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList36);
        boolean boolean39 = functionType38.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType40 = jSTypeRegistry13.createEnumType("false", node25, (com.google.javascript.rhino.jstype.JSType) functionType38);
        java.util.Set<java.lang.String> strSet41 = functionType38.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable46 = jSTypeRegistry44.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean47 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        boolean boolean48 = jSTypeRegistry44.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node57 = node54.useSourceInfoIfMissingFromForTree(node56);
        boolean boolean58 = node56.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable63 = jSTypeRegistry61.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean64 = jSTypeRegistry61.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList67 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList67, jSTypeArray66);
        com.google.javascript.rhino.jstype.FunctionType functionType69 = jSTypeRegistry61.createFunctionTypeWithVarArgs(jSType65, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList67);
        boolean boolean70 = functionType69.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType71 = jSTypeRegistry44.createEnumType("false", node56, (com.google.javascript.rhino.jstype.JSType) functionType69);
        com.google.javascript.rhino.jstype.FunctionType functionType72 = functionType69.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType73 = jSTypeRegistry8.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType38, (com.google.javascript.rhino.jstype.JSType) functionType72);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = parameterizedType73.getConstructor();
        com.google.javascript.rhino.jstype.TemplateType templateType75 = parameterizedType73.toMaybeTemplateType();
        com.google.javascript.rhino.jstype.JSType jSType76 = parameterizedType73.collapseUnion();
        boolean boolean77 = parameterizedType73.isNoResolvedType();
        jSTypeRegistry2.registerPropertyOnType("{1789057375}", (com.google.javascript.rhino.jstype.JSType) parameterizedType73);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative79 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry2.getNativeFunctionType(jSTypeNative79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeArray9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSTypeIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jSTypeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(enumType40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(jSTypeIterable46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(enumType71);
        org.junit.Assert.assertNull(functionType72);
        org.junit.Assert.assertNotNull(parameterizedType73);
        org.junit.Assert.assertNull(functionType74);
        org.junit.Assert.assertNull(templateType75);
        org.junit.Assert.assertNotNull(jSType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00391");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable7 = jSTypeRegistry5.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean8 = jSTypeRegistry5.shouldTolerateUndefinedValues();
        boolean boolean9 = jSTypeRegistry5.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node18 = node15.useSourceInfoIfMissingFromForTree(node17);
        boolean boolean19 = node17.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable24 = jSTypeRegistry22.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean25 = jSTypeRegistry22.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList28, jSTypeArray27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry22.createFunctionTypeWithVarArgs(jSType26, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList28);
        boolean boolean31 = functionType30.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType32 = jSTypeRegistry5.createEnumType("false", node17, (com.google.javascript.rhino.jstype.JSType) functionType30);
        java.util.Set<java.lang.String> strSet33 = functionType30.getOwnPropertyNames();
        boolean boolean34 = functionType30.isInterface();
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable39 = jSTypeRegistry37.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean40 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        boolean boolean41 = jSTypeRegistry37.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node49 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node50 = node47.useSourceInfoIfMissingFromForTree(node49);
        boolean boolean51 = node49.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable56 = jSTypeRegistry54.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean57 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList60 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60, jSTypeArray59);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry54.createFunctionTypeWithVarArgs(jSType58, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        boolean boolean63 = functionType62.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType64 = jSTypeRegistry37.createEnumType("false", node49, (com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean66 = enumType64.isPropertyTypeDeclared("");
        boolean boolean67 = enumType64.matchesStringContext();
        java.lang.String str68 = enumType64.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = enumType64.getConstructor();
        boolean boolean70 = functionType30.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) enumType64);
        com.google.common.collect.ImmutableList<java.lang.String> strList71 = functionType30.getTemplateTypeNames();
        jSTypeRegistry2.setTemplateTypeNames((java.util.List<java.lang.String>) strList71);
        jSTypeRegistry2.forwardDeclareType("{328973212}");
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable80 = jSTypeRegistry78.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean81 = jSTypeRegistry78.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter82 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter82, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable86 = jSTypeRegistry84.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean87 = jSTypeRegistry84.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType88 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray89 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList90 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList90, jSTypeArray89);
        com.google.javascript.rhino.jstype.FunctionType functionType92 = jSTypeRegistry84.createFunctionTypeWithVarArgs(jSType88, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList90);
        boolean boolean93 = functionType92.canBeCalled();
        boolean boolean94 = functionType92.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray95 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry78.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType92, jSTypeArray95);
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList97 = functionType96.getSubTypes();
        boolean boolean98 = jSTypeRegistry2.declareType("{581538441}", (com.google.javascript.rhino.jstype.JSType) functionType96);
        com.google.javascript.rhino.jstype.ObjectType objectType99 = functionType96.getInstanceType();
        org.junit.Assert.assertNotNull(jSTypeIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(enumType32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(enumType64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "{2138174329}" + "'", str68, "{2138174329}");
        org.junit.Assert.assertNull(functionType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(jSTypeIterable80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(jSTypeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(functionType92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jSTypeArray95);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNull(functionTypeList97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(objectType99);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00392");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        boolean boolean68 = parameterizedType67.isNativeObjectType();
        boolean boolean69 = parameterizedType67.isConstructor();
        boolean boolean70 = parameterizedType67.isEmptyType();
        boolean boolean71 = parameterizedType67.isStringObjectType();
        int int72 = parameterizedType67.getPropertiesCount();
        com.google.javascript.rhino.jstype.JSType jSType73 = parameterizedType67.collapseUnion();
        boolean boolean75 = parameterizedType67.removeProperty("Not declared as a constructor");
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(jSType73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00393");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter11, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray14 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node15 = jSTypeRegistry13.createParameters(jSTypeArray14);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable20 = jSTypeRegistry18.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean21 = jSTypeRegistry18.shouldTolerateUndefinedValues();
        boolean boolean22 = jSTypeRegistry18.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node28 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node30 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node31 = node28.useSourceInfoIfMissingFromForTree(node30);
        boolean boolean32 = node30.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable37 = jSTypeRegistry35.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean38 = jSTypeRegistry35.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList41, jSTypeArray40);
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry35.createFunctionTypeWithVarArgs(jSType39, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList41);
        boolean boolean44 = functionType43.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType45 = jSTypeRegistry18.createEnumType("false", node30, (com.google.javascript.rhino.jstype.JSType) functionType43);
        java.util.Set<java.lang.String> strSet46 = functionType43.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable51 = jSTypeRegistry49.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean52 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        boolean boolean53 = jSTypeRegistry49.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node61 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node62 = node59.useSourceInfoIfMissingFromForTree(node61);
        boolean boolean63 = node61.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter64 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter64, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable68 = jSTypeRegistry66.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean69 = jSTypeRegistry66.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType70 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList72 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList72, jSTypeArray71);
        com.google.javascript.rhino.jstype.FunctionType functionType74 = jSTypeRegistry66.createFunctionTypeWithVarArgs(jSType70, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList72);
        boolean boolean75 = functionType74.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType76 = jSTypeRegistry49.createEnumType("false", node61, (com.google.javascript.rhino.jstype.JSType) functionType74);
        com.google.javascript.rhino.jstype.FunctionType functionType77 = functionType74.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType78 = jSTypeRegistry13.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType43, (com.google.javascript.rhino.jstype.JSType) functionType77);
        boolean boolean79 = parameterizedType78.isBooleanObjectType();
        com.google.javascript.rhino.jstype.JSType jSType80 = parameterizedType78.autobox();
        com.google.javascript.rhino.ErrorReporter errorReporter81 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry83 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter81, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable85 = jSTypeRegistry83.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean86 = jSTypeRegistry83.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType87 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList89 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList89, jSTypeArray88);
        com.google.javascript.rhino.jstype.FunctionType functionType91 = jSTypeRegistry83.createFunctionTypeWithVarArgs(jSType87, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList89);
        boolean boolean92 = jSType80.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType91);
        com.google.javascript.rhino.Node node93 = functionType91.getSource();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair94 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType6, (com.google.javascript.rhino.jstype.JSType) functionType91);
        boolean boolean95 = functionType91.hasInstanceType();
        com.google.javascript.rhino.jstype.FunctionType functionType96 = functionType91.toMaybeFunctionType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo98 = functionType91.getOwnPropertyJSDocInfo("{1129850345}");
        boolean boolean99 = functionType91.isAllType();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSTypeIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(enumType45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertNotNull(jSTypeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(enumType76);
        org.junit.Assert.assertNull(functionType77);
        org.junit.Assert.assertNotNull(parameterizedType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jSType80);
        org.junit.Assert.assertNotNull(jSTypeIterable85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(functionType91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNull(node93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNull(jSDocInfo98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00394");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList18 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray17);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableList18.spliterator();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber((double) 100);
        boolean boolean30 = node29.isFalse();
        boolean boolean31 = node26.hasChild(node29);
        boolean boolean32 = strComparableList18.contains((java.lang.Object) boolean31);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor33 = strComparableList18.iterator();
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable38 = jSTypeRegistry36.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean39 = jSTypeRegistry36.shouldTolerateUndefinedValues();
        boolean boolean40 = jSTypeRegistry36.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node46 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node49 = node46.useSourceInfoIfMissingFromForTree(node48);
        boolean boolean50 = node48.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable55 = jSTypeRegistry53.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean56 = jSTypeRegistry53.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList59 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList59, jSTypeArray58);
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry53.createFunctionTypeWithVarArgs(jSType57, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList59);
        boolean boolean62 = functionType61.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType63 = jSTypeRegistry36.createEnumType("false", node48, (com.google.javascript.rhino.jstype.JSType) functionType61);
        boolean boolean65 = enumType63.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo67 = null;
        enumType63.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo67);
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder76 = node75.getJsDocBuilderForNode();
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        boolean boolean82 = node81.isDefaultCase();
        node81.setVarArgs(true);
        com.google.javascript.rhino.Node node89 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node((int) 'a', node75, node81, node89);
        boolean boolean91 = enumType63.defineElement("{209777139}", node89);
        java.lang.Iterable iterable92 = enumType63.getCtorExtendedInterfaces();
        com.google.javascript.rhino.Node node93 = enumType63.getSource();
        int int94 = strComparableList18.indexOf((java.lang.Object) enumType63);
        boolean boolean95 = strComparableList18.isEmpty();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strComparableList18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strComparableItor33);
        org.junit.Assert.assertNotNull(jSTypeIterable38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(enumType63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder76);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(iterable92);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00395");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        com.google.javascript.rhino.jstype.FunctionType functionType30 = enumType29.getConstructor();
        java.lang.Iterable iterable31 = enumType29.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = enumType29.dereference();
        int int33 = enumType29.getPropertiesCount();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNull(functionType30);
        org.junit.Assert.assertNotNull(iterable31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00396");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:function (): {125279184}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00397");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray7 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList8 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList8, jSTypeArray7);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType6, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList8);
        boolean boolean11 = functionType10.matchesObjectContext();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable16 = jSTypeRegistry14.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean17 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        boolean boolean18 = jSTypeRegistry14.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node27 = node24.useSourceInfoIfMissingFromForTree(node26);
        boolean boolean28 = node26.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable33 = jSTypeRegistry31.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean34 = jSTypeRegistry31.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray36 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList37 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList37, jSTypeArray36);
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry31.createFunctionTypeWithVarArgs(jSType35, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList37);
        boolean boolean40 = functionType39.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType41 = jSTypeRegistry14.createEnumType("false", node26, (com.google.javascript.rhino.jstype.JSType) functionType39);
        java.util.Set<java.lang.String> strSet42 = functionType39.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair43 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType10, (com.google.javascript.rhino.jstype.JSType) functionType39);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable44 = functionType39.getImplementedInterfaces();
        boolean boolean45 = functionType39.isOrdinaryFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable50 = jSTypeRegistry48.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean51 = jSTypeRegistry48.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable56 = jSTypeRegistry54.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean57 = jSTypeRegistry54.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList60 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList60, jSTypeArray59);
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry54.createFunctionTypeWithVarArgs(jSType58, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList60);
        boolean boolean63 = functionType62.canBeCalled();
        boolean boolean64 = functionType62.hasAnyTemplateInternal();
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry48.createConstructorType((com.google.javascript.rhino.jstype.JSType) functionType62, jSTypeArray65);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable71 = jSTypeRegistry69.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean72 = jSTypeRegistry69.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray74 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList75 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList75, jSTypeArray74);
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry69.createFunctionTypeWithVarArgs(jSType73, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList75);
        boolean boolean78 = functionType77.canBeCalled();
        java.util.Set<java.lang.String> strSet79 = functionType77.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.FunctionType functionType81 = functionType77.getBindReturnType(40);
        boolean boolean82 = functionType77.isNominalType();
        com.google.javascript.rhino.ErrorReporter errorReporter84 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry86 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter84, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node88 = jSTypeRegistry86.createParameters(jSTypeArray87);
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry48.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType77, false, jSTypeArray87);
        boolean boolean90 = functionType39.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType89);
        java.lang.String str91 = functionType39.getReferenceName();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSTypeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(functionType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSTypeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(enumType41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(objectTypeIterable44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jSTypeArray65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNotNull(jSTypeIterable71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jSTypeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(functionType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00398");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable4 = jSTypeRegistry2.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean5 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        boolean boolean6 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node12 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node15 = node12.useSourceInfoIfMissingFromForTree(node14);
        boolean boolean16 = node14.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry19.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean22 = jSTypeRegistry19.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList25 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList25, jSTypeArray24);
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry19.createFunctionTypeWithVarArgs(jSType23, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList25);
        boolean boolean28 = functionType27.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType29 = jSTypeRegistry2.createEnumType("false", node14, (com.google.javascript.rhino.jstype.JSType) functionType27);
        jSTypeRegistry2.identifyNonNullableName("{815546278}");
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry2.createNamedType("{164095400}", "({928842531})", 44, 45);
        boolean boolean37 = jSType36.isConstructor();
        org.junit.Assert.assertNotNull(jSTypeIterable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(enumType29);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00399");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        boolean boolean36 = enumType34.isPropertyTypeDeclared("");
        boolean boolean37 = enumType34.matchesStringContext();
        boolean boolean39 = enumType34.isPropertyTypeInferred("Not declared as a type name");
        boolean boolean41 = enumType34.isPropertyTypeDeclared("{1400315076}");
        boolean boolean42 = enumType34.isNumberValueType();
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable47 = jSTypeRegistry45.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean48 = jSTypeRegistry45.shouldTolerateUndefinedValues();
        boolean boolean49 = jSTypeRegistry45.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node58 = node55.useSourceInfoIfMissingFromForTree(node57);
        boolean boolean59 = node57.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter60 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter60, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable64 = jSTypeRegistry62.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean65 = jSTypeRegistry62.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList68 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList68, jSTypeArray67);
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry62.createFunctionTypeWithVarArgs(jSType66, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList68);
        boolean boolean71 = functionType70.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType72 = jSTypeRegistry45.createEnumType("false", node57, (com.google.javascript.rhino.jstype.JSType) functionType70);
        boolean boolean74 = enumType72.isPropertyTypeDeclared("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = null;
        enumType72.setPropertyJSDocInfo("SHEQ  1 [var_args_name: 1]\n", jSDocInfo76);
        boolean boolean79 = enumType72.isPropertyInExterns("Unknown class name");
        com.google.javascript.rhino.Node node81 = enumType72.getPropertyNode("Not declared as a type name");
        boolean boolean83 = enumType72.isPropertyTypeInferred("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean84 = enumType72.matchesStringContext();
        boolean boolean85 = enumType72.hasReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter86 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry88 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter86, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable90 = jSTypeRegistry88.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean91 = jSTypeRegistry88.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType92 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray93 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList94 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList94, jSTypeArray93);
        com.google.javascript.rhino.jstype.FunctionType functionType96 = jSTypeRegistry88.createFunctionTypeWithVarArgs(jSType92, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList94);
        com.google.javascript.rhino.jstype.JSType jSType97 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.ObjectType) enumType34, (com.google.javascript.rhino.jstype.JSType) enumType72, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList94);
        boolean boolean98 = enumType34.matchesStringContext();
        boolean boolean99 = enumType34.matchesObjectContext();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(enumType72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jSTypeIterable90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(jSTypeArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(functionType96);
        org.junit.Assert.assertNotNull(jSType97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00400");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray3 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node4 = jSTypeRegistry2.createParameters(jSTypeArray3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable9 = jSTypeRegistry7.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean10 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        boolean boolean11 = jSTypeRegistry7.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node20 = node17.useSourceInfoIfMissingFromForTree(node19);
        boolean boolean21 = node19.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable26 = jSTypeRegistry24.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean27 = jSTypeRegistry24.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList30 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList30, jSTypeArray29);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry24.createFunctionTypeWithVarArgs(jSType28, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList30);
        boolean boolean33 = functionType32.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType34 = jSTypeRegistry7.createEnumType("false", node19, (com.google.javascript.rhino.jstype.JSType) functionType32);
        java.util.Set<java.lang.String> strSet35 = functionType32.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable40 = jSTypeRegistry38.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean41 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        boolean boolean42 = jSTypeRegistry38.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.Node node48 = com.google.javascript.rhino.Node.newString(45, "", 1, (int) (short) 1);
        com.google.javascript.rhino.Node node50 = com.google.javascript.rhino.Node.newNumber((double) 100);
        com.google.javascript.rhino.Node node51 = node48.useSourceInfoIfMissingFromForTree(node50);
        boolean boolean52 = node50.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable57 = jSTypeRegistry55.getTypesWithProperty("SHEQ  1 [var_args_name: 1]\n");
        boolean boolean58 = jSTypeRegistry55.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.JSType> jSTypeList61 = new java.util.ArrayList<com.google.javascript.rhino.jstype.JSType>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.JSType>) jSTypeList61, jSTypeArray60);
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry55.createFunctionTypeWithVarArgs(jSType59, (java.util.List<com.google.javascript.rhino.jstype.JSType>) jSTypeList61);
        boolean boolean64 = functionType63.canBeCalled();
        com.google.javascript.rhino.jstype.EnumType enumType65 = jSTypeRegistry38.createEnumType("false", node50, (com.google.javascript.rhino.jstype.JSType) functionType63);
        com.google.javascript.rhino.jstype.FunctionType functionType66 = functionType63.getConstructor();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType67 = jSTypeRegistry2.createParameterizedType((com.google.javascript.rhino.jstype.ObjectType) functionType32, (com.google.javascript.rhino.jstype.JSType) functionType66);
        com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType32.getOwnerFunction();
        com.google.javascript.rhino.jstype.EnumType enumType69 = functionType32.toMaybeEnumType();
        com.google.javascript.rhino.jstype.ObjectType objectType70 = functionType32.getTypeOfThis();
        boolean boolean71 = objectType70.matchesInt32Context();
        org.junit.Assert.assertNotNull(jSTypeArray3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(enumType34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(jSTypeIterable40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSTypeIterable57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(enumType65);
        org.junit.Assert.assertNull(functionType66);
        org.junit.Assert.assertNotNull(parameterizedType67);
        org.junit.Assert.assertNull(functionType68);
        org.junit.Assert.assertNull(enumType69);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }
}
