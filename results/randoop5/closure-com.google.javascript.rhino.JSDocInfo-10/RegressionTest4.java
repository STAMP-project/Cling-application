import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        com.google.common.collect.ImmutableList<java.lang.String> strList3 = jSDocInfo0.getTemplateTypeNames();
        boolean boolean4 = jSDocInfo0.isNoShadow();
        com.google.javascript.rhino.Node node5 = jSDocInfo0.getAssociatedNode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        boolean boolean11 = jSDocInfo0.isExterns();
        boolean boolean12 = jSDocInfo0.isExpose();
        java.lang.String str13 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.Node node14 = null;
        jSDocInfo0.setAssociatedNode(node14);
        boolean boolean16 = jSDocInfo0.isConstant();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.rhino.JSDocInfo.Marker marker0 = new com.google.javascript.rhino.JSDocInfo.Marker();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition1 = marker0.getType();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition2 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition3 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition4 = marker0.getDescription();
        com.google.javascript.rhino.JSDocInfo.TypePosition typePosition5 = marker0.getType();
        com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodeSourcePosition6 = marker0.getNameNode();
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition7 = marker0.getName();
        org.junit.Assert.assertNull(typePosition1);
        org.junit.Assert.assertNull(typePosition2);
        org.junit.Assert.assertNull(nodeSourcePosition3);
        org.junit.Assert.assertNull(stringPosition4);
        org.junit.Assert.assertNull(typePosition5);
        org.junit.Assert.assertNull(nodeSourcePosition6);
        org.junit.Assert.assertNull(stringPosition7);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.isNoSideEffects();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection5 = jSDocInfo0.getMarkers();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        java.util.Set<java.lang.String> strSet7 = jSDocInfo0.getModifies();
        boolean boolean8 = jSDocInfo0.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(markerCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        com.google.javascript.rhino.Node node13 = null;
        jSDocInfo0.setAssociatedNode(node13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        boolean boolean5 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("");
        boolean boolean5 = jSDocInfo0.isNoTypeCheck();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        boolean boolean7 = jSDocInfo0.hasThisType();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection8 = jSDocInfo0.getMarkers();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(markerCollection8);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList5 = jSDocInfo0.getThrownTypes();
        java.lang.String str6 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(jSTypeExpressionList5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        java.lang.String str6 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.Node node7 = jSDocInfo0.getAssociatedNode();
        java.util.Set<java.lang.String> strSet8 = jSDocInfo0.getParameterNames();
        boolean boolean9 = jSDocInfo0.isHidden();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.isInterface();
        java.lang.String str3 = jSDocInfo0.getReturnDescription();
        boolean boolean4 = jSDocInfo0.hasTypedefType();
        java.lang.String str5 = jSDocInfo0.getDeprecationReason();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        stringPosition0.setPositionInformation(0, (int) (byte) 100, (int) 'a', 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.rhino.JSDocInfo.NamePosition namePosition0 = new com.google.javascript.rhino.JSDocInfo.NamePosition();
        com.google.javascript.rhino.Node node1 = namePosition0.getItem();
        int int2 = namePosition0.getEndLine();
        int int3 = namePosition0.getPositionOnStartLine();
        namePosition0.setPositionInformation((int) (short) 0, 100, 32, (int) (byte) 0);
        com.google.javascript.rhino.Node node9 = null;
        namePosition0.setItem(node9);
        int int11 = namePosition0.getPositionOnEndLine();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getType();
        java.lang.String str5 = jSDocInfo0.toString();
        boolean boolean6 = jSDocInfo0.hasBaseType();
        boolean boolean7 = jSDocInfo0.isConsistentIdGenerator();
        int int8 = jSDocInfo0.getParameterCount();
        java.lang.String str9 = jSDocInfo0.getBlockDescription();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean12 = jSDocInfo11.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo11.setVisibility(visibility13);
        boolean boolean15 = jSDocInfo11.hasType();
        boolean boolean16 = jSDocInfo11.isJavaDispatch();
        boolean boolean17 = jSDocInfo11.isOverride();
        jSDocInfo11.addSuppression("JSDocInfo");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = jSDocInfo11.getVisibility();
        jSDocInfo0.setVisibility(visibility20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSDocInfo" + "'", str5, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + visibility13 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility13.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + visibility20 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility20.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        boolean boolean6 = jSDocInfo0.isExterns();
        boolean boolean7 = jSDocInfo0.hasType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = jSDocInfo0.getParameterType("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSTypeExpression9);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        int int2 = jSDocInfo0.getImplementedInterfaceCount();
        boolean boolean3 = jSDocInfo0.isConstant();
        boolean boolean4 = jSDocInfo0.isDeprecated();
        java.lang.String str5 = jSDocInfo0.getVersion();
        boolean boolean6 = jSDocInfo0.isNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getThisType();
        int int8 = jSDocInfo0.getImplementedInterfaceCount();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = jSDocInfo0.getThisType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList8 = jSDocInfo0.getImplementedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeExpression5);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNotNull(jSTypeExpressionList8);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        boolean boolean10 = jSDocInfo0.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean13 = jSDocInfo0.hasParameter("hi!");
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
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.lang.String str2 = jSDocInfo0.getLicense();
        jSDocInfo0.setLicense("");
        boolean boolean5 = jSDocInfo0.isInterface();
        boolean boolean6 = jSDocInfo0.isHidden();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        boolean boolean8 = jSDocInfo0.hasTypedefType();
        boolean boolean9 = jSDocInfo0.hasTypedefType();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getBaseType();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        java.lang.String str7 = jSDocInfo0.getDescriptionForParameter("");
        boolean boolean8 = jSDocInfo0.hasModifies();
        boolean boolean10 = jSDocInfo0.hasParameterType("JSDocInfo");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList11);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        java.lang.String str2 = jSDocInfo0.getMeaning();
        jSDocInfo0.addSuppression("");
        java.lang.String str5 = jSDocInfo0.getReturnDescription();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        jSDocInfo0.setLicense("");
        boolean boolean10 = jSDocInfo0.isExport();
        boolean boolean11 = jSDocInfo0.isHidden();
        boolean boolean12 = jSDocInfo0.hasReturnType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isNoAlias();
        boolean boolean6 = jSDocInfo0.isDeprecated();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getImplementedInterfaces();
        boolean boolean8 = jSDocInfo0.shouldPreserveTry();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection9 = jSDocInfo0.getMarkers();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getType();
        java.lang.String str11 = jSDocInfo0.getOriginalCommentString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(markerCollection9);
        org.junit.Assert.assertNull(jSTypeExpression10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = jSDocInfo0.getReturnType();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasReturnType();
        java.lang.String str7 = jSDocInfo0.getDescription();
        boolean boolean8 = jSDocInfo0.hasEnumParameterType();
        boolean boolean9 = jSDocInfo0.isNoTypeCheck();
        int int10 = jSDocInfo0.getImplementedInterfaceCount();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str12 = jSDocInfo11.toString();
        java.lang.String str13 = jSDocInfo11.getDescription();
        java.lang.String str14 = jSDocInfo11.getReturnDescription();
        boolean boolean15 = jSDocInfo11.containsDeclaration();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean17 = jSDocInfo16.hasReturnType();
        java.lang.String str18 = jSDocInfo16.getDescription();
        java.util.Set<java.lang.String> strSet19 = jSDocInfo16.getParameterNames();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo16.setVisibility(visibility20);
        jSDocInfo11.setVisibility(visibility20);
        jSDocInfo0.setVisibility(visibility20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSDocInfo" + "'", str12, "JSDocInfo");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + visibility20 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility20.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean5 = jSDocInfo0.isConstructor();
        boolean boolean7 = jSDocInfo0.hasParameterType("hi!");
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        boolean boolean9 = jSDocInfo0.isDefine();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = jSDocInfo0.getThisType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeExpression10);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        boolean boolean6 = jSDocInfo0.isOverride();
        boolean boolean8 = jSDocInfo0.hasParameter("hi!");
        boolean boolean9 = jSDocInfo0.isDefine();
        jSDocInfo0.addSuppression("");
        boolean boolean12 = jSDocInfo0.isNoTypeCheck();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility2 = com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED;
        jSDocInfo0.setVisibility(visibility2);
        boolean boolean4 = jSDocInfo0.hasType();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        java.util.Collection<java.lang.String> strCollection6 = jSDocInfo0.getReferences();
        jSDocInfo0.setLicense("hi!");
        boolean boolean9 = jSDocInfo0.hasBaseType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        java.lang.String str3 = jSDocInfo0.getLendsName();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        boolean boolean6 = jSDocInfo0.hasParameterType("hi!");
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getThrownTypes();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = jSDocInfo0.getTypeNodes();
        java.util.Set<java.lang.String> strSet9 = jSDocInfo0.getSuppressions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isExpose();
        com.google.javascript.rhino.Node node6 = jSDocInfo0.getAssociatedNode();
        boolean boolean7 = jSDocInfo0.isNoShadow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        int int6 = jSDocInfo0.getExtendedInterfacesCount();
        boolean boolean8 = jSDocInfo0.hasParameter("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> markerCollection1 = jSDocInfo0.getMarkers();
        java.lang.String str2 = jSDocInfo0.getLicense();
        jSDocInfo0.setLicense("");
        boolean boolean5 = jSDocInfo0.isInterface();
        boolean boolean6 = jSDocInfo0.isHidden();
        boolean boolean7 = jSDocInfo0.shouldPreserveTry();
        java.lang.String str8 = jSDocInfo0.getLendsName();
        org.junit.Assert.assertNotNull(markerCollection1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        boolean boolean12 = jSDocInfo0.hasParameter("JSDocInfo");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility13 = null;
        jSDocInfo0.setVisibility(visibility13);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.isImplicitCast();
        boolean boolean2 = jSDocInfo0.hasType();
        boolean boolean3 = jSDocInfo0.hasReturnType();
        boolean boolean4 = jSDocInfo0.isConsistentIdGenerator();
        boolean boolean5 = jSDocInfo0.isJavaDispatch();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        boolean boolean8 = jSDocInfo0.hasParameter("hi!");
        boolean boolean9 = jSDocInfo0.isNoTypeCheck();
        boolean boolean10 = jSDocInfo0.isConsistentIdGenerator();
        jSDocInfo0.setLicense("JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.rhino.JSDocInfo.StringPosition stringPosition0 = new com.google.javascript.rhino.JSDocInfo.StringPosition();
        stringPosition0.setPositionInformation((int) (short) -1, (int) '4', (int) (short) 100, (int) (short) 10);
        int int6 = stringPosition0.getStartLine();
        int int7 = stringPosition0.getPositionOnStartLine();
        int int8 = stringPosition0.getEndLine();
        int int9 = stringPosition0.getPositionOnStartLine();
        int int10 = stringPosition0.getStartLine();
        int int11 = stringPosition0.getPositionOnEndLine();
        int int12 = stringPosition0.getStartLine();
        stringPosition0.setPositionInformation((int) (byte) 0, (int) (short) 10, 35, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility1 = jSDocInfo0.getVisibility();
        java.lang.String str2 = jSDocInfo0.getBlockDescription();
        boolean boolean3 = jSDocInfo0.isImplicitCast();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = jSDocInfo0.getTypeNodes();
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = jSDocInfo0.getTypeNodes();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList6 = jSDocInfo0.getExtendedInterfaces();
        boolean boolean7 = jSDocInfo0.containsDeclaration();
        org.junit.Assert.assertNull(visibility1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(jSTypeExpressionList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasReturnType();
        boolean boolean2 = jSDocInfo0.isExport();
        java.lang.String str3 = jSDocInfo0.toString();
        boolean boolean4 = jSDocInfo0.isExpose();
        int int5 = jSDocInfo0.getExtendedInterfacesCount();
        java.lang.String str6 = jSDocInfo0.getLicense();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getReturnType();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str9 = jSDocInfo8.toString();
        java.lang.String str10 = jSDocInfo8.getDescription();
        java.lang.String str11 = jSDocInfo8.getLendsName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean13 = jSDocInfo12.hasBaseType();
        boolean boolean14 = jSDocInfo12.isImplicitCast();
        int int15 = jSDocInfo12.getImplementedInterfaceCount();
        boolean boolean16 = jSDocInfo12.isDeprecated();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean18 = jSDocInfo17.hasBaseType();
        boolean boolean19 = jSDocInfo17.isNoCompile();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility20 = com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE;
        jSDocInfo17.setVisibility(visibility20);
        jSDocInfo12.setVisibility(visibility20);
        jSDocInfo8.setVisibility(visibility20);
        jSDocInfo0.setVisibility(visibility20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSDocInfo" + "'", str3, "JSDocInfo");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSDocInfo" + "'", str9, "JSDocInfo");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + visibility20 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE + "'", visibility20.equals(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        java.lang.String str1 = jSDocInfo0.toString();
        java.lang.String str2 = jSDocInfo0.getDescription();
        boolean boolean3 = jSDocInfo0.isJavaDispatch();
        java.lang.String str4 = jSDocInfo0.getLendsName();
        boolean boolean5 = jSDocInfo0.isImplicitCast();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JSDocInfo" + "'", str1, "JSDocInfo");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        boolean boolean3 = jSDocInfo0.shouldPreserveTry();
        boolean boolean4 = jSDocInfo0.isExpose();
        boolean boolean5 = jSDocInfo0.hasTypedefType();
        java.lang.String str6 = jSDocInfo0.getMeaning();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = jSDocInfo0.getTypedefType();
        com.google.javascript.rhino.Node node8 = jSDocInfo0.getAssociatedNode();
        java.lang.String str10 = jSDocInfo0.getDescriptionForParameter("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(jSTypeExpression7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        boolean boolean12 = jSDocInfo0.isDefine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + visibility2 + "' != '" + com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED + "'", visibility2.equals(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED));
        org.junit.Assert.assertNull(jSTypeExpression4);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(jSTypeExpression11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList11 = jSDocInfo0.getExtendedInterfaces();
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.rhino.JSDocInfo jSDocInfo0 = new com.google.javascript.rhino.JSDocInfo();
        boolean boolean1 = jSDocInfo0.hasBaseType();
        boolean boolean2 = jSDocInfo0.isNoSideEffects();
        java.lang.String str3 = jSDocInfo0.getDescription();
        boolean boolean5 = jSDocInfo0.hasParameter("");
        boolean boolean6 = jSDocInfo0.isConstructor();
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList7 = jSDocInfo0.getExtendedInterfaces();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSTypeExpressionList7);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        java.util.List<com.google.javascript.rhino.JSTypeExpression> jSTypeExpressionList13 = jSDocInfo0.getExtendedInterfaces();
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
}

