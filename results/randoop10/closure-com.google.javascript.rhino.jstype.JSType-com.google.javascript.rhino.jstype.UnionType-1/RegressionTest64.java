import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest64 {

    public static boolean debug = false;

    @Test
    public void test32001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32001");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasParameterType("Named type with empty name component");
        boolean boolean8 = jSDocInfo0.isExpose();
        boolean boolean9 = jSDocInfo0.isConstant();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test32002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32002");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExport();
        boolean boolean10 = jSDocInfo0.isExpose();
        boolean boolean12 = jSDocInfo0.hasParameter("(hi!)");
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection13 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getType();
        java.util.Set<java.lang.String> strSet15 = jSDocInfo0.getModifies();
        boolean boolean16 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(markerCollection13);
        org.junit.Assert.assertNull(jSTypeExpression14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test32003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32003");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str5 = jSDocInfo0.getMeaning();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        boolean boolean7 = jSDocInfo0.hasModifies();
        boolean boolean8 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test32004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32004");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        boolean boolean4 = typePosition0.hasBrackets();
        boolean boolean5 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node6 = typePosition0.getItem();
        int int7 = typePosition0.getPositionOnEndLine();
        int int8 = typePosition0.getEndLine();
        com.google.javascript.rhino.Node node9 = null;
        typePosition0.setItem(node9);
        com.google.javascript.rhino.Node node11 = typePosition0.getItem();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test32005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32005");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        java.lang.String str8 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean9 = jSDocInfo0.isJavaDispatch();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getAuthors();
        java.lang.String str11 = jSDocInfo0.getReturnDescription();
        java.lang.String str12 = jSDocInfo0.toString();
        boolean boolean13 = jSDocInfo0.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getThisType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(visibility6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSDocInfo" + "'", str12, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeExpression14);
    }

    @Test
    public void test32006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32006");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("Named type with empty name component");
        int int11 = jSDocInfo0.getParameterCount();
        java.util.Collection<java.lang.String> strCollection12 = jSDocInfo0.getReferences();
        int int13 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean15 = jSDocInfo0.hasDescriptionForParameter("hi!");
        boolean boolean16 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str17 = jSDocInfo0.getMeaning();
        boolean boolean18 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = jSDocInfo0.getEnumParameterType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList20 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strCollection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jSTypeExpression19);
        org.junit.Assert.assertNotNull(jSTypeExpressionList20);
    }

    @Test
    public void test32007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32007");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        boolean boolean4 = jSDocInfo0.hasModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        boolean boolean6 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.isConstant();
        boolean boolean8 = jSDocInfo0.isHidden();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test32008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32008");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue11.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue8.xor(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue1.or(ternaryValue14);
        boolean boolean18 = ternaryValue14.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str22 = ternaryValue21.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = ternaryValue19.and(ternaryValue21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        java.lang.String str25 = ternaryValue24.toString();
        java.lang.String str26 = ternaryValue24.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue19.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue14.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue28.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        java.lang.String str31 = ternaryValue30.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue32.or(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = ternaryValue36.or(ternaryValue38);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue34.xor(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = ternaryValue41.or(ternaryValue43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = ternaryValue45.or(ternaryValue47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = ternaryValue43.xor(ternaryValue48);
        java.lang.String str50 = ternaryValue49.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue40.xor(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue51.and(ternaryValue52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str57 = ternaryValue56.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue54.and(ternaryValue56);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue51.or(ternaryValue54);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue30.and(ternaryValue59);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = ternaryValue30.and(ternaryValue62);
        boolean boolean65 = ternaryValue62.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = ternaryValue62.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = ternaryValue28.xor(ternaryValue62);
        java.lang.String str68 = ternaryValue62.toString();
        boolean boolean70 = ternaryValue62.toBoolean(true);
        java.lang.String str71 = ternaryValue62.toString();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "true" + "'", str22, "true");
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "false" + "'", str25, "false");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "false" + "'", str26, "false");
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "false" + "'", str31, "false");
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "false" + "'", str50, "false");
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "true" + "'", str57, "true");
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(ternaryValue62);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "false" + "'", str68, "false");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "false" + "'", str71, "false");
    }

    @Test
    public void test32009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32009");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("(())");
        stringPosition0.setItem("Not declared as a type name");
        int int14 = stringPosition0.getPositionOnStartLine();
        java.lang.String str15 = stringPosition0.getItem();
        int int16 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation((int) (byte) -1, 0, 10, 100);
        int int22 = stringPosition0.getEndLine();
        int int23 = stringPosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not declared as a type name" + "'", str15, "Not declared as a type name");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test32010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32010");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        boolean boolean8 = jSDocInfo0.isNoShadow();
        jSDocInfo0.setDeprecated(false);
        java.lang.String str11 = jSDocInfo0.getLendsName();
        int int12 = jSDocInfo0.getParameterCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo0.setVisibility(visibility13);
        java.util.Collection<java.lang.String> strCollection15 = jSDocInfo0.getReferences();
        java.lang.String str16 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + visibility13 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility13.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertNull(strCollection15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test32011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32011");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        java.lang.String str6 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getType();
        boolean boolean8 = jSDocInfo0.isImplicitCast();
        java.lang.String str9 = jSDocInfo0.getMeaning();
        java.lang.String str10 = jSDocInfo0.getLicense();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection11 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(nodeCollection11);
    }

    @Test
    public void test32012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32012");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLendsName();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getAuthors();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        boolean boolean7 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strCollection5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test32013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32013");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        boolean boolean7 = jSDocInfo0.hasModifies();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getType();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test32014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32014");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getReturnType();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getSuppressions();
        java.lang.String str5 = jSDocInfo0.getDescriptionForParameter("(Not declared as a type name)");
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        jSDocInfo0.setLicense("(((Named type with empty name component)))");
        com.google.javascript.rhino.Node node9 = null;
        jSDocInfo0.setAssociatedNode(node9);
        boolean boolean11 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test32015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32015");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        boolean boolean6 = jSDocInfo0.hasModifies();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        boolean boolean8 = jSDocInfo0.hasModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test32016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32016");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition6 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition10 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition11 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition12 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition13 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition14 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition15 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition16 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition17 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition18 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition19 = marker0.getDescription();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(typePosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(nodeSourcePosition6);
        org.junit.Assert.assertNull(typePosition7);
        org.junit.Assert.assertNull(stringPosition8);
        org.junit.Assert.assertNull(stringPosition9);
        org.junit.Assert.assertNull(typePosition10);
        org.junit.Assert.assertNull(stringPosition11);
        org.junit.Assert.assertNull(stringPosition12);
        org.junit.Assert.assertNull(typePosition13);
        org.junit.Assert.assertNull(typePosition14);
        org.junit.Assert.assertNull(typePosition15);
        org.junit.Assert.assertNull(nodeSourcePosition16);
        org.junit.Assert.assertNull(typePosition17);
        org.junit.Assert.assertNull(typePosition18);
        org.junit.Assert.assertNull(stringPosition19);
    }

    @Test
    public void test32017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32017");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getDescription();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
    }

    @Test
    public void test32018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32018");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getReferences();
        java.lang.String str7 = jSDocInfo0.getReturnDescription();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        java.lang.String str9 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test32019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32019");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition6 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker0.getAnnotation();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(typePosition5);
        org.junit.Assert.assertNull(nodeSourcePosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(typePosition8);
        org.junit.Assert.assertNull(stringPosition9);
    }

    @Test
    public void test32020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32020");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        boolean boolean4 = typePosition0.hasBrackets();
        int int5 = typePosition0.getEndLine();
        int int6 = typePosition0.getPositionOnStartLine();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test32021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32021");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean5 = jSDocInfo0.hasType();
        java.lang.String str6 = jSDocInfo0.getFileOverview();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strCollection7);
    }

    @Test
    public void test32022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32022");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str5 = jSDocInfo0.toString();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfo0.setAssociatedNode(node6);
        jSDocInfo0.setLicense("(Not declared as a type name)");
        boolean boolean10 = jSDocInfo0.isExterns();
        boolean boolean11 = jSDocInfo0.hasModifies();
        com.google.common.collect.ImmutableList<java.lang.String> strList12 = jSDocInfo0.getTemplateTypeNames();
        int int13 = jSDocInfo0.getParameterCount();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo0.getParameterNames();
        java.util.Set<java.lang.String> strSet15 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test32023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32023");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.Node node7 = null;
        jSDocInfo0.setAssociatedNode(node7);
        boolean boolean9 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean10 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32024");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getAuthors();
        boolean boolean10 = jSDocInfo0.hasThisType();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        boolean boolean12 = jSDocInfo0.isNoAlias();
        boolean boolean13 = jSDocInfo0.isDefine();
        java.lang.String str14 = jSDocInfo0.getDeprecationReason();
        boolean boolean15 = jSDocInfo0.isConstant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test32025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32025");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        boolean boolean4 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        java.lang.String str7 = jSDocInfo0.getVersion();
        boolean boolean8 = jSDocInfo0.isConstructor();
        boolean boolean10 = jSDocInfo0.hasParameterType("(((((Named type with empty name component)))))");
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        boolean boolean12 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test32026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32026");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getStartLine();
        stringPosition0.setItem("(hi!)");
        int int12 = stringPosition0.getPositionOnEndLine();
        int int13 = stringPosition0.getStartLine();
        stringPosition0.setItem("Named type with empty name component");
        java.lang.String str16 = stringPosition0.getItem();
        int int17 = stringPosition0.getPositionOnStartLine();
        int int18 = stringPosition0.getPositionOnStartLine();
        int int19 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Named type with empty name component" + "'", str16, "Named type with empty name component");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test32027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32027");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        jSDocInfo0.addSuppression("Unknown class name");
        boolean boolean8 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str12 = jSDocInfo11.getVersion();
        java.lang.String str13 = jSDocInfo11.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList14 = jSDocInfo11.getExtendedInterfaces();
        java.lang.String str15 = jSDocInfo11.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo11.setVisibility(visibility16);
        jSDocInfo0.setVisibility(visibility16);
        boolean boolean19 = jSDocInfo0.isNoAlias();
        java.lang.String str20 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = jSDocInfo0.getBaseType();
        boolean boolean22 = jSDocInfo0.isOverride();
        boolean boolean23 = jSDocInfo0.isInterface();
        boolean boolean24 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = jSDocInfo0.getReturnType();
        java.lang.String str26 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(jSTypeExpressionList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + visibility16 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility16.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(jSTypeExpression21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSTypeExpression25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test32028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32028");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("Named type with empty name component");
        int int11 = jSDocInfo0.getParameterCount();
        java.util.Collection<java.lang.String> strCollection12 = jSDocInfo0.getAuthors();
        java.lang.String str13 = jSDocInfo0.getReturnDescription();
        java.lang.String str14 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strCollection12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertNull(jSTypeExpression16);
    }

    @Test
    public void test32029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32029");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getParameterType("Named type with empty name component");
        java.lang.String str11 = jSDocInfo0.getBlockDescription();
        boolean boolean12 = jSDocInfo0.isNoCompile();
        boolean boolean13 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test32030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32030");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        int int9 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean10 = jSDocInfo0.isDeprecated();
        boolean boolean11 = jSDocInfo0.isNoSideEffects();
        boolean boolean12 = jSDocInfo0.isNoShadow();
        boolean boolean13 = jSDocInfo0.isDefine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test32031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32031");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        java.lang.String str10 = jSDocInfo0.getSourceName();
        boolean boolean11 = jSDocInfo0.isInterface();
        java.lang.String str12 = jSDocInfo0.getBlockDescription();
        java.lang.String str13 = jSDocInfo0.getLendsName();
        jSDocInfo0.setLicense("((((((Not declared as a constructor))))))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test32032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32032");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue11.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue8.xor(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue1.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue17.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue21.or(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue17.xor(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue1.xor(ternaryValue25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue1.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        java.lang.String str30 = ternaryValue29.toString();
        java.lang.String str31 = ternaryValue29.toString();
        boolean boolean33 = ternaryValue29.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue27.and(ternaryValue29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str37 = ternaryValue36.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue38.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue42.or(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue40.xor(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = ternaryValue47.or(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue51.or(ternaryValue53);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue49.xor(ternaryValue54);
        java.lang.String str56 = ternaryValue55.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue46.xor(ternaryValue55);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue57.and(ternaryValue58);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue36.xor(ternaryValue57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = ternaryValue61.or(ternaryValue63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = ternaryValue65.or(ternaryValue67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = ternaryValue61.xor(ternaryValue67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = ternaryValue70.or(ternaryValue72);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = ternaryValue67.xor(ternaryValue73);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = ternaryValue36.xor(ternaryValue74);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue78 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue82 = ternaryValue79.or(ternaryValue81);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue83 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue86 = ternaryValue83.or(ternaryValue85);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue87 = ternaryValue79.xor(ternaryValue85);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue88 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue90 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue91 = ternaryValue88.or(ternaryValue90);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue92 = ternaryValue85.xor(ternaryValue91);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue93 = ternaryValue78.or(ternaryValue91);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue94 = ternaryValue76.or(ternaryValue93);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue95 = ternaryValue36.or(ternaryValue93);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue96 = ternaryValue34.or(ternaryValue93);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue97 = ternaryValue34.not();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "false" + "'", str30, "false");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "false" + "'", str31, "false");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "true" + "'", str37, "true");
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "false" + "'", str56, "false");
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertNotNull(ternaryValue78);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertNotNull(ternaryValue81);
        org.junit.Assert.assertNotNull(ternaryValue82);
        org.junit.Assert.assertNotNull(ternaryValue83);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertNotNull(ternaryValue86);
        org.junit.Assert.assertNotNull(ternaryValue87);
        org.junit.Assert.assertNotNull(ternaryValue88);
        org.junit.Assert.assertNotNull(ternaryValue90);
        org.junit.Assert.assertNotNull(ternaryValue91);
        org.junit.Assert.assertNotNull(ternaryValue92);
        org.junit.Assert.assertNotNull(ternaryValue93);
        org.junit.Assert.assertNotNull(ternaryValue94);
        org.junit.Assert.assertNotNull(ternaryValue95);
        org.junit.Assert.assertNotNull(ternaryValue96);
        org.junit.Assert.assertNotNull(ternaryValue97);
    }

    @Test
    public void test32033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32033");
        com.google.javascript.rhino.jstype.ObjectType objectType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType2 = com.google.javascript.rhino.jstype.FunctionType.getTopDefiningInterface(objectType0, "((((((((hi!))))))))");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32034");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isOverride();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        boolean boolean8 = jSDocInfo0.hasType();
        boolean boolean9 = jSDocInfo0.isInterface();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getReferences();
        boolean boolean11 = jSDocInfo0.shouldPreserveTry();
        boolean boolean12 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test32035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32035");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        java.lang.String str6 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("Unknown class name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getReturnType();
        java.lang.String str11 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getImplementedInterfaces();
        int int13 = jSDocInfo0.getParameterCount();
        int int14 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test32036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32036");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.hasThisType();
        boolean boolean7 = jSDocInfo0.isImplicitCast();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str10 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test32037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32037");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        boolean boolean4 = jSDocInfo0.hasModifies();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection7 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getReferences();
        boolean boolean10 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(markerCollection7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32038");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition10 = marker0.getName();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
        org.junit.Assert.assertNull(stringPosition9);
        org.junit.Assert.assertNull(stringPosition10);
    }

    @Test
    public void test32039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32039");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.hasParameter("(Not declared as a type name)");
        boolean boolean4 = jSDocInfo0.containsDeclaration();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getReferences();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfo0.setAssociatedNode(node6);
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = jSDocInfo0.getVisibility();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection11 = jSDocInfo0.getTypeNodes();
        boolean boolean12 = jSDocInfo0.shouldPreserveTry();
        boolean boolean13 = jSDocInfo0.containsDeclaration();
        java.util.Collection<java.lang.String> strCollection14 = jSDocInfo0.getReferences();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(visibility10);
        org.junit.Assert.assertNotNull(nodeCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strCollection14);
    }

    @Test
    public void test32040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32040");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        boolean boolean6 = jSDocInfo0.isInterface();
        java.lang.String str7 = jSDocInfo0.getVersion();
        boolean boolean9 = jSDocInfo0.hasParameter("Unknown class name");
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        java.lang.String str11 = jSDocInfo0.getMeaning();
        boolean boolean12 = jSDocInfo0.isDefine();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test32041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32041");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        jSDocInfo0.setDeprecated(false);
        com.google.javascript.rhino.Node node10 = null;
        jSDocInfo0.setAssociatedNode(node10);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getThrownTypes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getParameterType("(((JSDocInfo)))");
        java.lang.String str15 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
        org.junit.Assert.assertNull(jSTypeExpression14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test32042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32042");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getReferences();
        java.lang.String str7 = jSDocInfo0.getReturnDescription();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getReferences();
        jSDocInfo0.addSuppression("(hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strCollection9);
    }

    @Test
    public void test32043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32043");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        boolean boolean5 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getBaseType();
        boolean boolean7 = jSDocInfo0.hasThisType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        boolean boolean9 = jSDocInfo0.hasFileOverview();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test32044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32044");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        stringPosition0.setItem("Not declared as a constructor");
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("((true))");
        int int10 = stringPosition0.getStartLine();
        int int11 = stringPosition0.getStartLine();
        stringPosition0.setPositionInformation((int) '4', (int) (short) 1, (int) (short) 100, (int) (short) 1);
        int int17 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test32045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32045");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        com.google.javascript.rhino.Node node1 = typePosition0.getItem();
        com.google.javascript.rhino.Node node2 = null;
        typePosition0.setItem(node2);
        com.google.javascript.rhino.Node node4 = typePosition0.getItem();
        boolean boolean5 = typePosition0.hasBrackets();
        boolean boolean6 = typePosition0.hasBrackets();
        int int7 = typePosition0.getPositionOnStartLine();
        typePosition0.setPositionInformation((-1), 35, (int) (byte) 0, 52);
        boolean boolean13 = typePosition0.hasBrackets();
        int int14 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node15 = typePosition0.getItem();
        com.google.javascript.rhino.Node node16 = null;
        typePosition0.setItem(node16);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test32046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32046");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        boolean boolean10 = jSDocInfo0.hasParameter("Unknown class name");
        boolean boolean11 = jSDocInfo0.isNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getReturnType();
        java.lang.String str13 = jSDocInfo0.toString();
        boolean boolean14 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSDocInfo" + "'", str13, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test32047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32047");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("");
        boolean boolean8 = jSDocInfo0.hasFileOverview();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = jSDocInfo0.getTypeNodes();
        jSDocInfo0.addSuppression("(((((unknown)))))");
        java.lang.String str12 = jSDocInfo0.getDescription();
        boolean boolean13 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test32048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32048");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue0 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue3 = ternaryValue0.or(ternaryValue2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = ternaryValue4.or(ternaryValue6);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = ternaryValue2.xor(ternaryValue7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue9.or(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = ternaryValue11.xor(ternaryValue16);
        java.lang.String str18 = ternaryValue17.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = ternaryValue8.xor(ternaryValue17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue22.or(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = ternaryValue26.or(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = ternaryValue22.xor(ternaryValue28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = ternaryValue31.or(ternaryValue33);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = ternaryValue28.xor(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue21.or(ternaryValue34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = ternaryValue37.or(ternaryValue39);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue21.xor(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue8.xor(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue43.or(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = ternaryValue47.or(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = ternaryValue45.xor(ternaryValue50);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue52.or(ternaryValue54);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue59 = ternaryValue56.or(ternaryValue58);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue54.xor(ternaryValue59);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = ternaryValue61.or(ternaryValue63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = ternaryValue65.or(ternaryValue67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = ternaryValue63.xor(ternaryValue68);
        java.lang.String str70 = ternaryValue69.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = ternaryValue60.xor(ternaryValue69);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue75 = ternaryValue72.or(ternaryValue74);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue78 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = ternaryValue76.or(ternaryValue78);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue80 = ternaryValue72.xor(ternaryValue78);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue83 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue84 = ternaryValue81.or(ternaryValue83);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue85 = ternaryValue78.xor(ternaryValue84);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue86 = ternaryValue84.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue87 = ternaryValue60.and(ternaryValue86);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue88 = ternaryValue45.xor(ternaryValue86);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue89 = ternaryValue41.and(ternaryValue88);
        java.lang.String str90 = ternaryValue89.toString();
        org.junit.Assert.assertNotNull(ternaryValue0);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue3);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "false" + "'", str18, "false");
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue59);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "false" + "'", str70, "false");
        org.junit.Assert.assertNotNull(ternaryValue71);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertNotNull(ternaryValue75);
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertNotNull(ternaryValue78);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertNotNull(ternaryValue80);
        org.junit.Assert.assertNotNull(ternaryValue81);
        org.junit.Assert.assertNotNull(ternaryValue83);
        org.junit.Assert.assertNotNull(ternaryValue84);
        org.junit.Assert.assertNotNull(ternaryValue85);
        org.junit.Assert.assertNotNull(ternaryValue86);
        org.junit.Assert.assertNotNull(ternaryValue87);
        org.junit.Assert.assertNotNull(ternaryValue88);
        org.junit.Assert.assertNotNull(ternaryValue89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "false" + "'", str90, "false");
    }

    @Test
    public void test32049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32049");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        boolean boolean9 = jSDocInfo0.isExterns();
        boolean boolean10 = jSDocInfo0.isImplicitCast();
        java.lang.String str11 = jSDocInfo0.getLendsName();
        boolean boolean12 = jSDocInfo0.isOverride();
        boolean boolean13 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test32050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32050");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean7 = jSDocInfo0.hasBaseType();
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str10 = jSDocInfo9.getVersion();
        java.lang.String str11 = jSDocInfo9.getBlockDescription();
        java.lang.String str12 = jSDocInfo9.getFileOverview();
        boolean boolean13 = jSDocInfo9.isNoSideEffects();
        java.lang.String str14 = jSDocInfo9.getLicense();
        boolean boolean15 = jSDocInfo9.hasModifies();
        boolean boolean16 = jSDocInfo9.isNoCompile();
        java.util.Set<java.lang.String> strSet17 = jSDocInfo9.getModifies();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str19 = jSDocInfo18.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = jSDocInfo18.getType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility21 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo18.setVisibility(visibility21);
        jSDocInfo9.setVisibility(visibility21);
        jSDocInfo0.setVisibility(visibility21);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList25 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(jSTypeExpression20);
        org.junit.Assert.assertTrue("'" + visibility21 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility21.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNotNull(jSTypeExpressionList25);
    }

    @Test
    public void test32051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32051");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.hasParameterType("Not declared as a type name");
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test32052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32052");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getAuthors();
        boolean boolean7 = jSDocInfo0.isDefine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test32053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32053");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.isConstant();
        boolean boolean6 = jSDocInfo0.hasParameterType("(true)");
        int int7 = jSDocInfo0.getParameterCount();
        boolean boolean8 = jSDocInfo0.hasType();
        int int9 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean10 = jSDocInfo0.isExpose();
        boolean boolean11 = jSDocInfo0.isNoCompile();
        java.lang.String str12 = jSDocInfo0.toString();
        boolean boolean13 = jSDocInfo0.isDeprecated();
        boolean boolean14 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSDocInfo" + "'", str12, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test32054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32054");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        jSDocInfo0.setLicense("hi!");
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        java.lang.String str6 = jSDocInfo0.getDescription();
        int int7 = jSDocInfo0.getParameterCount();
        boolean boolean8 = jSDocInfo0.isConstant();
        java.lang.String str9 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getParameterType("true");
        boolean boolean12 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test32055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32055");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getSourceName();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean4 = jSDocInfo0.hasParameter("Named type with empty name component");
        java.lang.String str5 = jSDocInfo0.getDescription();
        boolean boolean7 = jSDocInfo0.hasParameterType("(unknown)");
        jSDocInfo0.addSuppression("true");
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strCollection10);
    }

    @Test
    public void test32056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32056");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str3 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.isInterface();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        boolean boolean6 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        boolean boolean8 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test32057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32057");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean4 = jSDocInfo0.hasParameterType("Not declared as a type name");
        boolean boolean5 = jSDocInfo0.isOverride();
        boolean boolean6 = jSDocInfo0.hasType();
        java.lang.String str7 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        boolean boolean10 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32058");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        int int13 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str14 = jSDocInfo0.getLendsName();
        java.lang.String str15 = jSDocInfo0.getVersion();
        java.lang.String str16 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test32059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32059");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setItem("Named type with empty name component");
        java.lang.String str4 = stringPosition0.getItem();
        int int5 = stringPosition0.getPositionOnEndLine();
        int int6 = stringPosition0.getEndLine();
        int int7 = stringPosition0.getStartLine();
        int int8 = stringPosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Named type with empty name component" + "'", str4, "Named type with empty name component");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test32060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32060");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasParameterType("");
        boolean boolean6 = jSDocInfo0.hasTypedefType();
        boolean boolean7 = jSDocInfo0.isOverride();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test32061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32061");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        boolean boolean3 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.hasEnumParameterType();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        boolean boolean8 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test32062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32062");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node7 = namePosition0.getItem();
        int int8 = namePosition0.getPositionOnEndLine();
        int int9 = namePosition0.getEndLine();
        int int10 = namePosition0.getStartLine();
        int int11 = namePosition0.getPositionOnEndLine();
        int int12 = namePosition0.getEndLine();
        int int13 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node14 = null;
        namePosition0.setItem(node14);
        int int16 = namePosition0.getPositionOnStartLine();
        int int17 = namePosition0.getPositionOnStartLine();
        int int18 = namePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test32063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32063");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getReferences();
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        boolean boolean8 = jSDocInfo0.hasBaseType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        boolean boolean10 = jSDocInfo0.isNoShadow();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getParameterType("Not declared as a constructor");
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection14 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(markerCollection6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertNotNull(markerCollection14);
    }

    @Test
    public void test32064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32064");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getBaseType();
        java.lang.String str11 = jSDocInfo0.getBlockDescription();
        boolean boolean12 = jSDocInfo0.isIdGenerator();
        java.util.Collection<java.lang.String> strCollection13 = jSDocInfo0.getAuthors();
        boolean boolean14 = jSDocInfo0.isNoShadow();
        boolean boolean15 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test32065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32065");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getPositionOnStartLine();
        java.lang.String str3 = stringPosition0.getItem();
        int int4 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test32066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32066");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        java.lang.String str10 = jSDocInfo0.getFileOverview();
        java.lang.String str11 = jSDocInfo0.getOriginalCommentString();
        boolean boolean12 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test32067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32067");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        com.google.javascript.rhino.jstype.JSType.TypePair typePair2 = new com.google.javascript.rhino.jstype.JSType.TypePair(jSType0, jSType1);
        com.google.javascript.rhino.jstype.JSType jSType3 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType4 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType5 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType6 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType7 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType8 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType9 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType10 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType11 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType12 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType13 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType14 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType15 = typePair2.typeB;
        com.google.javascript.rhino.jstype.JSType jSType16 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType17 = typePair2.typeA;
        com.google.javascript.rhino.jstype.JSType jSType18 = typePair2.typeA;
        org.junit.Assert.assertNull(jSType3);
        org.junit.Assert.assertNull(jSType4);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test32068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32068");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("Named type with empty name component");
        int int11 = jSDocInfo0.getParameterCount();
        jSDocInfo0.addSuppression("()");
        java.util.Collection<java.lang.String> strCollection14 = jSDocInfo0.getReferences();
        boolean boolean15 = jSDocInfo0.hasEnumParameterType();
        boolean boolean16 = jSDocInfo0.hasModifies();
        int int17 = jSDocInfo0.getExtendedInterfacesCount();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList18 = jSDocInfo0.getThrownTypes();
        java.lang.String str19 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(jSTypeExpressionList18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test32069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32069");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        boolean boolean7 = jSDocInfo0.hasModifies();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test32070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32070");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean7 = jSDocInfo0.hasDescriptionForParameter("Not declared as a type name");
        boolean boolean9 = jSDocInfo0.hasDescriptionForParameter("()");
        boolean boolean10 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str11 = jSDocInfo0.getReturnDescription();
        java.lang.String str12 = jSDocInfo0.getLendsName();
        boolean boolean13 = jSDocInfo0.hasTypedefType();
        int int14 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo0.getType();
        boolean boolean16 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test32071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32071");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        boolean boolean5 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        boolean boolean9 = jSDocInfo0.isDefine();
        boolean boolean10 = jSDocInfo0.isNoTypeCheck();
        int int11 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test32072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32072");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = ternaryValue11.or(ternaryValue13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = ternaryValue8.xor(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue1.or(ternaryValue14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue17.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = ternaryValue21.or(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = ternaryValue17.xor(ternaryValue23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue1.xor(ternaryValue25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue1.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = ternaryValue30.or(ternaryValue32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue34.or(ternaryValue36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = ternaryValue30.xor(ternaryValue36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = ternaryValue39.or(ternaryValue41);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue43 = ternaryValue36.xor(ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = ternaryValue29.or(ternaryValue42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = ternaryValue45.or(ternaryValue47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue52 = ternaryValue49.or(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = ternaryValue45.xor(ternaryValue51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue29.xor(ternaryValue53);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue53.and(ternaryValue56);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = ternaryValue27.or(ternaryValue57);
        java.lang.String str59 = ternaryValue58.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = ternaryValue58.not();
        boolean boolean62 = ternaryValue58.toBoolean(true);
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "unknown" + "'", str59, "unknown");
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test32073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32073");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        boolean boolean6 = jSDocInfo0.isNoCompile();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getType();
        boolean boolean9 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str11 = jSDocInfo10.getVersion();
        java.lang.String str12 = jSDocInfo10.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo10.getReturnType();
        boolean boolean14 = jSDocInfo10.isExterns();
        boolean boolean15 = jSDocInfo10.hasType();
        boolean boolean17 = jSDocInfo10.hasDescriptionForParameter("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        jSDocInfo10.setVisibility(visibility18);
        boolean boolean20 = jSDocInfo10.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str22 = jSDocInfo21.getLendsName();
        boolean boolean23 = jSDocInfo21.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList24 = jSDocInfo21.getThrownTypes();
        java.util.Set<java.lang.String> strSet25 = jSDocInfo21.getParameterNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = jSDocInfo21.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str28 = jSDocInfo27.getVersion();
        java.lang.String str29 = jSDocInfo27.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList30 = jSDocInfo27.getExtendedInterfaces();
        java.lang.String str31 = jSDocInfo27.getOriginalCommentString();
        boolean boolean32 = jSDocInfo27.isImplicitCast();
        java.lang.String str33 = jSDocInfo27.getVersion();
        boolean boolean34 = jSDocInfo27.isNoTypeCheck();
        com.google.javascript.rhino.JSDocInfo jSDocInfo35 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str36 = jSDocInfo35.getVersion();
        java.lang.String str37 = jSDocInfo35.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList38 = jSDocInfo35.getExtendedInterfaces();
        java.lang.String str39 = jSDocInfo35.getOriginalCommentString();
        boolean boolean40 = jSDocInfo35.isImplicitCast();
        java.lang.String str41 = jSDocInfo35.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression43 = jSDocInfo35.getParameterType("Unknown class name");
        boolean boolean44 = jSDocInfo35.isIdGenerator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str46 = jSDocInfo45.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression47 = jSDocInfo45.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = jSDocInfo45.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility49 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo45.setVisibility(visibility49);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression52 = jSDocInfo45.getParameterType("Not declared as a type name");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList53 = jSDocInfo45.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility54 = jSDocInfo45.getVisibility();
        jSDocInfo35.setVisibility(visibility54);
        jSDocInfo27.setVisibility(visibility54);
        jSDocInfo21.setVisibility(visibility54);
        jSDocInfo10.setVisibility(visibility54);
        jSDocInfo0.setVisibility(visibility54);
        java.lang.String str60 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList24);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(jSTypeExpression26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(jSTypeExpressionList30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(jSTypeExpressionList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(jSTypeExpression43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(jSTypeExpression47);
        org.junit.Assert.assertNull(jSTypeExpression48);
        org.junit.Assert.assertTrue("'" + visibility49 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility49.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNull(jSTypeExpression52);
        org.junit.Assert.assertNotNull(jSTypeExpressionList53);
        org.junit.Assert.assertTrue("'" + visibility54 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility54.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test32074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32074");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getStartLine();
        stringPosition0.setItem("(hi!)");
        int int12 = stringPosition0.getPositionOnEndLine();
        int int13 = stringPosition0.getStartLine();
        stringPosition0.setItem("Named type with empty name component");
        java.lang.String str16 = stringPosition0.getItem();
        stringPosition0.setItem("((((Not declared as a type name))))");
        int int19 = stringPosition0.getStartLine();
        int int20 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Named type with empty name component" + "'", str16, "Named type with empty name component");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test32075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32075");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.Node node6 = null;
        jSDocInfo0.setAssociatedNode(node6);
        jSDocInfo0.addSuppression("");
        boolean boolean10 = jSDocInfo0.shouldPreserveTry();
        boolean boolean12 = jSDocInfo0.hasParameter("Not declared as a type name");
        boolean boolean13 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str14 = jSDocInfo0.getVersion();
        boolean boolean15 = jSDocInfo0.isIdGenerator();
        java.util.Set<java.lang.String> strSet16 = jSDocInfo0.getModifies();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList17 = jSDocInfo0.getThrownTypes();
        boolean boolean19 = jSDocInfo0.hasParameterType("(((((((())))))))");
        boolean boolean20 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(jSTypeExpressionList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test32076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32076");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = null;
        jSDocInfo0.setVisibility(visibility6);
        boolean boolean9 = jSDocInfo0.hasParameterType("Named type with empty name component");
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str11 = jSDocInfo10.getVersion();
        int int12 = jSDocInfo10.getExtendedInterfacesCount();
        boolean boolean13 = jSDocInfo10.isIdGenerator();
        boolean boolean14 = jSDocInfo10.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo10.getReturnType();
        boolean boolean16 = jSDocInfo10.isExterns();
        boolean boolean17 = jSDocInfo10.isDefine();
        boolean boolean18 = jSDocInfo10.isConsistentIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList19 = jSDocInfo10.getThrownTypes();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str21 = jSDocInfo20.getVersion();
        java.lang.String str22 = jSDocInfo20.getBlockDescription();
        java.lang.String str23 = jSDocInfo20.getFileOverview();
        boolean boolean24 = jSDocInfo20.isNoSideEffects();
        java.lang.String str25 = jSDocInfo20.getLicense();
        boolean boolean26 = jSDocInfo20.hasModifies();
        boolean boolean27 = jSDocInfo20.isNoCompile();
        boolean boolean28 = jSDocInfo20.containsDeclaration();
        java.lang.String str30 = jSDocInfo20.getDescriptionForParameter("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList31 = jSDocInfo20.getThrownTypes();
        java.lang.String str32 = jSDocInfo20.toString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility33 = com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED;
        jSDocInfo20.setVisibility(visibility33);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility35 = jSDocInfo20.getVisibility();
        jSDocInfo10.setVisibility(visibility35);
        jSDocInfo0.setVisibility(visibility35);
        boolean boolean38 = jSDocInfo0.isDefine();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList39 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean40 = jSDocInfo0.isNoSideEffects();
        boolean boolean41 = jSDocInfo0.hasEnumParameterType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection42 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(jSTypeExpressionList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "JSDocInfo" + "'", str32, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + visibility33 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility33.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + visibility35 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED + "'", visibility35.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(markerCollection42);
    }

    @Test
    public void test32077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32077");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("Named type with empty name component");
        int int11 = jSDocInfo0.getParameterCount();
        java.util.Collection<java.lang.String> strCollection12 = jSDocInfo0.getAuthors();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection13 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.Node node14 = null;
        jSDocInfo0.setAssociatedNode(node14);
        com.google.javascript.rhino.Node node16 = jSDocInfo0.getAssociatedNode();
        boolean boolean17 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strCollection12);
        org.junit.Assert.assertNotNull(markerCollection13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test32078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32078");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str6 = jSDocInfo0.getLendsName();
        boolean boolean7 = jSDocInfo0.hasModifies();
        java.lang.String str8 = jSDocInfo0.getLicense();
        boolean boolean9 = jSDocInfo0.isDefine();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getAuthors();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getTypedefType();
        boolean boolean12 = jSDocInfo0.isDeprecated();
        java.lang.String str13 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test32079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32079");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean7 = jSDocInfo0.hasEnumParameterType();
        com.google.javascript.rhino.Node node8 = null;
        jSDocInfo0.setAssociatedNode(node8);
        int int10 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean11 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test32080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32080");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getDescription();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(typePosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
    }

    @Test
    public void test32081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32081");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("Named type with empty name component");
        java.lang.String str9 = jSDocInfo0.toString();
        boolean boolean10 = jSDocInfo0.isOverride();
        boolean boolean11 = jSDocInfo0.isInterface();
        boolean boolean12 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getReturnType();
        java.lang.String str14 = jSDocInfo0.getVersion();
        java.util.Collection<java.lang.String> strCollection15 = jSDocInfo0.getReferences();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSDocInfo" + "'", str9, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strCollection15);
    }

    @Test
    public void test32082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32082");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        int int7 = namePosition0.getStartLine();
        int int8 = namePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node9 = namePosition0.getItem();
        int int10 = namePosition0.getEndLine();
        int int11 = namePosition0.getPositionOnEndLine();
        namePosition0.setPositionInformation((-1), (int) (short) 1, (int) '#', 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test32083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32083");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getFileOverview();
        boolean boolean5 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        java.lang.String str8 = jSDocInfo0.getOriginalCommentString();
        boolean boolean9 = jSDocInfo0.isConstant();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getSuppressions();
        java.lang.String str12 = jSDocInfo0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test32084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32084");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        int int2 = stringPosition0.getEndLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getPositionOnEndLine();
        java.lang.String str10 = stringPosition0.getItem();
        int int11 = stringPosition0.getEndLine();
        int int12 = stringPosition0.getStartLine();
        java.lang.String str13 = stringPosition0.getItem();
        stringPosition0.setItem("Named type with empty name component");
        stringPosition0.setPositionInformation(10, (-1), (int) '4', 1);
        java.lang.String str21 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Named type with empty name component" + "'", str21, "Named type with empty name component");
    }

    @Test
    public void test32085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32085");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        java.lang.String str8 = jSDocInfo0.getDescriptionForParameter("");
        java.lang.String str9 = jSDocInfo0.getDescription();
        java.lang.String str10 = jSDocInfo0.getLicense();
        boolean boolean11 = jSDocInfo0.isConstant();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        boolean boolean13 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test32086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32086");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str9 = jSDocInfo0.getSourceName();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str13 = jSDocInfo12.getVersion();
        java.lang.String str14 = jSDocInfo12.getBlockDescription();
        java.lang.String str15 = jSDocInfo12.getLicense();
        boolean boolean16 = jSDocInfo12.hasType();
        boolean boolean17 = jSDocInfo12.isConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str19 = jSDocInfo18.getVersion();
        java.lang.String str20 = jSDocInfo18.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList21 = jSDocInfo18.getExtendedInterfaces();
        java.lang.String str22 = jSDocInfo18.getOriginalCommentString();
        boolean boolean23 = jSDocInfo18.isImplicitCast();
        java.lang.String str24 = jSDocInfo18.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = jSDocInfo18.getParameterType("Unknown class name");
        boolean boolean27 = jSDocInfo18.isIdGenerator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str29 = jSDocInfo28.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = jSDocInfo28.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = jSDocInfo28.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility32 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo28.setVisibility(visibility32);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = jSDocInfo28.getParameterType("Not declared as a type name");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList36 = jSDocInfo28.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility37 = jSDocInfo28.getVisibility();
        jSDocInfo18.setVisibility(visibility37);
        jSDocInfo12.setVisibility(visibility37);
        jSDocInfo0.setVisibility(visibility37);
        boolean boolean41 = jSDocInfo0.containsDeclaration();
        boolean boolean42 = jSDocInfo0.isConsistentIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList43 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean45 = jSDocInfo0.hasParameter("(((((((((())))))))))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(jSTypeExpressionList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(jSTypeExpression26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(jSTypeExpression30);
        org.junit.Assert.assertNull(jSTypeExpression31);
        org.junit.Assert.assertTrue("'" + visibility32 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility32.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNull(jSTypeExpression35);
        org.junit.Assert.assertNotNull(jSTypeExpressionList36);
        org.junit.Assert.assertTrue("'" + visibility37 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility37.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test32087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32087");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition6 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition10 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition11 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition12 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition13 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition14 = marker0.getNameNode();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(nodeSourcePosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(typePosition8);
        org.junit.Assert.assertNull(stringPosition9);
        org.junit.Assert.assertNull(stringPosition10);
        org.junit.Assert.assertNull(stringPosition11);
        org.junit.Assert.assertNull(stringPosition12);
        org.junit.Assert.assertNull(typePosition13);
        org.junit.Assert.assertNull(nodeSourcePosition14);
    }

    @Test
    public void test32088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32088");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        boolean boolean4 = jSDocInfo0.isNoAlias();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo0.getMarkers();
        int int7 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(markerCollection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test32089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32089");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        java.lang.String str6 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("Unknown class name");
        boolean boolean9 = jSDocInfo0.isIdGenerator();
        boolean boolean11 = jSDocInfo0.hasDescriptionForParameter("JSDocInfo");
        boolean boolean12 = jSDocInfo0.hasReturnType();
        java.util.Collection<java.lang.String> strCollection13 = jSDocInfo0.getAuthors();
        boolean boolean14 = jSDocInfo0.isNoCompile();
        java.lang.String str15 = jSDocInfo0.toString();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection16 = jSDocInfo0.getMarkers();
        boolean boolean17 = jSDocInfo0.isConstant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSDocInfo" + "'", str15, "JSDocInfo");
        org.junit.Assert.assertNotNull(markerCollection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test32090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32090");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        boolean boolean10 = jSDocInfo0.hasBaseType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection11 = jSDocInfo0.getTypeNodes();
        boolean boolean13 = jSDocInfo0.hasDescriptionForParameter("(Named type with empty name component)");
        java.lang.String str14 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo0.getBaseType();
        com.google.common.collect.ImmutableList<java.lang.String> strList16 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str17 = jSDocInfo0.getLicense();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeCollection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test32091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32091");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        boolean boolean6 = jSDocInfo0.hasParameter("((hi!))");
        boolean boolean7 = jSDocInfo0.isDeprecated();
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("((Not declared as a constructor))");
        boolean boolean10 = jSDocInfo0.hasBaseType();
        java.lang.String str11 = jSDocInfo0.getReturnDescription();
        int int12 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test32092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32092");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        boolean boolean11 = jSDocInfo0.hasDescriptionForParameter("Unknown class name");
        boolean boolean13 = jSDocInfo0.hasParameterType("true");
        boolean boolean14 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = jSDocInfo0.getReturnType();
        boolean boolean16 = jSDocInfo0.isConstant();
        boolean boolean17 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test32093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32093");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getSourceName();
        int int2 = jSDocInfo0.getParameterCount();
        boolean boolean3 = jSDocInfo0.isHidden();
        boolean boolean4 = jSDocInfo0.hasType();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getModifies();
        boolean boolean6 = jSDocInfo0.isJavaDispatch();
        boolean boolean7 = jSDocInfo0.hasEnumParameterType();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.lang.String str9 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test32094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32094");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExport();
        java.lang.String str10 = jSDocInfo0.getVersion();
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection12 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(markerCollection12);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test32095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32095");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.lang.String str5 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasModifies();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        boolean boolean11 = jSDocInfo0.hasDescriptionForParameter("Unknown class name");
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getSuppressions();
        boolean boolean13 = jSDocInfo0.isConstructor();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection14 = jSDocInfo0.getTypeNodes();
        boolean boolean15 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test32096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32096");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        boolean boolean4 = jSDocInfo0.isNoAlias();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getReferences();
        boolean boolean6 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        boolean boolean9 = jSDocInfo0.isDefine();
        boolean boolean10 = jSDocInfo0.isNoAlias();
        boolean boolean11 = jSDocInfo0.hasReturnType();
        java.lang.String str12 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.Node node13 = null;
        jSDocInfo0.setAssociatedNode(node13);
        java.lang.String str15 = jSDocInfo0.getLicense();
        jSDocInfo0.addSuppression("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test32097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32097");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        namePosition0.setPositionInformation((int) '#', (int) (byte) 0, (int) 'a', (int) (short) 0);
        int int6 = namePosition0.getPositionOnEndLine();
        int int7 = namePosition0.getStartLine();
        int int8 = namePosition0.getStartLine();
        int int9 = namePosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test32098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32098");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean3 = jSDocInfo0.isIdGenerator();
        boolean boolean4 = jSDocInfo0.shouldPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getReturnType();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.isDefine();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getThrownTypes();
        jSDocInfo0.setDeprecated(false);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getReturnType();
        boolean boolean13 = jSDocInfo0.isConstant();
        boolean boolean14 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test32099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32099");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        boolean boolean2 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str3 = jSDocInfo0.getDescription();
        boolean boolean5 = jSDocInfo0.hasParameter("false");
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str7 = jSDocInfo0.getVersion();
        jSDocInfo0.addSuppression("(((((((unknown)))))))");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test32100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32100");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("Not declared as a type name");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        int int7 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test32101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32101");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("false");
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        boolean boolean6 = jSDocInfo0.isExpose();
        boolean boolean7 = jSDocInfo0.hasTypedefType();
        java.lang.String str8 = jSDocInfo0.getLicense();
        boolean boolean9 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test32102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32102");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = ternaryValue2.or(ternaryValue4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = ternaryValue6.or(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = ternaryValue2.xor(ternaryValue8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = ternaryValue10.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = ternaryValue1.xor(ternaryValue11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = ternaryValue13.or(ternaryValue15);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = ternaryValue17.or(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = ternaryValue13.xor(ternaryValue19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.rhino.jstype.TernaryValue.FALSE;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        java.lang.String str25 = ternaryValue24.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = ternaryValue22.and(ternaryValue24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = ternaryValue13.or(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = ternaryValue12.xor(ternaryValue26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = ternaryValue29.or(ternaryValue31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = ternaryValue33.or(ternaryValue35);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = ternaryValue31.xor(ternaryValue36);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue40 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = ternaryValue38.or(ternaryValue40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = ternaryValue42.or(ternaryValue44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = ternaryValue40.xor(ternaryValue45);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue47 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue49 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = ternaryValue47.or(ternaryValue49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = ternaryValue51.or(ternaryValue53);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = ternaryValue49.xor(ternaryValue54);
        java.lang.String str56 = ternaryValue55.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue57 = ternaryValue46.xor(ternaryValue55);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue58 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = ternaryValue58.or(ternaryValue60);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue62 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue65 = ternaryValue62.or(ternaryValue64);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = ternaryValue58.xor(ternaryValue64);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = com.google.javascript.rhino.jstype.TernaryValue.forBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = ternaryValue67.or(ternaryValue69);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue71 = ternaryValue64.xor(ternaryValue70);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = ternaryValue70.not();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = ternaryValue46.and(ternaryValue72);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = ternaryValue31.xor(ternaryValue72);
        java.lang.String str75 = ternaryValue72.toString();
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue76 = ternaryValue28.xor(ternaryValue72);
        boolean boolean78 = ternaryValue28.toBoolean(true);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = null;
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue80 = ternaryValue28.xor(ternaryValue79);
        java.lang.String str81 = ternaryValue28.toString();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(ternaryValue2);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "true" + "'", str25, "true");
        org.junit.Assert.assertNotNull(ternaryValue26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertNotNull(ternaryValue40);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(ternaryValue47);
        org.junit.Assert.assertNotNull(ternaryValue49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(ternaryValue51);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "false" + "'", str56, "false");
        org.junit.Assert.assertNotNull(ternaryValue57);
        org.junit.Assert.assertNotNull(ternaryValue58);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertNotNull(ternaryValue62);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNotNull(ternaryValue65);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(ternaryValue71);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "false" + "'", str75, "false");
        org.junit.Assert.assertNotNull(ternaryValue76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(ternaryValue80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "unknown" + "'", str81, "unknown");
    }

    @Test
    public void test32103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32103");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getAuthors();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        jSDocInfo0.addSuppression("true");
        jSDocInfo0.setDeprecated(true);
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(strCollection5);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test32104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32104");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.getVersion();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isNoShadow();
        java.lang.String str4 = jSDocInfo0.toString();
        jSDocInfo0.addSuppression("(Not declared as a type name)");
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str8 = jSDocInfo7.getVersion();
        jSDocInfo7.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo7.getType();
        java.lang.String str12 = jSDocInfo7.getLicense();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList13 = jSDocInfo7.getThrownTypes();
        boolean boolean14 = jSDocInfo7.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str16 = jSDocInfo15.getVersion();
        java.lang.String str17 = jSDocInfo15.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList18 = jSDocInfo15.getExtendedInterfaces();
        java.lang.String str19 = jSDocInfo15.getOriginalCommentString();
        boolean boolean20 = jSDocInfo15.isImplicitCast();
        java.lang.String str21 = jSDocInfo15.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = jSDocInfo15.getParameterType("Unknown class name");
        boolean boolean24 = jSDocInfo15.isIdGenerator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str26 = jSDocInfo25.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = jSDocInfo25.getType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = jSDocInfo25.getReturnType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility29 = com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC;
        jSDocInfo25.setVisibility(visibility29);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = jSDocInfo25.getParameterType("Not declared as a type name");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList33 = jSDocInfo25.getImplementedInterfaces();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility34 = jSDocInfo25.getVisibility();
        jSDocInfo15.setVisibility(visibility34);
        jSDocInfo7.setVisibility(visibility34);
        jSDocInfo0.setVisibility(visibility34);
        boolean boolean39 = jSDocInfo0.hasParameterType("(((((((((((unknown)))))))))))");
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection40 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSDocInfo" + "'", str4, "JSDocInfo");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jSTypeExpressionList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(jSTypeExpressionList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(jSTypeExpression23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(jSTypeExpression27);
        org.junit.Assert.assertNull(jSTypeExpression28);
        org.junit.Assert.assertTrue("'" + visibility29 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility29.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertNull(jSTypeExpression32);
        org.junit.Assert.assertNotNull(jSTypeExpressionList33);
        org.junit.Assert.assertTrue("'" + visibility34 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC + "'", visibility34.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(markerCollection40);
    }

    @Test
    public void test32105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32105");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition10 = marker0.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition11 = marker0.getNameNode();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
        org.junit.Assert.assertNull(stringPosition9);
        org.junit.Assert.assertNull(stringPosition10);
        org.junit.Assert.assertNull(nodeSourcePosition11);
    }

    @Test
    public void test32106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32106");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation(10, (int) (byte) 10, (int) ' ', (int) (short) -1);
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getEndLine();
        stringPosition0.setItem("Named type with empty name component");
        stringPosition0.setItem("Not declared as a type name");
        int int13 = stringPosition0.getPositionOnStartLine();
        int int14 = stringPosition0.getEndLine();
        int int15 = stringPosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }
}

