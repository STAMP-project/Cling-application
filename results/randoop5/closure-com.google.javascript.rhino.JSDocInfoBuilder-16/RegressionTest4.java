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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean16 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean17 = jSDocInfoBuilder1.recordExpose();
        boolean boolean19 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean20 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean7 = jSDocInfoBuilder1.addReference("");
        boolean boolean9 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression7);
        boolean boolean9 = jSDocInfoBuilder1.isConstructorRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordParameter("hi!", jSTypeExpression11);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile14, (-1), (int) 'a');
        boolean boolean18 = jSDocInfoBuilder1.recordIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean9 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean10 = jSDocInfoBuilder1.recordExport();
        boolean boolean11 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean12 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean13 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.Node node14 = null;
        jSDocInfoBuilder1.markTypeNode(node14, (int) ' ', (int) (byte) -1, (int) (byte) 0, (int) ' ', true);
        boolean boolean23 = jSDocInfoBuilder1.recordParameterDescription("hi!", "hi!");
        jSDocInfoBuilder1.markText("hi!", 100, 100, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean16 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean17 = jSDocInfoBuilder1.recordHiddenness();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordThisType(jSTypeExpression18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression20);
        boolean boolean22 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = jSDocInfoBuilder1.build(node23);
        boolean boolean25 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jSDocInfo24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression20);
        jSDocInfoBuilder1.markName("hi!", (int) '4', (int) 'a');
        boolean boolean26 = jSDocInfoBuilder1.isDescriptionRecorded();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        boolean boolean21 = jSDocInfoBuilder1.isConstructorRecorded();
        boolean boolean23 = jSDocInfoBuilder1.recordReturnDescription("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression10);
        boolean boolean12 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression13, "");
        boolean boolean17 = jSDocInfoBuilder1.recordBlockDescription("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean4 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean6 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean7 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression9);
        boolean boolean12 = jSDocInfoBuilder1.addAuthor("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.recordDeprecated();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression6);
        boolean boolean10 = jSDocInfoBuilder1.recordParameterDescription("", "hi!");
        boolean boolean12 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean13 = jSDocInfoBuilder1.recordExport();
        boolean boolean14 = jSDocInfoBuilder1.isDescriptionRecorded();
        boolean boolean15 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean17 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean19 = jSDocInfoBuilder1.recordDescription("hi!");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordDeprecationReason("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
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
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordIdGenerator();
        jSDocInfoBuilder1.markName("hi!", (int) '#', (int) (short) 1);
        boolean boolean17 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder19 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        boolean boolean25 = jSDocInfoBuilder19.recordModifies((java.util.Set<java.lang.String>) strSet23);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = null;
        boolean boolean27 = jSDocInfoBuilder19.recordType(jSTypeExpression26);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        boolean boolean32 = jSDocInfoBuilder19.recordModifies((java.util.Set<java.lang.String>) strSet30);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder34 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        boolean boolean40 = jSDocInfoBuilder34.recordModifies((java.util.Set<java.lang.String>) strSet38);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression41 = null;
        boolean boolean42 = jSDocInfoBuilder34.recordTypedef(jSTypeExpression41);
        boolean boolean43 = jSDocInfoBuilder34.isInterfaceRecorded();
        boolean boolean44 = jSDocInfoBuilder34.recordJavaDispatch();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder46 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        boolean boolean52 = jSDocInfoBuilder46.recordModifies((java.util.Set<java.lang.String>) strSet50);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression53 = null;
        boolean boolean54 = jSDocInfoBuilder46.recordTypedef(jSTypeExpression53);
        boolean boolean55 = jSDocInfoBuilder46.isInterfaceRecorded();
        boolean boolean56 = jSDocInfoBuilder46.recordPreserveTry();
        boolean boolean57 = jSDocInfoBuilder46.recordNoSideEffects();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder59 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean60 = jSDocInfoBuilder59.recordNoAlias();
        boolean boolean61 = jSDocInfoBuilder59.recordJavaDispatch();
        boolean boolean63 = jSDocInfoBuilder59.recordMeaning("");
        jSDocInfoBuilder59.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder71 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet75 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
        boolean boolean77 = jSDocInfoBuilder71.recordModifies((java.util.Set<java.lang.String>) strSet75);
        boolean boolean78 = jSDocInfoBuilder59.recordModifies((java.util.Set<java.lang.String>) strSet75);
        boolean boolean79 = jSDocInfoBuilder46.recordSuppressions((java.util.Set<java.lang.String>) strSet75);
        boolean boolean80 = jSDocInfoBuilder34.recordSuppressions((java.util.Set<java.lang.String>) strSet75);
        boolean boolean81 = jSDocInfoBuilder19.recordModifies((java.util.Set<java.lang.String>) strSet75);
        boolean boolean82 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet75);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression83 = null;
        boolean boolean84 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression83);
        jSDocInfoBuilder1.markText("", (int) (byte) -1, (int) '#', (int) ' ', (int) ' ');
        boolean boolean91 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordThisType(jSTypeExpression9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        boolean boolean16 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean17 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression18);
        boolean boolean20 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean21 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder9 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder9.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder9.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean20 = jSDocInfoBuilder9.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder22 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        boolean boolean28 = jSDocInfoBuilder22.recordModifies((java.util.Set<java.lang.String>) strSet26);
        boolean boolean29 = jSDocInfoBuilder9.recordSuppressions((java.util.Set<java.lang.String>) strSet26);
        boolean boolean30 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression31 = null;
        boolean boolean32 = jSDocInfoBuilder1.recordThisType(jSTypeExpression31);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder34 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean35 = jSDocInfoBuilder34.recordNoAlias();
        boolean boolean36 = jSDocInfoBuilder34.recordJavaDispatch();
        boolean boolean38 = jSDocInfoBuilder34.recordMeaning("");
        jSDocInfoBuilder34.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder46 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        boolean boolean52 = jSDocInfoBuilder46.recordModifies((java.util.Set<java.lang.String>) strSet50);
        boolean boolean53 = jSDocInfoBuilder34.recordModifies((java.util.Set<java.lang.String>) strSet50);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression54 = null;
        boolean boolean55 = jSDocInfoBuilder34.recordExtendedInterface(jSTypeExpression54);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder57 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder57.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder57.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean68 = jSDocInfoBuilder57.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder70 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        boolean boolean76 = jSDocInfoBuilder70.recordModifies((java.util.Set<java.lang.String>) strSet74);
        boolean boolean77 = jSDocInfoBuilder57.recordSuppressions((java.util.Set<java.lang.String>) strSet74);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        boolean boolean83 = jSDocInfoBuilder57.recordTemplateTypeNames((java.util.List<java.lang.String>) strList81);
        boolean boolean84 = jSDocInfoBuilder34.recordTemplateTypeNames((java.util.List<java.lang.String>) strList81);
        boolean boolean85 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList81);
        boolean boolean86 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean88 = jSDocInfoBuilder1.recordReturnDescription("");
        boolean boolean90 = jSDocInfoBuilder1.recordBlockDescription("");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordThrowDescription(jSTypeExpression10, "");
        boolean boolean13 = jSDocInfoBuilder1.recordConstancy();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean16 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean17 = jSDocInfoBuilder1.recordExpose();
        boolean boolean18 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression19 = null;
        boolean boolean20 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression19);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordExport();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression11);
        boolean boolean13 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean14 = jSDocInfoBuilder1.recordPreserveTry();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecated();
        jSDocInfoBuilder1.markName("hi!", (int) (byte) 100, (-1));
        boolean boolean15 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean16 = jSDocInfoBuilder1.recordConstancy();
        jSDocInfoBuilder1.recordOriginalCommentString("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression5);
        boolean boolean7 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean8 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean9 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean11 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean13 = jSDocInfoBuilder1.recordBlockDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean14 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile16 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile16, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        boolean boolean8 = jSDocInfoBuilder1.recordNoShadow();
        jSDocInfoBuilder1.markAnnotation("hi!", (int) (short) 0, 0);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = jSDocInfoBuilder1.build(node13);
        boolean boolean16 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean18 = jSDocInfoBuilder1.recordDeprecationReason("hi!");
        boolean boolean20 = jSDocInfoBuilder1.recordFileOverview("hi!");
        boolean boolean21 = jSDocInfoBuilder1.recordNoAlias();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jSDocInfo14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean10 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        jSDocInfoBuilder1.markText("", (int) (byte) 1, 1, (int) (byte) 100, 100);
        boolean boolean17 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean18 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean19 = jSDocInfoBuilder1.recordExpose();
        boolean boolean22 = jSDocInfoBuilder1.recordParameterDescription("", "hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = null;
        boolean boolean24 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression23);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordVisibility(visibility9);
        boolean boolean13 = jSDocInfoBuilder1.recordParameterDescription("", "");
        boolean boolean14 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression15);
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        boolean boolean18 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean6 = jSDocInfoBuilder1.recordDeprecationReason("");
        boolean boolean8 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean9 = jSDocInfoBuilder1.recordOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordThisType(jSTypeExpression10);
        boolean boolean12 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean11 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder13 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = jSDocInfoBuilder13.recordModifies((java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = jSDocInfoBuilder13.recordNoTypeCheck();
        boolean boolean21 = jSDocInfoBuilder13.recordNoCompile();
        boolean boolean22 = jSDocInfoBuilder13.isInterfaceRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder24 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        boolean boolean30 = jSDocInfoBuilder24.recordModifies((java.util.Set<java.lang.String>) strSet28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = jSDocInfoBuilder24.build(node31);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = jSDocInfoBuilder24.recordSuppressions((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = jSDocInfoBuilder13.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean39 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet35);
        boolean boolean40 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean41 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jSDocInfo32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean16 = jSDocInfoBuilder1.recordExport();
        boolean boolean17 = jSDocInfoBuilder1.recordInterface();
        boolean boolean18 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean20 = jSDocInfoBuilder1.addAuthor("");
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = jSDocInfoBuilder1.build(node21);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = null;
        boolean boolean24 = jSDocInfoBuilder1.recordThisType(jSTypeExpression23);
        boolean boolean25 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSDocInfo22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean13 = jSDocInfoBuilder1.recordOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression14);
        boolean boolean16 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean18 = jSDocInfoBuilder1.recordDeprecationReason("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        jSDocInfoBuilder1.markText("hi!", (int) (short) 1, 1, (int) (short) 1, (int) '#');
        boolean boolean16 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean17 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean19 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean20 = jSDocInfoBuilder1.recordNoSideEffects();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression21);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = null;
        boolean boolean25 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression24);
        boolean boolean27 = jSDocInfoBuilder1.addReference("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression28);
        boolean boolean31 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean32 = jSDocInfoBuilder1.recordConstancy();
        boolean boolean33 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        boolean boolean12 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean13 = jSDocInfoBuilder1.recordNoShadow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean5 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordConstructor();
        boolean boolean12 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean13 = jSDocInfoBuilder1.recordOverride();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression14);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        boolean boolean19 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression18);
        com.google.javascript.rhino.Node node20 = null;
        jSDocInfoBuilder1.markTypeNode(node20, (int) (short) 0, (int) (short) 0, (int) (short) 0, (int) (short) 0, true);
        boolean boolean27 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean29 = jSDocInfoBuilder1.recordMeaning("hi!");
        boolean boolean30 = jSDocInfoBuilder1.recordOverride();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        boolean boolean13 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression14);
        boolean boolean16 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordThisType(jSTypeExpression17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        boolean boolean13 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean14 = jSDocInfoBuilder1.recordExport();
        boolean boolean17 = jSDocInfoBuilder1.recordParameterDescription("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean6 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression7);
        boolean boolean9 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.Node node10 = null;
        jSDocInfoBuilder1.markTypeNode(node10, (int) (byte) 0, (-1), (int) (byte) 100, 10, false);
        boolean boolean17 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder19 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder19.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder19.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean30 = jSDocInfoBuilder19.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder32 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        boolean boolean38 = jSDocInfoBuilder32.recordModifies((java.util.Set<java.lang.String>) strSet36);
        boolean boolean39 = jSDocInfoBuilder19.recordSuppressions((java.util.Set<java.lang.String>) strSet36);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        boolean boolean45 = jSDocInfoBuilder19.recordTemplateTypeNames((java.util.List<java.lang.String>) strList43);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression46 = null;
        boolean boolean47 = jSDocInfoBuilder19.recordThrowType(jSTypeExpression46);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder49 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean50 = jSDocInfoBuilder49.recordConstructor();
        boolean boolean51 = jSDocInfoBuilder49.recordConstancy();
        com.google.javascript.rhino.Node node52 = null;
        jSDocInfoBuilder49.markTypeNode(node52, (int) (short) -1, (int) (byte) 0, (int) (byte) 0, (int) (short) -1, true);
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        boolean boolean63 = jSDocInfoBuilder49.recordTemplateTypeNames((java.util.List<java.lang.String>) strList61);
        boolean boolean64 = jSDocInfoBuilder19.recordTemplateTypeNames((java.util.List<java.lang.String>) strList61);
        boolean boolean65 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList61);
        boolean boolean66 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.hasParameter("");
        boolean boolean14 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean15 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = jSDocInfoBuilder1.build(node16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jSDocInfo17);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean18 = jSDocInfoBuilder1.isPopulated();
        boolean boolean19 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean21 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean22 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean23 = jSDocInfoBuilder1.recordImplicitCast();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean12 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.shouldParseDocumentation();
        boolean boolean13 = jSDocInfoBuilder1.isPopulated();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean19 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList17);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression20);
        com.google.javascript.rhino.JSDocInfo.Visibility visibility22 = null;
        boolean boolean23 = jSDocInfoBuilder1.recordVisibility(visibility22);
        boolean boolean25 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean26 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression27 = null;
        boolean boolean28 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordNoCompile();
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression11);
        boolean boolean14 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        boolean boolean15 = jSDocInfoBuilder1.recordConstancy();
        boolean boolean17 = jSDocInfoBuilder1.recordVersion("hi!");
        boolean boolean18 = jSDocInfoBuilder1.recordNoTypeCheck();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        boolean boolean9 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression10);
        boolean boolean12 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean13 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile15, 100, (int) 'a');
        boolean boolean20 = jSDocInfoBuilder1.addAuthor("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean11 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean12 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean14 = jSDocInfoBuilder1.recordVersion("");
        java.lang.Class<?> wildcardClass15 = jSDocInfoBuilder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean12 = jSDocInfoBuilder1.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression13 = null;
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        boolean boolean15 = jSDocInfoBuilder1.recordInterface();
        boolean boolean16 = jSDocInfoBuilder1.recordJavaDispatch();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression17);
        boolean boolean19 = jSDocInfoBuilder1.recordInterface();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression20);
        boolean boolean23 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean24 = jSDocInfoBuilder1.recordExport();
        boolean boolean26 = jSDocInfoBuilder1.recordLends("hi!");
        jSDocInfoBuilder1.markText("hi!", (int) (short) 0, (int) (byte) 1, (int) (short) 1, (int) (short) 10);
        boolean boolean34 = jSDocInfoBuilder1.recordMeaning("hi!");
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile36 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile36, (int) ' ', (int) 'a');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile41 = null;
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markName("", staticSourceFile41, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = jSDocInfoBuilder1.build(node19);
        boolean boolean22 = jSDocInfoBuilder1.recordVersion("");
        boolean boolean23 = jSDocInfoBuilder1.shouldParseDocumentation();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression24 = null;
        boolean boolean25 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression24);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean11 = jSDocInfoBuilder1.recordImplicitCast();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression12);
        boolean boolean14 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean16 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordConstructor();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile4 = null;
        jSDocInfoBuilder1.markName("hi!", staticSourceFile4, (int) (short) 1, 100);
        boolean boolean8 = jSDocInfoBuilder1.recordExport();
        boolean boolean9 = jSDocInfoBuilder1.recordConstancy();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        boolean boolean14 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression13);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression16 = null;
        boolean boolean17 = jSDocInfoBuilder1.recordParameter("", jSTypeExpression16);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression18);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordThrowType(jSTypeExpression20);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordType(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression10);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression12 = null;
        boolean boolean13 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression12);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression14);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        boolean boolean3 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean5 = jSDocInfoBuilder1.recordMeaning("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression6 = null;
        boolean boolean7 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression6);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordThisType(jSTypeExpression8);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder11 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder11.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder11.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean23 = jSDocInfoBuilder11.hasParameter("");
        boolean boolean24 = jSDocInfoBuilder11.recordHiddenness();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression25 = null;
        boolean boolean26 = jSDocInfoBuilder11.recordEnumParameterType(jSTypeExpression25);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder28.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder28.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean39 = jSDocInfoBuilder28.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder41 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        boolean boolean47 = jSDocInfoBuilder41.recordModifies((java.util.Set<java.lang.String>) strSet45);
        boolean boolean48 = jSDocInfoBuilder28.recordSuppressions((java.util.Set<java.lang.String>) strSet45);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = jSDocInfoBuilder28.recordTemplateTypeNames((java.util.List<java.lang.String>) strList52);
        boolean boolean55 = jSDocInfoBuilder11.recordTemplateTypeNames((java.util.List<java.lang.String>) strList52);
        boolean boolean56 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList52);
        boolean boolean58 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean59 = jSDocInfoBuilder1.recordConstructor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        jSDocInfoBuilder1.markText("hi!", 0, (int) (byte) 100, 0, (int) (byte) 100);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordThisType(jSTypeExpression15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.recordPreserveTry();
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile12, 0, (int) 'a');
        boolean boolean17 = jSDocInfoBuilder1.addReference("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression18 = null;
        boolean boolean19 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression18);
        boolean boolean21 = jSDocInfoBuilder1.recordVersion("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean6 = jSDocInfoBuilder1.recordLends("");
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean10 = jSDocInfoBuilder1.recordDeprecationReason("");
        boolean boolean11 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        boolean boolean12 = jSDocInfoBuilder1.recordJavaDispatch();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean14 = jSDocInfoBuilder1.recordExpose();
        java.util.Set<java.lang.String> strSet15 = null;
        boolean boolean16 = jSDocInfoBuilder1.recordModifies(strSet15);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression17 = null;
        boolean boolean18 = jSDocInfoBuilder1.recordType(jSTypeExpression17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression8);
        boolean boolean10 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean12 = jSDocInfoBuilder1.addReference("");
        boolean boolean14 = jSDocInfoBuilder1.recordBlockDescription("hi!");
        jSDocInfoBuilder1.markName("hi!", (int) (short) 1, (int) (short) 10);
        boolean boolean20 = jSDocInfoBuilder1.addReference("hi!");
        boolean boolean22 = jSDocInfoBuilder1.addReference("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.isInterfaceRecorded();
        boolean boolean6 = jSDocInfoBuilder1.recordReturnDescription("hi!");
        boolean boolean7 = jSDocInfoBuilder1.isPopulated();
        boolean boolean9 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean10 = jSDocInfoBuilder1.isConstructorRecorded();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}

