import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03801");
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
        boolean boolean38 = functionType36.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        boolean boolean51 = functionType49.removeProperty("false");
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(0);
        node53.putIntProp((-1), 35);
        boolean boolean57 = node53.isStringKey();
        boolean boolean58 = node53.isThrow();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj64 = node62.getProp((int) (byte) 10);
        boolean boolean65 = node53.isEquivalentToTyped(node62);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0);
        node68.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(32, node68);
        boolean boolean73 = node72.isInstanceOf();
        com.google.javascript.rhino.Node node74 = node62.useSourceInfoFromForTree(node72);
        boolean boolean75 = node72.isDo();
        boolean boolean76 = functionType36.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType49, node72);
        boolean boolean78 = functionType36.removeProperty("Unknown class name");
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj87 = node85.getProp((int) (byte) 10);
        int int88 = node81.getIndexOfChild(node85);
        functionType36.setSource(node81);
        boolean boolean90 = functionType36.isDateType();
        com.google.javascript.rhino.jstype.ObjectType objectType91 = functionType36.getImplicitPrototype();
        objectType91.clearCachedValues();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair93 = functionType21.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType91);
        com.google.javascript.rhino.jstype.JSType jSType94 = typePair93.typeA;
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(objectType91);
        org.junit.Assert.assertNotNull(typePair93);
        org.junit.Assert.assertNotNull(jSType94);
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03802");
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
        jSTypeRegistry2.setLastGeneration(true);
        com.google.javascript.rhino.jstype.JSType jSType91 = jSTypeRegistry2.getType("");
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
        org.junit.Assert.assertNull(jSType91);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03803");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = jSDocInfo2.getEnumParameterType();
        java.lang.String str30 = jSDocInfo2.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = jSDocInfo2.getEnumParameterType();
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
        org.junit.Assert.assertNull(jSTypeExpression31);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03804");
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
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType9.getImplicitPrototype();
        int int66 = functionType9.getMaxArguments();
        boolean boolean68 = functionType9.hasOwnProperty("function (): {436796145}");
        com.google.javascript.rhino.jstype.JSType jSType69 = functionType9.autoboxesTo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = functionType9.getJSDocInfo();
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
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jSType69);
        org.junit.Assert.assertNull(jSDocInfo70);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03805");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(14);
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.setThrows();
        sideEffectFlags1.clearAllFlags();
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03806");
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
        boolean boolean52 = parameterizedType48.isInterface();
        com.google.javascript.rhino.Node node54 = parameterizedType48.getPropertyNode("function (): {2139505179}");
        com.google.javascript.rhino.jstype.EnumType enumType55 = parameterizedType48.toMaybeEnumType();
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
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(enumType55);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03807");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isCall();
        com.google.javascript.rhino.Node node4 = node2.cloneTree();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(35, node4, node7);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        node13.putIntProp((-1), 35);
        boolean boolean17 = node13.isStringKey();
        boolean boolean18 = node13.isThrow();
        com.google.javascript.rhino.Node node19 = node11.useSourceInfoFrom(node13);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node(0);
        boolean boolean23 = node22.isCall();
        com.google.javascript.rhino.Node node24 = node22.cloneTree();
        com.google.javascript.rhino.Node node27 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(35, node24, node27);
        com.google.javascript.rhino.Node node29 = node11.copyInformationFrom(node24);
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
        com.google.javascript.rhino.Node node57 = node29.useSourceInfoIfMissingFrom(node56);
        node29.putBooleanProp(0, true);
        boolean boolean61 = node7.isEquivalentToTyped(node29);
        com.google.javascript.rhino.Node node62 = node7.getFirstChild();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
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
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03808");
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
        boolean boolean91 = parameterizedType48.isPropertyTypeDeclared("InputId: java.io.IOException: java.io.IOException");
        com.google.javascript.rhino.jstype.ObjectType objectType92 = parameterizedType48.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType93 = parameterizedType48.collapseUnion();
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objectType92);
        org.junit.Assert.assertNotNull(jSType93);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03809");
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
        boolean boolean53 = functionType22.isNullable();
        int int54 = functionType22.getExtendedInterfacesCount();
        com.google.javascript.rhino.Node node56 = functionType22.getPropertyNode("function (): {1991082376}");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass57 = node56.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node56);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03810");
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
        boolean boolean82 = enumType81.hasReferenceName();
        java.lang.Iterable iterable83 = enumType81.getCtorExtendedInterfaces();
        boolean boolean85 = enumType81.isPropertyTypeInferred("function (): {361472080}");
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
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(iterable83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03811");
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
        com.google.javascript.rhino.Node node57 = node51.getAncestor(1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression59 = new com.google.javascript.rhino.JSTypeExpression(node57, "LT function (): {848299148} 8");
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
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03812");
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
        boolean boolean25 = node23.isFalse();
        com.google.javascript.rhino.InputId inputId27 = new com.google.javascript.rhino.InputId("NUMBER 0.0 100\n");
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
        java.lang.String str78 = functionType50.getReferenceName();
        boolean boolean79 = inputId27.equals((java.lang.Object) str78);
        node23.setInputId(inputId27);
        boolean boolean81 = node23.isDo();
        int int83 = node23.getIntProp((int) (short) 10);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(0);
        node85.putIntProp((-1), 35);
        boolean boolean89 = node85.isStringKey();
        boolean boolean90 = node85.isThrow();
        boolean boolean91 = node85.isEmpty();
        boolean boolean92 = node85.isArrayLit();
        int int93 = node23.getIndexOfChild(node85);
        boolean boolean94 = node85.isNew();
        boolean boolean95 = node85.isFromExterns();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
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
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03813");
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
        boolean boolean24 = node6.isLocalResultCall();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03814");
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
        boolean boolean34 = functionType9.isCheckedUnknownType();
        boolean boolean35 = functionType9.isTemplateType();
        com.google.javascript.rhino.jstype.ObjectType objectType36 = functionType9.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType37 = objectType36.unboxesTo();
        boolean boolean38 = objectType36.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.JSType jSType40 = objectType36.getRestrictedTypeGivenToBooleanOutcome(false);
        boolean boolean41 = jSType40.isAllType();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectType36);
        org.junit.Assert.assertNull(jSType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03815");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = jSTypeRegistry2.isForwardDeclaredType("function (): ?");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = functionType22.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot25 = functionType22.getSlot("NUMBER 0.0 100\n");
        boolean boolean26 = functionType22.isAllType();
        boolean boolean28 = functionType22.hasProperty("Not declared as a type name");
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = functionType22.getTemplateTypeNames();
        jSTypeRegistry2.unregisterPropertyOnType("function (): {1617435542}", (com.google.javascript.rhino.jstype.JSType) functionType22);
        com.google.javascript.rhino.jstype.JSType jSType32 = jSTypeRegistry2.getType("function (): {687989446}");
        com.google.javascript.rhino.jstype.JSType jSType34 = jSTypeRegistry2.getType("function (): {1445708881}");
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        com.google.javascript.rhino.jstype.JSType jSType45 = functionType44.restrictByNotNullOrUndefined();
        java.lang.String str46 = functionType44.toString();
        java.lang.Iterable iterable47 = functionType44.getCtorExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType49 = functionType44.getPropertyType("NUMBER 0.0");
        java.lang.Iterable iterable50 = functionType44.getCtorImplementedInterfaces();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable51 = functionType44.getAllImplementedInterfaces();
        com.google.javascript.rhino.jstype.JSType jSType53 = jSTypeRegistry2.getGreatestSubtypeWithProperty((com.google.javascript.rhino.jstype.JSType) functionType44, "{proxy:function (): {1278869837}}");
        com.google.javascript.rhino.jstype.ObjectType objectType54 = jSTypeRegistry2.createAnonymousObjectType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNull(staticSlot25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertNull(jSType34);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertNotNull(jSType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "function (): ?" + "'", str46, "function (): ?");
        org.junit.Assert.assertNotNull(iterable47);
        org.junit.Assert.assertNotNull(jSType49);
        org.junit.Assert.assertNotNull(iterable50);
        org.junit.Assert.assertNotNull(objectTypeIterable51);
        org.junit.Assert.assertNotNull(jSType53);
        org.junit.Assert.assertNotNull(objectType54);
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03816");
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
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType30.autoboxesTo();
        boolean boolean32 = jSTypeRegistry2.declareType("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType30);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter35, true);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        jSTypeRegistry37.unregisterPropertyOnType("(Not declared as a type name)", jSType39);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray43 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType44 = jSTypeRegistry37.createFunctionType(jSType41, true, jSTypeArray43);
        boolean boolean46 = jSTypeRegistry37.isForwardDeclaredType("function (): ?");
        com.google.javascript.rhino.ErrorReporter errorReporter47 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter47, true);
        com.google.javascript.rhino.jstype.JSType jSType51 = null;
        jSTypeRegistry49.unregisterPropertyOnType("(Not declared as a type name)", jSType51);
        com.google.javascript.rhino.jstype.JSType jSType53 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray55 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType56 = jSTypeRegistry49.createFunctionType(jSType53, true, jSTypeArray55);
        com.google.javascript.rhino.jstype.JSType jSType57 = functionType56.autoboxesTo();
        java.lang.String str58 = functionType56.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter59 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter59, true);
        com.google.javascript.rhino.jstype.JSType jSType63 = null;
        jSTypeRegistry61.unregisterPropertyOnType("(Not declared as a type name)", jSType63);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray67 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType68 = jSTypeRegistry61.createFunctionType(jSType65, true, jSTypeArray67);
        com.google.common.collect.ImmutableList<java.lang.String> strList69 = functionType68.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot71 = functionType68.getSlot("NUMBER 0.0 100\n");
        boolean boolean72 = functionType68.isAllType();
        boolean boolean73 = functionType56.hasEqualCallType(functionType68);
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        jSTypeRegistry76.unregisterPropertyOnType("(Not declared as a type name)", jSType78);
        com.google.javascript.rhino.jstype.JSType jSType80 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray82 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry76.createFunctionType(jSType80, true, jSTypeArray82);
        com.google.javascript.rhino.jstype.FunctionType functionType84 = jSTypeRegistry37.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType56, jSTypeArray82);
        com.google.javascript.rhino.jstype.FunctionType functionType85 = jSTypeRegistry2.createConstructorType(jSType33, false, jSTypeArray82);
        jSTypeRegistry2.forwardDeclareType("java.io.IOException");
        boolean boolean89 = jSTypeRegistry2.isForwardDeclaredType("function (): {1688919164}");
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSTypeArray43);
        org.junit.Assert.assertNotNull(functionType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jSTypeArray55);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNull(jSType57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(jSTypeArray67);
        org.junit.Assert.assertNotNull(functionType68);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNull(staticSlot71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jSTypeArray82);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertNotNull(functionType84);
        org.junit.Assert.assertNotNull(functionType85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03817");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getAnnotation();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(typePosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(typePosition7);
        org.junit.Assert.assertNull(stringPosition8);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03818");
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
        java.lang.String str78 = functionType50.getReferenceName();
        functionType21.setPrototypeBasedOn((com.google.javascript.rhino.jstype.ObjectType) functionType50);
        boolean boolean80 = functionType21.isAllType();
        int int81 = functionType21.getMaxArguments();
        boolean boolean83 = functionType21.removeProperty("java.io.IOException: ");
        java.lang.String str84 = functionType21.getNormalizedReferenceName();
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
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03819");
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder0 = com.google.common.collect.ImmutableList.builder();
        java.lang.String[] strArray7 = new java.lang.String[] { "(Not declared as a type name)", "", "", "JSDocInfo", "NUMBER 0.0 100\n", "Named type with empty name component" };
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = com.google.common.collect.ImmutableList.copyOf(strArray7);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder9 = strArrayBuilder0.add(strArray7);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder10 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder11 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder12 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.lang.String[]>> strArrayBuilderList13 = com.google.common.collect.ImmutableList.of(strArrayBuilder10, strArrayBuilder11, strArrayBuilder12);
        java.lang.String[] strArray26 = new java.lang.String[] {};
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList27 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "(Not declared as a type name)", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "(Not declared as a type name)", (java.lang.Comparable<java.lang.String>) "JSDocInfo", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "java.io.IOException", (java.lang.Comparable<java.lang.String>) "Not declared as a type name", (java.lang.Comparable<java.lang.String>) "(Not declared as a type name)", (java.lang.Comparable<java.lang.String>) "java.io.IOException", (java.lang.Comparable<java.lang.String>) "Not declared as a type name", (java.lang.Comparable<java.lang.String>) "[hi!, hi!, , , hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray26);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList28 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>[]) strArray26);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder29 = strArrayBuilder11.add(strArray26);
        java.lang.String[] strArray42 = new java.lang.String[] {};
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList43 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "(Not declared as a type name)", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "(Not declared as a type name)", (java.lang.Comparable<java.lang.String>) "JSDocInfo", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "java.io.IOException", (java.lang.Comparable<java.lang.String>) "Not declared as a type name", (java.lang.Comparable<java.lang.String>) "(Not declared as a type name)", (java.lang.Comparable<java.lang.String>) "java.io.IOException", (java.lang.Comparable<java.lang.String>) "Not declared as a type name", (java.lang.Comparable<java.lang.String>) "[hi!, hi!, , , hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray42);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "(Not declared as a type name)", "hi!", "Not declared as a type name", "function (): ?", "Named type with empty name component", "(Not declared as a type name)" };
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "JSDocInfo" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence[]> charSequenceArrayList53 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence[]) strArray42, charSequenceArray50, charSequenceArray52);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder54 = strArrayBuilder11.add(strArray42);
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList55 = strArrayBuilder11.build();
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList56 = strArrayBuilder11.build();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder57 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder58 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder59 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.lang.String[]>> strArrayBuilderList60 = com.google.common.collect.ImmutableList.of(strArrayBuilder57, strArrayBuilder58, strArrayBuilder59);
        com.google.common.collect.ImmutableList<java.lang.String[]> strArrayList61 = strArrayBuilder57.build();
        java.lang.String[][] strArray62 = new java.lang.String[][] {};
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder63 = strArrayBuilder57.add(strArray62);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder64 = strArrayBuilder11.add(strArray62);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder65 = strArrayBuilder9.add(strArray62);
        org.junit.Assert.assertNotNull(strArrayBuilder0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strArrayBuilder9);
        org.junit.Assert.assertNotNull(strArrayBuilder10);
        org.junit.Assert.assertNotNull(strArrayBuilder11);
        org.junit.Assert.assertNotNull(strArrayBuilder12);
        org.junit.Assert.assertNotNull(strArrayBuilderList13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strComparableList27);
        org.junit.Assert.assertNotNull(strComparableList28);
        org.junit.Assert.assertNotNull(strArrayBuilder29);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strComparableList43);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArrayList53);
        org.junit.Assert.assertNotNull(strArrayBuilder54);
        org.junit.Assert.assertNotNull(strArrayList55);
        org.junit.Assert.assertNotNull(strArrayList56);
        org.junit.Assert.assertNotNull(strArrayBuilder57);
        org.junit.Assert.assertNotNull(strArrayBuilder58);
        org.junit.Assert.assertNotNull(strArrayBuilder59);
        org.junit.Assert.assertNotNull(strArrayBuilderList60);
        org.junit.Assert.assertNotNull(strArrayList61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArrayBuilder63);
        org.junit.Assert.assertNotNull(strArrayBuilder64);
        org.junit.Assert.assertNotNull(strArrayBuilder65);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03820");
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
        boolean boolean83 = enumElementType82.isNullable();
        com.google.javascript.rhino.jstype.ObjectType.Property property85 = enumElementType82.getSlot("function (): {109331746}");
        boolean boolean86 = enumElementType82.isNominalType();
        int int87 = enumElementType82.getPropertiesCount();
        com.google.javascript.rhino.jstype.EnumElementType enumElementType88 = enumElementType82.toMaybeEnumElementType();
        boolean boolean89 = enumElementType88.isNullType();
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
        org.junit.Assert.assertNull(property85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(enumElementType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03821");
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
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = functionType9.getTemplateTypeNames();
        boolean boolean17 = functionType9.isFunctionPrototypeType();
        functionType9.clearCachedValues();
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType9.getIndexType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSType19);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03822");
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
        java.lang.String str69 = functionType15.getReferenceName();
        boolean boolean70 = functionType15.isCheckedUnknownType();
        boolean boolean71 = functionType15.canBeCalled();
        boolean boolean72 = functionType15.matchesStringContext();
        boolean boolean73 = functionType15.isInterface();
        boolean boolean74 = functionType15.hasImplementedInterfaces();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03823");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = node1.getStaticSourceFile();
        com.google.javascript.rhino.Node node4 = node1.getNext();
        boolean boolean5 = node1.isFalse();
        com.google.javascript.rhino.Node node9 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean10 = node9.isEmpty();
        node1.addChildrenToBack(node9);
        boolean boolean12 = node9.isIn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03824");
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
        jSTypeRegistry2.incrementGeneration();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry21 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter19, true);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        jSTypeRegistry21.unregisterPropertyOnType("(Not declared as a type name)", jSType23);
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray27 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType28 = jSTypeRegistry21.createFunctionType(jSType25, true, jSTypeArray27);
        boolean boolean30 = functionType28.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter32, true);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        jSTypeRegistry34.unregisterPropertyOnType("(Not declared as a type name)", jSType36);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray40 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType41 = jSTypeRegistry34.createFunctionType(jSType38, true, jSTypeArray40);
        boolean boolean43 = functionType41.removeProperty("false");
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(0);
        node45.putIntProp((-1), 35);
        boolean boolean49 = node45.isStringKey();
        boolean boolean50 = node45.isThrow();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj56 = node54.getProp((int) (byte) 10);
        boolean boolean57 = node45.isEquivalentToTyped(node54);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(0);
        node60.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node(32, node60);
        boolean boolean65 = node64.isInstanceOf();
        com.google.javascript.rhino.Node node66 = node54.useSourceInfoFromForTree(node64);
        boolean boolean67 = node64.isDo();
        boolean boolean68 = functionType28.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType41, node64);
        jSTypeRegistry2.registerPropertyOnType("hi!", (com.google.javascript.rhino.jstype.JSType) functionType41);
        com.google.javascript.rhino.jstype.JSType jSType70 = functionType41.autobox();
        boolean boolean72 = functionType41.isPropertyTypeDeclared("{proxy:function (): {1458539419}}");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot74 = functionType41.getSlot("{proxy:function (): {839059875}}");
        boolean boolean75 = functionType41.matchesNumberContext();
        org.junit.Assert.assertNotNull(jSTypeArray11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNull(enumType14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeArray27);
        org.junit.Assert.assertNotNull(functionType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray40);
        org.junit.Assert.assertNotNull(functionType41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jSType70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03825");
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
        com.google.javascript.rhino.JSDocInfo.Visibility visibility29 = jSDocInfo15.getVisibility();
        boolean boolean30 = jSDocInfo15.isConsistentIdGenerator();
        boolean boolean31 = jSDocInfo15.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo15.getThisType();
        java.lang.String str33 = jSDocInfo15.getReturnDescription();
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
        org.junit.Assert.assertNull(visibility29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSTypeExpression32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03826");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(0);
        node3.putIntProp((-1), 35);
        boolean boolean7 = node3.isStringKey();
        boolean boolean8 = node3.isThrow();
        com.google.javascript.rhino.Node node9 = node1.useSourceInfoFrom(node3);
        boolean boolean10 = node9.isIn();
        boolean boolean11 = node9.isVoid();
        int int13 = node9.getIntProp(53);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03827");
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
        boolean boolean57 = parameterizedType48.isOrdinaryFunction();
        boolean boolean58 = parameterizedType48.isNoResolvedType();
        boolean boolean59 = parameterizedType48.isUnionType();
        boolean boolean60 = parameterizedType48.isNoType();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03828");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.hasEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getBaseType();
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("InputId: NUMBER 0.0 100\n");
        java.lang.String str6 = jSDocInfo0.getLicense();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03829");
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative1 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec2 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("[hi!, hi!, , , hi!]", jSTypeNative1);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        boolean boolean5 = node4.isCall();
        boolean boolean6 = node4.isDefaultCase();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        boolean boolean9 = node8.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = node8.getStaticSourceFile();
        node8.setLineno((int) '4');
        com.google.javascript.rhino.Node node13 = node4.srcref(node8);
        int int14 = node8.getCharno();
        boolean boolean16 = node8.getBooleanProp((int) (short) -1);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative18 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec19 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative18);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        boolean boolean27 = node23.isStringKey();
        boolean boolean28 = node23.isThrow();
        com.google.javascript.rhino.Node node29 = node21.useSourceInfoFrom(node23);
        boolean boolean30 = node29.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        jSTypeRegistry33.unregisterPropertyOnType("(Not declared as a type name)", jSType35);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        jSTypeRegistry39.unregisterPropertyOnType("(Not declared as a type name)", jSType41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry39.createFunctionType(jSType43, true, jSTypeArray45);
        boolean boolean48 = functionType46.removeProperty("false");
        boolean boolean49 = functionType46.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry33.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType46);
        com.google.javascript.rhino.jstype.JSType jSType51 = assertionFunctionSpec19.getAssertedType(node29, jSTypeRegistry33);
        jSTypeRegistry33.clearNamedTypes();
        jSTypeRegistry33.incrementGeneration();
        com.google.javascript.rhino.jstype.JSType jSType54 = assertionFunctionSpec2.getAssertedType(node8, jSTypeRegistry33);
        node8.setWasEmptyNode(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(staticSourceFile10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertNull(jSType51);
        org.junit.Assert.assertNull(jSType54);
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03830");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function (): {606806609}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(function (): {606806609})" + "'", str1, "(function (): {606806609})");
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03831");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        com.google.javascript.rhino.InputId inputId6 = node1.getInputId();
        node1.setWasEmptyNode(true);
        boolean boolean9 = node1.isLabel();
        boolean boolean10 = node1.isTry();
        node1.setWasEmptyNode(true);
        node1.setCharno((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = node1.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputId6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03832");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(1, "{proxy:function (): {601366929}}", 38, 39);
        com.google.javascript.rhino.Node node5 = node4.cloneNode();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03833");
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
        java.lang.String str39 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node32);
        com.google.javascript.rhino.Node node40 = node32.getLastSibling();
        boolean boolean41 = node32.isNew();
        boolean boolean42 = node32.isReturn();
        node32.setCharno(46);
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
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03834");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj6 = node4.getProp((int) (byte) 10);
        boolean boolean7 = node4.isGetProp();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((int) (byte) 10, node4, 14, 44);
        com.google.javascript.rhino.Node node11 = node10.removeChildren();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03835");
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
        // The following exception was thrown during execution in test generation
        try {
            double double23 = node14.getDouble();
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
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03836");
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
        boolean boolean54 = jSType53.isArrayType();
        com.google.javascript.rhino.jstype.EnumType enumType55 = jSType53.toMaybeEnumType();
        boolean boolean56 = jSType53.isTemplateType();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(enumType55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03837");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = null;
        jSDocInfo0.setVisibility(visibility3);
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        java.lang.String str6 = jSDocInfo0.getLendsName();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        boolean boolean8 = jSDocInfo0.isNoSideEffects();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str10 = jSDocInfo0.getFileOverview();
        java.lang.String str11 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03838");
        java.io.IOException iOException2 = new java.io.IOException("Not declared as a type name");
        java.io.IOException iOException4 = new java.io.IOException("Not declared as a type name");
        java.io.IOException iOException5 = new java.io.IOException();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException(throwable7);
        java.lang.Throwable[] throwableArray9 = iOException8.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        iOException8.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable throwable13 = null;
        java.io.IOException iOException14 = new java.io.IOException(throwable13);
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException();
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        iOException14.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Throwable[] throwableArray19 = iOException17.getSuppressed();
        java.lang.Throwable throwable20 = null;
        java.io.IOException iOException21 = new java.io.IOException(throwable20);
        java.lang.Throwable[] throwableArray22 = iOException21.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException("");
        java.io.IOException iOException26 = new java.io.IOException("");
        java.lang.Throwable throwable28 = null;
        java.io.IOException iOException29 = new java.io.IOException(throwable28);
        java.lang.Throwable[] throwableArray30 = iOException29.getSuppressed();
        java.io.IOException iOException31 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException29);
        java.lang.Throwable[] throwableArray32 = iOException29.getSuppressed();
        java.lang.Throwable throwable34 = null;
        java.io.IOException iOException35 = new java.io.IOException(throwable34);
        java.lang.Throwable[] throwableArray36 = iOException35.getSuppressed();
        java.io.IOException iOException37 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException35);
        com.google.common.collect.ImmutableList<java.lang.Throwable> throwableList38 = com.google.common.collect.ImmutableList.of((java.lang.Throwable) iOException2, (java.lang.Throwable) iOException4, (java.lang.Throwable) iOException6, (java.lang.Throwable) iOException11, (java.lang.Throwable) iOException17, (java.lang.Throwable) iOException21, (java.lang.Throwable) iOException24, (java.lang.Throwable) iOException26, (java.lang.Throwable) iOException29, (java.lang.Throwable) iOException35);
        java.lang.Throwable[] throwableArray39 = iOException35.getSuppressed();
        java.lang.Throwable[] throwableArray40 = iOException35.getSuppressed();
        java.lang.Throwable[] throwableArray41 = iOException35.getSuppressed();
        java.io.IOException iOException42 = new java.io.IOException("function (): {281944583}", (java.lang.Throwable) iOException35);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableList38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03839");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((int) (short) 100, node2, 49, (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = node2.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        node9.setStaticSourceFile(staticSourceFile10);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        node13.putIntProp((-1), 35);
        boolean boolean17 = node13.isStringKey();
        boolean boolean18 = node13.isThrow();
        int int19 = node13.getLineno();
        boolean boolean20 = node13.hasChildren();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(32, node23);
        boolean boolean28 = node23.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node29 = node13.useSourceInfoIfMissingFromForTree(node23);
        boolean boolean30 = node29.isIn();
        int int31 = node29.getLength();
        boolean boolean32 = node29.isThis();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(32, node35);
        com.google.javascript.rhino.Node node40 = node29.copyInformationFromForTree(node39);
        com.google.javascript.rhino.Node node41 = node9.srcrefTree(node39);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isReturn();
        com.google.javascript.rhino.InputId inputId48 = node43.getInputId();
        node43.setWasEmptyNode(true);
        boolean boolean51 = node43.isLabel();
        node41.addChildToFront(node43);
        com.google.javascript.rhino.Node node53 = node43.getNext();
        boolean boolean54 = node43.wasEmptyNode();
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(inputId48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03840");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(23);
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03841");
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable26 = node24.siblings();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeIterable26);
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03842");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = null;
        jSDocInfo0.setVisibility(visibility3);
        boolean boolean5 = jSDocInfo0.isExport();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo0.getMarkers();
        java.lang.String str7 = jSDocInfo0.getReturnDescription();
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(markerCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03843");
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
        java.lang.String str95 = node94.getQualifiedName();
        boolean boolean96 = node94.isGetterDef();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = node94.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03844");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(32, node2);
        boolean boolean7 = node6.isGetterDef();
        boolean boolean8 = node6.isLabel();
        com.google.javascript.rhino.Node node9 = node6.cloneTree();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03845");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot58 = functionType56.getOwnSlot("(Not declared as a type name)");
        java.lang.String str59 = functionType56.getReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType60 = functionType56.getReturnType();
        com.google.javascript.rhino.ErrorReporter errorReporter61 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter61, true);
        com.google.javascript.rhino.jstype.JSType jSType65 = null;
        jSTypeRegistry63.unregisterPropertyOnType("(Not declared as a type name)", jSType65);
        com.google.javascript.rhino.jstype.JSType jSType67 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray69 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType70 = jSTypeRegistry63.createFunctionType(jSType67, true, jSTypeArray69);
        com.google.javascript.rhino.jstype.JSType jSType71 = functionType70.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = functionType70.toObjectType();
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.ErrorReporter errorReporter74 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry76 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter74, true);
        com.google.javascript.rhino.jstype.JSType jSType78 = null;
        jSTypeRegistry76.unregisterPropertyOnType("(Not declared as a type name)", jSType78);
        com.google.javascript.rhino.ErrorReporter errorReporter80 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry82 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter80, true);
        com.google.javascript.rhino.jstype.JSType jSType84 = null;
        jSTypeRegistry82.unregisterPropertyOnType("(Not declared as a type name)", jSType84);
        com.google.javascript.rhino.jstype.JSType jSType86 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray88 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType89 = jSTypeRegistry82.createFunctionType(jSType86, true, jSTypeArray88);
        boolean boolean91 = functionType89.removeProperty("false");
        boolean boolean92 = functionType89.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType93 = jSTypeRegistry76.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType89);
        com.google.javascript.rhino.jstype.JSType jSType94 = functionType70.forceResolve(errorReporter73, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType89);
        com.google.javascript.rhino.jstype.ObjectType objectType95 = functionType89.getImplicitPrototype();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair96 = functionType56.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType89);
        java.lang.String str97 = functionType89.getReferenceName();
        com.google.javascript.rhino.jstype.FunctionType functionType98 = functionType89.getOwnerFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType99 = functionType89.getImplicitPrototype();
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
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "function (): {1863590168}" + "'", str52, "function (): {1863590168}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNull(jSTypeStaticSlot58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertNotNull(jSTypeArray69);
        org.junit.Assert.assertNotNull(functionType70);
        org.junit.Assert.assertNotNull(jSType71);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertNotNull(jSTypeArray88);
        org.junit.Assert.assertNotNull(functionType89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jSType93);
        org.junit.Assert.assertNotNull(jSType94);
        org.junit.Assert.assertNotNull(objectType95);
        org.junit.Assert.assertNotNull(typePair96);
        org.junit.Assert.assertNull(str97);
        org.junit.Assert.assertNull(functionType98);
        org.junit.Assert.assertNotNull(objectType99);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03846");
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
            com.google.javascript.rhino.Node node93 = new com.google.javascript.rhino.Node((int) (short) 0, nodeArray89, (int) 'a', (-1));
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
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03847");
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
        boolean boolean51 = functionType22.isObject();
        com.google.javascript.rhino.ErrorReporter errorReporter52 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry54 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter52, true);
        com.google.javascript.rhino.jstype.JSType jSType56 = null;
        jSTypeRegistry54.unregisterPropertyOnType("(Not declared as a type name)", jSType56);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray60 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType61 = jSTypeRegistry54.createFunctionType(jSType58, true, jSTypeArray60);
        boolean boolean63 = functionType61.removeProperty("false");
        boolean boolean64 = functionType61.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType65 = functionType61.getPrototype();
        boolean boolean66 = objectType65.isVoidType();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = functionType22.testForEquality((com.google.javascript.rhino.jstype.JSType) objectType65);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = ternaryValue68.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = ternaryValue68.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = ternaryValue71.not();
        boolean boolean74 = ternaryValue71.toBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = ternaryValue71.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = ternaryValue68.or(ternaryValue75);
        java.lang.String str77 = ternaryValue76.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue78 = ternaryValue67.or(ternaryValue76);
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jSTypeArray60);
        org.junit.Assert.assertNotNull(functionType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(objectType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(ternaryValue71);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "true" + "'", str77, "true");
        org.junit.Assert.assertNotNull(ternaryValue78);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03848");
        java.io.IOException iOException1 = new java.io.IOException("function (): {281944583}");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03849");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = functionType9.removeProperty("false");
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType9.findPropertyType("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType.Property property15 = functionType9.getSlot("Not declared as a type name");
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        boolean boolean27 = functionType25.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry31.createFunctionType(jSType35, true, jSTypeArray37);
        boolean boolean40 = functionType38.removeProperty("false");
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        node42.putIntProp((-1), 35);
        boolean boolean46 = node42.isStringKey();
        boolean boolean47 = node42.isThrow();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj53 = node51.getProp((int) (byte) 10);
        boolean boolean54 = node42.isEquivalentToTyped(node51);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(32, node57);
        boolean boolean62 = node61.isInstanceOf();
        com.google.javascript.rhino.Node node63 = node51.useSourceInfoFromForTree(node61);
        boolean boolean64 = node61.isDo();
        boolean boolean65 = functionType25.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType38, node61);
        java.lang.Iterable iterable66 = functionType25.getCtorExtendedInterfaces();
        boolean boolean67 = functionType25.isBooleanValueType();
        boolean boolean68 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType25);
        boolean boolean70 = functionType9.isPropertyTypeDeclared("Unknown class name");
        boolean boolean71 = functionType9.isNativeObjectType();
        com.google.javascript.rhino.jstype.ObjectType objectType72 = functionType9.getImplicitPrototype();
        boolean boolean73 = objectType72.isInterface();
        boolean boolean74 = objectType72.matchesStringContext();
        boolean boolean75 = objectType72.isInstanceType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(property15);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(iterable66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(objectType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03850");
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
        boolean boolean52 = parameterizedType48.isNoResolvedType();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType53 = parameterizedType48.toMaybeParameterizedType();
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
        org.junit.Assert.assertNotNull(parameterizedType53);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03851");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = node41.isWith();
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
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03852");
        com.google.javascript.rhino.InputId inputId1 = new com.google.javascript.rhino.InputId("true");
        java.lang.String str2 = inputId1.toString();
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
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        boolean boolean40 = node39.isInstanceOf();
        node32.addChildrenToFront(node39);
        java.lang.String str42 = com.google.javascript.jscomp.NodeUtil.getSourceName(node39);
        boolean boolean43 = node39.isArrayLit();
        boolean boolean44 = inputId1.equals((java.lang.Object) node39);
        java.lang.String str45 = inputId1.getIdName();
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList52 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray51);
        java.lang.String str53 = charSequenceList52.toString();
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "[hi!, hi!, , , hi!]", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList57 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57, charSequenceArray56);
        boolean boolean59 = charSequenceList52.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList57);
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream60 = charSequenceList57.stream();
        boolean boolean61 = inputId1.equals((java.lang.Object) charSequenceStream60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "InputId: true" + "'", str2, "InputId: true");
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "true" + "'", str45, "true");
        org.junit.Assert.assertNotNull(charSequenceArray51);
        org.junit.Assert.assertNotNull(charSequenceList52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[hi!, hi!, , , hi!]" + "'", str53, "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(charSequenceStream60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03853");
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
        functionType9.clearCachedValues();
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
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03854");
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
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType17 = functionType9.toMaybeParameterizedType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = parameterizedType17.isFunctionPrototypeType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(parameterizedType17);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03855");
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
        boolean boolean62 = functionType9.matchesNumberContext();
        boolean boolean63 = functionType9.isParameterizedType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet64 = functionType9.getPossibleToBooleanOutcomes();
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
        com.google.javascript.rhino.jstype.JSType jSType78 = functionType74.restrictByNotNullOrUndefined();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable79 = functionType74.getAllExtendedInterfaces();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair80 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType74);
        com.google.javascript.rhino.jstype.JSType jSType81 = typePair80.typeB;
        com.google.javascript.rhino.jstype.JSType jSType82 = typePair80.typeB;
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
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet64 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet64.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSTypeArray73);
        org.junit.Assert.assertNotNull(functionType74);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "function (): ?" + "'", str76, "function (): ?");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(jSType78);
        org.junit.Assert.assertNotNull(objectTypeIterable79);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(jSType82);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03856");
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
        boolean boolean54 = parameterizedType48.isUnknownType();
        com.google.javascript.rhino.jstype.EnumType enumType55 = parameterizedType48.toMaybeEnumType();
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
        org.junit.Assert.assertNull(enumType55);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03857");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnEndLine();
        int int2 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03858");
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
        com.google.javascript.rhino.Node node79 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj85 = node83.getProp((int) (byte) 10);
        int int86 = node79.getIndexOfChild(node83);
        com.google.javascript.rhino.jstype.ObjectType objectType87 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType88 = jSTypeRegistry2.createObjectType("hi!", node83, objectType87);
        boolean boolean90 = jSTypeRegistry2.isForwardDeclaredType("{proxy:function (): {236340925}}");
        com.google.javascript.rhino.jstype.JSType jSType92 = jSTypeRegistry2.getType("function (): {2043518633}");
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
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNull(jSType92);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03859");
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
        java.lang.Iterable iterable68 = functionType27.getCtorExtendedInterfaces();
        boolean boolean69 = functionType27.isBooleanValueType();
        boolean boolean70 = functionType27.matchesInt32Context();
        com.google.javascript.rhino.jstype.JSType jSType71 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType27);
        jSTypeRegistry2.resetForTypeCheck();
        jSTypeRegistry2.clearNamedTypes();
        com.google.javascript.rhino.jstype.JSType jSType74 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry2.createDefaultObjectUnion(jSType74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(objectTypeIterable11);
        org.junit.Assert.assertTrue("'" + resolveMode12 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode12.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode13 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode13.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode14 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode14.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode15 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode15.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList16);
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
        org.junit.Assert.assertNotNull(iterable68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jSType71);
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03860");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType11 = functionType9.toMaybeEnumType();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = functionType9.toMaybeFunctionType();
        java.util.List<com.google.javascript.rhino.jstype.FunctionType> functionTypeList13 = functionType12.getSubTypes();
        boolean boolean14 = functionType12.isAllType();
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType12.getPropertyType("");
        com.google.javascript.rhino.Node node20 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean21 = node20.isEmpty();
        boolean boolean22 = jSType16.equals((java.lang.Object) boolean21);
        boolean boolean23 = jSType16.isConstructor();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNull(enumType11);
        org.junit.Assert.assertNotNull(functionType12);
        org.junit.Assert.assertNull(functionTypeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jSType16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03861");
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
        boolean boolean88 = parameterizedType48.isUnknownType();
        boolean boolean89 = parameterizedType48.isNominalType();
        boolean boolean90 = parameterizedType48.isNativeObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03862");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node34 = node18.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03863");
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
        node3.setLineno(54);
        boolean boolean59 = node3.isAnd();
        boolean boolean60 = node3.hasMoreThanOneChild();
        boolean boolean61 = node3.isIn();
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03864");
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
        int int35 = functionType21.getMinArguments();
        boolean boolean36 = functionType21.hasReferenceName();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03865");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "function (): {1244312112}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03866");
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
        com.google.javascript.rhino.jstype.ObjectType objectType55 = functionType22.getPrototype();
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
        org.junit.Assert.assertNotNull(objectType55);
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03867");
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
        com.google.javascript.rhino.jstype.JSType jSType84 = enumType81.getPropertyType("function (): {542283849}");
        com.google.javascript.rhino.jstype.ObjectType objectType85 = enumType81.getImplicitPrototype();
        boolean boolean87 = enumType81.isPropertyTypeDeclared("function (): {581361697}");
        boolean boolean89 = enumType81.isPropertyTypeInferred("function (): ?.<function (): ?>");
        com.google.javascript.rhino.JSDocInfo jSDocInfo91 = enumType81.getOwnPropertyJSDocInfo("function (): {1825464447}");
        java.lang.String str92 = enumType81.getReferenceName();
        boolean boolean94 = enumType81.isPropertyTypeInferred("function (): {394543515}");
        java.util.Set<java.lang.String> strSet95 = enumType81.getElements();
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
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(objectType85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(jSDocInfo91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "enum{{proxy:function (): {63549204}}}" + "'", str92, "enum{{proxy:function (): {63549204}}}");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(strSet95);
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03868");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        java.lang.String str10 = jSDocInfo0.getMeaning();
        java.lang.String str11 = jSDocInfo0.getMeaning();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getParameterNames();
        boolean boolean13 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean14 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03869");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(0);
        node4.putIntProp((-1), 35);
        boolean boolean8 = node4.isStringKey();
        boolean boolean9 = node4.isThrow();
        com.google.javascript.rhino.Node node10 = node2.useSourceInfoFrom(node4);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        node4.setJSType(jSType11);
        node4.detachChildren();
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
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        boolean boolean34 = node33.isInstanceOf();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node(0);
        node36.putIntProp((-1), 35);
        boolean boolean40 = node36.isStringKey();
        boolean boolean41 = node36.isThrow();
        boolean boolean42 = node36.isEmpty();
        com.google.javascript.rhino.Node node43 = node33.useSourceInfoFrom(node36);
        boolean boolean44 = node36.isNE();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node(31, node4, node17, node36);
        com.google.javascript.rhino.Node node47 = node36.getAncestor(0);
        com.google.javascript.rhino.Node node48 = node36.getLastSibling();
        com.google.javascript.rhino.InputId inputId49 = node48.getInputId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNull(inputId49);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03870");
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
        com.google.javascript.rhino.jstype.JSType jSType31 = functionType30.autoboxesTo();
        boolean boolean32 = jSTypeRegistry2.declareType("JSDocInfo", (com.google.javascript.rhino.jstype.JSType) functionType30);
        boolean boolean33 = jSTypeRegistry2.shouldTolerateUndefinedValues();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03871");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str3 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.isDefine();
        jSDocInfo0.addSuppression("function (): {848299148}");
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03872");
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
        boolean boolean16 = functionType9.isNullType();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType18 = functionType9.getTopMostDefiningType("function (): {1116489338}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03873");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.hasTypedefType();
        java.lang.String str3 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03874");
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
        boolean boolean25 = node23.isFalse();
        com.google.javascript.rhino.InputId inputId27 = new com.google.javascript.rhino.InputId("NUMBER 0.0 100\n");
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
        java.lang.String str78 = functionType50.getReferenceName();
        boolean boolean79 = inputId27.equals((java.lang.Object) str78);
        node23.setInputId(inputId27);
        com.google.javascript.rhino.JSDocInfo jSDocInfo81 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean82 = jSDocInfo81.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression83 = jSDocInfo81.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility84 = null;
        jSDocInfo81.setVisibility(visibility84);
        boolean boolean86 = jSDocInfo81.isExport();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection87 = jSDocInfo81.getMarkers();
        java.util.Collection<java.lang.String> strCollection88 = jSDocInfo81.getAuthors();
        jSDocInfo81.setDeprecated(false);
        boolean boolean91 = jSDocInfo81.isDeprecated();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility92 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo81.setVisibility(visibility92);
        boolean boolean94 = inputId27.equals((java.lang.Object) jSDocInfo81);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression95 = jSDocInfo81.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
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
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(jSTypeExpression83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(markerCollection87);
        org.junit.Assert.assertNull(strCollection88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + visibility92 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility92.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(jSTypeExpression95);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03875");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType34 = functionType21.cloneWithoutArrowType();
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
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertNotNull(jSType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03876");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException(throwable2);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("function (): {2129138287}", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray6 = iOException3.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("{proxy:function (): {1827758248}}", (java.lang.Throwable) iOException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03877");
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
        com.google.javascript.rhino.jstype.ObjectType objectType28 = functionType15.getParentScope();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(objectType28);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03878");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean83 = jSDocInfo82.hasThisType();
        boolean boolean84 = jSDocInfo82.shouldPreserveTry();
        boolean boolean85 = jSDocInfo82.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression87 = jSDocInfo82.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean88 = jSDocInfo82.shouldPreserveTry();
        com.google.javascript.rhino.Node node90 = new com.google.javascript.rhino.Node(0);
        boolean boolean91 = node90.isCall();
        com.google.javascript.rhino.Node node92 = node90.cloneTree();
        boolean boolean93 = node90.isNull();
        jSDocInfo82.setAssociatedNode(node90);
        java.lang.String str96 = jSDocInfo82.getDescriptionForParameter("InputId: NUMBER 0.0 100\n");
        functionType21.setPropertyJSDocInfo("function (): {1657069676}", jSDocInfo82);
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
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(jSTypeExpression87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03879");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList2 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList2, charSequenceArray1);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator4 = charSequenceList2.spliterator();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream5 = charSequenceList2.stream();
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList12 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray11);
        boolean boolean13 = charSequenceList2.retainAll((java.util.Collection<java.lang.CharSequence>) charSequenceList12);
        boolean boolean14 = charSequenceList12.isEmpty();
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList21 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray20);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList24 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24, charSequenceArray23);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator26 = charSequenceList24.spliterator();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node(0);
        node29.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(32, node29);
        boolean boolean34 = node33.isGetterDef();
        boolean boolean35 = charSequenceList24.equals((java.lang.Object) boolean34);
        boolean boolean37 = charSequenceList24.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean38 = charSequenceList21.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList24);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList39 = charSequenceList21.asList();
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList46 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray45);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList53 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray52);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList56 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56, charSequenceArray55);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator58 = charSequenceList56.spliterator();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(0);
        node61.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(32, node61);
        boolean boolean66 = node65.isGetterDef();
        boolean boolean67 = charSequenceList56.equals((java.lang.Object) boolean66);
        boolean boolean69 = charSequenceList56.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean70 = charSequenceList53.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList56);
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor71 = charSequenceList53.listIterator();
        boolean boolean72 = charSequenceList46.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor73 = charSequenceList53.listIterator();
        boolean boolean74 = charSequenceList39.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = charSequenceList12.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList53);
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
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceList21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(charSequenceList39);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceList46);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceList53);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(charSequenceItor71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(charSequenceItor73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03880");
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
        boolean boolean54 = functionType22.matchesNumberContext();
        boolean boolean55 = functionType22.matchesNumberContext();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03881");
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
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        node15.putIntProp((-1), 35);
        boolean boolean19 = node15.isStringKey();
        boolean boolean20 = node15.isThrow();
        boolean boolean21 = node15.isDelProp();
        namePosition0.setItem(node15);
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition23 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(0);
        node27.putIntProp((-1), 35);
        boolean boolean31 = node27.isStringKey();
        boolean boolean32 = node27.isThrow();
        com.google.javascript.rhino.Node node33 = node25.useSourceInfoFrom(node27);
        namePosition23.setItem(node25);
        int int35 = namePosition23.getPositionOnStartLine();
        int int36 = namePosition23.getPositionOnEndLine();
        int int37 = namePosition23.getEndLine();
        int int38 = namePosition23.getPositionOnStartLine();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition39 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node43.isStringKey();
        boolean boolean48 = node43.isThrow();
        com.google.javascript.rhino.Node node49 = node41.useSourceInfoFrom(node43);
        namePosition39.setItem(node41);
        int int51 = namePosition39.getPositionOnStartLine();
        com.google.javascript.rhino.Node node52 = namePosition39.getItem();
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition53 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node54 = namePosition53.getItem();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.NamePosition> namePositionList55 = com.google.common.collect.ImmutableList.of(namePosition0, namePosition23, namePosition39, namePosition53);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(namePositionList55);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03882");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(4, 48, 43);
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03883");
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
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        boolean boolean31 = node30.isCall();
        boolean boolean32 = node30.isDefaultCase();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        boolean boolean35 = node34.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node34.getStaticSourceFile();
        node34.setLineno((int) '4');
        com.google.javascript.rhino.Node node39 = node30.srcref(node34);
        int int40 = node34.getCharno();
        boolean boolean41 = node34.isComma();
        boolean boolean42 = node34.isDefaultCase();
        boolean boolean43 = node34.isQuotedString();
        functionType21.setSource(node34);
        boolean boolean45 = node34.isLabelName();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        node49.putIntProp((-1), 35);
        boolean boolean53 = node49.isStringKey();
        boolean boolean54 = node49.isThrow();
        com.google.javascript.rhino.Node node55 = node47.useSourceInfoFrom(node49);
        boolean boolean56 = node55.isIn();
        boolean boolean57 = node55.isVoid();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0);
        boolean boolean60 = node59.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile61 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node59);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(0);
        node63.putIntProp((-1), 35);
        boolean boolean67 = node63.isReturn();
        com.google.javascript.rhino.InputId inputId68 = node63.getInputId();
        node63.setWasEmptyNode(true);
        boolean boolean71 = node63.isLabel();
        boolean boolean72 = node63.isTry();
        com.google.javascript.rhino.Node node73 = node59.srcref(node63);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(0);
        node75.putIntProp((-1), 35);
        boolean boolean79 = node75.isStringKey();
        boolean boolean80 = node75.isThrow();
        int int81 = node75.getLineno();
        boolean boolean82 = node75.hasChildren();
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(0);
        node85.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node(32, node85);
        boolean boolean90 = node85.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node91 = node75.useSourceInfoIfMissingFromForTree(node85);
        boolean boolean92 = node63.hasChild(node75);
        com.google.javascript.rhino.Node node93 = node55.copyInformationFrom(node63);
        boolean boolean94 = node55.isVarArgs();
        node55.setType(40);
        node34.addChildToBack(node55);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(staticSourceFile36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(staticSourceFile61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(inputId68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03884");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("function (): {1825464447}");
        boolean boolean2 = node1.isOr();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03885");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        boolean boolean11 = jSTypeRegistry2.isForwardDeclaredType("function (): ?");
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter13, true);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        jSTypeRegistry15.unregisterPropertyOnType("(Not declared as a type name)", jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray21 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType22 = jSTypeRegistry15.createFunctionType(jSType19, true, jSTypeArray21);
        com.google.common.collect.ImmutableList<java.lang.String> strList23 = functionType22.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot25 = functionType22.getSlot("NUMBER 0.0 100\n");
        boolean boolean26 = functionType22.isAllType();
        boolean boolean28 = functionType22.hasProperty("Not declared as a type name");
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = functionType22.getTemplateTypeNames();
        jSTypeRegistry2.unregisterPropertyOnType("function (): {1617435542}", (com.google.javascript.rhino.jstype.JSType) functionType22);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        jSTypeRegistry33.unregisterPropertyOnType("(Not declared as a type name)", jSType35);
        com.google.javascript.rhino.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter37, true);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        jSTypeRegistry39.unregisterPropertyOnType("(Not declared as a type name)", jSType41);
        com.google.javascript.rhino.jstype.JSType jSType43 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray45 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType46 = jSTypeRegistry39.createFunctionType(jSType43, true, jSTypeArray45);
        boolean boolean48 = functionType46.removeProperty("false");
        boolean boolean49 = functionType46.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType50 = jSTypeRegistry33.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType46);
        boolean boolean52 = functionType46.hasProperty("(Not declared as a type name)");
        com.google.javascript.rhino.Node node53 = functionType46.getParametersNode();
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        boolean boolean64 = functionType63.isReturnTypeInferred();
        boolean boolean65 = functionType46.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType63);
        boolean boolean66 = functionType63.isResolved();
        com.google.javascript.rhino.jstype.JSType jSType68 = functionType63.getPropertyType("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType69 = jSTypeRegistry2.createOptionalType(jSType68);
        com.google.javascript.rhino.ErrorReporter errorReporter71 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry73 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter71, true);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        jSTypeRegistry73.unregisterPropertyOnType("(Not declared as a type name)", jSType75);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray79 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType80 = jSTypeRegistry73.createFunctionType(jSType77, true, jSTypeArray79);
        com.google.javascript.rhino.jstype.JSType jSType81 = functionType80.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.ObjectType objectType82 = functionType80.toObjectType();
        boolean boolean83 = objectType82.isFunctionPrototypeType();
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet84 = objectType82.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType86 = objectType82.getPropertyType("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType87 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) objectType82);
        com.google.javascript.rhino.jstype.ObjectType objectType88 = com.google.javascript.rhino.jstype.ObjectType.cast((com.google.javascript.rhino.jstype.JSType) objectType82);
        jSTypeRegistry2.unregisterPropertyOnType("function (): {1426138447}", (com.google.javascript.rhino.jstype.JSType) objectType82);
        com.google.javascript.rhino.jstype.JSType jSType94 = jSTypeRegistry2.createNamedType("{proxy:function (): {1232890818}}", "PARAM_LIST", 30, 46);
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNull(staticSlot25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(jSTypeArray45);
        org.junit.Assert.assertNotNull(functionType46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jSType50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jSType68);
        org.junit.Assert.assertNotNull(jSType69);
        org.junit.Assert.assertNotNull(jSTypeArray79);
        org.junit.Assert.assertNotNull(functionType80);
        org.junit.Assert.assertNotNull(jSType81);
        org.junit.Assert.assertNotNull(objectType82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet84 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet84.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertNotNull(objectType87);
        org.junit.Assert.assertNotNull(objectType88);
        org.junit.Assert.assertNotNull(jSType94);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03886");
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
        boolean boolean25 = node17.isHook();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean29 = jSDocInfo28.hasThisType();
        boolean boolean30 = jSDocInfo28.shouldPreserveTry();
        boolean boolean31 = jSDocInfo28.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression33 = jSDocInfo28.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean34 = jSDocInfo28.shouldPreserveTry();
        boolean boolean35 = jSDocInfo28.isOverride();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection36 = jSDocInfo28.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = jSDocInfo28.getTypedefType();
        java.lang.String str39 = jSDocInfo28.getDescriptionForParameter("function (): {2129138287}");
        node27.setJSDocInfo(jSDocInfo28);
        boolean boolean41 = node17.isEquivalentTo(node27);
        boolean boolean42 = node17.isNoSideEffectsCall();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder43 = node17.new FileLevelJsDocBuilder();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jSTypeExpression33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(markerCollection36);
        org.junit.Assert.assertNull(jSTypeExpression37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03887");
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
        boolean boolean21 = node15.isIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = node15.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03888");
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
        boolean boolean63 = functionType33.hasDisplayName();
        boolean boolean64 = functionType33.isString();
        com.google.javascript.rhino.jstype.ParameterizedType parameterizedType65 = functionType33.toMaybeParameterizedType();
        boolean boolean66 = functionType33.isArrayType();
        com.google.common.base.Predicate<com.google.javascript.rhino.jstype.JSType> jSTypePredicate67 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = functionType33.setValidator(jSTypePredicate67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(parameterizedType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03889");
        java.lang.String str1 = com.google.javascript.rhino.jstype.ObjectType.createDelegateSuffix("function (): {1617435542}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(function (): {1617435542})" + "'", str1, "(function (): {1617435542})");
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03890");
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
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getTypeOfThis();
        com.google.javascript.rhino.Node node60 = parameterizedType48.getPropertyNode("function (): {301616717}");
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
        org.junit.Assert.assertNull(node60);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03891");
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
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream41 = charSequenceList39.stream();
        java.lang.Object[][] objArray42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray43 = charSequenceList39.toArray(objArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(charSequenceStream41);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03892");
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
        com.google.javascript.rhino.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter34, true);
        com.google.javascript.rhino.jstype.JSType jSType38 = null;
        jSTypeRegistry36.unregisterPropertyOnType("(Not declared as a type name)", jSType38);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray42 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType43 = jSTypeRegistry36.createFunctionType(jSType40, true, jSTypeArray42);
        boolean boolean45 = jSTypeRegistry36.isForwardDeclaredType("function (): ?");
        com.google.javascript.rhino.ErrorReporter errorReporter46 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter46, true);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        jSTypeRegistry48.unregisterPropertyOnType("(Not declared as a type name)", jSType50);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray54 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType55 = jSTypeRegistry48.createFunctionType(jSType52, true, jSTypeArray54);
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType55.autoboxesTo();
        java.lang.String str57 = functionType55.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter58 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter58, true);
        com.google.javascript.rhino.jstype.JSType jSType62 = null;
        jSTypeRegistry60.unregisterPropertyOnType("(Not declared as a type name)", jSType62);
        com.google.javascript.rhino.jstype.JSType jSType64 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray66 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType67 = jSTypeRegistry60.createFunctionType(jSType64, true, jSTypeArray66);
        com.google.common.collect.ImmutableList<java.lang.String> strList68 = functionType67.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot70 = functionType67.getSlot("NUMBER 0.0 100\n");
        boolean boolean71 = functionType67.isAllType();
        boolean boolean72 = functionType55.hasEqualCallType(functionType67);
        com.google.javascript.rhino.ErrorReporter errorReporter73 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry75 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter73, true);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        jSTypeRegistry75.unregisterPropertyOnType("(Not declared as a type name)", jSType77);
        com.google.javascript.rhino.jstype.JSType jSType79 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray81 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType82 = jSTypeRegistry75.createFunctionType(jSType79, true, jSTypeArray81);
        com.google.javascript.rhino.jstype.FunctionType functionType83 = jSTypeRegistry36.createFunctionType((com.google.javascript.rhino.jstype.JSType) functionType55, jSTypeArray81);
        boolean boolean85 = functionType55.hasOwnProperty("Unknown class name");
        java.util.Set<java.lang.String> strSet86 = functionType55.getOwnPropertyNames();
        node3.putProp(2, (java.lang.Object) strSet86);
        com.google.javascript.rhino.InputId inputId88 = node3.getInputId();
        boolean boolean89 = node3.isGetProp();
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
        org.junit.Assert.assertNotNull(jSTypeArray42);
        org.junit.Assert.assertNotNull(functionType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSTypeArray54);
        org.junit.Assert.assertNotNull(functionType55);
        org.junit.Assert.assertNull(jSType56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(jSTypeArray66);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNull(staticSlot70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jSTypeArray81);
        org.junit.Assert.assertNotNull(functionType82);
        org.junit.Assert.assertNotNull(functionType83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNull(inputId88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03893");
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
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative20 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec21 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("", jSTypeNative20);
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        boolean boolean24 = node23.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile25 = node23.getStaticSourceFile();
        com.google.javascript.rhino.Node node26 = node23.getNext();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node(0);
        node28.putIntProp((-1), 35);
        boolean boolean32 = node28.isStringKey();
        boolean boolean33 = node28.isThrow();
        boolean boolean34 = node28.isEmpty();
        com.google.javascript.rhino.Node node35 = node23.copyInformationFrom(node28);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(0);
        node39.putIntProp((-1), 35);
        boolean boolean43 = node39.isStringKey();
        boolean boolean44 = node39.isThrow();
        com.google.javascript.rhino.Node node45 = node37.useSourceInfoFrom(node39);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        boolean boolean48 = node47.isCall();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        boolean boolean55 = node51.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList56 = com.google.common.collect.ImmutableList.of((java.lang.Object) node23, (java.lang.Object) node39, (java.lang.Object) node47, (java.lang.Object) 53, (java.lang.Object) node51);
        com.google.javascript.rhino.Node node57 = assertionFunctionSpec21.getAssertedParam(node51);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(0);
        boolean boolean60 = node59.isCall();
        boolean boolean61 = node59.isThrow();
        boolean boolean62 = node59.isExprResult();
        com.google.javascript.rhino.ErrorReporter errorReporter63 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter63);
        com.google.javascript.rhino.jstype.JSType jSType65 = assertionFunctionSpec21.getAssertedType(node59, jSTypeRegistry64);
        com.google.javascript.rhino.Node node66 = node1.copyInformationFrom(node59);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0);
        boolean boolean69 = node68.isCall();
        boolean boolean70 = node68.isDefaultCase();
        int int71 = node68.getChildCount();
        com.google.javascript.rhino.Node node72 = node68.getNext();
        // The following exception was thrown during execution in test generation
        try {
            node1.addChildToFront(node72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(staticSourceFile25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objList56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jSType65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node72);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03894");
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
        int int53 = functionType22.getMaxArguments();
        boolean boolean54 = functionType22.isStringValueType();
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
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "function (): {1791358850}" + "'", str52, "function (): {1791358850}");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03895");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList6 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray5);
        java.lang.String str7 = charSequenceList6.toString();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "[hi!, hi!, , , hi!]", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList11 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11, charSequenceArray10);
        boolean boolean13 = charSequenceList6.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList11);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor14 = charSequenceList6.listIterator();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream15 = charSequenceList6.stream();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceList6.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!, hi!, , , hi!]" + "'", str7, "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charSequenceItor14);
        org.junit.Assert.assertNotNull(charSequenceStream15);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03896");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSTypeNative jSTypeNative11 = null;
        com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec assertionFunctionSpec12 = new com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec("Not declared as a type name", jSTypeNative11);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        node16.putIntProp((-1), 35);
        boolean boolean20 = node16.isStringKey();
        boolean boolean21 = node16.isThrow();
        com.google.javascript.rhino.Node node22 = node14.useSourceInfoFrom(node16);
        boolean boolean23 = node22.isIn();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry26 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter24, true);
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        jSTypeRegistry26.unregisterPropertyOnType("(Not declared as a type name)", jSType28);
        com.google.javascript.rhino.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter30, true);
        com.google.javascript.rhino.jstype.JSType jSType34 = null;
        jSTypeRegistry32.unregisterPropertyOnType("(Not declared as a type name)", jSType34);
        com.google.javascript.rhino.jstype.JSType jSType36 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray38 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType39 = jSTypeRegistry32.createFunctionType(jSType36, true, jSTypeArray38);
        boolean boolean41 = functionType39.removeProperty("false");
        boolean boolean42 = functionType39.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType43 = jSTypeRegistry26.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType39);
        com.google.javascript.rhino.jstype.JSType jSType44 = assertionFunctionSpec12.getAssertedType(node22, jSTypeRegistry26);
        jSTypeRegistry26.identifyNonNullableName("java.io.IOException");
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray47 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.Node node48 = jSTypeRegistry26.createOptionalParameters(jSTypeArray47);
        com.google.javascript.rhino.Node node49 = jSTypeRegistry2.createOptionalParameters(jSTypeArray47);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node(0);
        boolean boolean53 = node52.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile54 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node52);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0);
        node56.putIntProp((-1), 35);
        boolean boolean60 = node56.isReturn();
        com.google.javascript.rhino.InputId inputId61 = node56.getInputId();
        node56.setWasEmptyNode(true);
        boolean boolean64 = node56.isLabel();
        boolean boolean65 = node56.isTry();
        com.google.javascript.rhino.Node node66 = node52.srcref(node56);
        boolean boolean67 = node52.isRegExp();
        com.google.javascript.rhino.Node node68 = node52.removeChildren();
        com.google.javascript.rhino.ErrorReporter errorReporter69 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry71 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter69, true);
        com.google.javascript.rhino.jstype.JSType jSType73 = null;
        jSTypeRegistry71.unregisterPropertyOnType("(Not declared as a type name)", jSType73);
        com.google.javascript.rhino.jstype.JSType jSType75 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray77 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType78 = jSTypeRegistry71.createFunctionType(jSType75, true, jSTypeArray77);
        com.google.common.collect.ImmutableList<java.lang.String> strList79 = functionType78.getTemplateTypeNames();
        boolean boolean80 = functionType78.isReturnTypeInferred();
        com.google.javascript.rhino.jstype.ObjectType objectType81 = jSTypeRegistry2.createObjectType("function (): {726684091}", node68, (com.google.javascript.rhino.jstype.ObjectType) functionType78);
        java.lang.String str82 = objectType81.getDisplayName();
        java.lang.String str83 = objectType81.getDisplayName();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSTypeArray38);
        org.junit.Assert.assertNotNull(functionType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSType43);
        org.junit.Assert.assertNull(jSType44);
        org.junit.Assert.assertNotNull(jSTypeArray47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(staticSourceFile54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(inputId61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(jSTypeArray77);
        org.junit.Assert.assertNotNull(functionType78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(objectType81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "function " + "'", str82, "function ");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "function " + "'", str83, "function ");
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03897");
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
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.jstype.JSType> jSTypeList83 = com.google.common.collect.ImmutableList.of((com.google.javascript.rhino.jstype.JSType) functionType9);
        com.google.javascript.rhino.jstype.JSType jSType85 = functionType9.getPropertyType("{proxy:function (): {1473811039}}");
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
        org.junit.Assert.assertNotNull(jSTypeList83);
        org.junit.Assert.assertNotNull(jSType85);
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03898");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.setMutatesGlobalState();
        sideEffectFlags1.setMutatesThis();
        int int4 = sideEffectFlags1.valueOf();
        sideEffectFlags1.setThrows();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesArguments();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03899");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        com.google.javascript.rhino.Node node7 = node1.getNext();
        node1.putIntProp(53, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = node1.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03900");
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
        node25.setLength((int) (byte) 1);
        boolean boolean34 = node25.isString();
        boolean boolean35 = node25.isFor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression37 = new com.google.javascript.rhino.JSTypeExpression(node25, "");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03901");
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
        boolean boolean68 = functionType35.isRegexpType();
        boolean boolean69 = functionType35.isInstanceType();
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03902");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidSimpleName("{proxy:function (): {879247742}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03903");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        boolean boolean3 = node1.isDefaultCase();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        boolean boolean6 = node5.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node5.getStaticSourceFile();
        node5.setLineno((int) '4');
        com.google.javascript.rhino.Node node10 = node1.srcref(node5);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node1);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        boolean boolean14 = node13.isCall();
        boolean boolean15 = node13.isDefaultCase();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(46);
        com.google.javascript.rhino.Node node18 = node13.copyInformationFromForTree(node17);
        boolean boolean19 = node17.isOptionalArg();
        int int20 = node1.getIndexOfChild(node17);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder21 = node17.getJsDocBuilderForNode();
        // The following exception was thrown during execution in test generation
        try {
            node17.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(staticSourceFile7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(staticSourceFile11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder21);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03904");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property22 = functionType19.getSlot("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean24 = jSDocInfo23.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean28 = jSDocInfo27.hasThisType();
        boolean boolean29 = jSDocInfo27.shouldPreserveTry();
        boolean boolean30 = jSDocInfo27.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList31 = jSDocInfo27.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = jSDocInfo32.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility35 = null;
        jSDocInfo32.setVisibility(visibility35);
        boolean boolean37 = jSDocInfo32.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean39 = jSDocInfo38.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression40 = jSDocInfo38.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility41 = null;
        jSDocInfo38.setVisibility(visibility41);
        boolean boolean43 = jSDocInfo38.isExport();
        java.lang.String str44 = jSDocInfo38.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = jSDocInfo45.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility48 = null;
        jSDocInfo45.setVisibility(visibility48);
        boolean boolean50 = jSDocInfo45.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList51 = com.google.common.collect.ImmutableList.of(jSDocInfo23, jSDocInfo25, jSDocInfo26, jSDocInfo27, jSDocInfo32, jSDocInfo38, jSDocInfo45);
        java.lang.String str52 = jSDocInfo23.getLendsName();
        jSDocInfo23.setDeprecated(true);
        functionType19.setJSDocInfo(jSDocInfo23);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        jSTypeRegistry58.unregisterPropertyOnType("(Not declared as a type name)", jSType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        jSTypeRegistry64.unregisterPropertyOnType("(Not declared as a type name)", jSType66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType(jSType68, true, jSTypeArray70);
        boolean boolean73 = functionType71.removeProperty("false");
        boolean boolean74 = functionType71.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry58.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair76 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean78 = functionType71.isFunctionType();
        com.google.javascript.rhino.jstype.JSType jSType79 = functionType71.collapseUnion();
        com.google.javascript.rhino.jstype.JSType jSType80 = functionType71.getParameterType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(property22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSTypeExpression34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(jSTypeExpression40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(jSTypeExpression47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jSType79);
        org.junit.Assert.assertNull(jSType80);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03905");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        jSDocInfo0.setDeprecated(false);
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
        int int11 = jSDocInfo0.getExtendedInterfacesCount();
        int int12 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03906");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = functionType13.getParentScope();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "function (): ?" + "'", str14, "function (): ?");
        org.junit.Assert.assertNotNull(jSTypeStaticScope15);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03907");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot12 = functionType9.getSlot("NUMBER 0.0 100\n");
        boolean boolean13 = functionType9.hasReferenceName();
        com.google.javascript.rhino.jstype.JSType jSType15 = functionType9.getRestrictedTypeGivenToBooleanOutcome(false);
        boolean boolean16 = functionType9.hasCachedValues();
        com.google.javascript.rhino.jstype.FunctionType functionType17 = functionType9.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet18 = functionType17.getPossibleToBooleanOutcomes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(staticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jSType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(functionType17);
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03908");
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
        com.google.javascript.rhino.jstype.JSType jSType16 = functionType13.getParameterType();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(functionType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "function (): ?" + "'", str14, "function (): ?");
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNull(jSType16);
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03909");
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
        jSTypeRegistry2.clearTemplateTypeNames();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = jSTypeRegistry2.getErrorReporter();
        boolean boolean21 = jSTypeRegistry2.hasNamespace("");
        com.google.common.collect.ImmutableList<java.lang.String> strList29 = com.google.common.collect.ImmutableList.of("{proxy:function (): {225109910}}", "function (): {726684091}", "function (): {1111800050}", "function (): {2129138287}", "{proxy:function (): {63549204}}", "Named type with empty name component", "function (): {1156191911}");
        jSTypeRegistry2.setTemplateTypeNames((java.util.List<java.lang.String>) strList29);
        jSTypeRegistry2.forwardDeclareType("NUMBER 2.0 39");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(objectTypeIterable11);
        org.junit.Assert.assertTrue("'" + resolveMode12 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode12.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + resolveMode13 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode13.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode14 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS + "'", resolveMode14.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.LAZY_EXPRESSIONS));
        org.junit.Assert.assertTrue("'" + resolveMode15 + "' != '" + com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE + "'", resolveMode15.equals(com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode.IMMEDIATE));
        org.junit.Assert.assertNotNull(resolveModeList16);
        org.junit.Assert.assertNull(errorReporter19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03910");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString(25, "InputId: true", 51, 2);
        boolean boolean5 = node4.isFromExterns();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03911");
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
        boolean boolean85 = enumElementType82.isNominalType();
        com.google.javascript.rhino.jstype.ObjectType objectType86 = enumElementType82.toObjectType();
        boolean boolean88 = enumElementType82.hasProperty("function (): {250812771}");
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
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(objectType86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03912");
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
        boolean boolean25 = node17.isLabel();
        node17.setVarArgs(true);
        java.lang.String str28 = node17.getQualifiedName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo29 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean30 = jSDocInfo29.hasThisType();
        boolean boolean31 = jSDocInfo29.shouldPreserveTry();
        boolean boolean32 = jSDocInfo29.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = jSDocInfo29.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean35 = jSDocInfo29.shouldPreserveTry();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        boolean boolean38 = node37.isCall();
        com.google.javascript.rhino.Node node39 = node37.cloneTree();
        boolean boolean40 = node37.isNull();
        jSDocInfo29.setAssociatedNode(node37);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder42 = node37.new FileLevelJsDocBuilder();
        com.google.javascript.rhino.Node node43 = node17.useSourceInfoIfMissingFromForTree(node37);
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((int) (short) 100, node47, 49, (int) (byte) 1);
        int int54 = node47.getChildCount();
        com.google.javascript.rhino.Node node55 = node47.getLastChild();
        node43.putProp(43, (java.lang.Object) node47);
        boolean boolean57 = node47.isStringKey();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(staticSourceFile19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSTypeExpression34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03913");
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList8 = com.google.common.collect.ImmutableList.of((java.lang.CharSequence) "(Not declared as a type name)", (java.lang.CharSequence) "(function (): {1156191911})", (java.lang.CharSequence) "function (): {275816730}", (java.lang.CharSequence) "InputId: hi!", (java.lang.CharSequence) "function (): {1233323832}", (java.lang.CharSequence) "function (): {394543515}", (java.lang.CharSequence) "function (): {916930961}", (java.lang.CharSequence) "function (): {774621553}");
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter9, true);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        jSTypeRegistry11.unregisterPropertyOnType("(Not declared as a type name)", jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray17 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType18 = jSTypeRegistry11.createFunctionType(jSType15, true, jSTypeArray17);
        com.google.javascript.rhino.jstype.JSType jSType19 = functionType18.restrictByNotNullOrUndefined();
        java.lang.String str20 = functionType18.toString();
        int int21 = functionType18.getMaxArguments();
        com.google.javascript.rhino.jstype.JSType jSType22 = functionType18.restrictByNotNullOrUndefined();
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
        boolean boolean73 = functionType45.isUnknownType();
        java.util.Set<java.lang.String> strSet74 = functionType45.getPropertyNames();
        boolean boolean75 = functionType18.isEquivalentTo((com.google.javascript.rhino.jstype.JSType) functionType45);
        com.google.common.collect.ImmutableList<java.lang.String> strList76 = functionType18.getTemplateTypeNames();
        boolean boolean77 = charSequenceList8.contains((java.lang.Object) strList76);
        org.junit.Assert.assertNotNull(charSequenceList8);
        org.junit.Assert.assertNotNull(jSTypeArray17);
        org.junit.Assert.assertNotNull(functionType18);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "function (): ?" + "'", str20, "function (): ?");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(jSType22);
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03914");
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
        boolean boolean23 = node22.isIn();
        com.google.javascript.rhino.InputId inputId24 = node22.getInputId();
        node22.setIsSyntheticBlock(false);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(39, (int) (short) 10, (int) (byte) 10);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node(0);
        node33.putIntProp((-1), 35);
        boolean boolean37 = node33.isStringKey();
        boolean boolean38 = node33.isThrow();
        int int39 = node33.getLineno();
        boolean boolean40 = node33.hasChildren();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        node42.putIntProp((-1), 35);
        boolean boolean46 = node33.hasChild(node42);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node(0);
        boolean boolean49 = node48.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile50 = node48.getStaticSourceFile();
        com.google.javascript.rhino.Node node54 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(0, node42, node48, node54);
        boolean boolean56 = node54.isFalse();
        boolean boolean57 = node54.isCase();
        com.google.javascript.rhino.Node node58 = node54.getLastSibling();
        com.google.javascript.rhino.Node node59 = node30.srcref(node58);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder60 = node58.getJsDocBuilderForNode();
        // The following exception was thrown during execution in test generation
        try {
            node22.addChildToFront(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(inputId24);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(staticSourceFile50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder60);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03915");
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
        boolean boolean67 = parameterizedType48.isNumberObjectType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo69 = parameterizedType48.getOwnPropertyJSDocInfo("{proxy:function (): {847075005}}");
        boolean boolean71 = parameterizedType48.isPropertyTypeDeclared("{proxy:function (): {1336333830}}");
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(jSDocInfo69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03916");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        int int4 = jSDocInfo0.getExtendedInterfacesCount();
        jSDocInfo0.addSuppression("java.io.IOException");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03917");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property56 = functionType9.getSlot("function (): {1619765406}");
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
        org.junit.Assert.assertNull(property56);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03918");
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
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node(0);
        node79.putIntProp((-1), 35);
        boolean boolean83 = node79.isStringKey();
        boolean boolean84 = node79.isThrow();
        com.google.javascript.rhino.Node node85 = node77.useSourceInfoFrom(node79);
        boolean boolean86 = node85.isIn();
        boolean boolean87 = node85.isVoid();
        int int89 = node85.getIntProp(0);
        com.google.javascript.rhino.Node node92 = new com.google.javascript.rhino.Node(52, node85, 31, 49);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node93 = node64.clonePropsFrom(node92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Node has existing properties.");
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
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03919");
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
        com.google.javascript.rhino.jstype.JSType jSType52 = parameterizedType48.collapseUnion();
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
        org.junit.Assert.assertNotNull(jSType52);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03920");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        sideEffectFlags0.setThrows();
        sideEffectFlags0.setMutatesArguments();
        sideEffectFlags0.setMutatesGlobalState();
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03921");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        boolean boolean6 = node1.isThrow();
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj12 = node10.getProp((int) (byte) 10);
        boolean boolean13 = node1.isEquivalentToTyped(node10);
        com.google.javascript.rhino.Node node14 = node10.removeChildren();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet15 = node14.getDirectives();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03922");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(2);
        // The following exception was thrown during execution in test generation
        try {
            node1.setDouble((double) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03923");
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
        com.google.javascript.rhino.ErrorReporter errorReporter54 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry56 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter54, true);
        com.google.javascript.rhino.jstype.JSType jSType58 = null;
        jSTypeRegistry56.unregisterPropertyOnType("(Not declared as a type name)", jSType58);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray62 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType63 = jSTypeRegistry56.createFunctionType(jSType60, true, jSTypeArray62);
        com.google.javascript.rhino.jstype.JSType jSType64 = functionType63.restrictByNotNullOrUndefined();
        java.lang.String str65 = functionType63.toString();
        int int66 = functionType63.getMaxArguments();
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable67 = functionType63.getCtorImplementedInterfaces();
        boolean boolean68 = functionType9.hasEqualCallType(functionType63);
        com.google.javascript.rhino.Node node69 = functionType63.getParametersNode();
        node69.addSuppression("function (): {1295700248}");
        boolean boolean72 = node69.isVarArgs();
        boolean boolean73 = node69.isContinue();
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
        org.junit.Assert.assertNotNull(jSTypeArray62);
        org.junit.Assert.assertNotNull(functionType63);
        org.junit.Assert.assertNotNull(jSType64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "function (): ?" + "'", str65, "function (): ?");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objectTypeIterable67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03924");
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
        com.google.javascript.rhino.jstype.JSType jSType84 = enumType81.getPropertyType("function (): {542283849}");
        com.google.javascript.rhino.jstype.EnumElementType enumElementType85 = enumType81.getElementsType();
        boolean boolean86 = enumElementType85.matchesNumberContext();
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
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(enumElementType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03925");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
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
        boolean boolean31 = functionType30.isReturnTypeInferred();
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
        com.google.javascript.rhino.jstype.JSType.TypePair typePair82 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType30, (com.google.javascript.rhino.jstype.JSType) functionType54);
        com.google.javascript.rhino.jstype.JSType jSType83 = jSTypeRegistry17.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType30);
        java.lang.String str84 = functionType30.getNormalizedReferenceName();
        boolean boolean85 = functionType30.isNoResolvedType();
        com.google.javascript.rhino.jstype.JSType jSType86 = functionType9.forceResolve(errorReporter14, (com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType>) functionType30);
        boolean boolean87 = functionType30.isEnumType();
        boolean boolean88 = functionType30.hasReferenceName();
        boolean boolean89 = functionType30.isNoResolvedType();
        int int90 = functionType30.getMaxArguments();
        com.google.javascript.rhino.Node node92 = functionType30.getPropertyNode("{proxy:function (): {1520566017}}");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "function (): ?" + "'", str11, "function (): ?");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jSType13);
        org.junit.Assert.assertNotNull(jSTypeArray29);
        org.junit.Assert.assertNotNull(functionType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
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
        org.junit.Assert.assertNotNull(jSType83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jSType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(node92);
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03926");
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
        boolean boolean52 = functionType9.hasProperty("JSDocInfo");
        com.google.common.collect.ImmutableList<java.lang.String> strList53 = functionType9.getTemplateTypeNames();
        boolean boolean54 = functionType9.hasCachedValues();
        int int55 = functionType9.getMinArguments();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03927");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = null;
        jSDocInfo0.setVisibility(visibility3);
        boolean boolean5 = jSDocInfo0.isExport();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(markerCollection6);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03928");
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
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList37 = charSequenceList35.reverse();
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor39 = charSequenceList37.listIterator(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (39) must not be greater than size (5)");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(charSequenceList37);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03929");
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
        boolean boolean54 = functionType22.isStringObjectType();
        com.google.javascript.rhino.jstype.JSType jSType56 = functionType22.getPropertyType("function (): {480423885}");
        java.lang.String str57 = functionType22.toDebugHashCodeString();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType56);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "function (): {2137067882}" + "'", str57, "function (): {2137067882}");
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03930");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isStringKey();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder6 = node1.getJsDocBuilderForNode();
        boolean boolean7 = node1.isTypeOf();
        boolean boolean8 = node1.isLabelName();
        boolean boolean9 = node1.isFromExterns();
        boolean boolean10 = node1.isFunction();
        boolean boolean11 = node1.isParamList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node1.toString(true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03931");
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
        boolean boolean88 = parameterizedType48.matchesObjectContext();
        boolean boolean89 = parameterizedType48.isInterface();
        boolean boolean90 = parameterizedType48.hasAnyTemplateInternal();
        java.lang.String str91 = parameterizedType48.toDebugHashCodeString();
        boolean boolean92 = parameterizedType48.isUnknownType();
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
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "{proxy:function (): {67625724}}" + "'", str91, "{proxy:function (): {67625724}}");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03932");
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
        com.google.javascript.rhino.jstype.JSType jSType84 = enumType81.getPropertyType("function (): {542283849}");
        com.google.javascript.rhino.jstype.ObjectType.Property property86 = enumType81.getSlot("function (): {1350384293}");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet87 = enumType81.getPossibleToBooleanOutcomes();
        com.google.javascript.rhino.jstype.JSType jSType88 = enumType81.unboxesTo();
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
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNull(property86);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet87 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet87.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertNull(jSType88);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03933");
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
        node45.setJSType(jSType60);
        node45.setSourceEncodedPosition(36);
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
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03934");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean55 = jSDocInfo54.hasThisType();
        java.lang.String str56 = jSDocInfo54.toString();
        functionType22.setJSDocInfo(jSDocInfo54);
        boolean boolean58 = functionType22.isStringObjectType();
        boolean boolean59 = functionType22.isUnionType();
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "JSDocInfo" + "'", str56, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03935");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        node2.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(32, node2);
        int int8 = node2.getIntProp(35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03936");
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
        boolean boolean97 = functionType9.isObject();
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
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03937");
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
        boolean boolean98 = jSTypeRegistry2.shouldTolerateUndefinedValues();
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03938");
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
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.getPropertyType("function ");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getImplicitPrototype();
        boolean boolean59 = parameterizedType48.isNominalType();
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
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{proxy:function (): {1276549034}}" + "'", str55, "{proxy:function (): {1276549034}}");
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03939");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        com.google.javascript.rhino.Node node3 = node1.cloneTree();
        boolean boolean4 = node3.isAssignAdd();
        boolean boolean5 = node3.isFalse();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        node7.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node(0);
        node13.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node(32, node13);
        boolean boolean18 = node13.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(0);
        boolean boolean21 = node20.isCall();
        com.google.javascript.rhino.Node node22 = node20.cloneTree();
        com.google.javascript.jscomp.CodingConvention.Bind bind23 = new com.google.javascript.jscomp.CodingConvention.Bind(node7, node13, node20);
        int int24 = node3.getIndexOfChild(node20);
        boolean boolean25 = node20.isLocalResultCall();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03940");
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
        boolean boolean30 = functionType9.hasOwnProperty("NUMBER 0.0");
        boolean boolean31 = functionType9.isStringValueType();
        boolean boolean32 = functionType9.hasAnyTemplateInternal();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03941");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.Marker marker6 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker6.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker6.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker6.getName();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition10 = marker6.getNameNode();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition11 = marker6.getNameNode();
        com.google.javascript.rhino.JSDocInfo.Marker marker12 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition13 = marker12.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition14 = marker12.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition15 = marker12.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition16 = marker12.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition17 = marker12.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition18 = marker12.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition19 = marker12.getName();
        com.google.javascript.rhino.JSDocInfo.Marker marker20 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition21 = marker20.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition22 = marker20.getNameNode();
        com.google.javascript.rhino.JSDocInfo.Marker marker23 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition24 = marker23.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition25 = marker23.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition26 = marker23.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition27 = marker23.getDescription();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo.Marker> markerList28 = com.google.common.collect.ImmutableList.of(marker0, marker6, marker12, marker20, marker23);
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition29 = marker12.getNameNode();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(typePosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
        org.junit.Assert.assertNull(stringPosition9);
        org.junit.Assert.assertNull(nodeSourcePosition10);
        org.junit.Assert.assertNull(nodeSourcePosition11);
        org.junit.Assert.assertNull(stringPosition13);
        org.junit.Assert.assertNull(nodeSourcePosition14);
        org.junit.Assert.assertNull(stringPosition15);
        org.junit.Assert.assertNull(typePosition16);
        org.junit.Assert.assertNull(stringPosition17);
        org.junit.Assert.assertNull(nodeSourcePosition18);
        org.junit.Assert.assertNull(stringPosition19);
        org.junit.Assert.assertNull(stringPosition21);
        org.junit.Assert.assertNull(nodeSourcePosition22);
        org.junit.Assert.assertNull(stringPosition24);
        org.junit.Assert.assertNull(stringPosition25);
        org.junit.Assert.assertNull(stringPosition26);
        org.junit.Assert.assertNull(stringPosition27);
        org.junit.Assert.assertNotNull(markerList28);
        org.junit.Assert.assertNull(nodeSourcePosition29);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03942");
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
        boolean boolean18 = node17.isIn();
        int int19 = node17.getLength();
        boolean boolean20 = node17.isThis();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(32, node23);
        com.google.javascript.rhino.Node node28 = node17.copyInformationFromForTree(node27);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(40, (int) (short) 0, 43);
        com.google.javascript.rhino.InputId inputId34 = new com.google.javascript.rhino.InputId("java.io.IOException: java.io.IOException");
        node32.setInputId(inputId34);
        boolean boolean36 = node32.isSyntheticBlock();
        com.google.javascript.rhino.Node node37 = node28.copyInformationFromForTree(node32);
        boolean boolean38 = node32.isHook();
        boolean boolean39 = node32.isSyntheticBlock();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03943");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = node20.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03944");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = new com.google.javascript.rhino.JSTypeExpression(node1, "hi!");
        boolean boolean5 = jSTypeExpression4.isVarArgs();
        boolean boolean6 = jSTypeExpression4.isVarArgs();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node(0);
        node10.putIntProp((-1), 35);
        boolean boolean14 = node10.isStringKey();
        boolean boolean15 = node10.isThrow();
        com.google.javascript.rhino.Node node16 = node8.useSourceInfoFrom(node10);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        node18.putIntProp((-1), 35);
        boolean boolean22 = node18.isReturn();
        com.google.javascript.rhino.InputId inputId23 = node18.getInputId();
        node18.setWasEmptyNode(true);
        int int26 = node16.getIndexOfChild(node18);
        boolean boolean27 = node18.isAssign();
        boolean boolean28 = node18.isLocalResultCall();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile29 = node18.getStaticSourceFile();
        node18.setSourceEncodedPosition(31);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(0);
        node34.putIntProp((-1), 35);
        boolean boolean38 = node34.isStringKey();
        boolean boolean39 = node34.isThrow();
        int int40 = node34.getLineno();
        boolean boolean41 = node34.hasChildren();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(0);
        node43.putIntProp((-1), 35);
        boolean boolean47 = node34.hasChild(node43);
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node(0);
        boolean boolean50 = node49.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile51 = node49.getStaticSourceFile();
        com.google.javascript.rhino.Node node55 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node(0, node43, node49, node55);
        boolean boolean57 = node49.isThis();
        com.google.javascript.rhino.Node node58 = node18.srcref(node49);
        boolean boolean59 = jSTypeExpression4.equals((java.lang.Object) node58);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(inputId23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(staticSourceFile29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(staticSourceFile51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03945");
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
        java.lang.String str69 = functionType15.getReferenceName();
        boolean boolean70 = functionType15.isCheckedUnknownType();
        boolean boolean71 = functionType15.canBeCalled();
        boolean boolean72 = functionType15.isReturnTypeInferred();
        int int73 = functionType15.getPropertiesCount();
        com.google.javascript.rhino.jstype.ObjectType objectType74 = functionType15.dereference();
        com.google.javascript.rhino.jstype.ObjectType objectType75 = functionType15.toObjectType();
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(objectType74);
        org.junit.Assert.assertNotNull(objectType75);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03946");
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
        boolean boolean52 = parameterizedType48.isCheckedUnknownType();
        boolean boolean53 = parameterizedType48.matchesNumberContext();
        boolean boolean54 = parameterizedType48.isNoType();
        boolean boolean55 = parameterizedType48.isNumberValueType();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.getPropertyType("function (): {18409526}");
        boolean boolean58 = parameterizedType48.hasAnyTemplateInternal();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03947");
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
        java.util.Set<java.lang.String> strSet36 = functionType9.getOwnPropertyNames();
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList43 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray42);
        java.lang.CharSequence[] charSequenceArray45 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList46 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46, charSequenceArray45);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator48 = charSequenceList46.spliterator();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(0);
        node51.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node(32, node51);
        boolean boolean56 = node55.isGetterDef();
        boolean boolean57 = charSequenceList46.equals((java.lang.Object) boolean56);
        boolean boolean59 = charSequenceList46.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean60 = charSequenceList43.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList46);
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList61 = charSequenceList43.asList();
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream62 = charSequenceList43.parallelStream();
        boolean boolean63 = strSet36.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList43);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = strSet36.add("({proxy:function (): {8338890}})");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertNotNull(charSequenceList43);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator48);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(charSequenceList61);
        org.junit.Assert.assertNotNull(charSequenceStream62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03948");
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
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable89 = node79.children();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder90 = node79.getJsDocBuilderForNode();
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
        org.junit.Assert.assertNotNull(nodeIterable89);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder90);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03949");
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
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter26, true);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        jSTypeRegistry28.unregisterPropertyOnType("(Not declared as a type name)", jSType30);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray34 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType35 = jSTypeRegistry28.createFunctionType(jSType32, true, jSTypeArray34);
        com.google.common.collect.ImmutableList<java.lang.String> strList36 = functionType35.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot38 = functionType35.getSlot("NUMBER 0.0 100\n");
        boolean boolean39 = functionType35.isAllType();
        boolean boolean40 = functionType35.hasReferenceName();
        java.lang.Iterable iterable41 = functionType35.getCtorImplementedInterfaces();
        int int42 = charSequenceList6.indexOf((java.lang.Object) iterable41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence45 = charSequenceList6.set((-2147483648), (java.lang.CharSequence) "{proxy:function (): {1036593155}}");
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
        org.junit.Assert.assertNotNull(jSTypeArray34);
        org.junit.Assert.assertNotNull(functionType35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNull(staticSlot38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterable41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03950");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        java.lang.String str10 = jSDocInfo0.getMeaning();
        java.lang.String str11 = jSDocInfo0.getOriginalCommentString();
        int int12 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean13 = jSDocInfo0.isDeprecated();
        java.lang.String str14 = jSDocInfo0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JSDocInfo" + "'", str14, "JSDocInfo");
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03951");
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
        java.util.stream.Stream<java.lang.CharSequence> charSequenceStream41 = charSequenceList39.stream();
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList42 = charSequenceList39.reverse();
        int int43 = charSequenceList42.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = charSequenceList42.add((java.lang.CharSequence) "{proxy:function (): {1681622479}}");
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
        org.junit.Assert.assertNotNull(charSequenceStream41);
        org.junit.Assert.assertNotNull(charSequenceList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03952");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(41);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 46);
        com.google.javascript.rhino.Node node4 = node1.useSourceInfoIfMissingFromForTree(node3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        jSTypeRegistry7.unregisterPropertyOnType("(Not declared as a type name)", jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry7.createFunctionType(jSType11, true, jSTypeArray13);
        boolean boolean15 = functionType14.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        boolean boolean27 = functionType25.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry31.createFunctionType(jSType35, true, jSTypeArray37);
        boolean boolean40 = functionType38.removeProperty("false");
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        node42.putIntProp((-1), 35);
        boolean boolean46 = node42.isStringKey();
        boolean boolean47 = node42.isThrow();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj53 = node51.getProp((int) (byte) 10);
        boolean boolean54 = node42.isEquivalentToTyped(node51);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(32, node57);
        boolean boolean62 = node61.isInstanceOf();
        com.google.javascript.rhino.Node node63 = node51.useSourceInfoFromForTree(node61);
        boolean boolean64 = node61.isDo();
        boolean boolean65 = functionType25.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType38, node61);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair66 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType14, (com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet67 = functionType38.getPossibleToBooleanOutcomes();
        boolean boolean68 = functionType38.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType38.toMaybeFunctionType();
        node4.setJSType((com.google.javascript.rhino.jstype.JSType) functionType38);
        java.lang.String str71 = functionType38.getNormalizedReferenceName();
        boolean boolean72 = functionType38.matchesNumberContext();
        com.google.javascript.rhino.jstype.JSType jSType74 = functionType38.findPropertyType("{proxy:function (): {714147679}}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = jSType74.isVoidType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet67 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet67.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(jSType74);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03953");
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
        boolean boolean18 = node17.isIn();
        int int19 = node17.getLength();
        boolean boolean20 = node17.isThis();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node(0);
        node23.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node(32, node23);
        com.google.javascript.rhino.Node node28 = node17.copyInformationFromForTree(node27);
        boolean boolean29 = node27.isUnscopedQualifiedName();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = node27.getExistingIntProp(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 14");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03954");
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
        boolean boolean61 = functionType56.isInstanceType();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node(0);
        boolean boolean64 = node63.isInstanceOf();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node(0);
        node66.putIntProp((-1), 35);
        boolean boolean70 = node66.isStringKey();
        boolean boolean71 = node66.isThrow();
        boolean boolean72 = node66.isEmpty();
        com.google.javascript.rhino.Node node73 = node63.useSourceInfoFrom(node66);
        boolean boolean74 = node73.isVoid();
        functionType56.setSource(node73);
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean78 = jSDocInfo77.hasThisType();
        boolean boolean79 = jSDocInfo77.shouldPreserveTry();
        java.lang.String str80 = jSDocInfo77.getDescription();
        java.util.Collection<java.lang.String> strCollection81 = jSDocInfo77.getAuthors();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList82 = jSDocInfo77.getExtendedInterfaces();
        boolean boolean84 = jSDocInfo77.hasDescriptionForParameter("function (): {1617435542}");
        java.util.Collection<java.lang.String> strCollection85 = jSDocInfo77.getAuthors();
        functionType56.setPropertyJSDocInfo("LT function (): {848299148} 8", jSDocInfo77);
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
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "function (): {1051308450}" + "'", str52, "function (): {1051308450}");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(functionType56);
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNull(unionType58);
        org.junit.Assert.assertNotNull(jSType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(strCollection81);
        org.junit.Assert.assertNotNull(jSTypeExpressionList82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(strCollection85);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03955");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property22 = functionType19.getSlot("Unknown class name");
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean24 = jSDocInfo23.isHidden();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo26 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean28 = jSDocInfo27.hasThisType();
        boolean boolean29 = jSDocInfo27.shouldPreserveTry();
        boolean boolean30 = jSDocInfo27.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList31 = jSDocInfo27.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean33 = jSDocInfo32.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = jSDocInfo32.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility35 = null;
        jSDocInfo32.setVisibility(visibility35);
        boolean boolean37 = jSDocInfo32.isExport();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean39 = jSDocInfo38.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression40 = jSDocInfo38.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility41 = null;
        jSDocInfo38.setVisibility(visibility41);
        boolean boolean43 = jSDocInfo38.isExport();
        java.lang.String str44 = jSDocInfo38.getMeaning();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean46 = jSDocInfo45.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = jSDocInfo45.getBaseType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility48 = null;
        jSDocInfo45.setVisibility(visibility48);
        boolean boolean50 = jSDocInfo45.isExport();
        com.google.common.collect.ImmutableList<com.google.javascript.rhino.JSDocInfo> jSDocInfoList51 = com.google.common.collect.ImmutableList.of(jSDocInfo23, jSDocInfo25, jSDocInfo26, jSDocInfo27, jSDocInfo32, jSDocInfo38, jSDocInfo45);
        java.lang.String str52 = jSDocInfo23.getLendsName();
        jSDocInfo23.setDeprecated(true);
        functionType19.setJSDocInfo(jSDocInfo23);
        com.google.javascript.rhino.ErrorReporter errorReporter56 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry58 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter56, true);
        com.google.javascript.rhino.jstype.JSType jSType60 = null;
        jSTypeRegistry58.unregisterPropertyOnType("(Not declared as a type name)", jSType60);
        com.google.javascript.rhino.ErrorReporter errorReporter62 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter62, true);
        com.google.javascript.rhino.jstype.JSType jSType66 = null;
        jSTypeRegistry64.unregisterPropertyOnType("(Not declared as a type name)", jSType66);
        com.google.javascript.rhino.jstype.JSType jSType68 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray70 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType71 = jSTypeRegistry64.createFunctionType(jSType68, true, jSTypeArray70);
        boolean boolean73 = functionType71.removeProperty("false");
        boolean boolean74 = functionType71.isNativeObjectType();
        com.google.javascript.rhino.jstype.JSType jSType75 = jSTypeRegistry58.createNullableType((com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair76 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType19, (com.google.javascript.rhino.jstype.JSType) functionType71);
        com.google.javascript.rhino.jstype.JSType jSType77 = jSTypeRegistry2.createOptionalType((com.google.javascript.rhino.jstype.JSType) functionType71);
        boolean boolean79 = functionType71.hasProperty("{proxy:function (): {677068937}}");
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = functionType71.getJSDocInfo();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSTypeArray18);
        org.junit.Assert.assertNotNull(functionType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(property22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSTypeExpression34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(jSTypeExpression40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(jSTypeExpression47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jSDocInfoList51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(jSTypeArray70);
        org.junit.Assert.assertNotNull(functionType71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jSType75);
        org.junit.Assert.assertNotNull(jSType77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(jSDocInfo80);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03956");
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
        com.google.javascript.rhino.jstype.ObjectType.Property property52 = functionType9.getSlot("{proxy:function (): {2075610546}}");
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
        org.junit.Assert.assertNull(property52);
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03957");
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
        jSDocInfo0.setLicense("{proxy:function (): {63549204}}");
        java.util.Collection<java.lang.String> strCollection16 = jSDocInfo0.getReferences();
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
        org.junit.Assert.assertNull(strCollection16);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03958");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.isExterns();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        java.lang.String str5 = jSDocInfo0.getSourceName();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNull(strCollection7);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03959");
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
        boolean boolean24 = node23.isStringKey();
        node23.removeProp(1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.rhino.Node.newString(37, "JSDocInfo");
        node29.setSourceEncodedPositionForTree(54);
        boolean boolean32 = node29.isSetterDef();
        boolean boolean33 = node29.isIf();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node(43, node23, node29);
        boolean boolean35 = node23.isOr();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03960");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(41);
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 46);
        com.google.javascript.rhino.Node node4 = node1.useSourceInfoIfMissingFromForTree(node3);
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter5, true);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        jSTypeRegistry7.unregisterPropertyOnType("(Not declared as a type name)", jSType9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray13 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType14 = jSTypeRegistry7.createFunctionType(jSType11, true, jSTypeArray13);
        boolean boolean15 = functionType14.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry18 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter16, true);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        jSTypeRegistry18.unregisterPropertyOnType("(Not declared as a type name)", jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray24 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType25 = jSTypeRegistry18.createFunctionType(jSType22, true, jSTypeArray24);
        boolean boolean27 = functionType25.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter29, true);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        jSTypeRegistry31.unregisterPropertyOnType("(Not declared as a type name)", jSType33);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray37 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType38 = jSTypeRegistry31.createFunctionType(jSType35, true, jSTypeArray37);
        boolean boolean40 = functionType38.removeProperty("false");
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node(0);
        node42.putIntProp((-1), 35);
        boolean boolean46 = node42.isStringKey();
        boolean boolean47 = node42.isThrow();
        com.google.javascript.rhino.Node node51 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj53 = node51.getProp((int) (byte) 10);
        boolean boolean54 = node42.isEquivalentToTyped(node51);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node(32, node57);
        boolean boolean62 = node61.isInstanceOf();
        com.google.javascript.rhino.Node node63 = node51.useSourceInfoFromForTree(node61);
        boolean boolean64 = node61.isDo();
        boolean boolean65 = functionType25.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType38, node61);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair66 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType14, (com.google.javascript.rhino.jstype.JSType) functionType38);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet67 = functionType38.getPossibleToBooleanOutcomes();
        boolean boolean68 = functionType38.hasDisplayName();
        com.google.javascript.rhino.jstype.FunctionType functionType69 = functionType38.toMaybeFunctionType();
        node4.setJSType((com.google.javascript.rhino.jstype.JSType) functionType38);
        java.lang.String str71 = functionType38.toDebugHashCodeString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(jSTypeArray13);
        org.junit.Assert.assertNotNull(functionType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeArray24);
        org.junit.Assert.assertNotNull(functionType25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeArray37);
        org.junit.Assert.assertNotNull(functionType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet67 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet67.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(functionType69);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "function (): {2099390999}" + "'", str71, "function (): {2099390999}");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03961");
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
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList33 = charSequenceList6.reverse();
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList40 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray39);
        java.lang.String str41 = charSequenceList40.toString();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "[hi!, hi!, , , hi!]", "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList45 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        boolean boolean47 = charSequenceList40.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder48 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder49 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder50 = com.google.common.collect.ImmutableList.builder();
        com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList.Builder<java.lang.String[]>> strArrayBuilderList51 = com.google.common.collect.ImmutableList.of(strArrayBuilder48, strArrayBuilder49, strArrayBuilder50);
        java.lang.String[] strArray64 = new java.lang.String[] {};
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList65 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>) "(Not declared as a type name)", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "(Not declared as a type name)", (java.lang.Comparable<java.lang.String>) "JSDocInfo", (java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "java.io.IOException", (java.lang.Comparable<java.lang.String>) "Not declared as a type name", (java.lang.Comparable<java.lang.String>) "(Not declared as a type name)", (java.lang.Comparable<java.lang.String>) "java.io.IOException", (java.lang.Comparable<java.lang.String>) "Not declared as a type name", (java.lang.Comparable<java.lang.String>) "[hi!, hi!, , , hi!]", (java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>[]) strArray64);
        com.google.common.collect.ImmutableList<java.lang.Comparable<java.lang.String>> strComparableList66 = com.google.common.collect.ImmutableList.of((java.lang.Comparable<java.lang.String>[]) strArray64);
        com.google.common.collect.ImmutableList.Builder<java.lang.String[]> strArrayBuilder67 = strArrayBuilder49.add(strArray64);
        java.lang.Object[] objArray68 = charSequenceList45.toArray((java.lang.Object[]) strArray64);
        java.lang.Object[] objArray69 = charSequenceList6.toArray((java.lang.Object[]) strArray64);
        com.google.common.collect.UnmodifiableIterator<java.lang.CharSequence> charSequenceItor70 = charSequenceList6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            charSequenceItor70.remove();
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
        org.junit.Assert.assertNotNull(charSequenceList33);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[hi!, hi!, , , hi!]" + "'", str41, "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArrayBuilder48);
        org.junit.Assert.assertNotNull(strArrayBuilder49);
        org.junit.Assert.assertNotNull(strArrayBuilder50);
        org.junit.Assert.assertNotNull(strArrayBuilderList51);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strComparableList65);
        org.junit.Assert.assertNotNull(strComparableList66);
        org.junit.Assert.assertNotNull(strArrayBuilder67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[[hi!, hi!, , , hi!], ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[[hi!, hi!, , , hi!], ]");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceItor70);
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03962");
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
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList33 = charSequenceList6.reverse();
        java.util.ListIterator<java.lang.CharSequence> charSequenceItor34 = charSequenceList6.listIterator();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        boolean boolean38 = node37.isCall();
        com.google.javascript.rhino.Node node39 = node37.cloneTree();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node(35, node39, node42);
        boolean boolean44 = node43.isComma();
        boolean boolean45 = node43.isWith();
        boolean boolean46 = node43.isStringKey();
        boolean boolean47 = node43.isTypeOf();
        boolean boolean48 = node43.isObjectLit();
        int int49 = charSequenceList6.lastIndexOf((java.lang.Object) node43);
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
        org.junit.Assert.assertNotNull(charSequenceList33);
        org.junit.Assert.assertNotNull(charSequenceItor34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03963");
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
        java.lang.Throwable throwable28 = null;
        java.io.IOException iOException29 = new java.io.IOException(throwable28);
        boolean boolean30 = charSequenceList27.equals((java.lang.Object) throwable28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = charSequenceList27.add((java.lang.CharSequence) "function (): {524082340}");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03964");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isCall();
        com.google.javascript.rhino.Node node4 = node2.cloneTree();
        boolean boolean5 = node4.isAssignAdd();
        boolean boolean6 = node4.isFalse();
        boolean boolean7 = node4.hasMoreThanOneChild();
        boolean boolean8 = node4.isLabelName();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node(46, node4, 15, (int) (short) 100);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node(0);
        node14.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((int) (short) 100, node14, 49, (int) (byte) 1);
        com.google.javascript.rhino.Node node21 = node14.cloneNode();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile22 = null;
        node21.setStaticSourceFile(staticSourceFile22);
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(0);
        node25.putIntProp((-1), 35);
        boolean boolean29 = node25.isStringKey();
        boolean boolean30 = node25.isThrow();
        int int31 = node25.getLineno();
        boolean boolean32 = node25.hasChildren();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node(0);
        node35.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node(32, node35);
        boolean boolean40 = node35.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node41 = node25.useSourceInfoIfMissingFromForTree(node35);
        boolean boolean42 = node41.isIn();
        int int43 = node41.getLength();
        boolean boolean44 = node41.isThis();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node(0);
        node47.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node(32, node47);
        com.google.javascript.rhino.Node node52 = node41.copyInformationFromForTree(node51);
        com.google.javascript.rhino.Node node53 = node21.srcrefTree(node51);
        node11.addChildToBack(node53);
        boolean boolean55 = node11.isParamList();
        com.google.javascript.rhino.Node node59 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean60 = node59.isEmpty();
        boolean boolean61 = node59.isInc();
        node59.setSourceEncodedPositionForTree(39);
        java.lang.Object obj65 = node59.getProp((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            node11.removeChild(node59);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: node is not a child");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03965");
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
        java.lang.String str51 = parameterizedType48.toDebugHashCodeString();
        com.google.javascript.rhino.jstype.ObjectType.Property property53 = parameterizedType48.getSlot("java.io.IOException: java.io.IOException");
        boolean boolean55 = parameterizedType48.isPropertyInExterns("function (): {1382777992}");
        boolean boolean56 = parameterizedType48.isNoType();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.collapseUnion();
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
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "{proxy:function (): {849806980}}" + "'", str51, "{proxy:function (): {849806980}}");
        org.junit.Assert.assertNull(property53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSType57);
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03966");
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
        boolean boolean54 = parameterizedType48.isEmptyType();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.autobox();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType55);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03967");
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
        boolean boolean53 = functionType9.isVoidType();
        boolean boolean54 = functionType9.isNumber();
        boolean boolean55 = functionType9.isCheckedUnknownType();
        boolean boolean56 = functionType9.isNoResolvedType();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03968");
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
        com.google.javascript.rhino.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter36, true);
        com.google.javascript.rhino.jstype.JSType jSType40 = null;
        jSTypeRegistry38.unregisterPropertyOnType("(Not declared as a type name)", jSType40);
        com.google.javascript.rhino.jstype.JSType jSType42 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray44 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType45 = jSTypeRegistry38.createFunctionType(jSType42, true, jSTypeArray44);
        com.google.javascript.rhino.jstype.JSType jSType46 = functionType45.autoboxesTo();
        java.lang.String str47 = functionType45.getNormalizedReferenceName();
        com.google.javascript.rhino.ErrorReporter errorReporter48 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry50 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter48, true);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        jSTypeRegistry50.unregisterPropertyOnType("(Not declared as a type name)", jSType52);
        com.google.javascript.rhino.jstype.JSType jSType54 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray56 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType57 = jSTypeRegistry50.createFunctionType(jSType54, true, jSTypeArray56);
        com.google.common.collect.ImmutableList<java.lang.String> strList58 = functionType57.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.StaticSlot staticSlot60 = functionType57.getSlot("NUMBER 0.0 100\n");
        boolean boolean61 = functionType57.isAllType();
        boolean boolean62 = functionType45.hasEqualCallType(functionType57);
        com.google.javascript.rhino.JSDocInfo jSDocInfo64 = functionType57.getOwnPropertyJSDocInfo("function (): {2068438814}");
        com.google.javascript.rhino.jstype.JSType jSType65 = functionType57.getReturnType();
        com.google.javascript.rhino.jstype.FunctionType functionType67 = functionType57.getBindReturnType((int) (byte) 100);
        com.google.javascript.rhino.jstype.StaticSlot staticSlot69 = functionType57.getSlot("function (): {1295700248}");
        com.google.javascript.rhino.jstype.FunctionType functionType70 = functionType57.getConstructor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = functionType9.hasEqualCallType(functionType70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(jSTypeArray44);
        org.junit.Assert.assertNotNull(functionType45);
        org.junit.Assert.assertNull(jSType46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(jSTypeArray56);
        org.junit.Assert.assertNotNull(functionType57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNull(staticSlot60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jSDocInfo64);
        org.junit.Assert.assertNotNull(jSType65);
        org.junit.Assert.assertNotNull(functionType67);
        org.junit.Assert.assertNull(staticSlot69);
        org.junit.Assert.assertNull(functionType70);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03969");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node((int) ' ');
        boolean boolean2 = node1.isVar();
        boolean boolean3 = node1.hasOneChild();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03970");
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
        boolean boolean89 = parameterizedType48.matchesNumberContext();
        com.google.javascript.rhino.JSDocInfo jSDocInfo90 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean91 = jSDocInfo90.hasThisType();
        boolean boolean92 = jSDocInfo90.shouldPreserveTry();
        java.lang.String str93 = jSDocInfo90.getDescription();
        parameterizedType48.setJSDocInfo(jSDocInfo90);
        boolean boolean96 = parameterizedType48.hasProperty("function (): {1975865191}");
        boolean boolean98 = parameterizedType48.hasOwnProperty("{proxy:function (): {559156472}}");
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03971");
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
        java.lang.String str35 = charSequenceList33.toString();
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList42 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray41);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList45 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45, charSequenceArray44);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator47 = charSequenceList45.spliterator();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node(0);
        node50.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node(32, node50);
        boolean boolean55 = node54.isGetterDef();
        boolean boolean56 = charSequenceList45.equals((java.lang.Object) boolean55);
        boolean boolean58 = charSequenceList45.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean59 = charSequenceList42.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList45);
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node(0);
        node62.putIntProp((-1), 35);
        boolean boolean66 = node62.isStringKey();
        boolean boolean67 = node62.isThrow();
        int int68 = node62.getLineno();
        boolean boolean69 = node62.hasChildren();
        com.google.javascript.rhino.Node node71 = new com.google.javascript.rhino.Node(0);
        node71.putIntProp((-1), 35);
        boolean boolean75 = node62.hasChild(node71);
        com.google.javascript.rhino.Node node77 = new com.google.javascript.rhino.Node(0);
        boolean boolean78 = node77.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile79 = node77.getStaticSourceFile();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node(0, node71, node77, node83);
        boolean boolean85 = charSequenceList42.contains((java.lang.Object) node77);
        boolean boolean86 = charSequenceList33.contains((java.lang.Object) charSequenceList42);
        com.google.common.collect.UnmodifiableListIterator<java.lang.CharSequence> charSequenceItor88 = charSequenceList42.listIterator(0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.CharSequence> charSequenceItor90 = charSequenceList42.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (-1) must not be negative");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[hi!, hi!, , , hi!]" + "'", str35, "[hi!, hi!, , , hi!]");
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceList42);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(staticSourceFile79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(charSequenceItor88);
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03972");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isInstanceOf();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        node5.putIntProp((-1), 35);
        boolean boolean9 = node5.isStringKey();
        boolean boolean10 = node5.isThrow();
        boolean boolean11 = node5.isEmpty();
        com.google.javascript.rhino.Node node12 = node2.useSourceInfoFrom(node5);
        boolean boolean13 = node12.isVar();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node(0);
        boolean boolean16 = node15.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = node15.getStaticSourceFile();
        node15.setLineno((int) '4');
        com.google.javascript.rhino.Node node20 = node12.useSourceInfoIfMissingFrom(node15);
        com.google.javascript.rhino.Node node24 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj26 = node24.getProp((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = node15.copyInformationFrom(node24);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = null;
        node15.setStaticSourceFile(staticSourceFile28);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node(4, node15, 45, 35);
        // The following exception was thrown during execution in test generation
        try {
            node32.setString("{proxy:function (): {349790711}}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: RETURN 45 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(staticSourceFile17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03973");
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
        java.lang.Iterable iterable87 = functionType72.getCtorImplementedInterfaces();
        java.util.Spliterator<com.google.javascript.rhino.Node> nodeSpliterator88 = iterable87.spliterator();
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
        org.junit.Assert.assertNotNull(iterable87);
        org.junit.Assert.assertNotNull(nodeSpliterator88);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03974");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        node1.putIntProp((-1), 35);
        boolean boolean5 = node1.isReturn();
        boolean boolean6 = node1.isArrayLit();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter7, true);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        jSTypeRegistry9.unregisterPropertyOnType("(Not declared as a type name)", jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray15 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType16 = jSTypeRegistry9.createFunctionType(jSType13, true, jSTypeArray15);
        boolean boolean18 = functionType16.removeProperty("false");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = functionType16.getImplicitPrototype();
        java.util.Set<java.lang.String> strSet20 = objectType19.getPropertyNames();
        node1.setDirectives(strSet20);
        int int22 = node1.getCharno();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeArray15);
        org.junit.Assert.assertNotNull(functionType16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectType19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03975");
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
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.getPropertyType("function ");
        com.google.javascript.rhino.jstype.ObjectType objectType58 = parameterizedType48.getTypeOfThis();
        boolean boolean60 = parameterizedType48.isPropertyInExterns("function (): {235324035}");
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
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "{proxy:function (): {801434774}}" + "'", str55, "{proxy:function (): {801434774}}");
        org.junit.Assert.assertNotNull(jSType57);
        org.junit.Assert.assertNotNull(objectType58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03976");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = functionType9.getTemplateTypeNames();
        com.google.javascript.rhino.jstype.ObjectType.Property property12 = functionType9.getSlot("function (): ?");
        boolean boolean13 = functionType9.isInterface();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = functionType9.getImplicitPrototype();
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
        java.lang.Iterable iterable29 = functionType24.getCtorImplementedInterfaces();
        boolean boolean30 = functionType24.isNumberObjectType();
        boolean boolean31 = functionType24.matchesNumberContext();
        boolean boolean32 = com.google.javascript.rhino.jstype.JSType.isEquivalent((com.google.javascript.rhino.jstype.JSType) functionType9, (com.google.javascript.rhino.jstype.JSType) functionType24);
        int int33 = functionType24.getMaxArguments();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objectType14);
        org.junit.Assert.assertNotNull(jSTypeArray23);
        org.junit.Assert.assertNotNull(functionType24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNull(staticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03977");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isCall();
        boolean boolean3 = node1.isDefaultCase();
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node(0);
        boolean boolean6 = node5.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node5.getStaticSourceFile();
        node5.setLineno((int) '4');
        com.google.javascript.rhino.Node node10 = node1.srcref(node5);
        int int11 = node5.getCharno();
        boolean boolean13 = node5.getBooleanProp((int) (short) -1);
        boolean boolean14 = node5.isFor();
        boolean boolean15 = node5.isName();
        java.lang.Appendable appendable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            node5.appendStringTree(appendable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(staticSourceFile7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03978");
        com.google.javascript.rhino.Node node1 = new com.google.javascript.rhino.Node(0);
        boolean boolean2 = node1.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile3 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node1);
        boolean boolean4 = node1.isNumber();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(staticSourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03979");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(0, "function (): {2140273663}");
        boolean boolean3 = node2.isLocalResultCall();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03980");
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
        boolean boolean25 = functionType9.isReturnTypeInferred();
        boolean boolean26 = functionType9.isConstructor();
        boolean boolean27 = functionType9.isInstanceType();
        boolean boolean28 = functionType9.matchesObjectContext();
        com.google.javascript.rhino.jstype.ObjectType.Property property30 = functionType9.getOwnSlot("function (): {1385595472}");
        com.google.javascript.rhino.jstype.JSType jSType32 = functionType9.getPropertyType("{proxy:function (): {1387664534}}");
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeArray21);
        org.junit.Assert.assertNotNull(functionType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(property30);
        org.junit.Assert.assertNotNull(jSType32);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03981");
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
        int int84 = functionType15.getExtendedInterfacesCount();
        boolean boolean86 = functionType15.isPropertyInExterns("Unknown class name");
        boolean boolean87 = functionType15.canBeCalled();
        com.google.javascript.rhino.jstype.JSType jSType89 = functionType15.findPropertyType("function (): {1144131025}");
        boolean boolean90 = functionType15.isReturnTypeInferred();
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
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(jSType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03982");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.setMutatesGlobalState();
        boolean boolean3 = sideEffectFlags1.areAllFlagsSet();
        boolean boolean4 = sideEffectFlags1.areAllFlagsSet();
        sideEffectFlags1.setAllFlags();
        sideEffectFlags1.setMutatesGlobalState();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03983");
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
        boolean boolean39 = node36.isGetElem();
        com.google.javascript.rhino.Node node40 = node36.cloneNode();
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node42 = node36.srcrefTree(node41);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03984");
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
        boolean boolean83 = enumElementType82.isNullable();
        com.google.javascript.rhino.jstype.ObjectType.Property property85 = enumElementType82.getSlot("function (): {109331746}");
        com.google.javascript.rhino.jstype.JSType jSType87 = enumElementType82.getPropertyType("NUMBER -1.0");
        com.google.javascript.rhino.jstype.JSType jSType88 = enumElementType82.getPrimitiveType();
        boolean boolean89 = enumElementType82.matchesNumberContext();
        boolean boolean90 = enumElementType82.isVoidType();
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
        org.junit.Assert.assertNull(property85);
        org.junit.Assert.assertNotNull(jSType87);
        org.junit.Assert.assertNotNull(jSType88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03985");
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
        boolean boolean30 = functionType29.isReturnTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter31, true);
        com.google.javascript.rhino.jstype.JSType jSType35 = null;
        jSTypeRegistry33.unregisterPropertyOnType("(Not declared as a type name)", jSType35);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray39 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType40 = jSTypeRegistry33.createFunctionType(jSType37, true, jSTypeArray39);
        boolean boolean42 = functionType40.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter44 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry46 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter44, true);
        com.google.javascript.rhino.jstype.JSType jSType48 = null;
        jSTypeRegistry46.unregisterPropertyOnType("(Not declared as a type name)", jSType48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray52 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType53 = jSTypeRegistry46.createFunctionType(jSType50, true, jSTypeArray52);
        boolean boolean55 = functionType53.removeProperty("false");
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node(0);
        node57.putIntProp((-1), 35);
        boolean boolean61 = node57.isStringKey();
        boolean boolean62 = node57.isThrow();
        com.google.javascript.rhino.Node node66 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj68 = node66.getProp((int) (byte) 10);
        boolean boolean69 = node57.isEquivalentToTyped(node66);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(0);
        node72.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node(32, node72);
        boolean boolean77 = node76.isInstanceOf();
        com.google.javascript.rhino.Node node78 = node66.useSourceInfoFromForTree(node76);
        boolean boolean79 = node76.isDo();
        boolean boolean80 = functionType40.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType53, node76);
        com.google.javascript.rhino.jstype.JSType.TypePair typePair81 = new com.google.javascript.rhino.jstype.JSType.TypePair((com.google.javascript.rhino.jstype.JSType) functionType29, (com.google.javascript.rhino.jstype.JSType) functionType53);
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet82 = functionType53.getPossibleToBooleanOutcomes();
        boolean boolean83 = functionType53.hasDisplayName();
        boolean boolean84 = functionType53.isString();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair85 = jSType19.getTypesUnderShallowEquality((com.google.javascript.rhino.jstype.JSType) functionType53);
        java.lang.String str86 = functionType53.toDebugHashCodeString();
        com.google.javascript.rhino.JSDocInfo jSDocInfo87 = functionType53.getJSDocInfo();
        org.junit.Assert.assertNotNull(jSTypeArray14);
        org.junit.Assert.assertNotNull(functionType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeArray28);
        org.junit.Assert.assertNotNull(functionType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jSTypeArray39);
        org.junit.Assert.assertNotNull(functionType40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeArray52);
        org.junit.Assert.assertNotNull(functionType53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + booleanLiteralSet82 + "' != '" + com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE + "'", booleanLiteralSet82.equals(com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(typePair85);
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "function (): {1994115393}" + "'", str86, "function (): {1994115393}");
        org.junit.Assert.assertNull(jSDocInfo87);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03986");
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
        jSTypeRegistry16.incrementGeneration();
        com.google.javascript.rhino.jstype.ObjectType objectType37 = jSTypeRegistry16.createAnonymousObjectType();
        jSTypeRegistry16.forwardDeclareType("function (): {1295700248}");
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
        org.junit.Assert.assertNotNull(objectType37);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03987");
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
        boolean boolean60 = parameterizedType48.removeProperty("function (): {1536545239}");
        com.google.javascript.rhino.jstype.ObjectType objectType61 = parameterizedType48.getImplicitPrototype();
        boolean boolean63 = parameterizedType48.hasProperty("function (): {726684091}");
        java.util.Set<java.lang.String> strSet64 = parameterizedType48.getOwnPropertyNames();
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
        org.junit.Assert.assertNotNull(objectType61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strSet64);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03988");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((-1.0d), 32, 49);
        boolean boolean5 = node4.isTypeOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node4);
        com.google.javascript.rhino.Node node10 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean11 = node10.isEmpty();
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "hi!", "", "", "hi!" };
        com.google.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList18 = com.google.common.collect.ImmutableList.copyOf(charSequenceArray17);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList21 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21, charSequenceArray20);
        java.util.Spliterator<java.lang.CharSequence> charSequenceSpliterator23 = charSequenceList21.spliterator();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        node26.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(32, node26);
        boolean boolean31 = node30.isGetterDef();
        boolean boolean32 = charSequenceList21.equals((java.lang.Object) boolean31);
        boolean boolean34 = charSequenceList21.add((java.lang.CharSequence) "[hi!, hi!, , , hi!]");
        boolean boolean35 = charSequenceList18.containsAll((java.util.Collection<java.lang.CharSequence>) charSequenceList21);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node(0);
        node37.putIntProp((-1), 35);
        boolean boolean41 = node37.isStringKey();
        boolean boolean42 = node37.isThrow();
        int int43 = charSequenceList18.indexOf((java.lang.Object) node37);
        boolean boolean44 = node10.isEquivalentTo(node37);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node(0);
        node46.putIntProp((-1), 35);
        boolean boolean50 = node46.isReturn();
        com.google.javascript.rhino.InputId inputId51 = node46.getInputId();
        node46.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node54 = node10.useSourceInfoIfMissingFrom(node46);
        boolean boolean55 = node46.isDo();
        boolean boolean56 = node4.isEquivalentTo(node46);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node(46, node4, (int) (byte) -1, 16);
        boolean boolean60 = node4.hasOneChild();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(staticSourceFile6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceList18);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(charSequenceSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(inputId51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03989");
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
        boolean boolean54 = parameterizedType48.isCheckedUnknownType();
        com.google.javascript.rhino.jstype.JSType jSType55 = parameterizedType48.getTypeOfThis();
        com.google.javascript.rhino.jstype.JSType jSType56 = parameterizedType48.getParameterType();
        com.google.javascript.rhino.jstype.JSType jSType57 = parameterizedType48.collapseUnion();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jSType55);
        org.junit.Assert.assertNotNull(jSType56);
        org.junit.Assert.assertNotNull(jSType57);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03990");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = functionType85.isDateType();
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
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03991");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags((int) ' ');
        sideEffectFlags1.clearAllFlags();
        sideEffectFlags1.setReturnsTainted();
        sideEffectFlags1.clearAllFlags();
        int int5 = sideEffectFlags1.valueOf();
        sideEffectFlags1.clearSideEffectFlags();
        sideEffectFlags1.setMutatesArguments();
        sideEffectFlags1.setMutatesThis();
        int int9 = sideEffectFlags1.valueOf();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03992");
        com.google.javascript.rhino.Node node2 = new com.google.javascript.rhino.Node(0);
        boolean boolean3 = node2.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = node2.getStaticSourceFile();
        com.google.javascript.rhino.Node node5 = node2.getNext();
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node(0);
        node7.putIntProp((-1), 35);
        boolean boolean11 = node7.isStringKey();
        boolean boolean12 = node7.isThrow();
        boolean boolean13 = node7.isEmpty();
        com.google.javascript.rhino.Node node14 = node2.copyInformationFrom(node7);
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node(0);
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node(0);
        node18.putIntProp((-1), 35);
        boolean boolean22 = node18.isStringKey();
        boolean boolean23 = node18.isThrow();
        com.google.javascript.rhino.Node node24 = node16.useSourceInfoFrom(node18);
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node(0);
        boolean boolean27 = node26.isCall();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(0);
        node30.putIntProp((-1), 35);
        boolean boolean34 = node30.isReturn();
        com.google.common.collect.ImmutableList<java.lang.Object> objList35 = com.google.common.collect.ImmutableList.of((java.lang.Object) node2, (java.lang.Object) node18, (java.lang.Object) node26, (java.lang.Object) 53, (java.lang.Object) node30);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = node30.getStaticSourceFile();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node(0);
        boolean boolean39 = node38.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile40 = node38.getStaticSourceFile();
        java.lang.String str41 = node38.getSourceFileName();
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
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node(0);
        boolean boolean79 = node78.isInstanceOf();
        node71.addChildrenToFront(node78);
        int int81 = node71.getSourceOffset();
        boolean boolean82 = node71.isVoid();
        com.google.javascript.rhino.Node node83 = node38.useSourceInfoIfMissingFrom(node71);
        boolean boolean84 = node71.isOr();
        com.google.javascript.rhino.Node node85 = node30.srcref(node71);
        int int86 = node30.getSourceOffset();
        com.google.javascript.rhino.Node node88 = new com.google.javascript.rhino.Node(0);
        boolean boolean89 = node88.isInstanceOf();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile90 = node88.getStaticSourceFile();
        com.google.javascript.rhino.Node node91 = node30.srcref(node88);
        com.google.javascript.rhino.Node node94 = new com.google.javascript.rhino.Node(23, node88, 19, 35);
        node88.setSourceEncodedPosition((-2147483648));
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable97 = node88.siblings();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(staticSourceFile4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objList35);
        org.junit.Assert.assertNull(staticSourceFile36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(staticSourceFile40);
        org.junit.Assert.assertNull(str41);
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
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(staticSourceFile90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertNotNull(nodeIterable97);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03993");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "java.io.IOException: function (): {2129138287}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03994");
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
        boolean boolean38 = functionType36.removeProperty("false");
        com.google.javascript.rhino.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry42 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter40, true);
        com.google.javascript.rhino.jstype.JSType jSType44 = null;
        jSTypeRegistry42.unregisterPropertyOnType("(Not declared as a type name)", jSType44);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray48 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType49 = jSTypeRegistry42.createFunctionType(jSType46, true, jSTypeArray48);
        boolean boolean51 = functionType49.removeProperty("false");
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node(0);
        node53.putIntProp((-1), 35);
        boolean boolean57 = node53.isStringKey();
        boolean boolean58 = node53.isThrow();
        com.google.javascript.rhino.Node node62 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj64 = node62.getProp((int) (byte) 10);
        boolean boolean65 = node53.isEquivalentToTyped(node62);
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node(0);
        node68.putIntProp((-1), 35);
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node(32, node68);
        boolean boolean73 = node72.isInstanceOf();
        com.google.javascript.rhino.Node node74 = node62.useSourceInfoFromForTree(node72);
        boolean boolean75 = node72.isDo();
        boolean boolean76 = functionType36.defineInferredProperty("NUMBER 0.0", (com.google.javascript.rhino.jstype.JSType) functionType49, node72);
        boolean boolean78 = functionType36.removeProperty("Unknown class name");
        com.google.javascript.rhino.Node node81 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        com.google.javascript.rhino.Node node85 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        java.lang.Object obj87 = node85.getProp((int) (byte) 10);
        int int88 = node81.getIndexOfChild(node85);
        functionType36.setSource(node81);
        boolean boolean90 = functionType36.isDateType();
        com.google.javascript.rhino.jstype.ObjectType objectType91 = functionType36.getImplicitPrototype();
        objectType91.clearCachedValues();
        com.google.javascript.rhino.jstype.JSType.TypePair typePair93 = functionType21.getTypesUnderInequality((com.google.javascript.rhino.jstype.JSType) objectType91);
        com.google.javascript.rhino.jstype.JSType jSType94 = objectType91.autobox();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeArray48);
        org.junit.Assert.assertNotNull(functionType49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(objectType91);
        org.junit.Assert.assertNotNull(typePair93);
        org.junit.Assert.assertNotNull(jSType94);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03995");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber(0.0d, 100, (int) (short) 100);
        boolean boolean4 = node3.isEmpty();
        com.google.javascript.rhino.InputId inputId5 = null;
        node3.setInputId(inputId5);
        boolean boolean7 = node3.isParamList();
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node3);
        // The following exception was thrown during execution in test generation
        try {
            node3.setString("{proxy:function (): {229577107}}");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 100 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03996");
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
        com.google.javascript.rhino.jstype.JSType jSType84 = enumType81.getPropertyType("function (): {542283849}");
        com.google.javascript.rhino.jstype.JSType jSType85 = enumType81.restrictByNotNullOrUndefined();
        boolean boolean86 = enumType81.hasCachedValues();
        com.google.javascript.rhino.jstype.ObjectType.Property property88 = enumType81.getSlot("{proxy:function (): {1602355980}}");
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
        org.junit.Assert.assertNotNull(jSType84);
        org.junit.Assert.assertNotNull(jSType85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(property88);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03997");
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
        java.lang.Iterable<com.google.javascript.rhino.jstype.ObjectType> objectTypeIterable15 = functionType9.getAllExtendedInterfaces();
        com.google.javascript.rhino.Node node17 = functionType9.getPropertyNode("Not declared as a constructor");
        boolean boolean18 = functionType9.isInterface();
        boolean boolean19 = functionType9.matchesStringContext();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectTypeIterable15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03998");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasThisType();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getParameterType("[hi!, hi!, , , hi!]");
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        java.util.Collection<java.lang.String> strCollection8 = jSDocInfo0.getAuthors();
        java.lang.String str9 = jSDocInfo0.getReturnDescription();
        boolean boolean11 = jSDocInfo0.hasDescriptionForParameter("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = jSDocInfo0.getVisibility();
        java.lang.String str14 = jSDocInfo0.getDescriptionForParameter("function (): {122316613}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(visibility12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test03999");
        com.google.javascript.rhino.ErrorReporter errorReporter0 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = new com.google.javascript.rhino.jstype.JSTypeRegistry(errorReporter0, true);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        jSTypeRegistry2.unregisterPropertyOnType("(Not declared as a type name)", jSType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType[] jSTypeArray8 = new com.google.javascript.rhino.jstype.JSType[] {};
        com.google.javascript.rhino.jstype.FunctionType functionType9 = jSTypeRegistry2.createFunctionType(jSType6, true, jSTypeArray8);
        com.google.javascript.rhino.jstype.JSType jSType10 = functionType9.restrictByNotNullOrUndefined();
        com.google.javascript.rhino.jstype.EnumType enumType11 = functionType9.toMaybeEnumType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = enumType11.matchesNumberContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(jSType10);
        org.junit.Assert.assertNull(enumType11);
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test04000");
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
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = jSDocInfo13.getVisibility();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = jSDocInfo13.getThisType();
        boolean boolean22 = jSDocInfo13.isOverride();
        org.junit.Assert.assertNotNull(jSTypeArray8);
        org.junit.Assert.assertNotNull(functionType9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(visibility20);
        org.junit.Assert.assertNull(jSTypeExpression21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }
}
