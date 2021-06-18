import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo0.getDescriptionForParameter("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean6 = jSDocInfo0.hasParameter("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        jSDocInfo0.addSuppression("");
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        jSDocInfo0.setLicense("");
        boolean boolean10 = jSDocInfo0.isExport();
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getParameterType("JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean5 = jSDocInfo4.hasReturnType();
        java.lang.String str6 = jSDocInfo4.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo4.getParameterType("");
        boolean boolean9 = jSDocInfo4.isNoShadow();
        boolean boolean10 = jSDocInfo4.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.isImplicitCast();
        boolean boolean13 = jSDocInfo11.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility16 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo14.setVisibility(visibility16);
        jSDocInfo11.setVisibility(visibility16);
        jSDocInfo4.setVisibility(visibility16);
        jSDocInfo0.setVisibility(visibility16);
        boolean boolean21 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + visibility16 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility16.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isInterface();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        boolean boolean5 = jSDocInfo0.hasEnumParameterType();
        jSDocInfo0.setLicense("JSDocInfo");
        boolean boolean8 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnStartLine();
        namePosition0.setPositionInformation((int) (short) 0, 100, 32, (int) (byte) 0);
        int int9 = namePosition0.getEndLine();
        int int10 = namePosition0.getPositionOnStartLine();
        int int11 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node12 = null;
        namePosition0.setItem(node12);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition5 = marker0.getNameNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = nodeSourcePosition5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(nodeSourcePosition5);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        java.lang.String str5 = stringPosition0.getItem();
        stringPosition0.setPositionInformation((int) (byte) 0, (-1), (int) (short) 10, (int) (byte) 100);
        int int11 = stringPosition0.getEndLine();
        stringPosition0.setItem("JSDocInfo");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        boolean boolean4 = typePosition0.hasBrackets();
        boolean boolean5 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node6 = typePosition0.getItem();
        int int7 = typePosition0.getStartLine();
        int int8 = typePosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        jSDocInfo0.setDeprecated(true);
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str9 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        boolean boolean3 = jSDocInfo0.isDeprecated();
        boolean boolean4 = jSDocInfo0.hasFileOverview();
        java.lang.String str5 = jSDocInfo0.toString();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNull(visibility9);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        boolean boolean7 = jSDocInfo0.hasDescriptionForParameter("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean6 = jSDocInfo0.isHidden();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        java.lang.String str8 = jSDocInfo0.getVersion();
        boolean boolean10 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.lang.String str11 = jSDocInfo0.getOriginalCommentString();
        boolean boolean12 = jSDocInfo0.isConsistentIdGenerator();
        java.util.Set<java.lang.String> strSet13 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        boolean boolean4 = typePosition0.hasBrackets();
        boolean boolean5 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node6 = typePosition0.getItem();
        int int7 = typePosition0.getStartLine();
        com.google.javascript.rhino.Node node8 = typePosition0.getItem();
        int int9 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        int int4 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str6 = jSDocInfo5.toString();
        java.lang.String str7 = jSDocInfo5.getDescription();
        boolean boolean8 = jSDocInfo5.isJavaDispatch();
        boolean boolean9 = jSDocInfo5.isNoShadow();
        boolean boolean10 = jSDocInfo5.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo5.getThisType();
        boolean boolean12 = jSDocInfo5.isIdGenerator();
        boolean boolean13 = jSDocInfo5.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str15 = jSDocInfo14.toString();
        java.lang.String str16 = jSDocInfo14.getDescription();
        java.lang.String str17 = jSDocInfo14.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = jSDocInfo14.getTypeNodes();
        boolean boolean20 = jSDocInfo14.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList21 = jSDocInfo14.getThrownTypes();
        jSDocInfo14.setDeprecated(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean25 = jSDocInfo24.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility26 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo24.setVisibility(visibility26);
        jSDocInfo14.setVisibility(visibility26);
        jSDocInfo5.setVisibility(visibility26);
        jSDocInfo0.setVisibility(visibility26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSDocInfo" + "'", str15, "JSDocInfo");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + visibility26 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility26.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        boolean boolean4 = jSDocInfo0.hasType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection5 = jSDocInfo0.getMarkers();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        boolean boolean8 = jSDocInfo0.hasParameterType("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getBaseType();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getSuppressions();
        boolean boolean11 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(markerCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        int int4 = typePosition0.getEndLine();
        com.google.javascript.rhino.Node node5 = null;
        typePosition0.setItem(node5);
        int int7 = typePosition0.getEndLine();
        int int8 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getStartLine();
        int int3 = stringPosition0.getStartLine();
        java.lang.String str4 = stringPosition0.getItem();
        stringPosition0.setItem("");
        stringPosition0.setPositionInformation((int) (short) -1, 100, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.containsDeclaration();
        boolean boolean5 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getReturnType();
        java.lang.String str7 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        int int5 = stringPosition0.getEndLine();
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getStartLine();
        stringPosition0.setItem("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        int int4 = typePosition0.getPositionOnEndLine();
        boolean boolean5 = typePosition0.hasBrackets();
        int int6 = typePosition0.getPositionOnEndLine();
        int int7 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.isJavaDispatch();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(markerCollection9);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        java.lang.String str8 = jSDocInfo0.getDescription();
        jSDocInfo0.setLicense("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasType();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        jSDocInfo0.addSuppression("JSDocInfo");
        boolean boolean12 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility6);
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean10 = jSDocInfo0.containsDeclaration();
        java.lang.String str11 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + visibility6 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility6.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        java.lang.String str6 = jSDocInfo0.toString();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        boolean boolean8 = jSDocInfo0.isNoAlias();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.isHidden();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean9 = jSDocInfo0.isConstant();
        jSDocInfo0.setLicense("JSDocInfo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        boolean boolean4 = jSDocInfo0.hasType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection5 = jSDocInfo0.getMarkers();
        boolean boolean6 = jSDocInfo0.isDefine();
        boolean boolean7 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(markerCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        boolean boolean4 = typePosition0.hasBrackets();
        boolean boolean5 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node6 = typePosition0.getItem();
        int int7 = typePosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean4 = jSDocInfo3.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility5 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo3.setVisibility(visibility5);
        jSDocInfo0.setVisibility(visibility5);
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection8 = jSDocInfo0.getMarkers();
        boolean boolean9 = jSDocInfo0.isNoShadow();
        boolean boolean10 = jSDocInfo0.isIdGenerator();
        boolean boolean11 = jSDocInfo0.isNoTypeCheck();
        boolean boolean13 = jSDocInfo0.hasParameter("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + visibility5 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility5.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(markerCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isHidden();
        boolean boolean4 = jSDocInfo0.isInterface();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        boolean boolean4 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        boolean boolean8 = jSDocInfo0.hasParameter("hi!");
        boolean boolean10 = jSDocInfo0.hasParameterType("JSDocInfo");
        boolean boolean11 = jSDocInfo0.hasFileOverview();
        boolean boolean12 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        int int7 = jSDocInfo0.getParameterCount();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getThrownTypes();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean10 = jSDocInfo9.isImplicitCast();
        boolean boolean11 = jSDocInfo9.isConstructor();
        java.lang.String str12 = jSDocInfo9.getReturnDescription();
        int int13 = jSDocInfo9.getImplementedInterfaceCount();
        boolean boolean14 = jSDocInfo9.hasFileOverview();
        boolean boolean15 = jSDocInfo9.isConstant();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str17 = jSDocInfo16.toString();
        java.lang.String str18 = jSDocInfo16.getDescription();
        java.lang.String str19 = jSDocInfo16.getReturnDescription();
        boolean boolean20 = jSDocInfo16.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean22 = jSDocInfo21.hasReturnType();
        java.lang.String str23 = jSDocInfo21.getDescription();
        java.util.Set<java.lang.String> strSet24 = jSDocInfo21.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo21.setVisibility(visibility25);
        jSDocInfo16.setVisibility(visibility25);
        jSDocInfo9.setVisibility(visibility25);
        jSDocInfo0.setVisibility(visibility25);
        jSDocInfo0.setLicense("");
        java.lang.String str32 = jSDocInfo0.getSourceName();
        java.lang.String str33 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JSDocInfo" + "'", str17, "JSDocInfo");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + visibility25 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility25.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        int int3 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        int int6 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        java.lang.String str2 = jSDocInfo0.toString();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getThrownTypes();
        java.lang.String str5 = jSDocInfo0.getLendsName();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSDocInfo" + "'", str2, "JSDocInfo");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getAuthors();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        boolean boolean7 = jSDocInfo0.isNoTypeCheck();
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition1 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition4 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition6 = marker0.getNameNode();
        org.junit.Assert.assertNull(nodeSourcePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(nodeSourcePosition4);
        org.junit.Assert.assertNull(typePosition5);
        org.junit.Assert.assertNull(nodeSourcePosition6);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getVersion();
        boolean boolean5 = jSDocInfo0.isHidden();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("hi!");
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.hasModifies();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.lang.String str10 = jSDocInfo0.getDescription();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        com.google.javascript.rhino.Node node3 = null;
        namePosition0.setItem(node3);
        com.google.javascript.rhino.Node node5 = null;
        namePosition0.setItem(node5);
        com.google.javascript.rhino.Node node7 = null;
        namePosition0.setItem(node7);
        int int9 = namePosition0.getPositionOnEndLine();
        int int10 = namePosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean9 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility10 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(visibility10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        int int4 = typePosition0.getEndLine();
        com.google.javascript.rhino.Node node5 = null;
        typePosition0.setItem(node5);
        com.google.javascript.rhino.Node node7 = typePosition0.getItem();
        typePosition0.setPositionInformation((int) '#', (int) (byte) -1, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("");
        boolean boolean5 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        java.lang.String str5 = stringPosition0.getItem();
        java.lang.String str6 = stringPosition0.getItem();
        int int7 = stringPosition0.getStartLine();
        stringPosition0.setPositionInformation((int) (byte) -1, (-1), 0, (int) '4');
        int int13 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("");
        boolean boolean5 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        int int8 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        jSDocInfo0.setDeprecated(false);
        boolean boolean9 = jSDocInfo0.hasType();
        boolean boolean10 = jSDocInfo0.isExterns();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = jSDocInfo0.getVisibility();
        boolean boolean12 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(visibility11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isInterface();
        boolean boolean10 = jSDocInfo0.isNoCompile();
        boolean boolean11 = jSDocInfo0.isExterns();
        java.lang.String str12 = jSDocInfo0.getMeaning();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getType();
        boolean boolean16 = jSDocInfo0.hasParameterType("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertNull(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        java.lang.String str4 = jSDocInfo0.getLendsName();
        boolean boolean6 = jSDocInfo0.hasParameter("");
        boolean boolean7 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.isJavaDispatch();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getThrownTypes();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        int int3 = namePosition0.getStartLine();
        int int4 = namePosition0.getPositionOnStartLine();
        int int5 = namePosition0.getEndLine();
        int int6 = namePosition0.getStartLine();
        int int7 = namePosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("");
        java.lang.String str4 = jSDocInfo0.getMeaning();
        boolean boolean5 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean11 = jSDocInfo10.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo10.setVisibility(visibility12);
        jSDocInfo0.setVisibility(visibility12);
        boolean boolean15 = jSDocInfo0.isNoShadow();
        boolean boolean16 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo0.getEnumParameterType();
        jSDocInfo0.addSuppression("JSDocInfo");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList20 = jSDocInfo0.getImplementedInterfaces();
        java.lang.String str21 = jSDocInfo0.getLendsName();
        boolean boolean22 = jSDocInfo0.hasTypedefType();
        boolean boolean23 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + visibility12 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility12.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertNotNull(jSTypeExpressionList20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean2 = jSDocInfo0.isHidden();
        boolean boolean3 = jSDocInfo0.hasThisType();
        jSDocInfo0.setLicense("hi!");
        boolean boolean6 = jSDocInfo0.hasType();
        java.lang.String str7 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str8 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        boolean boolean8 = jSDocInfo0.isConstant();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isDefine();
        java.lang.String str10 = jSDocInfo0.getSourceName();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getReturnType();
        jSDocInfo0.setDeprecated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isNoCompile();
        boolean boolean7 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str8 = jSDocInfo0.getBlockDescription();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition3 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker0.getAnnotation();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(nodeSourcePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(typePosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
        org.junit.Assert.assertNull(stringPosition9);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.isConstructor();
        java.lang.String str7 = jSDocInfo0.getLendsName();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean9 = jSDocInfo0.hasParameterType("hi!");
        java.lang.String str10 = jSDocInfo0.getReturnDescription();
        boolean boolean11 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getType();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getReferences();
        int int11 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        boolean boolean6 = jSDocInfo0.hasDescriptionForParameter("");
        boolean boolean7 = jSDocInfo0.hasModifies();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isNoCompile();
        boolean boolean5 = jSDocInfo0.hasBaseType();
        boolean boolean7 = jSDocInfo0.hasDescriptionForParameter("JSDocInfo");
        boolean boolean9 = jSDocInfo0.hasParameter("hi!");
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        boolean boolean8 = jSDocInfo0.isNoShadow();
        java.lang.String str9 = jSDocInfo0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean2 = jSDocInfo0.isHidden();
        boolean boolean3 = jSDocInfo0.hasModifies();
        boolean boolean4 = jSDocInfo0.isExterns();
        java.lang.String str5 = jSDocInfo0.getSourceName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getReturnType();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        boolean boolean8 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isDefine();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo0.getImplementedInterfaces();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection11 = jSDocInfo0.getMarkers();
        boolean boolean12 = jSDocInfo0.isExport();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
        org.junit.Assert.assertNotNull(markerCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        int int3 = namePosition0.getStartLine();
        namePosition0.setPositionInformation(0, (int) (byte) 100, (int) '4', 52);
        int int9 = namePosition0.getPositionOnStartLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) (short) 100, 100, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 100?end-line: 1");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getAuthors();
        boolean boolean5 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(visibility7);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.hasParameter("hi!");
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strCollection9);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean2 = jSDocInfo0.isHidden();
        boolean boolean3 = jSDocInfo0.isHidden();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getType();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = jSDocInfo0.getTemplateTypeNames();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean5 = jSDocInfo0.hasType();
        boolean boolean6 = jSDocInfo0.isExpose();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        int int8 = stringPosition0.getPositionOnStartLine();
        int int9 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("JSDocInfo");
        stringPosition0.setItem("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        java.lang.String str6 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        java.lang.String str9 = jSDocInfo0.getOriginalCommentString();
        boolean boolean10 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        int int3 = stringPosition0.getEndLine();
        int int4 = stringPosition0.getStartLine();
        stringPosition0.setItem("JSDocInfo");
        int int7 = stringPosition0.getPositionOnEndLine();
        java.lang.String str8 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSDocInfo" + "'", str8, "JSDocInfo");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str7 = jSDocInfo0.getLicense();
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        java.lang.String str9 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.Node node10 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasModifies();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean8 = jSDocInfo0.hasParameterType("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean7 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean11 = jSDocInfo10.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo10.setVisibility(visibility12);
        jSDocInfo0.setVisibility(visibility12);
        boolean boolean15 = jSDocInfo0.isNoShadow();
        boolean boolean16 = jSDocInfo0.hasTypedefType();
        java.lang.String str17 = jSDocInfo0.getBlockDescription();
        int int18 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + visibility12 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility12.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(jSTypeExpression19);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isOverride();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnStartLine();
        namePosition0.setPositionInformation((int) (short) 0, 100, 32, (int) (byte) 0);
        int int9 = namePosition0.getEndLine();
        namePosition0.setPositionInformation((int) (short) 10, (int) (byte) -1, (int) ' ', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) '#', (int) (short) 100, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 35?end-line: 10");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isHidden();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition5 = marker0.getNameNode();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(nodeSourcePosition5);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        boolean boolean10 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean5 = jSDocInfo0.isInterface();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        com.google.javascript.rhino.Node node7 = null;
        jSDocInfo0.setAssociatedNode(node7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        java.lang.String str2 = jSDocInfo0.toString();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSDocInfo" + "'", str2, "JSDocInfo");
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        boolean boolean9 = jSDocInfo0.isHidden();
        boolean boolean10 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        namePosition0.setPositionInformation((int) (short) 0, (int) (byte) 0, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasBaseType();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        boolean boolean9 = jSDocInfo0.isHidden();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasModifies();
        boolean boolean4 = jSDocInfo0.isNoAlias();
        boolean boolean5 = jSDocInfo0.isConstant();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.isConstructor();
        java.lang.String str7 = jSDocInfo0.getLendsName();
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean10 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition5 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getAnnotation();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(nodeSourcePosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(stringPosition7);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean11 = jSDocInfo10.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo10.setVisibility(visibility12);
        jSDocInfo0.setVisibility(visibility12);
        boolean boolean15 = jSDocInfo0.isNoShadow();
        boolean boolean16 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo0.getBaseType();
        boolean boolean18 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + visibility12 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility12.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isDefine();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        java.lang.String str5 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        boolean boolean6 = jSDocInfo0.hasDescriptionForParameter("");
        boolean boolean7 = jSDocInfo0.hasThisType();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getPositionOnStartLine();
        int int10 = stringPosition0.getStartLine();
        int int11 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        stringPosition0.setItem("");
        int int5 = stringPosition0.getPositionOnStartLine();
        int int6 = stringPosition0.getPositionOnEndLine();
        int int7 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setPositionInformation((int) (byte) 1, (int) (byte) 1, (int) '#', 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        namePosition0.setPositionInformation(1, (int) '4', 100, (int) '#');
        com.google.javascript.rhino.Node node8 = namePosition0.getItem();
        java.lang.Class<?> wildcardClass9 = namePosition0.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.Node node7 = null;
        jSDocInfo0.setAssociatedNode(node7);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getEnumParameterType();
        boolean boolean10 = jSDocInfo0.isNoShadow();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        boolean boolean4 = jSDocInfo0.isJavaDispatch();
        boolean boolean5 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition5 = marker0.getNameNode();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(nodeSourcePosition5);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean8 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasModifies();
        java.lang.String str4 = jSDocInfo0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSDocInfo" + "'", str4, "JSDocInfo");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isExpose();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        boolean boolean7 = jSDocInfo0.hasBaseType();
        boolean boolean8 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node2 = null;
        namePosition0.setItem(node2);
        com.google.javascript.rhino.Node node4 = null;
        namePosition0.setItem(node4);
        com.google.javascript.rhino.Node node6 = null;
        namePosition0.setItem(node6);
        namePosition0.setPositionInformation((int) '#', (int) (short) -1, (int) 'a', (int) (short) 100);
        int int13 = namePosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        jSDocInfo0.setDeprecated(false);
        boolean boolean9 = jSDocInfo0.hasType();
        boolean boolean10 = jSDocInfo0.isExterns();
        java.util.Collection<java.lang.String> strCollection11 = jSDocInfo0.getAuthors();
        java.util.Collection<java.lang.String> strCollection12 = jSDocInfo0.getAuthors();
        boolean boolean13 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strCollection11);
        org.junit.Assert.assertNull(strCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeCollection9);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoCompile();
        boolean boolean3 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.hasDescriptionForParameter("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        int int4 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node5 = typePosition0.getItem();
        com.google.javascript.rhino.Node node6 = typePosition0.getItem();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        jSDocInfo0.setDeprecated(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean3 = jSDocInfo0.hasParameter("");
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getSuppressions();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str8 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean9 = jSDocInfo0.isNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getType();
        java.lang.String str11 = jSDocInfo0.getLicense();
        boolean boolean13 = jSDocInfo0.hasDescriptionForParameter("hi!");
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        boolean boolean5 = jSDocInfo0.hasBaseType();
        boolean boolean6 = jSDocInfo0.isHidden();
        boolean boolean7 = jSDocInfo0.isConstructor();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        boolean boolean9 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        java.lang.String str6 = stringPosition0.getItem();
        java.lang.String str7 = stringPosition0.getItem();
        java.lang.String str8 = stringPosition0.getItem();
        stringPosition0.setPositionInformation((int) (short) -1, (int) (byte) -1, 35, (int) (byte) 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        boolean boolean8 = jSDocInfo0.isExpose();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getType();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        boolean boolean12 = jSDocInfo0.hasModifies();
        java.lang.String str13 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isExpose();
        boolean boolean4 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getEndLine();
        int int10 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        java.lang.String str2 = jSDocInfo0.toString();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        java.lang.String str4 = jSDocInfo0.getVersion();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSDocInfo" + "'", str2, "JSDocInfo");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasModifies();
        int int4 = jSDocInfo0.getParameterCount();
        boolean boolean5 = jSDocInfo0.isOverride();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList2 = jSDocInfo0.getThrownTypes();
        boolean boolean3 = jSDocInfo0.isInterface();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getDescription();
        boolean boolean5 = jSDocInfo0.hasModifies();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        java.lang.Class<?> wildcardClass9 = jSDocInfo0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        boolean boolean4 = jSDocInfo0.isOverride();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isNoCompile();
        boolean boolean5 = jSDocInfo0.isInterface();
        boolean boolean6 = jSDocInfo0.isExport();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        java.lang.Class<?> wildcardClass8 = jSDocInfo0.getClass();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        java.lang.String str2 = jSDocInfo0.toString();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection4 = jSDocInfo0.getMarkers();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.hasType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSDocInfo" + "'", str2, "JSDocInfo");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(markerCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getBaseType();
        jSDocInfo0.setLicense("JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        boolean boolean4 = jSDocInfo0.isHidden();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strCollection5);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        boolean boolean4 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        java.lang.String str7 = jSDocInfo0.toString();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSDocInfo" + "'", str7, "JSDocInfo");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isNoShadow();
        java.lang.String str7 = jSDocInfo0.getBlockDescription();
        boolean boolean8 = jSDocInfo0.isOverride();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isOverride();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean3 = jSDocInfo0.hasParameter("");
        java.lang.String str4 = jSDocInfo0.getVersion();
        int int5 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("hi!");
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean9 = jSDocInfo0.hasDescriptionForParameter("hi!");
        boolean boolean10 = jSDocInfo0.hasType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getVersion();
        boolean boolean5 = jSDocInfo0.isHidden();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getSuppressions();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        boolean boolean9 = jSDocInfo0.isOverride();
        jSDocInfo0.addSuppression("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("hi!");
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isConstructor();
        java.lang.String str9 = jSDocInfo0.getMeaning();
        boolean boolean10 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node2 = namePosition0.getItem();
        com.google.javascript.rhino.Node node3 = namePosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasModifies();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getThrownTypes();
        boolean boolean12 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        boolean boolean8 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getBaseType();
        java.lang.String str10 = jSDocInfo0.getSourceName();
        boolean boolean11 = jSDocInfo0.isInterface();
        boolean boolean12 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        jSDocInfo0.setDeprecated(false);
        boolean boolean7 = jSDocInfo0.isDefine();
        boolean boolean8 = jSDocInfo0.isDefine();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getParameterType("JSDocInfo");
        boolean boolean12 = jSDocInfo0.hasDescriptionForParameter("JSDocInfo");
        boolean boolean13 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        int int5 = stringPosition0.getStartLine();
        int int6 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node2 = namePosition0.getItem();
        int int3 = namePosition0.getPositionOnEndLine();
        int int4 = namePosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str5 = jSDocInfo0.getVersion();
        java.lang.String str6 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.hasParameter("JSDocInfo");
        boolean boolean9 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        boolean boolean4 = jSDocInfo0.hasType();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        boolean boolean6 = jSDocInfo0.isExport();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isOverride();
        jSDocInfo0.addSuppression("JSDocInfo");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getTypedefType();
        boolean boolean12 = jSDocInfo0.isDefine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + visibility9 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility9.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        boolean boolean8 = jSDocInfo0.isExpose();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = jSDocInfo0.getTypeNodes();
        boolean boolean10 = jSDocInfo0.isDeprecated();
        jSDocInfo0.addSuppression("JSDocInfo");
        boolean boolean14 = jSDocInfo0.hasDescriptionForParameter("hi!");
        boolean boolean15 = jSDocInfo0.isExport();
        boolean boolean16 = jSDocInfo0.hasFileOverview();
        boolean boolean17 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        int int4 = typePosition0.getEndLine();
        int int5 = typePosition0.getStartLine();
        boolean boolean6 = typePosition0.hasBrackets();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasType();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = jSDocInfo0.getTypeNodes();
        java.lang.String str11 = jSDocInfo0.getLicense();
        java.lang.String str12 = jSDocInfo0.getDescription();
        java.lang.String str13 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean6 = jSDocInfo0.isHidden();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfo0.setAssociatedNode(node11);
        java.lang.String str13 = jSDocInfo0.getMeaning();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node2 = null;
        namePosition0.setItem(node2);
        com.google.javascript.rhino.Node node4 = null;
        namePosition0.setItem(node4);
        int int6 = namePosition0.getStartLine();
        int int7 = namePosition0.getStartLine();
        int int8 = namePosition0.getEndLine();
        int int9 = namePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.isExterns();
        java.lang.String str6 = jSDocInfo0.getVersion();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility6);
        boolean boolean8 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + visibility6 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility6.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.Node node7 = null;
        jSDocInfo0.setAssociatedNode(node7);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getEnumParameterType();
        boolean boolean10 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(visibility6);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        int int3 = stringPosition0.getEndLine();
        int int4 = stringPosition0.getStartLine();
        int int5 = stringPosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        boolean boolean4 = jSDocInfo0.hasModifies();
        java.lang.String str5 = jSDocInfo0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        com.google.common.collect.ImmutableList<java.lang.String> strList4 = jSDocInfo0.getTemplateTypeNames();
        jSDocInfo0.addSuppression("JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        boolean boolean5 = jSDocInfo0.isExport();
        boolean boolean6 = jSDocInfo0.isDefine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        boolean boolean5 = jSDocInfo0.isNoCompile();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo0.getMarkers();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(markerCollection6);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        java.lang.String str9 = jSDocInfo0.toString();
        boolean boolean10 = jSDocInfo0.isImplicitCast();
        java.lang.String str11 = jSDocInfo0.getBlockDescription();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSDocInfo" + "'", str9, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        com.google.javascript.rhino.Node node3 = null;
        namePosition0.setItem(node3);
        com.google.javascript.rhino.Node node5 = null;
        namePosition0.setItem(node5);
        int int7 = namePosition0.getEndLine();
        int int8 = namePosition0.getEndLine();
        int int9 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node10 = null;
        namePosition0.setItem(node10);
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation((int) '4', 0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 52?end-line: -1");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnStartLine();
        namePosition0.setPositionInformation((int) (short) 0, 100, 32, (int) (byte) 0);
        int int9 = namePosition0.getEndLine();
        int int10 = namePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node11 = null;
        namePosition0.setItem(node11);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getOriginalCommentString();
        boolean boolean9 = jSDocInfo0.isExport();
        boolean boolean10 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node2 = typePosition0.getItem();
        int int3 = typePosition0.getPositionOnEndLine();
        int int4 = typePosition0.getPositionOnEndLine();
        boolean boolean5 = typePosition0.hasBrackets();
        int int6 = typePosition0.getStartLine();
        boolean boolean7 = typePosition0.hasBrackets();
        int int8 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        jSDocInfo0.setDeprecated(false);
        boolean boolean7 = jSDocInfo0.isNoShadow();
        boolean boolean8 = jSDocInfo0.hasModifies();
        boolean boolean9 = jSDocInfo0.isDefine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        int int4 = typePosition0.getPositionOnEndLine();
        boolean boolean5 = typePosition0.hasBrackets();
        int int6 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        java.lang.String str6 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = jSDocInfo0.getTypeNodes();
        boolean boolean8 = jSDocInfo0.hasBaseType();
        boolean boolean9 = jSDocInfo0.isExterns();
        java.lang.String str10 = jSDocInfo0.getVersion();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node4 = null;
        namePosition0.setItem(node4);
        int int6 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node7 = namePosition0.getItem();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasThisType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        jSDocInfo0.setDeprecated(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("");
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str10 = jSDocInfo9.toString();
        java.lang.String str11 = jSDocInfo9.getDescription();
        java.lang.String str12 = jSDocInfo9.getReturnDescription();
        boolean boolean13 = jSDocInfo9.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean15 = jSDocInfo14.hasReturnType();
        java.lang.String str16 = jSDocInfo14.getDescription();
        java.util.Set<java.lang.String> strSet17 = jSDocInfo14.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo14.setVisibility(visibility18);
        jSDocInfo9.setVisibility(visibility18);
        jSDocInfo0.setVisibility(visibility18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSDocInfo" + "'", str10, "JSDocInfo");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + visibility18 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility18.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        stringPosition0.setItem("");
        stringPosition0.setItem("hi!");
        int int8 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        jSDocInfo0.setDeprecated(false);
        boolean boolean9 = jSDocInfo0.hasType();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getReferences();
        boolean boolean11 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasModifies();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        boolean boolean11 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasParameterType("hi!");
        boolean boolean7 = jSDocInfo0.hasModifies();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        jSDocInfo0.setLicense("hi!");
        boolean boolean7 = jSDocInfo0.hasBaseType();
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getReturnType();
        boolean boolean10 = jSDocInfo0.isNoAlias();
        com.google.common.collect.ImmutableList<java.lang.String> strList11 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str13 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        java.lang.String str4 = jSDocInfo0.getDescription();
        int int5 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        int int3 = namePosition0.getStartLine();
        int int4 = namePosition0.getPositionOnEndLine();
        int int5 = namePosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str4 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str5 = jSDocInfo0.getBlockDescription();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isNoCompile();
        boolean boolean5 = jSDocInfo0.isInterface();
        boolean boolean6 = jSDocInfo0.isExport();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        boolean boolean5 = jSDocInfo0.hasModifies();
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node2 = namePosition0.getItem();
        int int3 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node4 = namePosition0.getItem();
        int int5 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node6 = namePosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str7 = jSDocInfo0.getLicense();
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        com.google.common.collect.ImmutableList<java.lang.String> strList9 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.isDeprecated();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getThisType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection10 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNotNull(markerCollection10);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getThrownTypes();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        int int3 = stringPosition0.getStartLine();
        int int4 = stringPosition0.getPositionOnEndLine();
        int int5 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.isExterns();
        java.lang.String str6 = jSDocInfo0.getVersion();
        java.lang.String str7 = jSDocInfo0.getDeprecationReason();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        boolean boolean9 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        boolean boolean5 = jSDocInfo0.isNoCompile();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        boolean boolean8 = jSDocInfo0.isConstant();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.containsDeclaration();
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        java.lang.String str7 = jSDocInfo0.toString();
        java.lang.String str8 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSDocInfo" + "'", str7, "JSDocInfo");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.hasParameter("hi!");
        boolean boolean9 = jSDocInfo0.isExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasType();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = jSDocInfo0.getTypeNodes();
        java.lang.String str11 = jSDocInfo0.getLicense();
        java.lang.String str12 = jSDocInfo0.getFileOverview();
        boolean boolean13 = jSDocInfo0.isExterns();
        boolean boolean14 = jSDocInfo0.shouldPreserveTry();
        java.util.Set<java.lang.String> strSet15 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str4 = jSDocInfo0.getSourceName();
        boolean boolean5 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str5 = jSDocInfo0.getVersion();
        java.lang.String str6 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.hasParameter("JSDocInfo");
        java.lang.String str9 = jSDocInfo0.getReturnDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        java.lang.String str7 = jSDocInfo0.getMeaning();
        jSDocInfo0.setLicense("");
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isInterface();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        boolean boolean5 = jSDocInfo0.hasModifies();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility4 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility4);
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + visibility4 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility4.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("JSDocInfo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        boolean boolean6 = jSDocInfo0.isExpose();
        boolean boolean7 = jSDocInfo0.isDefine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean9 = jSDocInfo0.hasParameter("hi!");
        java.lang.String str10 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getBaseType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        int int4 = typePosition0.getEndLine();
        boolean boolean5 = typePosition0.hasBrackets();
        int int6 = typePosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasType();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = jSDocInfo0.getTypeNodes();
        java.lang.String str11 = jSDocInfo0.getLicense();
        java.util.Collection<java.lang.String> strCollection12 = jSDocInfo0.getReferences();
        boolean boolean13 = jSDocInfo0.isExterns();
        boolean boolean14 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node2 = null;
        namePosition0.setItem(node2);
        com.google.javascript.rhino.Node node4 = null;
        namePosition0.setItem(node4);
        int int6 = namePosition0.getPositionOnEndLine();
        int int7 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node8 = null;
        namePosition0.setItem(node8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean2 = jSDocInfo0.isHidden();
        boolean boolean3 = jSDocInfo0.isHidden();
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("JSDocInfo");
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        boolean boolean7 = jSDocInfo0.isInterface();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasModifies();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        boolean boolean6 = jSDocInfo0.hasBaseType();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isConstant();
        boolean boolean10 = jSDocInfo0.isExpose();
        boolean boolean11 = jSDocInfo0.isDefine();
        java.lang.String str12 = jSDocInfo0.getLicense();
        boolean boolean13 = jSDocInfo0.isNoCompile();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection14 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeCollection14);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean2 = jSDocInfo0.isHidden();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList3 = jSDocInfo0.getExtendedInterfaces();
        int int4 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.hasParameter("hi!");
        boolean boolean9 = jSDocInfo0.isDefine();
        java.lang.String str10 = jSDocInfo0.getFileOverview();
        boolean boolean12 = jSDocInfo0.hasParameterType("JSDocInfo");
        java.lang.String str13 = jSDocInfo0.getLicense();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getReferences();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasType();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = jSDocInfo0.getTypeNodes();
        java.lang.String str11 = jSDocInfo0.getLicense();
        java.lang.String str12 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getThisType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("hi!");
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.hasModifies();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasModifies();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        java.lang.String str12 = jSDocInfo0.getDeprecationReason();
        boolean boolean13 = jSDocInfo0.isOverride();
        boolean boolean14 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getVersion();
        boolean boolean5 = jSDocInfo0.isHidden();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getParameterNames();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.isExterns();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        boolean boolean8 = jSDocInfo0.isDefine();
        java.lang.String str9 = jSDocInfo0.getFileOverview();
        boolean boolean10 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isConstant();
        boolean boolean10 = jSDocInfo0.isExpose();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection11 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(markerCollection11);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        boolean boolean4 = jSDocInfo0.hasType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getBlockDescription();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getAuthors();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        boolean boolean4 = jSDocInfo0.hasReturnType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getOriginalCommentString();
        boolean boolean9 = jSDocInfo0.isExport();
        boolean boolean10 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.Node node7 = null;
        jSDocInfo0.setAssociatedNode(node7);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getEnumParameterType();
        boolean boolean10 = jSDocInfo0.isNoShadow();
        boolean boolean11 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = jSDocInfo0.getParameterType("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression13);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getReferences();
        jSDocInfo0.setLicense("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strCollection4);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition4 = marker0.getNameNode();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(nodeSourcePosition4);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.isExterns();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        boolean boolean8 = jSDocInfo0.isDefine();
        java.lang.String str9 = jSDocInfo0.getFileOverview();
        int int10 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean2 = jSDocInfo0.isHidden();
        boolean boolean3 = jSDocInfo0.hasThisType();
        jSDocInfo0.setLicense("hi!");
        boolean boolean6 = jSDocInfo0.isConstant();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection7 = jSDocInfo0.getMarkers();
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("hi!");
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(markerCollection7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node2 = typePosition0.getItem();
        int int3 = typePosition0.getPositionOnEndLine();
        int int4 = typePosition0.getPositionOnEndLine();
        boolean boolean5 = typePosition0.hasBrackets();
        int int6 = typePosition0.getStartLine();
        boolean boolean7 = typePosition0.hasBrackets();
        typePosition0.setPositionInformation(1, 0, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getDescription();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        java.lang.String str8 = jSDocInfo0.getLicense();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasModifies();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        java.lang.String str12 = jSDocInfo0.getDeprecationReason();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeCollection13);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        jSDocInfo0.addSuppression("");
        java.lang.String str5 = jSDocInfo0.getBlockDescription();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        int int4 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean5 = jSDocInfo0.hasModifies();
        boolean boolean6 = jSDocInfo0.hasModifies();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getParameterType("JSDocInfo");
        com.google.javascript.rhino.Node node9 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isConstant();
        boolean boolean10 = jSDocInfo0.isExpose();
        boolean boolean11 = jSDocInfo0.isDefine();
        java.lang.String str12 = jSDocInfo0.getLicense();
        boolean boolean13 = jSDocInfo0.isNoCompile();
        boolean boolean14 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        boolean boolean10 = jSDocInfo0.hasParameter("hi!");
        java.lang.String str11 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasModifies();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getParameterNames();
        java.lang.String str12 = jSDocInfo0.getDeprecationReason();
        boolean boolean13 = jSDocInfo0.isOverride();
        jSDocInfo0.setDeprecated(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        boolean boolean4 = jSDocInfo0.hasModifies();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getModifies();
        boolean boolean6 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        boolean boolean8 = jSDocInfo0.isDefine();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        boolean boolean8 = jSDocInfo0.isImplicitCast();
        boolean boolean9 = jSDocInfo0.isExport();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getParameterType("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.getLicense();
        java.lang.String str5 = jSDocInfo0.getVersion();
        com.google.common.collect.ImmutableList<java.lang.String> strList6 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasModifies();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        boolean boolean11 = jSDocInfo0.isJavaDispatch();
        java.lang.String str12 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getParameterType("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(jSTypeExpression14);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("");
        boolean boolean4 = jSDocInfo0.isOverride();
        boolean boolean5 = jSDocInfo0.isConstant();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        java.lang.String str5 = jSDocInfo0.getVersion();
        boolean boolean6 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.Node node7 = null;
        jSDocInfo0.setAssociatedNode(node7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getStartLine();
        java.lang.String str10 = stringPosition0.getItem();
        int int11 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        com.google.javascript.rhino.Node node3 = null;
        namePosition0.setItem(node3);
        com.google.javascript.rhino.Node node5 = null;
        namePosition0.setItem(node5);
        int int7 = namePosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            namePosition0.setPositionInformation(10, (int) (short) 0, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        boolean boolean6 = jSDocInfo0.hasFileOverview();
        java.lang.String str7 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasBaseType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        java.lang.String str7 = jSDocInfo0.getMeaning();
        int int8 = jSDocInfo0.getParameterCount();
        java.lang.String str9 = jSDocInfo0.getSourceName();
        java.lang.String str10 = jSDocInfo0.getVersion();
        jSDocInfo0.addSuppression("");
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        boolean boolean4 = jSDocInfo0.hasEnumParameterType();
        boolean boolean5 = jSDocInfo0.hasModifies();
        java.lang.String str6 = jSDocInfo0.getFileOverview();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        boolean boolean8 = jSDocInfo0.isDefine();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        boolean boolean4 = jSDocInfo0.hasType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection5 = jSDocInfo0.getMarkers();
        boolean boolean6 = jSDocInfo0.isDefine();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getEnumParameterType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(markerCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(visibility8);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean11 = jSDocInfo10.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo10.setVisibility(visibility12);
        jSDocInfo0.setVisibility(visibility12);
        boolean boolean15 = jSDocInfo0.isNoShadow();
        boolean boolean16 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = jSDocInfo0.getEnumParameterType();
        java.lang.String str18 = jSDocInfo0.getMeaning();
        boolean boolean19 = jSDocInfo0.isConstructor();
        java.util.Collection<java.lang.String> strCollection20 = jSDocInfo0.getReferences();
        boolean boolean21 = jSDocInfo0.isExport();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = jSDocInfo0.getEnumParameterType();
        boolean boolean23 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + visibility12 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility12.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSTypeExpression17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strCollection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSTypeExpression22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        boolean boolean8 = jSDocInfo0.isImplicitCast();
        boolean boolean9 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isExport();
        boolean boolean6 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        int int4 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getParameterType("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("hi!");
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        int int8 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean9 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        boolean boolean8 = jSDocInfo0.isOverride();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getThrownTypes();
        java.lang.Class<?> wildcardClass10 = jSTypeExpressionList9.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        boolean boolean3 = jSDocInfo0.isDefine();
        jSDocInfo0.setDeprecated(false);
        java.lang.String str6 = jSDocInfo0.getVersion();
        int int7 = jSDocInfo0.getParameterCount();
        java.lang.String str8 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasType();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = jSDocInfo0.getTypeNodes();
        java.lang.String str11 = jSDocInfo0.getLicense();
        java.util.Collection<java.lang.String> strCollection12 = jSDocInfo0.getReferences();
        boolean boolean13 = jSDocInfo0.isExterns();
        boolean boolean14 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasModifies();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        boolean boolean11 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList12 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean14 = jSDocInfo0.hasParameterType("JSDocInfo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean9 = jSDocInfo0.hasParameterType("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        com.google.javascript.rhino.Node node9 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean6 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.lang.String str8 = jSDocInfo0.getDescriptionForParameter("");
        int int9 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        stringPosition0.setItem("");
        int int5 = stringPosition0.getPositionOnStartLine();
        int int6 = stringPosition0.getStartLine();
        stringPosition0.setItem("JSDocInfo");
        java.lang.String str9 = stringPosition0.getItem();
        java.lang.String str10 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSDocInfo" + "'", str9, "JSDocInfo");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSDocInfo" + "'", str10, "JSDocInfo");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isInterface();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        boolean boolean5 = jSDocInfo0.hasModifies();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        boolean boolean7 = jSDocInfo0.isDeprecated();
        boolean boolean9 = jSDocInfo0.hasParameter("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        java.lang.String str7 = jSDocInfo0.getBlockDescription();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        boolean boolean9 = jSDocInfo0.hasType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getParameterType("");
        java.lang.String str11 = jSDocInfo0.getDescriptionForParameter("hi!");
        java.lang.String str12 = jSDocInfo0.getVersion();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        boolean boolean5 = jSDocInfo0.isExterns();
        boolean boolean6 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection7 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(markerCollection7);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasBaseType();
        boolean boolean9 = jSDocInfo0.hasParameter("JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getVersion();
        java.lang.String str5 = jSDocInfo0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility6);
        boolean boolean9 = jSDocInfo0.hasDescriptionForParameter("hi!");
        boolean boolean10 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + visibility6 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility6.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        java.lang.String str3 = jSDocInfo0.getDeprecationReason();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        boolean boolean5 = jSDocInfo0.hasModifies();
        boolean boolean6 = jSDocInfo0.isExport();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        boolean boolean8 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getPositionOnEndLine();
        int int3 = namePosition0.getPositionOnStartLine();
        namePosition0.setPositionInformation((int) (short) 100, (int) (byte) 1, (int) (short) 100, (int) (byte) 100);
        com.google.javascript.rhino.Node node9 = namePosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        int int4 = jSDocInfo0.getImplementedInterfaceCount();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection5 = jSDocInfo0.getMarkers();
        boolean boolean6 = jSDocInfo0.isJavaDispatch();
        boolean boolean7 = jSDocInfo0.hasType();
        java.lang.String str8 = jSDocInfo0.getLicense();
        boolean boolean9 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(markerCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getLicense();
        boolean boolean7 = jSDocInfo0.hasBaseType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getBaseType();
        com.google.javascript.rhino.Node node9 = null;
        jSDocInfo0.setAssociatedNode(node9);
        boolean boolean11 = jSDocInfo0.isIdGenerator();
        boolean boolean12 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean10 = jSDocInfo0.isOverride();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean9 = jSDocInfo0.hasDescriptionForParameter("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getVersion();
        boolean boolean5 = jSDocInfo0.isHidden();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getSuppressions();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        boolean boolean9 = jSDocInfo0.isOverride();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getStartLine();
        int int3 = stringPosition0.getStartLine();
        int int4 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("");
        java.lang.String str7 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo0.hasDescriptionForParameter("JSDocInfo");
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        boolean boolean6 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        com.google.javascript.rhino.Node node3 = null;
        namePosition0.setItem(node3);
        int int5 = namePosition0.getStartLine();
        int int6 = namePosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        int int4 = stringPosition0.getStartLine();
        stringPosition0.setItem("");
        int int7 = stringPosition0.getStartLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        java.lang.String str6 = jSDocInfo0.getLendsName();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        boolean boolean8 = jSDocInfo0.isOverride();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.isIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean6 = jSDocInfo0.hasThisType();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isInterface();
        jSDocInfo0.setDeprecated(true);
        java.lang.String str8 = jSDocInfo0.getReturnDescription();
        java.lang.String str9 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node4 = null;
        namePosition0.setItem(node4);
        int int6 = namePosition0.getPositionOnEndLine();
        int int7 = namePosition0.getPositionOnEndLine();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        java.lang.String str6 = jSDocInfo0.getLendsName();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        boolean boolean8 = jSDocInfo0.isOverride();
        boolean boolean10 = jSDocInfo0.hasParameterType("JSDocInfo");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isInterface();
        boolean boolean10 = jSDocInfo0.isNoCompile();
        boolean boolean11 = jSDocInfo0.isExterns();
        java.lang.String str12 = jSDocInfo0.getMeaning();
        boolean boolean14 = jSDocInfo0.hasParameter("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getParameterType("hi!");
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        java.lang.String str2 = jSDocInfo0.toString();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        java.lang.String str5 = jSDocInfo0.getDescription();
        boolean boolean7 = jSDocInfo0.hasParameter("hi!");
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        boolean boolean9 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSDocInfo" + "'", str2, "JSDocInfo");
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        boolean boolean7 = jSDocInfo0.hasDescriptionForParameter("");
        boolean boolean8 = jSDocInfo0.hasType();
        java.lang.String str9 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.isExterns();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        boolean boolean8 = jSDocInfo0.isDefine();
        java.lang.String str9 = jSDocInfo0.getFileOverview();
        java.lang.String str10 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean6 = jSDocInfo0.isHidden();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.hasType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getThrownTypes();
        boolean boolean9 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        int int4 = stringPosition0.getEndLine();
        int int5 = stringPosition0.getEndLine();
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getEndLine();
        int int8 = stringPosition0.getStartLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation(10, (int) '#', 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 10?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getBaseType();
        java.lang.String str7 = jSDocInfo0.getLicense();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        boolean boolean4 = jSDocInfo0.isJavaDispatch();
        boolean boolean5 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        java.lang.Class<?> wildcardClass7 = jSDocInfo0.getClass();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        int int3 = jSDocInfo0.getParameterCount();
        boolean boolean4 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        stringPosition0.setItem("");
        stringPosition0.setPositionInformation((int) (byte) -1, 52, 32, 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        boolean boolean8 = jSDocInfo0.isOverride();
        boolean boolean10 = jSDocInfo0.hasParameterType("JSDocInfo");
        boolean boolean11 = jSDocInfo0.shouldPreserveTry();
        boolean boolean12 = jSDocInfo0.isExport();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        java.lang.String str6 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.hasType();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isInterface();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getReturnDescription();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean2 = jSDocInfo0.isHidden();
        boolean boolean3 = jSDocInfo0.hasModifies();
        boolean boolean4 = jSDocInfo0.isExterns();
        java.lang.String str5 = jSDocInfo0.getSourceName();
        boolean boolean6 = jSDocInfo0.shouldPreserveTry();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        java.lang.String str2 = stringPosition0.getItem();
        int int3 = stringPosition0.getEndLine();
        int int4 = stringPosition0.getStartLine();
        stringPosition0.setItem("JSDocInfo");
        int int7 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        int int7 = jSDocInfo0.getParameterCount();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str9 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        boolean boolean4 = typePosition0.hasBrackets();
        boolean boolean5 = typePosition0.hasBrackets();
        boolean boolean6 = typePosition0.hasBrackets();
        boolean boolean7 = typePosition0.hasBrackets();
        boolean boolean8 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node9 = typePosition0.getItem();
        int int10 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isConstant();
        boolean boolean10 = jSDocInfo0.isExpose();
        boolean boolean11 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getEnumParameterType();
        boolean boolean13 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeExpression14);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        int int4 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        java.lang.String str8 = jSDocInfo0.getBlockDescription();
        jSDocInfo0.setDeprecated(false);
        int int11 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(typePosition5);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        java.lang.String str3 = jSDocInfo0.getDeprecationReason();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getExtendedInterfaces();
        java.lang.String str5 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.isIdGenerator();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean6 = jSDocInfo0.hasModifies();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isOverride();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        int int3 = namePosition0.getStartLine();
        int int4 = namePosition0.getPositionOnStartLine();
        int int5 = namePosition0.getEndLine();
        int int6 = namePosition0.getStartLine();
        int int7 = namePosition0.getEndLine();
        com.google.javascript.rhino.Node node8 = null;
        namePosition0.setItem(node8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str4 = jSDocInfo0.getDeprecationReason();
        boolean boolean5 = jSDocInfo0.isExterns();
        java.lang.String str6 = jSDocInfo0.getFileOverview();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("");
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getParameterNames();
        boolean boolean10 = jSDocInfo0.isExport();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        java.lang.String str4 = jSDocInfo0.getDescription();
        boolean boolean5 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("JSDocInfo");
        boolean boolean8 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("");
        com.google.javascript.rhino.Node node8 = null;
        jSDocInfo0.setAssociatedNode(node8);
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getReferences();
        boolean boolean11 = jSDocInfo0.hasFileOverview();
        java.lang.String str12 = jSDocInfo0.getDescription();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        boolean boolean6 = jSDocInfo0.isExpose();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strCollection7);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean3 = jSDocInfo0.hasParameter("");
        boolean boolean4 = jSDocInfo0.hasEnumParameterType();
        java.lang.String str6 = jSDocInfo0.getDescriptionForParameter("JSDocInfo");
        boolean boolean7 = jSDocInfo0.isExpose();
        boolean boolean9 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        java.lang.String str6 = stringPosition0.getItem();
        java.lang.String str7 = stringPosition0.getItem();
        int int8 = stringPosition0.getStartLine();
        int int9 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection9 = jSDocInfo0.getReferences();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNull(strCollection9);
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getReturnType();
        int int10 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str11 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isConstant();
        jSDocInfo0.setLicense("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getStartLine();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.util.Set<java.lang.String> strSet3 = jSDocInfo0.getParameterNames();
        boolean boolean4 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getBaseType();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getThisType();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.isDeprecated();
        java.lang.String str8 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        boolean boolean4 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        boolean boolean8 = jSDocInfo0.hasParameter("hi!");
        boolean boolean9 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo0.getThrownTypes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getReturnType();
        boolean boolean12 = jSDocInfo0.isHidden();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getStartLine();
        com.google.javascript.rhino.Node node2 = namePosition0.getItem();
        int int3 = namePosition0.getStartLine();
        int int4 = namePosition0.getPositionOnStartLine();
        int int5 = namePosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean6 = jSDocInfo0.isHidden();
        java.lang.String str7 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        boolean boolean9 = jSDocInfo0.hasEnumParameterType();
        boolean boolean10 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getBaseType();
        java.util.Collection<java.lang.String> strCollection4 = jSDocInfo0.getAuthors();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(strCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean6 = jSDocInfo0.hasParameter("");
        java.lang.String str7 = jSDocInfo0.getLicense();
        jSDocInfo0.addSuppression("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        boolean boolean5 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getReturnType();
        java.lang.String str10 = jSDocInfo0.getMeaning();
        boolean boolean11 = jSDocInfo0.shouldPreserveTry();
        boolean boolean12 = jSDocInfo0.isInterface();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str7 = jSDocInfo0.getOriginalCommentString();
        boolean boolean8 = jSDocInfo0.isExpose();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getThrownTypes();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = jSDocInfo0.getTypeNodes();
        boolean boolean11 = jSDocInfo0.isConstant();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.containsDeclaration();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getTypedefType();
        boolean boolean9 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasModifies();
        jSDocInfo0.setLicense("hi!");
        boolean boolean11 = jSDocInfo0.containsDeclaration();
        java.lang.String str12 = jSDocInfo0.getDeprecationReason();
        java.lang.String str13 = jSDocInfo0.getDescription();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        java.lang.String str8 = jSDocInfo0.getDeprecationReason();
        boolean boolean9 = jSDocInfo0.shouldPreserveTry();
        boolean boolean10 = jSDocInfo0.isHidden();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        boolean boolean8 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str10 = jSDocInfo9.toString();
        java.lang.String str11 = jSDocInfo9.getDescription();
        java.lang.String str12 = jSDocInfo9.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = jSDocInfo9.getTypeNodes();
        boolean boolean15 = jSDocInfo9.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList16 = jSDocInfo9.getThrownTypes();
        jSDocInfo9.setDeprecated(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean20 = jSDocInfo19.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility21 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo19.setVisibility(visibility21);
        jSDocInfo9.setVisibility(visibility21);
        jSDocInfo0.setVisibility(visibility21);
        boolean boolean25 = jSDocInfo0.isExpose();
        java.lang.String str27 = jSDocInfo0.getDescriptionForParameter("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSDocInfo" + "'", str10, "JSDocInfo");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + visibility21 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility21.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        boolean boolean4 = jSDocInfo0.isExpose();
        java.lang.String str5 = jSDocInfo0.getBlockDescription();
        boolean boolean6 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList10 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean11 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        jSDocInfo0.setDeprecated(true);
        java.lang.String str6 = jSDocInfo0.getDescription();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        int int1 = namePosition0.getPositionOnEndLine();
        int int2 = namePosition0.getPositionOnEndLine();
        int int3 = namePosition0.getPositionOnStartLine();
        int int4 = namePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        boolean boolean3 = jSDocInfo0.hasParameter("");
        boolean boolean4 = jSDocInfo0.hasEnumParameterType();
        com.google.javascript.rhino.Node node5 = null;
        jSDocInfo0.setAssociatedNode(node5);
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        boolean boolean2 = typePosition0.hasBrackets();
        int int3 = typePosition0.getEndLine();
        int int4 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getBaseType();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getAuthors();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(strCollection5);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = null;
        namePosition0.setItem(node1);
        int int3 = namePosition0.getStartLine();
        namePosition0.setPositionInformation(0, (int) (byte) 100, (int) '4', 52);
        com.google.javascript.rhino.Node node9 = null;
        namePosition0.setItem(node9);
        int int11 = namePosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getBaseType();
        java.lang.String str3 = jSDocInfo0.getDeprecationReason();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        jSDocInfo0.addSuppression("");
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        boolean boolean9 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getStartLine();
        int int3 = stringPosition0.getStartLine();
        java.lang.String str4 = stringPosition0.getItem();
        java.lang.String str5 = stringPosition0.getItem();
        int int6 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        jSDocInfo0.setLicense("hi!");
        boolean boolean7 = jSDocInfo0.isExpose();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getThrownTypes();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        java.lang.String str10 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str7 = jSDocInfo0.getSourceName();
        java.lang.String str8 = jSDocInfo0.getVersion();
        boolean boolean9 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.containsDeclaration();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getName();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition4 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(nodeSourcePosition4);
        org.junit.Assert.assertNull(typePosition5);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        java.lang.String str6 = jSDocInfo0.getSourceName();
        java.lang.String str7 = jSDocInfo0.getReturnDescription();
        boolean boolean8 = jSDocInfo0.isExport();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.lang.String str2 = jSDocInfo0.getLicense();
        jSDocInfo0.setLicense("");
        boolean boolean5 = jSDocInfo0.isInterface();
        boolean boolean6 = jSDocInfo0.isHidden();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        boolean boolean9 = jSDocInfo0.isIdGenerator();
        java.util.Set<java.lang.String> strSet10 = jSDocInfo0.getModifies();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        int int8 = stringPosition0.getPositionOnStartLine();
        stringPosition0.setPositionInformation(0, 0, (int) (short) 0, (int) (short) 100);
        stringPosition0.setItem("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isInterface();
        boolean boolean10 = jSDocInfo0.isNoCompile();
        boolean boolean11 = jSDocInfo0.isDeprecated();
        java.util.Set<java.lang.String> strSet12 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo0.hasDescriptionForParameter("JSDocInfo");
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean6 = jSDocInfo0.isHidden();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        java.lang.String str8 = jSDocInfo0.getVersion();
        boolean boolean10 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.lang.String str11 = jSDocInfo0.getSourceName();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection12 = jSDocInfo0.getMarkers();
        java.lang.String str13 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(markerCollection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str2 = jSDocInfo0.getDescriptionForParameter("");
        boolean boolean3 = jSDocInfo0.isConstant();
        java.util.Set<java.lang.String> strSet4 = jSDocInfo0.getParameterNames();
        java.util.Collection<java.lang.String> strCollection5 = jSDocInfo0.getReferences();
        boolean boolean6 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(strCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isHidden();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean5 = jSDocInfo0.isInterface();
        boolean boolean6 = jSDocInfo0.hasType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("JSDocInfo");
        java.lang.String str5 = jSDocInfo0.getLendsName();
        boolean boolean6 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getModifies();
        boolean boolean10 = jSDocInfo0.hasEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnStartLine();
        int int3 = stringPosition0.getEndLine();
        int int4 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getType();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getReferences();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection11 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertNotNull(markerCollection11);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        java.lang.String str5 = stringPosition0.getItem();
        java.lang.String str6 = stringPosition0.getItem();
        int int7 = stringPosition0.getStartLine();
        stringPosition0.setPositionInformation((int) (byte) -1, (-1), 0, (int) '4');
        stringPosition0.setItem("JSDocInfo");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(nodeCollection6);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.hasType();
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = jSDocInfo0.getTypeNodes();
        java.lang.String str11 = jSDocInfo0.getLicense();
        java.lang.String str12 = jSDocInfo0.getDescription();
        boolean boolean13 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = jSDocInfo0.getVisibility();
        java.lang.String str15 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(visibility14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        java.lang.String str6 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean10 = jSDocInfo0.hasEnumParameterType();
        boolean boolean11 = jSDocInfo0.isConstructor();
        boolean boolean12 = jSDocInfo0.isDeprecated();
        java.lang.String str13 = jSDocInfo0.getReturnDescription();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        typePosition0.setPositionInformation(1, (int) (short) 0, (int) '4', (int) ' ');
        boolean boolean9 = typePosition0.hasBrackets();
        int int10 = typePosition0.getPositionOnEndLine();
        boolean boolean11 = typePosition0.hasBrackets();
        int int12 = typePosition0.getPositionOnStartLine();
        int int13 = typePosition0.getEndLine();
        int int14 = typePosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isOverride();
        jSDocInfo0.addSuppression("JSDocInfo");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.isDeprecated();
        java.util.Set<java.lang.String> strSet11 = jSDocInfo0.getModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + visibility9 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility9.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        java.lang.String str4 = jSDocInfo0.getSourceName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        java.lang.String str6 = jSDocInfo0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        boolean boolean9 = jSDocInfo0.hasParameterType("JSDocInfo");
        java.lang.String str10 = jSDocInfo0.getSourceName();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getEndLine();
        // The following exception was thrown during execution in test generation
        try {
            stringPosition0.setPositionInformation((int) (short) 1, 0, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Recorded bad position information?start-line: 1?end-line: 0");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        java.lang.String str5 = stringPosition0.getItem();
        stringPosition0.setPositionInformation((int) (byte) 0, (-1), (int) (short) 10, (int) (byte) 100);
        stringPosition0.setItem("hi!");
        stringPosition0.setPositionInformation(10, (int) ' ', 35, 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        java.lang.String str2 = jSDocInfo0.toString();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        boolean boolean5 = jSDocInfo0.isExport();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSDocInfo" + "'", str2, "JSDocInfo");
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        boolean boolean5 = jSDocInfo0.isInterface();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getName();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node4 = namePosition0.getItem();
        int int5 = namePosition0.getEndLine();
        int int6 = namePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node7 = null;
        namePosition0.setItem(node7);
        com.google.javascript.rhino.Node node9 = null;
        namePosition0.setItem(node9);
        namePosition0.setPositionInformation((int) (short) 1, 35, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        jSDocInfo0.setLicense("JSDocInfo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        int int7 = jSDocInfo0.getParameterCount();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getThrownTypes();
        int int9 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean10 = jSDocInfo0.isExpose();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isInterface();
        boolean boolean10 = jSDocInfo0.isNoCompile();
        boolean boolean11 = jSDocInfo0.isExterns();
        java.lang.String str12 = jSDocInfo0.getMeaning();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertNull(jSTypeExpression14);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        jSDocInfo0.addSuppression("");
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getEnumParameterType();
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        jSDocInfo0.setLicense("hi!");
        boolean boolean9 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        boolean boolean7 = jSDocInfo0.hasDescriptionForParameter("");
        boolean boolean8 = jSDocInfo0.hasType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean5 = jSDocInfo0.hasParameterType("");
        boolean boolean6 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.hasParameterType("JSDocInfo");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getBaseType();
        boolean boolean10 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("JSDocInfo");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getBaseType();
        boolean boolean9 = jSDocInfo0.isOverride();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        java.lang.String str6 = jSDocInfo0.toString();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        boolean boolean8 = jSDocInfo0.isNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getBaseType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection10 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNotNull(markerCollection10);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility3);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        boolean boolean7 = jSDocInfo0.isInterface();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getParameterNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + visibility3 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility3.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        boolean boolean6 = jSDocInfo0.isExpose();
        boolean boolean7 = jSDocInfo0.isExport();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        java.lang.String str5 = stringPosition0.getItem();
        java.lang.String str6 = stringPosition0.getItem();
        int int7 = stringPosition0.getPositionOnEndLine();
        int int8 = stringPosition0.getStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean7 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.isInterface();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.isJavaDispatch();
        java.lang.String str8 = jSDocInfo0.getBlockDescription();
        boolean boolean9 = jSDocInfo0.isConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean5 = jSDocInfo0.hasParameterType("");
        boolean boolean6 = jSDocInfo0.isNoSideEffects();
        boolean boolean8 = jSDocInfo0.hasParameterType("JSDocInfo");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getBaseType();
        boolean boolean10 = jSDocInfo0.isNoAlias();
        java.lang.String str11 = jSDocInfo0.getDescription();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        boolean boolean5 = jSDocInfo0.isNoCompile();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        int int7 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str7 = jSDocInfo0.getOriginalCommentString();
        boolean boolean8 = jSDocInfo0.isExpose();
        boolean boolean9 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition4 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition6 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = marker0.getType();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(typePosition4);
        org.junit.Assert.assertNull(typePosition5);
        org.junit.Assert.assertNull(nodeSourcePosition6);
        org.junit.Assert.assertNull(typePosition7);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        boolean boolean2 = typePosition0.hasBrackets();
        int int3 = typePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node4 = typePosition0.getItem();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        jSDocInfo0.setLicense("hi!");
        boolean boolean7 = jSDocInfo0.isExpose();
        boolean boolean8 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getImplementedInterfaces();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getEnumParameterType();
        boolean boolean11 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        java.lang.String str1 = stringPosition0.getItem();
        int int2 = stringPosition0.getPositionOnEndLine();
        java.lang.String str3 = stringPosition0.getItem();
        int int4 = stringPosition0.getEndLine();
        int int5 = stringPosition0.getStartLine();
        int int6 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        int int4 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getType();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        jSDocInfo0.setLicense("JSDocInfo");
        int int5 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition8 = marker0.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(typePosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(typePosition8);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        java.lang.String str5 = stringPosition0.getItem();
        int int6 = stringPosition0.getEndLine();
        java.lang.String str7 = stringPosition0.getItem();
        int int8 = stringPosition0.getStartLine();
        int int9 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (byte) 0, 0, 52, (-1));
        stringPosition0.setPositionInformation(0, 1, (int) (byte) 10, 100);
        int int11 = stringPosition0.getStartLine();
        stringPosition0.setPositionInformation(0, (int) ' ', (int) (byte) 10, (int) (short) -1);
        stringPosition0.setPositionInformation((-1), 1, (int) '#', (int) ' ');
        int int22 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.lang.String str5 = jSDocInfo0.getOriginalCommentString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(visibility6);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("");
        boolean boolean5 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        java.lang.String str7 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        boolean boolean5 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getEnumParameterType();
        boolean boolean7 = jSDocInfo0.hasFileOverview();
        boolean boolean8 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getEnumParameterType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        boolean boolean5 = jSDocInfo0.isExterns();
        boolean boolean6 = jSDocInfo0.isNoSideEffects();
        boolean boolean7 = jSDocInfo0.hasThisType();
        boolean boolean8 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean6 = jSDocInfo0.isHidden();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        boolean boolean8 = jSDocInfo0.isNoCompile();
        boolean boolean9 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getTypedefType();
        boolean boolean12 = jSDocInfo0.hasParameterType("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setItem("");
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (byte) 1, 10, (int) '4');
        int int8 = stringPosition0.getStartLine();
        int int9 = stringPosition0.getPositionOnEndLine();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        jSDocInfo0.setDeprecated(true);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean11 = jSDocInfo10.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo10.setVisibility(visibility12);
        jSDocInfo0.setVisibility(visibility12);
        boolean boolean15 = jSDocInfo0.isNoShadow();
        java.lang.String str16 = jSDocInfo0.getLicense();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + visibility12 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility12.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        int int3 = jSDocInfo0.getParameterCount();
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.common.collect.ImmutableList<java.lang.String> strList5 = jSDocInfo0.getTemplateTypeNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        boolean boolean10 = jSDocInfo0.hasParameter("hi!");
        boolean boolean11 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoCompile();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility3 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo0.setVisibility(visibility3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean6 = jSDocInfo5.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo5.setVisibility(visibility7);
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo5.getExtendedInterfaces();
        boolean boolean10 = jSDocInfo5.isExport();
        boolean boolean12 = jSDocInfo5.hasDescriptionForParameter("");
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str14 = jSDocInfo13.toString();
        java.lang.String str15 = jSDocInfo13.getDescription();
        java.lang.String str16 = jSDocInfo13.getLendsName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasBaseType();
        boolean boolean19 = jSDocInfo17.isImplicitCast();
        int int20 = jSDocInfo17.getImplementedInterfaceCount();
        boolean boolean21 = jSDocInfo17.isDeprecated();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean23 = jSDocInfo22.hasBaseType();
        boolean boolean24 = jSDocInfo22.isNoCompile();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility25 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo22.setVisibility(visibility25);
        jSDocInfo17.setVisibility(visibility25);
        jSDocInfo13.setVisibility(visibility25);
        jSDocInfo5.setVisibility(visibility25);
        jSDocInfo0.setVisibility(visibility25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + visibility3 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility3.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + visibility7 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility7.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JSDocInfo" + "'", str14, "JSDocInfo");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + visibility25 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility25.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        boolean boolean8 = jSDocInfo0.isOverride();
        boolean boolean9 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getParameterType("hi!");
        int int12 = jSDocInfo0.getParameterCount();
        boolean boolean13 = jSDocInfo0.isConstant();
        boolean boolean14 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        boolean boolean5 = jSDocInfo0.isOverride();
        boolean boolean6 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        boolean boolean8 = jSDocInfo0.isExterns();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        boolean boolean5 = jSDocInfo0.isOverride();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        boolean boolean8 = jSDocInfo0.hasDescriptionForParameter("hi!");
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        int int3 = typePosition0.getStartLine();
        int int4 = typePosition0.getEndLine();
        boolean boolean5 = typePosition0.hasBrackets();
        boolean boolean6 = typePosition0.hasBrackets();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isExpose();
        jSDocInfo0.setDeprecated(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str8 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.Node node9 = jSDocInfo0.getAssociatedNode();
        java.lang.String str10 = jSDocInfo0.getLicense();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        boolean boolean4 = jSDocInfo0.isConsistentIdGenerator();
        jSDocInfo0.setDeprecated(false);
        boolean boolean7 = jSDocInfo0.hasBaseType();
        boolean boolean8 = jSDocInfo0.hasThisType();
        boolean boolean9 = jSDocInfo0.hasBaseType();
        boolean boolean10 = jSDocInfo0.isDeprecated();
        boolean boolean11 = jSDocInfo0.isConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean5 = jSDocInfo0.hasParameterType("");
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getThrownTypes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
        org.junit.Assert.assertNull(visibility9);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        boolean boolean4 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getType();
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.hasBaseType();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        int int8 = jSDocInfo0.getParameterCount();
        boolean boolean10 = jSDocInfo0.hasParameterType("JSDocInfo");
        boolean boolean11 = jSDocInfo0.hasTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("");
        boolean boolean4 = jSDocInfo0.isOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getType();
        boolean boolean7 = jSDocInfo0.hasParameter("hi!");
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean9 = jSDocInfo0.hasParameter("");
        boolean boolean10 = jSDocInfo0.isInterface();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getLicense();
        boolean boolean8 = jSDocInfo0.hasParameter("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getTypedefType();
        java.lang.String str10 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isHidden();
        boolean boolean5 = jSDocInfo0.isConstructor();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility6);
        boolean boolean9 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.lang.String str10 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = null;
        jSDocInfo0.setVisibility(visibility11);
        boolean boolean13 = jSDocInfo0.hasThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = jSDocInfo0.getTypedefType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + visibility6 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility6.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeExpression14);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        boolean boolean8 = jSDocInfo0.hasParameter("JSDocInfo");
        boolean boolean9 = jSDocInfo0.isNoSideEffects();
        boolean boolean10 = jSDocInfo0.hasType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getPositionOnEndLine();
        stringPosition0.setItem("hi!");
        int int5 = stringPosition0.getPositionOnEndLine();
        java.lang.String str6 = stringPosition0.getItem();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        java.lang.String str6 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean11 = jSDocInfo0.hasReturnType();
        boolean boolean12 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        jSDocInfo0.setLicense("JSDocInfo");
        boolean boolean10 = jSDocInfo0.isExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility6);
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean10 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + visibility6 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility6.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getType();
        boolean boolean4 = jSDocInfo0.isExport();
        jSDocInfo0.setLicense("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        boolean boolean3 = jSDocInfo0.isDefine();
        jSDocInfo0.setDeprecated(false);
        java.lang.String str6 = jSDocInfo0.getVersion();
        jSDocInfo0.setDeprecated(true);
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(markerCollection9);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean6 = jSDocInfo0.isDefine();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getLendsName();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = jSDocInfo0.getReturnType();
        java.lang.String str4 = jSDocInfo0.getBlockDescription();
        boolean boolean6 = jSDocInfo0.hasDescriptionForParameter("");
        boolean boolean7 = jSDocInfo0.hasModifies();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        int int9 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getDescription();
        boolean boolean5 = jSDocInfo0.hasParameter("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getThrownTypes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        java.lang.String str8 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.Node node9 = jSDocInfo0.getAssociatedNode();
        boolean boolean10 = jSDocInfo0.isIdGenerator();
        boolean boolean11 = jSDocInfo0.hasThisType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.Node node4 = jSDocInfo0.getAssociatedNode();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        jSDocInfo0.addSuppression("");
        java.lang.String str5 = jSDocInfo0.getBlockDescription();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean7 = jSDocInfo0.isNoCompile();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        int int3 = jSDocInfo0.getParameterCount();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoCompile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean6 = jSDocInfo0.isHidden();
        java.lang.String str7 = jSDocInfo0.getFileOverview();
        java.lang.String str8 = jSDocInfo0.getVersion();
        boolean boolean10 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.lang.String str11 = jSDocInfo0.getSourceName();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection12 = jSDocInfo0.getMarkers();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection13 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(markerCollection12);
        org.junit.Assert.assertNotNull(markerCollection13);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        boolean boolean4 = jSDocInfo0.isConsistentIdGenerator();
        jSDocInfo0.setDeprecated(false);
        boolean boolean7 = jSDocInfo0.isNoShadow();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("");
        com.google.javascript.rhino.Node node8 = null;
        jSDocInfo0.setAssociatedNode(node8);
        boolean boolean10 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getEnumParameterType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeExpression11);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean2 = jSDocInfo0.hasDescriptionForParameter("JSDocInfo");
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection3 = jSDocInfo0.getMarkers();
        boolean boolean4 = jSDocInfo0.isNoTypeCheck();
        boolean boolean5 = jSDocInfo0.isExport();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(markerCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        java.lang.String str6 = jSDocInfo0.toString();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility7 = jSDocInfo0.getVisibility();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList9 = jSDocInfo0.getImplementedInterfaces();
        com.google.common.collect.ImmutableList<java.lang.String> strList10 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean11 = jSDocInfo0.hasReturnType();
        java.lang.String str12 = jSDocInfo0.getFileOverview();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSDocInfo" + "'", str6, "JSDocInfo");
        org.junit.Assert.assertNull(visibility7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasModifies();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        java.lang.String str5 = jSDocInfo0.getLendsName();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getName();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition2 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getAnnotation();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition4 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getName();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(nodeSourcePosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(nodeSourcePosition4);
        org.junit.Assert.assertNull(stringPosition5);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        java.util.Set<java.lang.String> strSet5 = jSDocInfo0.getParameterNames();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection6 = jSDocInfo0.getMarkers();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = jSDocInfo0.getTypeNodes();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(markerCollection6);
        org.junit.Assert.assertNotNull(nodeCollection7);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        boolean boolean4 = jSDocInfo0.isJavaDispatch();
        boolean boolean5 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getTypedefType();
        jSDocInfo0.setLicense("hi!");
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isConstructor();
        java.lang.String str3 = jSDocInfo0.getLicense();
        java.lang.String str4 = jSDocInfo0.getDescription();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility6 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility6);
        java.lang.String str9 = jSDocInfo0.getDescriptionForParameter("hi!");
        boolean boolean10 = jSDocInfo0.containsDeclaration();
        boolean boolean11 = jSDocInfo0.isDeprecated();
        boolean boolean12 = jSDocInfo0.isExport();
        java.lang.String str13 = jSDocInfo0.toString();
        java.lang.String str14 = jSDocInfo0.toString();
        int int15 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + visibility6 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility6.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSDocInfo" + "'", str13, "JSDocInfo");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JSDocInfo" + "'", str14, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.hasParameter("hi!");
        boolean boolean9 = jSDocInfo0.isDefine();
        java.lang.String str10 = jSDocInfo0.getFileOverview();
        boolean boolean12 = jSDocInfo0.hasParameterType("JSDocInfo");
        java.lang.String str13 = jSDocInfo0.getDeprecationReason();
        java.util.Set<java.lang.String> strSet14 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        boolean boolean7 = jSDocInfo0.isIdGenerator();
        boolean boolean8 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isInterface();
        boolean boolean4 = jSDocInfo0.hasParameterType("JSDocInfo");
        boolean boolean6 = jSDocInfo0.hasDescriptionForParameter("hi!");
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean9 = jSDocInfo0.isExpose();
        boolean boolean10 = jSDocInfo0.isInterface();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition6 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition8 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition9 = marker0.getDescription();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(typePosition6);
        org.junit.Assert.assertNull(stringPosition7);
        org.junit.Assert.assertNull(stringPosition8);
        org.junit.Assert.assertNull(stringPosition9);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        jSDocInfo0.setDeprecated(false);
        boolean boolean9 = jSDocInfo0.hasType();
        java.util.Collection<java.lang.String> strCollection10 = jSDocInfo0.getReferences();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = jSDocInfo0.getReturnType();
        int int12 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strCollection10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnEndLine();
        com.google.javascript.rhino.Node node4 = namePosition0.getItem();
        int int5 = namePosition0.getEndLine();
        int int6 = namePosition0.getPositionOnStartLine();
        com.google.javascript.rhino.Node node7 = null;
        namePosition0.setItem(node7);
        com.google.javascript.rhino.Node node9 = null;
        namePosition0.setItem(node9);
        int int11 = namePosition0.getPositionOnEndLine();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        java.lang.String str4 = jSDocInfo0.getVersion();
        boolean boolean5 = jSDocInfo0.isHidden();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = jSDocInfo0.getTypeNodes();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        boolean boolean8 = jSDocInfo0.isDefine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        boolean boolean6 = jSDocInfo0.isIdGenerator();
        boolean boolean7 = jSDocInfo0.hasReturnType();
        jSDocInfo0.setDeprecated(false);
        boolean boolean10 = jSDocInfo0.hasModifies();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        java.util.Collection<java.lang.String> strCollection7 = jSDocInfo0.getReferences();
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        boolean boolean9 = jSDocInfo0.isExterns();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strCollection7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        boolean boolean6 = jSDocInfo0.isExterns();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.isIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getReturnType();
        boolean boolean10 = jSDocInfo0.hasReturnType();
        boolean boolean12 = jSDocInfo0.hasParameter("JSDocInfo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getTypedefType();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getParameterNames();
        boolean boolean8 = jSDocInfo0.hasParameter("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasModifies();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        int int4 = typePosition0.getEndLine();
        com.google.javascript.rhino.Node node5 = null;
        typePosition0.setItem(node5);
        com.google.javascript.rhino.Node node7 = null;
        typePosition0.setItem(node7);
        int int9 = typePosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        int int8 = stringPosition0.getPositionOnEndLine();
        int int9 = stringPosition0.getEndLine();
        int int10 = stringPosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = jSDocInfo0.getEnumParameterType();
        boolean boolean3 = jSDocInfo0.isHidden();
        boolean boolean4 = jSDocInfo0.isExpose();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getImplementedInterfaces();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jSTypeExpression2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition0 = new com.google.javascript.rhino.JSDocInfo.TypePosition();
        boolean boolean1 = typePosition0.hasBrackets();
        int int2 = typePosition0.getPositionOnStartLine();
        boolean boolean3 = typePosition0.hasBrackets();
        boolean boolean4 = typePosition0.hasBrackets();
        boolean boolean5 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node6 = typePosition0.getItem();
        boolean boolean7 = typePosition0.hasBrackets();
        com.google.javascript.rhino.Node node8 = null;
        typePosition0.setItem(node8);
        typePosition0.setPositionInformation(0, (int) (byte) -1, (int) (byte) 10, 0);
        int int15 = typePosition0.getPositionOnStartLine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str3 = jSDocInfo0.getDescriptionForParameter("");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList4 = jSDocInfo0.getExtendedInterfaces();
        com.google.javascript.rhino.Node node5 = null;
        jSDocInfo0.setAssociatedNode(node5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(jSTypeExpressionList4);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition1 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition6 = marker0.getAnnotation();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition7 = marker0.getType();
        org.junit.Assert.assertNull(stringPosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
        org.junit.Assert.assertNull(stringPosition6);
        org.junit.Assert.assertNull(typePosition7);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        java.util.Set<java.lang.String> strSet6 = jSDocInfo0.getSuppressions();
        int int7 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        int int2 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str3 = jSDocInfo0.getFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getType();
        java.lang.String str5 = jSDocInfo0.getSourceName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isOverride();
        jSDocInfo0.addSuppression("JSDocInfo");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.isOverride();
        boolean boolean11 = jSDocInfo0.isNoAlias();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + visibility9 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility9.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getModifies();
        boolean boolean9 = jSDocInfo0.isDefine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        boolean boolean3 = jSDocInfo0.hasTypedefType();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.hasThisType();
        boolean boolean6 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean7 = jSDocInfo0.isConstant();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility8 = jSDocInfo0.getVisibility();
        boolean boolean10 = jSDocInfo0.hasParameterType("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(visibility8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        java.lang.String str4 = jSDocInfo0.getLicense();
        boolean boolean5 = jSDocInfo0.isExpose();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean7 = jSDocInfo0.isDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = jSDocInfo0.getThisType();
        boolean boolean9 = jSDocInfo0.isNoTypeCheck();
        boolean boolean10 = jSDocInfo0.isIdGenerator();
        boolean boolean11 = jSDocInfo0.containsDeclaration();
        boolean boolean12 = jSDocInfo0.isExpose();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean9 = jSDocInfo0.hasParameterType("hi!");
        java.lang.String str10 = jSDocInfo0.getReturnDescription();
        boolean boolean11 = jSDocInfo0.hasReturnType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = jSDocInfo0.getReturnType();
        java.util.Set<java.lang.String> strSet13 = jSDocInfo0.getSuppressions();
        jSDocInfo0.addSuppression("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeExpression12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getThisType();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        boolean boolean6 = jSDocInfo0.isExterns();
        com.google.javascript.rhino.Node node7 = null;
        jSDocInfo0.setAssociatedNode(node7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        int int1 = stringPosition0.getStartLine();
        int int2 = stringPosition0.getStartLine();
        int int3 = stringPosition0.getPositionOnStartLine();
        int int4 = stringPosition0.getEndLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        java.lang.String str5 = jSDocInfo0.getVersion();
        boolean boolean6 = jSDocInfo0.isConstant();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.isConsistentIdGenerator();
        int int9 = jSDocInfo0.getParameterCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.hasThisType();
        jSDocInfo0.setLicense("hi!");
        boolean boolean7 = jSDocInfo0.isExpose();
        boolean boolean8 = jSDocInfo0.containsDeclaration();
        boolean boolean9 = jSDocInfo0.isDefine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        jSDocInfo0.setDeprecated(false);
        boolean boolean9 = jSDocInfo0.hasType();
        boolean boolean10 = jSDocInfo0.isExterns();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility11 = jSDocInfo0.getVisibility();
        boolean boolean13 = jSDocInfo0.hasParameter("");
        java.lang.String str14 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility15 = jSDocInfo0.getVisibility();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(visibility11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(visibility15);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection2 = jSDocInfo0.getTypeNodes();
        java.util.Collection<java.lang.String> strCollection3 = jSDocInfo0.getReferences();
        boolean boolean4 = jSDocInfo0.hasType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection5 = jSDocInfo0.getMarkers();
        java.lang.String str6 = jSDocInfo0.getOriginalCommentString();
        java.lang.String str7 = jSDocInfo0.getVersion();
        boolean boolean8 = jSDocInfo0.isExport();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(nodeCollection2);
        org.junit.Assert.assertNull(strCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(markerCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConsistentIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getTypedefType();
        boolean boolean5 = jSDocInfo0.isNoSideEffects();
        boolean boolean6 = jSDocInfo0.hasFileOverview();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getName();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition3 = marker0.getDescription();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition4 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(stringPosition3);
        org.junit.Assert.assertNull(nodeSourcePosition4);
        org.junit.Assert.assertNull(typePosition5);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        boolean boolean5 = jSDocInfo0.hasFileOverview();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = jSDocInfo0.getThisType();
        com.google.common.collect.ImmutableList<java.lang.String> strList7 = jSDocInfo0.getTemplateTypeNames();
        java.lang.String str8 = jSDocInfo0.getSourceName();
        boolean boolean9 = jSDocInfo0.isConstant();
        boolean boolean10 = jSDocInfo0.isExpose();
        boolean boolean11 = jSDocInfo0.isOverride();
        boolean boolean12 = jSDocInfo0.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList13 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSTypeExpression6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList13);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition2 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition3 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition5 = marker0.getName();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(stringPosition2);
        org.junit.Assert.assertNull(typePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(stringPosition5);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("hi!");
        com.google.common.collect.ImmutableList<java.lang.String> strList8 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean9 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}

