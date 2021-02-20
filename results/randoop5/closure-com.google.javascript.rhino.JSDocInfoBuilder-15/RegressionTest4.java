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
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean10 = jSDocInfoBuilder1.recordParameterDescription("", "hi!");
        boolean boolean12 = jSDocInfoBuilder1.addReference("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        boolean boolean23 = jSDocInfoBuilder17.recordModifies((java.util.Set<java.lang.String>) strSet21);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = null;
        boolean boolean25 = jSDocInfoBuilder17.recordType(jSTypeExpression24);
        boolean boolean26 = jSDocInfoBuilder17.recordPreserveTry();
        boolean boolean27 = jSDocInfoBuilder17.isDescriptionRecorded();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility28 = null;
        boolean boolean29 = jSDocInfoBuilder17.recordVisibility(visibility28);
        boolean boolean30 = jSDocInfoBuilder17.recordConsistentIdGenerator();
        boolean boolean31 = jSDocInfoBuilder17.isJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder17.recordType(jSTypeExpression32);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = null;
        boolean boolean35 = jSDocInfoBuilder17.recordImplementedInterface(jSTypeExpression34);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder37 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean38 = jSDocInfoBuilder37.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = null;
        boolean boolean40 = jSDocInfoBuilder37.recordTypedef(jSTypeExpression39);
        boolean boolean41 = jSDocInfoBuilder37.isPopulatedWithFileOverview();
        boolean boolean42 = jSDocInfoBuilder37.recordPreserveTry();
        boolean boolean44 = jSDocInfoBuilder37.addReference("hi!");
        jSDocInfoBuilder37.recordOriginalCommentString("");
        boolean boolean47 = jSDocInfoBuilder37.recordJavaDispatch();
        boolean boolean48 = jSDocInfoBuilder37.recordJavaDispatch();
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        boolean boolean53 = jSDocInfoBuilder37.recordTemplateTypeNames((java.util.List<java.lang.String>) strList51);
        boolean boolean54 = jSDocInfoBuilder17.recordTemplateTypeNames((java.util.List<java.lang.String>) strList51);
        boolean boolean55 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList51);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression56 = null;
        boolean boolean57 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecationReason("");
        boolean boolean13 = jSDocInfoBuilder1.recordParameterDescription("hi!", "hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder15 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder15.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression22 = null;
        boolean boolean23 = jSDocInfoBuilder15.recordType(jSTypeExpression22);
        boolean boolean25 = jSDocInfoBuilder15.recordReturnDescription("hi!");
        boolean boolean26 = jSDocInfoBuilder15.isPopulated();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility27 = null;
        boolean boolean28 = jSDocInfoBuilder15.recordVisibility(visibility27);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder30 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        boolean boolean36 = jSDocInfoBuilder30.recordModifies((java.util.Set<java.lang.String>) strSet34);
        boolean boolean37 = jSDocInfoBuilder30.recordNoTypeCheck();
        boolean boolean38 = jSDocInfoBuilder30.recordImplicitCast();
        boolean boolean40 = jSDocInfoBuilder30.addAuthor("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder42 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder42.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder42.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean53 = jSDocInfoBuilder42.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder55 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray58 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        boolean boolean61 = jSDocInfoBuilder55.recordModifies((java.util.Set<java.lang.String>) strSet59);
        boolean boolean62 = jSDocInfoBuilder42.recordSuppressions((java.util.Set<java.lang.String>) strSet59);
        boolean boolean63 = jSDocInfoBuilder30.recordSuppressions((java.util.Set<java.lang.String>) strSet59);
        boolean boolean64 = jSDocInfoBuilder15.recordSuppressions((java.util.Set<java.lang.String>) strSet59);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder66 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        boolean boolean72 = jSDocInfoBuilder66.recordModifies((java.util.Set<java.lang.String>) strSet70);
        boolean boolean73 = jSDocInfoBuilder15.recordSuppressions((java.util.Set<java.lang.String>) strSet70);
        boolean boolean74 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet70);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean3 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean4 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean12 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean13 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean14 = jSDocInfoBuilder1.recordExterns();
        boolean boolean15 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean7 = jSDocInfoBuilder1.recordFileOverview("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean14 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordVisibility(visibility15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.markText("hi!", (int) (short) 1, 1, (int) (short) 1, (int) '#');
        boolean boolean16 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean17 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean19 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean20 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean21 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility22 = null;
        boolean boolean23 = jSDocInfoBuilder1.recordVisibility(visibility22);
        boolean boolean24 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean11 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean12 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile16, (int) (byte) 10, 10);
        boolean boolean20 = jSDocInfoBuilder1.recordConstructor();
        java.util.Set<java.lang.String> strSet21 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordSuppressions(strSet21);
        boolean boolean23 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean24 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean11 = jSDocInfoBuilder1.isDescriptionRecorded();
        boolean boolean12 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean14 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        boolean boolean15 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder17 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder17.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder17.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean28 = jSDocInfoBuilder17.shouldParseDocumentation();
        boolean boolean29 = jSDocInfoBuilder17.isPopulated();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        boolean boolean35 = jSDocInfoBuilder17.recordTemplateTypeNames((java.util.List<java.lang.String>) strList33);
        boolean boolean36 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList33);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean15 = jSDocInfoBuilder1.recordConstancy();
        boolean boolean16 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean18 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean19 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean20 = jSDocInfoBuilder1.recordExterns();
        boolean boolean21 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean11 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean16 = jSDocInfoBuilder1.recordLends("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.recordExport();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean13 = jSDocInfoBuilder1.isPopulated();
        boolean boolean14 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        boolean boolean13 = jSDocInfoBuilder1.recordParameterDescription("", "");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder15 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean16 = jSDocInfoBuilder15.recordNoAlias();
        boolean boolean17 = jSDocInfoBuilder15.recordJavaDispatch();
        boolean boolean19 = jSDocInfoBuilder15.recordMeaning("");
        jSDocInfoBuilder15.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder27 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        boolean boolean33 = jSDocInfoBuilder27.recordModifies((java.util.Set<java.lang.String>) strSet31);
        boolean boolean34 = jSDocInfoBuilder15.recordModifies((java.util.Set<java.lang.String>) strSet31);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression35 = null;
        boolean boolean36 = jSDocInfoBuilder15.recordExtendedInterface(jSTypeExpression35);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder38 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder38.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder38.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean49 = jSDocInfoBuilder38.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder51 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        boolean boolean57 = jSDocInfoBuilder51.recordModifies((java.util.Set<java.lang.String>) strSet55);
        boolean boolean58 = jSDocInfoBuilder38.recordSuppressions((java.util.Set<java.lang.String>) strSet55);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        boolean boolean64 = jSDocInfoBuilder38.recordTemplateTypeNames((java.util.List<java.lang.String>) strList62);
        boolean boolean65 = jSDocInfoBuilder15.recordTemplateTypeNames((java.util.List<java.lang.String>) strList62);
        boolean boolean66 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList62);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression67 = null;
        boolean boolean68 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression67);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean3 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.Node node4 = null;
        jSDocInfoBuilder1.markTypeNode(node4, (int) (short) -1, (int) (byte) 0, (int) (byte) 0, (int) (short) -1, true);
        boolean boolean11 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile13, (int) (short) 0, (int) (short) 0);
        boolean boolean18 = jSDocInfoBuilder1.recordFileOverview("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        jSDocInfoBuilder1.markText("hi!", (int) ' ', 10, (int) (short) 10, 0);
        boolean boolean13 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        com.google.javascript.rhino.Node node14 = null;
        jSDocInfoBuilder1.markTypeNode(node14, 0, (int) '#', (int) '#', (int) (byte) 100, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        boolean boolean17 = jSDocInfoBuilder11.recordModifies((java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet15);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression19);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression21);
        boolean boolean24 = jSDocInfoBuilder1.addReference("");
        boolean boolean25 = jSDocInfoBuilder1.recordOverride();
        boolean boolean26 = jSDocInfoBuilder1.recordJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        boolean boolean17 = jSDocInfoBuilder11.recordModifies((java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet15);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression19);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean23 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression21, "hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = null;
        boolean boolean25 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression24);
        boolean boolean26 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean27 = jSDocInfoBuilder1.recordExpose();
        boolean boolean28 = jSDocInfoBuilder1.recordInterface();
        jSDocInfoBuilder1.recordOriginalCommentString("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean11 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordDeprecated();
        jSDocInfoBuilder1.markText("hi!", (int) '#', (int) (byte) 10, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean11 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean12 = jSDocInfoBuilder1.recordExpose();
        boolean boolean14 = jSDocInfoBuilder1.recordReturnDescription("");
        jSDocInfoBuilder1.markName("", (int) '#', (int) (byte) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordParameter("hi!", jSTypeExpression20);
        boolean boolean22 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean9 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean10 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression11);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordType(jSTypeExpression13);
        boolean boolean16 = jSDocInfoBuilder1.addReference("hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean9 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean10 = jSDocInfoBuilder1.recordExport();
        boolean boolean12 = jSDocInfoBuilder1.recordReturnDescription("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordThisType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.isInterfaceRecorded();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression10);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression12);
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean16 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean17 = jSDocInfoBuilder1.shouldParseDocumentation();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordExport();
        boolean boolean11 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean15 = jSDocInfoBuilder13.recordMeaning("");
        boolean boolean16 = jSDocInfoBuilder13.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder18 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean19 = jSDocInfoBuilder18.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder21 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        boolean boolean27 = jSDocInfoBuilder21.recordModifies((java.util.Set<java.lang.String>) strSet25);
        boolean boolean28 = jSDocInfoBuilder18.recordSuppressions((java.util.Set<java.lang.String>) strSet25);
        boolean boolean29 = jSDocInfoBuilder13.recordModifies((java.util.Set<java.lang.String>) strSet25);
        boolean boolean30 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet25);
        boolean boolean31 = jSDocInfoBuilder1.recordConstancy();
        boolean boolean33 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean34 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean35 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean36 = jSDocInfoBuilder1.isJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordVisibility(visibility18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordType(jSTypeExpression20);
        boolean boolean22 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder24 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean25 = jSDocInfoBuilder24.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = null;
        boolean boolean27 = jSDocInfoBuilder24.recordTypedef(jSTypeExpression26);
        boolean boolean28 = jSDocInfoBuilder24.isPopulatedWithFileOverview();
        boolean boolean29 = jSDocInfoBuilder24.recordPreserveTry();
        boolean boolean31 = jSDocInfoBuilder24.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression32 = null;
        boolean boolean33 = jSDocInfoBuilder24.recordReturnType(jSTypeExpression32);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression34 = null;
        boolean boolean35 = jSDocInfoBuilder24.recordBaseType(jSTypeExpression34);
        boolean boolean37 = jSDocInfoBuilder24.recordVersion("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder39 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder39.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder39.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean50 = jSDocInfoBuilder39.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression51 = null;
        boolean boolean52 = jSDocInfoBuilder39.recordEnumParameterType(jSTypeExpression51);
        boolean boolean53 = jSDocInfoBuilder39.recordInterface();
        boolean boolean54 = jSDocInfoBuilder39.recordJavaDispatch();
        boolean boolean55 = jSDocInfoBuilder39.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression56 = null;
        boolean boolean57 = jSDocInfoBuilder39.recordThrowType(jSTypeExpression56);
        boolean boolean58 = jSDocInfoBuilder39.recordConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder60 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean61 = jSDocInfoBuilder60.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression62 = null;
        boolean boolean63 = jSDocInfoBuilder60.recordTypedef(jSTypeExpression62);
        boolean boolean64 = jSDocInfoBuilder60.isPopulatedWithFileOverview();
        boolean boolean65 = jSDocInfoBuilder60.recordPreserveTry();
        boolean boolean67 = jSDocInfoBuilder60.addReference("hi!");
        jSDocInfoBuilder60.recordOriginalCommentString("");
        boolean boolean70 = jSDocInfoBuilder60.recordJavaDispatch();
        boolean boolean71 = jSDocInfoBuilder60.recordJavaDispatch();
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = jSDocInfoBuilder60.recordTemplateTypeNames((java.util.List<java.lang.String>) strList74);
        boolean boolean77 = jSDocInfoBuilder39.recordTemplateTypeNames((java.util.List<java.lang.String>) strList74);
        boolean boolean78 = jSDocInfoBuilder24.recordTemplateTypeNames((java.util.List<java.lang.String>) strList74);
        boolean boolean79 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList74);
        boolean boolean81 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean83 = jSDocInfoBuilder1.recordVersion("");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression6);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile9, 0, 1);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile14, (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfoBuilder1.markTypeNode(node11, (int) (byte) 1, (int) (short) -1, 100, (int) 'a', true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression18);
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 10, (int) '4', 10, 0);
        boolean boolean27 = jSDocInfoBuilder1.addReference("");
        boolean boolean29 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean30 = jSDocInfoBuilder1.isDescriptionRecorded();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean11 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        jSDocInfoBuilder1.markText("", (int) (byte) -1, 0, 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean14 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression15);
        boolean boolean17 = jSDocInfoBuilder1.recordDeprecated();
        boolean boolean18 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean19 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean20 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.recordOriginalCommentString("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression12, "hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        boolean boolean17 = jSDocInfoBuilder11.recordModifies((java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet15);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile20, (int) '4', (int) (byte) 10);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder25 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = null;
        boolean boolean27 = jSDocInfoBuilder25.recordEnumParameterType(jSTypeExpression26);
        boolean boolean28 = jSDocInfoBuilder25.isInterfaceRecorded();
        boolean boolean29 = jSDocInfoBuilder25.isInterfaceRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean32 = jSDocInfoBuilder31.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder34 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        boolean boolean40 = jSDocInfoBuilder34.recordModifies((java.util.Set<java.lang.String>) strSet38);
        boolean boolean41 = jSDocInfoBuilder31.recordSuppressions((java.util.Set<java.lang.String>) strSet38);
        boolean boolean42 = jSDocInfoBuilder25.recordSuppressions((java.util.Set<java.lang.String>) strSet38);
        boolean boolean43 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet38);
        boolean boolean44 = jSDocInfoBuilder1.recordExpose();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean12 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression13);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder16 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean17 = jSDocInfoBuilder16.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder16.recordTypedef(jSTypeExpression18);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = null;
        jSDocInfoBuilder16.markName("", staticSourceFile21, (int) '4', (int) 'a');
        boolean boolean25 = jSDocInfoBuilder16.recordExport();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = null;
        boolean boolean27 = jSDocInfoBuilder16.recordEnumParameterType(jSTypeExpression26);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder16.recordThrowType(jSTypeExpression28);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder31.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder39 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        boolean boolean45 = jSDocInfoBuilder39.recordModifies((java.util.Set<java.lang.String>) strSet43);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression46 = null;
        boolean boolean47 = jSDocInfoBuilder39.recordType(jSTypeExpression46);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        boolean boolean52 = jSDocInfoBuilder39.recordModifies((java.util.Set<java.lang.String>) strSet50);
        boolean boolean53 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet50);
        boolean boolean54 = jSDocInfoBuilder16.recordModifies((java.util.Set<java.lang.String>) strSet50);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        boolean boolean59 = jSDocInfoBuilder16.recordTemplateTypeNames((java.util.List<java.lang.String>) strList57);
        boolean boolean60 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList57);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean6 = jSDocInfoBuilder1.recordDeprecationReason("");
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile10, (int) (byte) 100, (int) '4');
        boolean boolean14 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean11 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSDocInfo.Visibility visibility12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordVisibility(visibility12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordParameter("hi!", jSTypeExpression15);
        boolean boolean18 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean19 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean20 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression6);
        boolean boolean8 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean11 = jSDocInfoBuilder1.isPopulated();
        boolean boolean12 = jSDocInfoBuilder1.recordExport();
        boolean boolean13 = jSDocInfoBuilder1.recordExterns();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        boolean boolean10 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean11 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean12 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean13 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression4 = null;
        boolean boolean5 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression4);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfoBuilder1.markTypeNode(node11, (int) (byte) 1, (int) (short) -1, 100, (int) 'a', true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression18);
        boolean boolean21 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder23 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder23.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression30 = null;
        boolean boolean31 = jSDocInfoBuilder23.recordType(jSTypeExpression30);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder33 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        boolean boolean39 = jSDocInfoBuilder33.recordModifies((java.util.Set<java.lang.String>) strSet37);
        boolean boolean40 = jSDocInfoBuilder23.recordSuppressions((java.util.Set<java.lang.String>) strSet37);
        boolean boolean41 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet37);
        boolean boolean43 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean44 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean45 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.Node node11 = null;
        jSDocInfoBuilder1.markTypeNode(node11, (int) (byte) 1, (int) (short) -1, 100, (int) 'a', true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression18);
        boolean boolean20 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean22 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean23 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = null;
        boolean boolean25 = jSDocInfoBuilder1.recordThisType(jSTypeExpression24);
        boolean boolean26 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile28 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile28, 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }
}

