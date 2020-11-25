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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean10 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        jSDocInfoBuilder1.markText("", (int) (byte) 1, 1, (int) (byte) 100, 100);
        boolean boolean17 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean18 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean19 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordExtendedInterface(jSTypeExpression20);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet5);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression8 = null;
        boolean boolean9 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression8);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordReturnType(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.addReference("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility14 = null;
        boolean boolean15 = jSDocInfoBuilder1.recordVisibility(visibility14);
        boolean boolean17 = jSDocInfoBuilder1.recordLends("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder19 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean20 = jSDocInfoBuilder19.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression21 = null;
        boolean boolean22 = jSDocInfoBuilder19.recordTypedef(jSTypeExpression21);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile24 = null;
        jSDocInfoBuilder19.markName("", staticSourceFile24, (int) '4', (int) 'a');
        boolean boolean28 = jSDocInfoBuilder19.recordExport();
        boolean boolean29 = jSDocInfoBuilder19.recordConstancy();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean33 = jSDocInfoBuilder31.recordMeaning("");
        boolean boolean34 = jSDocInfoBuilder31.isConstructorRecorded();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder36 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean37 = jSDocInfoBuilder36.recordNoAlias();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder39 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        boolean boolean45 = jSDocInfoBuilder39.recordModifies((java.util.Set<java.lang.String>) strSet43);
        boolean boolean46 = jSDocInfoBuilder36.recordSuppressions((java.util.Set<java.lang.String>) strSet43);
        boolean boolean47 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet43);
        boolean boolean48 = jSDocInfoBuilder19.recordSuppressions((java.util.Set<java.lang.String>) strSet43);
        boolean boolean49 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet43);
        boolean boolean50 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        boolean boolean67 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean68 = jSDocInfoBuilder1.recordOverride();
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean3 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean4 = jSDocInfoBuilder1.recordExterns();
        boolean boolean5 = jSDocInfoBuilder1.isPopulated();
        boolean boolean6 = jSDocInfoBuilder1.recordExterns();
        boolean boolean8 = jSDocInfoBuilder1.recordBlockDescription("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.isPopulatedWithFileOverview();
        boolean boolean6 = jSDocInfoBuilder1.recordPreserveTry();
        boolean boolean8 = jSDocInfoBuilder1.recordMeaning("");
        boolean boolean9 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression10 = null;
        boolean boolean11 = jSDocInfoBuilder1.recordType(jSTypeExpression10);
        boolean boolean13 = jSDocInfoBuilder1.addAuthor("");
        boolean boolean15 = jSDocInfoBuilder1.recordBlockDescription("");
        boolean boolean16 = jSDocInfoBuilder1.recordNoSideEffects();
        boolean boolean17 = jSDocInfoBuilder1.recordJavaDispatch();
        boolean boolean18 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
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
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean9 = jSDocInfoBuilder1.recordIdGenerator();
        boolean boolean10 = jSDocInfoBuilder1.recordConsistentIdGenerator();
        jSDocInfoBuilder1.markText("", (int) (byte) 1, 1, (int) (byte) 100, 100);
        boolean boolean17 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean18 = jSDocInfoBuilder1.recordNoShadow();
        boolean boolean19 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression20 = null;
        boolean boolean21 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression20);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile6, (int) '4', (int) 'a');
        boolean boolean10 = jSDocInfoBuilder1.isJavaDispatch();
        boolean boolean11 = jSDocInfoBuilder1.isPopulated();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean5 = jSDocInfoBuilder1.recordDescription("");
        boolean boolean7 = jSDocInfoBuilder1.recordFileOverview("");
        boolean boolean8 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean10 = jSDocInfoBuilder1.recordDescription("");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder12 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean13 = jSDocInfoBuilder12.recordNoAlias();
        boolean boolean14 = jSDocInfoBuilder12.recordJavaDispatch();
        boolean boolean16 = jSDocInfoBuilder12.recordMeaning("");
        jSDocInfoBuilder12.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder24 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean25 = jSDocInfoBuilder24.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression26 = null;
        boolean boolean27 = jSDocInfoBuilder24.recordTypedef(jSTypeExpression26);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder29 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder29.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder37 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder37.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder37.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean48 = jSDocInfoBuilder37.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder50 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        boolean boolean56 = jSDocInfoBuilder50.recordModifies((java.util.Set<java.lang.String>) strSet54);
        boolean boolean57 = jSDocInfoBuilder37.recordSuppressions((java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = jSDocInfoBuilder29.recordSuppressions((java.util.Set<java.lang.String>) strSet54);
        boolean boolean59 = jSDocInfoBuilder24.recordModifies((java.util.Set<java.lang.String>) strSet54);
        boolean boolean60 = jSDocInfoBuilder12.recordSuppressions((java.util.Set<java.lang.String>) strSet54);
        boolean boolean61 = jSDocInfoBuilder1.recordModifies((java.util.Set<java.lang.String>) strSet54);
        boolean boolean62 = jSDocInfoBuilder1.recordNoTypeCheck();
        boolean boolean63 = jSDocInfoBuilder1.recordHiddenness();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
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
        boolean boolean8 = jSDocInfoBuilder1.recordNoTypeCheck();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression9);
        boolean boolean11 = jSDocInfoBuilder1.recordIdGenerator();
        jSDocInfoBuilder1.markName("hi!", (int) '#', (int) (short) 1);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = null;
        jSDocInfoBuilder1.markName("", staticSourceFile17, 0, (int) (short) 1);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder22 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression23 = null;
        boolean boolean24 = jSDocInfoBuilder22.recordEnumParameterType(jSTypeExpression23);
        boolean boolean25 = jSDocInfoBuilder22.recordIdGenerator();
        boolean boolean27 = jSDocInfoBuilder22.recordLends("");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression28 = null;
        boolean boolean29 = jSDocInfoBuilder22.recordBaseType(jSTypeExpression28);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder31 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet35);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression38 = null;
        boolean boolean39 = jSDocInfoBuilder31.recordTypedef(jSTypeExpression38);
        boolean boolean40 = jSDocInfoBuilder31.isInterfaceRecorded();
        boolean boolean41 = jSDocInfoBuilder31.recordPreserveTry();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        boolean boolean46 = jSDocInfoBuilder31.recordModifies((java.util.Set<java.lang.String>) strSet44);
        boolean boolean47 = jSDocInfoBuilder22.recordModifies((java.util.Set<java.lang.String>) strSet44);
        boolean boolean48 = jSDocInfoBuilder1.recordSuppressions((java.util.Set<java.lang.String>) strSet44);
        boolean boolean50 = jSDocInfoBuilder1.addAuthor("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder1.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean13 = jSDocInfoBuilder1.recordDescription("");
        jSDocInfoBuilder1.recordOriginalCommentString("");
        boolean boolean16 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean17 = jSDocInfoBuilder1.recordHiddenness();
        boolean boolean19 = jSDocInfoBuilder1.recordDescription("hi!");
        boolean boolean20 = jSDocInfoBuilder1.recordNoSideEffects();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        boolean boolean26 = jSDocInfoBuilder1.recordExpose();
        boolean boolean28 = jSDocInfoBuilder1.hasParameter("hi!");
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression29 = null;
        boolean boolean30 = jSDocInfoBuilder1.recordBaseType(jSTypeExpression29);
        boolean boolean31 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression11);
        boolean boolean14 = jSDocInfoBuilder1.recordReturnDescription("");
        boolean boolean15 = jSDocInfoBuilder1.recordImplicitCast();
        boolean boolean17 = jSDocInfoBuilder1.addAuthor("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean2 = jSDocInfoBuilder1.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression3 = null;
        boolean boolean4 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression3);
        boolean boolean5 = jSDocInfoBuilder1.recordInterface();
        boolean boolean6 = jSDocInfoBuilder1.recordIdGenerator();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression7 = null;
        boolean boolean8 = jSDocInfoBuilder1.recordDefineType(jSTypeExpression7);
        com.google.javascript.rhino.Node node9 = null;
        jSDocInfoBuilder1.markTypeNode(node9, (int) (byte) 10, (int) (short) 10, (int) (short) 0, (int) ' ', true);
        boolean boolean16 = jSDocInfoBuilder1.recordNoCompile();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression2 = null;
        boolean boolean3 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression2);
        boolean boolean4 = jSDocInfoBuilder1.recordNoShadow();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression5 = null;
        boolean boolean6 = jSDocInfoBuilder1.recordImplementedInterface(jSTypeExpression5);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder8 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder8.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder8.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean20 = jSDocInfoBuilder8.recordDescription("");
        jSDocInfoBuilder8.recordOriginalCommentString("");
        jSDocInfoBuilder8.recordOriginalCommentString("hi!");
        boolean boolean25 = jSDocInfoBuilder8.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder27 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder27.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder27.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean38 = jSDocInfoBuilder27.isPopulated();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression39 = null;
        boolean boolean40 = jSDocInfoBuilder27.recordEnumParameterType(jSTypeExpression39);
        boolean boolean41 = jSDocInfoBuilder27.recordInterface();
        boolean boolean42 = jSDocInfoBuilder27.recordJavaDispatch();
        boolean boolean43 = jSDocInfoBuilder27.isDescriptionRecorded();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression44 = null;
        boolean boolean45 = jSDocInfoBuilder27.recordThrowType(jSTypeExpression44);
        boolean boolean46 = jSDocInfoBuilder27.recordConsistentIdGenerator();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder48 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean49 = jSDocInfoBuilder48.recordNoAlias();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression50 = null;
        boolean boolean51 = jSDocInfoBuilder48.recordTypedef(jSTypeExpression50);
        boolean boolean52 = jSDocInfoBuilder48.isPopulatedWithFileOverview();
        boolean boolean53 = jSDocInfoBuilder48.recordPreserveTry();
        boolean boolean55 = jSDocInfoBuilder48.addReference("hi!");
        jSDocInfoBuilder48.recordOriginalCommentString("");
        boolean boolean58 = jSDocInfoBuilder48.recordJavaDispatch();
        boolean boolean59 = jSDocInfoBuilder48.recordJavaDispatch();
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        boolean boolean64 = jSDocInfoBuilder48.recordTemplateTypeNames((java.util.List<java.lang.String>) strList62);
        boolean boolean65 = jSDocInfoBuilder27.recordTemplateTypeNames((java.util.List<java.lang.String>) strList62);
        boolean boolean66 = jSDocInfoBuilder8.recordTemplateTypeNames((java.util.List<java.lang.String>) strList62);
        boolean boolean67 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList62);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder1 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder1.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        boolean boolean8 = jSDocInfoBuilder1.recordExterns();
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression9 = null;
        boolean boolean10 = jSDocInfoBuilder1.recordEnumParameterType(jSTypeExpression9);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression11 = null;
        boolean boolean12 = jSDocInfoBuilder1.recordTypedef(jSTypeExpression11);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder14 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression15 = null;
        boolean boolean16 = jSDocInfoBuilder14.recordEnumParameterType(jSTypeExpression15);
        boolean boolean17 = jSDocInfoBuilder14.recordIdGenerator();
        boolean boolean19 = jSDocInfoBuilder14.recordLends("");
        boolean boolean21 = jSDocInfoBuilder14.recordMeaning("");
        com.google.javascript.rhino.JSDocInfo.Visibility visibility22 = null;
        boolean boolean23 = jSDocInfoBuilder14.recordVisibility(visibility22);
        boolean boolean26 = jSDocInfoBuilder14.recordParameterDescription("", "");
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder28 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        boolean boolean29 = jSDocInfoBuilder28.recordNoAlias();
        boolean boolean30 = jSDocInfoBuilder28.recordJavaDispatch();
        boolean boolean32 = jSDocInfoBuilder28.recordMeaning("");
        jSDocInfoBuilder28.markText("hi!", (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder40 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        boolean boolean46 = jSDocInfoBuilder40.recordModifies((java.util.Set<java.lang.String>) strSet44);
        boolean boolean47 = jSDocInfoBuilder28.recordModifies((java.util.Set<java.lang.String>) strSet44);
        com.google.javascript.rhino.JSTypeExpression jSTypeExpression48 = null;
        boolean boolean49 = jSDocInfoBuilder28.recordExtendedInterface(jSTypeExpression48);
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder51 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        jSDocInfoBuilder51.markText("hi!", (-1), (int) (byte) 100, 0, (int) (short) -1);
        jSDocInfoBuilder51.markAnnotation("hi!", (int) ' ', (int) (short) 100);
        boolean boolean62 = jSDocInfoBuilder51.shouldParseDocumentation();
        com.google.javascript.rhino.JSDocInfoBuilder jSDocInfoBuilder64 = new com.google.javascript.rhino.JSDocInfoBuilder(true);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        boolean boolean70 = jSDocInfoBuilder64.recordModifies((java.util.Set<java.lang.String>) strSet68);
        boolean boolean71 = jSDocInfoBuilder51.recordSuppressions((java.util.Set<java.lang.String>) strSet68);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = jSDocInfoBuilder51.recordTemplateTypeNames((java.util.List<java.lang.String>) strList75);
        boolean boolean78 = jSDocInfoBuilder28.recordTemplateTypeNames((java.util.List<java.lang.String>) strList75);
        boolean boolean79 = jSDocInfoBuilder14.recordTemplateTypeNames((java.util.List<java.lang.String>) strList75);
        boolean boolean80 = jSDocInfoBuilder1.recordTemplateTypeNames((java.util.List<java.lang.String>) strList75);
        // The following exception was thrown during execution in test generation
        try {
            jSDocInfoBuilder1.markAnnotation("", (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }
}

