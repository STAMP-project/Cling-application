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
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(41);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node3.getJsDocBuilderForNode();
        boolean boolean9 = node3.isTypeOf();
        com.google.javascript.rhino.Node node10 = node3.removeChildren();
        boolean boolean11 = node3.isGetElem();
        com.google.javascript.rhino.Node node12 = node1.copyInformationFrom(node3);
        boolean boolean13 = node1.isNoSideEffectsCall();
        boolean boolean14 = node1.isThrow();
        boolean boolean15 = node1.isInstanceOf();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02402");
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
            com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(29, nodeArray89);
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
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02403");
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
        boolean boolean53 = parameterizedType48.hasAnyTemplateInternal();
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
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02404");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo14.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility17 = null;
        jSDocInfo14.setVisibility(visibility17);
        boolean boolean19 = jSDocInfo14.isInterface();
        boolean boolean20 = jSDocInfo14.isOverride();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList21 = jSDocInfo14.getThrownTypes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = strSet13.contains((java.lang.Object) jSTypeExpressionList21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.google.common.collect.EmptyImmutableList cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectType12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList21);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02405");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 39, 46);
        boolean boolean4 = node3.wasEmptyNode();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj17 = node15.getProp((int) (byte) 10);
        boolean boolean18 = node6.isEquivalentToTyped(node15);
        node6.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node21 = node3.useSourceInfoIfMissingFromForTree(node6);
        boolean boolean22 = node21.isSetterDef();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02406");
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
        jSTypeRegistry2.forwardDeclareType("Not declared as a type name");
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable20 = jSTypeRegistry2.getTypesWithProperty("function (): {2140273663}");
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        jSTypeRegistry27.unregisterPropertyOnType("(Not declared as a type name)", jSType29);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        jSTypeRegistry33.unregisterPropertyOnType("(Not declared as a type name)", jSType35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry33.createFunctionType(jSType37, true, jSTypeArray39);
        boolean boolean42 = functionType40.removeProperty("false");
        boolean boolean43 = functionType40.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType44 = jSTypeRegistry27.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType40);
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative56 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec57 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative56);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        node61.putIntProp((-1), 35);
        boolean boolean65 = node61.isStringKey();
        boolean boolean66 = node61.isThrow();
        com.google.javascript.rhino.Node node67 = node59.useSourceInfoFrom(node61);
        boolean boolean68 = node67.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        jSTypeRegistry71.unregisterPropertyOnType("(Not declared as a type name)", jSType73);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        jSTypeRegistry77.unregisterPropertyOnType("(Not declared as a type name)", jSType79);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry77.createFunctionType(jSType81, true, jSTypeArray83);
        boolean boolean86 = functionType84.removeProperty("false");
        boolean boolean87 = functionType84.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType88 = jSTypeRegistry71.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType84);
        com.google.javascript.rhino.jstype.JSType jSType89 = assertionFunctionSpec57.getAssertedType(node67, jSTypeRegistry71);
        jSTypeRegistry71.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray92 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node93 = jSTypeRegistry71.createOptionalParameters(jSTypeArray92);
        com.google.javascript.rhino.Node node94 = jSTypeRegistry47.createOptionalParameters(jSTypeArray92);
        com.google.javascript.rhino.Node node95 = jSTypeRegistry27.createParameters(jSTypeArray92);
        com.google.javascript.rhino.Node node96 = jSTypeRegistry24.createOptionalParameters(jSTypeArray92);
        com.google.javascript.rhino.jstype.FunctionType functionType97 = jSTypeRegistry2.createFunctionTypeWithVarArgs(jSType21, jSTypeArray92);
        com.google.javascript.rhino.jstype.ObjectType objectType98 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType99 = jSTypeRegistry2.createObjectType(objectType98);
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeIterable20);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSType44);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jSTypeArray83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertNull(jSType89);
        org.junit.Assert.assertNotNull(jSTypeArray92);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertNotNull(functionType97);
        org.junit.Assert.assertNotNull(objectType99);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02407");
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
        int int22 = functionType15.getPropertiesCount();
        boolean boolean23 = functionType15.matchesNumberContext();
        java.lang.String str24 = functionType15.getReferenceName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = null;
        functionType15.setPropertyJSDocInfo("java.io.IOException", jSDocInfo26);
        boolean boolean29 = functionType15.hasOwnProperty("function (): {250812771}");
        boolean boolean30 = functionType15.isDateType();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02408");
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
        jSTypeRegistry16.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        boolean boolean42 = node41.isInstanceOf();
        boolean boolean43 = node41.isNull();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) 'a', node41);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node44, (-1), 16);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        jSTypeRegistry50.unregisterPropertyOnType("(Not declared as a type name)", jSType52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry50.createFunctionType(jSType54, true, jSTypeArray56);
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = functionType57.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType57.getSlot("function (): ?");
        boolean boolean61 = functionType57.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = functionType57.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        com.google.common.collect.ImmutableList<java.lang.String> strList73 = functionType72.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot75 = functionType72.getSlot("NUMBER 0.0 100\n");
        boolean boolean76 = functionType72.isAllType();
        java.lang.Iterable iterable77 = functionType72.getCtorImplementedInterfaces();
        boolean boolean78 = functionType72.isNumberObjectType();
        boolean boolean79 = functionType72.matchesNumberContext();
        boolean boolean80 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType57, (com.google.javascript.rhino.jstype.JSType) functionType72);
        com.google.javascript.rhino.jstype.EnumType enumType81 = jSTypeRegistry16.createEnumType("{proxy:function (): {63549204}}", node47, (com.google.javascript.rhino.jstype.JSType) functionType57);
        java.lang.String str82 = enumType81.getDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType83 = enumType81.getConstructor();
        boolean boolean84 = enumType81.hasReferenceName();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNull(staticSlot75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(enumType81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "{proxy:function " + "'", str82, "{proxy:function ");
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02409");
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
        boolean boolean52 = parameterizedType48.isPropertyTypeInferred("function (): {1319278362}");
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02410");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.isExterns();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        java.lang.String str5 = jSDocInfo0.getSourceName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02411");
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
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFrom(node17);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isCall();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) node1, (java.lang.Object) node17, (java.lang.Object) node25, (java.lang.Object) 53, (java.lang.Object) node29);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile35 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node36 = node29.getFirstChild();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        boolean boolean39 = node38.isCall();
        boolean boolean40 = node38.isDefaultCase();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        boolean boolean43 = node42.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile44 = node42.getStaticSourceFile();
        node42.setLineno((int) '4');
        com.google.javascript.rhino.Node node47 = node38.srcref(node42);
        int int48 = node42.getCharno();
        boolean boolean49 = node42.hasOneChild();
        node29.addChildToBack(node42);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(0);
        node53.putIntProp((-1), 35);
        boolean boolean57 = node53.isStringKey();
        boolean boolean58 = node53.isThrow();
        int int59 = node53.getLineno();
        boolean boolean60 = node53.hasChildren();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0);
        node62.putIntProp((-1), 35);
        boolean boolean66 = node53.hasChild(node62);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0);
        boolean boolean69 = node68.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile70 = node68.getStaticSourceFile();
        com.google.javascript.rhino.Node node74 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(0, node62, node68, node74);
        boolean boolean76 = node68.isLabel();
        node68.setVarArgs(true);
        java.lang.String str79 = node68.getQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean81 = jSDocInfo80.hasThisType();
        boolean boolean82 = jSDocInfo80.shouldPreserveTry();
        boolean boolean83 = jSDocInfo80.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression85 = jSDocInfo80.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean86 = jSDocInfo80.shouldPreserveTry();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(0);
        boolean boolean89 = node88.isCall();
        com.google.javascript.rhino.Node node90 = node88.cloneTree();
        boolean boolean91 = node88.isNull();
        jSDocInfo80.setAssociatedNode(node88);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder93 = node88.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node94 = node68.useSourceInfoIfMissingFromForTree(node88);
        boolean boolean95 = node42.hasChild(node68);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node96 = com.google.javascript.jscomp.NodeUtil.newExpr(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertNull(staticSourceFile35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(staticSourceFile44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(staticSourceFile70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(jSTypeExpression85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02412");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node4);
        namePosition0.setItem(node2);
        int int12 = namePosition0.getPositionOnStartLine();
        int int13 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node14 = namePosition0.getItem();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(42);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        boolean boolean19 = node18.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = node18.getStaticSourceFile();
        com.google.javascript.rhino.Node node21 = node18.getNext();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        boolean boolean29 = node23.isEmpty();
        com.google.javascript.rhino.Node node30 = node18.copyInformationFrom(node23);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.javascript.rhino.Node node37 = node30.srcref(node32);
        boolean boolean38 = node37.isThis();
        com.google.javascript.rhino.Node node39 = node16.clonePropsFrom(node37);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        boolean boolean48 = node44.isStringKey();
        boolean boolean49 = node44.isThrow();
        com.google.javascript.rhino.Node node50 = node42.useSourceInfoFrom(node44);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        node44.setJSType(jSType51);
        node44.detachChildren();
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj59 = node57.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(0);
        node63.putIntProp((-1), 35);
        boolean boolean67 = node63.isStringKey();
        boolean boolean68 = node63.isThrow();
        com.google.javascript.rhino.Node node69 = node61.useSourceInfoFrom(node63);
        boolean boolean70 = node69.isIn();
        com.google.javascript.rhino.Node node71 = node57.clonePropsFrom(node69);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        boolean boolean74 = node73.isInstanceOf();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(0);
        node76.putIntProp((-1), 35);
        boolean boolean80 = node76.isStringKey();
        boolean boolean81 = node76.isThrow();
        boolean boolean82 = node76.isEmpty();
        com.google.javascript.rhino.Node node83 = node73.useSourceInfoFrom(node76);
        boolean boolean84 = node76.isNE();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(31, node44, node57, node76);
        boolean boolean86 = node76.isAnd();
        // The following exception was thrown during execution in test generation
        try {
            node14.addChildAfter(node16, node76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(staticSourceFile20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02413");
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
        boolean boolean22 = node4.isFromExterns();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString("(Not declared as a type name)", 0, 43);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        boolean boolean29 = node28.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile30 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isReturn();
        com.google.javascript.rhino.InputId inputId37 = node32.getInputId();
        node32.setWasEmptyNode(true);
        boolean boolean40 = node32.isLabel();
        boolean boolean41 = node32.isTry();
        com.google.javascript.rhino.Node node42 = node28.srcref(node32);
        com.google.javascript.rhino.Node node43 = node26.useSourceInfoIfMissingFromForTree(node28);
        boolean boolean44 = node26.isNoSideEffectsCall();
        boolean boolean45 = node26.isWith();
        com.google.javascript.rhino.Node node46 = node26.getParent();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(51, node4, node26, 12, 10);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        boolean boolean52 = node51.isInstanceOf();
        boolean boolean53 = node51.isWhile();
        boolean boolean54 = node51.isAdd();
        node26.addChildrenToFront(node51);
        java.lang.Appendable appendable56 = null;
        // The following exception was thrown during execution in test generation
        try {
            node26.appendStringTree(appendable56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(staticSourceFile30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(inputId37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02414");
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
        boolean boolean66 = functionType35.isAllType();
        com.google.javascript.rhino.jstype.ObjectType objectType67 = functionType35.getTypeOfThis();
        com.google.javascript.rhino.Node node68 = null;
        functionType35.setSource(node68);
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
        org.junit.Assert.assertNotNull(objectType67);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02415");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node4);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative12 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec13 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative12);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        boolean boolean16 = node15.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node15.getStaticSourceFile();
        com.google.javascript.rhino.Node node18 = node15.getNext();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        boolean boolean26 = node20.isEmpty();
        com.google.javascript.rhino.Node node27 = node15.copyInformationFrom(node20);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        node31.putIntProp((-1), 35);
        boolean boolean35 = node31.isStringKey();
        boolean boolean36 = node31.isThrow();
        com.google.javascript.rhino.Node node37 = node29.useSourceInfoFrom(node31);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        boolean boolean40 = node39.isCall();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList48 = com.google.common.collect.ImmutableList.of((java.lang.Object) node15, (java.lang.Object) node31, (java.lang.Object) node39, (java.lang.Object) 53, (java.lang.Object) node43);
        com.google.javascript.rhino.Node node49 = assertionFunctionSpec13.getAssertedParam(node43);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        boolean boolean52 = node51.isCall();
        boolean boolean53 = node51.isThrow();
        boolean boolean54 = node51.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55);
        com.google.javascript.rhino.jstype.JSType jSType57 = assertionFunctionSpec13.getAssertedType(node51, jSTypeRegistry56);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) 100, node4, node51);
        boolean boolean59 = node58.isGetElem();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(staticSourceFile17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jSType57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02416");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility0 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList6 = com.google.common.collect.ImmutableList.of(visibility0, visibility1, visibility2, visibility3, visibility4, visibility5);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean9 = jSDocInfo8.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasThisType();
        boolean boolean14 = jSDocInfo12.shouldPreserveTry();
        boolean boolean15 = jSDocInfo12.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList16 = jSDocInfo12.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = jSDocInfo17.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = null;
        jSDocInfo17.setVisibility(visibility20);
        boolean boolean22 = jSDocInfo17.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean24 = jSDocInfo23.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = jSDocInfo23.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility26 = null;
        jSDocInfo23.setVisibility(visibility26);
        boolean boolean28 = jSDocInfo23.isExport();
        java.lang.String str29 = jSDocInfo23.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean31 = jSDocInfo30.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo30.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility33 = null;
        jSDocInfo30.setVisibility(visibility33);
        boolean boolean35 = jSDocInfo30.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList36 = com.google.common.collect.ImmutableList.of(jSDocInfo8, jSDocInfo10, jSDocInfo11, jSDocInfo12, jSDocInfo17, jSDocInfo23, jSDocInfo30);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility37 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo12.setVisibility(visibility37);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility39 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility40 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility41 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility42 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility43 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.javascript.rhino.JSDocInfo.Visibility visibility44 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList45 = com.google.common.collect.ImmutableList.of(visibility39, visibility40, visibility41, visibility42, visibility43, visibility44);
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Visibility> visibilityList46 = com.google.common.collect.ImmutableList.of(visibility1, visibility7, visibility37, visibility39);
        org.junit.Assert.assertTrue("'" + visibility0 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility0.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility1 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility1.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility3 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility3.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility4 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility4.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNotNull(visibilityList6);
        org.junit.Assert.assertTrue("'" + visibility7 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility7.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSTypeExpression19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSTypeExpression25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSTypeExpression32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList36);
        org.junit.Assert.assertTrue("'" + visibility37 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility37.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility39 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility39.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility40 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility40.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility41 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility41.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility42 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility42.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility43 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility43.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + visibility44 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility44.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNotNull(visibilityList45);
        org.junit.Assert.assertNotNull(visibilityList46);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02417");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node4);
        namePosition0.setItem(node2);
        boolean boolean12 = node2.isTry();
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
        node28.putIntProp((-1), 35);
        boolean boolean32 = node28.isReturn();
        com.google.javascript.rhino.Node node33 = node26.srcref(node28);
        boolean boolean34 = node33.isOr();
        boolean boolean35 = node33.isCatch();
        node33.setSourceFileForTesting("function (): {405212503}");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node33);
        node2.setStaticSourceFile(staticSourceFile38);
        int int41 = staticSourceFile38.getLineOffset(409700);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(staticSourceFile38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2147483648) + "'", int41 == (-2147483648));
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02418");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node11.isVar();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node14.getStaticSourceFile();
        node14.setLineno((int) '4');
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj25 = node23.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node26 = node14.copyInformationFrom(node23);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = null;
        node14.setStaticSourceFile(staticSourceFile27);
        int int29 = node14.getType();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        boolean boolean32 = node31.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile33 = node31.getStaticSourceFile();
        com.google.javascript.rhino.Node node34 = node31.getNext();
        boolean boolean35 = node31.isFalse();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean40 = node39.isEmpty();
        node31.addChildrenToBack(node39);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        node44.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((int) (short) 100, node44, 49, (int) (byte) 1);
        com.google.javascript.rhino.Node node51 = node44.cloneNode();
        com.google.javascript.rhino.Node node52 = node31.clonePropsFrom(node44);
        boolean boolean53 = node52.isVar();
        // The following exception was thrown during execution in test generation
        try {
            node14.removeChild(node52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(staticSourceFile33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02419");
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
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(0);
        boolean boolean73 = node72.isCall();
        com.google.javascript.rhino.Node node74 = node72.cloneTree();
        boolean boolean75 = node72.isNull();
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        jSTypeRegistry78.unregisterPropertyOnType("(Not declared as a type name)", jSType80);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray84 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType(jSType82, true, jSTypeArray84);
        boolean boolean86 = functionType85.hasReferenceName();
        com.google.javascript.rhino.jstype.ObjectType objectType87 = jSTypeRegistry2.createObjectType("function (): {2068438814}", node72, (com.google.javascript.rhino.jstype.ObjectType) functionType85);
        com.google.javascript.rhino.jstype.JSType jSType88 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair89 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType85, jSType88);
        com.google.javascript.rhino.jstype.FunctionType functionType90 = functionType85.toMaybeFunctionType();
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jSTypeArray84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNotNull(functionType90);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02420");
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
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList38 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38, charSequenceArray37);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator40 = charSequenceList38.spliterator();
        java.lang.Object[] objArray41 = charSequenceList38.toArray();
        boolean boolean42 = charSequenceList35.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList38);
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
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList67 = charSequenceList49.reverse();
        java.lang.String str68 = charSequenceList67.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = charSequenceList35.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList67);
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
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceList49);
        org.junit.Assert.assertNotNull(charSequenceArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(charSequenceList67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[hi!, , , hi!, hi!]" + "'", str68, "[hi!, , , hi!, hi!]");
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02421");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function (): {687136547}", jSTypeNative1);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02422");
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
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFrom(node17);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isCall();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) node1, (java.lang.Object) node17, (java.lang.Object) node25, (java.lang.Object) 53, (java.lang.Object) node29);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        boolean boolean37 = node36.isInstanceOf();
        node29.addChildrenToFront(node36);
        int int39 = node29.getSourceOffset();
        boolean boolean40 = node29.isVoid();
        com.google.javascript.rhino.InputId inputId41 = com.google.javascript.jscomp.NodeUtil.getInputId(node29);
        com.google.javascript.rhino.Node node42 = node29.removeFirstChild();
        int int43 = node29.getCharno();
        boolean boolean44 = node29.isNew();
        com.google.javascript.rhino.Node node45 = node29.removeFirstChild();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = node45.isFromExterns();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02423");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition3 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker0.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(nodeSourcePosition3);
        org.junit.Assert.assertNull(typePosition4);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02424");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        com.google.javascript.rhino.Node node3 = node1.cloneTree();
        boolean boolean4 = node1.isNull();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        node6.putIntProp((-1), 35);
        boolean boolean10 = node6.isStringKey();
        boolean boolean11 = node6.isThrow();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj17 = node15.getProp((int) (byte) 10);
        boolean boolean18 = node6.isEquivalentToTyped(node15);
        int int19 = node15.getSideEffectFlags();
        node1.addChildrenToBack(node15);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType21 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        boolean boolean29 = node25.isStringKey();
        boolean boolean30 = node25.isThrow();
        com.google.javascript.rhino.Node node31 = node23.useSourceInfoFrom(node25);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        boolean boolean34 = node33.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile35 = node33.getStaticSourceFile();
        com.google.javascript.rhino.Node node36 = node33.getNext();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        node38.putIntProp((-1), 35);
        boolean boolean42 = node38.isStringKey();
        boolean boolean43 = node38.isThrow();
        boolean boolean44 = node38.isEmpty();
        com.google.javascript.rhino.Node node45 = node33.copyInformationFrom(node38);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        node49.putIntProp((-1), 35);
        boolean boolean53 = node49.isStringKey();
        boolean boolean54 = node49.isThrow();
        com.google.javascript.rhino.Node node55 = node47.useSourceInfoFrom(node49);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        boolean boolean58 = node57.isCall();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        node61.putIntProp((-1), 35);
        boolean boolean65 = node61.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList66 = com.google.common.collect.ImmutableList.of((java.lang.Object) node33, (java.lang.Object) node49, (java.lang.Object) node57, (java.lang.Object) 53, (java.lang.Object) node61);
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship67 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType21, node31, node61);
        int int68 = node61.getSourceOffset();
        com.google.javascript.rhino.Node node69 = node1.useSourceInfoIfMissingFromForTree(node61);
        boolean boolean70 = node69.isFunction();
        com.google.javascript.rhino.Node node71 = node69.removeFirstChild();
        node71.setType(42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + subclassType21 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType21.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(staticSourceFile35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objList66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node71);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02425");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative1);
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = assertionFunctionSpec2.getAssertedType(node25, jSTypeRegistry26);
        boolean boolean28 = node25.isComma();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02426");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("function (): {1825464447}", jSTypeNative1);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02427");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "function (): {1688919164}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02428");
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
        jSTypeRegistry16.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        boolean boolean42 = node41.isInstanceOf();
        boolean boolean43 = node41.isNull();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) 'a', node41);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node44, (-1), 16);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        jSTypeRegistry50.unregisterPropertyOnType("(Not declared as a type name)", jSType52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry50.createFunctionType(jSType54, true, jSTypeArray56);
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = functionType57.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType57.getSlot("function (): ?");
        boolean boolean61 = functionType57.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = functionType57.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        com.google.common.collect.ImmutableList<java.lang.String> strList73 = functionType72.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot75 = functionType72.getSlot("NUMBER 0.0 100\n");
        boolean boolean76 = functionType72.isAllType();
        java.lang.Iterable iterable77 = functionType72.getCtorImplementedInterfaces();
        boolean boolean78 = functionType72.isNumberObjectType();
        boolean boolean79 = functionType72.matchesNumberContext();
        boolean boolean80 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType57, (com.google.javascript.rhino.jstype.JSType) functionType72);
        com.google.javascript.rhino.jstype.EnumType enumType81 = jSTypeRegistry16.createEnumType("{proxy:function (): {63549204}}", node47, (com.google.javascript.rhino.jstype.JSType) functionType57);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType82 = enumType81.getElementsType();
        boolean boolean83 = enumElementType82.matchesStringContext();
        boolean boolean84 = enumElementType82.isNullable();
        com.google.javascript.rhino.jstype.FunctionType functionType85 = enumElementType82.getConstructor();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType86 = enumElementType82.toMaybeEnumElementType();
        boolean boolean87 = enumElementType82.isNullable();
        int int88 = enumElementType82.getPropertiesCount();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNull(staticSlot75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(enumType81);
        org.junit.Assert.assertNotNull(enumElementType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(functionType85);
        org.junit.Assert.assertNotNull(enumElementType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02429");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node4);
        namePosition0.setItem(node2);
        boolean boolean12 = node2.isTry();
        node2.putBooleanProp(0, true);
        node2.setSourceEncodedPositionForTree(4095);
        int int18 = node2.getCharno();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4095 + "'", int18 == 4095);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02430");
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
        java.util.Set<java.lang.String> strSet30 = functionType21.getOwnPropertyNames();
        boolean boolean31 = functionType21.hasReferenceName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType32 = functionType21.getSuperClassConstructor();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02431");
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
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter21, true);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        jSTypeRegistry23.unregisterPropertyOnType("(Not declared as a type name)", jSType25);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray29 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType30 = jSTypeRegistry23.createFunctionType(jSType27, true, jSTypeArray29);
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType30.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType32 = functionType30.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        jSTypeRegistry36.unregisterPropertyOnType("(Not declared as a type name)", jSType38);
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        boolean boolean51 = functionType49.removeProperty("false");
        boolean boolean52 = functionType49.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry36.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType49);
        com.google.javascript.rhino.jstype.JSType jSType54 = functionType30.forceResolve(errorReporter33, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType49);
        boolean boolean55 = functionType30.isCheckedUnknownType();
        boolean boolean56 = functionType30.isTemplateType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = functionType30.getOwnPropertyJSDocInfo("hi!");
        jSTypeRegistry2.registerPropertyOnType("function (): {2129138287}", (com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.jstype.JSType jSType64 = jSTypeRegistry2.createNamedType("function (): {1568223225}", "(function (): {1341612873})", 45, 0);
        boolean boolean65 = jSType64.isNominalType();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertNotNull(objectType32);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(jSType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jSDocInfo58);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02432");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(31, "function (): {1757462429}");
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = node2.getChildBefore(node3);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02433");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getParameterNames();
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
        java.lang.Object[] objArray38 = charSequenceList12.toArray();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList39 = charSequenceList12.asList();
        boolean boolean40 = strSet5.equals((java.lang.Object) charSequenceList39);
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter41, true);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        jSTypeRegistry43.unregisterPropertyOnType("(Not declared as a type name)", jSType45);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray49 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType50 = jSTypeRegistry43.createFunctionType(jSType47, true, jSTypeArray49);
        boolean boolean52 = functionType50.removeProperty("false");
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType50.getImplicitPrototype();
        java.util.Set<java.lang.String> strSet54 = objectType53.getPropertyNames();
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList57 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57, charSequenceArray56);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator59 = charSequenceList57.spliterator();
        java.lang.Object[] objArray60 = charSequenceList57.toArray();
        boolean boolean61 = strSet54.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        int int62 = charSequenceList39.lastIndexOf((java.lang.Object) strSet54);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList63 = charSequenceList39.reverse();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = charSequenceList39.add((java.lang.CharSequence) "InputId: true");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNotNull(strSet5);
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
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSTypeArray49);
        org.junit.Assert.assertNotNull(functionType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(charSequenceList63);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02434");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean4 = node3.isEmpty();
        boolean boolean5 = node3.isDebugger();
        boolean boolean6 = node3.isEmpty();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter8, true);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        jSTypeRegistry10.unregisterPropertyOnType("(Not declared as a type name)", jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray16 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType17 = jSTypeRegistry10.createFunctionType(jSType14, true, jSTypeArray16);
        com.google.common.collect.ImmutableList<java.lang.String> strList18 = functionType17.getTemplateTypeNames();
        boolean boolean19 = functionType17.isReturnTypeInferred();
        com.google.javascript.rhino.Node node20 = functionType17.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo21.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility24 = null;
        jSDocInfo21.setVisibility(visibility24);
        boolean boolean26 = jSDocInfo21.isOverride();
        functionType17.setJSDocInfo(jSDocInfo21);
        node3.putProp(44, (java.lang.Object) functionType17);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry31.createFunctionType(jSType35, true, jSTypeArray37);
        boolean boolean39 = functionType38.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        boolean boolean51 = functionType49.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry55.createFunctionType(jSType59, true, jSTypeArray61);
        boolean boolean64 = functionType62.removeProperty("false");
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(0);
        node66.putIntProp((-1), 35);
        boolean boolean70 = node66.isStringKey();
        boolean boolean71 = node66.isThrow();
        com.google.javascript.rhino.Node node75 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj77 = node75.getProp((int) (byte) 10);
        boolean boolean78 = node66.isEquivalentToTyped(node75);
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(0);
        node81.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(32, node81);
        boolean boolean86 = node85.isInstanceOf();
        com.google.javascript.rhino.Node node87 = node75.useSourceInfoFromForTree(node85);
        boolean boolean88 = node85.isDo();
        boolean boolean89 = functionType49.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType62, node85);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair90 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType38, (com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean91 = functionType38.matchesNumberContext();
        boolean boolean92 = functionType38.isParameterizedType();
        java.util.Set<java.lang.String> strSet93 = functionType38.getOwnPropertyNames();
        java.util.Iterator<java.lang.String> strItor94 = strSet93.iterator();
        node3.setDirectives(strSet93);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray16);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertNotNull(strItor94);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02435");
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList0 = com.google.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(jSTypeExpressionList0);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02436");
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
            com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node((int) ' ', nodeArray89, (-2147483648), 36);
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
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02437");
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
        boolean boolean34 = functionType28.canBeCalled();
        com.google.javascript.rhino.jstype.ObjectType objectType35 = functionType28.getPrototype();
        com.google.javascript.rhino.jstype.JSType jSType37 = objectType35.getPropertyType("{proxy:function (): {374905701}}");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objectType35);
        org.junit.Assert.assertNotNull(jSType37);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02438");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable11 = jSTypeRegistry2.getEachReferenceTypeWithProperty("NUMBER 0.0 100\n");
        boolean boolean13 = jSTypeRegistry2.hasNamespace("[hi!, hi!, , , hi!]");
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
        boolean boolean35 = jSTypeRegistry16.hasNamespace("hi!");
        jSTypeRegistry16.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray37 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType38 = jSTypeRegistry16.createUnionType(jSTypeNativeArray37);
        com.google.javascript.rhino.jstype.JSType jSType39 = jSTypeRegistry2.createUnionType(jSTypeNativeArray37);
        boolean boolean41 = jSTypeRegistry2.isForwardDeclaredType("function (): {281944583}");
        com.google.javascript.rhino.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter42, true);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        jSTypeRegistry44.unregisterPropertyOnType("(Not declared as a type name)", jSType46);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray50 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType51 = jSTypeRegistry44.createFunctionType(jSType48, true, jSTypeArray50);
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType51.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType53 = functionType51.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        jSTypeRegistry57.unregisterPropertyOnType("(Not declared as a type name)", jSType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        jSTypeRegistry63.unregisterPropertyOnType("(Not declared as a type name)", jSType65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry63.createFunctionType(jSType67, true, jSTypeArray69);
        boolean boolean72 = functionType70.removeProperty("false");
        boolean boolean73 = functionType70.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry57.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType70);
        com.google.javascript.rhino.jstype.JSType jSType75 = functionType51.forceResolve(errorReporter54, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType70);
        com.google.javascript.rhino.Node node77 = functionType70.getPropertyNode("(Unknown class name)");
        com.google.javascript.rhino.jstype.ObjectType objectType78 = functionType70.getPrototype();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet79 = objectType78.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType80 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType78);
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray81 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType82 = jSTypeRegistry2.createUnionType(jSTypeNativeArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(objectTypeIterable11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jSType33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray37);
        org.junit.Assert.assertNotNull(jSType38);
        org.junit.Assert.assertNotNull(jSType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jSTypeArray50);
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(objectType53);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(objectType78);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet79 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH + "'", booleanLiteralSet79.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.BOTH));
        org.junit.Assert.assertNotNull(jSType80);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02439");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        boolean boolean12 = functionType9.hasDisplayName();
        boolean boolean13 = functionType9.isStringObjectType();
        java.util.Set<java.lang.String> strSet14 = functionType9.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType9.getTypeOfThis();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = functionType9.getOwnPropertyJSDocInfo("function (): {1685012791}");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = functionType9.getConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(jSType15);
        org.junit.Assert.assertNull(jSDocInfo17);
        org.junit.Assert.assertNull(functionType18);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02440");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        boolean boolean3 = node1.isThrow();
        boolean boolean4 = node1.isComma();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02441");
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
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isStringKey();
        boolean boolean22 = node17.isThrow();
        com.google.javascript.rhino.Node node23 = node15.useSourceInfoFrom(node17);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isCall();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList34 = com.google.common.collect.ImmutableList.of((java.lang.Object) node1, (java.lang.Object) node17, (java.lang.Object) node25, (java.lang.Object) 53, (java.lang.Object) node29);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile35 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        boolean boolean38 = node37.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = node37.getStaticSourceFile();
        java.lang.String str40 = node37.getSourceFileName();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        boolean boolean43 = node42.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile44 = node42.getStaticSourceFile();
        com.google.javascript.rhino.Node node45 = node42.getNext();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        boolean boolean51 = node47.isStringKey();
        boolean boolean52 = node47.isThrow();
        boolean boolean53 = node47.isEmpty();
        com.google.javascript.rhino.Node node54 = node42.copyInformationFrom(node47);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isStringKey();
        boolean boolean63 = node58.isThrow();
        com.google.javascript.rhino.Node node64 = node56.useSourceInfoFrom(node58);
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(0);
        boolean boolean67 = node66.isCall();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node(0);
        node70.putIntProp((-1), 35);
        boolean boolean74 = node70.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList75 = com.google.common.collect.ImmutableList.of((java.lang.Object) node42, (java.lang.Object) node58, (java.lang.Object) node66, (java.lang.Object) 53, (java.lang.Object) node70);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(0);
        boolean boolean78 = node77.isInstanceOf();
        node70.addChildrenToFront(node77);
        int int80 = node70.getSourceOffset();
        boolean boolean81 = node70.isVoid();
        com.google.javascript.rhino.Node node82 = node37.useSourceInfoIfMissingFrom(node70);
        boolean boolean83 = node70.isOr();
        com.google.javascript.rhino.Node node84 = node29.srcref(node70);
        boolean boolean85 = node84.isVar();
        boolean boolean86 = node84.isAnd();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objList34);
        org.junit.Assert.assertNull(staticSourceFile35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(staticSourceFile39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(staticSourceFile44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(objList75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02442");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator4 = charSequenceList2.spliterator();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream5 = charSequenceList2.stream();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray11);
        boolean boolean13 = charSequenceList2.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean14 = charSequenceList12.isEmpty();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList15 = charSequenceList12.reverse();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        com.google.common.collect.ImmutableList<java.lang.String> strList26 = functionType25.getTemplateTypeNames();
        boolean boolean27 = functionType25.isNullType();
        int int28 = charSequenceList12.indexOf((java.lang.Object) functionType25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = charSequenceList12.add((java.lang.CharSequence) "{proxy:function (): {784021526}}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator4);
        org.junit.Assert.assertNotNull(charSequenceStream5);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charSequenceList15);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02443");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
        boolean boolean11 = functionType9.hasInstanceType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasThisType();
        boolean boolean14 = jSDocInfo12.shouldPreserveTry();
        java.lang.String str15 = jSDocInfo12.getDescription();
        java.lang.String str16 = jSDocInfo12.getLendsName();
        functionType9.setJSDocInfo(jSDocInfo12);
        boolean boolean19 = jSDocInfo12.hasParameter("function (): {1976806267}");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02444");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        boolean boolean3 = jSDocInfo0.hasEnumParameterType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection4 = jSDocInfo0.getMarkers();
        boolean boolean5 = jSDocInfo0.isOverride();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(markerCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02445");
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
        boolean boolean53 = parameterizedType48.removeProperty("function (): {1120480319}");
        boolean boolean54 = parameterizedType48.isInstanceType();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02446");
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
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        node32.putIntProp((-1), 35);
        boolean boolean36 = node32.isStringKey();
        boolean boolean37 = node32.isThrow();
        com.google.javascript.rhino.Node node38 = node30.useSourceInfoFrom(node32);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative40 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec41 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative40);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        boolean boolean44 = node43.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile45 = node43.getStaticSourceFile();
        com.google.javascript.rhino.Node node46 = node43.getNext();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0);
        node48.putIntProp((-1), 35);
        boolean boolean52 = node48.isStringKey();
        boolean boolean53 = node48.isThrow();
        boolean boolean54 = node48.isEmpty();
        com.google.javascript.rhino.Node node55 = node43.copyInformationFrom(node48);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0);
        node59.putIntProp((-1), 35);
        boolean boolean63 = node59.isStringKey();
        boolean boolean64 = node59.isThrow();
        com.google.javascript.rhino.Node node65 = node57.useSourceInfoFrom(node59);
        com.google.javascript.rhino.Node node67 = new com.google.javascript.rhino.Node(0);
        boolean boolean68 = node67.isCall();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        boolean boolean75 = node71.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList76 = com.google.common.collect.ImmutableList.of((java.lang.Object) node43, (java.lang.Object) node59, (java.lang.Object) node67, (java.lang.Object) 53, (java.lang.Object) node71);
        com.google.javascript.rhino.Node node77 = assertionFunctionSpec41.getAssertedParam(node71);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(0);
        boolean boolean80 = node79.isCall();
        boolean boolean81 = node79.isThrow();
        boolean boolean82 = node79.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter83 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry84 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter83);
        com.google.javascript.rhino.jstype.JSType jSType85 = assertionFunctionSpec41.getAssertedType(node79, jSTypeRegistry84);
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node((int) (byte) 100, node32, node79);
        boolean boolean87 = node79.isFalse();
        typePosition0.setItem(node79);
        // The following exception was thrown during execution in test generation
        try {
            typePosition0.setPositionInformation(54, (-1), (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 54?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(staticSourceFile45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(objList76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02447");
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
        com.google.javascript.rhino.jstype.FunctionType functionType66 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = functionType35.hasEqualCallType(functionType66);
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
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02448");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.autoboxesTo();
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable61 = functionType20.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet62 = functionType20.getPossibleToBooleanOutcomes();
        boolean boolean63 = functionType20.matchesNumberContext();
        boolean boolean64 = functionType9.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType20);
        boolean boolean65 = functionType20.isObject();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNull(jSType10);
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
        org.junit.Assert.assertNotNull(objectTypeIterable61);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet62 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet62.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02449");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        boolean boolean7 = node1.isEmpty();
        boolean boolean8 = node1.isHook();
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        node1.setJSType(jSType9);
        com.google.javascript.rhino.Node node11 = node1.cloneNode();
        int int13 = node1.getIntProp(40);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02450");
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
        com.google.javascript.rhino.jstype.ObjectType objectType30 = functionType21.getTypeOfThis();
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
        org.junit.Assert.assertNotNull(objectType30);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02451");
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
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        boolean boolean52 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope54 = null;
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.forceResolve(errorReporter53, jSTypeStaticScope54);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jSType55);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02452");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(37, "JSDocInfo");
        boolean boolean3 = node2.isAdd();
        boolean boolean4 = node2.isFunction();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02453");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getSlot("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasThisType();
        boolean boolean19 = jSDocInfo17.shouldPreserveTry();
        boolean boolean20 = jSDocInfo17.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList21 = jSDocInfo17.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo22.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = null;
        jSDocInfo22.setVisibility(visibility25);
        boolean boolean27 = jSDocInfo22.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean29 = jSDocInfo28.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = jSDocInfo28.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility31 = null;
        jSDocInfo28.setVisibility(visibility31);
        boolean boolean33 = jSDocInfo28.isExport();
        java.lang.String str34 = jSDocInfo28.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean36 = jSDocInfo35.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = jSDocInfo35.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility38 = null;
        jSDocInfo35.setVisibility(visibility38);
        boolean boolean40 = jSDocInfo35.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList41 = com.google.common.collect.ImmutableList.of(jSDocInfo13, jSDocInfo15, jSDocInfo16, jSDocInfo17, jSDocInfo22, jSDocInfo28, jSDocInfo35);
        java.lang.String str42 = jSDocInfo13.getLendsName();
        jSDocInfo13.setDeprecated(true);
        functionType9.setJSDocInfo(jSDocInfo13);
        com.google.javascript.rhino.jstype.ObjectType objectType47 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface((com.google.javascript.rhino.jstype.ObjectType) functionType9, "{proxy:function (): {1813218900}}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType48 = objectType47.dereference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jSTypeExpression30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jSTypeExpression37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(objectType47);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02454");
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
        boolean boolean88 = parameterizedType48.isInstanceType();
        java.lang.Iterable iterable89 = parameterizedType48.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.EnumType enumType90 = parameterizedType48.toMaybeEnumType();
        boolean boolean91 = parameterizedType48.isNoType();
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
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(iterable89);
        org.junit.Assert.assertNull(enumType90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02455");
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
        boolean boolean52 = functionType22.isEnumType();
        com.google.javascript.rhino.Node node54 = functionType22.getPropertyNode("{proxy:function (): {273584171}}");
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node54);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02456");
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
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType80.restrictByNotNullOrUndefined();
        boolean boolean82 = functionType80.isUnionType();
        boolean boolean83 = functionType80.matchesUint32Context();
        jSTypeRegistry2.registerPropertyOnType("function (): {1642730975}", (com.google.javascript.rhino.jstype.JSType) functionType80);
        boolean boolean85 = functionType80.isNominalType();
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
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02457");
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
        boolean boolean35 = node12.hasChildren();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable36 = node12.siblings();
        boolean boolean37 = node12.isGetProp();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeIterable36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02458");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean52 = jSDocInfo51.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = jSDocInfo51.getBaseType();
        java.lang.String str54 = jSDocInfo51.getFileOverview();
        int int55 = jSDocInfo51.getExtendedInterfacesCount();
        boolean boolean56 = jSDocInfo51.isNoShadow();
        boolean boolean57 = jSDocInfo51.hasReturnType();
        parameterizedType48.setPropertyJSDocInfo("(function (): {1341612873})", jSDocInfo51);
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = parameterizedType48.getSlot("{proxy:function (): {1136642478}}");
        boolean boolean61 = parameterizedType48.isUnknownType();
        com.google.javascript.rhino.jstype.ObjectType.Property property63 = parameterizedType48.getSlot("function (): {1116489338}");
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSTypeExpression53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(property63);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02459");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        com.google.javascript.rhino.Node node3 = node1.cloneTree();
        boolean boolean4 = node3.isAssignAdd();
        boolean boolean5 = node3.isVoid();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = node7.getStaticSourceFile();
        com.google.javascript.rhino.Node node10 = node7.getNext();
        boolean boolean11 = node7.isFalse();
        com.google.javascript.rhino.Node node15 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean16 = node15.isEmpty();
        node7.addChildrenToBack(node15);
        boolean boolean18 = node3.isEquivalentTo(node7);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        boolean boolean21 = node20.isInstanceOf();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        boolean boolean29 = node23.isEmpty();
        com.google.javascript.rhino.Node node30 = node20.useSourceInfoFrom(node23);
        boolean boolean31 = node30.isVar();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        boolean boolean34 = node33.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile35 = node33.getStaticSourceFile();
        node33.setLineno((int) '4');
        com.google.javascript.rhino.Node node38 = node30.useSourceInfoIfMissingFrom(node33);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj44 = node42.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node45 = node33.copyInformationFrom(node42);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile46 = null;
        node33.setStaticSourceFile(staticSourceFile46);
        int int48 = node33.getType();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(0);
        node50.putIntProp((-1), 35);
        boolean boolean54 = node50.isStringKey();
        boolean boolean55 = node50.isThrow();
        int int56 = node50.getLineno();
        boolean boolean57 = node50.hasChildren();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(0);
        node60.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(32, node60);
        boolean boolean65 = node60.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node66 = node50.useSourceInfoIfMissingFromForTree(node60);
        com.google.javascript.rhino.Node node67 = null;
        boolean boolean68 = node60.hasChild(node67);
        // The following exception was thrown during execution in test generation
        try {
            node3.replaceChildAfter(node33, node60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(staticSourceFile9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(staticSourceFile35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02460");
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
        boolean boolean53 = parameterizedType48.hasReferenceName();
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.FunctionType functionType55 = parameterizedType48.getConstructor();
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
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(functionType55);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02461");
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
        com.google.javascript.rhino.jstype.FunctionType functionType51 = functionType22.getBindReturnType(36);
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = functionType51.getOwnPropertyJSDocInfo("{proxy:function (): {2066726531}}");
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
        org.junit.Assert.assertNotNull(functionType51);
        org.junit.Assert.assertNull(jSDocInfo53);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02462");
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
        com.google.javascript.rhino.jstype.JSType jSType85 = jSTypeRegistry16.createUnionType(jSTypeArray82);
        jSTypeRegistry16.setLastGeneration(false);
        jSTypeRegistry16.forwardDeclareType("function (): {1688919164}");
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
        org.junit.Assert.assertNotNull(jSType85);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02463");
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
        java.lang.String str12 = jSDocInfo0.getBlockDescription();
        boolean boolean13 = jSDocInfo0.isNoCompile();
        java.lang.String str14 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo0.getType();
        java.lang.String str16 = jSDocInfo0.getVersion();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02464");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = functionType9.toObjectType();
        boolean boolean12 = functionType9.isUnionType();
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType9.getReturnType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSType13);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02465");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.hasAnyTemplate();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = functionType9.getOwnerFunction();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = functionType12.isEnumType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(functionType12);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02466");
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
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        boolean boolean26 = node25.isTypeOf();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(31, node25);
        com.google.javascript.rhino.Node node28 = node27.removeChildren();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        node30.putIntProp((-1), 35);
        boolean boolean34 = node30.isStringKey();
        boolean boolean35 = node30.isThrow();
        com.google.javascript.rhino.Node node39 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj41 = node39.getProp((int) (byte) 10);
        boolean boolean42 = node30.isEquivalentToTyped(node39);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(32, node45);
        boolean boolean50 = node49.isInstanceOf();
        com.google.javascript.rhino.Node node51 = node39.useSourceInfoFromForTree(node49);
        boolean boolean52 = node39.isExprResult();
        boolean boolean53 = node39.isIn();
        com.google.javascript.rhino.Node node54 = node27.clonePropsFrom(node39);
        node20.addChildToBack(node54);
        com.google.javascript.rhino.Node node56 = node54.removeFirstChild();
        boolean boolean57 = node54.isThis();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02467");
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
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        jSTypeRegistry72.unregisterPropertyOnType("(Not declared as a type name)", jSType74);
        com.google.javascript.rhino.jstype.JSType jSType76 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray78 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType79 = jSTypeRegistry72.createFunctionType(jSType76, true, jSTypeArray78);
        boolean boolean81 = functionType79.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType83 = functionType79.findPropertyType("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType.Property property85 = functionType79.getSlot("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType86 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType79);
        boolean boolean88 = functionType79.isPropertyTypeInferred("Not declared as a type name");
        boolean boolean89 = functionType79.isString();
        boolean boolean90 = functionType79.isNativeObjectType();
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
        org.junit.Assert.assertNotNull(jSTypeArray78);
        org.junit.Assert.assertNotNull(functionType79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(jSType83);
        org.junit.Assert.assertNull(property85);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02468");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("unknown", 37, (int) (short) -1);
        boolean boolean4 = node3.isGetterDef();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02469");
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
        boolean boolean34 = node29.isAssign();
        boolean boolean35 = node29.isQualifiedName();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02470");
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
        com.google.javascript.rhino.jstype.EnumType enumType14 = functionType9.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = enumType14.isPropertyTypeInferred("function (): {830970776}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNull(enumType14);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02471");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02472");
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
        java.lang.String str52 = parameterizedType48.toAnnotationString();
        boolean boolean53 = parameterizedType48.isInterface();
        boolean boolean54 = parameterizedType48.isNullable();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean57 = jSDocInfo56.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo56.getBaseType();
        java.lang.String str59 = jSDocInfo56.getLicense();
        java.lang.String str60 = jSDocInfo56.getMeaning();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList61 = jSDocInfo56.getThrownTypes();
        boolean boolean62 = jSDocInfo56.isConsistentIdGenerator();
        boolean boolean63 = jSDocInfo56.hasBaseType();
        parameterizedType48.setPropertyJSDocInfo("function (): {1588302745}", jSDocInfo56);
        com.google.javascript.rhino.jstype.EnumElementType enumElementType65 = parameterizedType48.toMaybeEnumElementType();
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "function (): ?.<function (): ?>" + "'", str52, "function (): ?.<function (): ?>");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(jSTypeExpression58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(jSTypeExpressionList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(enumElementType65);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02473");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.setMutatesGlobalState();
        int int5 = sideEffectFlags1.valueOf();
        boolean boolean6 = sideEffectFlags1.areAllFlagsSet();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02474");
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
        boolean boolean20 = functionType19.isReturnTypeInferred();
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
        com.google.javascript.rhino.jstype.JSType.TypePair typePair71 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType43);
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        jSTypeRegistry75.unregisterPropertyOnType("(Not declared as a type name)", jSType77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry75.createFunctionType(jSType79, true, jSTypeArray81);
        boolean boolean84 = functionType82.removeProperty("false");
        boolean boolean85 = functionType82.isNativeObjectType();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(0);
        node88.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node((int) (short) 100, node88, 49, (int) (byte) 1);
        boolean boolean95 = functionType43.defineDeclaredProperty("", (com.google.javascript.rhino.jstype.JSType) functionType82, node88);
        boolean boolean96 = functionType43.isEnumType();
        com.google.javascript.rhino.jstype.ObjectType objectType97 = jSTypeRegistry2.createObjectType((com.google.javascript.rhino.jstype.ObjectType) functionType43);
        com.google.javascript.rhino.jstype.ObjectType objectType98 = jSTypeRegistry2.createAnonymousObjectType();
        boolean boolean99 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
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
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(objectType97);
        org.junit.Assert.assertNotNull(objectType98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02475");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:function (): {1828131673}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02476");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean20 = jSDocInfo19.hasThisType();
        boolean boolean21 = jSDocInfo19.shouldPreserveTry();
        boolean boolean22 = jSDocInfo19.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo19.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean25 = jSDocInfo19.shouldPreserveTry();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        boolean boolean28 = node27.isCall();
        com.google.javascript.rhino.Node node29 = node27.cloneTree();
        boolean boolean30 = node27.isNull();
        jSDocInfo19.setAssociatedNode(node27);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        boolean boolean43 = functionType41.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        boolean boolean56 = functionType54.removeProperty("false");
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isStringKey();
        boolean boolean63 = node58.isThrow();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj69 = node67.getProp((int) (byte) 10);
        boolean boolean70 = node58.isEquivalentToTyped(node67);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        node73.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(32, node73);
        boolean boolean78 = node77.isInstanceOf();
        com.google.javascript.rhino.Node node79 = node67.useSourceInfoFromForTree(node77);
        boolean boolean80 = node77.isDo();
        boolean boolean81 = functionType41.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType54, node77);
        boolean boolean82 = functionType54.isUnknownType();
        java.util.Set<java.lang.String> strSet83 = functionType54.getPropertyNames();
        node27.setJSType((com.google.javascript.rhino.jstype.JSType) functionType54);
        jSTypeRegistry2.unregisterPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) functionType54);
        int int86 = functionType54.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType87 = functionType54.getImplicitPrototype();
        java.lang.String str88 = objectType87.getNormalizedReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType89 = objectType87.restrictByNotNullOrUndefined();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Function" + "'", str88, "Function");
        org.junit.Assert.assertNotNull(jSType89);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02477");
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
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        jSTypeRegistry20.unregisterPropertyOnType("(Not declared as a type name)", jSType22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry20.createFunctionType(jSType24, true, jSTypeArray26);
        boolean boolean29 = functionType27.removeProperty("false");
        boolean boolean30 = functionType27.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType31 = jSTypeRegistry14.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType27);
        boolean boolean33 = jSTypeRegistry14.hasNamespace("hi!");
        jSTypeRegistry14.clearTemplateTypeNames();
        com.google.javascript.rhino.jstype.JSTypeNative[] jSTypeNativeArray35 = new com.google.javascript.rhino.jstype.JSTypeNative[] {};
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry14.createUnionType(jSTypeNativeArray35);
        jSTypeRegistry14.resetForTypeCheck();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        jSTypeRegistry40.unregisterPropertyOnType("(Not declared as a type name)", jSType42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry40.createFunctionType(jSType44, true, jSTypeArray46);
        boolean boolean49 = functionType47.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter51 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter51, true);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        jSTypeRegistry53.unregisterPropertyOnType("(Not declared as a type name)", jSType55);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray59 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType60 = jSTypeRegistry53.createFunctionType(jSType57, true, jSTypeArray59);
        boolean boolean62 = functionType60.removeProperty("false");
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0);
        node64.putIntProp((-1), 35);
        boolean boolean68 = node64.isStringKey();
        boolean boolean69 = node64.isThrow();
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj75 = node73.getProp((int) (byte) 10);
        boolean boolean76 = node64.isEquivalentToTyped(node73);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(0);
        node79.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node(32, node79);
        boolean boolean84 = node83.isInstanceOf();
        com.google.javascript.rhino.Node node85 = node73.useSourceInfoFromForTree(node83);
        boolean boolean86 = node83.isDo();
        boolean boolean87 = functionType47.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType60, node83);
        boolean boolean88 = functionType60.isUnknownType();
        boolean boolean89 = functionType60.isInterface();
        boolean boolean90 = functionType60.hasImplementedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType91 = functionType60.getConstructor();
        boolean boolean93 = functionType60.isPropertyInExterns("");
        com.google.javascript.rhino.jstype.JSType jSType94 = jSTypeRegistry14.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) functionType60);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue95 = objectType11.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType60);
        java.lang.String str96 = ternaryValue95.toString();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNotNull(objectType11);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jSTypeNativeArray35);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSTypeArray59);
        org.junit.Assert.assertNotNull(functionType60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(functionType91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertNotNull(ternaryValue95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "unknown" + "'", str96, "unknown");
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02478");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 46);
        boolean boolean2 = node1.isGetElem();
        boolean boolean3 = node1.isVarArgs();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        jSTypeRegistry6.unregisterPropertyOnType("(Not declared as a type name)", jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry6.createFunctionType(jSType10, true, jSTypeArray12);
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType13.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = functionType13.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter17, true);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        jSTypeRegistry19.unregisterPropertyOnType("(Not declared as a type name)", jSType21);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        boolean boolean34 = functionType32.removeProperty("false");
        boolean boolean35 = functionType32.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType36 = jSTypeRegistry19.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType32);
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType13.forceResolve(errorReporter16, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType32);
        boolean boolean38 = functionType13.isCheckedUnknownType();
        java.lang.Iterable iterable39 = functionType13.getCtorExtendedInterfaces();
        java.lang.Iterable iterable40 = functionType13.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable41 = functionType13.getCtorImplementedInterfaces();
        java.util.Set<java.lang.String> strSet42 = functionType13.getOwnPropertyNames();
        node1.setDirectives(strSet42);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(objectType15);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSType36);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(iterable39);
        org.junit.Assert.assertNotNull(iterable40);
        org.junit.Assert.assertNotNull(objectTypeIterable41);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02479");
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
        boolean boolean24 = node20.isName();
        boolean boolean25 = node20.isCase();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative27 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec28 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative27);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        boolean boolean31 = node30.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile32 = node30.getStaticSourceFile();
        com.google.javascript.rhino.Node node33 = node30.getNext();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        boolean boolean39 = node35.isStringKey();
        boolean boolean40 = node35.isThrow();
        boolean boolean41 = node35.isEmpty();
        com.google.javascript.rhino.Node node42 = node30.copyInformationFrom(node35);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0);
        node46.putIntProp((-1), 35);
        boolean boolean50 = node46.isStringKey();
        boolean boolean51 = node46.isThrow();
        com.google.javascript.rhino.Node node52 = node44.useSourceInfoFrom(node46);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        boolean boolean55 = node54.isCall();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList63 = com.google.common.collect.ImmutableList.of((java.lang.Object) node30, (java.lang.Object) node46, (java.lang.Object) node54, (java.lang.Object) 53, (java.lang.Object) node58);
        com.google.javascript.rhino.Node node64 = assertionFunctionSpec28.getAssertedParam(node58);
        boolean boolean65 = node64.isCase();
        com.google.javascript.rhino.Node node66 = node20.clonePropsFrom(node64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str67 = node64.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(staticSourceFile32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objList63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02480");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = jSDocInfo0.getReturnType();
        java.lang.String str30 = jSDocInfo0.getFileOverview();
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
        org.junit.Assert.assertNull(jSTypeExpression29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02481");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        boolean boolean6 = node2.isStringKey();
        boolean boolean7 = node2.isThrow();
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj13 = node11.getProp((int) (byte) 10);
        boolean boolean14 = node2.isEquivalentToTyped(node11);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(32, node17);
        boolean boolean22 = node21.isInstanceOf();
        com.google.javascript.rhino.Node node23 = node11.useSourceInfoFromForTree(node21);
        boolean boolean24 = node21.isDo();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        node28.putIntProp((-1), 35);
        boolean boolean32 = node28.isStringKey();
        boolean boolean33 = node28.isThrow();
        com.google.javascript.rhino.Node node34 = node26.useSourceInfoFrom(node28);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        boolean boolean40 = node36.isReturn();
        com.google.javascript.rhino.InputId inputId41 = node36.getInputId();
        node36.setWasEmptyNode(true);
        int int44 = node34.getIndexOfChild(node36);
        boolean boolean45 = node36.isAssign();
        boolean boolean46 = node36.isLocalResultCall();
        boolean boolean47 = node36.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node48 = node21.clonePropsFrom(node36);
        com.google.javascript.rhino.Node node52 = com.google.javascript.rhino.Node.newString("function (): {1568223225}", 50, 0);
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber((double) 43);
        boolean boolean55 = node54.isExprResult();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        boolean boolean58 = node57.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile59 = node57.getStaticSourceFile();
        com.google.javascript.rhino.Node node60 = node57.getNext();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0);
        node62.putIntProp((-1), 35);
        boolean boolean66 = node62.isStringKey();
        boolean boolean67 = node62.isThrow();
        boolean boolean68 = node62.isEmpty();
        com.google.javascript.rhino.Node node69 = node57.copyInformationFrom(node62);
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        boolean boolean75 = node71.isReturn();
        com.google.javascript.rhino.Node node76 = node69.srcref(node71);
        boolean boolean77 = node76.isIf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean79 = jSDocInfo78.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression80 = jSDocInfo78.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility81 = null;
        jSDocInfo78.setVisibility(visibility81);
        boolean boolean83 = jSDocInfo78.isExport();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection84 = jSDocInfo78.getMarkers();
        java.util.Collection<java.lang.String> strCollection85 = jSDocInfo78.getAuthors();
        jSDocInfo78.setDeprecated(false);
        node76.setJSDocInfo(jSDocInfo78);
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node(10, node36, node52, node54, node76, (int) '#', (int) (short) 100);
        int int92 = node52.getSourceOffset();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(inputId41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(staticSourceFile59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(jSTypeExpression80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(markerCollection84);
        org.junit.Assert.assertNull(strCollection85);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02482");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable35 = functionType32.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType32);
        com.google.javascript.rhino.Node node38 = functionType32.getPropertyNode("[hi!, hi!, , , hi!]");
        boolean boolean39 = functionType32.isInstanceType();
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        com.google.common.collect.ImmutableList<java.lang.String> strList50 = functionType49.getTemplateTypeNames();
        boolean boolean51 = functionType49.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType52 = functionType49.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry55.createFunctionType(jSType59, true, jSTypeArray61);
        boolean boolean64 = functionType62.removeProperty("false");
        boolean boolean65 = functionType62.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType66 = functionType62.getImplicitPrototype();
        com.google.javascript.rhino.Node node67 = functionType62.getRootNode();
        boolean boolean68 = jSType52.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType62);
        boolean boolean69 = functionType62.matchesObjectContext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean72 = jSDocInfo71.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression73 = jSDocInfo71.getBaseType();
        java.lang.String str74 = jSDocInfo71.getLicense();
        java.lang.String str75 = jSDocInfo71.getMeaning();
        java.util.Set<java.lang.String> strSet76 = jSDocInfo71.getParameterNames();
        functionType62.setPropertyJSDocInfo("function (): {1614074355}", jSDocInfo71);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair78 = functionType32.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.jstype.JSType jSType79 = typePair78.typeB;
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
        org.junit.Assert.assertNotNull(objectTypeIterable35);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jSType52);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectType66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(jSTypeExpression73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(typePair78);
        org.junit.Assert.assertNotNull(jSType79);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02483");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) ' ', "JSDocInfo", (int) (byte) 100, 5);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable5 = node4.siblings();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeIterable5);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02484");
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
        boolean boolean25 = node23.isWith();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02485");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean52 = jSDocInfo51.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = jSDocInfo51.getBaseType();
        java.lang.String str54 = jSDocInfo51.getFileOverview();
        int int55 = jSDocInfo51.getExtendedInterfacesCount();
        boolean boolean56 = jSDocInfo51.isNoShadow();
        boolean boolean57 = jSDocInfo51.hasReturnType();
        parameterizedType48.setPropertyJSDocInfo("(function (): {1341612873})", jSDocInfo51);
        java.lang.String str59 = parameterizedType48.getReferenceName();
        com.google.javascript.rhino.jstype.UnionType unionType60 = parameterizedType48.toMaybeUnionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = unionType60.isParameterizedType();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(jSTypeExpression53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(unionType60);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02486");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = new com.google.javascript.rhino.JSTypeExpression(node1, "hi!");
        com.google.javascript.rhino.Node node5 = jSTypeExpression4.getRoot();
        boolean boolean6 = jSTypeExpression4.isVarArgs();
        com.google.javascript.rhino.Node node7 = jSTypeExpression4.getRoot();
        boolean boolean8 = jSTypeExpression4.isVarArgs();
        com.google.javascript.rhino.Node node9 = jSTypeExpression4.getRoot();
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
        com.google.javascript.rhino.Node node61 = functionType32.getPropertyNode("java.io.IOException");
        java.lang.String str62 = functionType32.toDebugHashCodeString();
        boolean boolean64 = functionType32.hasOwnProperty("");
        com.google.javascript.rhino.Node node65 = functionType32.getParametersNode();
        boolean boolean66 = functionType32.hasInstanceType();
        com.google.javascript.rhino.Node node68 = functionType32.getPropertyNode("Named type with empty name component");
        boolean boolean69 = functionType32.hasImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter70 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry72 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter70, true);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        jSTypeRegistry72.unregisterPropertyOnType("(Not declared as a type name)", jSType74);
        com.google.javascript.rhino.ErrorReporter errorReporter76 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry78 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter76, true);
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        jSTypeRegistry78.unregisterPropertyOnType("(Not declared as a type name)", jSType80);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray84 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry78.createFunctionType(jSType82, true, jSTypeArray84);
        boolean boolean87 = functionType85.removeProperty("false");
        boolean boolean88 = functionType85.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType89 = jSTypeRegistry72.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType85);
        boolean boolean91 = jSTypeRegistry72.hasNamespace("hi!");
        com.google.javascript.rhino.jstype.JSType jSType93 = jSTypeRegistry72.getType("NUMBER 0.0");
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable95 = jSTypeRegistry72.getEachReferenceTypeWithProperty("function (): {1614074355}");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType96 = jSTypeExpression4.evaluate((com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType32, jSTypeRegistry72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
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
        org.junit.Assert.assertNull(node61);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "function (): {626838128}" + "'", str62, "function (): {626838128}");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jSTypeArray84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(jSType93);
        org.junit.Assert.assertNotNull(objectTypeIterable95);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02487");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getParameterNames();
        boolean boolean9 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        node12.putIntProp((-1), 35);
        boolean boolean16 = node12.isStringKey();
        boolean boolean17 = node12.isThrow();
        int int18 = node12.getLineno();
        boolean boolean19 = node12.hasChildren();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        node22.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(32, node22);
        boolean boolean27 = node22.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node28 = node12.useSourceInfoIfMissingFromForTree(node22);
        boolean boolean29 = node28.isIn();
        int int30 = node28.getLength();
        boolean boolean31 = node28.isThis();
        jSDocInfo0.setAssociatedNode(node28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02488");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("{proxy:function (): {2016683788}}", 23, (int) '4');
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02489");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 30, 4095, 0);
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
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02490");
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
        java.lang.Object[] objArray25 = charSequenceList24.toArray();
        java.lang.Object[] objArray26 = charSequenceList24.toArray();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList27 = charSequenceList24.asList();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean29 = jSDocInfo28.hasThisType();
        boolean boolean30 = jSDocInfo28.shouldPreserveTry();
        boolean boolean31 = jSDocInfo28.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = jSDocInfo28.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean34 = jSDocInfo28.shouldPreserveTry();
        int int35 = jSDocInfo28.getImplementedInterfaceCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = charSequenceList27.remove((java.lang.Object) int35);
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
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSTypeExpression33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02491");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 100, node2, 49, (int) (byte) 1);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        node10.putIntProp((-1), 35);
        boolean boolean14 = node10.isStringKey();
        boolean boolean15 = node10.isThrow();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj21 = node19.getProp((int) (byte) 10);
        boolean boolean22 = node10.isEquivalentToTyped(node19);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(32, node25);
        boolean boolean30 = node29.isInstanceOf();
        com.google.javascript.rhino.Node node31 = node19.useSourceInfoFromForTree(node29);
        boolean boolean32 = node31.isStringKey();
        com.google.javascript.rhino.Node node33 = node8.useSourceInfoIfMissingFrom(node31);
        boolean boolean34 = node33.isExprResult();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02492");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        node1.setWasEmptyNode(true);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isArrayLit();
        boolean boolean11 = node1.isLabelName();
        boolean boolean12 = node1.isDelProp();
        boolean boolean13 = node1.isNumber();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry16.createFunctionType(jSType20, true, jSTypeArray22);
        com.google.javascript.rhino.jstype.JSType jSType24 = functionType23.restrictByNotNullOrUndefined();
        java.lang.String str25 = functionType23.toString();
        int int26 = functionType23.getMaxArguments();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable27 = functionType23.getCtorImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType.Property property29 = functionType23.getSlot("Unknown class name");
        java.util.Set<java.lang.String> strSet30 = functionType23.getOwnPropertyNames();
        boolean boolean31 = functionType23.isNumberObjectType();
        com.google.javascript.rhino.jstype.FunctionType functionType32 = functionType23.toMaybeFunctionType();
        node1.setJSType((com.google.javascript.rhino.jstype.JSType) functionType32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertNotNull(jSType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "function (): ?" + "'", str25, "function (): ?");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable27);
        org.junit.Assert.assertNull(property29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(functionType32);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02493");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(54, "{proxy:function (): {1828131673}}");
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02494");
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
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        node27.putIntProp((-1), 35);
        boolean boolean31 = node27.isStringKey();
        boolean boolean32 = node27.isThrow();
        com.google.javascript.rhino.Node node33 = node25.useSourceInfoFrom(node27);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        boolean boolean39 = node35.isReturn();
        com.google.javascript.rhino.InputId inputId40 = node35.getInputId();
        node35.setWasEmptyNode(true);
        int int43 = node33.getIndexOfChild(node35);
        boolean boolean44 = node35.isAssign();
        boolean boolean45 = node35.isLocalResultCall();
        boolean boolean46 = node35.isUnscopedQualifiedName();
        com.google.javascript.rhino.Node node47 = node20.clonePropsFrom(node35);
        int int48 = node47.getLineno();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(inputId40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02495");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isReturnTypeInferred();
        com.google.javascript.rhino.Node node12 = functionType9.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean14 = jSDocInfo13.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo13.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = null;
        jSDocInfo13.setVisibility(visibility16);
        boolean boolean18 = jSDocInfo13.isOverride();
        functionType9.setJSDocInfo(jSDocInfo13);
        boolean boolean21 = functionType9.hasProperty("{proxy:function (): {677068937}}");
        java.lang.String str22 = functionType9.toString();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "function (): ?" + "'", str22, "function (): ?");
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02496");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = null;
        jSDocInfo0.setVisibility(visibility3);
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02497");
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
        boolean boolean53 = parameterizedType48.hasReferenceName();
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        jSTypeRegistry57.unregisterPropertyOnType("(Not declared as a type name)", jSType59);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray63 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType64 = jSTypeRegistry57.createFunctionType(jSType61, true, jSTypeArray63);
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType64.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType66 = functionType64.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = functionType64.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.ObjectType objectType68 = functionType64.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType64.getTypeOfThis();
        boolean boolean70 = parameterizedType48.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType64);
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
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(jSTypeArray63);
        org.junit.Assert.assertNotNull(functionType64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNull(enumType66);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertNotNull(objectType68);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02498");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative26 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec27 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative26);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        boolean boolean30 = node29.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile31 = node29.getStaticSourceFile();
        com.google.javascript.rhino.Node node32 = node29.getNext();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        node34.putIntProp((-1), 35);
        boolean boolean38 = node34.isStringKey();
        boolean boolean39 = node34.isThrow();
        boolean boolean40 = node34.isEmpty();
        com.google.javascript.rhino.Node node41 = node29.copyInformationFrom(node34);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isStringKey();
        boolean boolean50 = node45.isThrow();
        com.google.javascript.rhino.Node node51 = node43.useSourceInfoFrom(node45);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(0);
        boolean boolean54 = node53.isCall();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        boolean boolean61 = node57.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList62 = com.google.common.collect.ImmutableList.of((java.lang.Object) node29, (java.lang.Object) node45, (java.lang.Object) node53, (java.lang.Object) 53, (java.lang.Object) node57);
        com.google.javascript.rhino.Node node63 = assertionFunctionSpec27.getAssertedParam(node57);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(0);
        boolean boolean66 = node65.isCall();
        boolean boolean67 = node65.isThrow();
        boolean boolean68 = node65.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69);
        com.google.javascript.rhino.jstype.JSType jSType71 = assertionFunctionSpec27.getAssertedType(node65, jSTypeRegistry70);
        node11.addChildToFront(node65);
        node11.setWasEmptyNode(false);
        // The following exception was thrown during execution in test generation
        try {
            double double75 = node11.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(staticSourceFile31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objList62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jSType71);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02499");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.setMutatesGlobalState();
        boolean boolean3 = sideEffectFlags1.areAllFlagsSet();
        boolean boolean4 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setThrows();
        sideEffectFlags1.setMutatesThis();
        sideEffectFlags1.setMutatesGlobalState();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02500");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isHook();
        boolean boolean6 = node1.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node7 = node1.getLastSibling();
        boolean boolean9 = node7.getBooleanProp((-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02501");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02502");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = node1.useSourceInfoFrom(node3);
        boolean boolean10 = node9.isIn();
        boolean boolean11 = node9.isVoid();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        boolean boolean14 = node13.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node13);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node17.isReturn();
        com.google.javascript.rhino.InputId inputId22 = node17.getInputId();
        node17.setWasEmptyNode(true);
        boolean boolean25 = node17.isLabel();
        boolean boolean26 = node17.isTry();
        com.google.javascript.rhino.Node node27 = node13.srcref(node17);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isStringKey();
        boolean boolean34 = node29.isThrow();
        int int35 = node29.getLineno();
        boolean boolean36 = node29.hasChildren();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(32, node39);
        boolean boolean44 = node39.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node45 = node29.useSourceInfoIfMissingFromForTree(node39);
        boolean boolean46 = node17.hasChild(node29);
        com.google.javascript.rhino.Node node47 = node9.copyInformationFrom(node17);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression49 = new com.google.javascript.rhino.JSTypeExpression(node47, "function (): {1393951772}");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression50 = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(jSTypeExpression49);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(staticSourceFile15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(inputId22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(jSTypeExpression50);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02503");
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable27 = functionType21.getParameters();
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        com.google.javascript.rhino.jstype.JSType jSType42 = functionType41.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType43 = functionType41.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType44 = functionType41.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType45 = jSTypeRegistry31.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        com.google.common.collect.ImmutableList<java.lang.String> strList56 = functionType55.getTemplateTypeNames();
        boolean boolean57 = functionType55.isConstructor();
        boolean boolean58 = functionType55.hasDisplayName();
        com.google.javascript.rhino.jstype.ObjectType objectType59 = functionType55.getTypeOfThis();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        jSTypeRegistry63.unregisterPropertyOnType("(Not declared as a type name)", jSType65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry63.createFunctionType(jSType67, true, jSTypeArray69);
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry31.createConstructorType((com.google.javascript.rhino.jstype.JSType) objectType59, true, jSTypeArray69);
        boolean boolean72 = functionType71.isUnionType();
        com.google.javascript.rhino.Node node76 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean77 = node76.isEmpty();
        boolean boolean78 = node76.isDebugger();
        boolean boolean79 = node76.isCall();
        boolean boolean80 = functionType21.defineSynthesizedProperty("function (): {1617435542}", (com.google.javascript.rhino.jstype.JSType) functionType71, node76);
        boolean boolean81 = functionType21.hasCachedValues();
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
        org.junit.Assert.assertNotNull(nodeIterable27);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertNotNull(jSType42);
        org.junit.Assert.assertNull(enumType43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectType59);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02504");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        jSTypeRegistry2.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        jSTypeRegistry6.unregisterPropertyOnType("(Not declared as a type name)", jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry6.createFunctionType(jSType10, true, jSTypeArray12);
        boolean boolean14 = functionType13.isReturnTypeInferred();
        boolean boolean15 = functionType13.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType13.getBindReturnType((int) (short) 1);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable18 = functionType13.getImplementedInterfaces();
        boolean boolean19 = functionType13.isUnionType();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType20 = functionType13.toMaybeEnumElementType();
        com.google.javascript.rhino.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter22, true);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        jSTypeRegistry24.unregisterPropertyOnType("(Not declared as a type name)", jSType26);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray30 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType31 = jSTypeRegistry24.createFunctionType(jSType28, true, jSTypeArray30);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry2.createConstructorType((com.google.javascript.rhino.jstype.JSType) enumElementType20, true, jSTypeArray30);
        com.google.common.collect.ImmutableList<java.lang.String> strList33 = functionType32.getTemplateTypeNames();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable34 = functionType32.getOwnImplementedInterfaces();
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(functionType17);
        org.junit.Assert.assertNotNull(objectTypeIterable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(enumElementType20);
        org.junit.Assert.assertNotNull(jSTypeArray30);
        org.junit.Assert.assertNotNull(functionType31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(objectTypeIterable34);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02505");
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
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        com.google.javascript.rhino.jstype.JSType jSType23 = functionType22.restrictByNotNullOrUndefined();
        boolean boolean24 = functionType22.isUnionType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = functionType9.testForEquality((com.google.javascript.rhino.jstype.JSType) functionType22);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean28 = jSDocInfo27.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = jSDocInfo27.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility30 = null;
        jSDocInfo27.setVisibility(visibility30);
        boolean boolean32 = jSDocInfo27.isIdGenerator();
        boolean boolean33 = jSDocInfo27.isNoTypeCheck();
        boolean boolean34 = jSDocInfo27.isNoTypeCheck();
        functionType9.setPropertyJSDocInfo("function (): {2140273663}", jSDocInfo27);
        boolean boolean36 = jSDocInfo27.isExport();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertNotNull(jSType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jSTypeExpression29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02506");
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
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        com.google.common.collect.ImmutableList<java.lang.String> strList62 = functionType61.getTemplateTypeNames();
        boolean boolean63 = functionType61.isReturnTypeInferred();
        com.google.javascript.rhino.Node node64 = functionType61.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean66 = jSDocInfo65.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = jSDocInfo65.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility68 = null;
        jSDocInfo65.setVisibility(visibility68);
        boolean boolean70 = jSDocInfo65.isOverride();
        functionType61.setJSDocInfo(jSDocInfo65);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility72 = jSDocInfo65.getVisibility();
        parameterizedType48.setPropertyJSDocInfo("function (): {1754035944}", jSDocInfo65);
        com.google.javascript.rhino.jstype.TemplateType templateType74 = parameterizedType48.toMaybeTemplateType();
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
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(jSTypeExpression67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(visibility72);
        org.junit.Assert.assertNull(templateType74);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02507");
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
        boolean boolean52 = parameterizedType48.hasReferenceName();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02508");
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
        com.google.javascript.rhino.ErrorReporter errorReporter50 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry52 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter50, true);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        jSTypeRegistry52.unregisterPropertyOnType("(Not declared as a type name)", jSType54);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray58 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType59 = jSTypeRegistry52.createFunctionType(jSType56, true, jSTypeArray58);
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType59.restrictByNotNullOrUndefined();
        boolean boolean61 = functionType59.isFunctionType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair62 = functionType22.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType59);
        boolean boolean63 = functionType59.hasDisplayName();
        com.google.javascript.rhino.Node node64 = functionType59.getSource();
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
        org.junit.Assert.assertNotNull(jSTypeArray58);
        org.junit.Assert.assertNotNull(functionType59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(typePair62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02509");
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
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj39 = node37.getProp((int) (byte) 10);
        boolean boolean40 = node37.isGetProp();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative42 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec43 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative42);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        boolean boolean46 = node45.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile47 = node45.getStaticSourceFile();
        com.google.javascript.rhino.Node node48 = node45.getNext();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(0);
        node50.putIntProp((-1), 35);
        boolean boolean54 = node50.isStringKey();
        boolean boolean55 = node50.isThrow();
        boolean boolean56 = node50.isEmpty();
        com.google.javascript.rhino.Node node57 = node45.copyInformationFrom(node50);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        node61.putIntProp((-1), 35);
        boolean boolean65 = node61.isStringKey();
        boolean boolean66 = node61.isThrow();
        com.google.javascript.rhino.Node node67 = node59.useSourceInfoFrom(node61);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node(0);
        boolean boolean70 = node69.isCall();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        node73.putIntProp((-1), 35);
        boolean boolean77 = node73.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList78 = com.google.common.collect.ImmutableList.of((java.lang.Object) node45, (java.lang.Object) node61, (java.lang.Object) node69, (java.lang.Object) 53, (java.lang.Object) node73);
        com.google.javascript.rhino.Node node79 = assertionFunctionSpec43.getAssertedParam(node73);
        com.google.javascript.rhino.Node node80 = node37.copyInformationFromForTree(node73);
        com.google.javascript.rhino.Node node81 = node73.getLastSibling();
        node33.addChildrenToBack(node81);
        boolean boolean83 = node81.isExprResult();
        boolean boolean84 = node81.isLocalResultCall();
        boolean boolean85 = node81.isFromExterns();
        boolean boolean86 = node81.isEmpty();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile87 = node81.getStaticSourceFile();
        node81.putBooleanProp(51, true);
        com.google.javascript.rhino.Node node91 = node81.getLastChild();
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
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(staticSourceFile47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(objList78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(staticSourceFile87);
        org.junit.Assert.assertNull(node91);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02510");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        java.lang.Object obj6 = node1.getProp(29);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = node1.getJSDocInfo();
        node1.putBooleanProp(53, false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(jSDocInfo7);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02511");
        java.io.IOException iOException1 = new java.io.IOException("{proxy:function (): {1454030772}}");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02512");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection4 = jSDocInfo0.getMarkers();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(markerCollection4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02513");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isCall();
        com.google.javascript.rhino.Node node4 = node2.cloneTree();
        boolean boolean5 = node4.isAssignAdd();
        boolean boolean6 = node4.isFalse();
        boolean boolean7 = node4.hasMoreThanOneChild();
        boolean boolean8 = node4.isLabelName();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(46, node4, 15, (int) (short) 100);
        boolean boolean12 = node11.isGetElem();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.hasThisType();
        boolean boolean16 = jSDocInfo14.shouldPreserveTry();
        boolean boolean17 = jSDocInfo14.isDeprecated();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection18 = jSDocInfo14.getMarkers();
        com.google.common.collect.ImmutableList<java.lang.String> strList19 = jSDocInfo14.getTemplateTypeNames();
        node11.putProp((int) (byte) 100, (java.lang.Object) jSDocInfo14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(markerCollection18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02514");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean4 = node3.isEmpty();
        com.google.javascript.rhino.InputId inputId5 = com.google.javascript.jscomp.NodeUtil.getInputId(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(inputId5);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02515");
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
        boolean boolean51 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean54 = jSDocInfo53.hasThisType();
        boolean boolean55 = jSDocInfo53.shouldPreserveTry();
        boolean boolean56 = jSDocInfo53.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression58 = jSDocInfo53.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean59 = jSDocInfo53.shouldPreserveTry();
        boolean boolean60 = jSDocInfo53.isOverride();
        boolean boolean61 = jSDocInfo53.isNoSideEffects();
        boolean boolean63 = jSDocInfo53.hasParameterType("");
        java.lang.String str64 = jSDocInfo53.getOriginalCommentString();
        parameterizedType48.setPropertyJSDocInfo("function (): {436796145}", jSDocInfo53);
        boolean boolean66 = parameterizedType48.isNominalType();
        com.google.javascript.rhino.Node node67 = parameterizedType48.getRootNode();
        boolean boolean68 = parameterizedType48.isNativeObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jSTypeExpression58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02516");
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
        boolean boolean55 = functionType9.isNoType();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02517");
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
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        com.google.common.collect.ImmutableList<java.lang.String> strList62 = functionType61.getTemplateTypeNames();
        boolean boolean63 = functionType61.isReturnTypeInferred();
        com.google.javascript.rhino.Node node64 = functionType61.getRootNode();
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean66 = jSDocInfo65.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = jSDocInfo65.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility68 = null;
        jSDocInfo65.setVisibility(visibility68);
        boolean boolean70 = jSDocInfo65.isOverride();
        functionType61.setJSDocInfo(jSDocInfo65);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility72 = jSDocInfo65.getVisibility();
        parameterizedType48.setPropertyJSDocInfo("function (): {1754035944}", jSDocInfo65);
        com.google.javascript.rhino.jstype.EnumType enumType74 = parameterizedType48.toMaybeEnumType();
        com.google.javascript.rhino.jstype.UnionType unionType75 = parameterizedType48.toMaybeUnionType();
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
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(jSTypeExpression67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(visibility72);
        org.junit.Assert.assertNull(enumType74);
        org.junit.Assert.assertNull(unionType75);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02518");
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
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        boolean boolean46 = functionType44.removeProperty("false");
        boolean boolean47 = functionType44.isNativeObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        jSTypeRegistry50.unregisterPropertyOnType("(Not declared as a type name)", jSType52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry50.createFunctionType(jSType54, true, jSTypeArray56);
        boolean boolean58 = functionType57.hasReferenceName();
        boolean boolean59 = functionType44.canTestForEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType57);
        com.google.javascript.rhino.jstype.JSType jSType61 = functionType57.getPropertyType("true");
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        jSTypeRegistry64.unregisterPropertyOnType("(Not declared as a type name)", jSType66);
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        boolean boolean79 = functionType77.removeProperty("false");
        boolean boolean80 = functionType77.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType81 = jSTypeRegistry64.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.JSType jSType82 = functionType77.unboxesTo();
        com.google.javascript.rhino.jstype.JSType jSType84 = functionType77.getPropertyType("");
        boolean boolean85 = functionType77.hasInstanceType();
        com.google.javascript.rhino.jstype.FunctionType functionType86 = jSTypeRegistry16.createFunctionTypeWithNewReturnType(functionType57, (com.google.javascript.rhino.jstype.JSType) functionType77);
        java.util.List<java.lang.String> strList87 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSTypeRegistry16.setTemplateTypeNames(strList87);
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
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jSType61);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNull(jSType82);
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(functionType86);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02519");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable21 = jSTypeRegistry2.getTypesWithProperty("");
        jSTypeRegistry2.incrementGeneration();
        java.lang.Iterable<com.google.javascript.rhino.jstype.JSType> jSTypeIterable24 = jSTypeRegistry2.getTypesWithProperty("(function (): {367372378})");
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType jSType28 = jSTypeRegistry2.getType("{proxy:function (): {559156472}}");
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeIterable21);
        org.junit.Assert.assertNotNull(jSTypeIterable24);
        org.junit.Assert.assertNull(jSType28);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02520");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = node1.useSourceInfoFrom(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node9);
        boolean boolean11 = node9.isTrue();
        int int12 = node9.getType();
        boolean boolean13 = node9.isDebugger();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj19 = node17.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoFrom(node23);
        boolean boolean30 = node29.isIn();
        com.google.javascript.rhino.Node node31 = node17.clonePropsFrom(node29);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getSourceName(node17);
        com.google.javascript.rhino.Node node33 = node9.srcrefTree(node17);
        node17.setSourceEncodedPositionForTree(48);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02521");
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
        boolean boolean29 = jSDocInfo0.isOverride();
        boolean boolean30 = jSDocInfo0.isImplicitCast();
        boolean boolean31 = jSDocInfo0.isIdGenerator();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02522");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 2, 39, 46);
        com.google.javascript.rhino.Node node4 = node3.getLastSibling();
        int int5 = node4.getCharno();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        node8.putIntProp((-1), 35);
        boolean boolean12 = node8.isStringKey();
        boolean boolean13 = node8.isThrow();
        int int14 = node8.getLineno();
        boolean boolean15 = node8.hasChildren();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(0);
        node17.putIntProp((-1), 35);
        boolean boolean21 = node8.hasChild(node17);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        boolean boolean24 = node23.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile25 = node23.getStaticSourceFile();
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0, node17, node23, node29);
        boolean boolean31 = node17.isAssignAdd();
        boolean boolean32 = node17.isExprResult();
        com.google.javascript.rhino.Node node33 = node4.useSourceInfoFromForTree(node17);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        boolean boolean36 = node35.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isReturn();
        com.google.javascript.rhino.InputId inputId44 = node39.getInputId();
        node39.setWasEmptyNode(true);
        boolean boolean47 = node39.isLabel();
        boolean boolean48 = node39.isTry();
        com.google.javascript.rhino.Node node49 = node35.srcref(node39);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        boolean boolean52 = node51.isInstanceOf();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(0);
        node54.putIntProp((-1), 35);
        boolean boolean58 = node54.isStringKey();
        boolean boolean59 = node54.isThrow();
        boolean boolean60 = node54.isEmpty();
        com.google.javascript.rhino.Node node61 = node51.useSourceInfoFrom(node54);
        boolean boolean62 = node61.isVar();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(0);
        boolean boolean65 = node64.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile66 = node64.getStaticSourceFile();
        node64.setLineno((int) '4');
        com.google.javascript.rhino.Node node69 = node61.useSourceInfoIfMissingFrom(node64);
        com.google.javascript.rhino.Node node73 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj75 = node73.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node76 = node64.copyInformationFrom(node73);
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(0);
        boolean boolean79 = node78.isInstanceOf();
        com.google.javascript.rhino.Node node81 = new com.google.javascript.rhino.Node(0);
        node81.putIntProp((-1), 35);
        boolean boolean85 = node81.isStringKey();
        boolean boolean86 = node81.isThrow();
        boolean boolean87 = node81.isEmpty();
        com.google.javascript.rhino.Node node88 = node78.useSourceInfoFrom(node81);
        com.google.javascript.rhino.Node node89 = node88.removeFirstChild();
        node49.addChildAfter(node76, node89);
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(4);
        // The following exception was thrown during execution in test generation
        try {
            node17.replaceChild(node49, node92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 46 + "'", int5 == 46);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(staticSourceFile25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(staticSourceFile37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(inputId44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(staticSourceFile66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNull(node89);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02523");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.jstype.JSType jSType4 = node3.getJSType();
        boolean boolean5 = node3.isHook();
        int int6 = node3.getLength();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable7 = node3.getAncestors();
        boolean boolean8 = node3.isIf();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(ancestorIterable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02524");
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
        java.util.Set set54 = parameterizedType48.getOwnPropertyNames();
        boolean boolean55 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType56 = parameterizedType48.toMaybeEnumElementType();
        java.lang.String str57 = parameterizedType48.toDebugHashCodeString();
        boolean boolean59 = parameterizedType48.isPropertyTypeInferred("function (): {1290814879}");
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
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(enumElementType56);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "{proxy:function (): {1480247162}}" + "'", str57, "{proxy:function (): {1480247162}}");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02525");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable32 = functionType21.getCtorExtendedInterfaces();
        boolean boolean34 = functionType21.removeProperty("function (): {1059200999}");
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
        org.junit.Assert.assertNotNull(objectTypeIterable32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02526");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node11.isVar();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = node14.getStaticSourceFile();
        node14.setLineno((int) '4');
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoIfMissingFrom(node14);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoFrom(node23);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(0);
        boolean boolean33 = node32.isCall();
        com.google.javascript.rhino.Node node34 = node32.cloneTree();
        com.google.javascript.rhino.Node node37 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(35, node34, node37);
        com.google.javascript.rhino.Node node39 = node21.copyInformationFrom(node34);
        com.google.javascript.rhino.Node node40 = node19.useSourceInfoIfMissingFrom(node39);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        boolean boolean43 = node42.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile44 = node42.getStaticSourceFile();
        com.google.javascript.rhino.Node node45 = node42.getNext();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        boolean boolean51 = node47.isStringKey();
        boolean boolean52 = node47.isThrow();
        boolean boolean53 = node47.isEmpty();
        com.google.javascript.rhino.Node node54 = node42.copyInformationFrom(node47);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        boolean boolean60 = node56.isReturn();
        com.google.javascript.rhino.Node node61 = node54.srcref(node56);
        boolean boolean62 = node61.isIf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean64 = jSDocInfo63.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression65 = jSDocInfo63.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility66 = null;
        jSDocInfo63.setVisibility(visibility66);
        boolean boolean68 = jSDocInfo63.isExport();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection69 = jSDocInfo63.getMarkers();
        java.util.Collection<java.lang.String> strCollection70 = jSDocInfo63.getAuthors();
        jSDocInfo63.setDeprecated(false);
        node61.setJSDocInfo(jSDocInfo63);
        boolean boolean74 = jSDocInfo63.isIdGenerator();
        boolean boolean75 = jSDocInfo63.isHidden();
        boolean boolean76 = jSDocInfo63.containsDeclaration();
        node40.setJSDocInfo(jSDocInfo63);
        boolean boolean78 = jSDocInfo63.isConstructor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(staticSourceFile16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(staticSourceFile44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(jSTypeExpression65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(markerCollection69);
        org.junit.Assert.assertNull(strCollection70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02527");
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
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags60 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags60.clearAllFlags();
        boolean boolean62 = sideEffectFlags60.areAllFlagsSet();
        sideEffectFlags60.setMutatesArguments();
        // The following exception was thrown during execution in test generation
        try {
            node40.setSideEffectFlags(sideEffectFlags60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
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
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02528");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean10 = functionType9.hasReferenceName();
        boolean boolean11 = functionType9.isConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter12, true);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        boolean boolean22 = functionType21.isReturnTypeInferred();
        boolean boolean23 = functionType21.hasReferenceName();
        boolean boolean24 = functionType9.isSubtype((com.google.javascript.rhino.jstype.JSType) functionType21);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter25, true);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        jSTypeRegistry27.unregisterPropertyOnType("(Not declared as a type name)", jSType29);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray33 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType34 = jSTypeRegistry27.createFunctionType(jSType31, true, jSTypeArray33);
        com.google.common.collect.ImmutableList<java.lang.String> strList35 = functionType34.getTemplateTypeNames();
        boolean boolean36 = functionType34.isConstructor();
        com.google.javascript.rhino.jstype.JSType jSType37 = functionType34.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter38, true);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        jSTypeRegistry40.unregisterPropertyOnType("(Not declared as a type name)", jSType42);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray46 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType47 = jSTypeRegistry40.createFunctionType(jSType44, true, jSTypeArray46);
        boolean boolean49 = functionType47.removeProperty("false");
        boolean boolean50 = functionType47.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType51 = functionType47.getImplicitPrototype();
        com.google.javascript.rhino.Node node52 = functionType47.getRootNode();
        boolean boolean53 = jSType37.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType47);
        boolean boolean54 = functionType9.canTestForShallowEqualityWith((com.google.javascript.rhino.jstype.JSType) functionType47);
        boolean boolean55 = functionType9.matchesStringContext();
        java.lang.String str56 = functionType9.toAnnotationString();
        boolean boolean57 = functionType9.hasAnyTemplateInternal();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSTypeArray33);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jSType37);
        org.junit.Assert.assertNotNull(jSTypeArray46);
        org.junit.Assert.assertNotNull(functionType47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectType51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "function (): ?" + "'", str56, "function (): ?");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02529");
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
        boolean boolean51 = parameterizedType48.canBeCalled();
        com.google.javascript.rhino.jstype.FunctionType functionType52 = parameterizedType48.getConstructor();
        com.google.javascript.rhino.jstype.TemplateType templateType53 = parameterizedType48.toMaybeTemplateType();
        boolean boolean54 = parameterizedType48.isNumberObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(functionType52);
        org.junit.Assert.assertNull(templateType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02530");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        int int3 = node1.getLength();
        int int4 = node1.getSourcePosition();
        node1.setSourceFileForTesting("{proxy:function (): {1562616066}}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02531");
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
        jSTypeRegistry16.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        boolean boolean42 = node41.isInstanceOf();
        boolean boolean43 = node41.isNull();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((int) 'a', node41);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((int) (byte) -1, node44, (-1), 16);
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        jSTypeRegistry50.unregisterPropertyOnType("(Not declared as a type name)", jSType52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry50.createFunctionType(jSType54, true, jSTypeArray56);
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = functionType57.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ObjectType.Property property60 = functionType57.getSlot("function (): ?");
        boolean boolean61 = functionType57.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType62 = functionType57.getImplicitPrototype();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry65 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63, true);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        jSTypeRegistry65.unregisterPropertyOnType("(Not declared as a type name)", jSType67);
        com.google.javascript.rhino.jstype.JSType jSType69 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray71 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType72 = jSTypeRegistry65.createFunctionType(jSType69, true, jSTypeArray71);
        com.google.common.collect.ImmutableList<java.lang.String> strList73 = functionType72.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot75 = functionType72.getSlot("NUMBER 0.0 100\n");
        boolean boolean76 = functionType72.isAllType();
        java.lang.Iterable iterable77 = functionType72.getCtorImplementedInterfaces();
        boolean boolean78 = functionType72.isNumberObjectType();
        boolean boolean79 = functionType72.matchesNumberContext();
        boolean boolean80 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType57, (com.google.javascript.rhino.jstype.JSType) functionType72);
        com.google.javascript.rhino.jstype.EnumType enumType81 = jSTypeRegistry16.createEnumType("{proxy:function (): {63549204}}", node47, (com.google.javascript.rhino.jstype.JSType) functionType57);
        com.google.javascript.rhino.Node node82 = enumType81.getSource();
        com.google.javascript.rhino.jstype.FunctionType functionType83 = enumType81.getConstructor();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectType62);
        org.junit.Assert.assertNotNull(jSTypeArray71);
        org.junit.Assert.assertNotNull(functionType72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNull(staticSlot75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterable77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(enumType81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNull(functionType83);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02532");
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
        java.lang.String str12 = jSDocInfo0.getBlockDescription();
        java.lang.String str13 = jSDocInfo0.getBlockDescription();
        boolean boolean14 = jSDocInfo0.hasEnumParameterType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility15 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(visibility15);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02533");
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
        com.google.javascript.rhino.Node node17 = functionType9.getRootNode();
        boolean boolean18 = functionType9.isEnumType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02534");
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
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType21.autoboxesTo();
        java.lang.String str23 = functionType21.getNormalizedReferenceName();
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
        boolean boolean38 = functionType21.hasEqualCallType(functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        jSTypeRegistry41.unregisterPropertyOnType("(Not declared as a type name)", jSType43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry41.createFunctionType(jSType45, true, jSTypeArray47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType21, jSTypeArray47);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = functionType49.getJSDocInfo();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = functionType49.getParameters();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(staticSlot36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertNull(jSDocInfo50);
        org.junit.Assert.assertNotNull(nodeIterable51);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02535");
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
        boolean boolean38 = node30.isContinue();
        boolean boolean39 = node30.isWhile();
        boolean boolean40 = node30.isInstanceOf();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression42 = new com.google.javascript.rhino.JSTypeExpression(node30, "function (): {275816730}");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02536");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("{proxy:function (): {601366929}}");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02537");
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
        java.lang.Iterable iterable14 = functionType9.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = functionType9.toMaybeFunctionType();
        boolean boolean17 = functionType15.removeProperty("function (): {646790426}");
        boolean boolean18 = functionType15.isBooleanObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable13);
        org.junit.Assert.assertNotNull(iterable14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02538");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        boolean boolean6 = node1.isArrayLit();
        boolean boolean7 = node1.isQualifiedName();
        node1.addSuppression("{proxy:function (): {1002171987}}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02539");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean20 = jSDocInfo19.hasThisType();
        boolean boolean21 = jSDocInfo19.shouldPreserveTry();
        boolean boolean22 = jSDocInfo19.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = jSDocInfo19.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean25 = jSDocInfo19.shouldPreserveTry();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        boolean boolean28 = node27.isCall();
        com.google.javascript.rhino.Node node29 = node27.cloneTree();
        boolean boolean30 = node27.isNull();
        jSDocInfo19.setAssociatedNode(node27);
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        boolean boolean43 = functionType41.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter45, true);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        jSTypeRegistry47.unregisterPropertyOnType("(Not declared as a type name)", jSType49);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray53 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType54 = jSTypeRegistry47.createFunctionType(jSType51, true, jSTypeArray53);
        boolean boolean56 = functionType54.removeProperty("false");
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        node58.putIntProp((-1), 35);
        boolean boolean62 = node58.isStringKey();
        boolean boolean63 = node58.isThrow();
        com.google.javascript.rhino.Node node67 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj69 = node67.getProp((int) (byte) 10);
        boolean boolean70 = node58.isEquivalentToTyped(node67);
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node(0);
        node73.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(32, node73);
        boolean boolean78 = node77.isInstanceOf();
        com.google.javascript.rhino.Node node79 = node67.useSourceInfoFromForTree(node77);
        boolean boolean80 = node77.isDo();
        boolean boolean81 = functionType41.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType54, node77);
        boolean boolean82 = functionType54.isUnknownType();
        java.util.Set<java.lang.String> strSet83 = functionType54.getPropertyNames();
        node27.setJSType((com.google.javascript.rhino.jstype.JSType) functionType54);
        jSTypeRegistry2.unregisterPropertyOnType("", (com.google.javascript.rhino.jstype.JSType) functionType54);
        int int86 = functionType54.getPropertiesCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot88 = functionType54.getSlot("function (): {405212503}");
        boolean boolean89 = functionType54.hasReferenceName();
        java.lang.String str90 = functionType54.getDisplayName();
        boolean boolean92 = functionType54.isPropertyTypeDeclared("InputId: hi!");
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeArray53);
        org.junit.Assert.assertNotNull(functionType54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strSet83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02540");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getOwnSlot("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType9.getPropertyType("");
        com.google.javascript.rhino.Node node15 = functionType9.getParametersNode();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertNotNull(jSType14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02541");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = ternaryValue0.not();
        java.lang.String str2 = ternaryValue0.toString();
        boolean boolean4 = ternaryValue0.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue6.not();
        java.lang.String str8 = ternaryValue6.toString();
        boolean boolean10 = ternaryValue6.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue11.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue13.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue13.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue16.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = ternaryValue16.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList20 = com.google.common.collect.ImmutableList.of(ternaryValue5, ternaryValue6, ternaryValue12, ternaryValue13, ternaryValue18, ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue0.xor(ternaryValue18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.String str24 = ternaryValue23.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue18.and(ternaryValue23);
        boolean boolean27 = ternaryValue25.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue29.not();
        java.lang.String str31 = ternaryValue29.toString();
        boolean boolean33 = ternaryValue29.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue34.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue36.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue36.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue39.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue39.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.TernaryValue> ternaryValueList43 = com.google.common.collect.ImmutableList.of(ternaryValue28, ternaryValue29, ternaryValue35, ternaryValue36, ternaryValue41, ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue44.not();
        boolean boolean47 = ternaryValue44.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = ternaryValue44.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = ternaryValue41.or(ternaryValue48);
        boolean boolean51 = ternaryValue48.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue48.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue25.xor(ternaryValue48);
        boolean boolean55 = ternaryValue53.toBoolean(true);
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false" + "'", str2, "false");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false" + "'", str8, "false");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValueList20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "false" + "'", str24, "false");
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "false" + "'", str31, "false");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValueList43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02542");
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
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter20, true);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        jSTypeRegistry22.unregisterPropertyOnType("(Not declared as a type name)", jSType24);
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray28 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType29 = jSTypeRegistry22.createFunctionType(jSType26, true, jSTypeArray28);
        boolean boolean31 = functionType29.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry35 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter33, true);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        jSTypeRegistry35.unregisterPropertyOnType("(Not declared as a type name)", jSType37);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray41 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType42 = jSTypeRegistry35.createFunctionType(jSType39, true, jSTypeArray41);
        boolean boolean44 = functionType42.removeProperty("false");
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0);
        node46.putIntProp((-1), 35);
        boolean boolean50 = node46.isStringKey();
        boolean boolean51 = node46.isThrow();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj57 = node55.getProp((int) (byte) 10);
        boolean boolean58 = node46.isEquivalentToTyped(node55);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        node61.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(32, node61);
        boolean boolean66 = node65.isInstanceOf();
        com.google.javascript.rhino.Node node67 = node55.useSourceInfoFromForTree(node65);
        boolean boolean68 = node65.isDo();
        boolean boolean69 = functionType29.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType42, node65);
        java.lang.String str70 = functionType42.getReferenceName();
        boolean boolean71 = functionType42.isUnionType();
        java.util.Collection<com.google.javascript.rhino.jstype.FunctionType> functionTypeCollection72 = jSTypeRegistry2.getDirectImplementors((com.google.javascript.rhino.jstype.ObjectType) functionType42);
        jSTypeRegistry2.resetForTypeCheck();
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative74 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry2.getNativeType(jSTypeNative74);
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
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeArray41);
        org.junit.Assert.assertNotNull(functionType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(functionTypeCollection72);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02543");
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
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType21.autoboxesTo();
        java.lang.String str23 = functionType21.getNormalizedReferenceName();
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
        boolean boolean38 = functionType21.hasEqualCallType(functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        jSTypeRegistry41.unregisterPropertyOnType("(Not declared as a type name)", jSType43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry41.createFunctionType(jSType45, true, jSTypeArray47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType21, jSTypeArray47);
        boolean boolean51 = functionType21.hasOwnProperty("Unknown class name");
        java.util.Set<java.lang.String> strSet52 = functionType21.getOwnPropertyNames();
        int int53 = functionType21.getMaxArguments();
        com.google.javascript.rhino.jstype.TemplateType templateType54 = functionType21.toMaybeTemplateType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.TemplateType templateType55 = templateType54.toMaybeTemplateType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(staticSlot36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(templateType54);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02544");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        boolean boolean4 = node3.isTypeOf();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        boolean boolean7 = node6.isInstanceOf();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node6.useSourceInfoFrom(node9);
        boolean boolean17 = node9.isNE();
        boolean boolean18 = node9.isCall();
        boolean boolean19 = node9.isNew();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        node22.putIntProp((-1), 35);
        boolean boolean26 = node22.isStringKey();
        boolean boolean27 = node22.isThrow();
        int int28 = node22.getLineno();
        boolean boolean29 = node22.hasChildren();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        node31.putIntProp((-1), 35);
        boolean boolean35 = node22.hasChild(node31);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        boolean boolean38 = node37.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = node37.getStaticSourceFile();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0, node31, node37, node43);
        com.google.javascript.rhino.Node node45 = node9.useSourceInfoFromForTree(node31);
        com.google.javascript.rhino.Node node46 = node3.copyInformationFromForTree(node45);
        boolean boolean47 = node45.isDelProp();
        boolean boolean48 = node45.isNot();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(staticSourceFile39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02545");
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
        boolean boolean54 = functionType22.isNominalConstructor();
        com.google.javascript.rhino.ErrorReporter errorReporter55 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry57 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter55, true);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        jSTypeRegistry57.unregisterPropertyOnType("(Not declared as a type name)", jSType59);
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        jSTypeRegistry63.unregisterPropertyOnType("(Not declared as a type name)", jSType65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry63.createFunctionType(jSType67, true, jSTypeArray69);
        boolean boolean72 = functionType70.removeProperty("false");
        boolean boolean73 = functionType70.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType74 = jSTypeRegistry57.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType70);
        boolean boolean76 = functionType70.hasProperty("(Not declared as a type name)");
        com.google.javascript.rhino.Node node77 = functionType70.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter78 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry80 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter78, true);
        com.google.javascript.rhino.jstype.JSType jSType82 = null;
        jSTypeRegistry80.unregisterPropertyOnType("(Not declared as a type name)", jSType82);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray86 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType87 = jSTypeRegistry80.createFunctionType(jSType84, true, jSTypeArray86);
        boolean boolean88 = functionType87.isReturnTypeInferred();
        boolean boolean89 = functionType70.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType87);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable90 = functionType87.getImplementedInterfaces();
        com.google.javascript.rhino.jstype.ObjectType objectType91 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) functionType87);
        com.google.javascript.rhino.Node node93 = functionType87.getPropertyNode("[hi!, hi!, , , hi!]");
        boolean boolean94 = functionType22.hasEqualCallType(functionType87);
        boolean boolean95 = functionType87.isNullable();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jSType74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(jSTypeArray86);
        org.junit.Assert.assertNotNull(functionType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable90);
        org.junit.Assert.assertNotNull(objectType91);
        org.junit.Assert.assertNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02546");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        jSDocInfo0.setLicense("{proxy:function (): {63549204}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(jSTypeExpression4);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02547");
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
        boolean boolean66 = node8.isGetProp();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node8);
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
        org.junit.Assert.assertNull(staticSourceFile67);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02548");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        boolean boolean10 = node4.isEmpty();
        com.google.javascript.rhino.Node node11 = node1.useSourceInfoFrom(node4);
        boolean boolean12 = node4.isNE();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        node15.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(32, node15);
        boolean boolean20 = node19.isInstanceOf();
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            node4.replaceChild(node19, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02549");
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
        boolean boolean55 = parameterizedType48.hasProperty("function (): {1120480319}");
        boolean boolean56 = parameterizedType48.isAllType();
        com.google.javascript.rhino.jstype.FunctionType functionType57 = parameterizedType48.getOwnerFunction();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(functionType57);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02550");
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
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList39 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray38);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList42 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42, charSequenceArray41);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator44 = charSequenceList42.spliterator();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(32, node47);
        boolean boolean52 = node51.isGetterDef();
        boolean boolean53 = charSequenceList42.equals((java.lang.Object) boolean52);
        boolean boolean55 = charSequenceList42.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean56 = charSequenceList39.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList42);
        com.google.javascript.rhino.ErrorReporter errorReporter57 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter57, true);
        com.google.javascript.rhino.jstype.JSType jSType61 = null;
        jSTypeRegistry59.unregisterPropertyOnType("(Not declared as a type name)", jSType61);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray65 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType66 = jSTypeRegistry59.createFunctionType(jSType63, true, jSTypeArray65);
        com.google.javascript.rhino.jstype.JSType jSType67 = functionType66.autoboxesTo();
        boolean boolean68 = functionType66.hasInstanceType();
        boolean boolean69 = charSequenceList39.equals((java.lang.Object) boolean68);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = charSequenceList13.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList39);
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
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertNotNull(charSequenceList39);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSTypeArray65);
        org.junit.Assert.assertNotNull(functionType66);
        org.junit.Assert.assertNull(jSType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02551");
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
        boolean boolean15 = functionType9.isVoidType();
        boolean boolean16 = functionType9.matchesNumberContext();
        functionType9.clearCachedValues();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02552");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getAuthors();
        java.lang.String str9 = jSDocInfo0.getReturnDescription();
        boolean boolean10 = jSDocInfo0.isExport();
        boolean boolean11 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02553");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = node1.useSourceInfoFrom(node3);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isCall();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(35, node14, node17);
        com.google.javascript.rhino.Node node19 = node1.copyInformationFrom(node14);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        boolean boolean22 = node21.isInstanceOf();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node(0);
        node24.putIntProp((-1), 35);
        boolean boolean28 = node24.isStringKey();
        boolean boolean29 = node24.isThrow();
        boolean boolean30 = node24.isEmpty();
        com.google.javascript.rhino.Node node31 = node21.useSourceInfoFrom(node24);
        boolean boolean32 = node31.isVar();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        boolean boolean35 = node34.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node34.getStaticSourceFile();
        node34.setLineno((int) '4');
        com.google.javascript.rhino.Node node39 = node31.useSourceInfoIfMissingFrom(node34);
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj45 = node43.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node46 = node34.copyInformationFrom(node43);
        com.google.javascript.rhino.Node node47 = node19.useSourceInfoIfMissingFrom(node46);
        java.lang.String str48 = node19.getQualifiedName();
        boolean boolean49 = node19.isString();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        node52.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(32, node52);
        boolean boolean57 = node52.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node58 = node19.useSourceInfoFrom(node52);
        boolean boolean59 = node19.isDo();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(staticSourceFile36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02554");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node4);
        namePosition0.setItem(node2);
        boolean boolean12 = node2.isTry();
        node2.putBooleanProp(0, true);
        boolean boolean16 = node2.isStringKey();
        node2.setWasEmptyNode(false);
        com.google.javascript.rhino.Node node19 = node2.cloneTree();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        boolean boolean22 = node21.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = node21.getStaticSourceFile();
        com.google.javascript.rhino.Node node24 = node21.getNext();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        boolean boolean30 = node26.isStringKey();
        boolean boolean31 = node26.isThrow();
        boolean boolean32 = node26.isEmpty();
        com.google.javascript.rhino.Node node33 = node21.copyInformationFrom(node26);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        com.google.javascript.rhino.Node node43 = node35.useSourceInfoFrom(node37);
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        boolean boolean46 = node45.isCall();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        node49.putIntProp((-1), 35);
        boolean boolean53 = node49.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList54 = com.google.common.collect.ImmutableList.of((java.lang.Object) node21, (java.lang.Object) node37, (java.lang.Object) node45, (java.lang.Object) 53, (java.lang.Object) node49);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        boolean boolean57 = node56.isInstanceOf();
        node49.addChildrenToFront(node56);
        java.lang.String str59 = com.google.javascript.jscomp.NodeUtil.getSourceName(node56);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSymmetricOperation(node56);
        boolean boolean61 = node56.isInstanceOf();
        // The following exception was thrown during execution in test generation
        try {
            node2.addChildToFront(node56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(staticSourceFile23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objList54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02555");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(37, "JSDocInfo");
        node2.setSourceEncodedPositionForTree(54);
        boolean boolean5 = node2.isSetterDef();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02556");
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
        boolean boolean21 = node20.isOr();
        boolean boolean22 = node20.isSetterDef();
        boolean boolean23 = node20.isSwitch();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        boolean boolean26 = node25.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node25.getStaticSourceFile();
        com.google.javascript.rhino.Node node28 = node25.getNext();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        node30.putIntProp((-1), 35);
        boolean boolean34 = node30.isStringKey();
        boolean boolean35 = node30.isThrow();
        boolean boolean36 = node30.isEmpty();
        com.google.javascript.rhino.Node node37 = node25.copyInformationFrom(node30);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isReturn();
        com.google.javascript.rhino.Node node44 = node37.srcref(node39);
        boolean boolean45 = node44.isOr();
        boolean boolean46 = node44.isCatch();
        node44.setSourceFileForTesting("function (): {405212503}");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile49 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node44);
        int int51 = staticSourceFile49.getLineOfOffset(1);
        node20.setStaticSourceFile(staticSourceFile49);
        int int54 = staticSourceFile49.getLineOfOffset(32780);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(staticSourceFile49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02557");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        boolean boolean3 = node1.isThrow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasThisType();
        boolean boolean6 = jSDocInfo4.shouldPreserveTry();
        boolean boolean7 = jSDocInfo4.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo4.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean10 = jSDocInfo4.shouldPreserveTry();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node(0);
        boolean boolean13 = node12.isCall();
        com.google.javascript.rhino.Node node14 = node12.cloneTree();
        boolean boolean15 = node12.isNull();
        jSDocInfo4.setAssociatedNode(node12);
        node1.addChildrenToFront(node12);
        boolean boolean18 = node1.isDelProp();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02558");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((-1), "function (): {1293550066}", (int) (short) 10, 12);
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType5 = com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS;
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        com.google.javascript.rhino.Node node15 = node7.useSourceInfoFrom(node9);
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
        com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship51 = new com.google.javascript.jscomp.CodingConvention.SubclassRelationship(subclassType5, node15, node45);
        node15.addSuppression("function (): {367372378}");
        boolean boolean54 = node4.isEquivalentTo(node15);
        node15.setIsSyntheticBlock(true);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + subclassType5 + "' != '" + com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS + "'", subclassType5.equals(com.google.javascript.jscomp.CodingConvention.SubclassType.INHERITS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02559");
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
        int int32 = node25.getCharno();
        com.google.javascript.rhino.Node node33 = node25.getFirstChild();
        java.lang.String str34 = node25.getQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = node25.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02560");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        jSTypeRegistry2.clearNamedTypes();
        com.google.javascript.rhino.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter4, true);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        jSTypeRegistry6.unregisterPropertyOnType("(Not declared as a type name)", jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray12 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType13 = jSTypeRegistry6.createFunctionType(jSType10, true, jSTypeArray12);
        boolean boolean15 = jSTypeRegistry6.isForwardDeclaredType("function (): ?");
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
        com.google.javascript.rhino.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry45 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter43, true);
        com.google.javascript.rhino.jstype.JSType jSType47 = null;
        jSTypeRegistry45.unregisterPropertyOnType("(Not declared as a type name)", jSType47);
        com.google.javascript.rhino.jstype.JSType jSType49 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray51 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType52 = jSTypeRegistry45.createFunctionType(jSType49, true, jSTypeArray51);
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry6.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType25, jSTypeArray51);
        com.google.javascript.rhino.Node node54 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray51);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        jSTypeRegistry58.unregisterPropertyOnType("(Not declared as a type name)", jSType60);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry58.createFunctionType(jSType62, true, jSTypeArray64);
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType65.autoboxesTo();
        java.lang.String str67 = functionType65.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter68 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter68, true);
        com.google.javascript.rhino.jstype.JSType jSType72 = null;
        jSTypeRegistry70.unregisterPropertyOnType("(Not declared as a type name)", jSType72);
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray76 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType77 = jSTypeRegistry70.createFunctionType(jSType74, true, jSTypeArray76);
        com.google.common.collect.ImmutableList<java.lang.String> strList78 = functionType77.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot80 = functionType77.getSlot("NUMBER 0.0 100\n");
        boolean boolean81 = functionType77.isAllType();
        boolean boolean82 = functionType65.hasEqualCallType(functionType77);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = functionType77.getOwnerFunction();
        java.util.Set<java.lang.String> strSet84 = functionType77.getOwnPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType77.getTypeOfThis();
        boolean boolean86 = jSTypeRegistry2.declareType("java.io.IOException", (com.google.javascript.rhino.jstype.JSType) functionType77);
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry2.createNamedType("function (): {405212503}", "function (): {1614074355}", 53, 51);
        boolean boolean93 = jSTypeRegistry2.isForwardDeclaredType("function (): {1991082376}");
        com.google.javascript.rhino.jstype.JSType jSType98 = jSTypeRegistry2.createNamedType("function (): {2140273663}", "{proxy:function (): {1722855055}}", (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(jSTypeArray12);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        org.junit.Assert.assertNotNull(jSTypeArray51);
        org.junit.Assert.assertNotNull(functionType52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNull(jSType66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(jSTypeArray76);
        org.junit.Assert.assertNotNull(functionType77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNull(staticSlot80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(functionType83);
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(jSType91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jSType98);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02561");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.isExterns();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection3 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeCollection3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertNull(jSTypeExpression5);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02562");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = new com.google.javascript.rhino.JSTypeExpression(node3, "NUMBER 0.0 100\n");
        com.google.javascript.rhino.Node node7 = node3.getAncestor(54);
        int int8 = node3.getCharno();
        int int9 = node3.getChildCount();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        node11.putIntProp((-1), 35);
        boolean boolean15 = node11.isReturn();
        com.google.javascript.rhino.InputId inputId16 = node11.getInputId();
        node11.setWasEmptyNode(true);
        boolean boolean19 = node11.isLabel();
        boolean boolean20 = node11.isArrayLit();
        boolean boolean21 = node11.isLabelName();
        com.google.javascript.rhino.Node node25 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.jstype.JSType jSType26 = node25.getJSType();
        com.google.javascript.rhino.InputId inputId27 = node25.getInputId();
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
        node25.addChildToBack(node73);
        node25.setSourceEncodedPositionForTree(12);
        com.google.javascript.rhino.Node node81 = node25.cloneTree();
        com.google.javascript.rhino.Node node82 = node11.srcref(node25);
        boolean boolean83 = node3.isEquivalentToTyped(node82);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(inputId16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(jSType26);
        org.junit.Assert.assertNull(inputId27);
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
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02563");
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
        boolean boolean54 = parameterizedType48.isOrdinaryFunction();
        boolean boolean55 = parameterizedType48.matchesStringContext();
        boolean boolean56 = parameterizedType48.isOrdinaryFunction();
        com.google.javascript.rhino.jstype.ObjectType.Property property58 = parameterizedType48.getSlot("{proxy:function (): {1766368709}}");
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(property58);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02564");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter3, true);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        jSTypeRegistry5.unregisterPropertyOnType("(Not declared as a type name)", jSType7);
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        jSTypeRegistry11.unregisterPropertyOnType("(Not declared as a type name)", jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType(jSType15, true, jSTypeArray17);
        boolean boolean20 = functionType18.removeProperty("false");
        boolean boolean21 = functionType18.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType22 = jSTypeRegistry5.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType18);
        com.google.javascript.rhino.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter23, true);
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        jSTypeRegistry25.unregisterPropertyOnType("(Not declared as a type name)", jSType27);
        com.google.javascript.rhino.jstype.JSType jSType29 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray31 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType32 = jSTypeRegistry25.createFunctionType(jSType29, true, jSTypeArray31);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative34 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec35 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative34);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isStringKey();
        boolean boolean44 = node39.isThrow();
        com.google.javascript.rhino.Node node45 = node37.useSourceInfoFrom(node39);
        boolean boolean46 = node45.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        jSTypeRegistry49.unregisterPropertyOnType("(Not declared as a type name)", jSType51);
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.jstype.JSType jSType57 = null;
        jSTypeRegistry55.unregisterPropertyOnType("(Not declared as a type name)", jSType57);
        com.google.javascript.rhino.jstype.JSType jSType59 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray61 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType62 = jSTypeRegistry55.createFunctionType(jSType59, true, jSTypeArray61);
        boolean boolean64 = functionType62.removeProperty("false");
        boolean boolean65 = functionType62.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType66 = jSTypeRegistry49.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType62);
        com.google.javascript.rhino.jstype.JSType jSType67 = assertionFunctionSpec35.getAssertedType(node45, jSTypeRegistry49);
        jSTypeRegistry49.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node71 = jSTypeRegistry49.createOptionalParameters(jSTypeArray70);
        com.google.javascript.rhino.Node node72 = jSTypeRegistry25.createOptionalParameters(jSTypeArray70);
        com.google.javascript.rhino.Node node73 = jSTypeRegistry5.createParameters(jSTypeArray70);
        com.google.javascript.rhino.Node node74 = jSTypeRegistry2.createOptionalParameters(jSTypeArray70);
        com.google.javascript.rhino.ErrorReporter errorReporter75 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry77 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter75, true);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        jSTypeRegistry77.unregisterPropertyOnType("(Not declared as a type name)", jSType79);
        com.google.javascript.rhino.jstype.JSType jSType81 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray83 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry77.createFunctionType(jSType81, true, jSTypeArray83);
        boolean boolean86 = functionType84.removeProperty("false");
        boolean boolean87 = functionType84.hasDisplayName();
        boolean boolean88 = functionType84.isStringObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType89 = functionType84.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType90 = jSTypeRegistry2.createOptionalNullableType((com.google.javascript.rhino.jstype.JSType) objectType89);
        java.util.List<com.google.javascript.rhino.jstype.JSType> jSTypeList91 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node92 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeList91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSType22);
        org.junit.Assert.assertNotNull(jSTypeArray31);
        org.junit.Assert.assertNotNull(functionType32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSTypeArray61);
        org.junit.Assert.assertNotNull(functionType62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNull(jSType67);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(jSTypeArray83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(objectType89);
        org.junit.Assert.assertNotNull(jSType90);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02565");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType9.findPropertyType("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType14 = functionType9.unboxesTo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType15 = jSType14.collapseUnion();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02566");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        int int7 = node1.getType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02567");
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
        java.lang.Object[] objArray25 = charSequenceList24.toArray();
        boolean boolean26 = charSequenceList24.isEmpty();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor27 = charSequenceList24.listIterator();
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor28 = charSequenceList24.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceItor28.remove();
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
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charSequenceItor27);
        org.junit.Assert.assertNotNull(charSequenceItor28);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02568");
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
        boolean boolean15 = functionType9.isUnionType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList16 = functionType9.getSubTypes();
        boolean boolean17 = functionType9.hasImplementedInterfaces();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter18, true);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        jSTypeRegistry20.unregisterPropertyOnType("(Not declared as a type name)", jSType22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray26 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType27 = jSTypeRegistry20.createFunctionType(jSType24, true, jSTypeArray26);
        boolean boolean29 = functionType27.removeProperty("false");
        boolean boolean30 = functionType27.isNativeObjectType();
        com.google.javascript.rhino.Node node31 = functionType27.getSource();
        boolean boolean32 = functionType27.isEmptyType();
        functionType27.clearResolved();
        com.google.javascript.rhino.jstype.FunctionType functionType34 = functionType27.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair35 = functionType9.getTypesUnderEquality((com.google.javascript.rhino.jstype.JSType) functionType27);
        java.lang.String str36 = functionType27.toDebugHashCodeString();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertNotNull(objectTypeIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(functionTypeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeArray26);
        org.junit.Assert.assertNotNull(functionType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(functionType34);
        org.junit.Assert.assertNotNull(typePair35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "function (): {1536429622}" + "'", str36, "function (): {1536429622}");
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02569");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable85 = jSTypeRegistry45.getEachReferenceTypeWithProperty("function (): {1685012791}");
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
        org.junit.Assert.assertNotNull(objectTypeIterable85);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02570");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("{proxy:function (): {1634104804}}");
        org.junit.Assert.assertNotNull(node1);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02571");
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
        com.google.javascript.rhino.jstype.FunctionType functionType51 = functionType22.getOwnerFunction();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        boolean boolean62 = functionType61.isReturnTypeInferred();
        boolean boolean63 = functionType61.matchesStringContext();
        com.google.javascript.rhino.jstype.FunctionType functionType65 = functionType61.getBindReturnType((int) (short) 1);
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable66 = functionType61.getImplementedInterfaces();
        boolean boolean67 = functionType61.isUnionType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList68 = functionType61.getSubTypes();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair69 = functionType22.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) functionType61);
        boolean boolean70 = functionType22.isNominalConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType71 = functionType22.cloneWithoutArrowType();
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
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(functionType51);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNotNull(objectTypeIterable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(functionTypeList68);
        org.junit.Assert.assertNotNull(typePair69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02572");
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
        boolean boolean67 = functionType39.isUnknownType();
        java.util.Set<java.lang.String> strSet68 = functionType39.getPropertyNames();
        com.google.javascript.rhino.jstype.JSType jSType70 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType39, "Named type with empty name component");
        com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode resolveMode71 = com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES;
        jSTypeRegistry2.setResolveMode(resolveMode71);
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter74 = jSTypeRegistry2.getErrorReporter();
        boolean boolean75 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        com.google.javascript.rhino.jstype.ObjectType objectType76 = jSTypeRegistry2.createAnonymousObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertTrue("'" + resolveMode71 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES + "'", resolveMode71.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_NAMES));
        org.junit.Assert.assertNull(errorReporter74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objectType76);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02573");
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
        boolean boolean47 = node40.isString();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02574");
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
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet54 = jSType53.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet55 = com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet56 = booleanLiteralSet54.union(booleanLiteralSet55);
        boolean boolean58 = booleanLiteralSet54.contains(true);
        boolean boolean60 = booleanLiteralSet54.contains(true);
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
        org.junit.Assert.assertTrue("'" + booleanLiteralSet54 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet54.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet55 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet55.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + booleanLiteralSet56 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet56.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02575");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot35 = functionType9.getOwnSlot("Not declared as a type name");
        boolean boolean36 = functionType9.isArrayType();
        boolean boolean37 = functionType9.hasDisplayName();
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
        org.junit.Assert.assertNull(jSTypeStaticSlot35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02576");
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
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter14, true);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        jSTypeRegistry16.unregisterPropertyOnType("(Not declared as a type name)", jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray22 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType23 = jSTypeRegistry16.createFunctionType(jSType20, true, jSTypeArray22);
        boolean boolean25 = functionType23.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType27 = functionType23.findPropertyType("Not declared as a type name");
        boolean boolean28 = functionType9.differsFrom((com.google.javascript.rhino.jstype.JSType) functionType23);
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = null;
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType23.resolve(errorReporter29, jSTypeStaticScope30);
        boolean boolean32 = functionType23.isFunctionPrototypeType();
        boolean boolean33 = functionType23.isDateType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSTypeArray22);
        org.junit.Assert.assertNotNull(functionType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02577");
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
        boolean boolean50 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.Node node52 = functionType9.getPropertyNode("function (): {2030130551}");
        boolean boolean53 = functionType9.matchesObjectContext();
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
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02578");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isHook();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = node7.getStaticSourceFile();
        com.google.javascript.rhino.Node node10 = node7.getNext();
        boolean boolean11 = node7.isFalse();
        boolean boolean12 = node7.isInc();
        node1.addChildrenToBack(node7);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        boolean boolean16 = node15.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node15.getStaticSourceFile();
        com.google.javascript.rhino.Node node18 = node15.getNext();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        boolean boolean26 = node20.isEmpty();
        com.google.javascript.rhino.Node node27 = node15.copyInformationFrom(node20);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.javascript.rhino.Node node34 = node27.srcref(node29);
        boolean boolean35 = node34.isOr();
        boolean boolean36 = node34.isCatch();
        node34.setSourceFileForTesting("function (): {405212503}");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node34);
        int int41 = staticSourceFile39.getLineOfOffset(1);
        boolean boolean42 = staticSourceFile39.isExtern();
        int int44 = staticSourceFile39.getColumnOfOffset((int) (short) 1);
        node7.setStaticSourceFile(staticSourceFile39);
        int int47 = staticSourceFile39.getColumnOfOffset(32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(staticSourceFile9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(staticSourceFile17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(staticSourceFile39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02579");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        java.lang.String str5 = jSDocInfo0.getDescriptionForParameter("function (): {27532273}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02580");
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
        java.lang.String str14 = functionType13.toAnnotationString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = functionType13.getCtorExtendedInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType17 = functionType13.getTopMostDefiningType("{proxy:function (): {545083368}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "function (): ?" + "'", str14, "function (): ?");
        org.junit.Assert.assertNotNull(objectTypeIterable15);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02581");
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
        java.lang.String str74 = inputId20.getIdName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean76 = jSDocInfo75.hasThisType();
        boolean boolean77 = jSDocInfo75.shouldPreserveTry();
        boolean boolean78 = jSDocInfo75.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression79 = jSDocInfo75.getType();
        boolean boolean80 = inputId20.equals((java.lang.Object) jSDocInfo75);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression81 = jSDocInfo75.getBaseType();
        java.lang.String str82 = jSDocInfo75.getOriginalCommentString();
        boolean boolean83 = jSDocInfo75.hasBaseType();
        boolean boolean84 = jSDocInfo75.isDefine();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression85 = jSDocInfo75.getThisType();
        java.util.Set<java.lang.String> strSet86 = jSDocInfo75.getSuppressions();
        boolean boolean87 = strSet86.isEmpty();
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "NUMBER 0.0 100\n" + "'", str74, "NUMBER 0.0 100\n");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(jSTypeExpression79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(jSTypeExpression81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(jSTypeExpression85);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02582");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        boolean boolean11 = functionType9.isConstructor();
        boolean boolean12 = functionType9.hasDisplayName();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = functionType9.getTypeOfThis();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = functionType9.getConstructor();
        functionType9.clearResolved();
        boolean boolean16 = functionType9.isDateType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectType13);
        org.junit.Assert.assertNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02583");
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
        java.lang.String str14 = functionType13.toAnnotationString();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = functionType13.getCtorExtendedInterfaces();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList16 = functionType13.getSubTypes();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType13.getTopMostDefiningType("{proxy:function (): {1569480913}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "function (): ?" + "'", str14, "function (): ?");
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNull(functionTypeList16);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02584");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean3 = jSDocInfo2.hasThisType();
        boolean boolean4 = jSDocInfo2.shouldPreserveTry();
        boolean boolean5 = jSDocInfo2.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo2.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean8 = jSDocInfo2.shouldPreserveTry();
        boolean boolean9 = jSDocInfo2.isOverride();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection10 = jSDocInfo2.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo2.getTypedefType();
        java.lang.String str13 = jSDocInfo2.getDescriptionForParameter("function (): {2129138287}");
        node1.setJSDocInfo(jSDocInfo2);
        boolean boolean15 = jSDocInfo2.isIdGenerator();
        java.util.Set<java.lang.String> strSet16 = jSDocInfo2.getParameterNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(markerCollection10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02585");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        node7.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(32, node7);
        boolean boolean12 = node7.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        boolean boolean15 = node14.isCall();
        com.google.javascript.rhino.Node node16 = node14.cloneTree();
        com.google.javascript.jscomp.CodingConvention.Bind bind17 = new com.google.javascript.jscomp.CodingConvention.Bind(node1, node7, node14);
        boolean boolean18 = node1.isComma();
        int int19 = node1.getChildCount();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02586");
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
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = functionType21.setValidator(jSTypePredicate27);
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
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02587");
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
        boolean boolean56 = parameterizedType48.hasProperty("(function (): {480423885})");
        com.google.javascript.rhino.Node node58 = parameterizedType48.getPropertyNode("{proxy:function (): {1278869837}}");
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(node58);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02588");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, false);
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        jSTypeRegistry7.unregisterPropertyOnType("(Not declared as a type name)", jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry7.createFunctionType(jSType11, true, jSTypeArray13);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative16 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec17 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative16);
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        node21.putIntProp((-1), 35);
        boolean boolean25 = node21.isStringKey();
        boolean boolean26 = node21.isThrow();
        com.google.javascript.rhino.Node node27 = node19.useSourceInfoFrom(node21);
        boolean boolean28 = node27.isIn();
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
        com.google.javascript.rhino.jstype.JSType jSType49 = assertionFunctionSpec17.getAssertedType(node27, jSTypeRegistry31);
        jSTypeRegistry31.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node53 = jSTypeRegistry31.createOptionalParameters(jSTypeArray52);
        com.google.javascript.rhino.Node node54 = jSTypeRegistry7.createOptionalParameters(jSTypeArray52);
        com.google.javascript.rhino.Node node55 = jSTypeRegistry2.createParametersWithVarArgs(jSTypeArray52);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(0);
        node60.putIntProp((-1), 35);
        boolean boolean64 = node60.isStringKey();
        boolean boolean65 = node60.isThrow();
        com.google.javascript.rhino.Node node66 = node58.useSourceInfoFrom(node60);
        com.google.javascript.rhino.ErrorReporter errorReporter67 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter67, true);
        com.google.javascript.rhino.jstype.JSType jSType71 = null;
        jSTypeRegistry69.unregisterPropertyOnType("(Not declared as a type name)", jSType71);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray75 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType76 = jSTypeRegistry69.createFunctionType(jSType73, true, jSTypeArray75);
        com.google.javascript.rhino.jstype.JSType jSType77 = functionType76.autoboxesTo();
        java.lang.String str78 = functionType76.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter79 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry81 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter79, true);
        com.google.javascript.rhino.jstype.JSType jSType83 = null;
        jSTypeRegistry81.unregisterPropertyOnType("(Not declared as a type name)", jSType83);
        com.google.javascript.rhino.jstype.JSType jSType85 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray87 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType88 = jSTypeRegistry81.createFunctionType(jSType85, true, jSTypeArray87);
        com.google.common.collect.ImmutableList<java.lang.String> strList89 = functionType88.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot91 = functionType88.getSlot("NUMBER 0.0 100\n");
        boolean boolean92 = functionType88.isAllType();
        boolean boolean93 = functionType76.hasEqualCallType(functionType88);
        boolean boolean94 = functionType88.isTemplateType();
        com.google.javascript.rhino.jstype.ObjectType objectType95 = jSTypeRegistry2.createObjectType("function (): {1341612873}", node58, (com.google.javascript.rhino.jstype.ObjectType) functionType88);
        com.google.javascript.rhino.InputId inputId96 = node58.getInputId();
        boolean boolean97 = node58.isAssignAdd();
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jSType48);
        org.junit.Assert.assertNull(jSType49);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(jSTypeArray75);
        org.junit.Assert.assertNotNull(functionType76);
        org.junit.Assert.assertNull(jSType77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(jSTypeArray87);
        org.junit.Assert.assertNotNull(functionType88);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNull(staticSlot91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertNull(inputId96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02589");
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
        com.google.javascript.rhino.Node node40 = node4.getNext();
        // The following exception was thrown during execution in test generation
        try {
            node40.setCharno((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02590");
        java.io.IOException iOException1 = new java.io.IOException("{proxy:function (): {1387664534}}");
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02591");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getAuthors();
        java.lang.String str9 = jSDocInfo0.getReturnDescription();
        boolean boolean11 = jSDocInfo0.hasParameter("");
        boolean boolean12 = jSDocInfo0.isImplicitCast();
        java.lang.String str13 = jSDocInfo0.getBlockDescription();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02592");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isHook();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        boolean boolean8 = node7.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = node7.getStaticSourceFile();
        com.google.javascript.rhino.Node node10 = node7.getNext();
        boolean boolean11 = node7.isFalse();
        boolean boolean12 = node7.isInc();
        node1.addChildrenToBack(node7);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        boolean boolean16 = node15.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node15.getStaticSourceFile();
        com.google.javascript.rhino.Node node18 = node15.getNext();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        node20.putIntProp((-1), 35);
        boolean boolean24 = node20.isStringKey();
        boolean boolean25 = node20.isThrow();
        boolean boolean26 = node20.isEmpty();
        com.google.javascript.rhino.Node node27 = node15.copyInformationFrom(node20);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        boolean boolean33 = node29.isReturn();
        com.google.javascript.rhino.Node node34 = node27.srcref(node29);
        boolean boolean35 = node34.isOr();
        boolean boolean36 = node34.isCatch();
        node34.setSourceFileForTesting("function (): {405212503}");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node34);
        int int41 = staticSourceFile39.getLineOfOffset(1);
        boolean boolean42 = staticSourceFile39.isExtern();
        int int44 = staticSourceFile39.getColumnOfOffset((int) (short) 1);
        node7.setStaticSourceFile(staticSourceFile39);
        java.lang.String str46 = staticSourceFile39.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int48 = staticSourceFile39.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Should not call getLineOffset with line number 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(staticSourceFile9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(staticSourceFile17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(staticSourceFile39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "function (): {405212503}" + "'", str46, "function (): {405212503}");
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02593");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj5 = node3.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        com.google.javascript.rhino.Node node15 = node7.useSourceInfoFrom(node9);
        boolean boolean16 = node15.isIn();
        com.google.javascript.rhino.Node node17 = node3.clonePropsFrom(node15);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        node21.putIntProp((-1), 35);
        boolean boolean25 = node21.isStringKey();
        boolean boolean26 = node21.isThrow();
        int int27 = node21.getLineno();
        boolean boolean28 = node21.hasChildren();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        node30.putIntProp((-1), 35);
        boolean boolean34 = node21.hasChild(node30);
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        boolean boolean37 = node36.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = node36.getStaticSourceFile();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0, node30, node36, node42);
        boolean boolean44 = node30.hasOneChild();
        boolean boolean45 = node30.wasEmptyNode();
        boolean boolean46 = node30.isIf();
        com.google.javascript.rhino.InputId inputId47 = com.google.javascript.jscomp.NodeUtil.getInputId(node30);
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = new com.google.javascript.rhino.JSTypeExpression(node51, "NUMBER 0.0 100\n");
        boolean boolean54 = node51.isFor();
        boolean boolean55 = node51.isCall();
        node51.setSourceEncodedPosition((int) (short) 0);
        com.google.javascript.rhino.Node node58 = node30.copyInformationFromForTree(node51);
        boolean boolean59 = node3.isEquivalentToTyped(node51);
        // The following exception was thrown during execution in test generation
        try {
            node3.setString("(function (): {1808020359})");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 100 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(staticSourceFile38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(inputId47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02594");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        boolean boolean4 = node3.isTypeOf();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(0);
        boolean boolean7 = node6.isInstanceOf();
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(0);
        node9.putIntProp((-1), 35);
        boolean boolean13 = node9.isStringKey();
        boolean boolean14 = node9.isThrow();
        boolean boolean15 = node9.isEmpty();
        com.google.javascript.rhino.Node node16 = node6.useSourceInfoFrom(node9);
        boolean boolean17 = node9.isNE();
        boolean boolean18 = node9.isCall();
        boolean boolean19 = node9.isNew();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        node22.putIntProp((-1), 35);
        boolean boolean26 = node22.isStringKey();
        boolean boolean27 = node22.isThrow();
        int int28 = node22.getLineno();
        boolean boolean29 = node22.hasChildren();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node(0);
        node31.putIntProp((-1), 35);
        boolean boolean35 = node22.hasChild(node31);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        boolean boolean38 = node37.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile39 = node37.getStaticSourceFile();
        com.google.javascript.rhino.Node node43 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node(0, node31, node37, node43);
        com.google.javascript.rhino.Node node45 = node9.useSourceInfoFromForTree(node31);
        com.google.javascript.rhino.Node node46 = node3.copyInformationFromForTree(node45);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable47 = node46.children();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(staticSourceFile39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(nodeIterable47);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02595");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("{proxy:function (): {1454030772}}");
        java.lang.String str2 = inputId1.getIdName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{proxy:function (): {1454030772}}" + "'", str2, "{proxy:function (): {1454030772}}");
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02596");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        node1.setWasEmptyNode(true);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isArrayLit();
        boolean boolean11 = node1.isLabelName();
        boolean boolean12 = node1.isLocalResultCall();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = node1.getExistingIntProp((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02597");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType7 = jSTypeRegistry2.getNativeType(jSTypeNative6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02598");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.String str7 = charSequenceList6.toString();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream8 = charSequenceList6.parallelStream();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList9 = charSequenceList6.reverse();
        java.lang.Object obj10 = null;
        boolean boolean11 = charSequenceList9.equals(obj10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = charSequenceList9.add((java.lang.CharSequence) "java.io.IOException: function (): {2129138287}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!, hi!, , , hi!]" + "'", str7, "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceStream8);
        org.junit.Assert.assertNotNull(charSequenceList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02599");
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
        com.google.javascript.rhino.jstype.EnumElementType enumElementType52 = parameterizedType48.toMaybeEnumElementType();
        boolean boolean53 = parameterizedType48.isConstructor();
        java.lang.String str54 = parameterizedType48.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType48.findPropertyType("{proxy:function (): {716238328}}");
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
        org.junit.Assert.assertNull(enumElementType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(jSType56);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test02600");
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
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        jSTypeRegistry14.unregisterPropertyOnType("(Not declared as a type name)", jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray20 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType21 = jSTypeRegistry14.createFunctionType(jSType18, true, jSTypeArray20);
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType21.autoboxesTo();
        java.lang.String str23 = functionType21.getNormalizedReferenceName();
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
        boolean boolean38 = functionType21.hasEqualCallType(functionType33);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter39, true);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        jSTypeRegistry41.unregisterPropertyOnType("(Not declared as a type name)", jSType43);
        com.google.javascript.rhino.jstype.JSType jSType45 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType48 = jSTypeRegistry41.createFunctionType(jSType45, true, jSTypeArray47);
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry2.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType21, jSTypeArray47);
        boolean boolean50 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        jSTypeRegistry2.forwardDeclareType("function (): {1036205169}");
        com.google.javascript.rhino.ErrorReporter errorReporter53 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter53, true);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        jSTypeRegistry58.unregisterPropertyOnType("(Not declared as a type name)", jSType60);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray64 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType65 = jSTypeRegistry58.createFunctionType(jSType62, true, jSTypeArray64);
        com.google.javascript.rhino.jstype.JSType jSType66 = functionType65.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType67 = functionType65.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType68 = functionType65.toMaybeFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry55.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType65);
        com.google.javascript.rhino.jstype.ObjectType objectType70 = jSTypeRegistry55.createAnonymousObjectType();
        jSTypeRegistry55.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry55.createNamedType("function (): {687989446}", "function (): {405212503}", 53, 0);
        boolean boolean79 = jSTypeRegistry2.canPropertyBeDefined(jSType77, "function (): {1679669060}");
        boolean boolean80 = jSType77.isBooleanValueType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray20);
        org.junit.Assert.assertNotNull(functionType21);
        org.junit.Assert.assertNull(jSType22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(jSTypeArray32);
        org.junit.Assert.assertNotNull(functionType33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(staticSlot36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(functionType48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jSTypeArray64);
        org.junit.Assert.assertNotNull(functionType65);
        org.junit.Assert.assertNotNull(jSType66);
        org.junit.Assert.assertNull(enumType67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(objectType70);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }
}
